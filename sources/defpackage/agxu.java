package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agxu extends agwz implements Serializable {
    private final MessageDigest a;
    private final int b;
    private final boolean c;
    private final String d;

    public agxu(String str, int i) {
        this.d = "Hashing.sha256()";
        MessageDigest messageDigestG = g(str);
        this.a = messageDigestG;
        int digestLength = messageDigestG.getDigestLength();
        boolean z = false;
        if (i >= 4 && i <= digestLength) {
            z = true;
        }
        ahno.L(z, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.b = i;
        this.c = h(messageDigestG);
    }

    private static MessageDigest g(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private static boolean h(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.agxj
    public final agxk f() {
        if (this.c) {
            try {
                return new agxs((MessageDigest) this.a.clone(), this.b);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new agxs(g(this.a.getAlgorithm()), this.b);
    }

    public final String toString() {
        return this.d;
    }

    Object writeReplace() {
        return new agxt(this.a.getAlgorithm(), this.b);
    }

    public agxu() {
        MessageDigest messageDigestG = g("SHA-256");
        this.a = messageDigestG;
        this.b = messageDigestG.getDigestLength();
        this.d = "Hashing.sha256()";
        this.c = h(messageDigestG);
    }
}

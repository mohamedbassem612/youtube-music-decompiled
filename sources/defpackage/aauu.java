package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aauu {
    public static final byte[] a = {0};
    static final byte[] b = {1};
    public final ArrayDeque c = new ArrayDeque();
    public final MessageDigest d;
    public int e;
    public final boolean f;

    public aauu(boolean z) {
        try {
            this.d = MessageDigest.getInstance("SHA-256");
            this.f = z;
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void a() {
        while (true) {
            ArrayDeque arrayDeque = this.c;
            if (arrayDeque.size() < 2) {
                return;
            }
            auzc auzcVar = (auzc) arrayDeque.pop();
            auzc auzcVar2 = (auzc) arrayDeque.pop();
            if (auzcVar.a != auzcVar2.a) {
                arrayDeque.push(auzcVar2);
                arrayDeque.push(auzcVar);
                return;
            }
            MessageDigest messageDigest = this.d;
            messageDigest.reset();
            messageDigest.update(b);
            messageDigest.update((byte[]) auzcVar2.b);
            messageDigest.update((byte[]) auzcVar.b);
            byte[] bArrDigest = messageDigest.digest();
            int i = auzcVar2.a + 1;
            if (this.f) {
                bArrDigest = Arrays.copyOf(bArrDigest, 10);
            }
            arrayDeque.push(new auzc(i, bArrDigest));
        }
    }
}

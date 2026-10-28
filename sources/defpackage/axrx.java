package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axrx {
    public static final MessageDigest a = a();

    private static MessageDigest a() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}

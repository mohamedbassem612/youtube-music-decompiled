package defpackage;

import java.security.SecureRandom;
import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agfe {
    public static final SecureRandom a;
    public static final Random b;
    public static final ThreadLocal c;

    static {
        new agfc();
        a = a();
        b = new agfd();
        c = new agfb();
    }

    public static SecureRandom a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}

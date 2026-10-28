package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ahsj {
    private static final long a;
    private static final long b;
    private long c;
    private int d;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        a = 86400000L;
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        b = 1800000L;
    }

    public ahsj() {
        long j = ahsd.a;
        ahno.o();
        ahsd.c();
    }

    private final synchronized long c(int i) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return (i == 429 || (i >= 500 && i < 600)) ? (long) Math.min(Math.pow(2.0d, this.d) + ((long) (Math.random() * 1000.0d)), b) : a;
    }

    private final synchronized void d() {
        this.d = 0;
    }

    public final synchronized void a(int i) {
        try {
            if ((i >= 200 && i < 300) || i == 401 || i == 404) {
                d();
            } else {
                this.d++;
                this.c = System.currentTimeMillis() + c(i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean b() {
        return this.d == 0 || System.currentTimeMillis() > this.c;
    }
}

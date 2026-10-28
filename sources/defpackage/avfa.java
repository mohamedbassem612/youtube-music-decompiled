package defpackage;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avfa {
    private final Random a = new Random();
    private final long b;
    private final long c;
    private long d;

    public avfa() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.b = 1000000000L;
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        this.c = 120000000000L;
        this.d = 1000000000L;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final long a() {
        long j = this.d;
        double d = j;
        this.d = Math.min((long) (1.6d * d), this.c);
        double d2 = 0.2d * d;
        double d3 = d * (-0.2d);
        ahno.F(((d2 > d3 ? 1 : (d2 == d3 ? 0 : -1)) ^ (-1)) >>> 31);
        return j + ((long) ((this.a.nextDouble() * (d2 - d3)) + d3));
    }
}

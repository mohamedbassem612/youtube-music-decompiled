package defpackage;

import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class twr {
    private final twq b;
    private final mbc c;
    private long e;
    private final Random d = new Random();
    public long a = 0;

    public twr(twq twqVar, mbc mbcVar) {
        this.b = twqVar;
        this.c = mbcVar;
    }

    private final Long c() {
        long j = this.a;
        twq twqVar = this.b;
        if (j < twqVar.c) {
            if (j == 0) {
                this.e = this.c.b();
            }
            double dNextDouble = this.d.nextDouble() + 1.0d;
            long j2 = twqVar.a;
            long jMin = Math.min((long) (dNextDouble * j2 * Math.pow(twqVar.e, this.a)), twqVar.b);
            long j3 = twqVar.d;
            if (j3 >= 0) {
                jMin = Math.min(jMin, j3 - (this.c.b() - this.e));
            }
            if (jMin >= j2) {
                return Long.valueOf(jMin);
            }
        }
        return null;
    }

    public final long a() {
        Long lC = c();
        if (lC == null) {
            return -1L;
        }
        long jMax = Math.max(lC.longValue(), this.b.a);
        Long lValueOf = Long.valueOf(jMax);
        this.a++;
        lValueOf.getClass();
        lValueOf.getClass();
        return jMax;
    }

    @Deprecated
    public final boolean b() {
        Long lC = c();
        if (lC == null) {
            return false;
        }
        try {
            Thread.sleep(lC.longValue());
            this.a++;
            lC.longValue();
            return true;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            twu.c(6, "Thread interrupted", e);
            return false;
        }
    }
}

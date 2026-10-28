package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aatp implements ynv {
    public String a;
    public long b;
    public long c;
    private long e;
    private long g;
    private double h;
    private final mbc k;
    private final aafu l;
    private final boolean m;
    private final long n;
    private final long o;
    private final avgj p;
    private long f = -1;
    private long i = -1;
    private long j = -1;
    private int d = -1;

    public aatp(mbc mbcVar, aafu aafuVar, avgj avgjVar, boolean z, long j, long j2) {
        this.k = mbcVar;
        this.l = aafuVar;
        this.p = avgjVar;
        this.m = z;
        this.n = j;
        this.o = j2;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00f4  */
    @Override // defpackage.ynv
    public final void c(wgs wgsVar, long j) {
        double d;
        int i;
        boolean z;
        long j2;
        double dMin;
        double dMin2;
        String str = this.a;
        if (str != null) {
            long j3 = this.b + j;
            int iRound = (int) Math.round(j3 / (this.c / 100.0d));
            int i2 = this.d;
            if (i2 < 0 || iRound - i2 >= 1.0d || j3 - this.e >= 16777216 || j == wgsVar.j()) {
                mbc mbcVar = this.k;
                long epochMilli = mbcVar.f().toEpochMilli();
                long j4 = this.f;
                if (j4 < epochMilli) {
                    if (j4 != -1) {
                        long j5 = j - this.g;
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        dMin = Math.min((j5 * 1000.0d) / (epochMilli - this.f), 5000000.0d);
                        double d2 = this.h;
                        if (d2 > 0.0d) {
                            dMin2 = Math.min(dMin, d2 * 10.0d);
                            mbcVar = mbcVar;
                            str = str;
                            dMin = (0.25d * dMin2) + (this.h * 0.75d);
                        }
                        this.f = epochMilli;
                        this.g = j;
                        this.h = dMin2;
                        d = dMin;
                    } else {
                        dMin = 0.0d;
                    }
                    dMin2 = dMin;
                    this.f = epochMilli;
                    this.g = j;
                    this.h = dMin2;
                    d = dMin;
                } else {
                    mbcVar = mbcVar;
                    str = str;
                    d = 0.0d;
                }
                long jB = mbcVar.b();
                long j6 = wgsVar.j();
                long j7 = this.i;
                boolean z2 = true;
                double d3 = d;
                boolean z3 = j7 < 0 || this.j < 0;
                long j8 = this.n;
                if (j8 > 0) {
                    i = iRound;
                    if (j3 - j7 < (j8 * this.c) / 100) {
                        z = false;
                    }
                    j2 = this.o;
                    if (j2 > 0 && jB - this.j < j2) {
                        z2 = false;
                    }
                    if (z3 || j >= j6 || (z && z2)) {
                        this.l.e(str, wgsVar.e(), j, this.m);
                        ((aatn) this.p.a).b(this.b + j, d3, true);
                        this.i = j3;
                        this.j = jB;
                    }
                    this.d = i;
                    this.e = j3;
                }
                i = iRound;
                z = true;
                j2 = this.o;
                if (j2 > 0) {
                    z2 = false;
                }
                if (z3) {
                    this.l.e(str, wgsVar.e(), j, this.m);
                    ((aatn) this.p.a).b(this.b + j, d3, true);
                    this.i = j3;
                    this.j = jB;
                } else {
                    this.l.e(str, wgsVar.e(), j, this.m);
                    ((aatn) this.p.a).b(this.b + j, d3, true);
                    this.i = j3;
                    this.j = jB;
                }
                this.d = i;
                this.e = j3;
            }
        }
    }
}

package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ctu {
    public final Context a;
    public boolean b;
    public ctr c;
    public boolean d;
    public Surface e;
    public float f;
    public float g = 1.0f;
    public int h = 0;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    private float q;

    public ctu(Context context) {
        this.a = context;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    public final long a(long j, long j2, long j3, long j4) {
        long j5;
        long j6;
        long j7;
        float f;
        long j8;
        long j9 = this.m;
        if (j2 != j9) {
            this.n = this.k;
            this.o = this.l;
            this.p = j9;
            this.i = this.j;
        }
        long j10 = this.n;
        if (j10 == -1) {
            j5 = j;
        } else {
            if (j3 != -9223372036854775807L) {
                f = this.g;
                j8 = (j4 - j10) * j3;
            } else {
                long j11 = j2 - this.p;
                f = this.g;
                j8 = j11 * 1000;
            }
            j5 = this.o + ((long) (j8 / f));
            if (Math.abs(j - j5) > 20000000) {
                c();
                j5 = j;
            }
        }
        this.k = j4;
        this.l = j5;
        this.m = j2;
        ctr ctrVar = this.c;
        if (ctrVar == null) {
            return j5;
        }
        long j12 = ctrVar.c;
        long j13 = this.c.d;
        if (j12 == -9223372036854775807L || j13 == -9223372036854775807L) {
            return j5;
        }
        long j14 = j12 + (((j5 - j12) / j13) * j13);
        if (j5 <= j14) {
            j6 = j14 - j13;
        } else {
            j6 = j14;
            j14 += j13;
        }
        long j15 = j13 / 2;
        long j16 = j14 - j5;
        long j17 = j5 - j6;
        long jAbs = Math.abs(j16 - j17);
        if (jAbs < j15) {
            long j18 = j13 / 4;
            if (jAbs < j18) {
                j7 = this.i;
                if (j7 == 0) {
                    if (j16 < j17) {
                        j18 = -j18;
                    }
                }
                if (j16 + j7 >= j17) {
                    j14 = j6;
                }
                return j14 - ((j13 * 80) / 100);
            }
            j18 = 0;
            this.j = j18;
            j7 = j18;
            if (j16 + j7 >= j17) {
                j14 = j6;
            }
            return j14 - ((j13 * 80) / 100);
        }
        j7 = this.i;
        this.j = j7;
        if (j16 + j7 >= j17) {
            j14 = j6;
        }
        return j14 - ((j13 * 80) / 100);
    }

    public final void b() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.h == Integer.MIN_VALUE || this.q == 0.0f || !surface.isValid()) {
            return;
        }
        this.q = 0.0f;
        azy.k(this.e, 0.0f);
    }

    public final void c() {
        this.n = -1L;
        this.k = -1L;
        this.m = -9223372036854775807L;
        this.i = 0L;
        this.j = 0L;
    }

    public final void d(boolean z) {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.h == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        float f = 0.0f;
        if (this.d) {
            float f2 = this.f;
            if (f2 != -1.0f) {
                f = this.g * f2;
            }
        }
        if (z || this.q != f) {
            this.q = f;
            azy.k(this.e, f);
        }
    }
}

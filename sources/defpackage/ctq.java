package defpackage;

import android.util.Range;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ctq {
    private long a;
    private long b;
    private double c;
    private Range d;

    public ctq() {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        this.d = range;
        this.c = ((Double) range.getUpper()).doubleValue();
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public final long a(long j) {
        long j2 = this.a;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (long) (this.b + ((j - j2) * this.c));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    public final void b(long j, long j2) {
        double dDoubleValue;
        ahno.F(j != -9223372036854775807L);
        ahno.F(j2 != -9223372036854775807L);
        long j3 = this.a;
        if (j3 != -9223372036854775807L) {
            long j4 = this.b;
            if (j4 == -9223372036854775807L || j == j3) {
                dDoubleValue = ((Double) this.d.getUpper()).doubleValue();
            } else {
                dDoubleValue = (j2 - j4) / (j - j3);
            }
        } else {
            dDoubleValue = ((Double) this.d.getUpper()).doubleValue();
        }
        this.c = (this.c * 0.800000011920929d) + (((Double) this.d.clamp(Double.valueOf(dDoubleValue))).doubleValue() * 0.20000000298023224d);
        this.a = j;
        this.b = j2;
    }

    public final void c() {
        this.c = ((Double) this.d.getUpper()).doubleValue();
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public final void d(float f) {
        ahno.F(f > 0.0f);
        this.d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f)));
        c();
    }
}

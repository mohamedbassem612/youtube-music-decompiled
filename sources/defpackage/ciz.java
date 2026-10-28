package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ciz extends cje {
    final long a;
    final long b;
    final List c;
    final long d;
    final long e;
    final long f;

    public ciz(civ civVar, long j, long j2, long j3, long j4, List list, long j5, long j6, long j7) {
        super(civVar, j, j2);
        this.a = j3;
        this.b = j4;
        this.c = list;
        this.f = j5;
        this.d = j6;
        this.e = j7;
    }

    public final long a(long j, long j2) {
        long jC = c(j);
        return jC == -1 ? (int) (e((j2 - this.e) + this.f, j) - b(j, j2)) : jC;
    }

    public final long b(long j, long j2) {
        if (c(j) == -1) {
            long j3 = this.d;
            if (j3 != -9223372036854775807L) {
                return Math.max(this.a, e((j2 - this.e) - j3, j));
            }
        }
        return this.a;
    }

    public abstract long c(long j);

    public final long d(long j, long j2) {
        List list = this.c;
        if (list != null) {
            return (((cjc) list.get((int) (j - this.a))).b * 1000000) / this.k;
        }
        long jC = c(j2);
        return (jC == -1 || j != (this.a + jC) + (-1)) ? (this.b * 1000000) / this.k : j2 - f(j);
    }

    public final long e(long j, long j2) {
        long jC = c(j2);
        long j3 = this.a;
        if (jC == 0) {
            return j3;
        }
        if (this.c == null) {
            long j4 = (j / ((this.b * 1000000) / this.k)) + j3;
            if (j4 >= j3) {
                return jC != -1 ? Math.min(j4, (j3 + jC) - 1) : j4;
            }
            return j3;
        }
        long j5 = (jC + j3) - 1;
        long j6 = j3;
        while (j6 <= j5) {
            long j7 = ((j5 - j6) / 2) + j6;
            long jF = f(j7);
            if (jF < j) {
                j6 = 1 + j7;
            } else {
                if (jF <= j) {
                    return j7;
                }
                j5 = j7 - 1;
            }
        }
        return j6 == j3 ? j6 : j5;
    }

    public final long f(long j) {
        List list = this.c;
        long j2 = j - this.a;
        return bwp.C(list != null ? ((cjc) list.get((int) j2)).a - this.l : j2 * this.b, 1000000L, this.k);
    }

    public abstract civ g(ciy ciyVar, long j);

    public boolean h() {
        return this.c != null;
    }
}

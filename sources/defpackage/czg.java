package defpackage;

import android.util.Pair;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class czg implements czk {
    private final long[] a;
    private final long[] b;
    private final long c;

    public czg(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? bwp.y(jArr2[jArr2.length - 1]) : j;
    }

    private static Pair i(long j, long[] jArr, long[] jArr2) {
        int iAn = bwp.an(jArr, j, true);
        long j2 = jArr[iAn];
        long j3 = jArr2[iAn];
        int i = iAn + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.cvz
    public final long a() {
        return this.c;
    }

    @Override // defpackage.cvz
    public final cvx b(long j) {
        Pair pairI = i(bwp.F(bwp.t(j, 0L, this.c)), this.b, this.a);
        cwa cwaVar = new cwa(bwp.y(((Long) pairI.first).longValue()), ((Long) pairI.second).longValue());
        return new cvx(cwaVar, cwaVar);
    }

    @Override // defpackage.cvz
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // defpackage.cvz
    public final boolean d() {
        return true;
    }

    @Override // defpackage.czk
    public final int e() {
        return -2147483647;
    }

    @Override // defpackage.czk
    public final long f() {
        return -1L;
    }

    @Override // defpackage.czk
    public final long g() {
        return 0L;
    }

    @Override // defpackage.czk
    public final long h(long j) {
        return bwp.y(((Long) i(j, this.a, this.b).second).longValue());
    }
}

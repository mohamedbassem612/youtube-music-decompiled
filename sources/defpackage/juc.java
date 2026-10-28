package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class juc extends jub {
    private final boolean b;

    public juc(int i, List list, cwj cwjVar, boolean z) {
        super(i, list, cwjVar);
        this.b = z;
    }

    @Override // defpackage.jub
    protected final jue i(jue jueVar) {
        long[] jArr;
        long[] jArr2;
        if (jueVar == null || jueVar.b != 1 || (jArr = jueVar.h) == null || jArr.length != 1 || jArr[0] <= 0 || (jArr2 = jueVar.i) == null || jArr2.length != 1) {
            return jueVar;
        }
        long j = jArr2[0];
        if (j < 0) {
            return jueVar;
        }
        bse bseVar = jueVar.f;
        long j2 = bseVar.K;
        long j3 = jueVar.c;
        long jC = bwp.C(j, j2, j3);
        long jC2 = bwp.C(jArr2[0] + jArr[0], j2, j3) % 1024;
        bsd bsdVar = new bsd(bseVar);
        bsdVar.K = (int) jC;
        bsdVar.L = (int) (1024 - jC2);
        jue jueVar2 = new jue(jueVar.a, 1, j3, jueVar.d, jueVar.e, new bse(bsdVar), jueVar.g, jueVar.k, jueVar.j, jArr, jArr2);
        return this.b ? new jue(jueVar2.a, jueVar2.b, jueVar2.c, jueVar2.d, jueVar2.e, jueVar2.f, jueVar2.g, jueVar2.k, jueVar2.j, null, null) : jueVar2;
    }
}

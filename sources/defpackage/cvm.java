package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cvm implements cvz {
    private final cvn a;
    private final long b;

    public cvm(cvn cvnVar, long j) {
        this.a = cvnVar;
        this.b = j;
    }

    private final cwa e(long j, long j2) {
        return new cwa((j * 1000000) / ((long) this.a.e), this.b + j2);
    }

    @Override // defpackage.cvz
    public final long a() {
        return this.a.a();
    }

    @Override // defpackage.cvz
    public final cvx b(long j) {
        cvn cvnVar = this.a;
        eol eolVar = cvnVar.k;
        eolVar.getClass();
        Object obj = eolVar.b;
        Object obj2 = eolVar.a;
        long[] jArr = (long[]) obj;
        int iAn = bwp.an(jArr, cvnVar.b(j), false);
        cwa cwaVarE = e(iAn == -1 ? 0L : jArr[iAn], iAn != -1 ? ((long[]) obj2)[iAn] : 0L);
        if (cwaVarE.b == j || iAn == jArr.length - 1) {
            return new cvx(cwaVarE, cwaVarE);
        }
        int i = iAn + 1;
        return new cvx(cwaVarE, e(jArr[i], ((long[]) obj2)[i]));
    }

    @Override // defpackage.cvz
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // defpackage.cvz
    public final boolean d() {
        return true;
    }
}

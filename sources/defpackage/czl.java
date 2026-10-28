package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class czl implements czk {
    private final long[] a;
    private final long[] b;
    private final long c;
    private final long d;
    private final long e;
    private final int f;

    public czl(long[] jArr, long[] jArr2, long j, long j2, long j3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = nj.l(j3 - j2, j);
    }

    @Override // defpackage.cvz
    public final long a() {
        return this.c;
    }

    @Override // defpackage.cvz
    public final cvx b(long j) {
        long[] jArr = this.a;
        int iAn = bwp.an(jArr, j, true);
        long j2 = jArr[iAn];
        long[] jArr2 = this.b;
        cwa cwaVar = new cwa(j2, jArr2[iAn]);
        if (cwaVar.b >= j || iAn == jArr.length - 1) {
            return new cvx(cwaVar, cwaVar);
        }
        int i = iAn + 1;
        return new cvx(cwaVar, new cwa(jArr[i], jArr2[i]));
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
        return this.f;
    }

    @Override // defpackage.czk
    public final long f() {
        return this.e;
    }

    @Override // defpackage.czk
    public final long g() {
        return this.d;
    }

    @Override // defpackage.czk
    public final long h(long j) {
        return this.a[bwp.an(this.b, j, true)];
    }
}

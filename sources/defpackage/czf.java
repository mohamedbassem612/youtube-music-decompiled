package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class czf implements czk {
    public final cvt a;
    private final long b;
    private final long c;
    private final int d;

    public czf(long j, long j2, long j3) {
        this.a = new cvt(new long[]{j2}, new long[]{0}, j);
        this.b = j2;
        this.c = j3;
        this.d = nj.l(j3 - j2, j);
    }

    @Override // defpackage.cvz
    public final long a() {
        return this.a.a;
    }

    @Override // defpackage.cvz
    public final cvx b(long j) {
        return this.a.b(j);
    }

    @Override // defpackage.cvz
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // defpackage.cvz
    public final boolean d() {
        return this.a.d();
    }

    @Override // defpackage.czk
    public final int e() {
        return this.d;
    }

    @Override // defpackage.czk
    public final long f() {
        return this.c;
    }

    @Override // defpackage.czk
    public final long g() {
        return this.b;
    }

    @Override // defpackage.czk
    public final long h(long j) {
        return this.a.e(j);
    }

    public final boolean i(long j) {
        return this.a.g(j);
    }
}

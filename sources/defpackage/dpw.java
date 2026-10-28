package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dpw extends dqa {
    private final dps a;

    public dpw(dpd dpdVar, String str) {
        super(dpdVar, str);
        this.a = dpdVar.i(str);
    }

    @Override // defpackage.dpb
    public final int a() {
        o();
        return 0;
    }

    @Override // defpackage.dpb
    public final long b(int i) {
        o();
        wf.g(21, "no row");
        throw new awmh();
    }

    @Override // defpackage.dpb
    public final String c(int i) {
        o();
        wf.g(21, "no row");
        throw new awmh();
    }

    @Override // defpackage.dpb, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        p();
    }

    @Override // defpackage.dpb
    public final String d(int i) {
        o();
        wf.g(21, "no row");
        throw new awmh();
    }

    @Override // defpackage.dpb
    public final void e(int i, byte[] bArr) {
        bArr.getClass();
        o();
        this.a.a(i, bArr);
    }

    @Override // defpackage.dpb
    public final void f(int i, double d) {
        o();
        this.a.b(i, d);
    }

    @Override // defpackage.dpb
    public final void g(int i, long j) {
        o();
        this.a.c(i, j);
    }

    @Override // defpackage.dpb
    public final void h(int i) {
        o();
        this.a.d(i);
    }

    @Override // defpackage.dpb
    public final void i(int i, String str) {
        str.getClass();
        o();
        this.a.e(i, str);
    }

    @Override // defpackage.dpb
    public final void j() {
        o();
    }

    @Override // defpackage.dpb
    public final boolean k(int i) {
        o();
        wf.g(21, "no row");
        throw new awmh();
    }

    @Override // defpackage.dpb
    public final boolean l() {
        o();
        this.a.a.execute();
        return false;
    }

    @Override // defpackage.dpb
    public final byte[] m(int i) {
        o();
        wf.g(21, "no row");
        throw new awmh();
    }
}

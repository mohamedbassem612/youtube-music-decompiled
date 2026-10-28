package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dpv extends dqa implements dpb {
    private final dqa a;

    public dpv(dpd dpdVar, String str, dqa dqaVar) {
        super(dpdVar, str);
        this.a = dqaVar;
    }

    @Override // defpackage.dpb
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.dpb
    public final long b(int i) {
        return this.a.b(i);
    }

    @Override // defpackage.dpb
    public final String c(int i) {
        return this.a.c(i);
    }

    @Override // defpackage.dpb, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.dpb
    public final String d(int i) {
        return this.a.d(i);
    }

    @Override // defpackage.dpb
    public final void e(int i, byte[] bArr) {
        bArr.getClass();
        this.a.e(i, bArr);
    }

    @Override // defpackage.dpb
    public final void f(int i, double d) {
        this.a.f(i, d);
    }

    @Override // defpackage.dpb
    public final void g(int i, long j) {
        this.a.g(i, j);
    }

    @Override // defpackage.dpb
    public final void h(int i) {
        this.a.h(i);
    }

    @Override // defpackage.dpb
    public final void i(int i, String str) {
        str.getClass();
        this.a.i(i, str);
    }

    @Override // defpackage.dpb
    public final void j() {
        this.a.j();
    }

    @Override // defpackage.dpb
    public final boolean k(int i) {
        return this.a.k(i);
    }

    @Override // defpackage.dpb
    public final boolean l() {
        boolean zL = this.a.l();
        boolean z = awrc.z(d(0), "wal");
        dpd dpdVar = this.f;
        if (z) {
            ((dpl) dpdVar).e.enableWriteAheadLogging();
        } else {
            ((dpl) dpdVar).e.disableWriteAheadLogging();
        }
        return zL;
    }

    @Override // defpackage.dpb
    public final byte[] m(int i) {
        return this.a.m(i);
    }

    @Override // defpackage.dqa, defpackage.dpb
    public final boolean n() {
        return this.a.n();
    }
}

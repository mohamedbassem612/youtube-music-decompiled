package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class cvo implements cvj {
    private final cvj a;

    public cvo(cvj cvjVar) {
        this.a = cvjVar;
    }

    @Override // defpackage.cvj, defpackage.brv
    public final int a(byte[] bArr, int i, int i2) {
        return this.a.a(bArr, i, i2);
    }

    @Override // defpackage.cvj
    public final int c(int i) {
        throw null;
    }

    @Override // defpackage.cvj
    public long d() {
        return ((cvb) this.a).a;
    }

    @Override // defpackage.cvj
    public long e() {
        return this.a.e();
    }

    @Override // defpackage.cvj
    public long f() {
        return ((cvb) this.a).b;
    }

    @Override // defpackage.cvj
    public final void g(int i) {
        ((cvb) this.a).m(i, false);
    }

    @Override // defpackage.cvj
    public final void i(byte[] bArr, int i, int i2) {
        ((cvb) this.a).n(bArr, i, i2, false);
    }

    @Override // defpackage.cvj
    public final void j(byte[] bArr, int i, int i2) {
        ((cvb) this.a).o(bArr, i, i2, false);
    }

    @Override // defpackage.cvj
    public final void k() {
        this.a.k();
    }

    @Override // defpackage.cvj
    public final void l(int i) {
        ((cvb) this.a).p(i, false);
    }

    @Override // defpackage.cvj
    public final boolean m(int i, boolean z) {
        throw null;
    }

    @Override // defpackage.cvj
    public final boolean n(byte[] bArr, int i, int i2, boolean z) {
        return this.a.n(bArr, 0, i2, true);
    }

    @Override // defpackage.cvj
    public final boolean o(byte[] bArr, int i, int i2, boolean z) {
        return this.a.o(bArr, 0, 8, true);
    }

    @Override // defpackage.cvj
    public final void p(int i, boolean z) {
        throw null;
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class adks implements adkz {
    private final adkr a = new adkr();
    private final vwt b = new vwt((char[]) null, (byte[]) null);

    protected adks() {
    }

    public final void A(int i, int i2) {
        taq.d();
        this.b.L(i, i2);
    }

    public final void B(int i) {
        taq.d();
        A(i, 1);
    }

    public final void C(int i, int i2) {
        taq.d();
        this.b.P(i, i2);
    }

    @Override // defpackage.adkz
    public final void e(adlz adlzVar) {
        this.a.b(adlzVar);
    }

    @Override // defpackage.adkz
    public void f(adly adlyVar, int i) {
        this.a.a(adlyVar, this, i);
    }

    @Override // defpackage.adkz
    public final void h(adky adkyVar) {
        this.b.M(adkyVar);
    }

    @Override // defpackage.adkz
    public final void hI(adky adkyVar) {
        this.b.N(adkyVar);
    }

    public final void w() {
        taq.d();
        this.b.O();
    }

    public final void x(int i) {
        taq.d();
        this.b.K(i, 1);
    }

    public final void y(int i, int i2) {
        taq.d();
        this.b.J(i, i2);
    }

    public final void z(int i, int i2) {
        taq.d();
        this.b.K(i, i2);
    }
}

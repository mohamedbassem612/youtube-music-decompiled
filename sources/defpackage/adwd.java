package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class adwd implements adky {
    private final adkz a;
    private int b;

    public adwd(adkz adkzVar) {
        this.a = adkzVar;
    }

    private final void f(int i) {
        if (i < this.b) {
            this.b = i;
        }
    }

    public final void b() {
        this.b = this.a.a();
    }

    @Override // defpackage.tbj
    public final void d(int i, int i2) {
        f(i);
    }

    @Override // defpackage.adky
    public final void jS() {
        b();
    }

    @Override // defpackage.tbj
    public final void jT(int i, int i2) {
        f(i);
    }

    @Override // defpackage.tbj
    public final void jU(int i, int i2) {
        f(i);
    }

    @Override // defpackage.tbj
    public final void k(int i, int i2) {
        f(Math.min(i, i2));
    }
}

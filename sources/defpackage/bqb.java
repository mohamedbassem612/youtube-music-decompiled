package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bqb extends bpi {
    public static final bpl a = new afqj(1);
    public final ahb b = new ahb(10);
    public boolean c = false;

    public final bpz a(int i) {
        return (bpz) ahc.a(this.b, i);
    }

    final void b() {
        this.c = false;
    }

    @Override // defpackage.bpi
    protected final void d() {
        ahb ahbVar = this.b;
        int iC = ahbVar.c();
        for (int i = 0; i < iC; i++) {
            ((bpz) ahbVar.d(i)).k();
        }
        ahbVar.e();
    }
}

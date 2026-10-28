package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dsh extends dsb {
    final dsi a;

    public dsh(dsi dsiVar) {
        this.a = dsiVar;
    }

    @Override // defpackage.dsb, defpackage.drx
    public final void b(dsa dsaVar) {
        dsi dsiVar = this.a;
        int i = dsiVar.x - 1;
        dsiVar.x = i;
        if (i == 0) {
            dsiVar.y = false;
            dsiVar.r();
        }
        dsaVar.F(this);
    }

    @Override // defpackage.dsb, defpackage.drx
    public final void f() {
        dsi dsiVar = this.a;
        if (dsiVar.y) {
            return;
        }
        dsiVar.z();
        dsiVar.y = true;
    }
}

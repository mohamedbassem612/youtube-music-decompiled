package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mlk implements nyb {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ fgv a;

    public /* synthetic */ mlk(fgv fgvVar, int i) {
        this.$cid = i;
        this.a = fgvVar;
    }

    @Override // defpackage.nyb
    public final void a(int i, nal nalVar) {
        int i2 = this.$cid;
        if (i2 == 0) {
            this.a.J(i, nalVar.co());
            return;
        }
        if (i2 == 1) {
            this.a.K(i, nalVar.co());
            return;
        }
        int i3 = nalVar.i() - 1;
        fgv fgvVar = this.a;
        if (i3 != 2) {
            fgvVar.T(i, fgvVar.c.z(nalVar.co()));
            return;
        }
        float fCo = nalVar.co() * 100.0f;
        fgs fgsVar = (fgs) fgvVar.b.k().E();
        fgsVar.a |= 4194304;
        if (fgsVar.y == null) {
            fgsVar.y = new fik();
        }
        fgsVar.y.e(i, fCo);
    }
}

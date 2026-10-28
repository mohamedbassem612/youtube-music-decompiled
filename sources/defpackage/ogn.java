package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ogn extends ofv {
    private boolean d;
    private boolean e;
    private boolean f;

    @Override // defpackage.ofv
    public final void b(ofo ofoVar, ogh oghVar) {
        boolean zA = ofoVar.a();
        if (this.d || !zA) {
            return;
        }
        oghVar.x(4);
        this.c.f(d(ogj.MEASURABLE_IMPRESSION, oghVar));
        this.d = true;
    }

    @Override // defpackage.ofv
    public final void c(ogh oghVar) {
        if (!this.e && oghVar.e.b()) {
            oghVar.x(5);
            ogi ogiVar = this.c;
            ogj ogjVar = ogj.VIEWABLE_IMPRESSION;
            ogiVar.g(d(ogjVar, oghVar));
            this.b.add(ogjVar);
            this.e = true;
        }
        if (this.f) {
            return;
        }
        oft oftVar = oghVar.e;
        ogl oglVar = (ogl) oftVar;
        if (oglVar.h(oglVar.v.h(1, ofs.FULL.f))) {
            oghVar.x(6);
            ogi ogiVar2 = this.c;
            ogj ogjVar2 = ogj.GROUPM_VIEWABLE_IMPRESSION;
            ogiVar2.e(d(ogjVar2, oghVar));
            this.b.add(ogjVar2);
            this.f = true;
        }
    }
}

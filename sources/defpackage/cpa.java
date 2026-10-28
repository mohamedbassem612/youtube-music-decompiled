package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class cpa extends cms {
    protected final cno b;

    protected cpa(cno cnoVar) {
        this.b = cnoVar;
    }

    @Override // defpackage.cmi, defpackage.cno
    public final void D() {
        this.b.D();
    }

    @Override // defpackage.cmi, defpackage.cno
    public final void E() {
        this.b.E();
    }

    protected final void H() {
        h(null, this.b);
    }

    protected void b(btn btnVar) {
        z(btnVar);
    }

    @Override // defpackage.cno
    public cnk c(cnm cnmVar, cra craVar, long j) {
        return this.b.c(cnmVar, craVar, j);
    }

    @Override // defpackage.cms
    protected final /* synthetic */ int d(Object obj, int i) {
        return i;
    }

    @Override // defpackage.cms
    protected final /* synthetic */ cnm f(Object obj, cnm cnmVar) {
        return o(cnmVar);
    }

    @Override // defpackage.cms
    protected final /* synthetic */ void g(Object obj, cno cnoVar, btn btnVar) {
        b(btnVar);
    }

    @Override // defpackage.cno
    public final bss jF() {
        return this.b.jF();
    }

    @Override // defpackage.cms, defpackage.cmi
    protected final void jH(bzg bzgVar) {
        super.jH(bzgVar);
        q();
    }

    @Override // defpackage.cmi, defpackage.cno
    public void jJ(bss bssVar) {
        this.b.jJ(bssVar);
    }

    @Override // defpackage.cno
    public void k(cnk cnkVar) {
        this.b.k(cnkVar);
    }

    @Override // defpackage.cms
    protected final /* synthetic */ void m(Object obj) {
    }

    protected void q() {
        H();
    }

    protected cnm o(cnm cnmVar) {
        return cnmVar;
    }
}

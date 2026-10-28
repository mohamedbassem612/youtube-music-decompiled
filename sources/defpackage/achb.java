package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class achb implements achv, wny, abmv {
    private achu a = null;
    private acip b = null;
    private final avmm c = new avmm();
    private final awmd d;

    public achb(awmd awmdVar) {
        this.d = awmdVar;
    }

    @Override // defpackage.wny
    public final synchronized void a(wnz wnzVar) {
        aigj aigjVarL;
        acip acipVar = this.b;
        if (acipVar != null) {
            wjf wjfVarF = acipVar.f();
            achu achuVar = this.a;
            if (achuVar != null) {
                aigjVarL = achuVar.f;
            } else {
                aigjVarL = wjfVarF != null ? wjfVarF.l() : null;
            }
            if (aigjVarL != null && !aigjVarL.E()) {
                aihf aihfVarCreateBuilder = aldg.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aldg aldgVar = (aldg) aihfVarCreateBuilder.instance;
                aldgVar.b |= 2;
                aldgVar.c = aigjVarL;
                wnzVar.G = (aldg) aihfVarCreateBuilder.build();
            }
        }
    }

    @Override // defpackage.achv
    public final int b(achu achuVar) {
        return 5;
    }

    @Override // defpackage.achv
    public final int c(achu achuVar) {
        this.a = achuVar;
        return 5;
    }

    @Override // defpackage.achv
    public final aboe d(alvl alvlVar) {
        return null;
    }

    @Override // defpackage.achv
    public final aboe e(wno wnoVar) {
        return null;
    }

    @Override // defpackage.achv
    public final achs f() {
        return null;
    }

    public final synchronized void h(aazq aazqVar) {
        this.b = aazqVar.b;
        this.a = null;
    }

    @Override // defpackage.achv
    public final boolean m(achq achqVar, achu achuVar) {
        return true;
    }

    @Override // defpackage.abmv
    public final void o() {
        this.c.c(((avlh) this.d.io()).p().al(new acae(this, 9), new achk(1)));
    }

    @Override // defpackage.achv
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.achv
    public final void l() {
    }

    @Override // defpackage.achv
    public final void i(aazj aazjVar) {
    }

    @Override // defpackage.achv
    public final void j(aazk aazkVar) {
    }

    @Override // defpackage.achv
    public final void k(aazn aaznVar) {
    }
}

package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ixo extends adsv {
    private final admu a;
    private final anoh b;
    private final tbt c;
    private final tbk d;

    public ixo(tbt tbtVar, anoh anohVar) {
        this.c = tbtVar;
        tbtVar.f(this);
        this.b = anohVar;
        this.a = new admu();
        this.d = new tbm();
        b(anohVar);
    }

    private final void b(anoh anohVar) {
        admu admuVar = this.a;
        ahno.O(admuVar.isEmpty());
        admuVar.add(new ixn(3, 1, false));
        apji apjiVar = anohVar.b;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anoj.a);
        apjiVar.c(aihlVarCheckIsLite);
        if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
            apji apjiVar2 = anohVar.b;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anoj.a);
            apjiVar2.c(aihlVarCheckIsLite2);
            Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
            admuVar.add(objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        }
        admuVar.add(anohVar);
        admuVar.add(new ixn(3, 2, true));
        admuVar.e(new jeo(this.d, 0));
    }

    @Override // defpackage.advc
    public final adkz a() {
        return this.a;
    }

    @tcc
    public void handleHideEnclosingEvent(vvt vvtVar) {
        Object obj = vvtVar.a;
        if (obj instanceof anzi) {
            tbk tbkVar = this.d;
            if (tbkVar.contains(obj)) {
                return;
            }
            anzi anziVar = (anzi) obj;
            anoh anohVar = this.b;
            if (kro.J(anohVar.d, anziVar)) {
                tbkVar.add(tbkVar.size(), anziVar);
            }
            if (tbkVar.size() == anohVar.d.size()) {
                this.a.clear();
            }
        }
    }

    @tcc
    public void handleShowEnclosingEvent(gsj gsjVar) {
        tbk tbkVar = this.d;
        if (tbkVar.isEmpty() || !tbkVar.get(tbkVar.size() - 1).equals(((Optional) gsjVar.e).orElse(null))) {
            return;
        }
        tbkVar.remove(tbkVar.size() - 1);
        if (this.a.isEmpty()) {
            b(this.b);
        }
    }

    @Override // defpackage.adsv, defpackage.twn
    public final void i() {
        this.c.l(this);
        this.d.clear();
    }
}

package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gul extends gut {
    private final izr a;
    private final adyr b;
    private final izt c;
    private final xgm d;
    private final jnj e;

    public gul(izr izrVar, adyr adyrVar, izt iztVar, xgm xgmVar, jnj jnjVar) {
        this.a = izrVar;
        this.b = adyrVar;
        this.c = iztVar;
        this.d = xgmVar;
        this.e = jnjVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anfo.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        angb angbVar = ((anfo) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c;
        if (angbVar == null) {
            angbVar = angb.a;
        }
        anfy anfyVar = angbVar.b == 66439850 ? (anfy) angbVar.c : anfy.a;
        if (!this.e.j(anfyVar)) {
            this.a.j(anfyVar, new Object(), this.c, this.d.hB());
            return;
        }
        adyr adyrVar = this.b;
        adyp adypVar = new adyp();
        adypVar.e = ajwoVar;
        adypVar.b(agpn.b);
        adypVar.c(anfyVar);
        adypVar.d(false);
        adyrVar.a(adypVar.a());
    }
}

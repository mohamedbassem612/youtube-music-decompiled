package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gyt extends gut {
    private final aunn a;
    private final vxz b;
    private final qcb c;

    public gyt(qcb qcbVar, aunn aunnVar, vxz vxzVar) {
        this.c = qcbVar;
        this.a = aunnVar;
        this.b = vxzVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arfa.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        if (this.b.l(137, 45858970L, false)) {
            ((abea) this.a.io()).a().o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(141877)), null);
        }
        cf cfVar = (cf) this.c.a;
        cc ccVarG = cfVar.getSupportFragmentManager().g("VIDEO_QUALITIES_MENU_BOTTOM_SHEET_FRAGMENT");
        hyg hygVar = ccVarG != null ? (hyg) ccVarG : new hyg();
        if (hygVar.isAdded() || hygVar.isVisible()) {
            return;
        }
        hygVar.h(cfVar.getSupportFragmentManager(), "VIDEO_QUALITIES_MENU_BOTTOM_SHEET_FRAGMENT");
    }
}

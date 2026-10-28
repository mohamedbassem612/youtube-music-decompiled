package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gtn extends gut {
    private final tbt a;
    private final aunn b;

    public gtn(tbt tbtVar, aunn aunnVar) {
        this.a = tbtVar;
        this.b = aunnVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akme.a);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        ((abea) this.b.io()).a().o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(189495)), null);
        this.a.c(new gse());
    }
}

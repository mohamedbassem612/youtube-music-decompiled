package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gvf extends gut {
    private final tbt a;

    public gvf(tbt tbtVar) {
        this.a = tbtVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anvj.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anvj.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        anvj anvjVar = (anvj) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        boolean z = anvjVar.c;
        tbt tbtVar = this.a;
        if (z) {
            tbtVar.c(new haz(true, null));
        } else {
            tbtVar.c(new haz(false, anvjVar.d));
        }
    }
}

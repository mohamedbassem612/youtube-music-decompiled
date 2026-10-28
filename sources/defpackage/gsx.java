package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gsx extends gut {
    private final wom a;
    private final xsc b;

    public gsx(xsc xscVar, wom womVar) {
        this.b = xscVar;
        this.a = womVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajjg.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajjg.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        ajjg ajjgVar = (ajjg) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        if (((ajjgVar.c == 3 ? (ajjh) ajjgVar.d : ajjh.a).b & 1) != 0) {
            apho aphoVar = (ajjgVar.c == 3 ? (ajjh) ajjgVar.d : ajjh.a).c;
            if (aphoVar == null) {
                aphoVar = apho.a;
            }
            acjx acjxVarAe = aawb.ae(aphoVar);
            if (acjxVarAe != null) {
                this.b.aE(null, this.a.a(acjxVarAe), wne.a);
            }
        }
    }
}

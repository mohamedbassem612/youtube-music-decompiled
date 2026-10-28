package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class guc extends gut {
    private final aunn a;

    public guc(aunn aunnVar) {
        this.a = aunnVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        woh wohVar = (woh) this.a.io();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(amfi.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        wohVar.h(((amfi) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c);
    }
}

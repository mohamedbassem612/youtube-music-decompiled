package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gvd extends gut {
    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anqv.a);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        anqu anquVar = (anqu) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        Object objS = tym.S(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        izt iztVar = (izt) tym.S(map, "toggleMenuItemMutations");
        if (!(objS instanceof anfy) || iztVar == null || (anquVar.b & 4) == 0) {
            return;
        }
        for (anfv anfvVar : ((anfy) objS).c) {
            if (anfvVar.b == 78861357) {
                angh anghVar = (angh) anfvVar.c;
                ajwo ajwoVar2 = anghVar.g;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akyq.a);
                ajwoVar2.c(aihlVarCheckIsLite2);
                if (ajwoVar2.j.n(aihlVarCheckIsLite2.d)) {
                    ajwo ajwoVar3 = anghVar.g;
                    if (ajwoVar3 == null) {
                        ajwoVar3 = ajwo.a;
                    }
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(akyq.a);
                    ajwoVar3.c(aihlVarCheckIsLite3);
                    Object objK2 = ajwoVar3.j.k(aihlVarCheckIsLite3.d);
                    if (((akyo) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).b.equals(anquVar.d)) {
                        int iAV = a.aV(anquVar.c);
                        iztVar.a(anghVar, iAV != 0 && iAV == 3);
                    }
                }
            }
        }
    }
}

package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class guo extends gut {
    private final vxe a;

    public guo(vxe vxeVar) {
        this.a = vxeVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        boolean z = false;
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(anjn.a);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                z = true;
            }
        }
        ahno.F(z);
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anjn.a);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        anjm anjmVar = (anjm) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        if ((anjmVar.b & 1) != 0) {
            vxe vxeVar = this.a;
            ajwo ajwoVar2 = anjmVar.c;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            vxeVar.c(ajwoVar2, map);
        }
        if ((anjmVar.b & 2) != 0) {
            vxe vxeVar2 = this.a;
            ajwo ajwoVar3 = anjmVar.d;
            if (ajwoVar3 == null) {
                ajwoVar3 = ajwo.a;
            }
            vxeVar2.c(ajwoVar3, map);
        }
    }
}

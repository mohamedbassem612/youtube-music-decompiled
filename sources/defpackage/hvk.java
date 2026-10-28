package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hvk extends gut {
    private final hvo a;
    private final vxe b;

    public hvk(hvo hvoVar, vxe vxeVar) {
        this.a = hvoVar;
        this.b = vxeVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anog.a);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        if (this.a.g()) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anog.a);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            anof anofVar = (anof) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            if ((anofVar.b & 1) != 0) {
                vxe vxeVar = this.b;
                ajwo ajwoVar2 = anofVar.c;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                vxeVar.a(ajwoVar2);
            }
        }
    }
}

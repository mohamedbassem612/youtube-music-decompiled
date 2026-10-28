package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gyo implements vxc {
    private final hxa a;

    public gyo(hxa hxaVar) {
        this.a = hxaVar;
    }

    @Override // defpackage.vxc
    public final void a(ajwo ajwoVar) {
        throw null;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void c(ajwo ajwoVar, Map map) {
        ajwoVar.getClass();
        aihl aihlVar = aqzx.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
            objC.getClass();
            aqzx aqzxVar = (aqzx) objC;
            if ((aqzxVar.c & 2) != 0) {
                ajwo ajwoVar2 = aqzxVar.d;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                ajwoVar2.getClass();
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(arik.a);
                ajwoVar2.c(aihlVarCheckIsLite3);
                if (ajwoVar2.j.n(aihlVarCheckIsLite3.d)) {
                    abnk abnkVar = new abnk();
                    abnkVar.a = ajwoVar2;
                    abnl abnlVarA = abnkVar.a();
                    hxa hxaVar = this.a;
                    taf.i(hxaVar.e.q(abnlVarA, null), hxaVar.a, new hou(9), new hvn(hxaVar, 5), null);
                }
            }
        }
    }
}

package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wxv implements vxc {
    private final awmd a;

    public wxv(awmd awmdVar) {
        this.a = awmdVar;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, @Deprecated Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aphr.a);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aphr.a);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            aphq aphqVar = ((aphp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).b;
            if (aphqVar == null) {
                aphqVar = aphq.a;
            }
            apho aphoVar = aphqVar.b;
            if (aphoVar == null) {
                aphoVar = apho.a;
            }
            acjx acjxVarAe = aawb.ae(aphoVar);
            if (acjxVarAe == null) {
                throw new AssertionError("Null continuation returned from Continuations library.");
            }
            ((wwn) this.a.io()).t(acjxVarAe);
        }
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}

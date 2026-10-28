package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class war implements vxc {
    private final zwb a;
    private final hed b;

    public war(hed hedVar, zwb zwbVar) {
        this.b = hedVar;
        this.a = zwbVar;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) throws vxo {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akvm.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            throw new vxo(null);
        }
        hed hedVar = this.b;
        zwa zwaVarE = this.a.e();
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akvm.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        akuz akuzVar = ((akvm) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c;
        if (akuzVar == null) {
            akuzVar = akuz.a;
        }
        hedVar.G(zwaVarE, akuzVar);
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}

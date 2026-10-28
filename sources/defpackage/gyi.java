package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gyi extends gut {
    final cf a;
    final igk b;

    public gyi(cf cfVar, igk igkVar) {
        this.a = cfVar;
        this.b = igkVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aqaf.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        igi igiVarA = this.b.a();
        igi igiVar = igi.a;
        cf cfVar = this.a;
        if (igiVarA == igiVar) {
            hyd.o(cfVar).p(cfVar);
        } else {
            hye.o(cfVar).r(cfVar);
        }
    }
}

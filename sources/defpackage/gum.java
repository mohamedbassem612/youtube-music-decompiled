package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gum extends gut {
    private final jod a;

    public gum(jod jodVar) {
        this.a = jodVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void a(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anig.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anig.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        anig anigVar = (anig) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        int i = anigVar.c & 1;
        if (i != 0) {
            jod jodVar = this.a;
            if (i != 0) {
                apji apjiVar = anigVar.d;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(anie.a);
                apjiVar.c(aihlVarCheckIsLite3);
                if (apjiVar.j.n(aihlVarCheckIsLite3.d)) {
                    apji apjiVar2 = anigVar.d;
                    if (apjiVar2 == null) {
                        apjiVar2 = apji.a;
                    }
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(anie.a);
                    apjiVar2.c(aihlVarCheckIsLite4);
                    Object objK2 = apjiVar2.j.k(aihlVarCheckIsLite4.d);
                    if ((((anid) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2))).b & 1) != 0) {
                        apji apjiVar3 = anigVar.d;
                        if (apjiVar3 == null) {
                            apjiVar3 = apji.a;
                        }
                        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(anie.a);
                        apjiVar3.c(aihlVarCheckIsLite5);
                        Object objK3 = apjiVar3.j.k(aihlVarCheckIsLite5.d);
                        jodVar.b = (anid) (objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3));
                        jodVar.c = true;
                        jodVar.a.kk(Optional.of(jod.d(jodVar.b)));
                        jodVar.c();
                    }
                }
            }
        }
    }
}

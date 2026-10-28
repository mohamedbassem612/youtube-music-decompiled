package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gtc extends gut {
    private final awmd a;

    public gtc(awmd awmdVar) {
        this.a = awmdVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajpt.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        rkt rktVar = (rkt) this.a.io();
        ajwoVar.getClass();
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajpt.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite2.d));
        if (rktVar.i || rktVar.f() != null) {
            return;
        }
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(ajpt.b);
        ajwoVar.c(aihlVarCheckIsLite3);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite3.d);
        ajpt ajptVar = (ajpt) (objK == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK));
        if (rktVar.k.l(40, 45708317L, false)) {
            cf cfVar = rktVar.a;
            aapw aapwVar = rktVar.l;
            byte[] bArrG = ajptVar.c.G();
            int iAq = ahng.aq(ajptVar.d);
            taf.k(cfVar, aapwVar.k(bArrG, iAq != 0 ? iAq : 1, rktVar.j.m(4, 45428282L), rktVar.e), new jlz(rktVar, 13), new gyr((Object) rktVar, (Object) ajptVar, (Object) ajwoVar, 6));
            return;
        }
        byte[] bArrG2 = ajptVar.c.G();
        int iAq2 = ahng.aq(ajptVar.d);
        if (iAq2 == 0) {
            iAq2 = 1;
        }
        xgn xgnVar = rktVar.c;
        rktVar.g = rkm.p(bArrG2, iAq2, null, xgnVar);
        av avVar = new av(rktVar.a.getSupportFragmentManager());
        avVar.g(0, rktVar.g, "channel_creation_fragment", 1);
        avVar.a(false, true);
        xgnVar.b(xhb.a(124448), ajwoVar, null);
    }
}

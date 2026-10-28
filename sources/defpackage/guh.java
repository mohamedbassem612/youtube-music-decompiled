package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class guh extends gut {
    private final xeu a;
    private final awmd b;
    private final awmd c;

    public guh(xeu xeuVar, awmd awmdVar, awmd awmdVar2) {
        this.a = xeuVar;
        this.b = awmdVar;
        this.c = awmdVar2;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        acfw acfwVarH;
        String strE;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(amtx.a);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihf aihfVarCreateBuilder = amuv.a.createBuilder();
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(amtx.a);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        aigj aigjVar = ((amtw) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).b;
        aihfVarCreateBuilder.copyOnWrite();
        amuv amuvVar = (amuv) aihfVarCreateBuilder.instance;
        aigjVar.getClass();
        amuvVar.b |= 1;
        amuvVar.c = aigjVar;
        if (((vxz) this.c.io()).l(86, 45748205L, false) && (acfwVarH = ((abvk) this.b.io()).h()) != null && (strE = acfwVarH.e()) != null) {
            aihfVarCreateBuilder.copyOnWrite();
            amuv amuvVar2 = (amuv) aihfVarCreateBuilder.instance;
            amuvVar2.b |= 2;
            amuvVar2.d = strE;
        }
        xeu xeuVar = this.a;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.LYRIC_IMPRESSION_EVENT);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        amuv amuvVar3 = (amuv) aihfVarCreateBuilder.build();
        amuvVar3.getClass();
        alouVar.d = amuvVar3;
        alouVar.c = 309;
        xeuVar.b((alou) alosVar.build());
    }
}

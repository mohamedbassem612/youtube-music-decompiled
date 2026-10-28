package defpackage;

import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gts extends gut {
    public final tbt a;
    public final ttm b;
    public final awmd c;
    public final Optional d;
    private final Executor e;
    private final aapw f;

    public gts(aapw aapwVar, tbt tbtVar, ttm ttmVar, awmd awmdVar, Optional optional, Executor executor) {
        aapwVar.getClass();
        this.f = aapwVar;
        tbtVar.getClass();
        this.a = tbtVar;
        ttmVar.getClass();
        this.b = ttmVar;
        this.c = awmdVar;
        this.d = optional;
        this.e = executor;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        String str;
        aapw aapwVar = this.f;
        wpw wpwVarG = aapwVar.g();
        if (fhz.K(ajwoVar)) {
            str = fhz.J(ajwoVar).b;
        } else {
            if (!fhz.B(ajwoVar)) {
                throw new IllegalArgumentException(ajwoVar.toString());
            }
            ahno.F(fhz.B(ajwoVar));
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aqrr.b);
            ajwoVar.c(aihlVarCheckIsLite);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
            str = ((aqrr) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c;
        }
        wpwVarG.e(str);
        wpwVarG.o(vxg.a(ajwoVar).G());
        aihl aihlVar = appx.b;
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite2);
        if (ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite3);
            Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
            appw appwVar = (appw) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2));
            if (!appwVar.c.isEmpty()) {
                wpwVarG.p(appwVar.c);
            }
        }
        taf.i(aapwVar.h(wpwVarG), this.e, new gtq(this, 0), new gsu(this, map, ajwoVar, 3, (byte[]) null), new gqd(2));
    }
}

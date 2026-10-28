package defpackage;

import android.os.Bundle;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gsl extends gut {
    private final sqh a;

    public gsl(ruf rufVar, tbt tbtVar, cf cfVar, xgm xgmVar, abvk abvkVar, Executor executor) {
        this.a = new sqh(rufVar, tbtVar, cfVar, xgmVar, abvkVar, executor);
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        boolean z;
        Object objS = tym.S(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aipr.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aipr.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            apji apjiVar = ((aipr) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).d;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aipu.a);
            apjiVar.c(aihlVarCheckIsLite3);
            if (apjiVar.j.n(aihlVarCheckIsLite3.d)) {
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aipr.b);
                ajwoVar.c(aihlVarCheckIsLite4);
                Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
                Object objC = objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2);
                sqh sqhVar = this.a;
                abvk abvkVar = sqhVar.e;
                aipr aiprVar = (aipr) objC;
                if (abvkVar.X()) {
                    z = false;
                    abvkVar.ap(false, 19);
                } else {
                    z = true;
                }
                Optional optionalOfNullable = Optional.ofNullable(objS);
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = Optional.ofNullable(new vvt(optionalOfNullable.get()));
                }
                sqhVar.g = new sqn(new sqm(aiprVar, z, optionalOfNullable), sqhVar.f, sqhVar.a, sqhVar.b, abvkVar);
                apji apjiVar2 = aiprVar.d;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aipu.a);
                apjiVar2.c(aihlVarCheckIsLite5);
                Object objK3 = apjiVar2.j.k(aihlVarCheckIsLite5.d);
                Object objC2 = objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3);
                sqn sqnVar = sqhVar.g;
                xgn xgnVarHB = sqhVar.d.hB();
                sql sqlVar = new sql();
                Bundle bundle = new Bundle();
                bundle.putByteArray("about_this_ad_renderer", ((aipt) objC2).toByteArray());
                sqlVar.setArguments(bundle);
                sqlVar.k = xgnVarHB;
                sqlVar.p = sqnVar;
                sqlVar.h(sqhVar.c.getSupportFragmentManager(), "AboutThisAdWebViewDialogFragment");
                return;
            }
        }
        zvp.a(zvn.b, zvm.a, "Rendering data missing for AboutThisAdCommand");
    }
}

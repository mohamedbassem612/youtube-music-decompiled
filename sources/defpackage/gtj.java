package defpackage;

import android.app.Activity;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gtj extends gut {
    public final Activity a;
    public final ttm b;
    public final tbt c;
    public final vxe d;
    public final jin e;
    public final vxz f;
    public final hef g;
    private final wsg h;

    public gtj(Activity activity, wsg wsgVar, ttm ttmVar, tbt tbtVar, vxe vxeVar, jin jinVar, vxz vxzVar, hef hefVar) {
        this.a = activity;
        this.h = wsgVar;
        this.b = ttmVar;
        this.c = tbtVar;
        this.d = vxeVar;
        this.e = jinVar;
        this.f = vxzVar;
        this.g = hefVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akgl.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        wsg wsgVar = this.h;
        wsa wsaVarG = wsgVar.g();
        wsaVarG.n(ajwoVar.c);
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akgl.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        akgl akglVar = (akgl) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        wsaVarG.F(akglVar.g.trim());
        wsaVarG.a = wsa.j(akglVar.i.trim());
        Iterator it = akglVar.d.iterator();
        while (it.hasNext()) {
            wsaVarG.e((String) it.next());
        }
        int i = akglVar.c;
        if ((i & 1) != 0) {
            wsaVarG.b = akglVar.e;
        }
        if ((i & 2) != 0) {
            wsaVarG.c = akglVar.f;
        }
        if ((i & 8) != 0) {
            int iAS = a.aS(akglVar.h);
            if (iAS == 0) {
                iAS = 1;
            }
            wsaVarG.d = iAS;
        }
        wsgVar.i(wsaVarG, new gml(this, ajwoVar, 2));
        this.c.c(new haz(true, null));
    }
}

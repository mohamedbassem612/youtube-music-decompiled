package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gyd extends gut {
    private final awmd a;
    private final itu b;
    private final ttm c;
    private final tbt d;
    private final jin e;

    public gyd(itu ituVar, awmd awmdVar, ttm ttmVar, tbt tbtVar, jin jinVar) {
        ituVar.getClass();
        this.b = ituVar;
        awmdVar.getClass();
        this.a = awmdVar;
        ttmVar.getClass();
        this.c = ttmVar;
        tbtVar.getClass();
        this.d = tbtVar;
        this.e = jinVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aigw aigwVar = ish.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aigwVar);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aigwVar);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        apzb apzbVar = (apzb) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        typ.f(apzbVar.d);
        itu ituVar = this.b;
        String str = apzbVar.d;
        aiie aiieVar = apzbVar.e;
        Object objS = tym.S(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        vxe vxeVar = (vxe) this.a.io();
        ttm ttmVar = this.c;
        tbt tbtVar = this.d;
        ituVar.c(str, aiieVar, new gyc(apzbVar, objS, vxeVar, ttmVar, tbtVar, this.e));
        tbtVar.c(new haz(true, null));
    }
}

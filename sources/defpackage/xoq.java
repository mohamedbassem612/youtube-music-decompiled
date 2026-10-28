package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xoq implements vxc {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/handoff/HandoffEndpointResolver");
    private final xow b;

    public xoq(xow xowVar) {
        this.b = xowVar;
    }

    @Override // defpackage.vxc
    public final void a(ajwo ajwoVar) {
        throw null;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void c(ajwo ajwoVar, Map map) {
        aihl aihlVar = algo.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
        xow xowVar = this.b;
        aihf aihfVarCreateBuilder = alrf.a.createBuilder();
        algu alguVar = ((algo) objC).c;
        if (alguVar == null) {
            alguVar = algu.a;
        }
        aihfVarCreateBuilder.copyOnWrite();
        alrf alrfVar = (alrf) aihfVarCreateBuilder.instance;
        alguVar.getClass();
        alrfVar.d = alguVar;
        alrfVar.c = 3;
        taf.j(xowVar.a(aihfVarCreateBuilder), new tsq(17));
    }
}

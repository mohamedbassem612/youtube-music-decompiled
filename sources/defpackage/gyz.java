package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gyz extends gut {
    public final vxe a;
    public final cf b;
    public final ttm c;
    private final wvi d;
    private final Executor e;

    public gyz(vxe vxeVar, cf cfVar, wvi wviVar, ttm ttmVar, Executor executor) {
        vxeVar.getClass();
        this.a = vxeVar;
        cfVar.getClass();
        this.b = cfVar;
        this.d = wviVar;
        ttmVar.getClass();
        this.c = ttmVar;
        this.e = executor;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        ajnf ajnfVar = (ajnf) tym.U(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", ajnf.class);
        wvi wviVar = this.d;
        wvf wvfVarA = wviVar.a();
        wvfVarA.n(ajwoVar.c);
        if (ajnfVar != null) {
            ajwo ajwoVar2 = ajnfVar.q;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aroy.b);
            ajwoVar2.c(aihlVarCheckIsLite);
            Object objK = ajwoVar2.j.k(aihlVarCheckIsLite.d);
            wvfVarA.e(((aroy) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c);
        }
        cf cfVar = this.b;
        wvfVarA.r = tym.I(cfVar);
        taf.k(cfVar, wviVar.d(wvfVarA, this.e), new glm(this, 11), new glm(this, 12));
    }
}

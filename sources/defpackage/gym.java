package defpackage;

import j$.util.Objects;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gym extends gut {
    private final jki a;

    public gym(jki jkiVar) {
        this.a = jkiVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVar = aqzm.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
        jki jkiVar = this.a;
        aqzm aqzmVar = (aqzm) objC;
        if (Objects.equals(jkiVar.e(), "GeneratedThumbnailsSelectorFragment") && (jkiVar.b() instanceof hdj)) {
            hdj hdjVar = (hdj) jkiVar.b();
            int i = aqzmVar.c;
            String str = aqzmVar.d;
            ytf ytfVar = hdjVar.L;
            if (ytfVar != null && ytfVar.g(i) != null) {
                hdjVar.L.g(i).setText(str);
                hdjVar.L.f.set(i, str);
            }
            hdjVar.D();
        }
    }
}

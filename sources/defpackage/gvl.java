package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gvl extends gut {
    private final tbt a;

    public gvl(tbt tbtVar) {
        tbtVar.getClass();
        this.a = tbtVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        boolean z = false;
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(anwo.a);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                z = true;
            }
        }
        ahno.F(z);
        Object objS = tym.S(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        if (objS instanceof anwt) {
            this.a.c(new hcm((anwt) objS));
        }
    }
}

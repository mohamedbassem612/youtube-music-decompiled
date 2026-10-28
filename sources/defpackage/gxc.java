package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gxc extends gut {
    private final gfp a;

    public gxc(gfp gfpVar) {
        this.a = gfpVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final boolean b() {
        return true;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apni.a);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        this.a.j(ajwoVar, map);
    }
}

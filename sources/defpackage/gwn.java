package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gwn extends gut {
    private final gfp a;
    private final awmd b;
    private final tfq c;

    public gwn(gfp gfpVar, tfq tfqVar, awmd awmdVar) {
        this.a = gfpVar;
        this.c = tfqVar;
        this.b = awmdVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aoth.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        if (this.c.h()) {
            this.a.f(ajwoVar, map);
        } else {
            ((tts) this.b.io()).a();
        }
    }
}

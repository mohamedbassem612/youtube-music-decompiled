package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gvg extends gut {
    private static final agrf b = agrf.h("com/google/android/apps/youtube/music/command/MusicRadioBuilderSearchCommandResolver");
    public final xow a;
    private final Executor c;

    public gvg(xow xowVar, Executor executor) {
        this.a = xowVar;
        this.c = executor;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void a(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anvz.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        taf.j(ahng.r(new uf(this, (anvz) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)), 5, null), this.c), new glo(12));
    }
}

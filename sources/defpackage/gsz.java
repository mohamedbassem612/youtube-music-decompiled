package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gsz extends gut {
    private static final agrf b = agrf.h("com/google/android/apps/youtube/music/command/BrowseMusicLibrarySectionListReloadCommandResolver");
    public final vxe a;
    private final jks c;
    private final Executor d;

    public gsz(jks jksVar, vxe vxeVar, Executor executor) {
        this.c = jksVar;
        this.a = vxeVar;
        this.d = executor;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmn.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajmn.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        ajmn ajmnVar = (ajmn) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        int i = ajmnVar.c;
        if ((i & 1) == 0 || (i & 2) == 0) {
            return;
        }
        aihf aihfVarCreateBuilder = ajmu.a.createBuilder();
        taf.i(this.c.a(), this.d, new glo(8), new gst((gut) this, (Object) aihfVarCreateBuilder, (Object) ajmnVar, map, 2), null);
    }
}

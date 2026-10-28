package defpackage;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gvb extends gut {
    private static final agrf b = agrf.h("com/google/android/apps/youtube/music/command/MusicLibraryPersistLaunchNavigationCommandResolver");
    public final Context a;
    private final cf c;
    private final zwb d;
    private final awku e;
    private final syn f;

    public gvb(Context context, syn synVar, cf cfVar, zwb zwbVar, awku awkuVar) {
        this.a = context;
        this.c = cfVar;
        this.f = synVar;
        this.d = zwbVar;
        this.e = awkuVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anqn.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(anqn.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        anqn anqnVar = (anqn) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        if ((anqnVar.c & 1) == 0) {
            ((agrc) ((agrc) b.b().i(agso.a, "MusicLibraryPLNCR")).k("com/google/android/apps/youtube/music/command/MusicLibraryPersistLaunchNavigationCommandResolver", "resolve", 80, "MusicLibraryPersistLaunchNavigationCommandResolver.java")).t("Received MusicLibraryPersistLaunchNavigationCommand with no command");
            return;
        }
        ajwo ajwoVar2 = anqnVar.d;
        if (ajwoVar2 == null) {
            ajwoVar2 = ajwo.a;
        }
        this.e.kk(new guz(ajwoVar2));
        taf.g(taf.a(this.c, this.f.n(this.d.e()), new gmv(this, 4)), new gln(ajwoVar2, 5));
    }
}

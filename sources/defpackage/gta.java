package defpackage;

import com.google.common.util.concurrent.MoreExecutors;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gta extends gut {
    private static final agrf b = agrf.h("com/google/android/apps/youtube/music/command/BrowseMusicPodcastShowDownloadsSectionListReloadCommandResolver");
    public final vxe a;
    private final hpk c;
    private final Executor d;

    public gta(hpk hpkVar, vxe vxeVar, Executor executor) {
        this.c = hpkVar;
        this.a = vxeVar;
        this.d = executor;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmo.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        if (map == null) {
            map = new HashMap();
        }
        Map map2 = map;
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajmo.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        ajmo ajmoVar = (ajmo) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        if ((ajmoVar.c & 1) != 0) {
            aihh aihhVar = (aihh) ajwo.a.createBuilder();
            aihl aihlVar = ajmu.b;
            aihf aihfVarCreateBuilder = ajmu.a.createBuilder();
            ajmv ajmvVar = ajmoVar.d;
            if (ajmvVar == null) {
                ajmvVar = ajmv.a;
            }
            aihfVarCreateBuilder.copyOnWrite();
            ajmu ajmuVar = (ajmu) aihfVarCreateBuilder.instance;
            ajmvVar.getClass();
            ajmuVar.d = ajmvVar;
            ajmuVar.c |= 1;
            String str = ajmoVar.e;
            aihfVarCreateBuilder.copyOnWrite();
            ajmu ajmuVar2 = (ajmu) aihfVarCreateBuilder.instance;
            str.getClass();
            ajmuVar2.c |= 2;
            ajmuVar2.e = str;
            aihhVar.e(aihlVar, (ajmu) aihfVarCreateBuilder.build());
            taf.i(afxd.f(this.c.b()).g(new hoh(18), MoreExecutors.directExecutor()), this.d, new glo(9), new gsu(this, map2, (ajwo) aihhVar.build(), 2, (byte[]) null), null);
        }
    }
}

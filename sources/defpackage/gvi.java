package defpackage;

import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gvi extends gut {
    private static final agrf a = agrf.h("com/google/android/apps/youtube/music/command/MusicScrollToSectionCommandResolver");
    private final cf b;
    private final ScheduledExecutorService c;

    public gvi(cf cfVar, ScheduledExecutorService scheduledExecutorService) {
        this.b = cfVar;
        this.c = scheduledExecutorService;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anwc.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        anwc anwcVar = (anwc) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        if ((anwcVar.c & 2) == 0 || anwcVar.e.isEmpty()) {
            return;
        }
        jav javVar = (jav) tym.U(map, "sectionListController", jav.class);
        if (javVar == null) {
            ((agrc) ((agrc) a.b()).k("com/google/android/apps/youtube/music/command/MusicScrollToSectionCommandResolver", "resolve", 59, "MusicScrollToSectionCommandResolver.java")).t("MusicScrollToSectionCommand called without controller");
        } else {
            this.b.getLifecycle().b(new uyf(this.c.schedule(new uf(javVar, anwcVar, 6, null), anwcVar.d, TimeUnit.MILLISECONDS), 1));
        }
    }
}

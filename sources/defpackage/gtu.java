package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gtu extends gut {
    private final hyu a;

    public gtu(hyu hyuVar) {
        this.a = hyuVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akzd.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        hyu hyuVar = this.a;
        if (hyuVar.f.isEmpty()) {
            ((agrc) ((agrc) hyu.a.c()).k("com/google/android/apps/youtube/music/player/controls/report/ReportVideoController", "reportVideo", 110, "ReportVideoController.java")).t("Report without action target.");
            return;
        }
        if (hyuVar.c.u()) {
            Object obj = hyuVar.f.get();
            ((abvk) hyuVar.e.io()).ap(false, 19);
            if (!hyuVar.g.i()) {
                hyuVar.b.a();
                return;
            }
            alzx alzxVar = (alzx) obj;
            int i = alzxVar.b;
            if (i == 113762946) {
                hyuVar.d.b(i == 113762946 ? (apkc) alzxVar.c : apkc.a, hyuVar);
            } else {
                ((agrc) ((agrc) hyu.a.b()).k("com/google/android/apps/youtube/music/player/controls/report/ReportVideoController", "showDialog", 133, "ReportVideoController.java")).t("No available renderers. Not showing Video Reporting form.");
                hyuVar.b.a();
            }
        }
    }
}

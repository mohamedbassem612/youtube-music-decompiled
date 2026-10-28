package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gxh extends gut {
    private final Activity a;
    private final Handler b;
    private final aunn c;
    private final vxz d;

    public gxh(Activity activity, Handler handler, aunn aunnVar, vxz vxzVar) {
        this.a = activity;
        this.b = handler;
        this.c = aunnVar;
        this.d = vxzVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajfd.a);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajfd.a);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        ajfc ajfcVar = (ajfc) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        boolean zIsEmpty = ajfcVar.c.isEmpty();
        String str = ajfcVar.d;
        if ("music_settings_subtitles".equals(str)) {
            afwl.m(this.a, new Intent("android.settings.CAPTIONING_SETTINGS"));
        } else {
            Activity activity = this.a;
            aprv aprvVarA = aprv.a(ajfcVar.e);
            if (aprvVarA == null) {
                aprvVarA = aprv.SETTING_CAT_UNKNOWN;
            }
            vxz vxzVar = this.d;
            gzn gznVar = (gzn) irf.b.get(str);
            if (gznVar == null) {
                gznVar = (gzn) irf.c.get(aprvVarA);
            }
            if (gznVar == null) {
                gznVar = (!vxzVar.l(229, 45775088L, false) || zIsEmpty) ? gzn.SETTINGS_HEADERS_FRAGMENT : gzn.DRILL_DOWN_SETTINGS_FRAGMENT;
            }
            afwl.m(activity, irf.a(activity, gznVar, ajwoVar, vxzVar));
        }
        Handler handler = this.b;
        jnh jnhVar = (jnh) this.c.io();
        jnhVar.getClass();
        handler.post(new gnc(jnhVar, 16));
    }
}

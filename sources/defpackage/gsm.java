package defpackage;

import android.app.Activity;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gsm extends gut {
    private final Activity a;
    private final vxz b;

    public gsm(Activity activity, vxz vxzVar) {
        activity.getClass();
        this.a = activity;
        this.b = vxzVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aiqr.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        Activity activity = this.a;
        afwl.m(activity, irf.a(activity, gzn.PRIVACY_PREFS_FRAGMENT, ajwoVar, this.b));
    }
}

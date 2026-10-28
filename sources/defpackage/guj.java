package defpackage;

import android.app.Activity;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class guj extends gut {
    private final Activity a;
    private final aunn b;

    public guj(Activity activity, aunn aunnVar) {
        this.a = activity;
        this.b = aunnVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        ajwoVar.getClass();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(amvm.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            Activity activity = this.a;
            if (txz.d(activity)) {
                activity.startActivityForResult(fhz.am(((zwb) this.b.io()).e()), 51937);
            } else {
                afwl.m(activity, gry.a(activity, 2));
            }
        }
    }
}

package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.youtube.music.R;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gxi extends gut {
    private final Activity a;
    private final vxe b;
    private final awmd c;
    private final awmd d;
    private final tfq e;

    public gxi(Activity activity, tfq tfqVar, vxe vxeVar, awmd awmdVar, awmd awmdVar2) {
        this.a = activity;
        this.e = tfqVar;
        this.b = vxeVar;
        this.c = awmdVar;
        this.d = awmdVar2;
    }

    private final void d(Uri uri) {
        Intent intentC = tym.c();
        intentC.putExtra("android.intent.extra.TEXT", uri.toString());
        Activity activity = this.a;
        afwl.m(activity, Intent.createChooser(intentC, activity.getText(R.string.menu_share)));
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apte.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        apte apteVar = (apte) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        if (!this.e.i()) {
            String str = apteVar.d;
            aptf aptfVar = aptf.a;
            aptf aptfVar2 = (aptf) zik.cf(str, aihn.getParserForClass(aptf.class));
            if (aptfVar2 != null) {
                if ((aptfVar2.b & 1) != 0) {
                    d(ixt.u(aptfVar2.c));
                    return;
                } else if ((aptfVar2.b & 2) != 0) {
                    d(ixt.s(aptfVar2.d));
                    return;
                } else if ((aptfVar2.b & 4) != 0) {
                    d(new Uri.Builder().scheme("https").authority("music.youtube.com").appendPath("channel").appendPath(aptfVar2.e).appendQueryParameter("feature", "share").build());
                    return;
                }
            }
            ((tts) this.c.io()).a();
            return;
        }
        Activity activity = this.a;
        if (jku.d(activity)) {
            int iBt = a.bt(apteVar.f);
            if (iBt == 0) {
                iBt = 2;
            }
            int i = iBt - 1;
            if (i == 1) {
                if (!(activity instanceof cf)) {
                    agrx agrxVar = agso.a;
                    return;
                }
                aemn aemnVar = new aemn();
                Bundle bundle = new Bundle();
                bundle.putByteArray("navigation_endpoint", ajwoVar.toByteArray());
                aemnVar.setArguments(bundle);
                aemnVar.h(((cf) activity).getSupportFragmentManager(), "UnifiedSharePanelFragment");
                return;
            }
            if (i != 2 && i != 5) {
                agrx agrxVar2 = agso.a;
                return;
            }
            if ((apteVar.c & 16) == 0) {
                agrx agrxVar3 = agso.a;
                return;
            }
            vxe vxeVar = this.b;
            ajwo ajwoVar2 = apteVar.g;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            vxeVar.c(ajwoVar2, map);
        }
    }
}

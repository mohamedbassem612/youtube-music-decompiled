package defpackage;

import android.app.Activity;
import android.net.Uri;
import com.google.android.apps.youtube.music.R;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gxj extends gut {
    private final Activity a;

    public gxj(Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apth.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apth.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        apth apthVar = (apth) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        boolean zIsEmpty = apthVar.d.isEmpty();
        Activity activity = this.a;
        if (zIsEmpty) {
            tuk.n(activity, R.string.share_playlist_unavailable, 0);
        } else {
            tym.e(activity, apthVar.e, (apthVar.c & 16) != 0 ? apthVar.f : null, Uri.parse(apthVar.d));
        }
    }
}

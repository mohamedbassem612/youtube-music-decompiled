package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.music.R;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gxk extends gut {
    private final Activity a;

    public gxk(Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        Intent intentCreateChooser;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aptk.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aptk.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        aptk aptkVar = (aptk) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        if (!aptkVar.d.isEmpty()) {
            Activity activity = this.a;
            String str = aptkVar.f;
            Uri uriU = ixt.u(aptkVar.d);
            String strB = axg.a().b(str);
            Intent intentC = tym.c();
            String string = activity.getString(R.string.share_subject, strB);
            String string2 = activity.getString(R.string.share_text, strB, uriU);
            intentC.putExtra("android.intent.extra.SUBJECT", string);
            intentC.putExtra("android.intent.extra.TEXT", string2);
            afwl.m(activity, Intent.createChooser(intentC, activity.getText(R.string.send_video)));
            return;
        }
        boolean zIsEmpty = aptkVar.e.isEmpty();
        Activity activity2 = this.a;
        if (zIsEmpty) {
            tuk.n(activity2, R.string.share_unavailable, 0);
            return;
        }
        String strConcat = aptkVar.f;
        Uri uri = Uri.parse(aptkVar.e);
        int i = typ.a;
        if (!TextUtils.isEmpty(strConcat) && strConcat.length() > 50) {
            strConcat = String.valueOf(String.valueOf(strConcat.subSequence(0, 49))).concat("…");
        }
        Uri uriE = tyu.e(uri);
        if (uriE == null) {
            intentCreateChooser = null;
        } else {
            intentCreateChooser = Intent.createChooser(tym.b(activity2, strConcat, null, null, uriE), activity2.getText(R.string.send_video));
            intentCreateChooser.addFlags(268435456);
            intentCreateChooser.addFlags(262144);
        }
        if (intentCreateChooser != null) {
            activity2.startActivity(intentCreateChooser);
        } else {
            twu.c(5, "Share video error: null watch uri", null);
        }
    }
}

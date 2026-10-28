package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.music.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gyq extends gut {
    private static final agrf a = agrf.h("com/google/android/apps/youtube/music/command/UrlCommandResolver");
    private final Activity b;
    private final acwd c;
    private final awmd d;
    private final abuz e;

    public gyq(Activity activity, abuz abuzVar, acwd acwdVar, awmd awmdVar) {
        this.b = activity;
        this.e = abuzVar;
        this.c = acwdVar;
        this.d = awmdVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        abuz abuzVar = this.e;
        if (abuzVar != null) {
            abuzVar.o(tym.S(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"), ajbf.ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_URL);
        }
        String strY = fhz.y(ajwoVar);
        Uri uriD = tyu.d(strY);
        if (uriD == null) {
            uriD = null;
        } else {
            try {
                uriD = ((zzj) this.d.io()).a(uriD, (zzi[]) tym.U(map, "MacrosConverters.CustomConvertersKey", zzi[].class));
            } catch (tzn unused) {
                ((agrc) ((agrc) a.c()).k("com/google/android/apps/youtube/music/command/UrlCommandResolver", "parseUri", 106, "UrlCommandResolver.java")).w("Failed macro substitution for URI: %s", strY);
            }
        }
        if (uriD != null) {
            Intent intent = new Intent("android.intent.action.VIEW", uriD);
            Activity activity = this.b;
            agrf agrfVar = sxy.a;
            List<ResolveInfo> listQueryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) {
                tuk.n(activity, R.string.cannot_open_link, 0);
                return;
            }
            if (((Boolean) tym.T(map, "always_launch_in_browser", Boolean.FALSE)).booleanValue()) {
                sxy.f(activity, uriD);
                return;
            }
            int i = ackj.b;
            String str = intent.getPackage();
            String packageName = activity.getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                if (str == null) {
                    Iterator<ResolveInfo> it = activity.getPackageManager().queryIntentActivities(intent, 65536).iterator();
                    while (it.hasNext()) {
                        if (packageName.equals(it.next().activityInfo.packageName)) {
                            intent.putExtra("is_loopback", true);
                            intent.setPackage(packageName);
                            break;
                        }
                    }
                } else if (packageName.equals(str)) {
                    intent.putExtra("is_loopback", true);
                }
            }
            if (intent.getPackage() == null && this.c.a(activity, uriD)) {
                return;
            }
            sxy.b(activity, intent, uriD);
            sxy.e(activity, uriD);
        }
    }
}

package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class klu {
    private static volatile boolean a = false;
    public static final int c = 264205000;
    public static final klu d;

    static {
        boolean z = kml.a;
        a = false;
        d = new klu();
    }

    public final int l(Context context) {
        return m(context, c);
    }

    public final int m(Context context, int i) {
        int iB = kml.b(context, i);
        if (iB == 1) {
            return !kml.f(context) ? 1 : 18;
        }
        return iB;
    }

    public final Intent n(Context context, int i, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            if (context != null) {
                boolean z = kqw.a;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context == null) {
            context = null;
        } else if (kss.e(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(c);
        sb.append('-');
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append('-');
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append('-');
        if (context != null) {
            try {
                sb.append(kte.b(context).g(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public final PendingIntent o(Context context, int i, String str) {
        Intent intentN = n(context, i, str);
        if (intentN == null) {
            return null;
        }
        return PendingIntent.getActivity(context, 0, intentN, 201326592);
    }
}

package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sxy {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/common/async/ExternalIntents");
    static final Uri b = Uri.parse("https://play.google.com/store/");
    public static final syf c = new syf();

    public static Intent a(Uri uri) {
        return new Intent("android.intent.action.VIEW").setDataAndType(uri, "text/html");
    }

    public static void b(Context context, Intent intent, Uri uri) {
        context.getClass();
        uri.getClass();
        boolean zEquals = "https".equals(uri.getScheme());
        intent.putExtra("trusted_application_code_extra", qof.b(context.getApplicationContext(), 0, new Intent().setComponent(new ComponentName(context.getPackageName(), "com.google.android.finsky.transparentmainactivity.TransparentMainActivity")), 1140850688));
        intent.putExtra("android.intent.extra.REFERRER", Uri.parse(true != zEquals ? "http://youtube.com/mobile" : "https://youtube.com/mobile"));
    }

    public static void c(Context context, Intent intent) {
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    public static void d(Activity activity, String str, String str2) {
        Uri.Builder builderAppendQueryParameter = b.buildUpon().appendEncodedPath("apps").appendEncodedPath("details").appendQueryParameter("id", str);
        if (str2 != null) {
            builderAppendQueryParameter.appendQueryParameter("referrer", str2);
        }
        Intent intent = new Intent("android.intent.action.VIEW", builderAppendQueryParameter.build());
        intent.setPackage("com.android.vending");
        activity.startActivity(intent);
    }

    public static void e(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        try {
            c(context, intent);
        } catch (ActivityNotFoundException e) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/common/async/ExternalIntents", "viewUri", (char) 141, "ExternalIntents.java")).t("Activity not found to view uri");
        }
    }

    public static void f(Context context, Uri uri) {
        ResolveInfo resolveInfoResolveActivity;
        ActivityInfo activityInfo;
        Intent intentA = a(uri);
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null && (resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 65536)) != null && (activityInfo = resolveInfoResolveActivity.activityInfo) != null && activityInfo.packageName != null) {
            Intent intent = new Intent(intentA);
            intent.setPackage(activityInfo.packageName);
            if (intent.resolveActivity(packageManager) != null) {
                intentA = intent;
            }
        }
        try {
            c(context, intentA);
        } catch (ActivityNotFoundException e) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/common/async/ExternalIntents", "launchBrowserIntentForUri", 'u', "ExternalIntents.java")).t("Activity not found to view uri");
        }
    }

    public static void g(Activity activity, Intent intent, mgk mgkVar, sxt sxtVar) {
        if (mgkVar != null) {
            mgkVar.b(intent, 907, sxtVar);
        } else {
            activity.startActivityForResult(intent, 907);
        }
    }
}

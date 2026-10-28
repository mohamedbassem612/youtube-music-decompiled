package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.youtube.music.R;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kqh {
    public static final /* synthetic */ int a = 0;
    private static final aha b = new aha(0);
    private static Locale c;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Object obj = kte.b(context).a;
            return ((Context) obj).getPackageManager().getApplicationLabel(((Context) obj).getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return !TextUtils.isEmpty(str) ? str : packageName;
        }
    }

    public static String b(Context context, int i) {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, strA);
        }
        if (i != 2) {
            if (i == 3) {
                return resources.getString(R.string.common_google_play_services_enable_text, strA);
            }
            if (i == 4) {
                return resources.getString(R.string.common_google_play_services_signin_required_text, strA);
            }
            if (i == 5) {
                return d(context, "common_google_play_services_invalid_account_text", strA);
            }
            if (i == 7) {
                return d(context, "common_google_play_services_network_error_text", strA);
            }
            if (i == 9) {
                return resources.getString(R.string.common_google_play_services_unsupported_text, strA);
            }
            if (i == 20) {
                return d(context, "common_google_play_services_restricted_profile_text", strA);
            }
            if (i != 21) {
                switch (i) {
                    case 16:
                        return d(context, "common_google_play_services_api_unavailable_text", strA);
                    case 17:
                        return d(context, "common_google_play_services_sign_in_failed_text", strA);
                    case 18:
                        return resources.getString(R.string.common_google_play_services_updating_text, strA);
                    default:
                        return resources.getString(R.string.common_google_play_services_try_again_text, strA);
                }
            }
        }
        return kss.e(context) ? resources.getString(R.string.common_google_play_services_wear_update_text, strA) : resources.getString(R.string.common_google_play_services_update_text, strA);
    }

    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
            case 21:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
                Log.e("GoogleApiAvailability", "Sign-in is required to use this API.");
                return resources.getString(R.string.common_google_play_services_signin_required_title);
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case 6:
                Log.e("GoogleApiAvailability", "Google Play services requires resolution.");
                return e(context, "common_google_play_services_resolution_required_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return resources.getString(R.string.common_google_play_services_unsupported_title);
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            default:
                Log.e("GoogleApiAvailability", a.bR(i, "Unexpected error code "));
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 18:
                Log.e("GoogleApiAvailability", "Google Play services is updating.");
                return resources.getString(R.string.common_google_play_services_updating_client_title);
            case 19:
                Log.e("GoogleApiAvailability", "Google Play services is missing a required permission.");
                return e(context, "common_google_play_services_resolution_required_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strE = e(context, str);
        if (strE == null) {
            strE = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strE, str2);
    }

    public static String e(Context context, String str) {
        Resources resourcesForApplication;
        aha ahaVar = b;
        synchronized (ahaVar) {
            Locale localeF = new awq(new awr(context.getResources().getConfiguration().getLocales())).f(0);
            if (!localeF.equals(c)) {
                ahaVar.clear();
                c = localeF;
            }
            String str2 = (String) ahaVar.get(str);
            if (str2 != null) {
                return str2;
            }
            boolean z = kml.a;
            try {
                resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (PackageManager.NameNotFoundException unused) {
                resourcesForApplication = null;
            }
            if (resourcesForApplication == null) {
                return null;
            }
            int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", a.ce(str, "Missing resource: "));
                return null;
            }
            String string = resourcesForApplication.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", a.ce(str, "Got empty resource: "));
                return null;
            }
            b.put(str, string);
            return string;
        }
    }
}

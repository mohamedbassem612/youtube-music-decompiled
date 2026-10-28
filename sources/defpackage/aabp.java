package defpackage;

import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aabp {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/notification/push/util/NotificationIntentInteractionLoggingScreenUtil");

    public static xgt a(Intent intent) {
        if (intent.hasExtra("interaction_screen_bundle_extra")) {
            return f(intent.getBundleExtra("interaction_screen_bundle_extra"));
        }
        return null;
    }

    public static xgt b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return f(bundle.getBundle("interaction_screen_bundle_extra"));
    }

    public static void c(Intent intent, xgt xgtVar) {
        if (xgtVar != null) {
            intent.putExtra("interaction_screen_bundle_extra", e(xgtVar));
        }
    }

    public static void d(Bundle bundle, xgt xgtVar) {
        if (xgtVar != null) {
            bundle.putBundle("interaction_screen_bundle_extra", e(xgtVar));
        }
    }

    private static Bundle e(xgt xgtVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("interaction_screen_extra", xgtVar);
        return bundle;
    }

    private static xgt f(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        try {
            bundle.setClassLoader(xgt.class.getClassLoader());
            Parcelable parcelable = bundle.getParcelable("interaction_screen_extra");
            if (parcelable instanceof xgt) {
                return (xgt) parcelable;
            }
            return null;
        } catch (BadParcelableException e) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/notification/push/util/NotificationIntentInteractionLoggingScreenUtil", "getInternal", 'F', "NotificationIntentInteractionLoggingScreenUtil.java")).t("Malformed bundle.");
            return null;
        }
    }
}

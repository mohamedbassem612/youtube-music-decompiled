package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.util.Log;
import android.window.BackEvent;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class vz {
    static int a(BiometricManager biometricManager, int i) {
        return biometricManager.canAuthenticate(i);
    }

    public static FingerprintManager b(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    public static KeyguardManager c(Context context) {
        return (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    public static boolean d(Context context) {
        KeyguardManager keyguardManagerC = c(context);
        if (keyguardManagerC == null) {
            return false;
        }
        return keyguardManagerC.isDeviceSecure();
    }

    public static String e(Context context, int i) {
        if (context == null) {
            return "";
        }
        if (i == 1) {
            return context.getString(R.string.fingerprint_error_hw_not_available);
        }
        if (i != 7) {
            switch (i) {
                case 9:
                    break;
                case 10:
                    return context.getString(R.string.fingerprint_error_user_canceled);
                case 11:
                    return context.getString(R.string.fingerprint_error_no_fingerprints);
                case 12:
                    return context.getString(R.string.fingerprint_error_hw_not_present);
                default:
                    Log.e("BiometricUtils", a.bR(i, "Unknown error code: "));
                    return context.getString(R.string.default_error_msg);
            }
        }
        return context.getString(R.string.fingerprint_error_lockout);
    }

    public static final djk f(BackEvent backEvent) {
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new djk(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }
}

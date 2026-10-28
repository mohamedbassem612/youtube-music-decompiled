package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import com.google.android.apps.youtube.music.R;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class auiw {
    public static final String a = "auiw";

    private auiw() {
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c5  */
    public static boolean a(Activity activity, boolean z) {
        byte b;
        if (activity.getPackageManager().hasSystemFeature("android.software.vr.mode")) {
            try {
                activity.setVrModeEnabled(z, new ComponentName("com.google.vr.vrcore", "com.google.vr.vrcore.common.VrCoreListenerService"));
                return true;
            } catch (PackageManager.NameNotFoundException e) {
                String str = a;
                Log.w(str, "No VR service component: ".concat(e.toString()));
                if (activity.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                    Iterator<ApplicationInfo> it = activity.getPackageManager().getInstalledApplications(0).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            b = -1;
                            break;
                        }
                        if (it.next().packageName.equals("com.google.vr.vrcore")) {
                            String string = Settings.Secure.getString(activity.getContentResolver(), "enabled_vr_listeners");
                            ComponentName componentName = new ComponentName("com.google.vr.vrcore", "com.google.vr.vrcore.common.VrCoreListenerService");
                            if (string != null && string.contains(componentName.flattenToString())) {
                                b = 0;
                                break;
                            }
                            b = -2;
                            break;
                        }
                    }
                    if ("goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE)) {
                        Log.w(str, "Failed to handle missing VrCore package.");
                    } else if (b == -1) {
                        b(activity, R.string.dialog_vr_core_not_installed, R.string.go_to_playstore_button, new xqu(activity, 11, null));
                    } else if (b == -2) {
                        b(activity, R.string.dialog_vr_core_not_enabled, R.string.go_to_vr_listeners_settings_button, new xqu(activity, 12, null));
                    } else {
                        Log.w(str, "Failed to handle missing VrCore package.");
                    }
                }
            } catch (UnsupportedOperationException e2) {
                Log.w(a, "Failed to set VR mode: ".concat(e2.toString()));
                return false;
            }
        }
        return false;
    }

    private static void b(Context context, int i, int i2, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context, R.style.GvrDialogTheme);
        builder.setMessage(i).setTitle(R.string.dialog_title_warning).setPositiveButton(i2, onClickListener).setNegativeButton(R.string.cancel_button, new xyo(5));
        builder.create().show();
    }
}

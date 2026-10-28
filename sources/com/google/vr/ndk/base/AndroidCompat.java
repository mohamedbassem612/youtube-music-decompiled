package com.google.vr.ndk.base;

import android.app.Activity;
import android.os.PowerManager;
import android.util.Log;
import android.view.Window;
import defpackage.auiw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidCompat {
    private AndroidCompat() {
    }

    public static void setSustainedPerformanceMode(Activity activity, boolean z) {
        String str = auiw.a;
        if (((PowerManager) activity.getSystemService("power")).isSustainedPerformanceModeSupported()) {
            Window window = activity.getWindow();
            if (window == null) {
                Log.e(auiw.a, "Activity does not have a window");
            } else {
                window.setSustainedPerformanceMode(z);
            }
        }
    }

    public static boolean setVrModeEnabled(Activity activity, boolean z) {
        return auiw.a(activity, z);
    }
}

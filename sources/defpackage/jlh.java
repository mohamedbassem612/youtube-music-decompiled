package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jlh {
    public static final long[] a = {0, 50, 50, 50, 50, 50, 50, 75};
    public static final int[] b = {0, 25, 0, 25, 0, 100, 0, 20};
    public static final long[] c = {0, 50, 200, 50};
    public static final int[] d = {0, 100, 0, 25};
    private static final agrf e = agrf.h("com/google/android/apps/youtube/music/util/haptics/HapticsController");
    private Vibrator f;
    private final Context g;

    public jlh(Context context) {
        this.g = context.getApplicationContext();
    }

    public final void a(VibrationEffect vibrationEffect) {
        Vibrator vibrator = this.f;
        if (vibrator == null) {
            vibrator = (Vibrator) this.g.getSystemService("vibrator");
            this.f = vibrator;
        }
        if (vibrator == null || !vibrator.hasVibrator() || Build.VERSION.SDK_INT <= 26) {
            return;
        }
        try {
            vibrator.vibrate(vibrationEffect);
        } catch (RuntimeException e2) {
            ((agrc) ((agrc) ((agrc) e.c()).j(e2)).k("com/google/android/apps/youtube/music/util/haptics/HapticsController", "maybeVibrate", '8', "HapticsController.java")).t("Failed to perform haptic.");
        }
    }

    public final void b() {
        a(Build.VERSION.SDK_INT >= 29 ? VibrationEffect.createPredefined(0) : VibrationEffect.createOneShot(50L, 75));
    }

    public final void c() {
        a(Build.VERSION.SDK_INT >= 29 ? VibrationEffect.createPredefined(2) : VibrationEffect.createOneShot(25L, 25));
    }
}

package com.google.cardboard.sdk.screenparams;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ScreenParamsUtils {

    /* JADX INFO: compiled from: PG */
    public class ScreenPixelDensity {
        public final float xdpi;
        public final float ydpi;

        public ScreenPixelDensity(float f, float f2) {
            this.xdpi = f;
            this.ydpi = f2;
        }
    }

    private ScreenParamsUtils() {
    }

    public static ScreenPixelDensity getScreenPixelDensity(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (isAtLeastR()) {
            context.getDisplay().getMetrics(displayMetrics);
        } else {
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        }
        return new ScreenPixelDensity(displayMetrics.xdpi, displayMetrics.ydpi);
    }

    private static boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }
}

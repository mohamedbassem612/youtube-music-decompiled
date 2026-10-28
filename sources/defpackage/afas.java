package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afas {
    public static final int[] a = {R.attr.state_pressed};
    public static final int[] b = {R.attr.state_focused};
    public static final int[] c = {R.attr.state_selected, R.attr.state_pressed};
    public static final int[] d = {R.attr.state_selected};
    private static final int[] f = {R.attr.state_enabled, R.attr.state_pressed};
    static final String e = "afas";

    private afas() {
    }

    public static int a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return avv.f(colorForState, Math.min(Color.alpha(colorForState) << 1, 255));
    }

    public static ColorStateList b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT > 27 || Color.alpha(colorStateList.getDefaultColor()) != 0 || Color.alpha(colorStateList.getColorForState(f, 0)) == 0) {
            return colorStateList;
        }
        Log.w(e, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        return colorStateList;
    }
}

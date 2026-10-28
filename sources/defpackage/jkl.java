package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jkl {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = {-16842910};
    private static final int[] c = new int[0];

    public static int a(int i, double d) {
        double d2 = d + 1.0d;
        return Color.argb(Color.alpha(i), Math.min(255, (int) (((double) Color.red(i)) * d2)), Math.min(255, (int) (((double) Color.green(i)) * d2)), Math.min(255, (int) (((double) Color.blue(i)) * d2)));
    }

    public static ColorStateList b(int i) {
        int i2 = avv.a;
        return new ColorStateList(new int[][]{b, c}, new int[]{(16777215 & i) | 1426063360, i});
    }

    public static Drawable c(Drawable drawable, int i) {
        if (drawable == null) {
            return null;
        }
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTint(i);
        return drawableMutate;
    }
}

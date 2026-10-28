package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ttk {
    public static final int[] a = {-16842910};
    public static final int[] b = {R.attr.state_focused};
    public static final int[] c = {R.attr.state_activated};
    public static final int[] d = {R.attr.state_pressed};
    public static final int[] e = {R.attr.state_checked};
    public static final int[] f = {R.attr.state_selected};
    public static final int[] g = new int[0];
    public final Context h;
    public final TypedValue i = new TypedValue();

    public ttk(Context context) {
        context.getClass();
        this.h = context;
    }

    public static void a(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (drawable != null) {
            d(drawable, i, mode);
        }
    }

    public static final Drawable b(Drawable drawable, int i) {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        Drawable drawableMutate = drawable.mutate();
        d(drawableMutate, i, mode);
        return drawableMutate;
    }

    public static final Drawable c(Drawable drawable, ColorStateList colorStateList) {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (drawable == null) {
            return null;
        }
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(colorStateList);
        drawableMutate.setTintMode(mode);
        return drawableMutate;
    }

    private static void d(Drawable drawable, int i, PorterDuff.Mode mode) {
        drawable.setTint(i);
        drawable.setTintMode(mode);
    }
}

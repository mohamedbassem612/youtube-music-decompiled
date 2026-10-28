package defpackage;

import android.R;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lx {
    private static final int[] b = {R.attr.state_checked};
    private static final int[] c = new int[0];
    public static final Rect a = new Rect();

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect a(Drawable drawable) {
        Object objA;
        if (Build.VERSION.SDK_INT >= 29) {
            Insets opticalInsets = drawable.getOpticalInsets();
            return new Rect(opticalInsets.left, opticalInsets.top, opticalInsets.right, opticalInsets.bottom);
        }
        if (drawable instanceof awh) {
            objA = drawable;
            objA = ((awh) drawable).a();
        }
        objA = drawable;
        boolean z = lw.a;
        if (Build.VERSION.SDK_INT < 29 && lw.a) {
            try {
                Object objInvoke = lw.b.invoke(objA, null);
                if (objInvoke != null) {
                    return new Rect(lw.c.getInt(objInvoke), lw.d.getInt(objInvoke), lw.e.getInt(objInvoke), lw.f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return a;
    }

    public static void b(Drawable drawable) {
        String name = drawable.getClass().getName();
        if (Build.VERSION.SDK_INT < 29 || Build.VERSION.SDK_INT >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(b);
        } else {
            drawable.setState(c);
        }
        drawable.setState(state);
    }
}

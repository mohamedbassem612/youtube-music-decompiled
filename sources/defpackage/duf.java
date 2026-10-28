package defpackage;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class duf {
    public static final ViewGroup.MarginLayoutParams a;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        a = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public static boolean a(View view) {
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
        if (layoutTransition == null || !layoutTransition.isChangingLayout()) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (!a(viewGroup.getChildAt(i))) {
                }
            }
            return false;
        }
        return true;
    }
}

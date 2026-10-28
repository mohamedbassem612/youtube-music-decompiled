package defpackage;

import android.graphics.Point;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nut {
    public static Point a(View view) {
        ooy ooyVar;
        ViewParent parent = view.getParent();
        while (true) {
            if (parent == null) {
                ooyVar = null;
                break;
            }
            if (parent instanceof ooy) {
                ooyVar = (ooy) parent;
                break;
            }
            parent = parent.getParent();
        }
        if (ooyVar == null || !view.isAttachedToWindow()) {
            return b(view);
        }
        if (!view.isAttachedToWindow()) {
            return b(view);
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr);
        ooyVar.getLocationInWindow(iArr2);
        return new Point((iArr[0] - iArr2[0]) + ooyVar.getScrollX(), (iArr[1] - iArr2[1]) + ooyVar.getScrollY());
    }

    private static Point b(View view) {
        int left = 0;
        int top = 0;
        while (view != null && !(view instanceof ooy)) {
            left += view.getLeft();
            top += view.getTop();
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
            if (!(view instanceof ooy)) {
                left -= view.getScrollX();
                top -= view.getScrollY();
            }
        }
        return new Point(left, top);
    }
}

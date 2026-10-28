package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dxz implements dxy {
    public static final dxz b = new dxz();

    @Override // defpackage.dxy
    public final Rect a(Activity activity) {
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            defaultDisplay.getClass();
            Point pointD = yp.d(defaultDisplay);
            int iE = yp.e(activity);
            if (rect.bottom + iE == pointD.y) {
                rect.bottom += iE;
            } else if (rect.right + iE == pointD.x) {
                rect.right += iE;
            }
        }
        return rect;
    }
}

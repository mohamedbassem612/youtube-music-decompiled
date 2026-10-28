package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zpa extends CoordinatorLayout {
    public View j;
    public zpr k;
    private View l;
    private View m;

    public zpa(Context context) {
        super(context);
        this.k = null;
        this.l = null;
        this.m = null;
    }

    private static int q(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect.top;
    }

    public final void n(View view, View view2) {
        this.l = view;
        this.m = view2;
    }

    public final boolean o() {
        return (this.l == null || this.m == null) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.j;
        if (view == null) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        if (!o()) {
            view.layout(i, i2, i3, i4);
            return;
        }
        int iQ = q(this);
        View view2 = this.l;
        Rect rect = new Rect();
        view2.getGlobalVisibleRect(rect);
        this.j.layout(0, rect.bottom - iQ, getWidth(), q(this.m) - iQ);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (p()) {
            return true;
        }
        performClick();
        return false;
    }

    final boolean p() {
        BottomSheetBehavior bottomSheetBehavior;
        zpr zprVar = this.k;
        if (zprVar == null || (bottomSheetBehavior = zprVar.e) == null || bottomSheetBehavior.F == 5) {
            return false;
        }
        zprVar.d();
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        p();
        return super.performClick();
    }
}

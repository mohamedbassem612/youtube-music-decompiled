package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class orx implements ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ int $cid;
    public View a = null;
    private Rect b = null;
    private Runnable c = null;

    public orx(int i) {
        this.$cid = i;
    }

    public static Rect a(View view) {
        return new Rect(0, 0, view.getWidth(), view.getHeight());
    }

    public static void e(View view) {
        View childAt;
        int iF;
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        view.getWindowVisibleDisplayFrame(rect2);
        if (view.getGlobalVisibleRect(rect) && rect.height() == view.getHeight() && rect2.contains(rect)) {
            return;
        }
        Rect rectA = a(view);
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                View view2 = parent;
                if (rpi.x(view2)) {
                    Rect rectV = rpi.v(rectA, view, view2);
                    Rect rectA2 = a(view2);
                    rectA2.set(rectA2.left + view2.getPaddingLeft(), rectA2.top + view2.getPaddingTop(), rectA2.right - view2.getPaddingRight(), rectA2.bottom - view2.getPaddingBottom());
                    int iHeight = (rectV.top - rectA2.top) - ((int) ((rectA2.height() - rectV.height()) * 0.75f));
                    if (view2 instanceof RecyclerView) {
                        RecyclerView recyclerView = (RecyclerView) view2;
                        iF = f(iHeight, recyclerView.computeVerticalScrollOffset(), recyclerView.computeVerticalScrollRange());
                    } else {
                        iF = (((view2 instanceof ScrollView) || (view2 instanceof NestedScrollView)) && (childAt = ((ViewGroup) view2).getChildAt(0)) != null) ? f(iHeight, view2.getScrollY(), Math.max(0, childAt.getHeight() - ((view2.getHeight() - view2.getPaddingBottom()) - view2.getPaddingTop()))) : 0;
                    }
                    rpi.w(view2, iF);
                    Rect rect3 = new Rect(rectV);
                    rect3.offset(0, -iF);
                    view = view2;
                    rectA = rect3;
                }
            }
        }
    }

    private static int f(int i, int i2, int i3) {
        return i > 0 ? Math.min(i3 - i2, i) : Math.max(i, -i2);
    }

    public final void b(View view) {
        if (this.$cid == 0) {
            if (view != this.a) {
                d();
                view.getViewTreeObserver().addOnGlobalLayoutListener(this);
                this.a = view;
                return;
            }
            return;
        }
        if (view == null || view == this.a) {
            return;
        }
        d();
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.a = view;
    }

    public final void c() {
        Runnable runnable;
        Runnable runnable2;
        int i = this.$cid;
        View view = this.a;
        if (i != 0) {
            if (view != null && (runnable2 = this.c) != null) {
                view.removeCallbacks(runnable2);
            }
            this.c = null;
            return;
        }
        if (view != null && (runnable = this.c) != null) {
            view.removeCallbacks(runnable);
        }
        this.c = null;
    }

    public final void d() {
        if (this.$cid != 0) {
            c();
            View view = this.a;
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            this.a = null;
            return;
        }
        c();
        View view2 = this.a;
        if (view2 != null) {
            view2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        this.a = null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Activity activityU;
        View view;
        Activity activityU2;
        View view2;
        int i = this.$cid;
        View view3 = this.a;
        if (i != 0) {
            if (view3 == null || (activityU2 = rpi.u(view3.getContext())) == null) {
                return;
            }
            Rect rect = new Rect();
            activityU2.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            Rect rect2 = this.b;
            if ((rect2 == null || rect.height() < rect2.height()) && (view2 = this.a) != null) {
                mga mgaVar = new mga(this, 4);
                this.c = mgaVar;
                view2.postDelayed(mgaVar, 200L);
            }
            this.b = rect;
            return;
        }
        if (view3 == null || (activityU = rpi.u(view3.getContext())) == null) {
            return;
        }
        Rect rect3 = new Rect();
        activityU.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect3);
        Rect rect4 = this.b;
        if ((rect4 == null || rect3.height() < rect4.height()) && (view = this.a) != null) {
            ooz oozVar = new ooz(this, 5);
            this.c = oozVar;
            view.postDelayed(oozVar, 200L);
        }
        this.b = rect3;
    }
}

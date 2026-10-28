package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aevh extends bdq {
    final /* synthetic */ SwipeDismissBehavior a;
    private int b;
    private int c = -1;

    public aevh(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    @Override // defpackage.bdq
    public final int a(View view) {
        return view.getWidth();
    }

    @Override // defpackage.bdq
    public final void c(View view, int i) {
        this.c = i;
        this.b = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.a;
            swipeDismissBehavior.h = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.h = false;
        }
    }

    @Override // defpackage.bdq
    public final void d(int i) {
        aevj aevjVar = this.a.g;
        if (aevjVar != null) {
            aevjVar.b(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    @Override // defpackage.bdq
    public final void e(View view, float f, float f2) {
        int i;
        int left;
        int i2;
        aevj aevjVar;
        this.c = -1;
        int width = view.getWidth();
        boolean z = true;
        if (f != 0.0f) {
            int layoutDirection = view.getLayoutDirection();
            int i3 = this.a.i;
            if (i3 != 2 && (i3 != 0 ? layoutDirection != 1 ? f >= 0.0f : f <= 0.0f : layoutDirection != 1 ? f <= 0.0f : f >= 0.0f)) {
                i = this.b;
                z = false;
            } else if (f >= 0.0f) {
                left = view.getLeft();
                i2 = this.b;
                if (left >= i2) {
                    i = i2 + width;
                } else {
                    i = this.b - width;
                }
            } else {
                i = this.b - width;
            }
        } else {
            if (Math.abs(view.getLeft() - this.b) < Math.round(view.getWidth() * 0.5f)) {
                i = this.b;
                z = false;
            } else if (f >= 0.0f) {
                left = view.getLeft();
                i2 = this.b;
                if (left >= i2) {
                    i = i2 + width;
                } else {
                    i = this.b - width;
                }
            } else {
                i = this.b - width;
            }
        }
        SwipeDismissBehavior swipeDismissBehavior = this.a;
        if (swipeDismissBehavior.f.i(i, view.getTop())) {
            view.postOnAnimation(new aevk(swipeDismissBehavior, view, z));
        } else {
            if (!z || (aevjVar = swipeDismissBehavior.g) == null) {
                return;
            }
            aevjVar.a(view);
        }
    }

    @Override // defpackage.bdq
    public final boolean f(View view, int i) {
        int i2 = this.c;
        return (i2 == -1 || i2 == i) && this.a.q(view);
    }

    @Override // defpackage.bdq
    public final int g(View view, int i) {
        int width;
        int width2;
        int width3;
        int layoutDirection = view.getLayoutDirection();
        int i2 = this.a.i;
        if (i2 == 0) {
            width = this.b;
            if (layoutDirection == 1) {
                width -= view.getWidth();
                width2 = this.b;
            } else {
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 == 1) {
            width = this.b;
            if (layoutDirection == 1) {
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width -= view.getWidth();
                width2 = this.b;
            }
        } else {
            width = this.b - view.getWidth();
            width2 = this.b + view.getWidth();
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.bdq
    public final int h(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.bdq
    public final void i(View view, int i, int i2, int i3) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.a;
        float f = width * swipeDismissBehavior.j;
        float width2 = view.getWidth() * swipeDismissBehavior.k;
        float fAbs = Math.abs(i - this.b);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(SwipeDismissBehavior.u(1.0f - ((fAbs - f) / (width2 - f))));
        }
    }
}

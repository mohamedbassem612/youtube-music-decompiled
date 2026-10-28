package defpackage;

import android.os.SystemClock;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aevo extends bdq {
    final /* synthetic */ BottomSheetBehavior a;

    public aevo(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // defpackage.bdq
    public final int b(View view) {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        return bottomSheetBehavior.N() ? bottomSheetBehavior.I : bottomSheetBehavior.A;
    }

    @Override // defpackage.bdq
    public final void d(int i) {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.a;
            if (bottomSheetBehavior.E) {
                bottomSheetBehavior.J(1);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cd  */
    @Override // defpackage.bdq
    public final void e(View view, float f, float f2) {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        int i = 6;
        if (f2 < 0.0f) {
            if (bottomSheetBehavior.f) {
                i = 3;
            } else {
                int top = view.getTop();
                SystemClock.uptimeMillis();
                if (top <= bottomSheetBehavior.y) {
                    i = 3;
                }
            }
        } else if (bottomSheetBehavior.C && bottomSheetBehavior.P(view, f2)) {
            if ((Math.abs(f) < Math.abs(f2) && f2 > bottomSheetBehavior.g) || view.getTop() > (bottomSheetBehavior.I + bottomSheetBehavior.t()) / 2) {
                i = 5;
            } else if (bottomSheetBehavior.f || Math.abs(view.getTop() - bottomSheetBehavior.t()) < Math.abs(view.getTop() - bottomSheetBehavior.y)) {
                i = 3;
            }
        } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
            int top2 = view.getTop();
            if (!bottomSheetBehavior.f) {
                int i2 = bottomSheetBehavior.y;
                if (top2 < i2) {
                    if (top2 < Math.abs(top2 - bottomSheetBehavior.A)) {
                        i = 3;
                    }
                } else if (Math.abs(top2 - i2) >= Math.abs(top2 - bottomSheetBehavior.A)) {
                    i = 4;
                }
            } else if (Math.abs(top2 - bottomSheetBehavior.x) < Math.abs(top2 - bottomSheetBehavior.A)) {
                i = 3;
            } else {
                i = 4;
            }
        } else if (bottomSheetBehavior.f) {
            i = 4;
        } else {
            int top3 = view.getTop();
            if (Math.abs(top3 - bottomSheetBehavior.y) >= Math.abs(top3 - bottomSheetBehavior.A)) {
                i = 4;
            }
        }
        this.a.L(view, i, true);
    }

    @Override // defpackage.bdq
    public final boolean f(View view, int i) {
        View viewW;
        BottomSheetBehavior bottomSheetBehavior = this.a;
        int i2 = bottomSheetBehavior.F;
        if (i2 == 1 || bottomSheetBehavior.N) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.L == i) {
            if (bottomSheetBehavior.h) {
                WeakReference weakReference = bottomSheetBehavior.M;
                viewW = weakReference != null ? (View) weakReference.get() : null;
            } else {
                viewW = bottomSheetBehavior.w();
            }
            if (viewW != null && viewW.canScrollVertically(-1)) {
                return false;
            }
        }
        SystemClock.uptimeMillis();
        WeakReference weakReference2 = bottomSheetBehavior.J;
        return weakReference2 != null && weakReference2.get() == view;
    }

    @Override // defpackage.bdq
    public final int g(View view, int i) {
        return view.getLeft();
    }

    @Override // defpackage.bdq
    public final int h(View view, int i) {
        return ast.c(i, this.a.t(), b(view));
    }

    @Override // defpackage.bdq
    public final void i(View view, int i, int i2, int i3) {
        this.a.A(i2);
    }
}

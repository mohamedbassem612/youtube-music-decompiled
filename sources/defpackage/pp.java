package defpackage;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class pp {
    private int a = -1;

    public static int b(int i, int i2) {
        int i3 = i & 789516;
        if (i3 == 0) {
            return i;
        }
        int i4 = i & (~i3);
        if (i2 != 0) {
            int i5 = i3 << 1;
            i4 |= (-789517) & i5;
            i3 = i5 & 789516;
        }
        return i4 | (i3 << 2);
    }

    public static final int m(int i, int i2) {
        int i3 = i & 3158064;
        if (i3 == 0) {
            return i;
        }
        int i4 = i & (~i3);
        if (i2 != 0) {
            int i5 = i3 >> 1;
            i4 |= (-3158065) & i5;
            i3 = i5 & 3158064;
        }
        return i4 | (i3 >> 2);
    }

    public float a(oh ohVar) {
        return 0.5f;
    }

    final int c(RecyclerView recyclerView, oh ohVar) {
        return m(i(ohVar), recyclerView.getLayoutDirection());
    }

    public void d(RecyclerView recyclerView, oh ohVar) {
        om.b(ohVar.a);
    }

    public void e(Canvas canvas, RecyclerView recyclerView, oh ohVar, float f, float f2, int i, boolean z) {
        om.c(recyclerView, ohVar.a, f, f2, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f(RecyclerView recyclerView, oh ohVar, int i, oh ohVar2, int i2, int i3, int i4) {
        np npVar = recyclerView.n;
        if (npVar instanceof pu) {
            ((pu) npVar).prepareForDrop(ohVar.a, ohVar2.a, i3, i4);
            return;
        }
        if (npVar.canScrollHorizontally()) {
            View view = ohVar2.a;
            if (npVar.getDecoratedLeft(view) <= recyclerView.getPaddingLeft()) {
                recyclerView.ab(i2);
            }
            if (npVar.getDecoratedRight(view) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                recyclerView.ab(i2);
            }
        }
        if (npVar.canScrollVertically()) {
            View view2 = ohVar2.a;
            if (npVar.getDecoratedTop(view2) <= recyclerView.getPaddingTop()) {
                recyclerView.ab(i2);
            }
            if (npVar.getDecoratedBottom(view2) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                recyclerView.ab(i2);
            }
        }
    }

    final boolean g(RecyclerView recyclerView, oh ohVar) {
        return (c(recyclerView, ohVar) & 16711680) != 0;
    }

    public abstract boolean h(RecyclerView recyclerView, oh ohVar, oh ohVar2);

    public abstract int i(oh ohVar);

    public final int j(RecyclerView recyclerView, int i, int i2, long j) {
        int dimensionPixelSize = this.a;
        if (dimensionPixelSize == -1) {
            dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            this.a = dimensionPixelSize;
        }
        int iAbs = Math.abs(i2);
        int iSignum = (int) Math.signum(i2);
        float fMin = Math.min(1.0f, iAbs / i) - 1.0f;
        float f = j > 2000 ? 1.0f : j / 2000.0f;
        int i3 = (int) (((int) (iSignum * dimensionPixelSize * ((fMin * fMin * fMin * fMin * fMin) + 1.0f))) * f * f * f * f * f);
        if (i3 == 0) {
            return i2 > 0 ? 1 : -1;
        }
        return i3;
    }

    public void l() {
        throw null;
    }

    public abstract void o(oh ohVar);

    public void k() {
    }

    public void n(oh ohVar) {
    }

    public void p(oh ohVar) {
    }

    public void q(oh ohVar) {
    }
}

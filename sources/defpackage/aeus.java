package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class aeus extends aeuu {
    private int overlayTop;
    public final Rect tempRect1;
    final Rect tempRect2;
    private int verticalLayoutGap;

    public aeus() {
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }

    private static int resolveGravity(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    public abstract View findFirstDependency(List list);

    public final int getOverlapPixelsForOffset(View view) {
        if (this.overlayTop == 0) {
            return 0;
        }
        float overlapRatioForOffset = getOverlapRatioForOffset(view);
        int i = this.overlayTop;
        int i2 = (int) (overlapRatioForOffset * i);
        if (i2 >= 0) {
            return i2 <= i ? i2 : i;
        }
        return 0;
    }

    public float getOverlapRatioForOffset(View view) {
        return 1.0f;
    }

    public final int getOverlayTop() {
        return this.overlayTop;
    }

    public int getScrollRange(View view) {
        return view.getMeasuredHeight();
    }

    public final int getVerticalLayoutGap() {
        return this.verticalLayoutGap;
    }

    @Override // defpackage.aeuu
    protected void layoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        View viewFindFirstDependency = findFirstDependency(coordinatorLayout.a(view));
        if (viewFindFirstDependency == null) {
            super.layoutChild(coordinatorLayout, view, i);
            this.verticalLayoutGap = 0;
            return;
        }
        asv asvVar = (asv) view.getLayoutParams();
        Rect rect = this.tempRect1;
        rect.set(coordinatorLayout.getPaddingLeft() + asvVar.leftMargin, viewFindFirstDependency.getBottom() + asvVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - asvVar.rightMargin, ((coordinatorLayout.getHeight() + viewFindFirstDependency.getBottom()) - coordinatorLayout.getPaddingBottom()) - asvVar.bottomMargin);
        bbn bbnVar = coordinatorLayout.e;
        if (bbnVar != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left += bbnVar.b();
            rect.right -= bbnVar.c();
        }
        Rect rect2 = this.tempRect2;
        Gravity.apply(resolveGravity(asvVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int overlapPixelsForOffset = getOverlapPixelsForOffset(viewFindFirstDependency);
        view.layout(rect2.left, rect2.top - overlapPixelsForOffset, rect2.right, rect2.bottom - overlapPixelsForOffset);
        this.verticalLayoutGap = rect2.top - viewFindFirstDependency.getBottom();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    @Override // defpackage.ast
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View viewFindFirstDependency;
        int size;
        int scrollRange;
        int measuredHeight;
        int i5;
        bbn bbnVar;
        int i6 = view.getLayoutParams().height;
        if (i6 == -1) {
            viewFindFirstDependency = findFirstDependency(coordinatorLayout.a(view));
            if (viewFindFirstDependency != null) {
                size = View.MeasureSpec.getSize(i3);
                if (size > 0) {
                    size = coordinatorLayout.getHeight();
                } else if (viewFindFirstDependency.getFitsSystemWindows() && (bbnVar = coordinatorLayout.e) != null) {
                    size += bbnVar.d() + bbnVar.a();
                }
                scrollRange = size + getScrollRange(viewFindFirstDependency);
                measuredHeight = viewFindFirstDependency.getMeasuredHeight();
                if (shouldHeaderOverlapScrollingChild()) {
                    view.setTranslationY(-measuredHeight);
                } else {
                    view.setTranslationY(0.0f);
                    scrollRange -= measuredHeight;
                }
                if (i6 == -1) {
                    i5 = 1073741824;
                } else {
                    i5 = Integer.MIN_VALUE;
                }
                coordinatorLayout.k(view, i, i2, View.MeasureSpec.makeMeasureSpec(scrollRange, i5), i4);
                return true;
            }
        } else if (i6 == -2) {
            i6 = -2;
            viewFindFirstDependency = findFirstDependency(coordinatorLayout.a(view));
            if (viewFindFirstDependency != null) {
                size = View.MeasureSpec.getSize(i3);
                if (size > 0) {
                    size = coordinatorLayout.getHeight();
                } else if (viewFindFirstDependency.getFitsSystemWindows()) {
                    size += bbnVar.d() + bbnVar.a();
                }
                scrollRange = size + getScrollRange(viewFindFirstDependency);
                measuredHeight = viewFindFirstDependency.getMeasuredHeight();
                if (shouldHeaderOverlapScrollingChild()) {
                    view.setTranslationY(-measuredHeight);
                } else {
                    view.setTranslationY(0.0f);
                    scrollRange -= measuredHeight;
                }
                if (i6 == -1) {
                    i5 = 1073741824;
                } else {
                    i5 = Integer.MIN_VALUE;
                }
                coordinatorLayout.k(view, i, i2, View.MeasureSpec.makeMeasureSpec(scrollRange, i5), i4);
                return true;
            }
        }
        return false;
    }

    public final void setOverlayTop(int i) {
        this.overlayTop = i;
    }

    protected boolean shouldHeaderOverlapScrollingChild() {
        return false;
    }

    public aeus(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }
}

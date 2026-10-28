package defpackage;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xcm extends qa {
    public xcm() {
        super((byte[]) null);
    }

    @Override // defpackage.qa
    public final void n(Canvas canvas, RecyclerView recyclerView) {
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            View childAt = recyclerView.getChildAt(i);
            float measuredHeight = recyclerView.getMeasuredHeight();
            int top = (childAt.getTop() + childAt.getBottom()) / 2;
            int i2 = (int) (measuredHeight * 0.3f);
            float f = top < i2 ? ((top * 0.7f) / i2) + 0.2f : 0.9f;
            childAt.getContext();
            childAt.setAlpha(f);
            childAt.animate().setStartDelay(6000L).alpha(0.0f).setDuration(4000L).start();
        }
    }
}

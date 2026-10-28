package com.google.android.apps.youtube.music.ui.refresh;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.tabs.TabbedView;
import defpackage.bac;
import defpackage.jhq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class MusicSwipeRefreshLayout extends SwipeRefreshLayout {
    private final int k;
    private float l;
    private boolean m;
    private View n;

    public MusicSwipeRefreshLayout(Context context) {
        super(context);
        this.k = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    private final boolean p(View view) {
        RecyclerView recyclerView = (RecyclerView) view;
        return super.canScrollVertically(-1) || (recyclerView.getChildAt(0) != null && recyclerView.getChildAt(0).getTop() < recyclerView.getPaddingTop());
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        super.addView(view);
        i(getContext().getColor(new int[]{R.color.quantum_black_100}[0]));
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout
    public final boolean o() {
        if (this.n == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!(childAt instanceof ImageView)) {
                    this.n = childAt;
                    break;
                }
            }
        }
        View view = this.n;
        if (!(view instanceof TabbedView)) {
            return view instanceof RecyclerView ? p(view) : super.o();
        }
        TabbedView tabbedView = (TabbedView) view;
        View view2 = null;
        if (tabbedView.h() >= 0 && tabbedView.h() < tabbedView.a.c().size()) {
            view2 = ((jhq) tabbedView.a.c().get(tabbedView.h())).c;
        }
        if (view2 == null) {
            return true;
        }
        if (view2 instanceof RecyclerView) {
            return p(view2);
        }
        int i2 = bac.a;
        return view2.canScrollVertically(-1);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int iFindPointerIndex = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
        if (iFindPointerIndex < 0) {
            return false;
        }
        if (actionMasked == 0) {
            this.l = motionEvent.getX(iFindPointerIndex);
            this.m = false;
        } else if (actionMasked == 1) {
            this.m = false;
        } else if (actionMasked != 2) {
            if (actionMasked == 6) {
                this.m = false;
            }
        } else {
            if (this.m) {
                return false;
            }
            if (Math.abs(motionEvent.getX(iFindPointerIndex) - this.l) > this.k) {
                this.m = true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public MusicSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}

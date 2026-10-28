package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ftl extends SwipeRefreshLayout implements fiv {
    public static final /* synthetic */ int o = 0;
    public final fjw k;
    public final RecyclerView l;
    public boolean m;
    public nl n;
    private heg p;

    public ftl(Context context, RecyclerView recyclerView) {
        super(context);
        this.m = false;
        this.l = recyclerView;
        recyclerView.ae(new ftk());
        recyclerView.ag(0);
        addView(recyclerView);
        fjw fjwVar = new fjw(new fhd(getContext(), null, null, null));
        this.k = fjwVar;
        fjwVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(fjwVar);
    }

    @Override // defpackage.fiv
    public final void a(List list) {
        list.add(this.k);
        RecyclerView recyclerView = this.l;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt instanceof fjw) {
                list.add((fjw) childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        heg hegVar = this.p;
        if (hegVar != null) {
            hegVar.h(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m = true;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        fjw fjwVar = this.k;
        if (fjwVar.getVisibility() != 8) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            fjwVar.layout(paddingLeft, paddingTop, fjwVar.getMeasuredWidth() + paddingLeft, fjwVar.getMeasuredHeight() + paddingTop);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        q(View.MeasureSpec.getSize(i));
    }

    public final void p() {
        fjw fjwVar = this.k;
        fjwVar.O();
        fjwVar.setVisibility(8);
    }

    public final void q(int i) {
        measureChild(this.k, View.MeasureSpec.makeMeasureSpec(i, 1073741824), 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (getParent() == null || isNestedScrollingEnabled()) {
            return;
        }
        getParent().requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.l.setOnTouchListener(onTouchListener);
    }

    @Override // defpackage.fit
    public final heg x() {
        return this.p;
    }

    @Override // defpackage.fit
    public final void y(heg hegVar) {
        this.p = hegVar;
    }
}

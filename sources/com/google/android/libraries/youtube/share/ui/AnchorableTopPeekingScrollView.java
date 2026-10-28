package com.google.android.libraries.youtube.share.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.TopPeekingScrollView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class AnchorableTopPeekingScrollView extends TopPeekingScrollView {
    public boolean n;
    public int o;
    public int p;

    public AnchorableTopPeekingScrollView(Context context) {
        this(context, null);
    }

    public final void g(boolean z) {
        if (this.n && !z) {
            z = false;
            this.p = 0;
            b(0, this.k);
            e(0);
        }
        this.n = z;
    }

    @Override // com.google.android.libraries.youtube.common.ui.TopPeekingScrollView, defpackage.ttz, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.n && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.google.android.libraries.youtube.common.ui.TopPeekingScrollView, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!this.n) {
            super.onLayout(z, i, i2, i3, i4);
        } else if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int i5 = i3 - i;
            childAt.layout((i5 - childAt.getMeasuredWidth()) / 2, i2 + this.k, ((i5 - childAt.getMeasuredWidth()) / 2) + childAt.getMeasuredWidth(), i4);
        }
    }

    @Override // com.google.android.libraries.youtube.common.ui.TopPeekingScrollView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        this.o = measuredHeight;
        if (!this.n || (i3 = this.p) == 0) {
            return;
        }
        int i4 = this.k;
        int iMin = Math.min((i3 + (i4 << 1)) - measuredHeight, i4);
        b(iMin, iMin);
        if (this.j.isFinished()) {
            a(iMin);
        }
    }

    @Override // com.google.android.libraries.youtube.common.ui.TopPeekingScrollView, defpackage.ttz, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.n && super.onTouchEvent(motionEvent);
    }

    public AnchorableTopPeekingScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AnchorableTopPeekingScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

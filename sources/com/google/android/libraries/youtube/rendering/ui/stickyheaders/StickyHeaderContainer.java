package com.google.android.libraries.youtube.rendering.ui.stickyheaders;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;
import defpackage.aedy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class StickyHeaderContainer extends FrameLayout {
    private final RecyclerView a;
    private boolean b;
    private boolean c;
    private MotionEvent d;

    public StickyHeaderContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aedy.a, i, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, R.layout.recycler_view);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(resourceId, this);
        this.a = (RecyclerView) getChildAt(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        RecyclerView recyclerView;
        MotionEvent motionEvent2 = this.d;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.d = MotionEvent.obtain(motionEvent);
        boolean z = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.b = false;
            }
            return (z || (recyclerView = this.a) == null) ? super.dispatchTouchEvent(motionEvent) : recyclerView.dispatchTouchEvent(motionEvent);
        }
        this.b = true;
        this.c = false;
        if (z) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MotionEvent motionEvent = this.d;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.d = null;
        }
        this.b = false;
        this.c = false;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        RecyclerView recyclerView;
        super.onViewRemoved(view);
        if (!this.b || view == (recyclerView = this.a) || recyclerView == null) {
            return;
        }
        this.c = true;
        MotionEvent motionEvent = this.d;
        if (motionEvent != null) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(0);
            recyclerView.dispatchTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    public StickyHeaderContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}

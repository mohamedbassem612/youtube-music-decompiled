package com.google.android.libraries.youtube.share.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.mhd;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ConnectionSectionRecyclerView extends RecyclerView {
    private final mhd ae;

    public ConnectionSectionRecyclerView(Context context) {
        super(context);
        this.ae = new mhd(this, false);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (canScrollHorizontally(1) || canScrollHorizontally(-1)) {
            this.ae.a(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public ConnectionSectionRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ae = new mhd(this, false);
    }
}

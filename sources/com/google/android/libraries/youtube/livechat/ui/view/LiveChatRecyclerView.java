package com.google.android.libraries.youtube.livechat.ui.view;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.android.libraries.youtube.livechat.ui.common.WrappedLinearLayoutManager;
import defpackage.np;
import defpackage.xcm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class LiveChatRecyclerView extends RecyclerView {
    private final xcm ae;
    private float af;
    private float ag;

    public LiveChatRecyclerView(Context context) {
        super(context);
        xcm xcmVar = new xcm();
        this.ae = xcmVar;
        aJ(xcmVar);
        af(null);
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void ah(np npVar) {
        super.ah(npVar);
        if (npVar instanceof WrappedLinearLayoutManager) {
            ((WrappedLinearLayoutManager) npVar).setStackFromEnd(true);
        } else if (npVar instanceof LinearLayoutManager) {
            ((LinearLayoutManager) npVar).setStackFromEnd(true);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.af = motionEvent.getX();
            this.ag = motionEvent.getY();
        } else if (actionMasked == 1) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float f = this.af - x;
            float f2 = this.ag - y;
            float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
            if ((f * f) + (f2 * f2) < scaledTouchSlop * scaledTouchSlop) {
                performClick();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public LiveChatRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        xcm xcmVar = new xcm();
        this.ae = xcmVar;
        aJ(xcmVar);
        af(null);
    }

    public LiveChatRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        xcm xcmVar = new xcm();
        this.ae = xcmVar;
        aJ(xcmVar);
        af(null);
    }
}

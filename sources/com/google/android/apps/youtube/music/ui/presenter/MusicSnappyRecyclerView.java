package com.google.android.apps.youtube.music.ui.presenter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.np;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class MusicSnappyRecyclerView extends RecyclerView {
    public MusicSnappyRecyclerView(Context context) {
        super(context);
    }

    @Override // android.support.v7.widget.RecyclerView
    public final boolean aq(int i, int i2) {
        np npVar = this.n;
        if (!(npVar instanceof MusicSnappyGridLayoutManager)) {
            return super.aq(i, i2);
        }
        MusicSnappyGridLayoutManager musicSnappyGridLayoutManager = (MusicSnappyGridLayoutManager) npVar;
        if (musicSnappyGridLayoutManager.k == 3) {
            i = i2;
        }
        aj(musicSnappyGridLayoutManager.c(i));
        return true;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        np npVar = this.n;
        if (npVar instanceof MusicSnappyGridLayoutManager) {
            MusicSnappyGridLayoutManager musicSnappyGridLayoutManager = (MusicSnappyGridLayoutManager) npVar;
            if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.F == 0) {
                aj(musicSnappyGridLayoutManager.c(0));
            }
        }
        return zOnTouchEvent;
    }

    public MusicSnappyRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusicSnappyRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

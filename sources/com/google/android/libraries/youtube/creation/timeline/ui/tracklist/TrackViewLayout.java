package com.google.android.libraries.youtube.creation.timeline.ui.tracklist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class TrackViewLayout extends LinearLayout {
    public TrackViewLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getAction() != 0;
    }

    public TrackViewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TrackViewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

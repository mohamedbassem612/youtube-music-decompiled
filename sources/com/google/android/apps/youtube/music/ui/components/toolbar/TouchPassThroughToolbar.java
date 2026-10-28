package com.google.android.apps.youtube.music.ui.components.toolbar;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class TouchPassThroughToolbar extends Toolbar {
    public boolean C;

    public TouchPassThroughToolbar(Context context) {
        super(context);
        this.C = false;
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.C) {
            return false;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    public TouchPassThroughToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = false;
    }

    public TouchPassThroughToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.C = false;
    }
}

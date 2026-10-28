package com.google.android.libraries.youtube.creation.videoeffects.stickers.text;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class VerticalSeekBar extends SeekBar {
    public VerticalSeekBar(Context context) {
        super(context);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(Canvas canvas) {
        canvas.rotate(-90.0f);
        canvas.translate(-getHeight(), 0.0f);
        super.onDraw(canvas);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i2, i);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i2, i, i4, i3);
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0 || action == 1 || action == 2) {
            setProgress((int) (getMax() * (1.0f - (motionEvent.getY() / getHeight()))));
            super.onSizeChanged(getHeight(), getWidth(), 0, 0);
            super.performClick();
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setProgress(int i) {
        super.setProgress(i);
        super.onSizeChanged(getHeight(), getWidth(), 0, 0);
    }

    public VerticalSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VerticalSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public VerticalSeekBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

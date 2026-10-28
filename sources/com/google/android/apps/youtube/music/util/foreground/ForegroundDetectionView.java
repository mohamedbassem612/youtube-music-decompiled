package com.google.android.apps.youtube.music.util.foreground;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ForegroundDetectionView extends View {
    public ForegroundDetectionFragment a;

    public ForegroundDetectionView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        ForegroundDetectionFragment foregroundDetectionFragment;
        super.onAttachedToWindow();
        if (!Build.HARDWARE.contains("goldfish") || (foregroundDetectionFragment = this.a) == null) {
            return;
        }
        foregroundDetectionFragment.a(1);
        this.a = null;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ForegroundDetectionFragment foregroundDetectionFragment = this.a;
        if (foregroundDetectionFragment != null) {
            foregroundDetectionFragment.a(1);
            this.a = null;
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(1, 1);
    }

    public ForegroundDetectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

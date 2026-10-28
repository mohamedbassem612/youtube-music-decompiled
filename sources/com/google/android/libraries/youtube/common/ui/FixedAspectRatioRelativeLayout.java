package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.car.app.model.Alert;
import defpackage.ttv;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class FixedAspectRatioRelativeLayout extends RelativeLayout {
    private final float a;
    private boolean b;
    private final int c;
    private final int d;

    public FixedAspectRatioRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ttv.d);
        this.a = typedArrayObtainStyledAttributes.getFraction(0, 1, 1, 1.0f);
        this.b = typedArrayObtainStyledAttributes.getBoolean(1, false);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, Alert.DURATION_SHOW_INDEFINITELY);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Alert.DURATION_SHOW_INDEFINITELY);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.b) {
            super.onMeasure(i, i2);
            return;
        }
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            int iMin = Math.min(this.c, View.MeasureSpec.getSize(i));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (iMin / this.a), 1073741824));
        } else if (View.MeasureSpec.getMode(i2) != 1073741824) {
            super.onMeasure(i, i2);
        } else {
            int iMin2 = Math.min(this.d, View.MeasureSpec.getSize(i2));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (iMin2 * this.a), 1073741824), View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824));
        }
    }

    public FixedAspectRatioRelativeLayout(Context context) {
        super(context);
        this.a = 1.0f;
        this.c = Alert.DURATION_SHOW_INDEFINITELY;
        this.d = Alert.DURATION_SHOW_INDEFINITELY;
    }
}

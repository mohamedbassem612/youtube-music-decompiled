package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.ttv;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class FixedAspectRatioFrameLayout extends FrameLayout {
    public float a;

    public FixedAspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ttv.c);
        this.a = typedArrayObtainStyledAttributes.getFraction(0, 1, 1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) / this.a), 1073741824));
        } else if (View.MeasureSpec.getMode(i2) == 1073741824) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i2) * this.a), 1073741824), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }

    public FixedAspectRatioFrameLayout(Context context) {
        super(context);
        this.a = 1.0f;
    }
}

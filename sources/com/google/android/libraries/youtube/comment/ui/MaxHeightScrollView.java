package com.google.android.libraries.youtube.comment.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import defpackage.sqt;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class MaxHeightScrollView extends ScrollView {
    private int a;

    public MaxHeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, sqt.a, 0, 0);
        try {
            this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            i2 = Math.min(View.MeasureSpec.makeMeasureSpec(this.a, Integer.MIN_VALUE), i2);
        }
        super.onMeasure(i, i2);
    }
}

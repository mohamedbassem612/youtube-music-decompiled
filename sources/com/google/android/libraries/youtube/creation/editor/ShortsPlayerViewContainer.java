package com.google.android.libraries.youtube.creation.editor;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.ulx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class ShortsPlayerViewContainer extends FrameLayout {
    public boolean a;
    public ulx b;
    private int c;
    private int d;

    public ShortsPlayerViewContainer(Context context) {
        this(context, null);
    }

    private final void a(int i, int i2) {
        ShortsPlayerViewContainer shortsPlayerViewContainer;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        int i3 = 0;
        while (i3 < this.getChildCount()) {
            View childAt = this.getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                shortsPlayerViewContainer = this;
                shortsPlayerViewContainer.measureChildWithMargins(childAt, iMakeMeasureSpec, 0, iMakeMeasureSpec2, 0);
            } else {
                shortsPlayerViewContainer = this;
            }
            i3++;
            this = shortsPlayerViewContainer;
        }
        this.setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        Size size;
        ulx ulxVar = this.b;
        if (ulxVar == null) {
            super.onMeasure(i, i2);
            if (this.a) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.c, 1073741824), View.MeasureSpec.makeMeasureSpec(this.d, 1073741824));
                return;
            }
            int measuredHeight = getMeasuredHeight();
            int measuredWidth = getMeasuredWidth();
            float f = measuredWidth;
            float f2 = measuredHeight;
            if (f / f2 < 0.5625f) {
                measuredHeight = Math.round(f / 0.5625f);
            } else {
                measuredWidth = Math.round(f2 * 0.5625f);
            }
            this.c = measuredWidth;
            this.d = measuredHeight;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            return;
        }
        if (this.a) {
            a(this.c, this.d);
            return;
        }
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        float f3 = size2;
        float f4 = size3;
        float f5 = ulxVar.b;
        if (f5 == -1.0f) {
            size = new Size(size2, size3);
        } else {
            if (f3 / f4 < f5) {
                size3 = Math.round(f3 / f5);
            } else {
                size2 = Math.round(f4 * f5);
            }
            size = new Size(size2, size3);
        }
        this.c = size.getWidth();
        this.d = size.getHeight();
        a(size.getWidth(), size.getHeight());
    }

    public ShortsPlayerViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShortsPlayerViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

package com.google.android.libraries.youtube.creation.editor;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ulx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class ShortsPlayerImageView extends AppCompatImageView {
    public float a;
    public ulx b;

    public ShortsPlayerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 0.0f;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        ulx ulxVar = this.b;
        if (ulxVar == null || ulxVar.i == 1 || this.a == 0.0f) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        ulx ulxVar2 = this.b;
        if (this.a > (ulxVar2 != null ? ulxVar2.b : 1.0f)) {
            size2 = Math.round(View.MeasureSpec.getSize(i2) * this.a);
        } else {
            size = Math.round(View.MeasureSpec.getSize(i) / this.a);
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            layoutParams.height = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            setLayoutParams(layoutParams);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    public ShortsPlayerImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShortsPlayerImageView(Context context) {
        this(context, null);
    }
}

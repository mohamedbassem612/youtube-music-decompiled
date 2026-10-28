package com.google.android.material.slider;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.afcd;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class Slider extends afcd {
    public Slider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.value});
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            r(typedArrayObtainStyledAttributes.getFloat(0, 0.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // defpackage.afcd
    protected final void p() {
        if (this.j == -1) {
            this.j = 0;
        }
    }

    public final float q() {
        return ((Float) d().get(0)).floatValue();
    }

    public final void r(float f) {
        h(Float.valueOf(f));
    }

    public Slider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.youtube.music.R.attr.sliderStyle);
    }

    public Slider(Context context) {
        this(context, null);
    }
}

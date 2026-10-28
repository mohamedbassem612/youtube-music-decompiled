package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import defpackage.aewn;
import defpackage.aeym;
import defpackage.afba;
import defpackage.afbe;
import defpackage.afev;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class MaterialDivider extends View {
    private final afbe a;
    private int b;
    private int c;
    private int d;
    private int e;

    public MaterialDivider(Context context, AttributeSet attributeSet, int i) {
        super(afev.a(context, attributeSet, i, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, i);
        Context context2 = getContext();
        afbe afbeVar = new afbe();
        this.a = afbeVar;
        TypedArray typedArrayA = aeym.a(context2, attributeSet, aewn.a, i, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.b = typedArrayA.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.d = typedArrayA.getDimensionPixelOffset(2, 0);
        this.e = typedArrayA.getDimensionPixelOffset(1, 0);
        int defaultColor = afba.f(context2, typedArrayA, 0).getDefaultColor();
        if (this.c != defaultColor) {
            this.c = defaultColor;
            afbeVar.q(ColorStateList.valueOf(defaultColor));
            invalidate();
        }
        typedArrayA.recycle();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int i;
        int width;
        int i2;
        super.onDraw(canvas);
        if (getLayoutDirection() == 1) {
            i = this.e;
            width = getWidth();
            i2 = this.d;
        } else {
            i = this.d;
            width = getWidth();
            i2 = this.e;
        }
        int i3 = width - i2;
        afbe afbeVar = this.a;
        afbeVar.setBounds(i, 0, i3, getBottom() - getTop());
        afbeVar.draw(canvas);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.b;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialDividerStyle);
    }

    public MaterialDivider(Context context) {
        this(context, null);
    }
}

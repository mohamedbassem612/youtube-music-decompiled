package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;
import defpackage.bac;
import defpackage.ttv;
import defpackage.twm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class RoundedLinearLayout extends LinearLayout {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final RectF e;
    private final Path f;
    private final Paint g;
    private float[] h;

    public RoundedLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ttv.f);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, twm.c(displayMetrics, 16));
        this.e = new RectF();
        this.f = new Path();
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, dimensionPixelSize);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, dimensionPixelSize);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (color == 0 || dimensionPixelSize2 <= 0) {
            this.g = null;
            return;
        }
        Paint paint = new Paint();
        this.g = paint;
        paint.setColor(color);
        paint.setStrokeWidth(dimensionPixelSize2);
        paint.setStyle(Paint.Style.STROKE);
    }

    protected final float a() {
        return this.c;
    }

    protected final float b() {
        return this.b;
    }

    protected final float c() {
        return this.d;
    }

    protected final float d() {
        return this.a;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.save();
        Path path = this.f;
        canvas.clipPath(path);
        super.draw(canvas);
        Paint paint = this.g;
        if (paint != null) {
            canvas.drawPath(path, paint);
        }
        canvas.restore();
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == 0 || i2 == 0) {
            return;
        }
        int i5 = bac.a;
        int layoutDirection = getLayoutDirection();
        int i6 = layoutDirection == 0 ? 0 : 1;
        RectF rectF = this.e;
        rectF.set(0.0f, 0.0f, i, i2);
        Path path = this.f;
        path.reset();
        float[] fArr = this.h;
        if (fArr == null) {
            fArr = new float[8];
            this.h = fArr;
        }
        int i7 = i6 << 1;
        fArr[i7] = d();
        fArr[i7 + 1] = d();
        int i8 = (layoutDirection == 0 ? 1 : 0) << 1;
        fArr[i8] = b();
        fArr[i8 + 1] = b();
        int i9 = (layoutDirection == 0 ? 2 : 3) << 1;
        fArr[i9] = a();
        fArr[i9 + 1] = a();
        int i10 = (layoutDirection == 0 ? 3 : 2) << 1;
        fArr[i10] = c();
        fArr[i10 + 1] = c();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        path.close();
    }

    public RoundedLinearLayout(Context context) {
        this(context, null);
    }
}

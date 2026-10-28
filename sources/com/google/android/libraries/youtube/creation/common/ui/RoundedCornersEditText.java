package com.google.android.libraries.youtube.creation.common.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatEditText;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import defpackage.a;
import defpackage.avju;
import defpackage.nuo;
import defpackage.uhz;
import defpackage.uia;
import defpackage.zvm;
import defpackage.zvn;
import defpackage.zvp;
import j$.util.Optional;
import java.util.Arrays;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class RoundedCornersEditText extends AppCompatEditText {
    public boolean a;
    public boolean b;
    public boolean c;
    public final uia d;
    public Paint.Join e;
    public float f;
    private final Paint g;
    private final Paint h;
    private final TextPaint i;
    private final TextPaint j;
    private boolean k;
    private float l;

    public RoundedCornersEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
        this.k = false;
        this.b = false;
        this.c = false;
        this.d = new uia();
        this.l = 0.0625f;
        this.e = Paint.Join.MITER;
        this.f = 2.0f;
        Paint paint = new Paint();
        this.g = paint;
        Paint paint2 = new Paint();
        this.h = paint2;
        this.i = new TextPaint(paint);
        this.j = new TextPaint(paint2);
    }

    private final void i(Paint.Style style, int i) {
        TextPaint paint = getPaint();
        paint.setStyle(style);
        if (style == Paint.Style.STROKE) {
            paint.setStrokeWidth(d());
            paint.setStrokeJoin(this.e);
            if (this.e == Paint.Join.MITER) {
                paint.setStrokeMiter(this.f);
            }
        }
        setTextColor(i);
    }

    public final float d() {
        return TypedValue.applyDimension(1, getTextSize() * this.l, getResources().getDisplayMetrics());
    }

    protected final void e(TextPaint textPaint, Canvas canvas) {
        textPaint.baselineShift = getBaseline();
        Editable text = getText();
        if (text == null || getLayout() == null) {
            zvp.a(zvn.b, zvm.M, "RoundedCornersEditText: Text or layout is null");
            return;
        }
        DynamicLayout dynamicLayoutBuild = DynamicLayout.Builder.obtain(text.toString(), textPaint, getLayout().getWidth()).setAlignment(getLayout().getAlignment()).setLineSpacing(getLayout().getSpacingAdd(), getLayout().getSpacingMultiplier()).build();
        canvas.save();
        float fD = d();
        canvas.translate(fD + fD, fD / 2.0f);
        dynamicLayoutBuild.draw(canvas);
        canvas.restore();
    }

    public final void f(float f, Paint.Join join, float f2) {
        this.l = f;
        this.e = join;
        this.f = f2;
        requestLayout();
        invalidate();
    }

    public final void g(boolean z) {
        if (this.c != z) {
            this.c = z;
            this.d.e = z;
            invalidate();
        }
    }

    @Override // android.view.View
    public final Drawable getBackground() {
        return this.a ? new ColorDrawable(this.d.a()) : super.getBackground();
    }

    public final void h(boolean z) {
        if (this.b && a.aK()) {
            z = false;
        }
        this.k = z;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (this.b) {
            if (!a.aK()) {
                int currentTextColor = getCurrentTextColor();
                i(Paint.Style.STROKE, this.d.a());
                super.onDraw(canvas);
                i(Paint.Style.FILL, currentTextColor);
                super.onDraw(canvas);
                return;
            }
            Paint paint = this.g;
            paint.set(getPaint());
            paint.setStrokeWidth(d());
            paint.setColor(this.d.a());
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(this.e);
            if (this.e == Paint.Join.MITER) {
                paint.setStrokeMiter(this.f);
            }
            TextPaint textPaint = this.i;
            textPaint.set(paint);
            e(textPaint, canvas);
            Paint paint2 = this.h;
            paint2.set(getPaint());
            paint2.setColor(getCurrentTextColor());
            TextPaint textPaint2 = this.j;
            textPaint2.set(paint2);
            e(textPaint2, canvas);
            return;
        }
        if (this.a) {
            uia uiaVar = this.d;
            Paint paint3 = uiaVar.b;
            if (paint3.getColor() != 0 && getText().length() != 0) {
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                StringBuilder sb = uiaVar.a;
                sb.delete(0, sb.length());
                sb.append((CharSequence) getText());
                sb.append(paint3.getColor());
                sb.append(getTextSize());
                sb.append(Arrays.toString(iArr));
                sb.append(getTypeface());
                sb.append(getTextAlignment());
                sb.append(uiaVar.e);
                int iHashCode = sb.toString().hashCode();
                if (iHashCode != uiaVar.c) {
                    uiaVar.c = iHashCode;
                    nuo nuoVar = uiaVar.g;
                    avju avjuVar = uiaVar.f;
                    avjuVar.b = 0;
                    PriorityQueue priorityQueue = (PriorityQueue) avjuVar.a;
                    priorityQueue.clear();
                    int lineCount = getLineCount();
                    int length = getText().length();
                    for (int i = 0; i < lineCount; i++) {
                        int lineStart = getLayout().getLineStart(i);
                        if (lineStart == length || getText().charAt(lineStart) == '\n') {
                            avjuVar.e(0.0f, 0.0f);
                        } else {
                            avjuVar.e((getLayout().getLineLeft(i) + getPaddingLeft()) - (getTextSize() * 0.2f), getLayout().getLineRight(i) + getPaddingLeft() + (getTextSize() * 0.2f));
                        }
                    }
                    float textSize = getTextSize() * 0.6f;
                    while (!priorityQueue.isEmpty()) {
                        uhz uhzVar = (uhz) priorityQueue.poll();
                        Optional optionalD = avjuVar.d(uhzVar.a - 1);
                        if (optionalD.isPresent()) {
                            nuo.u(avjuVar, uhzVar, (uhz) optionalD.get(), textSize);
                        }
                        Optional optionalD2 = avjuVar.d(uhzVar.a + 1);
                        if (optionalD2.isPresent()) {
                            nuo.u(avjuVar, uhzVar, (uhz) optionalD2.get(), textSize);
                        }
                    }
                }
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (i2 < getLineCount()) {
                    int i5 = i2 + 1;
                    int lineStart2 = getLayout().getLineStart(i2);
                    if (lineStart2 != getLayout().getLineEnd(i2)) {
                        if (getText().charAt(lineStart2) == '\n') {
                            if (i3 > 0) {
                                uiaVar.b(canvas, this, i4, i2 - 1);
                                i3 = 0;
                            }
                            i4 = i5;
                        } else if (i2 == getLineCount() - 1) {
                            uiaVar.b(canvas, this, i4, i2);
                        } else {
                            i3++;
                        }
                    } else if (i3 > 0) {
                        uiaVar.b(canvas, this, i4, i2 - 1);
                        i3 = 0;
                    }
                    i2 = i5;
                }
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.b) {
            int measuredWidth = getMeasuredWidth();
            if (this.k) {
                measuredWidth = (int) (measuredWidth * 1.1f);
            }
            int iD = (int) d();
            setMeasuredDimension(measuredWidth + iD, getMeasuredHeight() + iD);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (!this.a) {
            super.setBackgroundColor(i);
        } else {
            this.d.b.setColor(i);
            invalidate();
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        if (this.a) {
            int i2 = (int) (0.8f * f);
            setPadding(i2, 0, i2, 0);
        }
        super.setTextSize(i, f);
    }
}

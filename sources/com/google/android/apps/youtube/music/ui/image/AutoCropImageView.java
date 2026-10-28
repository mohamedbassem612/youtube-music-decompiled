package com.google.android.apps.youtube.music.ui.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.aunn;
import defpackage.izk;
import defpackage.ttp;
import defpackage.vxz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AutoCropImageView extends izk implements ttp {
    private static final float[] f = new float[3];
    public aunn a;
    int b;
    int c;
    public boolean d;
    public float e;
    private Matrix g;
    private int h;
    private int i;
    private boolean j;
    private int[] k;

    public AutoCropImageView(Context context) {
        super(context);
        this.e = 0.0f;
        d();
    }

    private final void d() {
        this.j = getScaleType() == ImageView.ScaleType.CENTER_CROP;
        this.d = false;
        this.g = new Matrix();
    }

    public final boolean a() {
        int i = this.h;
        return i > 0 && ((float) this.i) / ((float) i) > 1.2f;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.save();
        if (a() && this.e > 0.0f) {
            canvas.clipRect(0, 0, getWidth(), getHeight());
        } else if (!this.j) {
            int height = getHeight();
            float f2 = height;
            int width = getWidth();
            if (true != this.d) {
                width = (int) (f2 * 1.8f);
            }
            canvas.clipRect(0, 0, width, height);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.g.reset();
        int i5 = this.c;
        if (i5 > 0) {
            int i6 = i3 - i;
            int i7 = i4 - i2;
            int i8 = this.i;
            if (((vxz) this.a.io()).l(95, 45762151L, false) && !a()) {
                i5 = this.h;
            }
            float f2 = i5;
            float f3 = 1.8f * f2;
            float f4 = f3 - this.i;
            float f5 = 0.0f;
            if (!this.j) {
                float f6 = f4 / 2.0f;
                if (f6 > 0.0f) {
                    this.g.setTranslate(f6, 0.0f);
                    i8 = (int) f3;
                }
            }
            float f7 = this.i;
            float f8 = i6;
            float f9 = i7;
            float f10 = f7 / this.h;
            float fMax = (((double) f10) <= 0.9d || f10 >= 1.2f || f8 / f9 >= f10) ? f8 / f7 : f9 / f2;
            if (a() && this.e > 0.0f) {
                fMax += (Math.max(f8 / f7, f9 / f2) - fMax) * this.e;
            }
            float f11 = i8;
            float f12 = (f8 - (f11 * fMax)) / 2.0f;
            if (f12 <= 0.0f || (a() && this.e > 0.0f)) {
                f5 = f12;
            } else if (this.j) {
                fMax = f8 / f11;
            }
            float f13 = (f9 - (this.h * fMax)) / 2.0f;
            this.g.postScale(fMax, fMax);
            this.g.postTranslate(f5, f13);
        }
        setScaleType(ImageView.ScaleType.MATRIX);
        setImageMatrix(this.g);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0073  */
    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        Bitmap bitmap2;
        int i;
        if (bitmap != null) {
            int i2 = 0;
            this.b = 0;
            int height = bitmap.getHeight();
            this.c = height;
            this.h = height;
            int height2 = bitmap.getHeight();
            int width = bitmap.getWidth();
            this.i = width;
            if (height2 <= 1 || width <= 1) {
                bitmap2 = bitmap;
            } else {
                int[] iArr = this.k;
                if (iArr == null || iArr.length < height2) {
                    iArr = new int[height2];
                    this.k = iArr;
                }
                int i3 = width >> 1;
                bitmap2 = bitmap;
                bitmap2.getPixels(iArr, 0, 1, i3, 0, 1, height2);
                float f2 = height2;
                while (true) {
                    i = (int) (0.25f * f2);
                    if (i2 >= i) {
                        break;
                    }
                    int i4 = this.k[i2];
                    float[] fArr = f;
                    Color.colorToHSV(i4, fArr);
                    if (fArr[2] > 0.08f) {
                        break;
                    }
                    i2++;
                    this.b = i2;
                }
                int i5 = height2;
                for (int i6 = height2 - 1; i6 >= height2 - i; i6--) {
                    int i7 = this.k[i6];
                    float[] fArr2 = f;
                    Color.colorToHSV(i7, fArr2);
                    if (fArr2[2] > 0.08f) {
                        break;
                    }
                    i5 = i6;
                }
                this.c = i5 - this.b;
            }
        } else {
            bitmap2 = bitmap;
        }
        super.setImageBitmap(bitmap2);
    }

    public AutoCropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 0.0f;
        d();
    }

    public AutoCropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = 0.0f;
        d();
    }
}

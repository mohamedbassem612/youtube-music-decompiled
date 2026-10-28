package com.google.android.libraries.user.profile.photopicker.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import defpackage.auwl;
import defpackage.qtq;
import defpackage.qtr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class SquareImageView extends View {
    public Bitmap a;
    private final Paint b;
    private final Paint c;
    private int d;
    private RectF e;
    private int f;
    private int g;

    public SquareImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new Paint(1);
        Paint paint = new Paint(1);
        this.c = paint;
        new qtr(this, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.colorHairline});
        try {
            paint.setColor(typedArrayObtainStyledAttributes.getColor(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.d = context.getResources().getDimensionPixelSize(R.dimen.photo_picker_corner_crop_radius);
            if (auwl.a.io().a()) {
                TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, qtq.a, 0, 0);
                try {
                    this.d = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, this.d);
                } finally {
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a() {
        this.a = null;
        this.b.setShader(null);
        invalidate();
    }

    public final void b() {
        if (this.f == 0 || this.g == 0) {
            return;
        }
        BitmapShader bitmapShader = new BitmapShader(this.a, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        float f = this.f;
        float f2 = this.g;
        float width = this.a.getWidth();
        float height = this.a.getHeight();
        float f3 = width / height;
        float f4 = f / f2;
        float f5 = f3 <= f4 ? width : height * f4;
        float f6 = f3 >= f4 ? height : width / f4;
        Matrix matrix = new Matrix();
        matrix.postTranslate(-((width - f5) / 2.0f), -((height - f6) / 2.0f));
        matrix.postScale(f / f5, f2 / f6);
        bitmapShader.setLocalMatrix(matrix);
        this.b.setShader(bitmapShader);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.e;
        if (rectF != null) {
            Bitmap bitmap = this.a;
            int i = this.d;
            if (bitmap != null) {
                float f = i;
                canvas.drawRoundRect(rectF, f, f, this.b);
            } else {
                float f2 = i;
                canvas.drawRoundRect(rectF, f2, f2, this.c);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int paddingRight = i - getPaddingRight();
        int paddingBottom = getPaddingBottom();
        this.f = paddingRight;
        this.g = i2 - paddingBottom;
        this.e = new RectF(getPaddingLeft(), getPaddingTop(), this.f, this.g);
        if (this.a != null) {
            b();
        }
    }

    public SquareImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SquareImageView(Context context) {
        this(context, null);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.photo_picker_item_padding);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }
}

package com.makeramen;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ImageView;
import defpackage.aumk;
import defpackage.aumm;
import defpackage.aumn;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class RoundedImageView extends ImageView {
    private static final ImageView.ScaleType[] b = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public boolean a;
    private float c;
    private float d;
    private ColorStateList e;
    private boolean f;
    private int g;
    private Drawable h;
    private Drawable i;
    private ImageView.ScaleType j;

    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = 0.0f;
        this.e = ColorStateList.valueOf(0);
        this.a = false;
        this.f = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aumk.a, i, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(0, -1);
        if (i2 >= 0) {
            setScaleType(b[i2]);
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1);
        float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        this.d = dimensionPixelSize;
        if (this.c < 0.0f) {
            this.c = 0.0f;
        }
        if (dimensionPixelSize < 0.0f) {
            this.d = TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics());
        }
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(1);
        this.e = colorStateList;
        if (colorStateList == null) {
            this.e = ColorStateList.valueOf(0);
        }
        this.f = typedArrayObtainStyledAttributes.getBoolean(4, false);
        this.a = typedArrayObtainStyledAttributes.getBoolean(5, false);
        c();
        b(true);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void d(Drawable drawable) {
        if (drawable != null) {
            if (!(drawable instanceof aumm)) {
                if (drawable instanceof LayerDrawable) {
                    LayerDrawable layerDrawable = (LayerDrawable) drawable;
                    int numberOfLayers = layerDrawable.getNumberOfLayers();
                    for (int i = 0; i < numberOfLayers; i++) {
                        d(layerDrawable.getDrawable(i));
                    }
                    return;
                }
                return;
            }
            aumm aummVar = (aumm) drawable;
            ImageView.ScaleType scaleType = this.j;
            if (scaleType == null) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            if (aummVar.f != scaleType) {
                aummVar.f = scaleType;
                aummVar.b();
            }
            aummVar.b = this.c;
            float f = this.d;
            aummVar.d = f;
            Paint paint = aummVar.a;
            paint.setStrokeWidth(f);
            ColorStateList colorStateListValueOf = this.e;
            if (colorStateListValueOf == null) {
                colorStateListValueOf = ColorStateList.valueOf(0);
            }
            aummVar.e = colorStateListValueOf;
            paint.setColor(aummVar.e.getColorForState(aummVar.getState(), 0));
            aummVar.c = this.a;
        }
    }

    public final void a(int i) {
        float dimension = getResources().getDimension(i);
        if (this.c != dimension) {
            this.c = dimension;
            c();
            b(false);
        }
    }

    public final void b(boolean z) {
        if (this.f) {
            if (z) {
                this.i = aumm.a(this.i);
            }
            d(this.i);
        }
    }

    public final void c() {
        d(this.h);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.ImageView
    public final ImageView.ScaleType getScaleType() {
        return this.j;
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    @Deprecated
    public final void setBackgroundDrawable(Drawable drawable) {
        this.i = drawable;
        b(true);
        super.setBackgroundDrawable(this.i);
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        this.g = 0;
        this.h = bitmap != null ? new aumm(bitmap) : null;
        c();
        super.setImageDrawable(this.h);
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        this.g = 0;
        this.h = aumm.a(drawable);
        c();
        super.setImageDrawable(this.h);
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        if (this.g != i) {
            this.g = i;
            Resources resources = getResources();
            Drawable drawable = null;
            if (resources != null) {
                int i2 = this.g;
                if (i2 != 0) {
                    try {
                        drawable = resources.getDrawable(i2);
                    } catch (Exception e) {
                        Log.w("RoundedImageView", "Unable to find resource: " + this.g, e);
                        this.g = 0;
                    }
                }
                drawable = aumm.a(drawable);
            }
            this.h = drawable;
            c();
            super.setImageDrawable(this.h);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    @Override // android.widget.ImageView
    public final void setScaleType(ImageView.ScaleType scaleType) {
        if (this.j != scaleType) {
            this.j = scaleType;
            switch (aumn.a[scaleType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    super.setScaleType(ImageView.ScaleType.FIT_XY);
                    break;
                default:
                    super.setScaleType(scaleType);
                    break;
            }
            c();
            b(false);
            invalidate();
        }
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedImageView(Context context) {
        super(context);
        this.c = 0.0f;
        this.e = ColorStateList.valueOf(0);
        this.a = false;
        this.f = false;
    }
}

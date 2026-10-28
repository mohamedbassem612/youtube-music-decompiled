package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.ttd;
import defpackage.ttp;
import defpackage.ttv;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CircularImageView extends ImageView implements ttp {
    private ttd a;
    private InsetDrawable b;
    private ttd c;
    private final float d;
    private final int e;

    public CircularImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ttv.b);
        this.d = typedArrayObtainStyledAttributes.getDimension(1, 0.0f);
        this.e = typedArrayObtainStyledAttributes.getColor(0, -16777216);
    }

    private final void a() {
        if (getBackground() != null) {
            if (this.b != null) {
                Rect rect = new Rect();
                this.b.getPadding(rect);
                if (rect.left == getPaddingLeft() && rect.top == getPaddingTop() && rect.right == getPaddingRight() && rect.bottom == getPaddingBottom()) {
                    return;
                }
            }
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) this.c, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
            this.b = insetDrawable;
            super.setBackgroundDrawable(insetDrawable);
        }
    }

    @Override // android.view.View
    public final Drawable getBackground() {
        ttd ttdVar = this.c;
        if (ttdVar != null) {
            return ttdVar.a;
        }
        return null;
    }

    @Override // android.widget.ImageView
    public final Drawable getDrawable() {
        ttd ttdVar = this.a;
        if (ttdVar != null) {
            return ttdVar.a;
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        ttd ttdVar = this.c;
        if (drawable == null) {
            if (ttdVar != null) {
                ttdVar.a(null);
            }
            super.setBackgroundDrawable(null);
        } else {
            if (ttdVar == null) {
                this.c = new ttd(drawable, this.d, this.e);
            } else {
                ttdVar.a(drawable);
            }
            a();
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new BitmapDrawable(getContext().getResources(), bitmap));
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        ttd ttdVar = this.a;
        if (drawable == null) {
            if (ttdVar != null) {
                ttdVar.a(null);
            }
            super.setImageDrawable(null);
        } else {
            if (ttdVar == null) {
                this.a = new ttd(drawable, this.d, this.e);
            } else {
                ttdVar.a(drawable);
                invalidate();
            }
            super.setImageDrawable(this.a);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        setImageDrawable(getResources().getDrawable(i));
    }
}

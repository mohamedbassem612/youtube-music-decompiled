package com.google.android.libraries.youtube.offline.ui;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.agrc;
import defpackage.agrf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class BestFitImageView extends ImageView {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/ui/BestFitImageView");

    public BestFitImageView(Context context) {
        super(context);
    }

    private final void a() {
        super.setScaleType(ImageView.ScaleType.MATRIX);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            Matrix matrix = new Matrix(getMatrix());
            float f = intrinsicWidth * height > width * intrinsicHeight ? height / intrinsicHeight : width / intrinsicWidth;
            matrix.setScale(f, f);
            setImageMatrix(matrix);
        }
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a();
    }

    @Override // android.widget.ImageView
    protected final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        a();
        return frame;
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        a();
    }

    @Override // android.widget.ImageView
    public final void setScaleType(ImageView.ScaleType scaleType) {
        ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/offline/ui/BestFitImageView", "setScaleType", 63, "BestFitImageView.java")).t("setScaleType() is not supported for BestFitImageView");
    }

    @Override // android.view.View
    public final void setScaleX(float f) {
        ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/offline/ui/BestFitImageView", "setScaleX", 68, "BestFitImageView.java")).t("setScaleX()  is not supported for BestFitImageView");
    }

    @Override // android.view.View
    public final void setScaleY(float f) {
        ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/offline/ui/BestFitImageView", "setScaleY", 73, "BestFitImageView.java")).t("setScaleY() is not supported for BestFitImageView");
    }

    public BestFitImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BestFitImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BestFitImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

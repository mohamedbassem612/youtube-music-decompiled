package com.google.android.apps.youtube.music.ui.components.chipcloud;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.music.R;
import defpackage.ixj;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ChipCloudChipLoadingIndicator extends ixj implements ValueAnimator.AnimatorUpdateListener {
    public Executor a;
    public final Paint b;
    public final Path c;
    public final Interpolator d;
    public ValueAnimator e;
    public PathMeasure f;
    private final Path g;
    private float h;
    private float i;

    public ChipCloudChipLoadingIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.chip_cloud_chip_corner_radius);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(getContext().getResources().getColor(R.color.ytm_color_white_at_56pct));
        gradientDrawable.setCornerRadius(dimensionPixelSize);
        setBackground(gradientDrawable);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(4.0f);
        this.c = new Path();
        this.g = new Path();
        this.d = new AccelerateDecelerateInterpolator();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float length = this.f.getLength() * fFloatValue;
        this.h = length;
        this.i = length - ((0.5f - Math.abs(fFloatValue - 0.5f)) * this.f.getLength());
        invalidate();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f != null) {
            Path path = this.g;
            path.reset();
            this.f.getSegment(this.i, this.h, path, true);
            canvas.drawPath(path, this.b);
        }
    }

    public ChipCloudChipLoadingIndicator(Context context) {
        this(context, null);
    }
}

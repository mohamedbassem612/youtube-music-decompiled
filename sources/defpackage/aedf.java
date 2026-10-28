package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aedf extends Drawable implements ValueAnimator.AnimatorUpdateListener {
    public static final /* synthetic */ int b = 0;
    public final Paint a;
    private final Path c;
    private final Path d;
    private final Interpolator e;
    private ValueAnimator f;
    private PathMeasure g;
    private float h;
    private float i;
    private final Context j;

    public aedf(Context context, int i) {
        this.j = context;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(i);
        paint.setStrokeWidth(4.0f);
        this.c = new Path();
        this.d = new Path();
        this.e = aedd.a;
    }

    public final void a() {
        Path path = this.c;
        path.reset();
        Context context = this.j;
        Resources resources = context == null ? null : context.getResources();
        float dimensionPixelSize = resources != null ? resources.getDimensionPixelSize(R.dimen.stroke_border_corner_radius) : 0.0f;
        path.addRoundRect(getBounds().left + 2.0f, getBounds().top + 2.0f, getBounds().right - 2.0f, getBounds().bottom - 2.0f, dimensionPixelSize, dimensionPixelSize, Path.Direction.CW);
        this.g = new PathMeasure(path, true);
        if (this.f == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(1000L).setInterpolator(this.e);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.addUpdateListener(this);
            this.f = valueAnimatorOfFloat;
            valueAnimatorOfFloat.start();
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f;
        valueAnimator.getClass();
        valueAnimator.end();
        this.f.removeAllUpdateListeners();
        this.f = null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.g != null) {
            Path path = this.d;
            path.reset();
            PathMeasure pathMeasure = this.g;
            pathMeasure.getClass();
            pathMeasure.getSegment(this.i, this.h, path, true);
            canvas.drawPath(path, this.a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        PathMeasure pathMeasure = this.g;
        pathMeasure.getClass();
        float length = pathMeasure.getLength() * fFloatValue;
        this.h = length;
        this.i = length - ((0.5f - Math.abs(fFloatValue - 0.5f)) * this.g.getLength());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        ValueAnimator valueAnimator = this.f;
        boolean z = false;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            z = true;
        }
        Boolean.valueOf(z).getClass();
        if (z) {
            b();
            a();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

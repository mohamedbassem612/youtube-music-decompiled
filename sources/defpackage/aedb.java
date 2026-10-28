package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aedb extends Drawable {
    public final Context a;
    public final int[] b;
    public final Paint c;
    public final RectF d;
    private final float e;

    public aedb(Context context, float f) {
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new RectF();
        this.a = context;
        this.e = f;
        this.b = new int[]{tzk.i(context, R.attr.ytAssistiveFeedVibrantGradient1), tzk.i(context, R.attr.ytAssistiveFeedVibrantGradient2), tzk.i(context, R.attr.ytAssistiveFeedVibrantGradient3), tzk.i(context, R.attr.ytAssistiveFeedVibrantGradient1)};
        paint.setStyle(Paint.Style.STROKE);
    }

    public final Animator a(int i, int i2) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(200L).setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.addUpdateListener(new adey(this, 2));
        return valueAnimatorOfInt;
    }

    public final Animator b(float f, float f2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(600L).setInterpolator(aedd.a);
        valueAnimatorOfFloat.addUpdateListener(new adey(this, 3));
        return valueAnimatorOfFloat;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.c;
        RectF rectF = this.d;
        float f = this.e;
        canvas.drawRoundRect(rectF, f, f, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

package defpackage;

import android.animation.ValueAnimator;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimeBar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abhn implements ValueAnimator.AnimatorUpdateListener {
    public final ValueAnimator a;
    public boolean b;
    public final int c;
    public final int d;
    public final /* synthetic */ TimeBar e;

    public abhn(TimeBar timeBar, int i, int i2) {
        this.e = timeBar;
        this.c = i2;
        this.d = i;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i, i2);
        this.a = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(this);
        this.b = false;
    }

    public final float a() {
        if (!this.e.isEnabled()) {
            return 0.0f;
        }
        float fFloatValue = ((Float) this.a.getAnimatedValue()).floatValue();
        return Math.min(this.c, Math.max(this.d, fFloatValue));
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.e.invalidate();
    }
}

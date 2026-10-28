package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ibd implements ValueAnimator.AnimatorUpdateListener {
    private float a;
    protected final ValueAnimator g;

    protected ibd() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(2500L);
        this.g = duration;
        duration.addUpdateListener(this);
        this.a = 0.0f;
    }

    public final float b() {
        ValueAnimator valueAnimator = this.g;
        return valueAnimator.isRunning() ? ((Float) valueAnimator.getAnimatedValue()).floatValue() : this.a;
    }

    public final void c() {
        this.g.reverse();
        this.a = 0.0f;
    }

    protected final void d() {
        this.g.start();
        this.a = 1.0f;
    }

    public final void e(int i) {
        this.g.setDuration(i);
    }

    protected final void f() {
        this.g.cancel();
        this.a = 1.0f;
    }

    public final void g() {
        this.g.cancel();
        this.a = 0.0f;
    }
}

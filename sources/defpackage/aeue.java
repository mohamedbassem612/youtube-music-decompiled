package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeue {
    public int a = 0;
    public int b = 1;
    private final long c;
    private final long d;
    private final TimeInterpolator e;

    public aeue(long j, long j2, TimeInterpolator timeInterpolator) {
        this.c = j;
        this.d = j2;
        this.e = timeInterpolator;
    }

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.e;
        return timeInterpolator == null ? aetz.b : timeInterpolator;
    }

    public final void b(Animator animator) {
        animator.setStartDelay(this.c);
        animator.setDuration(this.d);
        animator.setInterpolator(a());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.a);
            valueAnimator.setRepeatMode(this.b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aeue) {
            aeue aeueVar = (aeue) obj;
            if (this.c == aeueVar.c && this.d == aeueVar.d && this.a == aeueVar.a && this.b == aeueVar.b) {
                return a().getClass().equals(aeueVar.a().getClass());
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = a().getClass().hashCode();
        long j = this.d;
        long j2 = this.c;
        return (((((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + iHashCode) * 31) + this.a) * 31) + this.b;
    }

    public final String toString() {
        return "\n" + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.c + " duration: " + this.d + " interpolator: " + a().getClass() + " repeatCount: " + this.a + " repeatMode: " + this.b + "}\n";
    }
}

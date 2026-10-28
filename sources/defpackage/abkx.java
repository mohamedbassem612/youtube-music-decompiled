package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abkx {
    public AnimatorSet a;
    public final Duration b;
    public final agke c;
    public final agke d;
    public final Animator.AnimatorListener e;

    public abkx(Duration duration, agke agkeVar, agke agkeVar2, Animator.AnimatorListener animatorListener) {
        this.b = duration;
        this.c = agkeVar;
        this.d = agkeVar2;
        this.e = animatorListener;
    }

    public final void a() {
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null) {
            animatorSet.end();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abkx) {
            abkx abkxVar = (abkx) obj;
            if (this.b.equals(abkxVar.b) && aguu.v(this.c, abkxVar.c) && aguu.v(this.d, abkxVar.d)) {
                Animator.AnimatorListener animatorListener = this.e;
                if (animatorListener == null) {
                    if (abkxVar.e == null) {
                        return true;
                    }
                } else if (animatorListener.equals(abkxVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        Animator.AnimatorListener animatorListener = this.e;
        return (iHashCode * 1000003) ^ (animatorListener == null ? 0 : animatorListener.hashCode());
    }

    public final String toString() {
        Animator.AnimatorListener animatorListener = this.e;
        agke agkeVar = this.d;
        agke agkeVar2 = this.c;
        return "SequentialAlphaAnimationHelper{delayBetweenAnimationsInSequence=" + String.valueOf(this.b) + ", views=" + String.valueOf(agkeVar2) + ", animationSteps=" + String.valueOf(agkeVar) + ", animatorListener=" + String.valueOf(animatorListener) + '}';
    }

    public abkx() {
        throw null;
    }
}

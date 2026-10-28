package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.SystemClock;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jqj extends AnimatorListenerAdapter {
    final /* synthetic */ jqo a;

    public jqj(jqo jqoVar) {
        this.a = jqoVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        duh duhVar = this.a.l.g;
        dul dulVar = duhVar.b;
        if (dulVar.g) {
            if (!dulVar.t() || dulVar.g) {
                dulVar.g = false;
                dulVar.s();
                duk dukVar = dulVar.c;
                if (dukVar.c == 0) {
                    int i = dukVar.a;
                    if (i != dulVar.d) {
                        dulVar.o(i);
                    }
                    dulVar.p(0);
                    dulVar.q();
                } else {
                    dulVar.p(2);
                }
            }
            VelocityTracker velocityTracker = duhVar.d;
            velocityTracker.computeCurrentVelocity(1000, duhVar.e);
            if (duhVar.c.aq((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
                return;
            }
            ViewPager2 viewPager2 = duhVar.a;
            View viewB = viewPager2.e.b(viewPager2.c);
            if (viewB != null) {
                int[] iArrC = viewPager2.e.c(viewPager2.c, viewB);
                int i2 = iArrC[0];
                if (i2 == 0) {
                    if (iArrC[1] == 0) {
                        return;
                    } else {
                        i2 = 0;
                    }
                }
                viewPager2.d.aA(i2, iArrC[1], false);
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        jqo jqoVar = this.a;
        jqoVar.t = -jqoVar.t;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        jqo jqoVar = this.a;
        jqoVar.t = 1;
        duh duhVar = jqoVar.l.g;
        dul dulVar = duhVar.b;
        if (dulVar.t()) {
            return;
        }
        duhVar.g = 0;
        duhVar.f = 0.0f;
        duhVar.h = SystemClock.uptimeMillis();
        VelocityTracker velocityTracker = duhVar.d;
        if (velocityTracker == null) {
            duhVar.d = VelocityTracker.obtain();
            duhVar.e = ViewConfiguration.get(duhVar.a.getContext()).getScaledMaximumFlingVelocity();
        } else {
            velocityTracker.clear();
        }
        dulVar.a = 4;
        dulVar.r(true);
        if (!dulVar.u()) {
            duhVar.c.an();
        }
        duhVar.a(duhVar.h, 0, 0.0f, 0.0f);
    }
}

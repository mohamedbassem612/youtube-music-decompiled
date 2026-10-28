package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.google.android.libraries.youtube.rendering.ui.spec.motion.TouchFeedbackDrawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aedd {
    public static final Interpolator a = new PathInterpolator(0.05f, 0.0f, 0.0f, 1.0f);
    public static final Interpolator b = new PathInterpolator(0.2f, 0.0f, 0.6f, 1.0f);

    static {
        new PathInterpolator(0.25f, 0.0f, 0.05f, 1.0f);
    }

    public static float a(View view) {
        int iM = twm.m(view.getResources().getDisplayMetrics(), Math.max(view.getWidth(), view.getHeight()));
        return Math.max(iM > 0 ? 1.0f - (9.0f / iM) : 0.0f, 0.94f);
    }

    public static Animator b(View view, float f, float f2, int i) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", f, f2);
        Interpolator interpolator = a;
        objectAnimatorOfFloat.setInterpolator(interpolator);
        long j = i;
        objectAnimatorOfFloat.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", f, f2);
        objectAnimatorOfFloat2.setInterpolator(interpolator);
        objectAnimatorOfFloat2.setDuration(j);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        return animatorSet;
    }

    public static void c(View view, int i, int i2, Drawable drawable) {
        if (drawable instanceof TouchFeedbackDrawable) {
            return;
        }
        aedg aedgVarA = aedg.a(view.getContext());
        aedgVarA.a = i;
        aedgVarA.c(i2);
        aedgVarA.b = drawable;
        tym.Z(view, aedgVarA.b());
    }
}

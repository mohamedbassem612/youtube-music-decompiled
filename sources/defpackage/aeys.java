package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aeys {
    public final TimeInterpolator a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
    public final View b;
    public final int c;
    public final int d;
    public final int e;
    public pw f;
    private final float g;
    private final float h;

    public aeys(View view) {
        this.b = view;
        Context context = view.getContext();
        this.c = afba.s(context.getTheme(), R.attr.motionDurationMedium2, 300);
        this.d = afba.s(context.getTheme(), R.attr.motionDurationShort3, 150);
        this.e = afba.s(context.getTheme(), R.attr.motionDurationShort2, 100);
        Resources resources = view.getResources();
        this.g = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.h = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final Animator a() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new bnn());
        return animatorSet;
    }

    public final void b(float f) {
        float interpolation = this.a.getInterpolation(f);
        View view = this.b;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f2 = this.g / width;
        float f3 = this.h / height;
        TimeInterpolator timeInterpolator = aetz.a;
        float f4 = ((f2 + 0.0f) * interpolation) + 0.0f;
        float f5 = (interpolation * (f3 + 0.0f)) + 0.0f;
        float f6 = 1.0f - f4;
        if (Float.isNaN(f6)) {
            return;
        }
        float f7 = 1.0f - f5;
        if (Float.isNaN(f7)) {
            return;
        }
        view.setScaleX(f6);
        view.setPivotY(height);
        view.setScaleY(f7);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(f7 != 0.0f ? f6 / f7 : 1.0f);
            }
        }
    }
}

package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class addy implements ntp {
    private final /* synthetic */ int $cid;
    final /* synthetic */ aihn a;

    public addy(aihn aihnVar, int i) {
        this.$cid = i;
        this.a = aihnVar;
    }

    @Override // defpackage.ntp
    public final void d(View view, View view2) {
        if (this.$cid != 0) {
            aihn aihnVar = this.a;
            if (view2 != null) {
                view = view2;
            }
            Context context = view.getContext();
            int i = aedf.b;
            ajdt ajdtVar = (ajdt) aihnVar;
            aedf aedfVar = new aedf(context, (ajdtVar.c & 2) != 0 ? ajdtVar.e : -1);
            Drawable foreground = view.getForeground();
            if (foreground != null) {
                view.setForeground(new LayerDrawable(new Drawable[]{foreground, aedfVar}));
            } else {
                view.setForeground(aedfVar);
            }
            aedfVar.a();
            return;
        }
        if (view2 != null) {
            view = view2;
        }
        aedb aedbVar = new aedb(view.getContext(), twm.a(view.getContext().getResources().getDisplayMetrics(), ((aleq) this.a).d));
        Drawable foreground2 = view.getForeground();
        if (foreground2 != null) {
            view.setForeground(new LayerDrawable(new Drawable[]{foreground2, aedbVar}));
        } else {
            view.setForeground(aedbVar);
        }
        float dimensionPixelSize = aedbVar.a.getResources().getDimensionPixelSize(R.dimen.gradient_border_stroke_width);
        Animator animatorB = aedbVar.b(0.0f, dimensionPixelSize);
        Animator animatorB2 = aedbVar.b(dimensionPixelSize, 0.0f);
        Animator animatorA = aedbVar.a(0, 255);
        Animator animatorA2 = aedbVar.a(255, 0);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 2.0f);
        valueAnimatorOfFloat.setDuration(3000L).setInterpolator(aedd.b);
        valueAnimatorOfFloat.addUpdateListener(new vmg((Drawable) aedbVar, (Object) valueAnimatorOfFloat, 4));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(animatorA).with(animatorB).with(valueAnimatorOfFloat);
        animatorSet.play(animatorA2).after(valueAnimatorOfFloat.getDuration() - animatorA2.getDuration());
        animatorSet.play(animatorB2).after(valueAnimatorOfFloat.getDuration() - animatorB2.getDuration());
        animatorSet.start();
    }
}

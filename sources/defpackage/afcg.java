package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afcg implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public afcg(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.$cid;
        if (i == 0) {
            ((afcr) this.a).k.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            return;
        }
        if (i == 1) {
            ((CollapsingToolbarLayout) this.a).e(((Integer) valueAnimator.getAnimatedValue()).intValue());
            return;
        }
        if (i == 2) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            afcq afcqVar = ((afcr) this.a).k;
            afcqVar.setScaleX(fFloatValue);
            afcqVar.setScaleY(fFloatValue);
            return;
        }
        if (i == 3) {
            ((afcr) this.a).k.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (i == 4) {
            ((afcr) this.a).k.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (i != 5) {
            ((TextInputLayout) this.a).q.z(((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            ((TabLayout) this.a).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }
}

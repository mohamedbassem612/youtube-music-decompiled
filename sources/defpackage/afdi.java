package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;
import androidx.car.app.model.Alert;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afdi implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ View a;
    final /* synthetic */ Object b;
    final /* synthetic */ LinearLayout c;

    public afdi(afdj afdjVar, View view, View view2, int i) {
        this.$cid = i;
        this.a = view;
        this.b = view2;
        this.c = afdjVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.$cid != 0) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ((aeur) this.b).u((CoordinatorLayout) this.a, this.c, iIntValue, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY);
            return;
        }
        float animatedFraction = valueAnimator.getAnimatedFraction();
        Object obj = this.b;
        ((afdj) this.c).c(this.a, (View) obj, animatedFraction);
    }

    public afdi(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
        this.$cid = i;
        this.a = coordinatorLayout;
        this.c = appBarLayout;
        this.b = baseBehavior;
    }
}

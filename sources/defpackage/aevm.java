package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aevm implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ BottomSheetBehavior a;

    public aevm(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        afbe afbeVar = this.a.j;
        if (afbeVar != null) {
            afbeVar.r(fFloatValue);
        }
    }
}

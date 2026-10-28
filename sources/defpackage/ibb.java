package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ibb extends ibd {
    final /* synthetic */ ibe a;

    public ibb(ibe ibeVar) {
        this.a = ibeVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ibe ibeVar = this.a;
        ibeVar.invalidate();
        if (b() == 0.0f) {
            ibeVar.b();
        }
    }
}

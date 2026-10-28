package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class abkr extends AnimatorListenerAdapter {
    final /* synthetic */ abks a;

    public abkr(abks abksVar) {
        this.a = abksVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        abks abksVar = this.a;
        if (abksVar.f) {
            abksVar.g.h(false, true);
            abksVar.h.h(false, true);
            abksVar.i.h(false, true);
            hwc hwcVar = (hwc) abksVar.k.a;
            if (hwcVar.m || (hwcVar.t && hwcVar.o)) {
                hwcVar.D();
            }
        }
    }
}

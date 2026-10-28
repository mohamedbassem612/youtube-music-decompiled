package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aevl extends AnimatorListenerAdapter {
    final /* synthetic */ BottomSheetBehavior a;

    public aevl(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        bottomSheetBehavior.J(5);
        WeakReference weakReference = bottomSheetBehavior.J;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((View) bottomSheetBehavior.J.get()).requestLayout();
    }
}

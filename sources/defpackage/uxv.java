package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.libraries.youtube.creation.effects.deprecated.picker.ChooseFilterView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uxv extends AnimatorListenerAdapter {
    final /* synthetic */ ChooseFilterView a;

    public uxv(ChooseFilterView chooseFilterView) {
        this.a = chooseFilterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        uxx uxxVar = this.a.a;
        View viewA = uxxVar.a(uxxVar.c);
        if (viewA != null) {
            viewA.sendAccessibilityEvent(8);
        }
    }
}

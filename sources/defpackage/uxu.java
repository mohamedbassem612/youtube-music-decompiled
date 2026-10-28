package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.youtube.creation.effects.deprecated.picker.ChooseFilterView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uxu extends AnimatorListenerAdapter {
    final /* synthetic */ ChooseFilterView a;

    public uxu(ChooseFilterView chooseFilterView) {
        this.a = chooseFilterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setAlpha(0.0f);
    }
}

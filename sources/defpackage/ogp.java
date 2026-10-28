package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ogp extends AnimatorListenerAdapter {
    private final aha a = new aha(0);

    protected final boolean a(Animator animator) {
        aha ahaVar = this.a;
        return ahaVar.containsKey(animator) && ((Boolean) ahaVar.get(animator)).booleanValue();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a.put(animator, Boolean.TRUE);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.put(animator, Boolean.FALSE);
    }
}

package defpackage;

import android.animation.Animator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ogr extends ogp {
    protected final Animator a;
    public final Runnable b;
    public int d;
    private final ogu e = new ogq(this);
    public final int c = -1;

    private ogr(Animator animator, Runnable runnable) {
        this.a = animator;
        this.b = runnable;
    }

    public static void b(Animator animator, Runnable runnable) {
        animator.addListener(new ogr(animator, runnable));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            return;
        }
        ogw.c().a(this.e);
    }
}

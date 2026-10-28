package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dro extends AnimatorListenerAdapter implements drx {
    private final View a;
    private boolean b = false;

    public dro(View view) {
        this.a = view;
    }

    @Override // defpackage.drx
    public final void c() {
        View view = this.a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? dso.a(view) : 0.0f));
    }

    @Override // defpackage.drx
    public final void d() {
        this.a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        dso.c(this.a, 1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (this.b) {
            this.a.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        dso.c(this.a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // defpackage.drx
    public final void f() {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // defpackage.drx
    public final void a(dsa dsaVar) {
    }

    @Override // defpackage.drx
    public final void b(dsa dsaVar) {
    }

    @Override // defpackage.drx
    public final /* synthetic */ void e(dsa dsaVar) {
    }

    @Override // defpackage.drx
    public final void g(dsa dsaVar) {
    }
}

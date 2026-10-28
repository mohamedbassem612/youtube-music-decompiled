package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dsv extends AnimatorListenerAdapter implements drx {
    final /* synthetic */ dsx a;
    private final ViewGroup b;
    private final View c;
    private final View d;
    private boolean e = true;

    public dsv(dsx dsxVar, ViewGroup viewGroup, View view, View view2) {
        this.a = dsxVar;
        this.b = viewGroup;
        this.c = view;
        this.d = view2;
    }

    private final void h() {
        this.d.setTag(R.id.save_overlay_view, null);
        this.b.getOverlay().remove(this.c);
        this.e = false;
    }

    @Override // defpackage.drx
    public final void a(dsa dsaVar) {
        if (this.e) {
            h();
        }
    }

    @Override // defpackage.drx
    public final void b(dsa dsaVar) {
        throw null;
    }

    @Override // defpackage.drx
    public final /* synthetic */ void e(dsa dsaVar) {
        dsaVar.F(this);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.b.getOverlay().remove(this.c);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.c;
        if (view.getParent() == null) {
            bac.h(this.b, view);
        } else {
            this.a.n();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.d;
            View view2 = this.c;
            view.setTag(R.id.save_overlay_view, view2);
            bac.h(this.b, view2);
            this.e = true;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // defpackage.drx
    public final void c() {
    }

    @Override // defpackage.drx
    public final void d() {
    }

    @Override // defpackage.drx
    public final void f() {
    }

    @Override // defpackage.drx
    public final /* synthetic */ void g(dsa dsaVar) {
    }
}

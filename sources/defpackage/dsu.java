package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dsu extends AnimatorListenerAdapter implements drx {
    private final View b;
    private final int c;
    private final ViewGroup d;
    private boolean f;
    boolean a = false;
    private final boolean e = true;

    public dsu(View view, int i) {
        this.b = view;
        this.c = i;
        this.d = (ViewGroup) view.getParent();
        i(true);
    }

    private final void h() {
        if (!this.a) {
            dso.d(this.b, this.c);
            ViewGroup viewGroup = this.d;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        i(false);
    }

    private final void i(boolean z) {
        ViewGroup viewGroup;
        if (!this.e || this.f == z || (viewGroup = this.d) == null) {
            return;
        }
        this.f = z;
        dsl.a(viewGroup, z);
    }

    @Override // defpackage.drx
    public final void b(dsa dsaVar) {
        throw null;
    }

    @Override // defpackage.drx
    public final void c() {
        i(false);
        if (this.a) {
            return;
        }
        dso.d(this.b, this.c);
    }

    @Override // defpackage.drx
    public final void d() {
        i(true);
        if (this.a) {
            return;
        }
        dso.d(this.b, 0);
    }

    @Override // defpackage.drx
    public final /* synthetic */ void e(dsa dsaVar) {
        dsaVar.F(this);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        h();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            dso.d(this.b, 0);
            ViewGroup viewGroup = this.d;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // defpackage.drx
    public final void f() {
    }

    @Override // defpackage.drx
    public final void a(dsa dsaVar) {
    }

    @Override // defpackage.drx
    public final /* synthetic */ void g(dsa dsaVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}

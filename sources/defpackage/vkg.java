package defpackage;

import android.animation.Animator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vkg implements Animator.AnimatorListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ ugc b;
    final /* synthetic */ vkl c;

    public vkg(vkl vklVar, boolean z, ugc ugcVar) {
        this.a = z;
        this.b = ugcVar;
        this.c = vklVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ugc ugcVar;
        boolean z = this.a;
        if (!z && (ugcVar = this.b) != null) {
            ugcVar.c();
        }
        this.c.e.kk(Boolean.valueOf(z));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z = this.a;
        if (!z) {
            vkl vklVar = this.c;
            vklVar.m.setVisibility(8);
            vklVar.q.setVisibility(0);
            ugc ugcVar = this.b;
            if (ugcVar != null) {
                ugcVar.c();
            }
        }
        vkl vklVar2 = this.c;
        vklVar2.e.kk(Boolean.valueOf(z));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a) {
            vkl vklVar = this.c;
            vklVar.m.setVisibility(0);
            vklVar.m.setAlpha(0.0f);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}

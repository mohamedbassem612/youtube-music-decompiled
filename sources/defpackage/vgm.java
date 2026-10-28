package defpackage;

import android.animation.Animator;
import com.google.android.libraries.youtube.rendering.ui.spec.motion.TouchFeedbackDrawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vgm implements Animator.AnimatorListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public vgm(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.$cid;
        if (i == 1) {
            ((jig) this.a).d();
        } else if (i == 3) {
            ((adfc) this.a).b();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.$cid;
        if (i == 0) {
            Object obj = this.a;
            ((vgn) obj).k.c((cc) obj);
            return;
        }
        if (i == 1) {
            ((jig) this.a).d();
            return;
        }
        if (i == 2) {
            vhc vhcVar = (vhc) this.a;
            vhcVar.p(vhcVar.G);
        } else if (i == 3) {
            ((adfc) this.a).b();
        } else if (i == 4) {
            ((ahud) this.a).ab(animator);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.$cid;
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
            return;
        }
        ((TouchFeedbackDrawable) this.a).a.a(0);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}

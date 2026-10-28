package defpackage;

import android.animation.Animator;
import android.graphics.ColorFilter;
import android.widget.ImageView;
import com.google.android.libraries.youtube.slimstatusbar.SlimStatusBar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeok implements Animator.AnimatorListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public aeok(aeoh aeohVar, SlimStatusBar slimStatusBar, int i) {
        this.$cid = i;
        this.a = slimStatusBar;
        this.b = aeohVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.$cid != 0) {
            ((ImageView) this.b).setColorFilter((ColorFilter) this.a);
        } else {
            Object obj = this.a;
            aeoh aeohVar = (aeoh) this.b;
            aeohVar.n(aeohVar.d, (SlimStatusBar) obj);
        }
    }

    public aeok(ImageView imageView, ColorFilter colorFilter, int i) {
        this.$cid = i;
        this.b = imageView;
        this.a = colorFilter;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}

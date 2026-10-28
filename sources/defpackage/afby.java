package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewOverlay;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class afby extends AnimatorListenerAdapter {
    final /* synthetic */ afcd a;

    public afby(afcd afcdVar) {
        this.a = afcdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        afcd afcdVar = this.a;
        ViewOverlay viewOverlayB = afcdVar.b();
        if (viewOverlayB != null) {
            Iterator it = afcdVar.d.iterator();
            while (it.hasNext()) {
                viewOverlayB.remove((afex) it.next());
            }
        }
    }
}

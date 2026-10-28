package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aezr extends AnimatorListenerAdapter {
    final /* synthetic */ aezu a;

    public aezr(aezu aezuVar) {
        this.a = aezuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        aezu aezuVar = this.a;
        List list = aezuVar.k;
        if (list == null || aezuVar.l) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((dta) it.next()).c(aezuVar);
        }
    }
}

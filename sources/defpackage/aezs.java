package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aezs extends AnimatorListenerAdapter {
    final /* synthetic */ aezu a;

    public aezs(aezu aezuVar) {
        this.a = aezuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        aezu aezuVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
        List list = aezuVar.k;
        if (list == null || aezuVar.l) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((dta) it.next()).b(aezuVar);
        }
    }
}

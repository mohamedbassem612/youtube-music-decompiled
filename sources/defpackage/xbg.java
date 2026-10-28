package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xbg extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ xbi b;

    public xbg(xbi xbiVar, boolean z) {
        this.a = z;
        this.b = xbiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        xbi xbiVar = this.b;
        xbiVar.g.setVisibility(8);
        if (this.a) {
            xbiVar.f.removeAllViews();
            xbiVar.q = false;
            wwk wwkVar = xbiVar.y;
            if (wwkVar != null) {
                wwkVar.d();
            }
            if (((vxz) xbiVar.k.io()).m(12, 45756228L)) {
                return;
            }
            xbiVar.x.a(xbiVar);
        }
    }
}

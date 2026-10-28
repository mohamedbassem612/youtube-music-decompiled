package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.animation.Animation;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nqi implements Animation.AnimationListener {
    final /* synthetic */ View a;
    private final fjw b;

    public nqi(View view) {
        this.a = view;
        agfr agfrVar = nqm.a;
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof fjw)) {
            parent = parent.getParent();
        }
        this.b = (fjw) parent;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) throws Throwable {
        fjw fjwVar = this.b;
        if (fjwVar != null) {
            fjwVar.setHasTransientState(false);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) throws Throwable {
        fjw fjwVar = this.b;
        if (fjwVar != null) {
            fjwVar.setHasTransientState(true);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}

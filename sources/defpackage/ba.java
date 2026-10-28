package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ba extends dy {
    public final bb a;

    public ba(bb bbVar) {
        bbVar.getClass();
        this.a = bbVar;
    }

    @Override // defpackage.dy
    public final void a(ViewGroup viewGroup) {
        ea eaVar = this.a.a;
        View view = eaVar.a.mView;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        eaVar.f(this);
        if (dd.aa(2)) {
            Objects.toString(eaVar);
        }
    }

    @Override // defpackage.dy
    public final void b(ViewGroup viewGroup) {
        Object obj;
        bb bbVar = this.a;
        if (bbVar.b()) {
            bbVar.a.f(this);
            return;
        }
        Context context = viewGroup.getContext();
        ea eaVar = bbVar.a;
        View view = eaVar.a.mView;
        context.getClass();
        eol eolVarA = bbVar.a(context);
        if (eolVarA == null || (obj = eolVarA.a) == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (eaVar.h != 1) {
            view.startAnimation((Animation) obj);
            eaVar.f(this);
            return;
        }
        viewGroup.startViewTransition(view);
        cg cgVar = new cg((Animation) obj, viewGroup, view);
        cgVar.setAnimationListener(new az(eaVar, viewGroup, view, this));
        view.startAnimation(cgVar);
        if (dd.aa(2)) {
            Objects.toString(eaVar);
        }
    }
}

package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bd extends dy {
    public final bb a;
    private AnimatorSet b;

    public bd(bb bbVar) {
        bbVar.getClass();
        this.a = bbVar;
    }

    @Override // defpackage.dy
    public final void a(ViewGroup viewGroup) {
        AnimatorSet animatorSet = this.b;
        bb bbVar = this.a;
        if (animatorSet == null) {
            bbVar.a.f(this);
            return;
        }
        ea eaVar = bbVar.a;
        if (eaVar.d) {
            animatorSet.reverse();
        } else {
            animatorSet.end();
        }
        if (dd.aa(2)) {
            boolean z = eaVar.d;
            Objects.toString(eaVar);
        }
    }

    @Override // defpackage.dy
    public final void b(ViewGroup viewGroup) {
        ea eaVar = this.a.a;
        AnimatorSet animatorSet = this.b;
        if (animatorSet == null) {
            eaVar.f(this);
            return;
        }
        animatorSet.start();
        if (dd.aa(2)) {
            Objects.toString(eaVar);
        }
    }

    @Override // defpackage.dy
    public final void c(ViewGroup viewGroup) {
        bd bdVar;
        bb bbVar = this.a;
        if (bbVar.b()) {
            return;
        }
        Context context = viewGroup.getContext();
        context.getClass();
        eol eolVarA = bbVar.a(context);
        this.b = (AnimatorSet) (eolVarA != null ? eolVarA.b : null);
        ea eaVar = bbVar.a;
        boolean z = eaVar.h == 3;
        View view = eaVar.a.mView;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.b;
        if (animatorSet != null) {
            bdVar = this;
            animatorSet.addListener(new bc(viewGroup, view, z, eaVar, bdVar));
        } else {
            bdVar = this;
        }
        AnimatorSet animatorSet2 = bdVar.b;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }

    @Override // defpackage.dy
    public final boolean d() {
        return true;
    }

    @Override // defpackage.dy
    public final void e(pw pwVar) {
        ea eaVar = this.a.a;
        AnimatorSet animatorSet = this.b;
        if (animatorSet == null) {
            eaVar.f(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !eaVar.a.mTransitioning) {
            return;
        }
        if (dd.aa(2)) {
            Objects.toString(eaVar);
        }
        long totalDuration = animatorSet.getTotalDuration();
        long j = (long) (pwVar.a * totalDuration);
        if (j == 0) {
            j = 1;
        }
        if (j == totalDuration) {
            j = (-1) + totalDuration;
        }
        if (dd.aa(2)) {
            Objects.toString(animatorSet);
            Objects.toString(eaVar);
        }
        animatorSet.setCurrentPlayTime(j);
    }
}

package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bc extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ea d;
    final /* synthetic */ bd e;

    public bc(ViewGroup viewGroup, View view, boolean z, ea eaVar, bd bdVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = eaVar;
        this.e = bdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        View view = this.b;
        ViewGroup viewGroup = this.a;
        viewGroup.endViewTransition(view);
        if (this.c || this.d.h == 3) {
            int i = this.d.h;
            view.getClass();
            dl.g(i, view, viewGroup);
        }
        bd bdVar = this.e;
        bdVar.a.a.f(bdVar);
        if (dd.aa(2)) {
            Objects.toString(this.d);
        }
    }
}

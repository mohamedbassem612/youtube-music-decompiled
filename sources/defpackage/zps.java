package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zps extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ zpt b;

    public zps(zpt zptVar, View view) {
        this.a = view;
        this.b = zptVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zpt zptVar = this.b;
        this.a.scrollBy(0, -zptVar.c);
        zptVar.c = 0;
    }
}

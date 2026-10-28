package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vmf extends AnimatorListenerAdapter {
    final /* synthetic */ vmo a;
    final /* synthetic */ vmo b;
    final /* synthetic */ yvh c;
    final /* synthetic */ aepb d;

    public vmf(aepb aepbVar, vmo vmoVar, vmo vmoVar2, yvh yvhVar) {
        this.a = vmoVar;
        this.b = vmoVar2;
        this.c = yvhVar;
        this.d = aepbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        aepb aepbVar = this.d;
        vmn vmnVar = (vmn) aepbVar.e;
        vmo vmoVar = this.a;
        float fB = vmnVar.b(vmoVar.a);
        vmo vmoVar2 = this.b;
        String str = vmoVar2.a;
        float fB2 = vmnVar.b(str);
        vmd vmdVar = (vmd) aepbVar.c;
        float f = vmdVar.a;
        if (fB < fB2) {
            vmoVar = vmoVar2;
        }
        vmi vmiVar = (vmi) aepbVar.b;
        vmiVar.c(vmoVar, f, vmnVar.b(str));
        vmiVar.a(vmdVar.a());
        aepbVar.m(this.c, 0.0d);
    }
}

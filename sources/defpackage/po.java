package defpackage;

import android.animation.Animator;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class po extends ps {
    final /* synthetic */ int a;
    final /* synthetic */ oh b;
    final /* synthetic */ pv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po(pv pvVar, oh ohVar, int i, float f, float f2, float f3, float f4, int i2, oh ohVar2) {
        super(ohVar, i, f, f2, f3, f4);
        this.c = pvVar;
        this.a = i2;
        this.b = ohVar2;
    }

    @Override // defpackage.ps, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (this.n) {
            return;
        }
        int i = this.a;
        pv pvVar = this.c;
        if (i <= 0) {
            pvVar.j.d(pvVar.m, this.b);
        } else {
            pvVar.a.add(this.b.a);
            this.k = true;
            pvVar.m.post(new bg(pvVar, this, 11, (short[]) null));
        }
        pv pvVar2 = this.c;
        oh ohVar = this.b;
        View view = pvVar2.p;
        View view2 = ohVar.a;
        if (view == view2) {
            pvVar2.t(view2);
        }
    }
}

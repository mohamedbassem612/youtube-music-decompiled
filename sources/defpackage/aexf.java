package defpackage;

import android.animation.Animator;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aexf extends aews {
    final /* synthetic */ ExtendedFloatingActionButton b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aexf(ExtendedFloatingActionButton extendedFloatingActionButton, auym auymVar) {
        super(extendedFloatingActionButton, auymVar);
        this.b = extendedFloatingActionButton;
    }

    @Override // defpackage.aews, defpackage.aexo
    public final void f() {
        super.f();
        this.b.o = 0;
    }

    @Override // defpackage.aews, defpackage.aexo
    public final void g(Animator animator) {
        super.g(animator);
        ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.o = 2;
    }

    @Override // defpackage.aexo
    public final int h() {
        return R.animator.mtrl_extended_fab_show_motion_spec;
    }

    @Override // defpackage.aexo
    public final void i() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.setAlpha(1.0f);
        extendedFloatingActionButton.setScaleY(1.0f);
        extendedFloatingActionButton.setScaleX(1.0f);
    }

    @Override // defpackage.aexo
    public final boolean j() {
        return this.b.p();
    }

    @Override // defpackage.aexo
    public final void k() {
    }
}

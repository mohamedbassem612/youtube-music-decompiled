package defpackage;

import android.animation.Animator;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aexe extends aews {
    final /* synthetic */ ExtendedFloatingActionButton b;
    private boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aexe(ExtendedFloatingActionButton extendedFloatingActionButton, auym auymVar) {
        super(extendedFloatingActionButton, auymVar);
        this.b = extendedFloatingActionButton;
    }

    @Override // defpackage.aews, defpackage.aexo
    public final void e() {
        super.e();
        this.c = true;
    }

    @Override // defpackage.aews, defpackage.aexo
    public final void f() {
        super.f();
        ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        extendedFloatingActionButton.o = 0;
        if (this.c) {
            return;
        }
        extendedFloatingActionButton.setVisibility(8);
    }

    @Override // defpackage.aews, defpackage.aexo
    public final void g(Animator animator) {
        super.g(animator);
        this.c = false;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.o = 1;
    }

    @Override // defpackage.aexo
    public final int h() {
        return R.animator.mtrl_extended_fab_hide_motion_spec;
    }

    @Override // defpackage.aexo
    public final void i() {
        this.b.setVisibility(8);
    }

    @Override // defpackage.aexo
    public final boolean j() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        int visibility = extendedFloatingActionButton.getVisibility();
        int i = extendedFloatingActionButton.o;
        if (visibility == 0) {
            if (i == 1) {
                return true;
            }
        } else if (i != 2) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aexo
    public final void k() {
    }
}

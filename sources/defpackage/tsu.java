package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tsu implements tuu {
    @Override // defpackage.tuu
    public final void a(View view, long j, tut tutVar) {
        int i = bac.a;
        view.setAlpha(1.0f);
        ci ciVarX = bac.x(view);
        ciVarX.q(0.0f);
        ciVarX.r(j);
        ciVarX.t(new tuw(tutVar));
    }

    @Override // defpackage.tuu
    public final void b(View view, long j, tut tutVar) {
        int i = bac.a;
        view.setAlpha(0.0f);
        ci ciVarX = bac.x(view);
        ciVarX.q(1.0f);
        ciVarX.r(j);
        ciVarX.t(new tuw(tutVar));
    }

    @Override // defpackage.tuu
    public final void c(View view) {
        bac.x(view).o();
        view.setAlpha(1.0f);
    }

    @Override // defpackage.tuu
    public final /* synthetic */ void d() {
    }
}

package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class voc implements tuu {
    private static int e(View view) {
        return ((View) view.getParent()).getWidth();
    }

    @Override // defpackage.tuu
    public final void a(View view, long j, tut tutVar) {
        ci ciVarX = bac.x(view);
        ciVarX.x();
        ciVarX.v(vog.b(view, e(view)));
        ciVarX.r(j);
        ciVarX.t(new tuw(tutVar));
        ciVarX.p();
    }

    @Override // defpackage.tuu
    public final void b(View view, long j, tut tutVar) {
        view.setX(vog.b(view, e(view)));
        ci ciVarX = bac.x(view);
        ciVarX.x();
        ciVarX.v(0.0f);
        ciVarX.r(j);
        ciVarX.t(new tuw(tutVar));
        ciVarX.p();
    }

    @Override // defpackage.tuu
    public final void c(View view) {
        view.setX(0.0f);
        bac.x(view).o();
    }

    @Override // defpackage.tuu
    public final /* synthetic */ void d() {
    }
}

package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vof implements tuu {
    private final View a;
    private final boolean b;

    public vof(View view, boolean z) {
        this.a = view;
        this.b = z;
    }

    private final float e() {
        boolean z = this.b;
        int height = this.a.getHeight();
        if (z) {
            height = -height;
        }
        return height;
    }

    @Override // defpackage.tuu
    public final void a(View view, long j, tut tutVar) {
        ci ciVarX = bac.x(view);
        ciVarX.x();
        ciVarX.w(e());
        ciVarX.r(j);
        ciVarX.t(new tuw(tutVar));
        ciVarX.p();
    }

    @Override // defpackage.tuu
    public final void b(View view, long j, tut tutVar) {
        view.setY(e());
        ci ciVarX = bac.x(view);
        ciVarX.x();
        ciVarX.w(0.0f);
        ciVarX.r(j);
        ciVarX.t(new tuw(tutVar));
        ciVarX.p();
    }

    @Override // defpackage.tuu
    public final void c(View view) {
        view.setY(0.0f);
        bac.x(view).o();
    }

    @Override // defpackage.tuu
    public final /* synthetic */ void d() {
    }
}

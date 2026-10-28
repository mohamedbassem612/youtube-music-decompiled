package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class acys extends bdq {
    final /* synthetic */ acyt a;

    public acys(acyt acytVar) {
        this.a = acytVar;
    }

    @Override // defpackage.bdq
    public final int b(View view) {
        return view.getHeight();
    }

    @Override // defpackage.bdq
    public final void c(View view, int i) {
        this.a.e = view.getTop();
    }

    @Override // defpackage.bdq
    public final void e(final View view, float f, float f2) {
        int iC = twm.c(view.getResources().getDisplayMetrics(), 10);
        int top = view.getTop();
        final acyt acytVar = this.a;
        if (top <= acytVar.e + iC || f2 < 0.0f) {
            if (view.getTop() <= acytVar.e || view == null || view == acytVar.d) {
                return;
            }
            blf blfVar = acytVar.c;
            if (blfVar != null) {
                blfVar.j();
            }
            blf blfVarS = acytVar.s(view, f2);
            blfVarS.e(new acyp(acytVar, 0));
            acytVar.c = blfVarS;
            acytVar.c.i(acytVar.e);
            return;
        }
        if (view == null || view == acytVar.d) {
            return;
        }
        blf blfVar2 = acytVar.c;
        if (blfVar2 != null) {
            blfVar2.j();
        }
        blf blfVarS2 = acytVar.s(view, f2);
        blfVarS2.e(new acyp(acytVar, 2));
        acytVar.c = blfVarS2;
        acytVar.d = view;
        acytVar.c.i(acytVar.e + view.getHeight());
        acytVar.c.e(new bkz() { // from class: acyq
            @Override // defpackage.bkz
            public final void a(boolean z, float f3) {
                acyt acytVar2 = acytVar;
                acytVar2.d = null;
                acytVar2.c = null;
                aevj aevjVar = acytVar2.b;
                if (aevjVar != null) {
                    aevjVar.a(view);
                }
            }
        });
    }

    @Override // defpackage.bdq
    public final boolean f(View view, int i) {
        return view != this.a.d;
    }

    @Override // defpackage.bdq
    public final int g(View view, int i) {
        return view.getLeft();
    }

    @Override // defpackage.bdq
    public final int h(View view, int i) {
        int height = view.getHeight();
        int i2 = this.a.e;
        return ast.c(i, i2, height + i2);
    }

    @Override // defpackage.bdq
    public final void i(View view, int i, int i2, int i3) {
        view.setAlpha(this.a.r(view, i2));
    }
}

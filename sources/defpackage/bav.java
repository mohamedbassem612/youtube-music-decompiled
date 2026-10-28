package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bav extends bbb {
    final WindowInsets.Builder a;

    public bav(bbn bbnVar) {
        super(bbnVar);
        WindowInsets windowInsetsE = bbnVar.e();
        this.a = windowInsetsE != null ? new WindowInsets.Builder(windowInsetsE) : new WindowInsets.Builder();
    }

    @Override // defpackage.bbb
    public bbn a() {
        i();
        bbn bbnVarO = bbn.o(this.a.build(), null);
        bbnVarO.r(this.b);
        bbnVarO.q(null);
        bbnVarO.u(this.c);
        bbnVarO.v(this.d);
        return bbnVarO;
    }

    @Override // defpackage.bbb
    public void b(avw avwVar) {
        this.a.setStableInsets(avwVar.a());
    }

    @Override // defpackage.bbb
    public void c(avw avwVar) {
        this.a.setSystemWindowInsets(avwVar.a());
    }

    @Override // defpackage.bbb
    public void d(avw avwVar) {
        this.a.setMandatorySystemGestureInsets(avwVar.a());
    }

    @Override // defpackage.bbb
    public void e(avw avwVar) {
        this.a.setSystemGestureInsets(avwVar.a());
    }

    @Override // defpackage.bbb
    public void f(avw avwVar) {
        this.a.setTappableElementInsets(avwVar.a());
    }

    public bav() {
        this.a = new WindowInsets.Builder();
    }
}

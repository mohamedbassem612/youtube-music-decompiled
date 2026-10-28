package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class uhv implements ugl, ukf {
    public boolean a;
    private final cc b;

    public uhv(cc ccVar, boolean z) {
        this.b = ccVar;
        if (z) {
            return;
        }
        k();
    }

    @Override // defpackage.ugl
    public void iY(ugk ugkVar) {
        k();
    }

    public final void k() {
        if (this.a) {
            return;
        }
        cc ccVar = this.b;
        ccVar.getLifecycle().b(new uht(this, ccVar));
        this.a = true;
    }

    protected void d() {
    }

    protected void g() {
    }

    protected void h() {
    }

    protected void i() {
    }

    protected void iV() {
    }

    protected void iW() {
    }

    protected void iX() {
    }

    @Override // defpackage.ugl
    public final void iZ() {
    }

    protected void j(View view) {
    }
}

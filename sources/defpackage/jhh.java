package defpackage;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jhh implements adwj, dqn {
    public adsr a;
    public boolean b = true;
    private final SwipeRefreshLayout d;
    private final jlh e;

    public jhh(SwipeRefreshLayout swipeRefreshLayout, jlh jlhVar) {
        this.d = swipeRefreshLayout;
        this.e = jlhVar;
        swipeRefreshLayout.a = this;
    }

    @Override // defpackage.dqn
    public final void a() {
        adsr adsrVar = this.a;
        if (adsrVar == null || !adsrVar.jf()) {
            this.d.k(false);
        } else {
            this.e.b();
            this.a.hP();
        }
    }

    @Override // defpackage.adwj
    public final void b(int i) {
        if (i == 1) {
            this.b = true;
            this.d.k(false);
        } else if (i != 2) {
            this.b = false;
            this.d.k(false);
        } else {
            this.b = true;
            this.d.k(true);
        }
        this.d.setEnabled(this.b);
    }
}

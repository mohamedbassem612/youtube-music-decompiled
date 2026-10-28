package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jkr {
    public final avmb a;
    public final tbt b;
    public final avlh c;
    public boolean d = false;
    public boolean e = false;
    public ViewGroup f;
    public View g;
    public final vxz h;
    private final xit i;
    private xir j;

    public jkr(avmb avmbVar, xit xitVar, avlh avlhVar, vxz vxzVar, tbt tbtVar) {
        this.a = avmbVar;
        this.i = xitVar;
        this.c = avlhVar;
        this.h = vxzVar;
        this.b = tbtVar;
    }

    public final void a() {
        if (!this.d || this.e) {
            return;
        }
        this.f.removeView(this.g);
        this.e = true;
        this.d = false;
    }

    public final void b(String str) {
        xir xirVarN = this.j;
        if (xirVarN == null) {
            xirVarN = this.i.n(107);
            this.j = xirVarN;
        }
        xirVarN.n(str);
    }

    public final void c() {
        b("sa_fo");
        this.a.e(new iqc(this, 4));
    }
}

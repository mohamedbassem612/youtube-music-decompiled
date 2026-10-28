package defpackage;

import android.app.Activity;
import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class roj extends rnp {
    public roh h;
    public final dd i;

    public roj(vxe vxeVar, Handler handler, Activity activity) {
        super(vxeVar, handler);
        this.i = ((cf) activity).getSupportFragmentManager();
    }

    @Override // defpackage.rnp
    public final void b() {
        this.h.iQ(false, false, false);
    }

    @Override // defpackage.rnp
    protected final void c(int i) {
        super.c(i);
        this.h.k();
    }

    @Override // defpackage.rnp
    protected final void d(int i) {
        super.d(i);
        this.h.k();
    }

    @Override // defpackage.rnp
    public final void e(akyy akyyVar) {
        roh rohVar = this.h;
        rohVar.l();
        rohVar.m(akyyVar);
    }

    @Override // defpackage.rnp
    public final void f(roq roqVar) {
        roh rohVar = this.h;
        rohVar.l();
        rohVar.m(roqVar);
    }

    @Override // defpackage.rnp
    public final void g(aoma aomaVar) {
        roh rohVar = this.h;
        rohVar.l();
        rohVar.m(aomaVar);
    }

    @Override // defpackage.rnp
    protected final void h(aomb aombVar) {
        roh rohVar = this.h;
        rohVar.l();
        rohVar.m(aombVar);
    }

    @Override // defpackage.rnp
    protected final void i(akza akzaVar) {
        roh rohVar = this.h;
        rohVar.l();
        rohVar.m(akzaVar);
    }
}

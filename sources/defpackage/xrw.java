package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class xrw implements View.OnClickListener {
    private final dii a;
    private final xre b;
    private final Boolean c;
    private final xrd d;
    private final tbt e;

    public xrw(dii diiVar, xre xreVar, Boolean bool, dov dovVar, xrd xrdVar, tbt tbtVar) {
        diiVar.getClass();
        this.a = diiVar;
        xreVar.getClass();
        this.b = xreVar;
        bool.getClass();
        this.c = bool;
        dovVar.getClass();
        xrdVar.getClass();
        this.d = xrdVar;
        tbtVar.getClass();
        this.e = tbtVar;
    }

    public void a() {
        this.b.a(this.a);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        dii diiVar = this.a;
        if (this.d.a(xrx.m(diiVar), new xrv(this, 0))) {
            return;
        }
        if (!xrx.m(diiVar) || this.c.booleanValue()) {
            a();
        } else {
            this.e.c(new xqp(diiVar));
        }
    }
}

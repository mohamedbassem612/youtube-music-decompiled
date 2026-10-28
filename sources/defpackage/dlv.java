package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dlv {
    public final dlx a;
    public final dmt b;
    public final List c;
    public final dpg d;
    public dpd e;
    public final dnx f;

    public dlv(dlx dlxVar, awqg awqgVar, awqk awqkVar) {
        this.a = dlxVar;
        this.b = new dmm();
        this.c = dlxVar.d;
        dlx dlxVar2 = new dlx(dlxVar.a, dlxVar.b, dlxVar.c, dlxVar.r, atqq.ak(dlxVar.d, new dmn(new ank(this, 5))), dlxVar.e, dlxVar.q, dlxVar.f, dlxVar.g, dlxVar.h, dlxVar.i, dlxVar.j, dlxVar.k, dlxVar.l, dlxVar.m, dlxVar.n);
        dlxVar2.o = dlxVar.o;
        dlxVar2.p = dlxVar.p;
        dpg dpgVar = (dpg) awqgVar.invoke(dlxVar2);
        this.d = dpgVar;
        dov dovVar = new dov(dpgVar);
        String str = dlxVar.b;
        this.f = new dnx(dovVar, str == null ? ":memory:" : str, awqkVar);
        b();
    }

    private final void b() {
        dpg dpgVar = this.d;
        if (dpgVar != null) {
            dpgVar.d(this.a.q == 3);
        }
    }

    public final void a(dpt dptVar) {
        azu.i(dptVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        azu.i(dptVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + this.b.b + "')");
    }

    public dlv(dlx dlxVar, dmt dmtVar, awqk awqkVar) {
        this.a = dlxVar;
        this.b = dmtVar;
        this.c = dlxVar.d;
        dpg dpgVarA = dlxVar.c.a(azu.j(dlxVar.a, dlxVar.b, new dpe(this, dmtVar.a), false, false));
        this.d = dpgVarA;
        dov dovVar = new dov(dpgVarA);
        String str = dlxVar.b;
        this.f = new dnx(dovVar, str == null ? ":memory:" : str, awqkVar);
        b();
    }
}

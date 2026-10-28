package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rld implements advb {
    private final Context a;
    private final rps b;
    private final rpt c;
    private final xgn d;
    private final awmd e;
    private admh f;
    private final vxz g;

    public rld(Context context, rps rpsVar, rpt rptVar, xgn xgnVar, awmd awmdVar, vxz vxzVar) {
        this.a = context;
        this.b = rpsVar;
        this.c = rptVar;
        this.d = xgnVar;
        this.e = awmdVar;
        this.g = vxzVar;
    }

    @Override // defpackage.advb
    public final void b(Class cls) {
        ahno.F(cls == wnt.class);
        this.f = new adlg();
        vxz vxzVar = this.g;
        if (vxzVar.m(56, 45750297L)) {
            this.f.d(rlh.class, new rlg(this.a, this.c, vxzVar.m(56, 45750297L)));
        }
        this.f.d(airn.class, new rlm(this.a, (vxe) this.e.io(), this.b, this.d, vxzVar.m(56, 45750297L)));
    }

    @Override // defpackage.agfr
    public final /* synthetic */ Object io() {
        return this.f;
    }
}

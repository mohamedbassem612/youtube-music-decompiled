package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xhw implements xhy {
    public final xgo a;
    public final xgt b;
    private final awmd c;
    private final Executor d;
    private final xpl e;

    public xhw(xgo xgoVar, xpl xplVar, awmd awmdVar, Executor executor, xgt xgtVar) {
        this.a = xgoVar;
        this.e = xplVar;
        this.c = awmdVar;
        this.d = executor;
        this.b = xgtVar;
    }

    @Override // defpackage.xhy
    public final /* bridge */ /* synthetic */ xhz d(xgz xgzVar) {
        this.d.execute(new vwh((Object) this, (Object) xgzVar, (Object) ((xej) this.c.io()).a(), 15, (byte[]) null));
        return this.e.f();
    }

    @Override // defpackage.xhy
    public final /* bridge */ /* synthetic */ xhz e(xgz xgzVar, xgz xgzVar2) {
        this.d.execute(new xhv(this, xgzVar, xgzVar2, ((xej) this.c.io()).a(), 0));
        return this.e.f();
    }

    @Override // defpackage.xhy
    public final ajwo f(ajwo ajwoVar) {
        return xgh.a(this.b, ajwoVar);
    }

    @Override // defpackage.xhy
    public final String i() {
        throw null;
    }

    @Override // defpackage.xhy
    public final void r(String str) {
        throw null;
    }

    @Override // defpackage.xhy
    public final void s(xgz xgzVar, String str) {
        throw null;
    }

    @Override // defpackage.xhy
    public final void t() {
        this.d.execute(new wtg(this, ((xej) this.c.io()).a(), 19));
    }
}

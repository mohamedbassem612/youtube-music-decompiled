package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xgf extends xge implements xgv {
    private static final agrf m = agrf.h("com/google/android/libraries/youtube/logging/interaction/DefaultLayersInteractionLogger");
    private int n;
    private final xgu o;
    private final awmd p;

    public xgf(xgu xguVar, dov dovVar, txp txpVar, tbt tbtVar, xgo xgoVar, xgp xgpVar, awmd awmdVar, vxz vxzVar, awmd awmdVar2, Executor executor, tqj tqjVar, awmd awmdVar3) {
        super(dovVar, txpVar, tbtVar, xgoVar, xgpVar, vxzVar, awmdVar2, executor, tqjVar, awmdVar3, false, false);
        this.n = -1;
        this.o = xguVar;
        this.p = awmdVar;
    }

    private final synchronized int Z() {
        int i = this.n;
        if (i == -1) {
            i = (int) ((atox) ((tpq) this.p.io()).c()).g;
        }
        if (i >= 60000 || i < 10000) {
            i = 10000;
        }
        int i2 = i + 1;
        this.n = i2;
        taf.j(((tpq) this.p.io()).b(new iow(i2, 2)), new tsq(14));
        return this.n;
    }

    private final void aa(xgt xgtVar) {
        if (xgtVar != null) {
            xgp xgpVar = this.d;
            xgpVar.d(this.o, xgtVar);
            xgpVar.b(xgtVar, this.e);
        }
    }

    @Override // defpackage.xge, defpackage.xgn
    public final void C(xgt xgtVar) {
        W(xgtVar, true);
        aa(xgtVar);
    }

    @Override // defpackage.xge
    protected final argn U(int i, int i2) {
        aihf aihfVarCreateBuilder = argn.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        argn argnVar = (argn) aihfVarCreateBuilder.instance;
        argnVar.b |= 2;
        argnVar.d = i;
        if (i2 > 0) {
            aihfVarCreateBuilder.copyOnWrite();
            argn argnVar2 = (argn) aihfVarCreateBuilder.instance;
            argnVar2.b |= 4;
            argnVar2.e = i2;
        } else {
            aihfVarCreateBuilder.copyOnWrite();
            argn argnVar3 = (argn) aihfVarCreateBuilder.instance;
            argnVar3.b |= 4;
            argnVar3.e = 0;
        }
        int iZ = Z();
        aihfVarCreateBuilder.copyOnWrite();
        argn argnVar4 = (argn) aihfVarCreateBuilder.instance;
        argnVar4.b |= 8;
        argnVar4.f = iZ;
        return (argn) aihfVarCreateBuilder.build();
    }

    @Override // defpackage.xge
    public final void W(xgt xgtVar, boolean z) {
        super.W(xgtVar, z);
        aa(xgtVar);
    }

    @Override // defpackage.xgv
    public final void Y(ameb amebVar, xgz xgzVar, boolean z) {
        if (!z) {
            o(amebVar, xgzVar, null);
        } else {
            this.d.e(this.o, a());
        }
    }

    @Override // defpackage.xge, defpackage.xgn
    public final xgt a() {
        xgt xgtVarA = this.d.a(this.o);
        return xgtVarA == null ? super.a() : xgtVarA;
    }

    @Override // defpackage.xge, defpackage.xhy
    public final String i() {
        xgt xgtVarA = a();
        return xgtVarA == null ? "" : xgtVarA.a;
    }

    @Override // defpackage.xge, defpackage.xgn
    public final void B() {
    }
}

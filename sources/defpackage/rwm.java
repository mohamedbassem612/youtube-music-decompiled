package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rwm implements rwq {
    private final awmd a;
    private final awmd b;
    private final awmd c;
    private final awmd d;
    private final awmd e;
    private final awmd f;
    private final mbc g;
    private final awmd h;
    private final awmd i;
    private final awmd j;
    private final awmd k;
    private final Executor l;
    private final Executor m;
    private final rmp n;
    private final ayq o;

    public rwm(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, mbc mbcVar, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, Executor executor, Executor executor2, rmp rmpVar, ayq ayqVar) {
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = awmdVar3;
        this.d = awmdVar4;
        this.e = awmdVar5;
        this.f = awmdVar6;
        this.g = mbcVar;
        this.h = awmdVar7;
        this.l = executor2;
        this.m = executor;
        this.n = rmpVar;
        this.o = ayqVar;
        this.i = awmdVar8;
        this.j = awmdVar9;
        this.k = awmdVar10;
    }

    @Override // defpackage.rwq
    public final rvo a(smr smrVar) throws rwp {
        if (nrj.d(ruz.class, smrVar)) {
            return new ruz(new rvr((rsk) this.e.io(), smrVar, this.o), this.l, this.m, (rtl) this.b.io(), (aazw) this.d.io(), (aehs) this.f.io(), (rsi) this.a.io(), (sdo) this.c.io(), this.g, (sac) this.h.io(), (atzn) this.i.io(), (vyo) this.j.io(), (abfv) this.k.io());
        }
        throw new rwp("No supported adapters for AdBreakRequestFulfillmentAdapterFactory");
    }
}

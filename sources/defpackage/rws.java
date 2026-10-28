package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rws implements rwq {
    private final awmd a;
    private final awmd b;
    private final awmd c;
    private final awmd d;
    private final awmd e;
    private final awmd f;
    private final awmd g;
    private final awmd h;
    private final awmd i;
    private final awmd j;
    private final mbc k;
    private final awmd l;
    private final awmd m;
    private final Executor n;
    private final Executor o;
    private final rmp p;
    private final ayq q;

    public rws(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, mbc mbcVar, awmd awmdVar12, ayq ayqVar, Executor executor, Executor executor2, rmp rmpVar) {
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = awmdVar3;
        this.d = awmdVar4;
        this.e = awmdVar5;
        this.f = awmdVar6;
        this.g = awmdVar7;
        this.i = awmdVar8;
        this.j = awmdVar9;
        this.m = awmdVar11;
        this.k = mbcVar;
        this.l = awmdVar12;
        this.n = executor2;
        this.o = executor;
        this.q = ayqVar;
        this.h = awmdVar10;
        this.p = rmpVar;
    }

    @Override // defpackage.rwq
    public final rvo a(smr smrVar) throws rwp {
        if (nrj.d(rwe.class, smrVar)) {
            return new rwe(new rvr((rsk) this.d.io(), smrVar, this.q));
        }
        if (nrj.d(rwd.class, smrVar)) {
            rvr rvrVar = new rvr((rsk) this.d.io(), smrVar, this.q);
            Executor executor = this.n;
            Executor executor2 = this.o;
            return new rwd(rvrVar, executor, executor2, (aehs) this.e.io(), (sdm) this.f.io(), (sbt) this.g.io(), (tld) this.i.io(), (xte) this.h.io(), (sdo) this.m.io(), (rnj) this.l.io());
        }
        if (nrj.d(rwl.class, smrVar)) {
            return new rwl(new rvr((rsk) this.d.io(), smrVar, this.q), this.n, this.o, (sdm) this.f.io(), (aehs) this.e.io());
        }
        if (!nrj.d(rwi.class, smrVar)) {
            if (nrj.d(rwh.class, smrVar)) {
                return new rwh(new rvr((rsk) this.d.io(), smrVar, this.q), this.n, this.o, (rtl) this.b.io(), (aazw) this.c.io(), (sdm) this.f.io(), (aehs) this.e.io(), (rsi) this.a.io(), (tld) this.i.io(), (rzv) this.j.io(), this.k);
            }
            throw new rwp("No supported adapters for PlayerBytesFulfillmentAdapterFactory");
        }
        rvr rvrVar2 = new rvr((rsk) this.d.io(), smrVar, this.q);
        Executor executor3 = this.n;
        Executor executor4 = this.o;
        return new rwi(rvrVar2, executor3, executor4, (aehs) this.e.io());
    }
}

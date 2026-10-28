package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rwo implements rwq {
    private final awmd a;
    private final awmd b;
    private final mbc c;
    private final rnj d;
    private final ayq e;

    public rwo(awmd awmdVar, rnj rnjVar, awmd awmdVar2, mbc mbcVar, ayq ayqVar) {
        this.a = awmdVar;
        this.d = rnjVar;
        this.b = awmdVar2;
        this.c = mbcVar;
        this.e = ayqVar;
    }

    @Override // defpackage.rwq
    public final rvo a(smr smrVar) throws rwp {
        if (nrj.d(rvl.class, smrVar)) {
            return new rvl(new rvr((rsk) this.a.io(), smrVar, this.e), (aehs) this.b.io());
        }
        if (nrj.d(rvm.class, smrVar)) {
            return new rvm(new rvr((rsk) this.a.io(), smrVar, this.e), this.d, (aehs) this.b.io(), this.c);
        }
        if (nrj.d(rvn.class, smrVar)) {
            return new rvn(new rvr((rsk) this.a.io(), smrVar, this.e), (aehs) this.b.io());
        }
        throw new rwp("No supported adapters for ForecastingSlotFulfillmentAdapterFactory");
    }
}

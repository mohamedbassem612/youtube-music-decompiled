package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rwr implements rwq {
    private final /* synthetic */ int $cid;
    private final awmd a;
    private final awmd b;
    private final ayq c;

    public rwr(awmd awmdVar, awmd awmdVar2, ayq ayqVar, int i) {
        this.$cid = i;
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = ayqVar;
    }

    @Override // defpackage.rwq
    public final rvo a(smr smrVar) throws rwp {
        if (this.$cid == 0) {
            if (nrj.d(rwb.class, smrVar)) {
                return new rwb(new rvr((rsk) this.a.io(), smrVar, this.c), (aehs) this.b.io());
            }
            throw new rwp("No supported adapters for LockscreenSlotFulfillmentAdapterFactory");
        }
        if (nrj.d(rvs.class, smrVar)) {
            return new rvs(new rvr((rsk) this.a.io(), smrVar, this.c), (aehs) this.b.io());
        }
        if (nrj.d(rvv.class, smrVar)) {
            return new rvv(new rvr((rsk) this.a.io(), smrVar, this.c), (aehs) this.b.io());
        }
        if (nrj.d(rvw.class, smrVar)) {
            return new rvw(new rvr((rsk) this.a.io(), smrVar, this.c), (aehs) this.b.io());
        }
        if (nrj.d(rvx.class, smrVar)) {
            return new rvx(new rvr((rsk) this.a.io(), smrVar, this.c), (aehs) this.b.io());
        }
        if (nrj.d(rvu.class, smrVar)) {
            return new rvu(new rvr((rsk) this.a.io(), smrVar, this.c), (aehs) this.b.io());
        }
        if (nrj.d(rvy.class, smrVar)) {
            return new rvy(new rvr((rsk) this.a.io(), smrVar, this.c));
        }
        if (nrj.d(rvt.class, smrVar)) {
            return new rvt(new rvr((rsk) this.a.io(), smrVar, this.c));
        }
        throw new rwp("No supported adapters for InPlayerSlotFulfillmentAdapterFactory");
    }
}

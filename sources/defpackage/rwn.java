package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rwn implements rwq {
    private final /* synthetic */ int $cid;
    private final awmd a;
    private final awmd b;
    private final Executor c;
    private final Executor d;
    private final abmt e;
    private final Object f;
    private final ayq g;

    public rwn(awmd awmdVar, awmd awmdVar2, Executor executor, Executor executor2, rmp rmpVar, ayq ayqVar, abmt abmtVar, int i) {
        this.$cid = i;
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = executor;
        this.d = executor2;
        this.f = rmpVar;
        this.g = ayqVar;
        this.e = abmtVar;
    }

    @Override // defpackage.rwq
    public final rvo a(smr smrVar) throws rwp {
        if (this.$cid != 0) {
            if (nrj.d(rvz.class, smrVar)) {
                return new rvz(new rvr((rsk) this.a.io(), smrVar, this.g), this.c, this.d, (aehs) this.b.io(), smrVar);
            }
            if (nrj.d(rvi.class, smrVar)) {
                return new rvi(new rvr((rsk) this.a.io(), smrVar, this.g), (aehs) this.b.io());
            }
            if (nrj.d(rvc.class, smrVar)) {
                return new rvc(new rvr((rsk) this.a.io(), smrVar, this.g), (aehs) this.b.io(), smrVar);
            }
            if (this.e.W() && nrj.d(rvh.class, smrVar)) {
                return new rvh(new rvr((rsk) this.a.io(), smrVar, this.g), (aehs) this.b.io(), smrVar);
            }
            if (nrj.d(rvb.class, smrVar)) {
                return new rvb(new rvr((rsk) this.a.io(), smrVar, this.g));
            }
            throw new rwp("No supported adapters for BelowPlayerFulfillmentAdapterFactory");
        }
        if ((taq.aW((vyo) this.f) || this.e.W()) && nrj.d(rvk.class, smrVar)) {
            return new rvk(new rvr((rsk) this.a.io(), smrVar, this.g), (aehs) this.b.io(), smrVar);
        }
        if (nrj.d(rwa.class, smrVar)) {
            return new rwa(new rvr((rsk) this.a.io(), smrVar, this.g), this.c, this.d, (aehs) this.b.io(), smrVar);
        }
        if (nrj.d(rvd.class, smrVar)) {
            return new rvd(new rvr((rsk) this.a.io(), smrVar, this.g), (aehs) this.b.io(), smrVar);
        }
        if (nrj.d(rvj.class, smrVar)) {
            rmp.k(smrVar, "[BelowPlayerImmersiveFulfillmentAdapterFactory] create deprecated BelowPlayerInstreamContentVideoImmersiveFulfillmentAdapter");
            return new rvj(new rvr((rsk) this.a.io(), smrVar, this.g), (aehs) this.b.io(), smrVar);
        }
        if (nrj.d(rva.class, smrVar)) {
            return new rva(new rvr((rsk) this.a.io(), smrVar, this.g), (aehs) this.b.io(), smrVar);
        }
        if (nrj.d(rvf.class, smrVar)) {
            return new rvf(new rvr((rsk) this.a.io(), smrVar, this.g), (aehs) this.b.io());
        }
        if (nrj.d(rvg.class, smrVar)) {
            return new rvg(new rvr((rsk) this.a.io(), smrVar, this.g));
        }
        throw new rwp("No supported adapters for BelowPlayerImmersiveFulfillmentAdapterFactory");
    }

    public rwn(awmd awmdVar, awmd awmdVar2, vyo vyoVar, ayq ayqVar, Executor executor, Executor executor2, abmt abmtVar, int i) {
        this.$cid = i;
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = executor;
        this.d = executor2;
        this.f = vyoVar;
        this.g = ayqVar;
        this.e = abmtVar;
    }
}

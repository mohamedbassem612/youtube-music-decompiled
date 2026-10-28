package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ryf implements rye {
    private final awmd a;
    private final awmd b;
    private final awmd c;
    private final awmd d;
    private final Executor e;
    private final vyo f;

    public ryf(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, Executor executor, vyo vyoVar) {
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = awmdVar3;
        this.d = awmdVar4;
        this.e = executor;
        this.f = vyoVar;
    }

    @Override // defpackage.rye
    public final rxj U(smr smrVar, sko skoVar) throws ryd {
        if (nrj.e(rxm.class, smrVar, skoVar)) {
            return new rxm((rsk) this.a.io(), this.e, (sgv) this.b.io(), (rsr) this.c.io(), (snv) this.d.io(), smrVar, skoVar, this.f);
        }
        if (nrj.e(rxl.class, smrVar, skoVar)) {
            return new rxl((rsk) this.a.io(), this.e, (sgv) this.b.io(), (rsr) this.c.io(), (snv) this.d.io(), smrVar, skoVar, this.f);
        }
        throw new ryd("LockScreenLayoutRenderingAdapterFactory received unrecognized slot/layout pairing", 52);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ryb implements rye {
    private final awmd a;
    private final awmd b;
    private final awmd c;
    private final awmd d;

    public ryb(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4) {
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = awmdVar3;
        this.d = awmdVar4;
    }

    @Override // defpackage.rye
    public final rxj U(smr smrVar, sko skoVar) throws ryd {
        if (nrj.e(rxd.class, smrVar, skoVar)) {
            return new rxd((rsk) this.a.io(), (saq) this.b.io(), (spy) this.c.io(), smrVar, skoVar, (vyo) this.d.io());
        }
        if (nrj.e(rxe.class, smrVar, skoVar)) {
            return new rxe((rsk) this.a.io(), (saq) this.b.io(), smrVar, skoVar);
        }
        throw new ryd("ForecastingAdRenderingAdapterFactory received unsupported metadata", 52);
    }
}

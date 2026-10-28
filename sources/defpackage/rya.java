package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rya implements rye {
    public agev a = agdf.a;
    public final rmp b;
    private final awmd c;
    private final vyo d;
    private final abnc e;

    public rya(awmd awmdVar, rmp rmpVar, vyo vyoVar, abnc abncVar) {
        this.c = awmdVar;
        this.b = rmpVar;
        this.d = vyoVar;
        this.e = abncVar;
    }

    @Override // defpackage.rye
    public final rxj U(smr smrVar, sko skoVar) throws ryd {
        if (nrj.e(rxa.class, smrVar, skoVar)) {
            if (this.a.g()) {
                return new rxa((rsk) this.c.io(), smrVar, skoVar, (rsf) this.a.c(), this.d, this.e);
            }
            throw new ryd("No companionApi set when trying to build consolidated companion LRA", 57);
        }
        if (!nrj.e(rwx.class, smrVar, skoVar)) {
            throw new ryd("BelowPlayerLayoutRenderingAdapterFactory invalid metadata", 52);
        }
        if (!this.a.g()) {
            throw new ryd("No companionApi set when trying to build companion LRA", 57);
        }
        vyo vyoVar = this.d;
        if (taq.aD(vyoVar)) {
            rmp.n(smrVar, "BelowPlayerCompanionLayoutRenderingAdapter is still in use.");
        }
        return new rwx((rsk) this.c.io(), smrVar, skoVar, (rsf) this.a.c(), vyoVar, this.e);
    }
}

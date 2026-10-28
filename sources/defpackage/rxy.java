package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rxy implements rye {
    private final awmd a;
    private final awmd b;

    public rxy(awmd awmdVar, awmd awmdVar2) {
        this.a = awmdVar;
        this.b = awmdVar2;
    }

    @Override // defpackage.rye
    public final rxj U(smr smrVar, sko skoVar) throws ryd {
        aixg aixgVar = skoVar.b;
        if ((aixgVar == aixg.LAYOUT_TYPE_AD_BREAK_RESPONSE || aixgVar == aixg.LAYOUT_TYPE_THROTTLED_AD_BREAK_RESPONSE) && nrj.e(rwv.class, smrVar, skoVar)) {
            return new rwv((rsk) this.a.io(), smrVar, skoVar, (xte) this.b.io());
        }
        throw new ryd("AdBreakResponseLayoutRenderingAdapter invalid metadata", 52);
    }
}

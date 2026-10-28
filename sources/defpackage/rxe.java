package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(a = aixg.LAYOUT_TYPE_FORECASTING, b = aixo.SLOT_TYPE_FORECASTING)
public final class rxe implements rxj {
    private final saq a;
    private final smr b;
    private final sko c;
    private final rsk d;

    public rxe(rsk rskVar, saq saqVar, smr smrVar, sko skoVar) {
        this.d = rskVar;
        this.a = saqVar;
        this.b = smrVar;
        this.c = skoVar;
    }

    @Override // defpackage.rxj
    public final void M() {
        rsk rskVar = this.d;
        smr smrVar = this.b;
        sko skoVar = this.c;
        rskVar.b(smrVar, skoVar);
        rmp.k(smrVar, "Sending ForecastingAd pings logic is skipped");
        this.a.ab(skoVar, 0);
    }

    @Override // defpackage.rxj
    public final void N(int i) {
        this.d.d(this.b, this.c, i);
    }

    @Override // defpackage.rxj
    public final sko a() {
        throw null;
    }

    @Override // defpackage.rxj
    public final void S() {
    }

    @Override // defpackage.rxj
    public final void b() {
    }
}

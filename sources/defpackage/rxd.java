package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(a = aixg.LAYOUT_TYPE_FORECASTING, b = aixo.SLOT_TYPE_FORECASTING, c = {sil.class}, d = {sic.class, sip.class})
public final class rxd implements rxj {
    private final saq a;
    private final smr b;
    private final sko c;
    private final String d;
    private final skl e;
    private final ski f;
    private final vyo g;
    private final rsk h;
    private final spy i;

    public rxd(rsk rskVar, saq saqVar, spy spyVar, smr smrVar, sko skoVar, vyo vyoVar) {
        this.h = rskVar;
        this.a = saqVar;
        this.i = spyVar;
        this.b = smrVar;
        this.c = skoVar;
        this.d = (String) smrVar.d(sic.class);
        this.e = (skl) smrVar.d(sip.class);
        this.f = (ski) skoVar.d(sil.class);
        this.g = vyoVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0065  */
    @Override // defpackage.rxj
    public final void M() {
        spz spzVar;
        smc smcVar;
        rsk rskVar = this.h;
        smr smrVar = this.b;
        sko skoVar = this.c;
        rskVar.b(smrVar, skoVar);
        if (afxw.e(this.g).D) {
            if (this.f.b.b.size() != 0) {
                rmp.k(smrVar, "ForecastingAdRender's Impression Urls are not empty.");
            }
            wgj wgjVar = this.e.b;
            if (!wgjVar.d().isEmpty() || !wgjVar.c().isEmpty()) {
                rmp.k(smrVar, "AdBreak start pings or end pings are not empty.");
            }
        }
        ski skiVar = this.f;
        if (skiVar.b.b.size() == 0) {
            wgj wgjVar2 = this.e.b;
            if (!wgjVar2.d().isEmpty() || !wgjVar2.c().isEmpty()) {
                spy spyVar = this.i;
                String str = this.d;
                skl sklVar = this.e;
                syn synVar = spyVar.g;
                snz snzVarI = synVar.i();
                spyVar.h.a.getClass();
                sklVar.getClass();
                snzVarI.e(sklVar.h());
                spzVar = (spz) spyVar.e.b(synVar.j(skiVar), str, skiVar, Long.valueOf(sklVar.a()), sklVar.b());
                smcVar = spzVar.b;
                if ((smcVar instanceof ski) && !spzVar.d) {
                    spzVar.f.e(smcVar.X());
                    spzVar.d = true;
                }
                int i = sfv.c;
                snzVarI.e(sklVar.g());
            }
        } else {
            spy spyVar2 = this.i;
            String str2 = this.d;
            skl sklVar2 = this.e;
            syn synVar2 = spyVar2.g;
            snz snzVarI2 = synVar2.i();
            spyVar2.h.a.getClass();
            sklVar2.getClass();
            snzVarI2.e(sklVar2.h());
            spzVar = (spz) spyVar2.e.b(synVar2.j(skiVar), str2, skiVar, Long.valueOf(sklVar2.a()), sklVar2.b());
            smcVar = spzVar.b;
            if (smcVar instanceof ski) {
                spzVar.f.e(smcVar.X());
                spzVar.d = true;
            }
            int i2 = sfv.c;
            snzVarI2.e(sklVar2.g());
        }
        this.a.ab(skoVar, 0);
    }

    @Override // defpackage.rxj
    public final void N(int i) {
        this.h.d(this.b, this.c, i);
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

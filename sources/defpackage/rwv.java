package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(b = aixo.SLOT_TYPE_AD_BREAK_REQUEST, c = {shl.class}, d = {sjy.class, sic.class, sid.class})
public final class rwv implements rxj {
    private final smr a;
    private final sko b;
    private final rsk c;
    private final xte d;

    public rwv(rsk rskVar, smr smrVar, sko skoVar, xte xteVar) {
        this.c = rskVar;
        this.a = smrVar;
        this.b = skoVar;
        this.d = xteVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [awmd, java.lang.Object] */
    @Override // defpackage.rxj
    public final void M() {
        skl sklVar;
        aisu aisuVarD;
        rsk rskVar = this.c;
        smr smrVar = this.a;
        sko skoVar = this.b;
        rskVar.b(smrVar, skoVar);
        wgk wgkVar = (wgk) skoVar.d(shl.class);
        String str = (String) smrVar.d(sic.class);
        wjf wjfVar = (wjf) smrVar.d(sid.class);
        skh skhVarA = skh.a(str, wjfVar);
        xte xteVar = this.d;
        if (smrVar.e(sip.class)) {
            sklVar = (skl) smrVar.d(sip.class);
        } else {
            sklVar = null;
            if (smrVar.e(sih.class) && smrVar.e(shj.class) && (aisuVarD = wgkVar.d()) != null && wgkVar.a().isEmpty()) {
                sklVar = new skl(new wgj(aisuVarD), ((Integer) smrVar.d(shj.class)).intValue(), wjfVar.R(), wjfVar.G(), ((rnj) xteVar.f.io()).e(), wjfVar.A(), wjfVar.ab());
            }
        }
        if (sklVar != null && sklVar.b() == slm.PAUSE && !afxw.e((vyo) xteVar.c).P) {
            ((roq) xteVar.a.io()).f(23, skhVarA, new gpa(((aaok) xteVar.b.io()).Y((skl) smrVar.d(sip.class), wjfVar, (acfw) smrVar.d(sjy.class), str), 20));
        }
        ((roq) xteVar.a.io()).f(11, skhVarA, new sdg(xteVar, wgkVar, sklVar, str, wjfVar, smrVar, 1));
    }

    @Override // defpackage.rxj
    public final void N(int i) {
        this.c.d(this.a, this.b, i);
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

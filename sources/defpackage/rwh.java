package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(b = aixo.SLOT_TYPE_PLAYER_BYTES, d = {sip.class, sid.class, sic.class, sjy.class})
public final class rwh extends rvo {
    public final aazw a;
    public final sdm b;
    public final rzv c;
    public final mbc d;
    public final long e;
    public final rtl f;
    public final tld g;
    public final aehs h;
    private final Executor j;
    private final Executor k;

    public rwh(rvr rvrVar, Executor executor, Executor executor2, rtl rtlVar, aazw aazwVar, sdm sdmVar, aehs aehsVar, rsi rsiVar, tld tldVar, rzv rzvVar, mbc mbcVar) {
        super(rvrVar);
        this.j = executor;
        this.k = executor2;
        this.f = rtlVar;
        this.a = aazwVar;
        this.b = sdmVar;
        this.h = aehsVar;
        this.g = tldVar;
        this.c = rzvVar;
        this.d = mbcVar;
        this.e = rsiVar.f;
    }

    @Override // defpackage.rvo
    public final void b() {
        rvr rvrVar = this.i;
        rvrVar.a(new rwf(this, ((acfw) rvrVar.a.d(sjy.class)).a(), 0), this.j, this.k, new rwg(this, 0));
    }
}

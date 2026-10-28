package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(b = aixo.SLOT_TYPE_BELOW_PLAYER, c = {sia.class, siq.class, sid.class})
@Deprecated
public final class rwx implements rxj {
    private final smr a;
    private final sko b;
    private final akck c;
    private final wjf d;
    private final vyo e;
    private boolean f = false;
    private final rsk g;
    private final rsf h;
    private final abnc i;

    public rwx(rsk rskVar, smr smrVar, sko skoVar, rsf rsfVar, vyo vyoVar, abnc abncVar) {
        this.g = rskVar;
        this.a = smrVar;
        this.b = skoVar;
        this.h = rsfVar;
        this.e = vyoVar;
        this.i = abncVar;
        this.c = (akck) skoVar.d(sia.class);
        this.d = (wjf) skoVar.d(sid.class);
    }

    @Override // defpackage.rxj
    public final void M() {
        boolean zBf = taq.bf(this.e, this.i);
        this.f = zBf;
        if (zBf) {
            this.g.b(this.a, this.b);
            return;
        }
        rsf rsfVar = this.h;
        sko skoVar = this.b;
        wjf wjfVar = this.d;
        akck akckVar = this.c;
        String str = skoVar.a;
        rsfVar.c(Optional.of(wjfVar), akckVar, (amco) skoVar.n.f());
        this.g.b(this.a, skoVar);
    }

    @Override // defpackage.rxj
    public final void N(int i) {
        if (!this.f) {
            this.h.a();
        }
        this.g.d(this.a, this.b, i);
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

package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(b = aixo.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE, c = {shr.class, sin.class})
public final class rwz implements rxj, rta {
    private final smr a;
    private final sko b;
    private final vyo c;
    private final rtb d;
    private final List e;
    private final List f;
    private boolean g = false;
    private final rsk h;
    private final ruk i;
    private final abnc j;

    public rwz(rsk rskVar, smr smrVar, sko skoVar, vyo vyoVar, rtb rtbVar, ruk rukVar, abnc abncVar) {
        this.h = rskVar;
        this.a = smrVar;
        this.b = skoVar;
        this.c = vyoVar;
        this.d = rtbVar;
        this.i = rukVar;
        this.e = (List) skoVar.d(shr.class);
        this.f = (List) skoVar.d(sin.class);
        this.j = abncVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005b  */
    @Override // defpackage.rxj
    public final void M() {
        boolean zBf = taq.bf(this.c, this.j);
        this.g = zBf;
        if (zBf) {
            this.h.b(this.a, this.b);
            return;
        }
        try {
            this.d.b(this.e, (amco) this.b.n.f());
            sko skoVar = this.b;
            if (skoVar.e(sjv.class) && skoVar.e(sjt.class)) {
                smr smrVar = this.a;
                if (nrj.l(smrVar) || nrj.m(smrVar)) {
                    this.i.a((ajwo) skoVar.d(sjv.class), (Map) skoVar.d(sjt.class));
                } else {
                    vyo vyoVar = this.c;
                    if (!taq.ap(vyoVar) || !taq.be(vyoVar, this.j, nrj.g(smrVar, skoVar))) {
                        this.i.a((ajwo) skoVar.d(sjv.class), (Map) skoVar.d(sjt.class));
                    }
                }
            }
            this.h.b(this.a, skoVar);
        } catch (rso e) {
            this.h.u(this.a, this.b, new sas(e.getMessage(), e.a), 10);
        }
    }

    @Override // defpackage.rxj
    public final void N(int i) {
        if (!this.g) {
            try {
                this.d.a(this.f);
            } catch (IllegalStateException | rso e) {
                rmp.m(this.a, this.b, e.getMessage());
            }
        }
        this.h.d(this.a, this.b, i);
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

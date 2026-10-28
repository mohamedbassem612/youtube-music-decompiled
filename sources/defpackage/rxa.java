package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@sdn(b = aixo.SLOT_TYPE_BELOW_PLAYER, c = {shu.class})
public final class rxa implements rxj {
    private final smr a;
    private final sko b;
    private final ajlh c;
    private final vyo d;
    private boolean e = false;
    private final rsk f;
    private final rsf g;
    private final abnc h;

    public rxa(rsk rskVar, smr smrVar, sko skoVar, rsf rsfVar, vyo vyoVar, abnc abncVar) {
        this.f = rskVar;
        this.a = smrVar;
        this.b = skoVar;
        this.g = rsfVar;
        this.d = vyoVar;
        this.h = abncVar;
        this.c = (ajlh) skoVar.d(shu.class);
    }

    @Override // defpackage.rxj
    public final void M() {
        boolean zBf = taq.bf(this.d, this.h);
        this.e = zBf;
        if (zBf) {
            this.f.b(this.a, this.b);
            return;
        }
        ajlh ajlhVar = this.c;
        apji apjiVar = ajlhVar.c;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        anjk anjkVar = (anjk) aavv.s(apjiVar, anjk.b);
        rsf rsfVar = this.g;
        if (anjkVar != null) {
            sko skoVar = this.b;
            String str = skoVar.a;
            Optional optionalEmpty = Optional.empty();
            aihf aihfVarCreateBuilder = akck.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            akck akckVar = (akck) aihfVarCreateBuilder.instance;
            akckVar.d = anjkVar;
            akckVar.b |= 64;
            rsfVar.c(optionalEmpty, (akck) aihfVarCreateBuilder.build(), (amco) skoVar.n.f());
        } else {
            sko skoVar2 = this.b;
            String str2 = skoVar2.a;
            amco amcoVar = (amco) skoVar2.n.f();
            rsfVar.a();
            for (sqr sqrVar : rsfVar.a) {
                sqrVar.b = Optional.ofNullable(amcoVar);
                apji apjiVar2 = ajlhVar.c;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
                apjiVar2.c(aihlVarCheckIsLite);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite.d);
                if (sqrVar.d((akrn) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)))) {
                    rsfVar.b(sqrVar);
                    break;
                }
            }
            rsfVar.c = true;
            sqr sqrVar2 = rsfVar.f;
            if (sqrVar2 != null) {
                sqrVar2.b();
            }
        }
        this.f.b(this.a, this.b);
    }

    @Override // defpackage.rxj
    public final void N(int i) {
        if (!this.e) {
            this.g.a();
        }
        this.f.d(this.a, this.b, i);
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

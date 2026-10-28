package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abpi {
    public final /* synthetic */ Object a;

    public abpi(Object obj) {
        this.a = obj;
    }

    public final void a() {
        ((abvk) this.a).r.j();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [acey, java.lang.Object] */
    public final void b() {
        ?? r0 = ((abvk) this.a).o.d;
        if (r0 != 0) {
            r0.s();
        }
    }

    public final void c(abnl abnlVar, abnp abnpVar) {
        xir xirVar;
        taq.d();
        abnlVar.getClass();
        aaxx aaxxVar = new aaxx();
        abvk abvkVar = (abvk) this.a;
        tbt tbtVar = abvkVar.b;
        tbtVar.c(aaxxVar);
        if (abnpVar != null && (xirVar = abnpVar.b) != null) {
            xirVar.f(tau.PLAYER_INITIALIZED);
        }
        abvkVar.e.d();
        abvkVar.j.a(abvkVar.f);
        abvkVar.ar();
        abvkVar.x();
        abpj abpjVar = abvkVar.m;
        abpjVar.n(abnlVar, abnpVar);
        abpjVar.f();
        if (abnlVar.K()) {
            tbtVar.e(abme.NAVIGATION);
        }
        aboi aboiVar = abvkVar.r;
        aboiVar.h(abnlVar.I());
        aboiVar.g(abnlVar.H());
        aboiVar.i(abnlVar.u());
        abvkVar.p.e(abnlVar, abnpVar);
        abvkVar.d.a();
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [acey, java.lang.Object] */
    public final void d(abnl abnlVar, abnp abnpVar, boolean z) {
        xir xirVar;
        taq.d();
        abvk abvkVar = (abvk) this.a;
        abpj abpjVar = abvkVar.m;
        if (abpjVar.i == null) {
            c(abnlVar, abnpVar);
            return;
        }
        abvkVar.u.f();
        if (abnpVar != null && (xirVar = abnpVar.b) != null) {
            xirVar.f(tau.PLAY_NEXT_INITIALIZED);
        }
        if (z) {
            abvkVar.n.b();
            abpjVar.e();
        }
        if (txz.g(abvkVar.a)) {
            abvkVar.N();
        }
        ?? r3 = abvkVar.o.d;
        if (r3 == 0 || !r3.ac(abnlVar, abnpVar)) {
            abvkVar.p.e(abnlVar, abnpVar);
        }
    }

    public final void e() {
        taq.d();
        abvk abvkVar = (abvk) this.a;
        abmt abmtVar = abvkVar.i;
        if (!abmtVar.aC()) {
            abvkVar.o.c();
        }
        abwp abwpVar = abvkVar.n;
        abwpVar.b();
        abpj abpjVar = abvkVar.m;
        abpjVar.e();
        abwpVar.e();
        abpjVar.l();
        if (abmtVar.aC()) {
            abvkVar.o.c();
        }
        abvkVar.aq(false, 12);
        abvkVar.o.b();
    }

    public final boolean f() {
        return ((abvk) this.a).r.m();
    }

    public final afay g(afay afayVar) {
        return !(afayVar instanceof afbh) ? new afaw(-((afbe) this.a).e(), afayVar) : afayVar;
    }

    @tcc
    public void handlePlaybackServiceException(aboe aboeVar) {
        abpj abpjVar = (abpj) this.a;
        vyo vyoVar = abpjVar.b;
        abqc abqcVar = abpjVar.g;
        if (abmt.p(vyoVar).b <= 0 || !abmt.p(vyoVar).c || abqcVar == null) {
            return;
        }
        abqcVar.j();
    }

    @tcc
    public void handleVideoStageEvent(aazj aazjVar) {
        abqc abqcVar;
        afvn afvnVarB = aawb.b(aazjVar, "PRM");
        try {
            Object obj = this.a;
            if (((abpj) obj).e.bx(1L)) {
                abqc abqcVar2 = ((abpj) obj).g;
                if (abqcVar2 != null) {
                    abqcVar2.h();
                }
            } else if (abpj.t(aazjVar) && (abqcVar = ((abpj) obj).g) != null) {
                abqcVar.h();
            }
            afvnVarB.close();
        } catch (Throwable th) {
            try {
                afvnVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

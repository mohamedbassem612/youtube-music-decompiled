package defpackage;

import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tls {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/common/network/cronet/volley/RequestController");
    public final mbc b;
    public final tns c;
    public final tlj d;
    public final tlr e;
    public final tks f;
    public volatile String g;
    public volatile tmr h;
    public volatile long i;
    public final tqj m;
    private final ExecutorService n;
    private volatile tlh p;
    private final tnu q;
    private final tgv r;
    private final String s;
    private final tko t;
    public volatile boolean j = false;
    public volatile boolean k = true;
    public volatile boolean l = false;
    private final the o = new the();

    public tls(ExecutorService executorService, tns tnsVar, tlj tljVar, tlr tlrVar, tks tksVar, String str, tqj tqjVar, tko tkoVar) {
        tkr tkrVar = (tkr) tljVar;
        this.b = tkrVar.d;
        this.n = executorService;
        this.c = tnsVar;
        this.d = tljVar;
        this.e = tlrVar;
        this.f = tksVar;
        this.q = (tnu) tkrVar.l.io();
        this.r = tkrVar.m;
        this.s = str;
        this.m = tqjVar;
        this.t = tkoVar;
    }

    public final tmr a(tnm tnmVar, tnx tnxVar, boolean z) {
        tmt tmtVar;
        if (tnxVar.h() && this.c.G() && !z && (tmtVar = tnxVar.c().b) != null) {
            if (((tkr) this.d).h.j()) {
                return tmr.b(tmtVar, new rzt(tnmVar, 9));
            }
            Object obj = tnxVar.c().a;
            if (obj != null) {
                return tmr.a(tmtVar, new rzt(obj, 10), new tjq(tnmVar, 2));
            }
        }
        return null;
    }

    public final synchronized String b() {
        if (this.g == null) {
            this.g = this.c.q();
        }
        return this.g;
    }

    public final void c(tnx tnxVar, tmr tmrVar) {
        tns tnsVar = this.c;
        if (tnsVar.G() && tmrVar != null) {
            tlj tljVar = this.d;
            boolean z = this.k;
            tkr tkrVar = (tkr) tljVar;
            tmo tmoVar = tkrVar.h;
            if (z) {
                Optional optional = tkrVar.i;
                if (optional.isPresent()) {
                    if (this.l) {
                        ((vwp) optional.get()).f(b(), tmrVar, tmoVar.b());
                    } else {
                        ((vwp) optional.get()).g(b(), tmrVar, tmoVar.b());
                    }
                }
            }
            tmoVar.h(b(), tmrVar);
        }
        this.o.a(tnsVar.t());
        e(tnxVar);
    }

    public final void d(Throwable th) {
        e(tnx.d(new toe(th)));
    }

    public final void e(tnx tnxVar) {
        tks tksVar = this.f;
        tns tnsVar = this.c;
        tksVar.a(tnsVar, tnxVar);
        boolean zH = tnxVar.h();
        tnu tnuVar = this.q;
        if (zH) {
            tnxVar.c();
            tnuVar.c();
        } else {
            tnxVar.a();
            tnuVar.a();
        }
        this.e.b(tnsVar, tnxVar);
        if (this.p != null) {
            this.p.a();
        }
    }

    public final void f() {
        taq.n(this.c);
    }

    public final void g() {
        tks tksVar = this.f;
        if (tksVar.c()) {
            this.e.a(this.c);
            tksVar.d();
            return;
        }
        toh tohVarZ = this.d.z();
        if (tohVarZ != null) {
            try {
                toh.a(this.c.s());
            } catch (tog e) {
                i(null, new toe(e), false);
                return;
            }
        }
        try {
            tns tnsVar = this.c;
            Map mapM = taq.m(tnsVar, this.h == null ? null : this.h.b);
            byte[] bArrAe = tnsVar.ae();
            tlj tljVar = this.d;
            tmf tmfVarJ = taq.j(tnsVar, tljVar);
            tfx tfxVar = ((tkr) tljVar).f;
            if (tfxVar != null) {
                this.p = new tlh(this.o, tfxVar, ((tkr) tljVar).g, this.s, new glj(this, 10));
            }
            mbc mbcVar = ((tkr) tljVar).d;
            ExecutorService executorService = this.n;
            tmr tmrVar = this.h;
            tgv tgvVar = this.r;
            tqj tqjVar = this.m;
            final tkw tkwVar = new tkw(mbcVar, tohVarZ, executorService, tnsVar, tmrVar, this, tmfVarJ, tgvVar, tqjVar);
            final UrlRequest urlRequestU = taq.u(tnsVar, mapM, bArrAe, tljVar, this.p, this.o, tkwVar, tqjVar, this.t);
            tkwVar.c.c();
            tkwVar.a.b();
            tkwVar.b.i(new tmd() { // from class: tkv
                @Override // defpackage.tmd
                public final void a(int i) {
                    tkwVar.d = i;
                    urlRequestU.cancel();
                }
            });
            taq.q(tnsVar);
            urlRequestU.start();
            this.f.b(urlRequestU);
            this.q.b();
        } catch (tmg e2) {
            if (taq.r(this.c, e2)) {
                g();
            } else {
                i(null, e2, false);
            }
        }
    }

    public final void h() {
        try {
            this.n.execute(afwl.i(new syd(this, 8)));
        } catch (RejectedExecutionException e) {
            this.f.a(this.c, tnx.d(new toe(e)));
        }
    }

    public final void i(tnm tnmVar, toe toeVar, boolean z) {
        tnm tnmVarK;
        tgk tgkVarF;
        boolean z2 = false;
        if (toeVar != null) {
            try {
                if (taq.s(tnmVar) && (tnmVarK = taq.k(toeVar)) != null) {
                    z = true;
                    toeVar = null;
                    z2 = true;
                    tnmVar = tnmVarK;
                }
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                d(e);
                return;
            }
        }
        tns tnsVar = this.c;
        if (toeVar != null) {
            toe toeVarI = tnsVar.i(toeVar);
            this.o.a(tnsVar.t());
            e(tnx.d(toeVarI));
            return;
        }
        tlj tljVar = this.d;
        if (this.j && tnmVar != null && (tgkVarF = tljVar.F()) != null) {
            tgkVarF.b(tnsVar, tnmVar, Long.valueOf(this.i));
        }
        if (tnsVar.J()) {
            tnmVar.getClass();
            afxd.f(tnsVar.j(this.n, tnmVar, z2)).g(new oks(this, tnmVar, z, 2), MoreExecutors.directExecutor()).b(Exception.class, new rwj(this, 4), MoreExecutors.directExecutor());
        } else {
            tnmVar.getClass();
            tnx tnxVarAa = tnsVar.aa(tnmVar);
            c(tnxVarAa, a(tnmVar, tnxVarAa, z));
        }
    }
}

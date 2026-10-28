package defpackage;

import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tmb {
    public final Executor a;
    public final tns b;
    public final tlj c;
    public final tha d;
    public final the e;
    public final tlh f;
    public tmf g;
    public final tqj h;
    public volatile boolean i = false;
    public volatile boolean j = false;
    public final tma k;
    private volatile boolean l;
    private final tko m;

    public tmb(Executor executor, tns tnsVar, tlj tljVar, tha thaVar, String str, tqj tqjVar, tko tkoVar) {
        this.a = new ahfg(executor);
        this.b = tnsVar;
        this.c = tljVar;
        this.d = thaVar;
        the theVar = new the();
        this.e = theVar;
        this.h = tqjVar;
        this.m = tkoVar;
        this.g = taq.j(tnsVar, tljVar);
        tkr tkrVar = (tkr) tljVar;
        tfx tfxVar = tkrVar.f;
        tfxVar.getClass();
        this.f = new tlh(theVar, tfxVar, tkrVar.g, str, new oqe(tljVar, 4));
        this.k = new tma(this);
    }

    final tgz a() {
        tns tnsVar = this.b;
        final int i = 1;
        ahno.P(!tnsVar.G(), "streaming request caching not implemented");
        ahno.P(tnsVar.J(), "streaming requires async parsing");
        try {
            c(tnsVar.s());
            tma tmaVar = this.k;
            tns tnsVar2 = this.b;
            tmaVar.b = tmaVar.a.a(tnsVar2);
            final int i2 = 0;
            try {
                Map mapM = taq.m(tnsVar2, null);
                byte[] bArrAe = tnsVar2.ae();
                tlw tlwVar = new tlw(this);
                tns tnsVar3 = this.b;
                tlj tljVar = this.c;
                UrlRequest urlRequestU = taq.u(tnsVar3, mapM, bArrAe, tljVar, this.f, this.e, tlwVar, this.h, this.m);
                if (this.i) {
                    this.g = taq.j(tnsVar3, tljVar);
                } else {
                    taq.q(tnsVar3);
                }
                ((tkr) tljVar).m.c();
                this.l = true;
                this.g.i(new ypa(urlRequestU, i));
                urlRequestU.start();
                urlRequestU.getClass();
                return new tly(urlRequestU, 0);
            } catch (tmg e) {
                if (taq.r(this.b, e)) {
                    return a();
                }
                this.a.execute(afwl.i(new sxk(this, e, 11)));
                return new tgz() { // from class: tlx
                    @Override // defpackage.tgz
                    public final void a() {
                    }
                };
            }
        } catch (tog e2) {
            this.a.execute(afwl.i(new sxk(this, e2, 10)));
            return new tgz() { // from class: tlx
                @Override // defpackage.tgz
                public final void a() {
                }
            };
        }
    }

    public final void b(Exception exc) {
        tns tnsVar = this.b;
        taq.n(tnsVar);
        if (this.l) {
            ((tkr) this.c).m.b();
            this.l = false;
        }
        this.e.a(tnsVar.t());
        this.d.b(new tnv(tnsVar.i(exc instanceof toe ? (toe) exc : new toe(exc))));
        this.f.a();
    }

    public final void c(String str) {
        this.c.z().getClass();
        toh.a(str);
    }

    public final void d() {
        this.g.c();
        this.e.a(this.b.t());
        this.f.a();
        int iA = this.g.a();
        this.a.execute(afwl.i(new sxk(this, iA != 0 ? tme.a(iA) : new CancellationException(), 8)));
    }

    public final void e(CronetException cronetException) {
        this.g.d();
        if (this.b.D()) {
            d();
        } else {
            this.a.execute(afwl.i(new sxk(this, cronetException, 7)));
        }
    }
}

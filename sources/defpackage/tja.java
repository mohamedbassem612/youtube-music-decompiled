package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tja implements tjm {
    public static final byte[] a = new byte[0];
    public final tns b;
    public final tlj c;
    public final tqj d;
    public final mbc e;
    public tjk f;
    public volatile long g;
    private final tmt h;
    private UrlRequest j;
    private final tit m;
    private final tko n;
    private final ReentrantLock i = new ReentrantLock();
    private final AtomicBoolean k = new AtomicBoolean();
    private final awmi l = new awmp(new ebk(this, 15));

    public tja(tns tnsVar, tlj tljVar, tmt tmtVar, tit titVar, tqj tqjVar, tko tkoVar, mbc mbcVar) {
        this.b = tnsVar;
        this.c = tljVar;
        this.h = tmtVar;
        this.m = titVar;
        this.d = tqjVar;
        this.n = tkoVar;
        this.e = mbcVar;
    }

    @Override // defpackage.tjm
    public final void a() {
        synchronized (this.i) {
            b();
            tns tnsVar = this.b;
            tnsVar.x();
            tnsVar.w();
        }
    }

    public final void b() {
        synchronized (this.i) {
            UrlRequest urlRequest = this.j;
            if (urlRequest != null) {
                urlRequest.cancel();
            }
        }
    }

    public final void c() {
        taq.n(this.b);
    }

    @Override // defpackage.tjm
    public final void d(tjk tjkVar) {
        tjkVar.getClass();
        if (this.k.getAndSet(true)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        try {
            String strS = this.b.s();
            strS.getClass();
            f(strS);
            tns tnsVar = this.b;
            tnsVar.A(new olh(this, 17));
            if (tnsVar.D()) {
                a();
            }
            e(tjkVar);
        } catch (tog e) {
            tjkVar.b(new toe(e));
        }
    }

    public final void e(tjk tjkVar) {
        Map mapM;
        byte[] bArrAe;
        tmf tmfVarJ;
        tlp tlpVar;
        this.f = tjkVar;
        try {
            tns tnsVar = this.b;
            mapM = taq.m(tnsVar, this.h);
            bArrAe = tnsVar.ae();
        } catch (tmg e) {
            tqj tqjVar = this.d;
            int i = tqr.a;
            if (tqjVar.k(1073830968) && this.b.h().d(e) == null) {
                tjkVar.b(e);
                return;
            }
            try {
                tns tnsVar2 = this.b;
                mapM = taq.m(tnsVar2, this.h);
                bArrAe = tnsVar2.ae();
            } catch (tmg e2) {
                tjkVar.b(e2);
                return;
            }
        }
        byte[] bArr = bArrAe;
        tqj tqjVar2 = this.d;
        int i2 = tqr.a;
        boolean zK = tqjVar2.k(1073815132);
        tns tnsVar3 = this.b;
        if (zK) {
            tlj tljVar = this.c;
            if (tljVar.L()) {
                tkr tkrVar = (tkr) tljVar;
                if (tkrVar.j) {
                    tlpVar = new tlp(tkrVar.e, tnsVar3.h().a(), 2147483647L, true);
                } else {
                    ScheduledExecutorService scheduledExecutorService = tkrVar.e;
                    long jA = tnsVar3.h().a();
                    tnsVar3.h().g();
                    tlpVar = new tlp(scheduledExecutorService, jA, 60000L, false);
                }
                tmfVarJ = tlpVar;
            } else {
                tmfVarJ = tmf.i;
            }
        } else {
            tmfVarJ = taq.j(tnsVar3, this.c);
        }
        boolean zK2 = tqjVar2.k(1073815716);
        tiz tizVar = new tiz(this, tmfVarJ, zK2);
        tns tnsVar4 = this.b;
        UrlRequest.Callback tkgVar = tnsVar4 instanceof toc ? new tkg(tizVar, ((tkr) this.c).n.k(1073830970), zK2) : new tki(tizVar, zK2);
        tlj tljVar2 = this.c;
        tit titVar = this.m;
        UrlRequest.Builder builderT = taq.t(tnsVar4, mapM, bArr, tljVar2, tkgVar, tqjVar2, this.n);
        builderT.getClass();
        synchronized (titVar) {
            the theVar = new the();
            builderT.addRequestAnnotation(theVar);
            titVar.d = theVar;
            Executor executor = titVar.b;
            if (executor != null) {
                titVar.e = new tis(titVar, titVar.a, executor, theVar, titVar.c);
                builderT.setRequestFinishedListener(titVar.e);
            }
        }
        final UrlRequest urlRequestBuild = builderT.build();
        synchronized (this.i) {
            if (g()) {
                this.g = this.e.b();
            }
            if (this.j == null) {
                taq.q(tnsVar4);
            }
            this.j = urlRequestBuild;
            tmfVarJ.i(new tmd() { // from class: tiv
                @Override // defpackage.tmd
                public final void a(int i3) {
                    urlRequestBuild.cancel();
                }
            });
            urlRequestBuild.start();
            if (tnsVar4.D()) {
                urlRequestBuild.cancel();
            }
        }
    }

    public final void f(String str) {
        if (this.c.z() != null) {
            toh.a(str);
        }
    }

    public final boolean g() {
        return ((Boolean) this.l.a()).booleanValue();
    }
}

package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abpj {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/player/net/PlayerRequestManager");
    private final igp A;
    public final vyo b;
    public final ttm c;
    public final ScheduledExecutorService d;
    public final abmt e;
    public sxw f;
    public volatile abqc g;
    public volatile abnw h;
    public abor i;
    public abnl j;
    public abnl k;
    public abnp l;
    public volatile wjf m;
    public volatile wgi n;
    public volatile String o;
    public boolean p;
    public abvr q;
    public final adet r;
    private final aunn s;
    private final Handler t;
    private final avmb u;
    private final avmb v;
    private final Executor w;
    private final avlh x;
    private final avlh y;
    private final abpi z;

    public abpj(tbt tbtVar, aunn aunnVar, Handler handler, avmb avmbVar, Executor executor, avmb avmbVar2, ScheduledExecutorService scheduledExecutorService, ttm ttmVar, adet adetVar, igp igpVar, avlh avlhVar, avlh avlhVar2, vyo vyoVar, abmt abmtVar) {
        abpi abpiVar = new abpi(this);
        this.z = abpiVar;
        this.s = aunnVar;
        this.t = handler;
        this.u = avmbVar;
        this.w = executor;
        this.v = avmbVar2;
        this.d = scheduledExecutorService;
        this.c = ttmVar;
        this.r = adetVar;
        this.A = igpVar;
        this.x = avlhVar;
        this.y = avlhVar2;
        this.b = vyoVar;
        this.e = abmtVar;
        if (abmtVar.bx(1L)) {
            return;
        }
        tbtVar.f(abpiVar);
    }

    static boolean q(int i) {
        return i == 3 || i == 2 || i == 0;
    }

    public static final boolean t(aazj aazjVar) {
        wjf wjfVar;
        abob abobVar = aazjVar.a;
        if (abobVar.d() || abobVar == abob.j) {
            return true;
        }
        return abobVar == abob.d && (wjfVar = aazjVar.b) != null && wjfVar.L();
    }

    public final wjf a() {
        boolean zA = this.h.a(abnw.d, abnw.e);
        wjf wjfVar = this.m;
        if (!zA || r(wjfVar, "currentPlayerResponse")) {
            return null;
        }
        return wjfVar;
    }

    public final abnl b(abnl abnlVar) {
        if (!this.e.n.l(363, 45837748L, false)) {
            return abnlVar;
        }
        Optional optionalK = abnlVar.k();
        if (true == optionalK.isPresent()) {
            optionalK = Optional.ofNullable(new adrx((abnh) optionalK.get()));
        }
        adrx adrxVar = (adrx) (true != optionalK.isPresent() ? new adrx(null, null) : optionalK.get());
        adrxVar.a = Optional.of(Boolean.TRUE);
        abnh abnhVarB = adrxVar.b();
        abnk abnkVarG = abnlVar.g();
        abnkVarG.o = abnhVarB;
        return abnkVarG.a();
    }

    public final void c() {
        avmm avmmVar = new avmm();
        abmt abmtVar = this.e;
        int i = 19;
        int i2 = 8;
        if (abmtVar.g.l(150, 45654876L, false) || abmtVar.l.l(8, 45407926L, false)) {
            avmmVar.c(this.x.ak(new abmm(this, i)));
        }
        if (abmtVar.bx(1L)) {
            avlh avlhVar = this.y;
            int i3 = 11;
            avlh avlhVarX = avlhVar.p().W(new vvb(new abfb(10), i2)).x(new yqz(i3));
            abpi abpiVar = this.z;
            abpiVar.getClass();
            avlh avlhVarW = avlhVar.p().W(new vvb(new abfb(i3), i2));
            abpiVar.getClass();
            avmmVar.e(avlhVarX.ak(new abms(abpiVar, i)), avlhVarW.ak(new abms(abpiVar, 18)));
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [axsp, java.lang.Object] */
    public final void d() {
        wjf wjfVarA = a();
        wgi wgiVar = this.n;
        wgi wgiVar2 = (this.h != abnw.e || r(wgiVar, "currentWatchNextResponse")) ? null : wgiVar;
        abnl abnlVar = this.k;
        ajwo ajwoVar = abnlVar != null ? abnlVar.b : null;
        String str = this.o;
        this.r.e.kk(new aayw(this.h, wjfVarA, wgiVar2, ajwoVar, str));
    }

    public final void e() {
        if (this.g != null) {
            this.g.l(true);
            this.g = null;
        }
        sxw sxwVar = this.f;
        if (sxwVar != null) {
            sxwVar.c();
            this.f = null;
        }
    }

    public final void f() {
        m(abnw.a);
        if (this.m != null) {
            m(abnw.d);
            if (this.n != null) {
                m(abnw.e);
            }
        }
    }

    public final /* synthetic */ void g(abor aborVar, abnl abnlVar, String str, Duration duration, aphs aphsVar, sxw sxwVar) {
        try {
            this.w.execute(afwl.i(new abaq(sxwVar, (wjf) aborVar.d(abnlVar, str, (int) duration.toSeconds(), aphsVar, abnp.a).get(Math.max(aawc.a, TimeUnit.SECONDS.toMillis(abmt.c(this.b))), TimeUnit.MILLISECONDS), 12)));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.w.execute(afwl.i(new abaq(sxwVar, e, 13)));
        }
    }

    public final void h(wjf wjfVar, abnl abnlVar, xir xirVar) {
        wjfVar.getClass();
        wgi wgiVar = this.n;
        if (wgiVar != null && !wjfVar.G().equals(wgiVar.b)) {
            this.n = null;
            abvr abvrVar = this.q;
            if (abvrVar != null) {
                abvrVar.a.kk(aazm.a);
            }
        }
        this.m = wjfVar;
        if (this.e.bP() || this.A.a(wjfVar) != 2) {
            abnw abnwVar = this.h;
            abnw abnwVar2 = abnw.d;
            if (!abnwVar.b(abnwVar2)) {
                m(abnwVar2);
            }
            abvr abvrVar2 = this.q;
            if (abvrVar2 != null) {
                abvrVar2.d.a(wjfVar, abnlVar, abvrVar2, xirVar);
            }
        }
    }

    public final void i(String str, abnp abnpVar, abqb abqbVar) {
        abnl abnlVar = this.k;
        if (abnlVar != null) {
            abvr abvrVar = this.q;
            if (abvrVar != null) {
                abvrVar.g.f();
            }
            j(abnlVar, str, abqbVar, abnpVar);
        }
    }

    public final void j(abnl abnlVar, String str, abqb abqbVar, abnp abnpVar) {
        int i;
        if (abnlVar.O()) {
            i = this.p ? 2 : 3;
        } else {
            i = 0;
        }
        k(abnlVar, i, str, abqbVar, abnpVar);
    }

    public final void k(abnl abnlVar, int i, String str, abqb abqbVar, abnp abnpVar) {
        long j;
        boolean zQ = q(i);
        if (zQ && (this.g == null || this.g.l(false))) {
            sxw sxwVar = this.f;
            if (sxwVar != null) {
                sxwVar.c();
                this.f = null;
            }
            if (this.m != null) {
                this.h = this.n != null ? abnw.e : abnw.d;
            } else if (this.h == abnw.b) {
                m(abnw.a);
            }
        }
        abor aborVar = this.i;
        aborVar.getClass();
        this.k = abnlVar;
        this.l = abnpVar;
        if (zQ) {
            m(abnw.b);
        }
        abph abphVar = new abph(this, abqbVar, abnpVar.b);
        if (abnpVar.d >= 0) {
            j = 0;
        } else {
            int i2 = abmt.p(this.b).b;
            j = i2 <= 0 ? -1L : i2;
        }
        long j2 = j;
        wjf wjfVar = this.m;
        boolean z = this.p;
        Handler handler = this.t;
        vyo vyoVar = this.b;
        long jK = abmt.k(vyoVar, aawc.a);
        ttm ttmVar = this.c;
        aoqs aoqsVarR = abmt.r(vyoVar);
        boolean z2 = !(aoqsVarR != null && aoqsVarR.F);
        avmb avmbVar = this.u;
        avmb avmbVar2 = this.v;
        ScheduledExecutorService scheduledExecutorService = this.d;
        abmt abmtVar = this.e;
        abqc abqcVar = new abqc(abnlVar, i, aborVar, wjfVar, str, z, handler, j2, jK, ttmVar, abphVar, z2, abnpVar, avmbVar, avmbVar2, scheduledExecutorService, abmtVar);
        this.g = abqcVar;
        if (!a.x()) {
            vxz vxzVar = abmtVar.h;
            if (vxzVar.l(32, 45402200L, false) && vxzVar.l(33, 45402201L, false)) {
                abqcVar.run();
                return;
            }
        }
        scheduledExecutorService.execute(afwl.i(abqcVar));
    }

    public final void l() {
        e();
        this.i = null;
        this.m = null;
        this.n = null;
        this.j = null;
        this.k = null;
        this.l = null;
    }

    public final void m(abnw abnwVar) {
        this.h = abnwVar;
        d();
    }

    public final void n(abnl abnlVar, abnp abnpVar) {
        this.k = abnlVar;
        this.l = abnpVar;
        this.p = abnlVar.a.v;
        this.i = ((abos) this.s.io()).a(abnlVar);
    }

    public final void o(abnl abnlVar, abnp abnpVar, wjf wjfVar) {
        m(abnw.b);
        this.k = abnlVar;
        this.l = abnpVar;
        this.j = null;
        this.n = null;
        this.m = wjfVar;
        m(abnw.d);
    }

    public final void p(wgi wgiVar) {
        abnl abnlVar = this.k;
        if (abnlVar != null) {
            if (TextUtils.isEmpty(abnlVar.w())) {
                abnk abnkVarF = abnlVar.f();
                abnkVarF.r = wgiVar.b;
                this.k = abnkVarF.a();
            }
            if (this.e.k.l(2, 45388126L, false) && TextUtils.isEmpty(abnlVar.u())) {
                String str = wgiVar.c;
                if (!TextUtils.isEmpty(str)) {
                    abnk abnkVarF2 = abnlVar.f();
                    abnkVarF2.s = str;
                    this.k = abnkVarF2.a();
                }
            }
            abnk abnkVar = new abnk();
            abnkVar.a = wgiVar.d;
            this.j = abnkVar.a();
        }
    }

    public final boolean r(Object obj, String str) {
        if (obj != null) {
            return false;
        }
        zvp.a(zvn.b, zvm.k, String.format("%s was null when it shouldn't be", str));
        abvr abvrVar = this.q;
        if (abvrVar != null) {
            abvrVar.g.g(new aboe(10, true, 1, "There was an error with the video", new IllegalStateException(), null, null, null));
        }
        return true;
    }

    public final void u(String str, abqb abqbVar) {
        abnl abnlVar;
        abnl abnlVar2;
        if (this.h.a(abnw.e) && (abnlVar2 = this.j) != null) {
            k(b(abnlVar2), 1, str, abqbVar, abnp.a);
        } else if ((this.h.a(abnw.d) || this.h.a(abnw.c)) && (abnlVar = this.k) != null) {
            k(b(abnlVar), 1, str, abqbVar, abnp.a);
        }
    }
}

package defpackage;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioManager;
import android.os.Handler;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abvk implements acdm {
    private static final agrf y = agrf.h("com/google/android/libraries/youtube/player/service/PlaybackService");
    private final acfp A;
    private final aceo B;
    private final vyo C;
    private final axsp D;
    private final abwj E;
    private final xit F;
    private final Runnable G;
    private final abvj H;
    private final abww I;
    private final zgm J;
    private final txp K;
    private final isi M;
    public final Context a;
    public final tbt b;
    public final ytv c;
    public final abvi d;
    public final aavr e;
    public final abnc f;
    public final acag g;
    public final aavg h;
    public final abmt i;
    public final aavd j;
    public abvh k;
    public final abml l;
    public final abpj m;
    public final abwp n;
    public final abwk o;
    public final abvr p;
    public final awmd q;
    public final aboi r;
    public final abhh t;
    public final dxu u;
    public final isi v;
    public final isi w;
    public final abxv x;
    private final Handler z;
    public final abpi s = new abpi(this);
    private final Object L = new Object();

    public abvk(Context context, tbt tbtVar, ytv ytvVar, final acag acagVar, acfp acfpVar, aavr aavrVar, final abnc abncVar, aboi aboiVar, final aeod aeodVar, aavg aavgVar, aceo aceoVar, abuz abuzVar, vyo vyoVar, abml abmlVar, final abpj abpjVar, abwp abwpVar, final abwk abwkVar, dxu dxuVar, axsp axspVar, axsp axspVar2, final abuz abuzVar2, isi isiVar, abxv abxvVar, final abmt abmtVar, final abwj abwjVar, abww abwwVar, xit xitVar, isi isiVar2, vxz vxzVar, aunn aunnVar, awmd awmdVar, isi isiVar3, zgm zgmVar, txp txpVar, abhh abhhVar) {
        this.H = new abvj(this, abuzVar2);
        this.a = context;
        this.b = tbtVar;
        this.c = ytvVar;
        this.e = aavrVar;
        this.f = abncVar;
        this.r = aboiVar;
        this.B = aceoVar;
        this.C = vyoVar;
        this.h = aavgVar;
        this.M = isiVar;
        this.D = axspVar2;
        this.x = abxvVar;
        this.i = abmtVar;
        this.E = abwjVar;
        this.I = abwwVar;
        this.F = xitVar;
        this.w = isiVar2;
        this.q = awmdVar;
        this.v = isiVar3;
        this.J = zgmVar;
        this.K = txpVar;
        this.t = abhhVar;
        zjw zjwVar = ytvVar.e.E;
        zjwVar.getClass();
        abuzVar.a = zjwVar;
        this.g = acagVar;
        this.A = acfpVar;
        this.l = abmlVar;
        this.m = abpjVar;
        this.n = abwpVar;
        this.o = abwkVar;
        this.u = dxuVar;
        this.p = new abvr(axspVar, tbtVar, aboiVar, dxuVar, abpjVar, abwpVar, abwkVar, abmtVar);
        this.d = new abvi(this);
        this.z = new Handler(context.getMainLooper());
        this.j = vxzVar.l(22, 45638511L, false) ? (aavd) aunnVar.io() : new aavi(context);
        this.k = new abvh(this);
        this.G = new Runnable() { // from class: abvd
            /* JADX WARN: Type inference failed for: r0v1, types: [acey, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                ?? r0 = abwkVar.d;
                if (r0 != 0) {
                    r0.O();
                } else {
                    aeod aeodVar2 = aeodVar;
                    afip afipVar = (afip) aeodVar2.c;
                    afipVar.v((aazj) aeodVar2.b, null);
                    afipVar.F((aazn) aeodVar2.a, 4, null);
                }
                abpj abpjVar2 = abpjVar;
                abuz abuzVar3 = abuzVar2;
                abnc abncVar2 = abncVar;
                abvk abvkVar = this.a;
                abncVar2.f();
                abncVar2.g();
                Object obj = abuzVar3.a;
                if (obj != null && !abmtVar.g.l(399, 45784493L, false)) {
                    ((abtn) obj).d();
                    abpjVar2.d();
                    abvkVar.u.d();
                }
                if (abwjVar.b && r0 != 0) {
                    abpjVar2.d();
                    abvkVar.u.d();
                }
                acag acagVar2 = acagVar;
                tbt tbtVar2 = acagVar2.a;
                tbtVar2.e(new aazb(acagVar2.n, acagVar2.c()));
                tbtVar2.c(new aazc(acagVar2.m));
            }
        };
    }

    private final void aw(abnt abntVar, abnl abnlVar) {
        if (!this.i.ag() || abnlVar == null) {
            return;
        }
        txp txpVar = this.K;
        zgm zgmVar = this.J;
        String strQ = abnlVar.q(txpVar);
        String strW = abnlVar.w();
        arie arieVar = abnlVar.i().c;
        if (arieVar == null) {
            arieVar = arie.a;
        }
        zgmVar.a(strQ, strW, arieVar, true, abntVar.a > 0);
    }

    private final void ax(boolean z) {
        boolean z2 = this.i.z();
        aceo aceoVar = this.B;
        if (!z2) {
            aceoVar.j(z);
            return;
        }
        Object obj = this.L;
        Object obj2 = aceoVar.d;
        if (obj2 != null && obj2 != obj) {
            abmx.b(abmw.MEDIASESSION, "MediaSession stopMediaSession(isPlaybackDestroyed=%s) ignored: caller %s is not owner %s", Boolean.valueOf(z), obj, aceoVar.d);
            return;
        }
        if (z) {
            aceoVar.d = null;
        }
        aceoVar.j(z);
    }

    private static boolean ay(acey aceyVar) {
        return aceyVar.j() == null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [acey, java.lang.Object] */
    private final boolean az() {
        acip acipVarM;
        if (this.f.t()) {
            return false;
        }
        ?? r0 = this.o.d;
        if (r0 != 0 && (acipVarM = r0.m()) != null) {
            acipVarM.o();
        }
        abnp abnpVar = this.m.l;
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [acey, java.lang.Object] */
    @Override // defpackage.acdm
    public final void A() {
        taq.d();
        if (U()) {
            aboi aboiVar = this.r;
            if (aboiVar.m()) {
                abmw abmwVar = abmw.MEDIASESSION;
                aboiVar.f(true);
            }
            abmt abmtVar = this.i;
            if (abmtVar.g.l(275, 45726403L, false)) {
                if (!abmtVar.w() || az()) {
                    abnp abnpVar = this.m.l;
                    ar();
                }
            } else if (!abmtVar.w() || az()) {
                N();
            }
            ?? r0 = this.o.d;
            if (r0 == 0 || !ay(r0)) {
                ak();
                return;
            }
            if (this.m.h == abnw.b) {
                r0.aa(false);
            }
            r0.K();
        }
    }

    public final void B() {
        if (this.i.g.l(444, 45804550L, false)) {
            return;
        }
        this.z.post(this.G);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [acey, java.lang.Object] */
    @Override // defpackage.acdm
    public final void C() {
        taq.d();
        if (U()) {
            aboi aboiVar = this.r;
            if (aboiVar.m()) {
                abmw abmwVar = abmw.MEDIASESSION;
                aboiVar.f(true);
            }
            ?? r2 = this.o.d;
            if (r2 == 0 || !ay(r2)) {
                return;
            }
            r2.Q();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [abto, java.lang.Object] */
    public final void D() {
        if (this.E.b || this.i.g.l(324, 45748470L, false)) {
            this.s.e();
            return;
        }
        abvj abvjVar = this.H;
        taq.d();
        abuz abuzVar = abvjVar.b;
        ?? r1 = abuzVar.a;
        if (r1 != 0) {
            abvk abvkVar = abvjVar.a;
            abmt abmtVar = abvkVar.i;
            if (!abmtVar.aC()) {
                abvkVar.u();
            }
            if (abmtVar.D()) {
                abuzVar.a();
            } else if (!abmtVar.g.l(351, 45758320L, false)) {
                r1.b();
            }
            abwp abwpVar = abvkVar.n;
            abwpVar.b();
            abpj abpjVar = abvkVar.m;
            abpjVar.e();
            abwpVar.e();
            abpjVar.l();
            if (abmtVar.aC()) {
                abvkVar.u();
            }
            if (!abmtVar.C()) {
                abvkVar.o.b();
            }
            if (!abmtVar.D()) {
                abuzVar.a();
            }
            abvkVar.aq(false, 13);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [agfr, java.lang.Object] */
    public final void E(boolean z) {
        abxv abxvVar = this.x;
        ((abnc) abxvVar.b).c = z;
        Optional optional = (Optional) abxvVar.a.io();
        if (true == optional.isPresent()) {
            ((acfv) optional.get()).aI();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [acey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void F(String str) {
        aazh aazhVar = aazh.c;
        ?? r1 = this.o.d;
        if (r1 != 0) {
            r1.T(str, aazhVar);
            if (this.i.g.l(206, 45688970L, false)) {
                abww abwwVar = this.I;
                if (abwwVar.n.equals(Optional.of(str))) {
                    return;
                }
                abwwVar.n = Optional.of(str);
                if (((abmt) abwwVar.e.io()).g.l(123, 45640849L, false)) {
                    xsc xscVar = (xsc) abwwVar.g.io();
                    zwb zwbVar = (zwb) abwwVar.h.io();
                    String str2 = abqd.a;
                    ahno.as(((xpl) xscVar.a).h(xscVar.b.e()), new aaoq((String) agke.q(zwbVar.u() ? abqd.a : abqd.b).get(0), str, 5, null), xscVar.c);
                }
            }
        }
    }

    public final void G(boolean z) {
        abnc abncVar = this.f;
        if (z != abncVar.f) {
            abncVar.f = z;
            abncVar.f();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [acey, java.lang.Object] */
    public final void H(boolean z) {
        ?? r0 = this.o.d;
        if (r0 != 0) {
            r0.U(z);
        }
    }

    public final void I(boolean z) {
        abnc abncVar = this.f;
        if (abncVar.e != z) {
            abncVar.e = z;
            abncVar.f();
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [acey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [abwy, java.lang.Object] */
    public final void J(float f) {
        if (this.i.aA()) {
            isi isiVar = this.v;
            isiVar.c.f(new abxj(f, null));
        } else {
            ?? r2 = this.o.d;
            if (r2 != 0) {
                r2.V(f);
            }
        }
    }

    public final void K(acca accaVar) {
        L(accaVar, aazh.c);
    }

    public final void L(acca accaVar, aazh aazhVar) {
        int i;
        acag acagVar = this.g;
        if (acagVar.o(accaVar)) {
            i = 3;
        } else if (accaVar != null || acagVar.t.c(abob.d)) {
            i = aazhVar == aazh.a ? 5 : 1;
        } else {
            i = 0;
        }
        acagVar.m(accaVar, aazhVar, i);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [agfr, java.lang.Object] */
    public final void M(float f) {
        abxv abxvVar = this.x;
        ((abnc) abxvVar.b).b = f;
        Optional optional = (Optional) abxvVar.a.io();
        if (true == optional.isPresent()) {
            ((acfv) optional.get()).aI();
        }
    }

    public final void N() {
        boolean z = this.i.z();
        aceo aceoVar = this.B;
        if (!z) {
            aceoVar.i();
            return;
        }
        Object obj = this.L;
        obj.getClass();
        if (aceoVar.d != obj) {
            abmx.b(abmw.MEDIASESSION, "MediaSession owner changed: %s -> %s", String.valueOf(aceoVar.d), obj);
        }
        aceoVar.d = obj;
        aceoVar.i();
    }

    @Deprecated
    public final void O() {
        abmx.a(abmw.AUDIOMANAGER, "Suppressing resume on focus gain");
        int i = aave.d;
        aave aaveVar = this.h.f;
        aaveVar.b(false);
        aaveVar.c(false);
        aaveVar.a(false);
    }

    @Override // defpackage.acdm
    public final void P() {
        at(false);
    }

    public final void Q() {
        if (this.r.k()) {
            A();
        }
    }

    public final void R(Long l, Long l2) {
        abnl abnlVar = this.m.k;
        if (abnlVar != null) {
            if (l != null) {
                abnlVar.B(l.longValue());
            }
            if (l2 != null) {
                abnlVar.A(l2.longValue());
            }
        }
    }

    public final boolean S(abnl abnlVar) {
        abnl abnlVarD = d();
        if (abnlVar == null || abnlVarD == null) {
            return false;
        }
        return abnn.i(abnlVarD, abnlVar);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [acey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [abwy, java.lang.Object] */
    public final boolean T() {
        if (this.i.aV()) {
            return ((abxk) this.v.b.a()).b;
        }
        ?? r1 = this.o.d;
        if (r1 == 0 || !ay(r1)) {
            return false;
        }
        return r1.af();
    }

    public final boolean U() {
        if (this.E.b || this.i.g.l(325, 45748471L, false)) {
            return ((abvk) this.s.a).o.d != null;
        }
        return this.H.b.b();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [acey, java.lang.Object] */
    public final boolean V() {
        ?? r2;
        return U() && (r2 = this.o.d) != 0 && r2.ag();
    }

    public final boolean W() {
        return this.f.i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [acey, java.lang.Object] */
    public final boolean X() {
        ?? r0 = this.o.d;
        return r0 != 0 && r0.aj();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [acey, java.lang.Object] */
    public final boolean Y() {
        ?? r0 = this.o.d;
        return r0 != 0 && r0.ak();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [acey, java.lang.Object] */
    @Override // defpackage.acdm
    public final boolean Z() {
        ?? r0 = this.o.d;
        return r0 != 0 && r0.al();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [acey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [abwy, java.lang.Object] */
    public final float a() {
        if (this.i.aA()) {
            return ((abxg) this.v.c.a()).b;
        }
        ?? r1 = this.o.d;
        if (r1 != 0) {
            return r1.c();
        }
        return 1.0f;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [acey, java.lang.Object] */
    public final boolean aa() {
        ?? r0 = this.o.d;
        return r0 == 0 || r0.am();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [acey, java.lang.Object] */
    public final boolean ab() {
        ?? r0 = this.o.d;
        return r0 != 0 && r0.an();
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [acey, java.lang.Object] */
    public final boolean ac() {
        ?? r6;
        if (!U()) {
            return false;
        }
        abpj abpjVar = this.m;
        if (abpjVar.h.a(abnw.b)) {
            return true;
        }
        if (!abpjVar.h.a(abnw.d, abnw.e) || (r6 = this.o.d) == 0) {
            return false;
        }
        return r6.ai();
    }

    public final boolean ad() {
        return this.l.d();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [acey, java.lang.Object] */
    @Override // defpackage.acdm
    public final boolean ae(long j, appa appaVar) {
        ?? r1 = this.o.d;
        if (r1 == 0 || !ay(r1)) {
            return false;
        }
        return r1.ao(j, appaVar);
    }

    @Override // defpackage.acdm
    @Deprecated
    public final boolean af(long j) {
        return ag(j, appa.SEEK_SOURCE_UNKNOWN);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [acey, java.lang.Object] */
    @Override // defpackage.acdm
    @Deprecated
    public final boolean ag(long j, appa appaVar) {
        ?? r1 = this.o.d;
        if (r1 == 0 || !ay(r1)) {
            return false;
        }
        return r1.aq(j, appaVar);
    }

    public final void ah() {
        taq.d();
        this.e.j();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [acey, java.lang.Object] */
    public final void ai(abna abnaVar, abmy abmyVar) {
        taq.d();
        abmyVar.getClass();
        this.e.c(abnaVar, abmyVar);
        ?? r3 = this.o.d;
        if (r3 != 0) {
            r3.m().o();
            if (this.i.w() && this.f.t()) {
                x();
                return;
            }
            N();
            x();
            if (X() || !this.m.h.a(abnw.d, abnw.e)) {
                return;
            }
            this.B.gU(1);
        }
    }

    final void aj(abnl abnlVar, abnp abnpVar, wjf wjfVar, abmj abmjVar) {
        w(abnlVar, wjfVar);
        this.l.e(abnlVar, abnpVar, wjfVar, abmjVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [acey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [acey] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final void ak() {
        taq.d();
        abwk abwkVar = this.o;
        ?? r1 = abwkVar.d;
        abnp abnpVarE = abnp.a;
        ?? A = r1;
        if (r1 != 0) {
            r1.aa(false);
            abpj abpjVar = this.m;
            abnpVarE = e(abpjVar.l);
            A = abwkVar.a(abpjVar.k, abnpVarE);
        }
        this.m.i(A != 0 ? A.p() : null, abnpVarE, new abvq(this.p));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [acey, java.lang.Object] */
    public final void al() {
        if (U()) {
            abwk abwkVar = this.o;
            abpj abpjVar = this.m;
            ?? r0 = abwkVar.d;
            abpjVar.u(r0 != 0 ? r0.p() : null, new abvq(this.p));
        }
    }

    public final void am() {
        this.h.j.a = true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [acey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [abwy, java.lang.Object] */
    public final void an(boolean z) {
        ?? r0 = this.o.d;
        boolean z2 = false;
        if (r0 != 0 && ay(r0)) {
            z2 = true;
        }
        if (this.i.aV()) {
            isi isiVar = this.v;
            isiVar.b.f(new abxk(z));
        } else {
            if (r0 == 0 || !z2) {
                return;
            }
            r0.az(z);
        }
    }

    public final void ao(acca accaVar, aazh aazhVar) {
        this.g.m(accaVar, aazhVar, 4);
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [acey, java.lang.Object] */
    public final void ap(boolean z, int i) {
        taq.d();
        if (U()) {
            aboi aboiVar = this.r;
            if (aboiVar.m()) {
                abmw abmwVar = abmw.MEDIASESSION;
                aboiVar.f(z);
            }
            this.b.e(new aaxu());
            ?? r6 = this.o.d;
            if (r6 != 0) {
                abpj abpjVar = this.m;
                if (abpjVar.h == abnw.b) {
                    r6.aa(true);
                } else if (abpjVar.h.a(abnw.d, abnw.e)) {
                    r6.av(i);
                }
                abqc abqcVar = abpjVar.g;
                if (abqcVar != null) {
                    abqcVar.j();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [acey, java.lang.Object] */
    public final void aq(boolean z, int i) {
        taq.d();
        if (U()) {
            aboi aboiVar = this.r;
            if (aboiVar.m()) {
                if (txz.g(this.a) && i == 4) {
                    i = 4;
                } else {
                    abmw abmwVar = abmw.MEDIASESSION;
                    aboiVar.f(false);
                }
            }
            ?? r0 = this.o.d;
            if (r0 != 0) {
                if (z) {
                    r0.au(i);
                } else {
                    r0.ax(i);
                }
            }
            if (!this.i.w() || az()) {
                ax(false);
            }
        }
        abvi abviVar = this.d;
        if (abviVar.a) {
            abviVar.b.a.unregisterReceiver(abviVar);
            abviVar.a = false;
        }
        aavg aavgVar = this.h;
        aavgVar.h.b(aavgVar.p);
    }

    public final void ar() {
        if (this.i.w() && this.f.t()) {
            return;
        }
        N();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [acey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [acey, java.lang.Object] */
    public final void as() {
        abnl abnlVar;
        taq.d();
        abwk abwkVar = this.o;
        ?? r1 = abwkVar.d;
        if (r1 == 0 || !r1.as(abob.g)) {
            ak();
            return;
        }
        taq.d();
        ?? r2 = abwkVar.d;
        if (r2 != 0) {
            acip acipVarM = r2.m();
            if (acipVarM.f() != null && (abnlVar = this.m.k) != null) {
                abnk abnkVarF = abnlVar.f();
                abnkVarF.k = acipVarM.w().f;
                abnl abnlVarA = abnkVarF.a();
                abwkVar.a(abnlVarA, abnp.a().a());
                this.n.a(acipVarM.f(), abnlVarA, new abvg(), null);
                return;
            }
        }
        ak();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [acey, java.lang.Object] */
    public final void at(boolean z) {
        this.b.e(new aaxu());
        this.e.h();
        if (z) {
            r();
            return;
        }
        aq(true, 17);
        ?? r2 = this.o.d;
        if (r2 != 0) {
            r2.ab();
        }
    }

    public final void au() {
        ap(this.r.k(), 4);
    }

    public final void av(abwg abwgVar, avlh avlhVar, final abuz abuzVar, adws adwsVar) {
        tyy abveVar;
        isi isiVar;
        Object obj;
        avmm avmmVar = new avmm();
        aavg aavgVar = this.h;
        aavgVar.o = this;
        aavgVar.getClass();
        aawl aawlVar = new aawl(new abtq(aavgVar, 11), "PAM", 1);
        avlh avlhVar2 = (avlh) abwgVar.a;
        avmmVar.c(avlhVar2.ak(aawlVar));
        aavgVar.getClass();
        int i = 13;
        abtq abtqVar = new abtq(aavgVar, i);
        avlh avlhVar3 = (avlh) abwgVar.n;
        avmmVar.c(avlhVar3.ak(abtqVar));
        aavgVar.getClass();
        avmmVar.c(((avlh) adwsVar.h).ak(new abtq(aavgVar, 4)));
        aavr aavrVar = this.e;
        aavrVar.getClass();
        avmmVar.c(avlhVar3.ak(new abtq(aavrVar, 5)));
        aboi aboiVar = this.r;
        aboiVar.getClass();
        int i2 = 6;
        avmmVar.c(avlhVar3.ak(new abtq(aboiVar, i2)));
        abmt abmtVar = this.i;
        if (abmtVar.bx(64L)) {
            aboiVar.getClass();
            avmmVar.c(avlhVar2.ak(new aawl(new absp(aboiVar, i2), "DPM", 1)));
        }
        avmmVar.c(avlhVar.ak(new abtq(this, 7)));
        avmmVar.c(((avlh) abwgVar.k).ak(new abtq(this, 8)));
        avmmVar.c(((avlh) abwgVar.d).ak(new abtq(this, 9)));
        acag acagVar = this.g;
        if (acagVar != null) {
            avmmVar.c(avlhVar2.ak(new aawl(new abtq(acagVar, 10), "CAPC", 1)));
            avmmVar.c(((avlh) abwgVar.p).ak(new abtq(acagVar, 12)));
        }
        this.x.P();
        apbx apbxVar = abmt.q(this.C).d;
        if (apbxVar == null) {
            apbxVar = apbx.b;
        }
        ajdf ajdfVar = apbxVar.q;
        if (ajdfVar == null) {
            ajdfVar = ajdf.a;
        }
        if (ajdfVar.b && (obj = (isiVar = this.M).c) != null) {
            ((AudioManager) ((hed) isiVar.a).c).registerAudioDeviceCallback((AudioDeviceCallback) obj, null);
        }
        if (abmtVar.g.l(400, 45784494L, false)) {
            abveVar = new abve(0);
        } else {
            abuzVar.getClass();
            abveVar = new tyy() { // from class: abvf
                @Override // defpackage.tyy
                public final Object a() {
                    return abuzVar.a;
                }
            };
        }
        aavrVar.e = abveVar;
        aavrVar.l = this.k;
        abww abwwVar = this.I;
        if (!abwwVar.k.getAndSet(true)) {
            awmd awmdVar = abwwVar.e;
            if (((abmt) awmdVar.io()).g.l(69, 45411737L, false)) {
                atpl atplVar = (atpl) ((tpq) abwwVar.d.io()).c();
                if ((atplVar.b & 16384) != 0) {
                    boolean z = atplVar.r;
                    tqj tqjVar = ((abmt) awmdVar.io()).b;
                    int i3 = tqr.a;
                    if (tqjVar.k(1073830227)) {
                        tqh tqhVarD = abwwVar.j.d(2);
                        tqhVarD.b(88402, true != z ? 0L : 1L);
                        tqhVarD.b(88401, 1L);
                        tqhVarD.a();
                    }
                    abwwVar.c.kk(Optional.of(Boolean.valueOf(atplVar.r)));
                } else if (((abmt) awmdVar.io()).bm()) {
                    abwwVar.c.kk(Optional.of(Boolean.TRUE));
                }
            }
            ListenableFuture listenableFutureC = abwwVar.c();
            if (listenableFutureC != null) {
                abwu abwuVar = new abwu(3);
                Executor executor = taf.a;
                Executor executorDirectExecutor = MoreExecutors.directExecutor();
                taa taaVar = new taa(taf.c, null, abwuVar);
                long j = afwl.a;
                listenableFutureC.addListener(new ahei(listenableFutureC, new afwj(afty.c(false), taaVar, 0)), executorDirectExecutor);
            }
        }
        if (!((abmt) abwwVar.e.io()).bc() || abwwVar.l.getAndSet(true)) {
            return;
        }
        ListenableFuture listenableFutureA = ((tpq) abwwVar.d.io()).a();
        Executor executor2 = (Executor) abwwVar.f.io();
        abwu abwuVar2 = new abwu(i2);
        yqj yqjVar = new yqj(abwwVar, i);
        Executor executor3 = taf.a;
        taa taaVar2 = new taa(yqjVar, null, abwuVar2);
        long j2 = afwl.a;
        listenableFutureA.addListener(new ahei(listenableFutureA, new afwj(afty.c(false), taaVar2, 0)), executor2);
    }

    public final int b() {
        abnl abnlVarD = d();
        if (abnlVarD != null) {
            return abnlVarD.a();
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [acey, java.lang.Object] */
    @Deprecated
    public final long c() {
        ?? r2 = this.o.d;
        if (r2 == 0) {
            return 0L;
        }
        return r2.f();
    }

    public final abnl d() {
        return this.m.k;
    }

    public final abnp e(abnp abnpVar) {
        xir xirVarO = abnpVar == null ? null : abnpVar.b;
        boolean z = xirVarO instanceof xjb;
        abno abnoVarA = abnp.a();
        if (!z) {
            xirVarO = this.F.o(xirVarO == null ? 4 : xirVarO.q());
            xirVarO.k();
        }
        abnoVarA.a = xirVarO;
        return abnoVarA.a();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [acey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [acey, java.lang.Object] */
    public final abyk f(int i) {
        abnd abndVarD;
        abtx abtxVar;
        abnd abndVarD2 = null;
        if (this.E.b || this.i.g.l(326, 45748472L, false)) {
            abvk abvkVar = (abvk) this.s.a;
            ?? r0 = abvkVar.o.d;
            if (r0 == 0) {
                return new abyk(null, abvkVar.f.d(), null, null, abvkVar.h.j);
            }
            abnl abnlVarD = abvkVar.d();
            if (i == 0) {
                i = 0;
            } else {
                abndVarD2 = abvkVar.f.d();
            }
            return new abyk(abnlVarD, abndVarD2, null, r0.n(i), abvkVar.h.j);
        }
        abvj abvjVar = this.H;
        abvk abvkVar2 = abvjVar.a;
        ?? r3 = abvkVar2.o.d;
        if (r3 == 0) {
            return new abyk(null, abvkVar2.f.d(), null, null, abvkVar2.h.j);
        }
        Object obj = abvjVar.b.a;
        abnl abnlVarD2 = abvkVar2.d();
        if (i == 0) {
            abndVarD = null;
            i = 0;
        } else {
            abndVarD = abvkVar2.f.d();
        }
        if (obj != null) {
            abtn abtnVar = (abtn) obj;
            acui acuiVar = abtnVar.d;
            abpj abpjVar = abtnVar.c;
            abtxVar = new abtx(abpjVar.m, abpjVar.n, abpjVar.j, abpjVar.k, abpjVar.p, new acuh(acuiVar.d));
        } else {
            abtxVar = null;
        }
        return new abyk(abnlVarD2, abndVarD, abtxVar, r3.n(i), abvkVar2.h.j);
    }

    public final acca g() {
        return this.g.n;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [acey, java.lang.Object] */
    @Override // defpackage.acdm
    public final acfw h() {
        ?? r0 = this.o.d;
        if (r0 == 0) {
            return null;
        }
        return r0.k();
    }

    @tcc
    public void handlePlaybackServiceException(aboe aboeVar) {
        int i = aboeVar.j;
        String strA = aawb.A(i);
        abmw abmwVar = abmw.PLAYBACKSERVICE;
        abmx.b(abmwVar, "PlaybackServiceException(%s): cpn: %s", strA, aboeVar.b);
        aboi aboiVar = this.r;
        if (aboiVar.m() && aawb.B(i) && !aboeVar.g()) {
            abmx.a(abmwVar, "handlePlaybackServiceException: setIntentToPlay=false");
            aboiVar.f(false);
        }
    }

    @tcc
    public void handleSequencerEndedEvent(aayu aayuVar) {
        aboi aboiVar = this.r;
        if (aboiVar.m()) {
            abmw abmwVar = abmw.MEDIASESSION;
            aboiVar.f(false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [acey, java.lang.Object] */
    public final acfw i() {
        ?? r0 = this.o.d;
        if (r0 == 0) {
            return null;
        }
        return r0.l();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [acey, java.lang.Object] */
    public final acip j() {
        ?? r0 = this.o.d;
        if (r0 == 0) {
            return null;
        }
        return r0.m();
    }

    public final ListenableFuture k(abnt abntVar, abnl abnlVar, abnp abnpVar) {
        aw(abntVar, abnlVar);
        return this.l.a(abntVar, abnlVar, abnpVar);
    }

    public final ListenableFuture l(abnt abntVar, abnl abnlVar, abnp abnpVar, absr absrVar, abmj abmjVar) {
        aw(abntVar, abnlVar);
        return this.l.b(abntVar, abnlVar, abnpVar, absrVar, abmjVar);
    }

    public final String m() {
        abnl abnlVarD = d();
        if (abnlVarD != null) {
            return abnlVarD.u();
        }
        return null;
    }

    public final String n() {
        abnl abnlVarD = d();
        if (abnlVarD != null) {
            return abnlVarD.w();
        }
        return null;
    }

    public final List o() {
        return this.g.e();
    }

    public final void p() {
        this.s.b();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [acey, java.lang.Object] */
    public final void q() {
        ?? r0 = this.o.d;
        if (r0 != 0) {
            r0.t();
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [abwy, java.lang.Object] */
    public final void r() {
        taq.d();
        abmt abmtVar = this.i;
        if (!abmtVar.aA()) {
            this.A.z();
        } else if (abmtVar.g.l(382, 45777263L, false)) {
            this.v.c.f(abxj.a);
        }
        this.b.c(new aaxu());
        this.e.h();
        if (!abmtVar.w() || az()) {
            ax(true);
        }
        this.D.kk(new aaxk(false, this.B.a));
        D();
        this.j.b(this.f);
    }

    public final void s() {
        this.f.i(true);
    }

    public final void t(boolean z) {
        if (!this.i.e.l(178, 45617676L, false) || U()) {
            at(z);
        }
        abnc abncVar = this.e.b;
        abncVar.h = true;
        abncVar.h();
    }

    public final void u() {
        boolean zC = this.i.C();
        abwk abwkVar = this.o;
        if (zC) {
            abwkVar.b();
        } else {
            abwkVar.c();
        }
    }

    public final void v(abnl abnlVar, abnp abnpVar, abng abngVar) {
        xir xirVar;
        taq.d();
        abnlVar.getClass();
        this.s.e();
        aaxx aaxxVar = new aaxx();
        tbt tbtVar = this.b;
        tbtVar.c(aaxxVar);
        if (abnpVar != null && (xirVar = abnpVar.b) != null) {
            xirVar.f(tau.PLAYER_INITIALIZED);
        }
        this.e.d();
        this.j.a(this.f);
        ar();
        x();
        abpj abpjVar = this.m;
        abpjVar.n(abnlVar, abnpVar);
        abpjVar.f();
        if (abnlVar.K()) {
            tbtVar.e(abme.NAVIGATION);
        }
        aboi aboiVar = this.r;
        aboiVar.h(abnlVar.I());
        aboiVar.g(abnlVar.H());
        aboiVar.i(abnlVar.u());
        this.d.a();
        this.o.a(abnlVar, abnpVar);
        boolean zP = abnlVar.P();
        abmw abmwVar = abmw.MEDIASESSION;
        aboiVar.f(!zP);
        this.u.f();
        this.w.B(abnlVar, abngVar);
        abpjVar.h(abngVar.a, abnlVar, abnpVar.b);
    }

    public final void w(abnl abnlVar, wjf wjfVar) {
        if (this.i.ag()) {
            String strQ = abnlVar.q(this.K);
            zgm zgmVar = this.J;
            String strG = wjfVar.G();
            arie arieVar = abnlVar.i().c;
            if (arieVar == null) {
                arieVar = arie.a;
            }
            zgmVar.a(strQ, strG, arieVar, true, false);
        }
    }

    public final void x() {
        this.D.kk(new aaxk(true, this.B.a));
    }

    public final void y(boolean z) {
        taq.d();
        abnc abncVar = this.f;
        if (abncVar.i || abncVar.k) {
            return;
        }
        if (this.e.k != 3) {
            t(z);
            this.k = null;
            return;
        }
        abvh abvhVar = this.k;
        if (abvhVar == null) {
            ((agrc) ((agrc) y.c()).k("com/google/android/libraries/youtube/player/service/PlaybackService", "onDetachFromActivity", 2063, "PlaybackService.java")).t("In background pending state with no listener!");
        } else {
            abvhVar.b = true;
            abvhVar.a = z;
        }
    }

    @Override // defpackage.acdm
    public final void z() {
        ap(false, 19);
    }
}

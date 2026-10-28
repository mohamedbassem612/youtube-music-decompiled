package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.android.gms.cast.CastDevice;
import com.google.cardboard.sdk.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xru extends azs implements xre {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/mediaroute/MediaRouteManager");
    private final xla B;
    private boolean C;
    private dii D;
    private final vxz F;
    public final aunn b;
    public final aunn c;
    public final aunn d;
    public final aunn e;
    public final aunn f;
    public final xra g;
    public xzc i;
    public xsc j;
    public xvr k;
    public sxu l;
    public final vxz o;
    private final tbt q;
    private final aunn r;
    private final aunn s;
    private final aunn t;
    private final aunn u;
    private final aunn v;
    private final aunn w;
    private final aunn x;
    private final aunn y;
    private final aunn z;
    public int h = 0;
    private xrs E = new xrs(this);
    final zik p = new xrt(this);
    volatile Optional m = Optional.empty();
    volatile Optional n = Optional.empty();
    private final awli A = new awli();

    public xru(aunn aunnVar, tbt tbtVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6, aunn aunnVar7, aunn aunnVar8, aunn aunnVar9, aunn aunnVar10, aunn aunnVar11, aunn aunnVar12, aunn aunnVar13, aunn aunnVar14, xra xraVar, xla xlaVar, vxz vxzVar, vxz vxzVar2) {
        this.b = aunnVar;
        this.q = tbtVar;
        this.r = aunnVar2;
        this.s = aunnVar3;
        this.t = aunnVar4;
        this.u = aunnVar5;
        this.d = aunnVar6;
        this.v = aunnVar7;
        this.w = aunnVar8;
        this.c = aunnVar9;
        this.e = aunnVar10;
        this.x = aunnVar11;
        this.y = aunnVar12;
        this.z = aunnVar13;
        this.f = aunnVar14;
        this.g = xraVar;
        this.B = xlaVar;
        this.o = vxzVar;
        this.F = vxzVar2;
    }

    private final xsc U(dii diiVar) {
        dij.c();
        if (diiVar.equals(dij.a().e()) || !diiVar.p((did) this.s.io())) {
            return null;
        }
        aunn aunnVar = this.c;
        if (((xsa) aunnVar.io()).c(diiVar)) {
            return new xsc(diiVar.d, diiVar.e, xrx.a(diiVar), xsb.c);
        }
        if (!xsa.h(diiVar)) {
            if (((xsa) aunnVar.io()).d(diiVar)) {
                return new xsc(diiVar.d, diiVar.e, xrx.a(diiVar), xsb.b);
            }
            ((agrc) ((agrc) a.b().i(agso.a, "MDX.MediaRouteManager")).k("com/google/android/libraries/youtube/mdx/mediaroute/MediaRouteManager", "toMediaRoute", 896, "MediaRouteManager.java")).w("Unknown type of route info: %s", diiVar);
            return null;
        }
        if (diiVar.s == null) {
            ((agrc) ((agrc) a.b().i(agso.a, "MDX.MediaRouteManager")).k("com/google/android/libraries/youtube/mdx/mediaroute/MediaRouteManager", "toMediaRoute", 856, "MediaRouteManager.java")).t("Can not find screen from MDx route");
            return null;
        }
        xvr xvrVarC = ((yar) this.d.io()).c(diiVar.s);
        if (xvrVarC == null) {
            ((agrc) ((agrc) a.b().i(agso.a, "MDX.MediaRouteManager")).k("com/google/android/libraries/youtube/mdx/mediaroute/MediaRouteManager", "toMediaRoute", 863, "MediaRouteManager.java")).t("Can not get MDx screen from the route info");
            return null;
        }
        if ((xvrVarC instanceof xvk) || (xvrVarC instanceof xvi) || (xvrVarC instanceof xvp)) {
            return new xsc(diiVar.d, diiVar.e, xrx.a(diiVar), xsb.a);
        }
        if (xvrVarC instanceof xvn) {
            return new xsc(diiVar.d, diiVar.e, xrx.a(diiVar), new xsb(2));
        }
        ((agrc) ((agrc) a.b().i(agso.a, "MDX.MediaRouteManager")).k("com/google/android/libraries/youtube/mdx/mediaroute/MediaRouteManager", "toMediaRoute", 884, "MediaRouteManager.java")).w("Can not determine the type of screen: %s", xvrVarC);
        return null;
    }

    private final void V() {
        if (this.C) {
            return;
        }
        ycp ycpVar = (ycp) this.r.io();
        if (ycpVar.l.a()) {
            try {
                ((xmi) ycpVar.k.io()).b();
            } catch (RuntimeException e) {
                ((agrc) ((agrc) ((agrc) ycp.a.b().i(agso.a, "MDX.MdxSessionManagerImpl")).j(e)).k("com/google/android/libraries/youtube/mdx/remote/internal/MdxSessionManagerImpl", "start", (char) 189, "MdxSessionManagerImpl.java")).t("Catching the lack of module exception.");
            }
        }
        ((aczd) ycpVar.j.io()).j();
        yat yatVar = (yat) ycpVar.g.io();
        xrq xrqVar = ycpVar.o;
        taq.d();
        yatVar.l = xrqVar;
        if (!yatVar.i) {
            yatVar.i = true;
            yatVar.c.e(((avlh) yatVar.b.r().a).ak(new aawl(new xwu(yatVar.m, 2), "DSRC", 1)));
        }
        aunn aunnVar = ycpVar.h;
        ycpVar.a((xzf) aunnVar.io());
        final ycn ycnVar = (ycn) aunnVar.io();
        if (!ycnVar.d) {
            ycnVar.d = true;
            ListenableFuture listenableFutureA = ((yck) ycnVar.e.io()).a();
            tae taeVar = new tae() { // from class: ycl
                @Override // defpackage.tae, defpackage.twi
                public final void a(Object obj) {
                    int i;
                    int i2;
                    String str;
                    Optional optional = (Optional) obj;
                    if (optional.isEmpty()) {
                        return;
                    }
                    ycn ycnVar2 = ycnVar;
                    xze xzeVar = (xze) optional.get();
                    Optional optional2 = xzeVar.i;
                    if (optional2.isEmpty()) {
                        xzd xzdVar = new xzd(xzeVar);
                        amyu amyuVar = amyu.MDX_SESSION_DISCONNECT_REASON_APP_TERMINATED;
                        xzdVar.d(amyuVar);
                        xze xzeVarA = xzdVar.a();
                        ych ychVar = (ych) ycnVar2.f.io();
                        int i3 = xzeVarA.k;
                        int i4 = xzeVarA.e;
                        String str2 = xzeVarA.a;
                        amyv amyvVar = xzeVarA.f;
                        Optional optional3 = xzeVarA.h;
                        boolean zIsPresent = optional3.isPresent();
                        i = 6;
                        Locale locale = Locale.US;
                        int i5 = i3 - 1;
                        Integer numValueOf = Integer.valueOf(i5);
                        int i6 = amyuVar.aa;
                        Integer numValueOf2 = Integer.valueOf(i6);
                        Integer numValueOf3 = Integer.valueOf(zIsPresent ? 1 : 0);
                        boolean z = i4 > 0;
                        i2 = 4;
                        ((agrc) ((agrc) ych.a.c().i(agso.a, "MDX.EventLogger")).k("com/google/android/libraries/youtube/mdx/remote/internal/MdxSessionEventLogger", "logMdxSessionDisconnectedFromAppTermination", 248, "MdxSessionEventLogger.java")).w("%s", String.format(locale, "mdx session disconnected: sessionType=%d disconnectReason=%d prevState=%d reconnect=%s sessionNonce=%s sessionIndex=%d sessionSource=%s", numValueOf, numValueOf2, numValueOf3, Boolean.valueOf(z), str2, Integer.valueOf(i4), amyvVar));
                        aihf aihfVarCreateBuilder = amxn.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        amxn amxnVar = (amxn) aihfVarCreateBuilder.instance;
                        amxnVar.b |= SemanticState.Focused;
                        amxnVar.h = false;
                        aihfVarCreateBuilder.copyOnWrite();
                        amxn amxnVar2 = (amxn) aihfVarCreateBuilder.instance;
                        amxnVar2.c = i5;
                        amxnVar2.b |= 1;
                        aihfVarCreateBuilder.copyOnWrite();
                        amxn amxnVar3 = (amxn) aihfVarCreateBuilder.instance;
                        amxnVar3.i = i6;
                        amxnVar3.b |= SemanticState.Hidden;
                        aihfVarCreateBuilder.copyOnWrite();
                        amxn amxnVar4 = (amxn) aihfVarCreateBuilder.instance;
                        amxnVar4.b |= SemanticState.Multiline;
                        amxnVar4.n = str2;
                        aihfVarCreateBuilder.copyOnWrite();
                        amxn amxnVar5 = (amxn) aihfVarCreateBuilder.instance;
                        amxnVar5.b |= 16384;
                        amxnVar5.o = i4;
                        aihfVarCreateBuilder.copyOnWrite();
                        amxn amxnVar6 = (amxn) aihfVarCreateBuilder.instance;
                        amxnVar6.b |= 32;
                        amxnVar6.f = z;
                        int iF = ych.f(zIsPresent ? 1 : 0);
                        aihfVarCreateBuilder.copyOnWrite();
                        amxn amxnVar7 = (amxn) aihfVarCreateBuilder.instance;
                        amxnVar7.d = iF - 1;
                        amxnVar7.b |= 4;
                        aihfVarCreateBuilder.copyOnWrite();
                        amxn amxnVar8 = (amxn) aihfVarCreateBuilder.instance;
                        amxnVar8.k = amyvVar.E;
                        amxnVar8.b |= SemanticState.ReadOnly;
                        if (optional3.isPresent()) {
                            xyi xyiVar = (xyi) optional3.get();
                            long jB = xyiVar.b() - xzeVarA.a();
                            aihfVarCreateBuilder.copyOnWrite();
                            amxn amxnVar9 = (amxn) aihfVarCreateBuilder.instance;
                            amxnVar9.b |= 8;
                            amxnVar9.e = jB;
                            long jB2 = xyiVar.b() - xyiVar.a();
                            aihfVarCreateBuilder.copyOnWrite();
                            amxn amxnVar10 = (amxn) aihfVarCreateBuilder.instance;
                            amxnVar10.b |= SemanticState.Modal;
                            amxnVar10.l = jB2;
                        }
                        amwy amwyVarB = ychVar.b();
                        aihfVarCreateBuilder.copyOnWrite();
                        amxn amxnVar11 = (amxn) aihfVarCreateBuilder.instance;
                        amwyVarB.getClass();
                        amxnVar11.p = amwyVarB;
                        amxnVar11.b |= 32768;
                        amwu amwuVarA = ychVar.a();
                        aihfVarCreateBuilder.copyOnWrite();
                        amxn amxnVar12 = (amxn) aihfVarCreateBuilder.instance;
                        amwuVarA.getClass();
                        amxnVar12.q = amwuVarA;
                        amxnVar12.b |= 65536;
                        xeu xeuVar = ychVar.b;
                        if (xeuVar.b) {
                            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.MDX_SESSION_DISCONNECTED);
                            ztf ztfVar = xffVarA.k.e;
                            xffVarA.l = ztfVar.a();
                            ztfVar.k(xffVarA);
                        } else {
                            alos alosVar = (alos) alou.a.createBuilder();
                            alosVar.copyOnWrite();
                            alou alouVar = (alou) alosVar.instance;
                            amxn amxnVar13 = (amxn) aihfVarCreateBuilder.build();
                            amxnVar13.getClass();
                            alouVar.d = amxnVar13;
                            alouVar.c = 27;
                            xeuVar.b((alou) alosVar.build());
                        }
                        ((yck) ycnVar2.e.io()).e(xzeVarA);
                        xzeVar = xzeVarA;
                    } else {
                        i = 6;
                        i2 = 4;
                        agrx agrxVar = agso.a;
                        optional2.get();
                    }
                    yat yatVar2 = (yat) ycnVar2.g.io();
                    if (xzeVar.h.isEmpty()) {
                        return;
                    }
                    if (!yatVar2.d(xzeVar)) {
                        yatVar2.a(0);
                        return;
                    }
                    zpw zpwVar = yatVar2.k;
                    int i7 = xzeVar.k;
                    ycs ycsVarA = zpwVar.a(i7);
                    yatVar2.e = ycsVarA;
                    if (ycsVarA != null) {
                        yatVar2.c(ycsVarA, xzeVar);
                        return;
                    }
                    agrc agrcVar = (agrc) ((agrc) yat.a.c().i(agso.a, "MDX.SessionRecoveryController")).k("com/google/android/libraries/youtube/mdx/remote/internal/DefaultSessionRecoveryController", "attemptSessionRecoveryOnStart", R.styleable.AppCompatTheme_windowMinWidthMajor, "DefaultSessionRecoveryController.java");
                    if (i7 == 1) {
                        str = "MDX_SESSION_TYPE_UNKNOWN";
                    } else if (i7 == 2) {
                        str = "MDX_SESSION_TYPE_CAST";
                    } else if (i7 == 3) {
                        str = "MDX_SESSION_TYPE_DIAL";
                    } else if (i7 != i2) {
                        str = i7 != i ? "MDX_SESSION_TYPE_YONGLE" : "MDX_SESSION_TYPE_REMOTE";
                    } else {
                        str = "MDX_SESSION_TYPE_MANUALLY_PAIRED";
                    }
                    agrcVar.w("No session recoverer for loaded SessionInfo of type %s", str);
                }
            };
            Executor executor = taf.a;
            Executor executorDirectExecutor = MoreExecutors.directExecutor();
            taa taaVar = new taa(taeVar, null, taf.b);
            long j = afwl.a;
            listenableFutureA.addListener(new ahei(listenableFutureA, new afwj(afty.c(false), taaVar, 0)), executorDirectExecutor);
        }
        this.C = true;
    }

    private final void W(boolean z) {
        xsd xsdVar = new xsd(z);
        if (!this.F.l(18, 45631007L, false)) {
            this.q.c(xsdVar);
        }
        this.A.kk(xsdVar);
    }

    private final void X() {
        boolean z;
        if (this.C) {
            xqt xqtVar = (xqt) this.w.io();
            taq.d();
            synchronized (xqtVar.c) {
                z = true;
                if (xqtVar.a.isEmpty() && xqtVar.b.isEmpty()) {
                    z = false;
                }
            }
            if (z || this.h > 0) {
                return;
            }
            ycp ycpVar = (ycp) this.r.io();
            ((xmi) ycpVar.k.io()).c();
            this.C = false;
        }
    }

    private final synchronized void Y() {
        xzc xzcVar = this.i;
        boolean z = false;
        if (xzcVar != null && xzcVar.ap()) {
            z = true;
        }
        agrx agrxVar = agso.a;
        Q(true == z ? 2 : 1);
    }

    private final void Z() {
        if (this.g.c()) {
            ArrayList arrayList = new ArrayList();
            dii diiVar = this.D;
            if (diiVar != null && R(diiVar)) {
                arrayList.add(diiVar);
            }
            aunn aunnVar = this.c;
            for (dii diiVar2 : ((xsa) aunnVar.io()).l(true, false)) {
                if (R(diiVar2) && !TextUtils.isEmpty(diiVar2.e) && (diiVar == null || !xsa.b(diiVar2.d, diiVar.d))) {
                    arrayList.add(diiVar2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                dii diiVar3 = (dii) arrayList.get(i4);
                arrayList2.add(new djg(new auzc(diiVar3.d)));
                if (((xsa) aunnVar.io()).d(diiVar3)) {
                    i++;
                } else {
                    xvr xvrVarC = diiVar3.s != null ? ((yar) this.d.io()).c(diiVar3.s) : null;
                    if (xvrVarC instanceof xvn) {
                        i2++;
                    } else if (xvrVarC != null) {
                        i3++;
                    }
                }
            }
            yu yuVar = new yu();
            yuVar.a(arrayList2);
            dij.m(new djh(yuVar));
            ArrayList arrayList3 = new ArrayList();
            if (i > 0) {
                aihf aihfVarCreateBuilder = amxj.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                amxj amxjVar = (amxj) aihfVarCreateBuilder.instance;
                amxjVar.c = 1;
                amxjVar.b |= 1;
                aihfVarCreateBuilder.copyOnWrite();
                amxj amxjVar2 = (amxj) aihfVarCreateBuilder.instance;
                amxjVar2.b |= 2;
                amxjVar2.d = i;
                arrayList3.add((amxj) aihfVarCreateBuilder.build());
            }
            if (i2 > 0) {
                aihf aihfVarCreateBuilder2 = amxj.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                amxj amxjVar3 = (amxj) aihfVarCreateBuilder2.instance;
                amxjVar3.c = 2;
                amxjVar3.b |= 1;
                aihfVarCreateBuilder2.copyOnWrite();
                amxj amxjVar4 = (amxj) aihfVarCreateBuilder2.instance;
                amxjVar4.b |= 2;
                amxjVar4.d = i2;
                arrayList3.add((amxj) aihfVarCreateBuilder2.build());
            }
            if (i3 > 0) {
                aihf aihfVarCreateBuilder3 = amxj.a.createBuilder();
                aihfVarCreateBuilder3.copyOnWrite();
                amxj amxjVar5 = (amxj) aihfVarCreateBuilder3.instance;
                amxjVar5.c = 3;
                amxjVar5.b |= 1;
                aihfVarCreateBuilder3.copyOnWrite();
                amxj amxjVar6 = (amxj) aihfVarCreateBuilder3.instance;
                amxjVar6.b |= 2;
                amxjVar6.d = i3;
                arrayList3.add((amxj) aihfVarCreateBuilder3.build());
            }
            xrr xrrVar = (xrr) this.v.io();
            if (arrayList3.isEmpty()) {
                return;
            }
            aihf aihfVarCreateBuilder4 = amxk.a.createBuilder();
            aihfVarCreateBuilder4.copyOnWrite();
            amxk amxkVar = (amxk) aihfVarCreateBuilder4.instance;
            aiie aiieVar = amxkVar.e;
            if (!aiieVar.c()) {
                amxkVar.e = aihn.mutableCopy(aiieVar);
            }
            aifs.addAll(arrayList3, amxkVar.e);
            xff xffVarA = xrrVar.c.a(aihfVarCreateBuilder4, alot.MDX_ROUTE_DISTRIBUTION_SNAPSHOT);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [awmd, java.lang.Object] */
    @Override // defpackage.azs
    public final void A(dii diiVar, int i) {
        xra xraVar = this.g;
        agrx agrxVar = agso.a;
        boolean z = false;
        if (xraVar.c() && !((Boolean) ((elq) xraVar.a.io()).a.io()).booleanValue() && xrx.e(CastDevice.c(diiVar.s))) {
            ((agrc) ((agrc) a.c().i(agrxVar, "MDX.MediaRouteManager")).k("com/google/android/libraries/youtube/mdx/mediaroute/MediaRouteManager", "onRouteSelected", 611, "MediaRouteManager.java")).t("Not allowed to cast to audio device.");
            P();
            K(false);
            this.q.c(new xqp(diiVar));
            return;
        }
        xsc xscVarU = U(diiVar);
        this.j = xscVarU;
        if (xscVarU != null) {
            if (xscVarU.a() - 1 != 3) {
                this.i = ((ycp) this.r.io()).e;
            } else {
                aunn aunnVar = this.t;
                if (aunnVar.io() != null) {
                    ((abnc) aunnVar.io()).p(new abnq(5, 3));
                }
            }
            this.D = diiVar;
        } else {
            if (this.B.az()) {
                xzc xzcVar = this.i;
                if (xzcVar == null) {
                    xzcVar = ((ycp) this.r.io()).e;
                }
                dii diiVar2 = this.D;
                if (diiVar2 != null && ((xrj) this.e.io()).e(diiVar2.d)) {
                    z = true;
                }
                if (xzcVar != null && xzcVar.r() == amyu.MDX_SESSION_DISCONNECT_REASON_UNKNOWN && !xzcVar.ao() && !z && i != 2 && i != 1) {
                    xzcVar.aa(true);
                    xzcVar.J();
                }
            }
            this.D = null;
            this.i = null;
        }
        this.k = null;
        this.l = null;
        Z();
        K(true);
    }

    @Override // defpackage.azs
    public final void B(dii diiVar, int i) {
        aunn aunnVar;
        agrx agrxVar = agso.a;
        if (this.g.c()) {
            Z();
            return;
        }
        dii diiVar2 = this.D;
        if (diiVar2 == null || !diiVar2.equals(diiVar)) {
            return;
        }
        if (this.j.a() - 1 == 3 && (aunnVar = this.t) != null) {
            ((abnc) aunnVar.io()).p(new abnq());
        }
        this.i = null;
        this.j = null;
        this.D = null;
        K(true);
    }

    public final avlr H() {
        return this.A.H();
    }

    public final void I(Object obj) {
        taq.d();
        ((xqt) this.w.io()).a(obj);
        X();
    }

    public final synchronized void J(dii diiVar) {
        diiVar.i(true);
    }

    public final synchronized void K(boolean z) {
        if (this.j != null) {
            agrx agrxVar = agso.a;
            if (z) {
                if (!this.o.l(43, 45383917L, false)) {
                    boolean z2 = ((xmr) this.y.io()).j;
                }
                xsc xscVar = this.j;
                if (xscVar != null) {
                    aunn aunnVar = this.z;
                    Optional optionalOfNullable = Optional.ofNullable(xscVar.b);
                    ydu yduVar = (ydu) aunnVar.io();
                    taf.g(ahno.as(yduVar.b, new row(yduVar, optionalOfNullable, 16, null), MoreExecutors.directExecutor()), new ixb(yduVar, 20));
                }
            }
        } else {
            agrx agrxVar2 = agso.a;
        }
        this.q.c(new xse(this.j, z));
    }

    public final void L() {
        taq.d();
        V();
        int i = this.h;
        this.h = i + 1;
        if (i == 0) {
            aunn aunnVar = this.r;
            ycp ycpVar = (ycp) aunnVar.io();
            taq.d();
            xrs xrsVar = this.E;
            if (xrsVar == null) {
                xrsVar = new xrs(this);
                this.E = xrsVar;
            }
            ycpVar.a(xrsVar);
            taq.d();
            V();
            ((xqt) this.w.io()).b(this, false);
            xwv xwvVar = (xwv) this.x.io();
            avmm avmmVar = xwvVar.e;
            xqy xqyVar = xwvVar.j;
            abvn abvnVar = xwvVar.d;
            avmmVar.e(((avlh) abvnVar.r().i).ak(new vub(xqyVar, 20)));
            xqy xqyVar2 = xwvVar.i;
            int i2 = 11;
            avmmVar.e(abvnVar.P().al(new xwu(xqyVar2, 1), new jop(i2)), abvnVar.N().al(new xwu(xqyVar2, 0), new jop(i2)));
            dij dijVar = (dij) this.b.io();
            xra xraVar = this.g;
            xraVar.a();
            xraVar.b(true);
            dijVar.p((did) this.s.io(), this, 0);
            xrr xrrVar = (xrr) this.v.io();
            zik zikVar = xrrVar.i;
            if (Math.random() < 0.5d) {
                xrrVar.d.f(xrrVar.e);
                xrrVar.a();
            }
            xzc xzcVar = this.i;
            dij.c();
            xsc xscVarU = U(dij.a().f());
            this.j = xscVarU;
            if (xscVarU != null) {
                dij.c();
                this.D = dij.a().f();
                this.i = ((ycp) aunnVar.io()).e;
                if (this.j.a() == 4) {
                    aunn aunnVar2 = this.t;
                    if (aunnVar2.io() != null) {
                        ((abnc) aunnVar2.io()).p(new abnq(5, 3));
                    }
                }
            } else {
                if (this.i != null) {
                    agrx agrxVar = agso.a;
                    this.i.J();
                }
                this.D = null;
                this.i = null;
            }
            if (xzcVar != this.i) {
                K(false);
            }
            Z();
        }
    }

    public final void M() {
        taq.d();
        int i = this.h - 1;
        this.h = i;
        if (i == 0) {
            ((xwv) this.x.io()).e.b();
            xrr xrrVar = (xrr) this.v.io();
            xrrVar.d.l(xrrVar.e);
            xrrVar.b.removeCallbacks(xrrVar.f);
            if (this.i == null) {
                ((xqt) this.w.io()).a(this);
                xra xraVar = this.g;
                xraVar.b(false);
                boolean zC = xraVar.c();
                aunn aunnVar = this.b;
                if (zC) {
                    ((dij) aunnVar.io()).p((did) this.s.io(), this, 0);
                } else {
                    ((dij) aunnVar.io()).q(this);
                }
            }
            X();
        }
    }

    public final void N(Object obj) {
        taq.d();
        V();
        ((xqt) this.w.io()).b(obj, true);
    }

    public final synchronized void O() {
        this.m = Optional.empty();
        this.n = Optional.empty();
    }

    public final void P() {
        dii diiVarJ = dij.j();
        if (dij.f() == diiVarJ) {
            agrx agrxVar = agso.a;
            return;
        }
        xrj xrjVar = (xrj) this.e.io();
        String str = diiVarJ.d;
        xrh xrhVarA = xri.a();
        xrhVarA.c(true);
        xrjVar.d(str, xrhVarA.a());
        Y();
    }

    public final synchronized void Q(int i) {
        dij.o(i);
    }

    public final boolean R(dii diiVar) {
        return ((xsa) this.c.io()).d(diiVar) || xsa.h(diiVar);
    }

    public final boolean S(dii diiVar, xyv xyvVar) {
        xyvVar.getClass();
        ahno.F(xyvVar.e());
        return T(diiVar, xyvVar, null);
    }

    public final boolean T(dii diiVar, xyv xyvVar, amyv amyvVar) {
        taq.d();
        agrx agrxVar = agso.a;
        if (!R(diiVar)) {
            ((agrc) ((agrc) a.c().i(agrxVar, "MDX.MediaRouteManager")).k("com/google/android/libraries/youtube/mdx/mediaroute/MediaRouteManager", "selectRouteInternal", 548, "MediaRouteManager.java")).t("unable to select non youtube mdx route");
            return false;
        }
        xrj xrjVar = (xrj) this.e.io();
        String str = diiVar.d;
        zj zjVar = new zj((byte[]) null, (short[]) null);
        zjVar.c = xyvVar;
        zjVar.a = amyvVar;
        xrjVar.c(str, zjVar.k());
        J(diiVar);
        return true;
    }

    @Override // defpackage.xre
    public final boolean a(dii diiVar) {
        diiVar.getClass();
        return T(diiVar, null, null);
    }

    @tcc
    void onPlaybackSessionChangeEvent(aaxk aaxkVar) {
        dij.l(((aceo) this.u.io()).c());
    }

    @Override // defpackage.azs
    public final void x(dii diiVar) {
        xvr xvrVarC;
        agrx agrxVar = agso.a;
        if (this.k != null && xsa.h(diiVar) && diiVar.s != null && (xvrVarC = ((yar) this.d.io()).c(diiVar.s)) != null && this.k.d().equals(xvrVarC.d())) {
            J(diiVar);
            sxu sxuVar = this.l;
            if (sxuVar != null) {
                sxuVar.b(this.k, Boolean.TRUE);
            }
            this.k = null;
            this.l = null;
        }
        if (U(diiVar) != null) {
            W(true);
        }
        Z();
    }

    @Override // defpackage.azs
    public final void y(dii diiVar) {
        if (U(diiVar) != null) {
            W(true);
        }
        Z();
    }

    @Override // defpackage.azs
    public final void z(dii diiVar) {
        if (U(diiVar) != null) {
            W(false);
        }
        Z();
    }
}

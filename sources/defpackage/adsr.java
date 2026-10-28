package defpackage;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import androidx.car.app.model.Alert;
import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class adsr extends aduc implements View.OnClickListener, advm, adwr, advq {
    public static final agrf i = agrf.h("com/google/android/libraries/youtube/rendering/ui/AbstractSectionListController");
    public aeay A;
    public final Executor B;
    public final Executor C;
    public final boolean D;
    public final boolean E;
    public final adxz F;
    protected agbc G;
    protected mav H;
    protected max I;
    public adxr J;
    protected agbj K;
    protected adwq L;
    public adkz M;
    public adkz N;
    public adus O;
    public volatile boolean P;
    public boolean Q;
    public boolean R;
    public String S;
    public boolean T;
    public Runnable U;
    public boolean V;
    public adtq W;
    public aeck X;
    public final Rect Y;
    public final vxz Z;
    private final advd a;
    private acjx aA;
    private acjx aB;
    private acjx aC;
    private final Set aD;
    private apop aE;
    private final tqj aF;
    private final AtomicBoolean aG;
    private final AtomicBoolean aH;
    private final adul aI;
    private aesp aJ;
    private final abhh aK;
    public final vxz aa;
    protected final vxz ab;
    public final vwt ac;
    protected ahud ad;
    private avmn aw;
    private boolean ax;
    private boolean ay;
    private boolean az;
    private final adww b;
    private final adwj c;
    private final adlk d;
    private final avmn e;
    private final avmb f;
    private final avlh g;
    private admb h;
    public final adlq j;
    final adlq k;
    public final View l;
    public final admc m;
    public final List n;
    public final List o;
    public final Map p;
    public final aglz q;
    public final tbt r;
    public final vyo s;
    public final adsp t;
    public final long u;
    public final Object v;
    public final List w;
    public final aecs x;
    final aunn y;
    public final Optional z;

    /* JADX WARN: Illegal instructions before constructor call */
    public adsr(adwt adwtVar) {
        adxd adxdVar = adwtVar.a;
        super(adxdVar != null ? adxdVar.o : null, adwtVar.f, adwtVar.g, new Object(), adwtVar.i, adwtVar.j, adwtVar.k, adwtVar.s, adwtVar.A);
        this.v = new Object();
        int i2 = 1;
        this.A = new aeay(1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, new Random().nextInt(Alert.DURATION_SHOW_INDEFINITELY) + 1);
        this.S = "";
        int i3 = 0;
        this.T = false;
        this.aD = new HashSet();
        this.aG = new AtomicBoolean(false);
        this.Y = new Rect();
        this.aH = new AtomicBoolean(false);
        this.l = adwtVar.b;
        admc admcVar = adwtVar.c;
        this.m = admcVar;
        this.r = adwtVar.g;
        this.a = adwtVar.h;
        this.b = adwtVar.l;
        this.c = adwtVar.m;
        this.s = adwtVar.n;
        this.aK = adwtVar.G;
        this.f = adwtVar.r;
        aecs aecsVar = adwtVar.t;
        this.x = aecsVar;
        vxz vxzVar = adwtVar.D;
        this.aa = vxzVar;
        vxz vxzVar2 = adwtVar.C;
        this.Z = vxzVar2;
        vxz vxzVar3 = adwtVar.E;
        this.ab = vxzVar3;
        boolean z = vxzVar2 != null && vxzVar2.l(394, 45763000L, false);
        this.D = z;
        this.E = vxzVar3 != null && vxzVar3.l(122, 45822202L, false);
        adlq adlqVar = new adlq(z);
        this.j = adlqVar;
        boolean z2 = vxzVar != null && vxzVar.l(45, 45760000L, false);
        boolean z3 = vxzVar != null && vxzVar.l(71, 45793816L, false);
        boolean z4 = vxzVar != null && vxzVar.l(47, 45760504L, false);
        boolean z5 = vxzVar != null && vxzVar.l(48, 45760505L, false);
        aecsVar.getClass();
        boolean z6 = z;
        this.k = new admt(new tbq(aecsVar, 7), aecsVar.f(), z6, z2, z3, z4, z5);
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.w = new ArrayList();
        this.p = new HashMap();
        this.q = new aghn(null);
        adsp adspVar = new adsp(this, adwtVar.d, adwtVar.e);
        this.t = adspVar;
        this.az = true;
        this.V = true;
        this.W = adwtVar.k;
        this.ac = adwtVar.F;
        aunn aunnVar = adwtVar.u;
        this.y = aunnVar;
        this.z = (vxzVar == null || !vxzVar.l(21, 45715061L, false)) ? Optional.empty() : Optional.of(new lqa((byte[]) null, (byte[]) null, (byte[]) null, (char[]) null));
        this.aF = adwtVar.w;
        this.ad = new ahud(adwtVar.f, adwtVar.g, new Object(), adwtVar.i, adwtVar.j, adwtVar.A);
        this.B = adwtVar.y;
        this.C = adwtVar.z;
        if (adwtVar.x == null) {
            this.F = null;
        } else if (vxzVar2 == null || !vxzVar2.l(338, 45723774L, false)) {
            this.F = ((aciz) adwtVar.x.io()).l(this);
        } else {
            aciz acizVar = (aciz) adwtVar.x.io();
            adxd adxdVar2 = adwtVar.a;
            this.F = acizVar.m(this, adxdVar2 instanceof adsq ? ((adsq) adxdVar2).k : null);
        }
        if (z6) {
            taq.d();
        }
        if (vxzVar != null && vxzVar.l(23, 45718242L, false)) {
            aJ();
            this.aq = true;
        }
        if (this.ad != null && vxzVar != null && vxzVar.m(109, 45845051L)) {
            ((adtv) this.ad.b).aJ();
        }
        if (adwtVar.B) {
            this.ar = true;
        }
        adxd adxdVar3 = adwtVar.a;
        if (adxdVar3 instanceof adsq) {
            adsq adsqVar = (adsq) adxdVar3;
            this.aI = adsqVar.n;
            this.aE = adsqVar.h;
            this.H = adsqVar.i;
            this.J = adsqVar.j;
            if (z6) {
                this.A = adsqVar.g;
                taq.d();
            }
            adxr adxrVar = this.J;
            if (adxrVar != null) {
                adxrVar.e(this);
                this.J.d(this);
                this.J.f(this.F);
                if (aunnVar != null && vxzVar2 != null && vxzVar2.l(522, 45847492L, false)) {
                    agbj agbjVar = (agbj) ((Container) aunnVar.io()).b(afyd.a(), new acfa(this.J, 5));
                    this.K = agbjVar;
                    mav mavVar = this.H;
                    if (mavVar != null) {
                        mavVar.b(agbjVar);
                    } else {
                        max maxVar = this.I;
                        if (maxVar != null) {
                            maxVar.c(new adsk(this, i2));
                        }
                    }
                }
            }
            if (this.ad != null && aunnVar != null) {
                agbc agbcVarAU = aU((Container) aunnVar.io(), this.ad);
                this.G = agbcVarAU;
                mav mavVar2 = this.H;
                if (mavVar2 != null) {
                    mavVar2.b(agbcVarAU);
                } else {
                    max maxVar2 = this.I;
                    if (maxVar2 != null) {
                        maxVar2.c(new adsk(this, i3));
                    }
                }
            }
            aP(I());
            if (al()) {
                this.Q = adsqVar.m;
            }
            aT(adsqVar.a, adsqVar.b, this.Q);
            this.T = adsqVar.e;
            adspVar.e(adsqVar.c);
            this.aC = adsqVar.d;
            this.S = adsqVar.f;
            if (al()) {
                this.R = adsqVar.l;
            }
            ak();
        } else {
            this.aI = new adul(null, null);
        }
        this.e = adwtVar.o.x(new ifu(this, 6)).ak(new acae(this, 15));
        this.g = adwtVar.p;
        this.u = adwtVar.q;
        ((admo) admcVar).D(adlqVar, null);
        adlk adlkVar = new adlk(adwtVar.j, 0);
        this.d = adlkVar;
        admcVar.jR(adlkVar);
        admcVar.jR(new adlk(adwtVar.j, 0));
        admcVar.jR(new adwu(this, 0));
        admcVar.g(adspVar);
        if (this.h == null) {
            this.h = new adso(this, 0);
        }
        admcVar.g(this.h);
        adspVar.g(this.as, null);
    }

    public static void P(Object obj, List list, boolean z) {
        if (obj instanceof adai) {
            list.add((adai) obj);
            return;
        }
        if (obj instanceof acxm) {
            list.add((acxm) obj);
            return;
        }
        if (obj instanceof adla) {
            for (Object obj2 : ((adla) obj).b()) {
                if (obj2 instanceof adai) {
                    list.add((adai) obj2);
                } else if (z && (obj2 instanceof acxm)) {
                    list.add((acxm) obj2);
                }
            }
        }
    }

    private final void aO(wgd wgdVar) {
        boolean z = false;
        if (wgdVar != null && wgdVar.a.s) {
            z = true;
        }
        this.T = z;
        ak();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [adkz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [adky, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [awmd, java.lang.Object] */
    private final void aP(adwq adwqVar) {
        boolean z;
        maw mawVar;
        abhh abhhVar;
        vwt vwtVar;
        aesp aespVar = this.aJ;
        if (aespVar != null) {
            aespVar.d.n(aespVar.i);
            qzo qzoVar = new qzo(3);
            ?? r0 = aespVar.h;
            j$.util.Map.EL.forEach(r0, qzoVar);
            r0.clear();
            this.aJ = null;
        }
        if (adwqVar != null && (((mawVar = adwqVar.a) != null || adwqVar.b != null) && (abhhVar = this.aK) != null && (vwtVar = this.ac) != null)) {
            View view = this.l;
            adlq adlqVar = this.j;
            agfr agfrVar = adwqVar.b;
            abxv abxvVar = (abxv) abhhVar.a.io();
            abxvVar.getClass();
            ci ciVar = (ci) abhhVar.b.io();
            ciVar.getClass();
            view.getClass();
            adlqVar.getClass();
            this.aJ = new aesp(abxvVar, ciVar, vwtVar, view, adlqVar, (mav) mawVar, (max) agfrVar);
        }
        apop apopVar = this.aE;
        if (apopVar != null && apopVar.e) {
            View view2 = this.l;
            if (view2 instanceof RecyclerView) {
                np npVar = ((RecyclerView) view2).n;
                if (npVar instanceof LinearLayoutManager) {
                    ((LinearLayoutManager) npVar).setStackFromEnd(true);
                } else if (npVar instanceof FlowLayoutManager) {
                    FlowLayoutManager flowLayoutManager = (FlowLayoutManager) npVar;
                    flowLayoutManager.assertNotInLayoutOrScroll(null);
                    if (!flowLayoutManager.A) {
                        flowLayoutManager.A = true;
                        flowLayoutManager.requestLayout();
                    }
                } else {
                    z = false;
                }
                z = true;
            } else {
                z = false;
            }
            vxz vxzVar = this.aa;
            if (vxzVar != null && vxzVar.l(26, 45721176L, true) && z) {
                adsp adspVar = this.t;
                adspVar.e = true;
                adsr adsrVar = adspVar.f;
            }
        }
        ListenableFuture listenableFutureI = this.x.i(this.aE, adwqVar);
        hvf hvfVar = new hvf(this, 10);
        Executor executor = taf.a;
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        taa taaVar = new taa(hvfVar, null, taf.b);
        long j = afwl.a;
        listenableFutureI.addListener(new ahei(listenableFutureI, new afwj(afty.c(false), taaVar, 0)), executorDirectExecutor);
    }

    private final boolean aQ(apho aphoVar) {
        vxz vxzVar = this.aa;
        return vxzVar != null && vxzVar.l(56, 45775055L, false) && aphoVar.j;
    }

    private final void aR(apho aphoVar) {
        adkz adkzVar;
        if (this.E && (adkzVar = this.N) != null) {
            this.j.m(-1, adkzVar, true);
        }
        this.t.b(aawb.ae(aphoVar));
        this.t.c();
    }

    private final void aS(wgd wgdVar, int i2, boolean z, boolean z2) {
        apop apopVar;
        if (wgdVar != null) {
            boolean z3 = !z2;
            int i3 = i2 - 1;
            if (i3 == 0) {
                super.aI(wgdVar.a());
                ak();
            } else if (i3 == 1) {
                t(wgdVar.a());
            }
            if (!z2) {
                this.R = z && this.R;
                h(wgdVar.a);
                aO(wgdVar);
            }
            if (z2) {
                vxz vxzVar = this.aa;
                if (vxzVar != null) {
                    vxzVar.l(72, 45794925L, false);
                }
            } else {
                apoq apoqVar = wgdVar.a;
                if ((apoqVar.c & 134217728) != 0) {
                    apopVar = apoqVar.t;
                    if (apopVar == null) {
                        apopVar = apop.a;
                    }
                } else {
                    apopVar = null;
                }
                this.aE = apopVar;
                aP(I());
            }
            if (!z2) {
                this.S = wgdVar.a.l;
            }
            aT(wgdVar.b(), null, z2);
            this.Q = true;
            Iterator it = this.w.iterator();
            while (it.hasNext()) {
                ((aecm) it.next()).a(wgdVar, z3);
            }
            ad();
        }
    }

    private final void aT(List list, List list2, boolean z) {
        adlq adlqVar;
        adkz adkzVar;
        if (!z && (adkzVar = this.M) != null) {
            adlq adlqVar2 = this.j;
            if (adlqVar2.i(adkzVar) == -1) {
                adlqVar2.m(0, this.M, true);
            }
        }
        aecs aecsVar = this.x;
        if (aecsVar.h() && (adlqVar = this.k) != null) {
            adlq adlqVar3 = this.j;
            if (adlqVar3.i(adlqVar) == -1) {
                adlqVar3.m(y(), adlqVar, true);
            }
        }
        Iterator it = list.iterator();
        Iterator it2 = list2 != null ? list2.iterator() : null;
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            adsr adsrVar = this;
            adlp adlpVarE = adsrVar.E(it.next(), (it2 == null || !it2.hasNext()) ? null : (adxd) it2.next(), -1, false, -1);
            if (adlpVarE != null) {
                arrayList.add(adlpVarE);
            }
            this = adsrVar;
        }
        adsr adsrVar2 = this;
        if (!arrayList.isEmpty()) {
            if (aecsVar.h()) {
                adsrVar2.k.p(arrayList);
            } else {
                adsrVar2.j.p(arrayList);
            }
        }
        adsp adspVar = adsrVar2.t;
        adspVar.b(null);
        adspVar.c();
        adkz adkzVar2 = adsrVar2.N;
        if (adkzVar2 != null) {
            adlq adlqVar4 = adsrVar2.j;
            if (adlqVar4.i(adkzVar2) == -1) {
                adlqVar4.m(-1, adsrVar2.N, true);
            }
        }
    }

    private static final agbc aU(Container container, ahud ahudVar) {
        return (agbc) container.b(new afzb(7), new acfa(ahudVar, 4));
    }

    public static final String av(advc advcVar) {
        String strP = advcVar instanceof advj ? ((advj) advcVar).p() : null;
        if (TextUtils.isEmpty(strP)) {
            return null;
        }
        return strP;
    }

    private final synchronized max k() {
        max maxVar;
        Container containerC = C();
        maxVar = this.I;
        if (maxVar == null && containerC != null) {
            maxVar = new max(new jxq(new WeakReference(this), containerC, 19, null));
            this.I = maxVar;
        }
        return maxVar;
    }

    private final void l(acjx acjxVar, apho aphoVar, twi twiVar, adud adudVar, ajwo ajwoVar, boolean z) {
        M(z);
        aR(aphoVar);
        aD(twiVar, adudVar, acjxVar, ajwoVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void q(advc advcVar) {
        if (advcVar instanceof adtv) {
            adtv adtvVar = (adtv) advcVar;
            if (aL(adtvVar)) {
                ag(adtvVar);
            }
        }
    }

    @Override // defpackage.advq
    public final View A() {
        return this.l;
    }

    public final synchronized mav B() {
        mav mavVar;
        Container containerC = C();
        mavVar = this.H;
        if (mavVar == null && containerC != null) {
            mavVar = new mav(containerC);
            agbj agbjVar = (agbj) containerC.b(afyd.a(), new aazx(this, containerC, 9));
            mavVar.b(agbjVar);
            vxz vxzVar = this.Z;
            if (vxzVar != null && vxzVar.l(522, 45847492L, false)) {
                this.K = agbjVar;
            }
            ahud ahudVar = this.ad;
            if (ahudVar != null) {
                agbc agbcVarAU = aU(containerC, ahudVar);
                this.G = agbcVarAU;
                mavVar.b(agbcVarAU);
            }
            this.H = mavVar;
        }
        return mavVar;
    }

    public final Container C() {
        aunn aunnVar = this.y;
        if (aunnVar != null) {
            return (Container) aunnVar.io();
        }
        return null;
    }

    public final adkz D() {
        return this.j;
    }

    public final adlp E(Object obj, adxd adxdVar, int i2, boolean z, int i3) {
        adlp adlpVarM;
        advc advcVarA = this.a.a(obj, adxdVar, this);
        if (advcVarA == null) {
            return null;
        }
        List list = this.n;
        if (i2 == -1) {
            list.add(advcVarA);
            this.o.add(obj);
        } else {
            list.add(i2, advcVarA);
            this.o.add(i2, obj);
        }
        if (this.x.h()) {
            adlpVarM = this.k.m(i2, advcVarA.a(), z);
        } else {
            int iY = y();
            vxz vxzVar = this.Z;
            boolean z2 = false;
            if (vxzVar != null && vxzVar.l(404, 45768267L, false)) {
                if (i3 != -1) {
                    z2 = true;
                } else {
                    i3 = -1;
                }
            }
            adlq adlqVar = this.j;
            if (z2) {
                i2 = i3;
            } else if (i2 == -1) {
                i2 = iY;
            }
            adlpVarM = adlqVar.m(i2, advcVarA.a(), z);
        }
        String strAv = av(advcVarA);
        if (strAv != null) {
            this.q.u(strAv, advcVarA);
            this.p.put(strAv, advcVarA);
        }
        q(advcVarA);
        return adlpVarM;
    }

    @Override // defpackage.advq
    public final adlq F() {
        vxz vxzVar;
        return (this.x.h() && (vxzVar = this.Z) != null && vxzVar.l(445, 45793784L, false)) ? this.k : this.j;
    }

    @Override // defpackage.advq
    public final adlq G() {
        return this.j;
    }

    @Override // defpackage.adtv
    protected final adtq H() {
        adtq adtqVar;
        synchronized (this.v) {
            adtqVar = this.W;
        }
        return adtqVar;
    }

    public final adwq I() {
        max maxVarK;
        adwq adwqVar = null;
        mav mavVarB = null;
        if (r()) {
            synchronized (this) {
                adwq adwqVar2 = this.L;
                if (adwqVar2 == null) {
                    vxz vxzVar = this.Z;
                    if (vxzVar == null || !vxzVar.l(313, 45710608L, false)) {
                        mavVarB = B();
                        maxVarK = null;
                    } else {
                        maxVarK = k();
                    }
                    adwq adwqVar3 = new adwq(mavVarB, maxVarK, this.aG);
                    this.L = adwqVar3;
                    adwqVar = adwqVar3;
                } else {
                    adwqVar = adwqVar2;
                }
            }
        }
        return adwqVar;
    }

    @Override // defpackage.advq
    public final agke J() {
        return agke.n(this.n);
    }

    @Deprecated
    protected final void K(Object obj) {
        this.R = true;
        E(obj, null, -1, true, -1);
    }

    public final void L(adlz adlzVar) {
        this.m.jR(adlzVar);
    }

    public void M(boolean z) {
        throw null;
    }

    @Override // defpackage.adtb
    public final void N(apho aphoVar, ajwo ajwoVar) {
        acjx acjxVarAe = aawb.ae(aphoVar);
        if (acjxVarAe == null) {
            ((agrc) ((agrc) i.b()).k("com/google/android/libraries/youtube/rendering/ui/AbstractSectionListController", "clearAndForceRefresh", 1740, "AbstractSectionListController.java")).w("Attempted to force refresh with invalid continuation: %s", aphoVar);
            return;
        }
        M(false);
        aR(aphoVar);
        aF(acjxVarAe, ajwoVar);
    }

    @Override // defpackage.adtb
    public final void O(apho aphoVar, twi twiVar, adud adudVar, ajwo ajwoVar) {
        l(aawb.ae(aphoVar), aphoVar, twiVar, adudVar, ajwoVar, aQ(aphoVar));
    }

    @Override // defpackage.advq
    public final void Q() {
        this.aG.set(false);
        AtomicBoolean atomicBoolean = this.aH;
        if (atomicBoolean.get()) {
            ad();
            atomicBoolean.set(false);
        }
    }

    public final void R() {
        for (aecm aecmVar : this.w) {
        }
        boolean z = this.ax;
        if (!z || this.ay) {
            this.ax = true;
            if (!z) {
                S();
            }
            if (this.ar) {
                ConcurrentMap.EL.forEach(this.ak, new gpd(this, 17));
            }
            if (this.n.isEmpty()) {
                acjw acjwVar = acjw.d;
                if (o(acjwVar)) {
                    hR(acjwVar);
                    this.ay = false;
                }
            }
            if (this.ay) {
                hP();
                this.ay = false;
            }
        }
    }

    protected abstract void S();

    @Override // defpackage.advq
    public final void T(apox apoxVar, int i2) {
        U(apoxVar, i2, i2);
    }

    @Override // defpackage.advq
    public final void U(apox apoxVar, int i2, int i3) {
        Optional optionalC = wgd.c(apoxVar);
        if (optionalC.isEmpty()) {
            return;
        }
        E(optionalC.get(), null, i2, true, i3);
    }

    @Override // defpackage.advq
    public final void V(int i2) {
        af(i2);
    }

    public final void W() {
        this.ay = true;
    }

    public final void X() {
        acjw acjwVar = acjw.c;
        acjx acjxVarHQ = hQ(acjwVar);
        if (this.aB != acjxVarHQ) {
            hR(acjwVar);
            this.aB = acjxVarHQ;
        }
    }

    protected final void Y(wgd wgdVar, acjx acjxVar) {
        int i2;
        acjw acjwVarA;
        super.hs(wgdVar, acjxVar);
        if (wgdVar != null) {
            if (acjxVar.a() == acjw.d) {
                au(wgdVar, acjxVar.f());
                return;
            }
            if (!this.ap) {
                i2 = 1;
            } else if (this.aD.contains(acjxVar.a())) {
                i2 = 3;
            } else {
                if (this.aq) {
                    acjw acjwVarA2 = acjxVar.a();
                    agke agkeVarA = wgdVar.a();
                    acjw acjwVar = acjw.b;
                    if (acjwVarA2 == acjwVar) {
                        int size = agkeVarA.size();
                        int i3 = 0;
                        do {
                            if (i3 >= size) {
                                this.af.remove(acjwVar);
                                break;
                            } else {
                                acjwVarA = ((acjx) agkeVarA.get(i3)).a();
                                i3++;
                            }
                        } while (acjwVarA != acjwVar);
                    }
                }
                i2 = 2;
            }
            acjxVar.a();
            aS(wgdVar, i2, false, this.Q);
        }
    }

    public final void Z() {
        adkz adkzVar;
        if (this.E && (adkzVar = this.N) != null) {
            this.j.m(-1, adkzVar, true);
        }
        ak();
    }

    @Override // defpackage.advm
    public final void a() {
        acjx acjxVar = this.aC;
        if (acjxVar != null) {
            iM(acjxVar);
            this.aC = null;
        }
    }

    protected abstract void aa(Bundle bundle);

    public final void ab(int i2) {
        for (advc advcVar : this.n) {
            if (i2 > 0) {
                i2--;
            } else {
                advcVar.i();
            }
        }
    }

    @Override // defpackage.advq
    public final void ac(int i2) {
        List list = this.n;
        if (i2 < list.size()) {
            advc advcVar = (advc) list.get(i2);
            vxz vxzVar = this.aa;
            boolean z = true;
            if (vxzVar != null && vxzVar.l(84, 45815000L, false) && this.k.i(advcVar.a()) == -1) {
                z = false;
            }
            if (this.x.h() && z) {
                this.k.q(advcVar.a());
                ad();
            } else {
                this.j.q(advcVar.a());
            }
            String strAv = av(advcVar);
            if (strAv != null) {
                this.q.x(strAv, advcVar);
                j$.util.Map.EL.remove(this.p, strAv, advcVar);
            }
            list.remove(i2);
            this.o.remove(i2);
        }
    }

    public final void ad() {
        aeck aeckVar;
        aecs aecsVar = this.x;
        if (aecsVar.h() && aecsVar.g() && (aeckVar = this.X) != null) {
            Optional optionalD = aeckVar.d();
            if (true == optionalD.isPresent()) {
                optionalD.get();
            }
            aect aectVar = (aect) optionalD.orElse(null);
            if (aectVar != null) {
                vxz vxzVar = this.aa;
                if (vxzVar != null && vxzVar.l(37, 45750319L, false) && this.aG.get()) {
                    this.aH.set(true);
                    return;
                }
                this.aH.set(false);
                adlq adlqVar = this.k;
                if (adlqVar instanceof admt) {
                    int iB = this.X.b();
                    admt admtVar = (admt) adlqVar;
                    boolean z = admtVar.b;
                    apkx apkxVar = aectVar.a;
                    if (z && admtVar.d == 1 && iB == 1) {
                        admtVar.e = apkxVar;
                        return;
                    }
                    admtVar.d = iB;
                    admtVar.e = apkxVar;
                    admtVar.b();
                }
            }
        }
    }

    @Override // defpackage.advq
    public final void ae(int i2, apox apoxVar) {
        advc advcVarA;
        if (i2 >= 0) {
            List list = this.n;
            if (i2 < list.size()) {
                Optional optionalC = wgd.c(apoxVar);
                if (optionalC.isEmpty() || (advcVarA = this.a.a(optionalC.get(), null, this)) == null) {
                    return;
                }
                advc advcVar = (advc) list.get(i2);
                Object obj = optionalC.get();
                String strAv = av(advcVar);
                if (strAv != null) {
                    this.q.x(strAv, advcVar);
                    j$.util.Map.EL.remove(this.p, strAv, advcVar);
                }
                this.o.set(i2, obj);
                list.set(i2, advcVarA);
                vxz vxzVar = this.aa;
                boolean z = true;
                if (vxzVar != null && vxzVar.l(84, 45815000L, false) && this.k.i(advcVar.a()) == -1) {
                    z = false;
                }
                if (this.x.h() && z) {
                    this.k.F(advcVar.a(), advcVarA.a());
                    ad();
                } else {
                    this.j.F(advcVar.a(), advcVarA.a());
                }
                String strAv2 = av(advcVarA);
                if (strAv2 != null) {
                    this.q.u(strAv2, advcVarA);
                    this.p.put(strAv2, advcVarA);
                }
                q(advcVarA);
            }
        }
    }

    protected abstract void af(int i2);

    protected final void ag(adtv adtvVar) {
        boolean zAN = aduc.aN(adtvVar);
        adtv adtvVar2 = zAN ? this.av : this.au;
        Object objAx = null;
        if (adtvVar2 != null) {
            adtvVar2.an = null;
        }
        if (zAN) {
            this.av = adtvVar;
        } else {
            this.au = adtvVar;
        }
        if (adtvVar != null) {
            adtvVar.an = this.at;
            objAx = adtvVar.ax();
        }
        this.t.g(this.as, objAx);
        adtv adtvVar3 = this.av;
        adtv adtvVar4 = (adtvVar3 == null || !aduc.aM(adtvVar3)) ? this.au : this.av;
        if ((adtvVar4 instanceof adty) && adtvVar4.o(acjw.b)) {
            ((adty) adtvVar4).M();
        }
    }

    public final void ah(boolean z) {
        this.az = z;
        ak();
    }

    protected abstract void ai(int i2, int i3);

    @Override // defpackage.advq
    public final void aj() {
        this.aG.set(true);
    }

    final void ak() {
        boolean zJf = jf();
        adwj adwjVar = this.c;
        if (zJf) {
            adwjVar.b(1);
        } else {
            adwjVar.b(3);
        }
    }

    public final boolean al() {
        vxz vxzVar = this.aa;
        return vxzVar != null && vxzVar.l(57, 45778206L, false);
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [acjx, java.lang.Object] */
    protected final boolean am(adts adtsVar) {
        anin aninVar = this.s.b().g;
        if (aninVar == null) {
            aninVar = anin.a;
        }
        if (aninVar.d && adtsVar.a()) {
            return adtsVar.a() && adtsVar.b.c().g();
        }
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final adlo an(int i2) {
        adlq adlqVar = this.j;
        adlq adlqVar2 = this.k;
        int iL = adlqVar.l(adlqVar2);
        int iK = adlqVar.k(adlqVar2);
        if (i2 < iL) {
            return adlqVar.v(i2);
        }
        return i2 < iK ? adlqVar2.v(i2 - iL) : adlqVar.v((i2 - (iK - iL)) + 1);
    }

    @Deprecated
    protected final void ao() {
        this.R = true;
    }

    @Override // defpackage.adtb
    public final void ap(acjx acjxVar, twi twiVar) {
        l(acjxVar, null, twiVar, null, null, ((ackc) acjxVar).a);
    }

    public final void aq() {
        acjw acjwVar = acjw.b;
        acjx acjxVarHQ = hQ(acjwVar);
        if (this.aA != acjxVarHQ) {
            hR(acjwVar);
            this.aA = acjxVarHQ;
        }
    }

    @Override // defpackage.advq
    public final void ar(int i2) {
        ai(i2, 0);
    }

    public final void as(wgd wgdVar) {
        at(wgdVar);
        R();
        aO(wgdVar);
    }

    public void at(wgd wgdVar) {
        throw null;
    }

    public final boolean au(wgd wgdVar, boolean z) {
        avlh avlhVar;
        avmb avmbVar;
        apoq apoqVar;
        int i2;
        boolean z2 = this.Q;
        Bundle bundle = null;
        if (z2 && !z) {
            ((admo) this.m).D(adle.a, null);
        }
        M(z);
        aS(wgdVar, 1, z, false);
        if (z2 && !z) {
            ((admo) this.m).D(this.j, null);
        }
        if (wgdVar != null && (i2 = (apoqVar = wgdVar.a).d) == 26 && i2 == 26 && ((Integer) apoqVar.e).intValue() > 0) {
            bundle = new Bundle();
            bundle.putInt("scroll_position", apoqVar.d == 26 ? ((Integer) apoqVar.e).intValue() : 0);
        }
        aa(bundle);
        if (this.aw == null) {
            vxz vxzVar = this.aa;
            if (vxzVar == null || !vxzVar.l(27, 45722447L, false) || (avlhVar = this.g) == null || (avmbVar = this.f) == null) {
                this.aw = new avmq(avoi.b);
            } else {
                int i3 = 4;
                this.aw = avlhVar.p().u(new achk(i3)).W(new zze(this, avmbVar, i3)).al(new acae(this, 16), new achk(5));
            }
        }
        return z2;
    }

    @Override // defpackage.adtv
    protected final /* bridge */ /* synthetic */ Object c(apjh apjhVar) {
        wgd wgdVar = null;
        if (apjhVar != null) {
            aihl aihlVar = apoq.b;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            apjhVar.c(aihlVarCheckIsLite);
            if (apjhVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                apjhVar.c(aihlVarCheckIsLite2);
                Object objK = apjhVar.j.k(aihlVarCheckIsLite2.d);
                wgdVar = new wgd((apoq) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
            }
        }
        return wgdVar;
    }

    @Override // defpackage.adww
    public final void hP() {
        if (o(acjw.d)) {
            aE();
            return;
        }
        adww adwwVar = this.b;
        if (adwwVar.jf()) {
            adwwVar.hP();
        } else {
            this.c.b(1);
        }
    }

    @Override // defpackage.adtv, defpackage.advw
    public synchronized adxd hq() {
        ArrayList arrayList;
        adxd adxdVarHq;
        List list;
        boolean z;
        String str;
        adul adulVar;
        apop apopVar;
        mav mavVar;
        adxr adxrVar;
        adtt adttVar;
        acjx acjxVar;
        adxd adxdVarHq2;
        adxz adxzVar;
        List list2 = this.n;
        arrayList = new ArrayList(list2.size());
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((advc) it.next()).hq());
        }
        adxdVarHq = super.hq();
        list = this.o;
        advl advlVar = this.t.b;
        adtt adttVar2 = advlVar != null ? advlVar.a : null;
        acjx acjxVar2 = this.aC;
        z = this.T;
        str = this.S;
        adulVar = this.aI;
        apopVar = this.aE;
        mavVar = this.H;
        adxrVar = this.J;
        vxz vxzVar = this.Z;
        if (vxzVar != null) {
            acjxVar = acjxVar2;
            adttVar = adttVar2;
            if (vxzVar.l(338, 45723774L, false) && (adxzVar = this.F) != null) {
                adxdVarHq2 = adxzVar.hq();
            }
        } else {
            adttVar = adttVar2;
            acjxVar = acjxVar2;
        }
        adxdVarHq2 = null;
        return new adsq(adxdVarHq, list, arrayList, adttVar, acjxVar, z, str, adulVar, apopVar, mavVar, adxrVar, adxdVarHq2, this.A, this.R, this.Q);
    }

    @Override // defpackage.adtv
    protected void ht(toe toeVar, acjx acjxVar) {
        super.ht(toeVar, acjxVar);
        this.aC = acjxVar;
    }

    @Override // defpackage.adtv
    protected final boolean hv() {
        boolean z;
        synchronized (this.v) {
            z = this.V;
        }
        return z;
    }

    @Override // defpackage.adtv, defpackage.twn
    public void i() {
        vxz vxzVar;
        adus adusVar = this.O;
        if (adusVar != null) {
            View view = this.l;
            if (view instanceof RecyclerView) {
                ((RecyclerView) view).aH(adusVar);
                this.O = null;
            }
        }
        adxz adxzVar = this.F;
        if (adxzVar != null) {
            View viewA = adxzVar.b.A();
            if (viewA instanceof RecyclerView) {
                ((RecyclerView) viewA).aE(adxzVar.h);
            }
        }
        super.i();
        this.U = null;
        ab(0);
        this.t.h();
        admb admbVar = this.h;
        if (admbVar != null) {
            this.m.i(admbVar);
            this.h = null;
        }
        awka.f((AtomicReference) this.e);
        tqj tqjVar = this.aF;
        if (tqjVar != null) {
            int i2 = tqr.a;
            if (tqjVar.l(1074279055, 4)) {
                this.m.f();
            }
        }
        avmn avmnVar = this.aw;
        if (avmnVar != null) {
            avmnVar.dispose();
            this.aw = null;
        }
        for (aecm aecmVar : this.w) {
        }
        synchronized (this) {
            this.P = true;
            this.L = null;
            adxr adxrVar = this.J;
            if (adxrVar != null) {
                adxrVar.e(null);
                this.J.d(null);
                this.J.f(null);
            }
            this.J = null;
            if (this.K != null && (vxzVar = this.Z) != null && vxzVar.l(522, 45847492L, false)) {
                mav mavVar = this.H;
                if (mavVar != null) {
                    mavVar.d(this.K);
                }
                this.K = null;
            }
            agbc agbcVar = this.G;
            if (agbcVar != null) {
                mav mavVar2 = this.H;
                if (mavVar2 != null) {
                    mavVar2.d(agbcVar);
                }
                this.G = null;
            }
            this.H = null;
            this.I = null;
            this.ad = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.adtb
    public void j(apho aphoVar, ajwo ajwoVar) {
        acjx acjxVarAe = aawb.ae(aphoVar);
        int i2 = 0;
        twi adslVar = new adsl(i2);
        if (aphoVar != null && aQ(aphoVar)) {
            i2 = 1;
        }
        l(acjxVarAe, aphoVar, adslVar, null, ajwoVar, i2);
    }

    @Override // defpackage.adww
    public final boolean jf() {
        if (this.T) {
            return false;
        }
        return (this.az && o(acjw.d)) || this.b.jf();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        hR(acjw.b);
    }

    public void p(Configuration configuration) {
        throw null;
    }

    protected boolean r() {
        return false;
    }

    @Override // defpackage.adtv
    public final void t(List list) {
        super.t(list);
        ak();
    }

    public final int u() {
        return ((admo) this.m).f.a();
    }

    @Override // defpackage.adwm
    public final boolean v(String str, int i2, Runnable runnable) {
        int iL;
        advc advcVar = (advc) this.p.get(str);
        if (advcVar == null || advcVar.a() == null || advcVar.a().isEmpty() || (iL = this.j.l(advcVar.a())) < 0) {
            return false;
        }
        this.U = runnable;
        ai(iL, i2);
        return true;
    }

    public final int w(int i2) {
        adlq adlqVar = this.j;
        adlq adlqVar2 = this.k;
        int iL = adlqVar.l(adlqVar2);
        return (i2 < iL || i2 >= adlqVar.k(adlqVar2)) ? i2 : i2 - iL;
    }

    public final int y() {
        adlq adlqVar = this.j;
        int i2 = adlqVar.i(this.t.a);
        if (i2 != -1) {
            return i2;
        }
        adkz adkzVar = this.N;
        if (adkzVar != null) {
            return adlqVar.i(adkzVar);
        }
        return -1;
    }

    @Override // defpackage.adtv
    public final void z() {
        super.z();
        this.aA = null;
        this.aB = null;
        adsp adspVar = this.t;
        advl advlVar = adspVar.b;
        if (advlVar != null) {
            adspVar.e(advlVar.a);
        }
        advl advlVar2 = adspVar.d;
        if (advlVar2 != null) {
            adspVar.f((adtt) Optional.ofNullable(advlVar2.a).orElse(adts.a));
        }
        advo advoVar = adspVar.a;
        if (advoVar != null) {
            advoVar.clear();
        }
        adspVar.b = null;
        advo advoVar2 = adspVar.c;
        if (advoVar2 != null) {
            advoVar2.clear();
        }
        adspVar.d = null;
    }

    @Deprecated
    protected void h(apoq apoqVar) {
    }
}

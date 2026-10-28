package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.proto.streaming.MediaCapabilitiesOuterClass$MediaCapabilities;
import com.google.common.util.concurrent.ListenableFuture;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.StringJoiner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acfg implements acey, abyp, acib, acic, acgr, acfv, acij {
    public final avbs A;
    public final afip B;
    private final zjk D;
    private final abog E;
    private final wis F;
    private final acfi G;
    private final boolean H;
    private final acio I;
    private final aunn J;
    private final acfq K;
    private final Optional L;
    private final zfs M;
    private final aunn N;
    private boolean O;
    private boolean P;
    private long Q;
    private final axsp R;
    private final Executor S;
    private final acev T;
    private final aboi U;
    private final vxu V;
    private final yoq W;
    private final vxz X;
    private final aciz Y;
    private final abxv Z;
    private final ijt aa;
    private final ijt ab;
    public final mbc b;
    public final ytv c;
    public final abnc d;
    public final txp e;
    public final vyo f;
    public final acjb g;
    public final acfr h;
    public final boolean i;
    public final acfn j;
    public final abmt k;
    public final Optional l;
    public final ablr m;
    public final abwj n;
    public acfs o;
    public acir p;
    public acfs q;
    public acfs r;
    public abob s = abob.a;
    public long t = -1;
    public final Map u;
    public boolean v;
    public final aunn w;
    public int x;
    public final abvy y;
    public final vxz z;
    public static final acfd a = new acfd();
    private static final agrf C = agrf.h("com/google/android/libraries/youtube/player/video/LocalDirector");

    static {
        twu.b("VirtualEventForwarder");
    }

    public acfg(mbc mbcVar, ytv ytvVar, zjk zjkVar, abxv abxvVar, abog abogVar, afip afipVar, abnc abncVar, aboi aboiVar, wis wisVar, txp txpVar, ijt ijtVar, acfi acfiVar, vyo vyoVar, vxu vxuVar, acio acioVar, acfn acfnVar, aunn aunnVar, acfq acfqVar, Optional optional, abmt abmtVar, zfs zfsVar, Optional optional2, ablr ablrVar, vxz vxzVar, vxz vxzVar2, abwj abwjVar, avbs avbsVar, aunn aunnVar2, awmd awmdVar, ijt ijtVar2, yoq yoqVar, axsp axspVar, aunn aunnVar3, Executor executor, awmd awmdVar2, abnz abnzVar, abvy abvyVar) {
        this.b = mbcVar;
        this.c = ytvVar;
        this.D = zjkVar;
        this.Z = abxvVar;
        this.E = abogVar;
        this.l = optional2;
        this.B = afipVar;
        this.d = abncVar;
        this.U = aboiVar;
        this.F = wisVar;
        this.e = txpVar;
        this.aa = ijtVar;
        this.G = acfiVar;
        this.f = vyoVar;
        this.V = vxuVar;
        this.j = acfnVar;
        this.J = aunnVar;
        this.K = acfqVar;
        this.L = optional;
        this.k = abmtVar;
        this.M = zfsVar;
        this.A = avbsVar;
        this.W = yoqVar;
        this.y = abvyVar;
        this.i = abmtVar.aU();
        int i = 19;
        this.h = new acfr(mbcVar, vyoVar, new Handler(Looper.getMainLooper()), new oqe(this, i), abvyVar, new acfa(this, 2), abmtVar);
        this.g = new acjb(this, new aaer(this, i), new aaer(this, 20), new acfb(this, 1 == true ? 1 : 0), new abzk(this, 3), new gpd(this, 15), acfqVar, abmtVar, abnzVar);
        this.H = abmt.k(vyoVar, aawc.a) > 15000;
        this.I = acioVar;
        this.u = new HashMap();
        this.m = ablrVar;
        this.X = vxzVar;
        this.z = vxzVar2;
        this.n = abwjVar;
        this.Y = (aciz) awmdVar.io();
        this.ab = ijtVar2;
        this.N = aunnVar2;
        this.R = axspVar;
        this.w = aunnVar3;
        this.S = executor;
        this.T = new acev(awmdVar2);
    }

    public static boolean aK(wja wjaVar) {
        if (wjaVar != null) {
            List list = wjaVar.r;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!wir.b().contains(Integer.valueOf(((wgs) it.next()).e()))) {
                }
            }
            if (!list.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    static boolean aL(wja wjaVar) {
        return wjaVar != null && wjaVar.v.isEmpty();
    }

    public static final void aY(abnv abnvVar, acip acipVar) {
        afvx afvxVarAe = tym.ae(tsa.LD_BROADCAST_RX_VIDEO_STAGE, aawm.a(qci.b(null, abnvVar), acipVar.au()));
        try {
            abnvVar.toString();
            afip.I(new aayt(abnvVar, acipVar.k(), acipVar.au()), acipVar);
            afvxVarAe.close();
        } catch (Throwable th) {
            try {
                afvxVarAe.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final void bA(List list, boolean z, boolean z2, acjc acjcVar, acji acjiVar) throws Throwable {
        bB(list, z, z2, acjcVar, Optional.empty(), Optional.empty(), acjiVar);
    }

    private final void bB(List list, boolean z, boolean z2, acjc acjcVar, Optional optional, Optional optional2, acji acjiVar) throws Throwable {
        agke agkeVarN = agke.n(list);
        if (!this.n.c && !this.P) {
            this.c.j();
        }
        if (list.isEmpty()) {
            return;
        }
        bF((Set) Collection.EL.stream(list).map(new accu(2)).collect(aghu.b), acjiVar);
        br(list, z, z2);
        bt(agkeVarN, acjcVar, optional, optional2);
    }

    private final void bC(List list, boolean z, boolean z2, acjc acjcVar, Optional optional, Optional optional2, acji acjiVar) throws Throwable {
        agke agkeVarN = agke.n(list);
        if (!this.n.c && !this.P) {
            this.c.j();
        }
        if (list.isEmpty()) {
            bt(agkeVarN, acjcVar, optional, optional2);
            return;
        }
        bF((Set) Collection.EL.stream(list).map(new accu(2)).collect(aghu.b), acjiVar);
        br(list, z, z2);
        bt(agkeVarN, acjcVar, optional, optional2);
    }

    private final void bD() {
        boolean zBJ;
        if (abmt.ce(this.f)) {
            zBJ = bJ(this.r.a);
        } else {
            zBJ = this.x != 1;
        }
        if (aN() || this.s.a(abob.d) || !zBJ || aawr.p(this.r.a)) {
            return;
        }
        this.r.a.w().f = aawr.h(this.c, this.r.E());
    }

    private final void bE(acip acipVar, int i) {
        aawr.l(acipVar, i);
        aP(acipVar, 4, 0);
    }

    private final void bF(Set set, acji acjiVar) {
        abmt abmtVar = this.k;
        if (abmtVar.aF()) {
            boolean zL = abmtVar.g.l(266, 45723392L, false);
            aciz acizVar = this.Y;
            if (zL) {
                for (aciw aciwVar : acjiVar.c) {
                    Object obj = acizVar.a;
                    abxz abxzVar = aciwVar.l;
                    abxzVar.getClass();
                    aciwVar.i.getClass();
                    abyd abydVarL = ((ijt) obj).l(abxzVar);
                    Object obj2 = acizVar.b;
                    String str = aciwVar.h;
                    str.getClass();
                    ((ijt) obj2).o(str, abydVarL);
                }
                return;
            }
            acjb acjbVar = this.g;
            set.getClass();
            acjbVar.getClass();
            ijt ijtVar = (ijt) acizVar.b;
            Set setAu = atqq.au(set, ijtVar.n());
            ArrayList<aciw> arrayList = new ArrayList();
            Iterator it = setAu.iterator();
            while (it.hasNext()) {
                acjd acjdVarC = acjbVar.c((String) it.next());
                aciw aciwVar2 = acjdVarC instanceof aciw ? (aciw) acjdVarC : null;
                if (aciwVar2 != null) {
                    arrayList.add(aciwVar2);
                }
            }
            for (aciw aciwVar3 : arrayList) {
                Object obj3 = acizVar.a;
                abxz abxzVar2 = aciwVar3.l;
                abxzVar2.getClass();
                aciwVar3.i.getClass();
                abyd abydVarL2 = ((ijt) obj3).l(abxzVar2);
                String str2 = aciwVar3.h;
                str2.getClass();
                ijtVar.o(str2, abydVarL2);
            }
        }
    }

    private static boolean bG(acfs acfsVar) {
        abnl abnlVarN = acfsVar.a.n();
        return abnlVarN != null && abnlVarN.J();
    }

    private final boolean bH() {
        return this.x == 1;
    }

    private final boolean bI() {
        return aM() && this.s != abob.j;
    }

    private final boolean bJ(acip acipVar) {
        return TextUtils.equals(this.c.i(), acipVar.au());
    }

    private final boolean bK() {
        wjf wjfVarF = this.o.a.f();
        if (wjfVarF == null || wjfVarF.f() == null || !wjfVarF.f().aT() || !wjfVarF.V() || !abmt.bp(this.f) || this.s.h()) {
            return true;
        }
        return ((aawr.g(x()) == 0 && aawr.e(x()) == 0) || aawr.d(x()) == -1) ? false : true;
    }

    private final boolean bL(acip acipVar) {
        wjf wjfVarF = acipVar.f();
        if (wjfVarF == null || wjfVarF.f() == null || !wjfVarF.f().aT() || !wjfVarF.V() || !abmt.bp(this.f) || acipVar.a() == 1) {
            return true;
        }
        return ((aawr.g(acipVar) == 0 && aawr.e(acipVar) == 0) || aawr.d(acipVar) == -1) ? false : true;
    }

    private final boolean bM() {
        if (ai()) {
            return true;
        }
        return !aN() && this.s.a(abob.a, abob.c, abob.e, abob.b, abob.g);
    }

    private final int bN(wjf wjfVar) {
        if (wjfVar == null || wjfVar.g() != null) {
            return aawr.q(this.d, wjfVar) ? 3 : 1;
        }
        zvp.a(zvn.a, zvm.k, "playVideo called on player response with no videoStreamingData.");
        return 2;
    }

    private final void bO(acip acipVar, long j, long j2, long j3, long j4, boolean z, int i, int i2) {
        abmt abmtVar = this.k;
        abob abobVar = abmtVar.ad() ? acipVar.w().m : this.s;
        if (!abobVar.a(abob.e, abob.f, abob.h, abob.i, abob.j)) {
            ((agrc) ((agrc) C.b()).k("com/google/android/libraries/youtube/player/video/LocalDirector", "broadcastCurrentProgress", 1712, "LocalDirector.java")).w("Media progress reported outside media playback: %s", abobVar.name());
            return;
        }
        if (abmtVar.ad() ? bL(acipVar) : bK()) {
            aazk aazkVar = new aazk(j2, j, acipVar.w().h, acipVar.w().i, j3, j4, this.b.b(), z, acipVar.au());
            if (abmtVar.ad()) {
                acipVar.p().n(aazkVar);
            } else {
                this.r.a.p().n(aazkVar);
            }
            bQ(i2, acipVar, aazkVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Set] */
    private final void bP(aboe aboeVar, int i, int i2) {
        if (aboeVar != null) {
            if (aboeVar != m().w().o) {
                abmt abmtVar = this.k;
                if (!abmtVar.aK() || aboeVar.b == null) {
                    if (abmtVar.bO() && aboeVar.j == 3) {
                        aboeVar.b = this.r.E();
                    } else {
                        this.E.a(aboeVar, this.r.E());
                    }
                }
            }
            afip afipVar = this.B;
            if (i2 == 0) {
                afipVar.D(aboeVar, this.r.a, i);
            } else {
                Iterator it = afipVar.d.iterator();
                while (it.hasNext()) {
                    ((acii) it.next()).u(aboeVar);
                }
                ((tbt) afipVar.e).c(aboeVar);
            }
        }
        if (aboeVar == null || aawb.B(aboeVar.j)) {
            m().w().o = aboeVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:50:0x0103  */
    private final void bQ(int i, acip acipVar, aazk aazkVar, int i2) {
        acfs acfsVar;
        boolean zG;
        afip afipVar;
        acfs acfsVar2;
        abob abobVar = this.s;
        acip acipVarY = y();
        acip acipVarM = m();
        wjf wjfVarF = acipVarM.f();
        boolean zN = (wjfVarF == null || !wjfVarF.f().ac() || !abobVar.h() || acipVarY == null) ? aawr.n(acipVarM) : aawr.n(acipVarY);
        abmt abmtVar = this.k;
        boolean z = true;
        if (!abmtVar.ad() ? aO(abob.f, abob.e) : acipVar.a() == 1 && aO(abob.f, abob.e)) {
            if (this.i) {
                zG = this.y.g(acipVar.au());
            } else {
                acfsVar = this.r;
                if (acfsVar == null && Objects.equals(acfsVar.E(), acipVar.au())) {
                    zG = true;
                } else {
                    zG = false;
                }
            }
            if (abmtVar.ad() ? acipVarM.a() == 0 : zG) {
                this.Q = aazkVar.a;
            }
            afipVar = this.B;
            if (i == 0) {
                afipVar.C(acipVar, aazkVar, i2);
                z = false;
            } else {
                afipVar.y(aazkVar);
            }
        } else if (zN) {
            boolean z2 = aazkVar.h;
            aazk aazkVar2 = new aazk(aazkVar, z2, acipVar.au());
            aazk aazkVar3 = new aazk(this.g.l(aazkVar, acipVar.au()), z2, this.o.a.au());
            this.Q = aazkVar3.a;
            if (abmtVar.g.m(310, 45740041L) && (acfsVar2 = this.r) != null) {
                acfsVar2.H("mtgm", "lte." + aazkVar2.a + ";lkg." + this.Q, false);
            }
            afip afipVar2 = this.B;
            if (i == 0) {
                afipVar2.C(acipVar, aazkVar2, i2);
                aazkVar = aazkVar3;
                z = false;
            } else {
                afipVar2.y(aazkVar2);
                aazkVar = aazkVar3;
            }
        } else {
            if (this.i) {
                zG = this.y.g(acipVar.au());
            } else {
                acfsVar = this.r;
                if (acfsVar == null) {
                    zG = false;
                } else {
                    zG = false;
                }
            }
            if (abmtVar.ad()) {
                this.Q = aazkVar.a;
            } else {
                this.Q = aazkVar.a;
            }
            afipVar = this.B;
            if (i == 0) {
                afipVar.C(acipVar, aazkVar, i2);
                z = false;
            } else {
                afipVar.y(aazkVar);
            }
        }
        afip afipVar3 = this.B;
        if (z) {
            afipVar3.A(aazkVar);
        } else {
            afipVar3.E(acipVar, aazkVar, i2);
        }
    }

    private final ywy bR(String str) {
        abyd abydVarM = this.ab.m(str);
        if (abydVarM == null) {
            abydVarM = abyd.a;
        }
        return new acim(abydVarM, this.k);
    }

    private static final long bS(wjf wjfVar) {
        if (wjfVar.V() || wjfVar.Y() || wjfVar.Q()) {
            return Long.MAX_VALUE;
        }
        return wjfVar.d();
    }

    private static final boolean bT(abnp abnpVar) {
        if (abnpVar == null) {
            return false;
        }
        return abnpVar.f;
    }

    private static final boolean bU(acfs acfsVar) {
        return acfsVar.a.w().n;
    }

    private static final void bV(acip acipVar, wjf wjfVar) {
        acipVar.w().j(wjfVar);
    }

    private static final boolean bW(acip acipVar) {
        Optional optionalOfNullable = Optional.ofNullable(acipVar.n());
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(Boolean.valueOf(((abnl) optionalOfNullable.get()).N()));
        }
        return ((Boolean) optionalOfNullable.orElse(Boolean.FALSE)).booleanValue();
    }

    private final void bX(acip acipVar, boolean z, acjc acjcVar, acji acjiVar) throws Throwable {
        aW(acipVar, acipVar.w().f, z, acjcVar, acjiVar);
    }

    private final void bY(acip acipVar, long j, appa appaVar, acji acjiVar) throws Throwable {
        long j2;
        List listV;
        abmt abmtVar = this.k;
        if (!abmtVar.au()) {
            boolean zI = abmtVar.I();
            acjb acjbVar = this.g;
            bB(zI ? acjb.F(acjbVar, acipVar.au(), j, Long.MAX_VALUE, true, abmtVar, this.w) : acjb.F(acjbVar, acipVar.au(), j, Long.MAX_VALUE, false, abmtVar, this.w), true, true, acjc.SEEK, Optional.of(appaVar), Optional.of(Duration.ofMillis(j)), acjiVar);
            return;
        }
        boolean zI2 = abmtVar.I();
        acjb acjbVar2 = this.g;
        if (zI2) {
            j2 = j;
            listV = acjb.V(acjbVar2, acipVar.au(), j2, true, abmtVar, this.w);
        } else {
            j2 = j;
            listV = acjb.V(acjbVar2, acipVar.au(), j2, false, abmtVar, this.w);
        }
        G(j2);
        bC(listV, true, true, acjc.SEEK, Optional.of(appaVar), Optional.of(Duration.ofMillis(j2)), acjiVar);
    }

    private final void bZ(boolean z, int i) {
        bD();
        if (this.j.d(this)) {
            this.h.i = true;
            if (z) {
                this.c.G(i);
            } else {
                aX(i);
            }
        }
        if (this.s == abob.h) {
            aE(abob.g);
        }
    }

    private static float ba(acfs acfsVar) {
        return acfsVar.a.w().e;
    }

    private final int bb(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        abnc abncVar = this.d;
        int i = abncVar.p == jrj.AUDIO_ROUTE_ALARM ? 1 : 0;
        if (z) {
            i |= 2;
        }
        if (z2) {
            i |= 4;
        }
        if (abncVar.s()) {
            i |= 8;
        }
        if (z3) {
            i |= 64;
        }
        if (z4) {
            i |= SemanticState.Hidden;
        }
        if (z5) {
            i |= SemanticState.LiveRegion;
        }
        return z6 ? i | SemanticState.ReadOnly : i;
    }

    private final long bc(long j, acfs acfsVar) {
        acip acipVar = acfsVar.a;
        return bd(j, acipVar.c(), acipVar.b());
    }

    private final long bd(long j, long j2, long j3) {
        abmt abmtVar = this.k;
        if ((abmtVar.F() ? aawr.c(j, abmtVar) : j) == abmtVar.j() && j2 == -1) {
            return abmtVar.j();
        }
        if (j3 == -1) {
            j3 = Long.MAX_VALUE;
        }
        if (j2 == -1) {
            j2 = Long.MIN_VALUE;
        }
        return Math.min(Math.max(j, j2), j3);
    }

    private final long be() {
        if (!this.s.f() || aN() || aawr.p(this.r.a)) {
            return ar(abob.j) ? m().w().i : aawr.g(m());
        }
        return aawr.h(this.c, p());
    }

    private final long bf() {
        acfs acfsVar = this.r;
        String strE = acfsVar.E();
        acjb acjbVar = this.g;
        return acjbVar.c(strE) != null ? acjbVar.a(strE, aawr.g(acfsVar.a)) : this.Q;
    }

    private final wjf bg() {
        return bl().f();
    }

    private final zjd bh(xir xirVar) {
        zjk zjkVar = this.D;
        zjd zjdVar = zjkVar;
        if (xirVar != null && !(xirVar instanceof xjb)) {
            zjj zjjVarG = this.Z.g(xirVar);
            if (this.k.e.d(29, 45618268L) == 2) {
                zjdVar = zjkVar;
                zjjVarG.aT();
            }
            zjdVar = zjkVar;
            yno.aZ(zjjVarG);
            zjdVar = zjjVarG;
        }
        zjdVar = zjkVar;
        return zjdVar;
    }

    private final zjd bi(acfs acfsVar) {
        return bh((xir) acfsVar.a.d().a());
    }

    private final acfs bj(abob abobVar) {
        acfs acfsVar = this.q;
        return (!abobVar.h() || acfsVar == null) ? this.o : acfsVar;
    }

    private final acfw bk(abob abobVar) {
        return bj(abobVar).b;
    }

    private final acip bl() {
        aciw aciwVarU;
        acfs acfsVar;
        acjb acjbVar = this.g;
        acfs acfsVar2 = (acjbVar.g() && (aciwVarU = acjbVar.u()) != null && (acfsVar = (acfs) this.u.get(aciwVarU.h)) != null && (acfsVar.a.a() == 3 || this.k.d.m(3, 45354492L))) ? acfsVar : this.o;
        return acfsVar2.a;
    }

    private final acji bm(acip acipVar) {
        agkh agkhVar = new agkh(4);
        acjd acjdVarC = this.g.c(acipVar.au());
        aciw aciwVar = acjdVarC instanceof aciw ? (aciw) acjdVarC : null;
        if (aciwVar != null) {
            agkhVar.e(aciwVar.h, aciwVar);
        }
        return new acji(agpn.b, agkhVar.d(false));
    }

    private final Optional bn(long j, appa appaVar, boolean z, boolean z2, long j2, aciw aciwVar, wjf wjfVar, wiu wiuVar) throws Throwable {
        Long lValueOf;
        if (!z2) {
            twu.c(6, "Attempting to seek when video is not playing", null);
            bo();
            return Optional.of(Boolean.FALSE);
        }
        abmt abmtVar = this.k;
        if (abmtVar.ar()) {
            long j3 = this.t;
            if (j3 != -1 && j <= j3) {
                this.t = -1L;
                bY(m(), j, appaVar, bm(this.r.a));
                return Optional.of(Boolean.TRUE);
            }
        }
        if (abmt.bJ(this.f) && aciwVar != null) {
            Iterator it = aciwVar.a.keySet().iterator();
            do {
                if (!it.hasNext()) {
                    lValueOf = Long.valueOf(aciwVar.b);
                    break;
                }
                lValueOf = (Long) it.next();
            } while (lValueOf.longValue() < j2);
            if (j > lValueOf.longValue()) {
                bE(x(), 9);
                this.h.i = true;
                acjb acjbVar = this.g;
                acjd acjdVar = (acjd) acjbVar.d.get(aciwVar.h);
                if (acjdVar != null) {
                    ArrayList arrayList = new ArrayList();
                    if (acjdVar instanceof aciw) {
                        Iterator it2 = ((aciw) acjdVar).a.values().iterator();
                        while (it2.hasNext()) {
                            Iterator it3 = ((acjb) it2.next()).c.iterator();
                            while (it3.hasNext()) {
                                arrayList.add(((acjd) it3.next()).b());
                            }
                        }
                    }
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        acjbVar.d((String) arrayList.get(i));
                    }
                }
                m();
                ywy ywyVarBR = bR(this.o.a.au());
                wja wjaVarG = wjfVar.g();
                yvw yvwVar = new yvw(bc(j, this.o), 0L, 0L);
                long jC = m().c();
                long jB = m().b();
                String strP = p();
                acfs acfsVar = this.o;
                abnc abncVar = this.d;
                yxb yxbVar = yxb.a;
                float fB = acfz.b(wiuVar, abncVar, null);
                float fBa = ba(this.o);
                int iBb = bb(true, bT(this.o.d()), this.o.a.a() == 1, wjfVar.Q(), bG(this.o), aL(wjfVar.g()));
                zjd zjdVarBi = bi(this.o);
                acfs acfsVar2 = this.o;
                zfp zfpVarJ = acfsVar2.a.j();
                byte[] bArrO = acfsVar2.O();
                Integer numD = this.o.D();
                arfb arfbVarC = this.o.C();
                acfs acfsVar3 = this.o;
                ywyVarBR.x(wjaVarG, yvwVar, jC, jB, strP, wiuVar, acfsVar, yxbVar, fB, fBa, iBb, zjdVarBi, zfpVarJ, bArrO, numD, arfbVarC, acfsVar3.a, bU(acfsVar3), (yxe) this.N.io(), null);
                aT(ywyVarBR);
                bt(agpi.a, acjc.SEEK, Optional.of(appaVar), Optional.of(Duration.ofMillis(j)));
                return Optional.of(Boolean.valueOf(z));
            }
        }
        aawr.l(this.r.a, 9);
        bp(j);
        this.c.r(j, appaVar);
        acip acipVar = this.r.a;
        if (!aawr.o(acipVar) ? !(acipVar.v().a || ((acipVar.x().i() && !acipVar.x().h(acipVar.au())) || j < aawr.e(acipVar))) : j > aawr.e(acipVar)) {
            ax(9);
            aw(this.r.E());
            if (abmtVar.e.l(28, 45368273L, false)) {
                bE(this.r.a, 7);
            }
        }
        bt(agpi.a, acjc.SEEK, Optional.of(appaVar), Optional.of(Duration.ofMillis(j)));
        return Optional.empty();
    }

    private final void bo() {
        this.r.a.aK().kk(new aaxi());
    }

    private final void bp(long j) {
        aaxw aaxwVar = new aaxw(j);
        aaxwVar.a = this.b.f().toEpochMilli();
        this.r.a.aL().kk(aaxwVar);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:101:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:103:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:104:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:105:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:44:0x0103  */
    /* JADX WARN: Code duplicated, block: B:46:0x0113  */
    /* JADX WARN: Code duplicated, block: B:47:0x0117  */
    /* JADX WARN: Code duplicated, block: B:49:0x0123  */
    /* JADX WARN: Code duplicated, block: B:51:0x0129  */
    /* JADX WARN: Code duplicated, block: B:53:0x012f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0151  */
    /* JADX WARN: Code duplicated, block: B:55:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:71:0x0206  */
    /* JADX WARN: Code duplicated, block: B:74:0x0217  */
    /* JADX WARN: Code duplicated, block: B:90:0x0290  */
    /* JADX WARN: Code duplicated, block: B:95:0x029d  */
    /* JADX WARN: Code duplicated, block: B:98:0x02ae  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    private final void bq(acfs acfsVar, abnl abnlVar) {
        int i;
        int i2;
        wiu wiuVarF;
        int i3;
        abmt abmtVar;
        Long lA;
        wjf wjfVarF;
        int i4;
        wjf wjfVarF2;
        Optional optionalC;
        Optional optional;
        ieq ieqVar;
        acfc acfcVar;
        acgv acgvVar;
        String strG;
        abnl abnlVar2 = abnlVar;
        acip acipVar = acfsVar.a;
        wjf wjfVarF3 = acipVar.f();
        if (wjfVarF3 != null) {
            aboe aboeVar = aaje.i(wjfVarF3, this.b) ? new aboe(3, false, 1, this.E.b.getString(R.string.common_error_generic), abog.a, null, null, null) : null;
            if (aboeVar != null) {
                if (abnlVar2 != null) {
                    if (abnlVar2.d <= 0) {
                        abnlVar2.d = 1;
                        aJ();
                        return;
                    }
                    zvp.a(zvn.a, zvm.k, "Max reloads [%s] reached on expired stream load.");
                }
                aQ(aboeVar, 4);
                return;
            }
            if (abnlVar2 != null) {
                if (abnlVar2.E() || abnlVar2.G()) {
                    acjb acjbVar = this.g;
                    String strE = acfsVar.E();
                    long jC = abnlVar2.c();
                    Long lValueOf = null;
                    long jBS = bS(wjfVarF3);
                    Long lValueOf2 = abnlVar2.G() ? Long.valueOf(abnlVar2.d()) : null;
                    if (abnlVar2.E()) {
                        lValueOf = Long.valueOf(abnlVar2.b());
                    }
                    boolean z = true;
                    acjbVar.Z(acjbVar.q(wjfVarF3, strE, jC, jBS, lValueOf2, lValueOf, acipVar.a(), acipVar.o()));
                    i = z;
                    if (aawr.m(m())) {
                        aawr.k(m(), abnlVar2.d());
                        i = z;
                    }
                }
                i2 = 0;
                if (abnlVar2 != null) {
                    abnlVar2.d = 0;
                }
                afip.G(wjfVarF3, acipVar);
                wiuVarF = wjfVarF3.f();
                i3 = 10;
                if (!aawr.m(m()) && this.k.j.l(186, 45721426L, false)) {
                    optional = this.L;
                    if (optional.isPresent()) {
                        ieqVar = (ieq) optional.get();
                        acfcVar = new acfc(this, i2);
                        acgvVar = ieqVar.h;
                        if (acgvVar == null) {
                            agrx agrxVar = agso.a;
                        } else {
                            if (awrc.c(acgvVar.a, wjfVarF3.G())) {
                                strG = wjfVarF3.G();
                                if (strG != null) {
                                    if (strG.length() == 0) {
                                        ((agrc) ieq.a.c().i(agso.a, "RestoredQueueStartPlaybackLogger").k("com/google/android/apps/youtube/music/player/queue/persistence/logging/RestoredQueueStartPlaybackLogger", "reportRestoredPlaybackStartPositionToQoe", 115, "RestoredQueueStartPlaybackLogger.kt")).t("reportRestoredPlaybackStartPositionToQoe: videoId is empty");
                                    } else {
                                        Instant instantA = ieqVar.e.a();
                                        instantA.getClass();
                                        agrx agrxVar2 = agso.a;
                                        ieqVar.c.e(ieqVar.d.e()).g(wfs.g(areu.b.a(), strG)).g(aret.class).n(new hhw(new apm(instantA, ieqVar, 17), i3)).s(ieqVar.g).D(new ibr(new ukj(wjfVarF3, acgvVar, ieqVar, acfcVar, 1), 18), new ibr(iel.a, 19), new mgt(wjfVarF3, acgvVar, ieqVar, acfcVar, 1));
                                    }
                                }
                            } else {
                                agrx agrxVar3 = agso.a;
                                wjfVarF3.G();
                            }
                        }
                    }
                }
                abmtVar = this.k;
                if (!abmtVar.aB() || (wiuVarF.v() > 0 && aawr.m(m()) && abmtVar.ab())) {
                    lA = this.K.a(abnlVar2, wjfVarF3, new acfc(acfsVar, 2));
                    if (lA != null) {
                        aawr.k(m(), lA.longValue());
                    }
                } else if (wiuVarF.v() > 0 && aawr.m(m())) {
                    aawr.k(m(), wiuVarF.v());
                }
                if (wiuVarF.al()) {
                    aa(i);
                }
                wis wisVar = this.F;
                wiuVarF.getClass();
                wisVar.b = wiuVarF;
                wvl wvlVarB = ((hed) wisVar.a.io()).B();
                wvlVarB.a = new vdm(wiuVarF, i3);
                taf.j(wvlVarB.a(), new tsq(i3));
                D(i, 0, acipVar);
                aE(abob.c);
                wjfVarF = this.o.a.f();
                if (wjfVarF != null || wjfVarF.d() == 0 || wjfVarF.Q() || ((wjfVarF.g() != null && (wjfVarF.g().B() || wjfVarF.g().F())) || aawr.g(this.o.a) < wjfVarF.d() - 1000)) {
                    i4 = 0;
                } else {
                    i4 = i;
                }
                if (this.v && i4 == 0) {
                    aE(abob.g);
                } else {
                    aE(abob.j);
                    this.h.i = i;
                }
                if (abmt.cq(this.f)) {
                    aF();
                    return;
                }
                wjfVarF2 = this.o.a.f();
                if (wjfVarF2 == null) {
                    aF();
                    return;
                }
                acev acevVar = this.T;
                acfs acfsVar2 = this.o;
                optionalC = acevVar.c(wjfVarF2, acfsVar2.b, acfsVar2.E());
                if (optionalC.isPresent()) {
                    aF();
                    return;
                }
                ListenableFuture[] listenableFutureArr = new ListenableFuture[i];
                listenableFutureArr[0] = optionalC.get();
                afxd.f(((ahud) ahno.aF(listenableFutureArr).a).m(new abyz(this, 4), this.S));
            }
            abnlVar2 = null;
            i = 1;
            acjb acjbVar2 = this.g;
            acjbVar2.Z(acjbVar2.n(wjfVarF3, acfsVar.E(), acipVar.a(), acipVar.o()));
            i2 = 0;
            if (abnlVar2 != null) {
                abnlVar2.d = 0;
            }
            afip.G(wjfVarF3, acipVar);
            wiuVarF = wjfVarF3.f();
            i3 = 10;
            if (!aawr.m(m())) {
                optional = this.L;
                if (optional.isPresent()) {
                    ieqVar = (ieq) optional.get();
                    acfcVar = new acfc(this, i2);
                    acgvVar = ieqVar.h;
                    if (acgvVar == null) {
                        agrx agrxVar4 = agso.a;
                    } else {
                        if (awrc.c(acgvVar.a, wjfVarF3.G())) {
                            strG = wjfVarF3.G();
                            if (strG != null) {
                                if (strG.length() == 0) {
                                    ((agrc) ieq.a.c().i(agso.a, "RestoredQueueStartPlaybackLogger").k("com/google/android/apps/youtube/music/player/queue/persistence/logging/RestoredQueueStartPlaybackLogger", "reportRestoredPlaybackStartPositionToQoe", 115, "RestoredQueueStartPlaybackLogger.kt")).t("reportRestoredPlaybackStartPositionToQoe: videoId is empty");
                                } else {
                                    Instant instantA2 = ieqVar.e.a();
                                    instantA2.getClass();
                                    agrx agrxVar5 = agso.a;
                                    ieqVar.c.e(ieqVar.d.e()).g(wfs.g(areu.b.a(), strG)).g(aret.class).n(new hhw(new apm(instantA2, ieqVar, 17), i3)).s(ieqVar.g).D(new ibr(new ukj(wjfVarF3, acgvVar, ieqVar, acfcVar, 1), 18), new ibr(iel.a, 19), new mgt(wjfVarF3, acgvVar, ieqVar, acfcVar, 1));
                                }
                            }
                        } else {
                            agrx agrxVar6 = agso.a;
                            wjfVarF3.G();
                        }
                    }
                }
            }
            abmtVar = this.k;
            if (abmtVar.aB()) {
                lA = this.K.a(abnlVar2, wjfVarF3, new acfc(acfsVar, 2));
                if (lA != null) {
                    aawr.k(m(), lA.longValue());
                }
            } else {
                lA = this.K.a(abnlVar2, wjfVarF3, new acfc(acfsVar, 2));
                if (lA != null) {
                    aawr.k(m(), lA.longValue());
                }
            }
            if (wiuVarF.al()) {
                aa(i);
            }
            wis wisVar2 = this.F;
            wiuVarF.getClass();
            wisVar2.b = wiuVarF;
            wvl wvlVarB2 = ((hed) wisVar2.a.io()).B();
            wvlVarB2.a = new vdm(wiuVarF, i3);
            taf.j(wvlVarB2.a(), new tsq(i3));
            D(i, 0, acipVar);
            aE(abob.c);
            wjfVarF = this.o.a.f();
            if (wjfVarF != null) {
                i4 = 0;
            } else {
                i4 = 0;
            }
            if (this.v) {
                aE(abob.j);
                this.h.i = i;
            } else {
                aE(abob.j);
                this.h.i = i;
            }
            if (abmt.cq(this.f)) {
                aF();
                return;
            }
            wjfVarF2 = this.o.a.f();
            if (wjfVarF2 == null) {
                aF();
                return;
            }
            acev acevVar2 = this.T;
            acfs acfsVar3 = this.o;
            optionalC = acevVar2.c(wjfVarF2, acfsVar3.b, acfsVar3.E());
            if (optionalC.isPresent()) {
                aF();
                return;
            }
            ListenableFuture[] listenableFutureArr2 = new ListenableFuture[i];
            listenableFutureArr2[0] = optionalC.get();
            afxd.f(((ahud) ahno.aF(listenableFutureArr2).a).m(new abyz(this, 4), this.S));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void br(List list, boolean z, boolean z2) throws Throwable {
        String strD;
        abnc abncVar;
        acfr acfrVar;
        long jC;
        String strH;
        aciu aciuVar = (aciu) list.remove(0);
        boolean zAM = aM();
        acfs acfsVar = null;
        Object[] objArr = 0;
        if (!z && this.r.a.au().equals(aciuVar.d()) && zAM) {
            strD = null;
        } else {
            strD = aciuVar.d();
            acfs acfsVar2 = (acfs) this.u.get(aciuVar.d());
            if (acfsVar2 == null && aciuVar.d().equals(this.o.E())) {
                acfsVar2 = this.o;
            }
            acfs acfsVar3 = acfsVar2;
            wjf wjfVarB = aciuVar.b();
            if (acfsVar3 != null && wjfVarB != null) {
                abmt abmtVar = this.k;
                if (abmtVar.bG()) {
                    acip acipVar = acfsVar3.a;
                    if (acipVar.a() == 1 && (strH = this.o.a.w().h()) != null) {
                        acipVar.w().i(strH);
                    }
                    bu(acfsVar3, wjfVarB);
                }
                wiu wiuVarF = wjfVarB.f();
                abnc abncVar2 = this.d;
                abncVar2.r(aK(wjfVarB.g()));
                aaye aayeVar = new aaye(wiuVarF.aq());
                acip acipVar2 = acfsVar3.a;
                afip.H(aayeVar, acipVar2);
                acfr acfrVar2 = this.h;
                acfrVar2.i = false;
                yxb yxbVar = yxb.a;
                if (wiuVarF.ag()) {
                    yxbVar = (yxb) this.J.io();
                }
                yxb yxbVar2 = yxbVar;
                abncVar2.o();
                boolean zBT = abmt.ai(this.f, aawr.o(m()), aawr.n(m())) ? bT(acfsVar3.d()) : bT(this.o.d());
                if (abmtVar.F()) {
                    abncVar = abncVar2;
                    acfrVar = acfrVar2;
                    jC = bd(aciuVar.a, aciuVar.c, aciuVar.d);
                } else {
                    abncVar = abncVar2;
                    acfrVar = acfrVar2;
                    jC = aawr.c(aciuVar.a, abmtVar);
                }
                long j = jC;
                if (aciuVar.e()) {
                    bs(aciuVar.d(), wjfVarB);
                } else {
                    ywy ywyVarBR = bR(acipVar2.au());
                    ywyVarBR.x(wjfVarB.g(), z2 ? new yvw(j, 0L, 0L) : new yvw(j, wiuVarF.x(), wiuVarF.w()), aciuVar.c, aciuVar.d, aciuVar.d(), wiuVarF, aciuVar.f, yxbVar2, acfz.b(wiuVarF, abncVar, null), ba(acfsVar3), bb(true, zBT, acipVar2.a() == 1, wjfVarB.Q(), bG(acfsVar3), aL(wjfVarB.g())), bi(acfsVar3), acipVar2.j(), acfsVar3.O(), acfsVar3.D(), acfsVar3.C(), acipVar2, bU(acfsVar3), (yxe) this.N.io(), aciuVar.g);
                    aT(ywyVarBR);
                    if (!abmtVar.ad()) {
                        acfrVar.b();
                    }
                    this.m.a(acipVar2.au());
                    this.j.c(this);
                }
            } else if (wjfVarB == null) {
                zvp.a(zvn.b, zvm.k, "LocalDirector loading a media segment with no PlayerResponse.");
            } else {
                zvp.a(zvn.b, zvm.k, "LocalDirector loading a CPN which does not have a component.");
            }
            if (acfsVar3 != null) {
                if (this.k.g.l(388, 45780505L, false)) {
                    this.S.execute(afwl.i(new abwl(this, acfsVar3, 11, objArr == true ? 1 : 0)));
                } else {
                    aH(acfsVar3);
                }
                aawr.k(acfsVar3.a, aciuVar.a);
            }
            if (acfsVar3 != null && !aawr.n(m())) {
                abmt abmtVar2 = this.k;
                if (abmtVar2.f.m(20, 45414753L) && (abmtVar2.I() || acfsVar3.a.a() == 1)) {
                    this.P = true;
                }
            }
            acfsVar = acfsVar3;
        }
        if (!this.P) {
            bz(aciuVar, list);
        }
        if (acfsVar == null || strD == null || aciuVar.e()) {
            return;
        }
        acip acipVar3 = acfsVar.a;
        int iA = acipVar3.a();
        abob abobVar = this.s;
        if (iA == 1) {
            if (!abobVar.h()) {
                acfs acfsVarW = w(strD);
                aE(abob.e);
                acip acipVar4 = acfsVarW.a;
                aY(abnv.e, acipVar4);
                wjf wjfVarF = acipVar4.f();
                if (wjfVarF != null) {
                    acipVar4.p().h(m().au(), wjfVarF, acipVar4.au(), acipVar4.a());
                }
            }
        } else if (!abobVar.f()) {
            aE(abob.h);
        }
        if (aawr.n(m())) {
            return;
        }
        D(acipVar3.a() != 1, 0, acipVar3);
    }

    private final void bs(String str, wjf wjfVar) {
        acfs acfsVar = (acfs) this.u.get(str);
        if (acfsVar == null && str.equals(this.o.E())) {
            acfsVar = this.o;
        }
        acfs acfsVar2 = acfsVar;
        if (acfsVar2 != null) {
            abnc abncVar = this.d;
            abncVar.o();
            acip acipVar = acfsVar2.a;
            ywy ywyVarBR = bR(acipVar.au());
            ywyVarBR.x(wjfVar.g(), new yvw(bc(aawr.g(acipVar), acfsVar2), 0L, 0L), acipVar.c(), acipVar.b(), acipVar.au(), wjfVar.f(), acfsVar2, yxb.a, acfz.b(wjfVar.f(), abncVar, null), ba(acfsVar2), bb(false, bT(acfsVar2.d()), acipVar.a() == 1, wjfVar.Q(), bG(acfsVar2), aL(wjfVar.g())), bi(acfsVar2), acipVar.j(), acfsVar2.O(), acfsVar2.D(), acfsVar2.C(), acipVar, bU(acfsVar2), (yxe) this.N.io(), null);
            aT(ywyVarBR);
            long jE = aawr.e(acipVar);
            aR(acipVar, 4, -1L, jE, jE, -1L);
            if (this.s == abob.d) {
                this.v = true;
                aE(abob.j);
            }
        }
    }

    private final void bt(List list, acjc acjcVar, Optional optional, Optional optional2) {
        vxz vxzVar = this.k.g;
        if ((vxzVar.l(271, 45725609L, false) || !optional.isPresent()) && vxzVar.l(228, 45704093L, false)) {
            int i = this.r.a.w().l;
            Duration durationOfMillis = Duration.ofMillis(f());
            String strE = this.r.E();
            agke<acjd> agkeVarD = this.g.D(Optional.of(new aciy(aciw.class, 1)));
            StringBuilder sb = new StringBuilder("tt.");
            sb.append(acjcVar.m);
            if (optional.isPresent() || optional2.isPresent()) {
                sb.append(";si");
                if (optional.isPresent()) {
                    sb.append('.');
                    sb.append(((appa) optional.get()).bm);
                }
                if (optional2.isPresent()) {
                    sb.append('.');
                    sb.append(((Duration) optional2.get()).toMillis());
                }
            }
            if (!agkeVarD.isEmpty()) {
                sb.append(";pt.");
                for (acjd acjdVar : agkeVarD) {
                    if (acjdVar instanceof aciw) {
                        aciw aciwVar = (aciw) acjdVar;
                        StringJoiner stringJoiner = new StringJoiner("_", "(", ")");
                        long j = aciwVar.c;
                        long j2 = aciwVar.b;
                        String str = aciwVar.h;
                        stringJoiner.add(Long.toString(j)).add(Long.toString(j2)).add(str);
                        if (str.equals(strE)) {
                            stringJoiner.add(Integer.toString(i));
                            stringJoiner.add(Long.toString(durationOfMillis.toMillis()));
                        }
                        sb.append(stringJoiner.toString());
                    }
                }
            }
            if (!list.isEmpty()) {
                sb.append(";mt.");
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    aciu aciuVar = (aciu) it.next();
                    StringJoiner stringJoiner2 = new StringJoiner("_", "(", ")");
                    long j3 = aciuVar.a;
                    long jA = aciuVar.a();
                    String strD = aciuVar.d();
                    abnp abnpVarC = aciuVar.c();
                    sb.append(stringJoiner2.add(Long.toString(j3)).add(Long.toString(jA)).add(strD).add(abnpVarC != null ? true != abnpVarC.f ? "YES" : "NO" : "").toString());
                }
            }
            String string = sb.toString();
            acfs acfsVar = this.r;
            if (acfsVar != null) {
                acfsVar.H("tu", string, true);
            }
        }
    }

    private final void bu(acfs acfsVar, wjf wjfVar) {
        if (this.k.bG()) {
            acip acipVar = acfsVar.a;
            String strH = acipVar.w().h();
            if (strH == null) {
                strH = String.valueOf(this.b.b());
            }
            if (!abmt.co(this.V)) {
                this.B.t(strH, acfsVar.E());
            } else {
                abnl abnlVar = acipVar.w().b;
                acipVar.r().b(strH, wjfVar, acfsVar.E(), abnlVar != null ? abnlVar.w() : null);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [zki, zlm] */
    private final void bv() {
        ?? r0 = this.d.d;
        if (r0 == 0 || !this.H) {
            return;
        }
        r0.J(2);
    }

    private final void bw(acip acipVar) {
        this.B.r(acipVar);
        if (this.i) {
            abvy abvyVar = this.y;
            String strAu = acipVar.au();
            if (strAu != null) {
                abvyVar.d(strAu);
                return;
            }
            if (abvyVar.c == acipVar) {
                abvyVar.c = null;
            }
            if (abvyVar.d == acipVar) {
                abvyVar.d = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX WARN: Code duplicated, block: B:17:0x0055 A[Catch: all -> 0x01af, TryCatch #1 {all -> 0x01af, blocks: (B:3:0x000a, B:8:0x002b, B:9:0x0036, B:14:0x0049, B:32:0x0185, B:35:0x018d, B:36:0x01a4, B:17:0x0055, B:21:0x006b, B:24:0x00d3, B:26:0x0124, B:28:0x0163, B:30:0x0174, B:31:0x0177), top: B:48:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:20:0x006a  */
    /* JADX WARN: Code duplicated, block: B:23:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:26:0x0124 A[Catch: all -> 0x01af, TryCatch #1 {all -> 0x01af, blocks: (B:3:0x000a, B:8:0x002b, B:9:0x0036, B:14:0x0049, B:32:0x0185, B:35:0x018d, B:36:0x01a4, B:17:0x0055, B:21:0x006b, B:24:0x00d3, B:26:0x0124, B:28:0x0163, B:30:0x0174, B:31:0x0177), top: B:48:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0148  */
    /* JADX WARN: Code duplicated, block: B:30:0x0174 A[Catch: all -> 0x01af, TryCatch #1 {all -> 0x01af, blocks: (B:3:0x000a, B:8:0x002b, B:9:0x0036, B:14:0x0049, B:32:0x0185, B:35:0x018d, B:36:0x01a4, B:17:0x0055, B:21:0x006b, B:24:0x00d3, B:26:0x0124, B:28:0x0163, B:30:0x0174, B:31:0x0177), top: B:48:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:36:0x01a4 A[Catch: all -> 0x01af, TRY_LEAVE, TryCatch #1 {all -> 0x01af, blocks: (B:3:0x000a, B:8:0x002b, B:9:0x0036, B:14:0x0049, B:32:0x0185, B:35:0x018d, B:36:0x01a4, B:17:0x0055, B:21:0x006b, B:24:0x00d3, B:26:0x0124, B:28:0x0163, B:30:0x0174, B:31:0x0177), top: B:48:0x000a }] */
    private final void bx(acfs acfsVar) {
        acip acipVar;
        boolean z;
        wjf wjfVarB;
        abnp abnpVarD;
        acfr acfrVar;
        boolean z2;
        yvw yvwVar;
        zgp zgpVar;
        yvw yvwVar2;
        acfr acfrVar2;
        acfg acfgVar;
        afvx afvxVarAd = tym.ad(tsa.LD_PLAY_INTERSTITIAL_VIDEO);
        try {
            wjf wjfVarB2 = acfsVar.b();
            int iBN = bN(wjfVarB2);
            abmt abmtVar = this.k;
            boolean zL = abmtVar.g.l(142, 45648149L, false);
            if (iBN == 1) {
                aE(abob.e);
                abnv abnvVar = abnv.e;
                acipVar = acfsVar.a;
                aY(abnvVar, acipVar);
                if (zL || iBN != 3) {
                    z = true;
                } else {
                    z = false;
                }
                wjfVarB = acfsVar.b();
                if (wjfVarB == null) {
                    acfgVar = this;
                } else {
                    abnpVarD = acfsVar.d();
                    wiu wiuVarF = wjfVarB.f();
                    acfrVar = this.h;
                    acfrVar.i = false;
                    if (acipVar.a() != 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    D(z2, 0, acipVar);
                    abnc abncVar = this.d;
                    abncVar.r(aK(wjfVarB.g()));
                    afip.H(new aaye(wiuVarF.aq()), m());
                    abncVar.o();
                    ywy ywyVarBR = bR(acipVar.au());
                    wja wjaVarG = wjfVarB.g();
                    yvwVar = new yvw(bc(aawr.g(acipVar), acfsVar), wiuVarF.x(), wiuVarF.w());
                    long jC = acipVar.c();
                    long jB = acipVar.b();
                    String strE = acfsVar.E();
                    yxb yxbVar = yxb.a;
                    float fB = acfz.b(wiuVarF, abncVar, null);
                    float fBa = ba(acfsVar);
                    int iBb = bb(z, bT(abnpVarD), acipVar.a() == 1, wjfVarB.Q(), bG(acfsVar), aL(wjfVarB.g()));
                    zjd zjdVarBi = bi(acfsVar);
                    zfp zfpVarJ = acipVar.j();
                    byte[] bArrO = acfsVar.O();
                    Integer numD = acfsVar.D();
                    arfb arfbVarC = acfsVar.C();
                    boolean zBU = bU(acfsVar);
                    yxe yxeVar = (yxe) this.N.io();
                    if (abnpVarD != null) {
                        zgpVar = (zgp) abnpVarD.k.orElse(null);
                        yvwVar2 = yvwVar;
                        acfrVar2 = acfrVar;
                    } else {
                        zgpVar = null;
                        yvwVar2 = yvwVar;
                        acfrVar2 = acfrVar;
                    }
                    r19.x(wjaVarG, yvwVar2, jC, jB, strE, wiuVarF, acfsVar, yxbVar, fB, fBa, iBb, zjdVarBi, zfpVarJ, bArrO, numD, arfbVarC, acipVar, zBU, yxeVar, zgpVar);
                    acfgVar = this;
                    acfgVar.aT(ywyVarBR);
                    aH(acfsVar);
                    if (!abmtVar.ad()) {
                        acfrVar2.b();
                    }
                    acfgVar.m.a(acfsVar.E());
                    acfgVar.j.c(acfgVar);
                }
                acfs acfsVar2 = acfgVar.q;
                if (wjfVarB2 != null || acfsVar2 == null) {
                    twu.c(6, "Interstitial Video failed to load; Interstitial SingleVideoController was nulled during medialib load", null);
                } else {
                    acfsVar2.a.p().h(acfgVar.m().au(), wjfVarB2, acfsVar.E(), 1);
                }
            } else if (zL && iBN == 3) {
                iBN = 3;
                zL = true;
                aE(abob.e);
                abnv abnvVar2 = abnv.e;
                acipVar = acfsVar.a;
                aY(abnvVar2, acipVar);
                if (zL) {
                    z = true;
                } else {
                    z = true;
                }
                wjfVarB = acfsVar.b();
                if (wjfVarB == null) {
                    acfgVar = this;
                } else {
                    abnpVarD = acfsVar.d();
                    wiu wiuVarF2 = wjfVarB.f();
                    acfrVar = this.h;
                    acfrVar.i = false;
                    if (acipVar.a() != 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    D(z2, 0, acipVar);
                    abnc abncVar2 = this.d;
                    abncVar2.r(aK(wjfVarB.g()));
                    afip.H(new aaye(wiuVarF2.aq()), m());
                    abncVar2.o();
                    ywy ywyVarBR2 = bR(acipVar.au());
                    wja wjaVarG2 = wjfVarB.g();
                    yvwVar = new yvw(bc(aawr.g(acipVar), acfsVar), wiuVarF2.x(), wiuVarF2.w());
                    long jC2 = acipVar.c();
                    long jB2 = acipVar.b();
                    String strE2 = acfsVar.E();
                    yxb yxbVar2 = yxb.a;
                    float fB2 = acfz.b(wiuVarF2, abncVar2, null);
                    float fBa2 = ba(acfsVar);
                    int iBb2 = bb(z, bT(abnpVarD), acipVar.a() == 1, wjfVarB.Q(), bG(acfsVar), aL(wjfVarB.g()));
                    zjd zjdVarBi2 = bi(acfsVar);
                    zfp zfpVarJ2 = acipVar.j();
                    byte[] bArrO2 = acfsVar.O();
                    Integer numD2 = acfsVar.D();
                    arfb arfbVarC2 = acfsVar.C();
                    boolean zBU2 = bU(acfsVar);
                    yxe yxeVar2 = (yxe) this.N.io();
                    if (abnpVarD != null) {
                        zgpVar = (zgp) abnpVarD.k.orElse(null);
                        yvwVar2 = yvwVar;
                        acfrVar2 = acfrVar;
                    } else {
                        zgpVar = null;
                        yvwVar2 = yvwVar;
                        acfrVar2 = acfrVar;
                    }
                    r19.x(wjaVarG2, yvwVar2, jC2, jB2, strE2, wiuVarF2, acfsVar, yxbVar2, fB2, fBa2, iBb2, zjdVarBi2, zfpVarJ2, bArrO2, numD2, arfbVarC2, acipVar, zBU2, yxeVar2, zgpVar);
                    acfgVar = this;
                    acfgVar.aT(ywyVarBR2);
                    aH(acfsVar);
                    if (!abmtVar.ad()) {
                        acfrVar2.b();
                    }
                    acfgVar.m.a(acfsVar.E());
                    acfgVar.j.c(acfgVar);
                }
                acfs acfsVar3 = acfgVar.q;
                if (wjfVarB2 != null) {
                    twu.c(6, "Interstitial Video failed to load; Interstitial SingleVideoController was nulled during medialib load", null);
                } else {
                    twu.c(6, "Interstitial Video failed to load; Interstitial SingleVideoController was nulled during medialib load", null);
                }
            } else {
                zvp.a(zvn.a, zvm.k, "Interstitial Video was unplayable");
            }
            afvxVarAd.close();
        } catch (Throwable th) {
            try {
                afvxVarAd.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, java.util.Set] */
    private final void by(acjc acjcVar) {
        wjf wjfVarB;
        wjf wjfVarBg;
        afvx afvxVarAd = tym.ad(tsa.LD_PLAY_TIMELINE);
        try {
            if (this.O) {
                aboe aboeVarJ = j();
                if (aboeVarJ == null) {
                    zvp.a(zvn.b, zvm.k, "maybeRegenerateCpnAndStatsClient called unexpectedly, but no error.");
                } else {
                    zvp.b(zvn.b, zvm.k, "maybeRegenerateCpnAndStatsClient called unexpectedly. Error was: ".concat(String.valueOf(aboeVarJ.c)), new Exception(aboeVarJ.g));
                }
                afip afipVar = this.B;
                afipVar.u();
                String strA = this.e.a();
                wjf wjfVarF = this.o.a.f();
                abnl abnlVarN = this.o.a.n();
                abnp abnpVarO = this.o.a.o();
                long j = this.o.a.w().f;
                acfs acfsVarV = v(strA, 0, abnlVarN, abnpVarO, true);
                this.o = acfsVarV;
                this.r = acfsVarV;
                if (this.i) {
                    abvy abvyVar = this.y;
                    abvyVar.f(acfsVarV.a);
                    abvyVar.e(this.o.a);
                }
                aawr.k(this.o.a, j);
                bV(this.o.a, wjfVarF);
                acjb acjbVar = this.g;
                Iterator it = acjbVar.G().iterator();
                while (it.hasNext()) {
                    aB((String) it.next());
                }
                wjf wjfVarF2 = this.o.a.f();
                if (wjfVarF2 != null) {
                    acip acipVar = this.o.a;
                    acjbVar.Z(acjbVar.n(wjfVarF2, acipVar.au(), 0, acipVar.o()));
                }
                this.O = false;
                Iterator it2 = afipVar.d.iterator();
                while (it2.hasNext()) {
                    ((acii) it2.next()).w();
                }
            }
            if (bN(bg()) == 1 && (wjfVarB = this.o.b()) != null && (wjfVarBg = bg()) != null) {
                boolean zBH = bH();
                this.o.a.u().d(true);
                vyo vyoVar = this.f;
                if ((!abmt.ai(vyoVar, aawr.o(m()), aawr.n(m())) || !zBH || bH()) && ((this.p == null || abmt.ai(vyoVar, aawr.o(m()), aawr.n(m()))) && (!at().e() || !abmt.ai(vyoVar, aawr.o(m()), aawr.n(m()))))) {
                    aoqs aoqsVarR = abmt.r(vyoVar);
                    if (aoqsVarR == null || !aoqsVarR.v) {
                        if (wjfVarB.V() && !wjfVarB.W()) {
                            aawr.k(m(), this.k.j());
                        }
                    } else if (((aciq) this.o.B()).k != -1) {
                        aawr.k(m(), this.k.j());
                    }
                    if (ar(abob.j)) {
                        aE(abob.h);
                        aW(bl(), this.k.j(), true, acjcVar, bm(bl()));
                    } else {
                        if (!this.k.U()) {
                            abob abobVar = abob.h;
                            if (!as(abobVar)) {
                                aE(abobVar);
                            }
                        }
                        if (bl().a() == 3) {
                            bX(bl(), true, acjcVar, bm(bl()));
                        } else {
                            acip acipVar2 = this.r.a;
                            bX(acipVar2, true, acjcVar, bm(acipVar2));
                        }
                    }
                    if (this.k.U()) {
                        abob abobVar2 = abob.h;
                        if (!as(abobVar2)) {
                            aE(abobVar2);
                        }
                    }
                    bl().p().i(bl().au(), wjfVarBg, bl().a());
                }
            }
            afvxVarAd.close();
        } catch (Throwable th) {
            try {
                afvxVarAd.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    private final void bz(aciu aciuVar, List list) throws Throwable {
        Optional optionalEmpty;
        abnp abnpVar;
        long jC;
        Integer num;
        arfb arfbVar;
        if (!list.isEmpty() || this.n.c) {
            agjz agjzVar = new agjz(4);
            aciu aciuVar2 = aciuVar;
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                aciu aciuVar3 = (aciu) it.next();
                Map map = this.u;
                yxb yxbVar = yxb.a;
                acfs acfsVar = (acfs) map.get(aciuVar3.d());
                if (acfsVar == null && aciuVar3.d().equals(this.o.E())) {
                    acfsVar = this.o;
                }
                acfs acfsVar2 = acfsVar;
                wjf wjfVarB = aciuVar3.b();
                if (acfsVar2 == null || wjfVarB == null) {
                    if (wjfVarB == null) {
                        zvp.a(zvn.b, zvm.k, "LocalDirector queuing a media segment with no PlayerResponse.");
                    } else {
                        zvp.a(zvn.b, zvm.k, "LocalDirector queuing a CPN which does not have a component.");
                    }
                    optionalEmpty = Optional.empty();
                } else {
                    if (wjfVarB.f().ag()) {
                        yxbVar = (yxb) this.J.io();
                    }
                    yxb yxbVar2 = yxbVar;
                    xir xirVar = (xir) this.o.a.d().a();
                    abmt abmtVar = this.k;
                    if (abmtVar.e.l(395, 461056499L, false)) {
                        acfs acfsVar3 = (acfs) map.get(aciuVar3.d());
                        xirVar = (xir) (acfsVar3 == null ? Optional.empty() : Optional.ofNullable((xir) acfsVar3.a.d().a())).orElse(xirVar);
                    }
                    xir xirVar2 = xirVar;
                    acjd acjdVarC = this.g.c(aciuVar3.d());
                    aciw aciwVar = acjdVarC instanceof aciw ? (aciw) acjdVarC : null;
                    abnp abnpVarC = aciuVar3.c();
                    if (abmtVar.F()) {
                        abnpVar = abnpVarC;
                        jC = bd(aciuVar3.a, aciuVar3.c, aciuVar3.d);
                    } else {
                        abnpVar = abnpVarC;
                        jC = aawr.c(aciuVar3.a, abmtVar);
                    }
                    long j = jC;
                    acip acipVar = acfsVar2.a;
                    ywy ywyVarBR = bR(acipVar.au());
                    wja wjaVarG = wjfVarB.g();
                    yvw yvwVar = new yvw(j, 0L, 0L);
                    long j2 = aciuVar3.c;
                    long j3 = aciuVar3.d;
                    String strD = aciuVar3.d();
                    wiu wiuVarF = wjfVarB.f();
                    acfs acfsVar4 = aciuVar3.f;
                    float fB = acfz.b(wjfVarB.f(), this.d, null);
                    float fBa = ba(acfsVar2);
                    int iBb = bb(true, bT(abnpVar), aciwVar != null && aciwVar.j == 1, wjfVarB.Q(), bG(acfsVar2), aL(wjfVarB.g()));
                    zjd zjdVarBh = bh(xirVar2);
                    zfp zfpVarJ = acipVar.j();
                    byte[] bArrO = acfsVar2.O();
                    if (abnpVar != null) {
                        abnp abnpVar2 = abnpVar;
                        num = (Integer) abnpVar2.i.orElse(null);
                        arfbVar = (arfb) abnpVar2.h.orElse(null);
                    } else {
                        num = null;
                        arfbVar = null;
                    }
                    ywyVarBR.x(wjaVarG, yvwVar, j2, j3, strD, wiuVarF, acfsVar4, yxbVar2, fB, fBa, iBb, zjdVarBh, zfpVarJ, bArrO, num, arfbVar, acipVar, bU(acfsVar2), (yxe) this.N.io(), aciuVar3.g);
                    long j4 = -1;
                    if (!aciuVar2.e) {
                        long j5 = aciuVar2.b;
                        if (j5 != Long.MAX_VALUE) {
                            j4 = j5;
                        }
                    }
                    optionalEmpty = Optional.of(new yxk(ywyVarBR, j4));
                }
                abyy abyyVar = new abyy(agjzVar, 5);
                if (true == optionalEmpty.isPresent()) {
                    ((agjz) abyyVar.a).h(optionalEmpty.get());
                }
                aciuVar2 = aciuVar3;
            }
            agke agkeVarG = agjzVar.g();
            boolean z = this.n.c;
            abmt abmtVar2 = this.k;
            if (z) {
                vxz vxzVar = abmtVar2.e;
                this.c.p((!list.isEmpty() || vxzVar.l(318, 45752718L, false)) ? vxzVar.l(316, 45751627L, false) : false ? new ytz(agkeVarG) : new yua(agkeVarG));
            } else {
                if (abmtVar2.e.l(319, 45752719L, false)) {
                    twu.d("YT.LocalDirector", 4, "player.queueVideos YoloAppendList", null);
                    this.c.p(new yub(agkeVarG));
                    return;
                }
                int i = ((agpi) agkeVarG).d;
                for (int i2 = 0; i2 < i; i2++) {
                    this.c.o((yxk) agkeVarG.get(i2));
                }
            }
        }
    }

    @Override // defpackage.acey
    public final void A(wjf wjfVar, aboe aboeVar) {
        bV(this.o.a, wjfVar);
        I(aboeVar);
    }

    @Override // defpackage.acey
    public final void B(wjf wjfVar, abnl abnlVar) {
        afvx afvxVarAd = tym.ad(tsa.LD_LOAD_VIDEO);
        try {
            if (!ad()) {
                throw new IllegalStateException("loadVideo() called on LocalDirector in wrong state");
            }
            boolean z = true;
            if (!aaje.q(wjfVar.t()) && !aaje.p(wjfVar.t())) {
                z = false;
            }
            ahno.O(z);
            if (abnlVar != null && this.k.g.l(361, 45765155L, false)) {
                aoqd aoqdVar = wjfVar.u().e;
                if (aoqdVar == null) {
                    aoqdVar = aoqd.a;
                }
                aopd aopdVar = aoqdVar.h;
                if (aopdVar == null) {
                    aopdVar = aopd.a;
                }
                if ((aopdVar.b & SemanticState.Hidden) != 0) {
                    aoqd aoqdVar2 = wjfVar.u().e;
                    if (aoqdVar2 == null) {
                        aoqdVar2 = aoqd.a;
                    }
                    aopd aopdVar2 = aoqdVar2.h;
                    if (aopdVar2 == null) {
                        aopdVar2 = aopd.a;
                    }
                    arev arevVar = aopdVar2.g;
                    if (arevVar == null) {
                        arevVar = arev.a;
                    }
                    abnlVar.B(arevVar.c);
                }
                aoqd aoqdVar3 = wjfVar.u().e;
                if (aoqdVar3 == null) {
                    aoqdVar3 = aoqd.a;
                }
                aoor aoorVar = aoqdVar3.i;
                if (aoorVar == null) {
                    aoorVar = aoor.a;
                }
                if ((aoorVar.b & 8) != 0) {
                    aoqd aoqdVar4 = wjfVar.u().e;
                    if (aoqdVar4 == null) {
                        aoqdVar4 = aoqd.a;
                    }
                    aoor aoorVar2 = aoqdVar4.i;
                    if (aoorVar2 == null) {
                        aoorVar2 = aoor.a;
                    }
                    arev arevVar2 = aoorVar2.c;
                    if (arevVar2 == null) {
                        arevVar2 = arev.a;
                    }
                    abnlVar.A(arevVar2.c);
                }
            }
            bV(this.o.a, wjfVar);
            if (aawr.n(this.o.a)) {
                this.o.a.x().j();
            }
            if (aaje.p(wjfVar.t())) {
                this.o.a.aw().kk(new aaya());
                if (this.k.f.l(17, 45389599L, false)) {
                    afip.G(wjfVar, this.o.a);
                }
                aE(abob.c);
            } else {
                bq(this.o, abnlVar);
            }
            afvxVarAd.close();
        } catch (Throwable th) {
            try {
                afvxVarAd.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void C(acfs acfsVar, wjf wjfVar, abnl abnlVar) {
        long jLongValue;
        if (abnlVar.E() || abnlVar.G()) {
            acjb acjbVar = this.g;
            acip acipVar = acfsVar.a;
            acjbVar.Z(acjbVar.q(wjfVar, acipVar.au(), abnlVar.c(), bS(wjfVar), abnlVar.G() ? Long.valueOf(abnlVar.d()) : null, abnlVar.E() ? Long.valueOf(abnlVar.b()) : null, 0, acipVar.o()));
            return;
        }
        abmt abmtVar = this.k;
        if (abmtVar.aB() || (abmtVar.ak() && abmtVar.ab())) {
            Long lA = this.K.a(abnlVar, wjfVar, new acfc(acfsVar, 1));
            jLongValue = lA != null ? lA.longValue() : 0L;
        } else {
            jLongValue = (!abmtVar.ak() || abnlVar.F()) ? abnlVar.c() : wjfVar.f().v();
        }
        long j = jLongValue;
        acjb acjbVar2 = this.g;
        acip acipVar2 = acfsVar.a;
        acjbVar2.Z(acjbVar2.o(wjfVar, acipVar2.au(), j, 0, acipVar2.o()));
    }

    public final void D(boolean z, int i, acip acipVar) {
        E(z, i, acipVar, aawr.g(acipVar));
    }

    final void E(boolean z, int i, acip acipVar, long j) {
        aazk aazkVar;
        acfs acfsVar = this.q;
        if (!this.s.h() || acfsVar == null) {
            long jD = acipVar.t().d(j, z);
            abmt abmtVar = this.k;
            if (!abmtVar.ad()) {
                this.h.a(jD);
            }
            if (abmtVar.ad() ? bL(acipVar) : bK()) {
                aazkVar = new aazk(j, -1L, aawr.f(acipVar), aawr.e(acipVar), acipVar.w().j, acipVar.w().k, this.b.b(), false, acipVar.au());
                if (abmtVar.ad()) {
                    acipVar.p().n(aazkVar);
                } else {
                    this.r.a.p().n(aazkVar);
                }
            } else {
                aazkVar = null;
            }
        } else {
            acip acipVar2 = acfsVar.a;
            long jD2 = acipVar2.t().d(j, z);
            wjf wjfVarF = acipVar2.f();
            if (wjfVarF == null) {
                return;
            }
            abmt abmtVar2 = this.k;
            if (!abmtVar2.ad()) {
                this.h.a(jD2);
            }
            aazkVar = new aazk(j, -1L, abmtVar2.am() ? aawr.f(acipVar) : -1L, wjfVarF.d(), 0L, -1L, this.b.b(), false, acipVar.au());
            if (abmtVar2.ad()) {
                acipVar.p().n(aazkVar);
            } else {
                acipVar2.p().n(aazkVar);
            }
        }
        if (aazkVar != null) {
            bQ(i, acipVar, aazkVar, 4);
        }
    }

    public final void F(int i) {
        acfs acfsVar;
        acfs acfsVar2;
        abob abobVar = this.s;
        abob abobVar2 = abob.c;
        String strAu = null;
        String strAu2 = as(abobVar2) ? this.o.a.au() : null;
        afvx afvxVarAe = tym.ae(tsa.LD_BROADCAST_VIDEO_STAGE, aawm.a(qci.b(null, abobVar), strAu2));
        try {
            wjf wjfVarF = abobVar.c(abobVar2) ? this.o.a.f() : null;
            wjf wjfVarF2 = (!abobVar.h() || (acfsVar2 = this.q) == null) ? null : acfsVar2.a.f();
            if (this.s.h() && (acfsVar = this.q) != null) {
                strAu = acfsVar.a.au();
            }
            aazj aazjVar = new aazj(abobVar, wjfVarF, wjfVarF2, bk(abobVar), strAu2, strAu, aawr.o(m()));
            afip afipVar = this.B;
            if (i == 0) {
                afipVar.v(aazjVar, this.o.a);
            } else {
                afipVar.z(aazjVar);
            }
            afvxVarAe.close();
        } catch (Throwable th) {
            try {
                afvxVarAe.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void G(long j) {
        acjb acjbVarV = this.g.v(j);
        if (acjbVarV != null) {
            acjd acjdVarX = acjbVarV.x();
            if (acjdVarX instanceof aciv) {
                e();
                this.B.k(((aciv) acjdVarX).a);
            }
        }
    }

    @Override // defpackage.acey
    public final void H(String str) {
        this.B.k(str);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0082  */
    @Override // defpackage.acey
    public final void I(aboe aboeVar) {
        int i;
        Map map = this.u;
        String str = aboeVar.b;
        acfs acfsVar = (acfs) map.get(str);
        if (acfsVar == null && TextUtils.equals(str, this.o.E())) {
            acfsVar = this.o;
        }
        if (acfsVar != null) {
            String strW = aboeVar.h;
            abmt abmtVar = this.k;
            wjf wjfVarB = acfsVar.b();
            if (abmtVar.bG()) {
                acip acipVar = acfsVar.a;
                abnl abnlVar = acipVar.w().b;
                if (strW == null && abnlVar != null) {
                    strW = abnlVar.w();
                }
                String strH = acipVar.w().h();
                if (strH != null) {
                    if (abmt.co(this.V)) {
                        acipVar.r().b(strH, wjfVarB, acfsVar.E(), strW);
                    } else {
                        this.B.t(strH, acfsVar.E());
                    }
                }
            }
        }
        vyo vyoVar = this.f;
        if (vyoVar.b() == null) {
            i = aboeVar.j;
            if ((i == 17 && i != 3) || aboeVar.a || aboeVar.g()) {
                aQ(aboeVar, 3);
                return;
            }
        } else {
            anew anewVar = vyoVar.b().j;
            if (anewVar == null) {
                anewVar = anew.a;
            }
            apbx apbxVar = anewVar.d;
            if (apbxVar == null) {
                apbxVar = apbx.b;
            }
            if (!apbxVar.e || aboeVar.j != 4) {
                i = aboeVar.j;
                if (i == 17) {
                }
                aQ(aboeVar, 3);
                return;
            }
        }
        aQ(aboeVar, 4);
        bw(this.o.a);
        bv();
    }

    @Override // defpackage.acfl
    public final void J() {
        this.h.i = true;
        acfs acfsVar = this.r;
        if (acfsVar != null) {
            acfsVar.y();
        }
    }

    @Override // defpackage.acey
    public final void K() {
        afvx afvxVarAd = tym.ad(tsa.LD_PLAY);
        try {
            if (!as(abob.e)) {
                twu.c(5, "play() called when the player wasn't loaded.", null);
            } else if (aawr.q(this.d, bg())) {
                twu.c(5, "play() blocked because Background Playability failed", null);
            } else if (!aJ()) {
                this.h.i = false;
                m().w().o = null;
                acfs acfsVar = this.q;
                if (bI()) {
                    if (this.s == abob.g) {
                        this.r.a.t().t();
                        if (abmt.cq(this.f) && acfsVar == this.r) {
                            aE(abob.f);
                        } else {
                            aE(abob.i);
                        }
                    }
                    this.c.n();
                } else if (this.p == null || acfsVar == null || acfsVar.a.f() == null) {
                    acjb acjbVar = this.g;
                    if (acjbVar.g() || acjbVar.i()) {
                        by(acjc.INITIAL_LOAD);
                    } else {
                        zvp.a(zvn.b, zvm.k, "Attempting to play with no data in PlaybackTimeline");
                    }
                } else {
                    bx(acfsVar);
                }
            }
            afvxVarAd.close();
        } catch (Throwable th) {
            try {
                afvxVarAd.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.acey
    public final void L(abnl abnlVar, abnp abnpVar, String str) {
        abmt abmtVar = this.k;
        if (abmtVar.N() || abnlVar == null || abnpVar == null) {
            return;
        }
        vyo vyoVar = this.f;
        Optional optional = abnpVar.i;
        Optional optionalL = abnlVar.l();
        Duration durationJ = abnlVar.j();
        byte[] bArrR = abnlVar.R();
        Integer num = (Integer) optional.orElse(null);
        arfb arfbVar = (arfb) abnpVar.h.orElse(null);
        arie arieVar = abnlVar.i().c;
        if (arieVar == null) {
            arieVar = arie.a;
        }
        yrr yrrVarG = yrr.g(vyoVar, optionalL, str, durationJ, abnpVar.g, bArrR, num, arfbVar, arieVar, null, abnlVar.C(), abmtVar.aL());
        if (yrrVarG == null || TextUtils.isEmpty(abnlVar.w())) {
            return;
        }
        yrrVarG.b(abnlVar.w());
        ytv ytvVar = this.c;
        bh(abnpVar.b);
        ytvVar.F(yrrVarG);
    }

    @Override // defpackage.acey
    public final void M(wjf wjfVar, abnl abnlVar, abnp abnpVar) {
        if (this.n.h) {
            N(agke.q(new acex(abnlVar, abnpVar, wjfVar)));
            return;
        }
        int i = 0;
        if (this.s.a(abob.a, abob.b, abob.j)) {
            zvp.a(zvn.b, zvm.k, "Attempting to queue video when video is not loaded and playing");
        }
        acjb acjbVar = this.g;
        if (acjbVar.g()) {
            acfs acfsVarV = v(abnlVar.p(this.e), 0, abnlVar, abnpVar, false);
            acfsVarV.a.w().j(wjfVar);
            this.u.put(acfsVarV.E(), acfsVarV);
            Iterable$EL.forEach(acjbVar.C(this.o.E()), new acfb(this, i));
            C(acfsVarV, wjfVar, abnlVar);
            acjbVar.e(false, acjc.QUEUE_SEGMENTS);
        }
    }

    @Override // defpackage.acey
    public final void N(agke agkeVar) {
        int i = 0;
        agke agkeVar2 = (agke) Collection.EL.stream(agkeVar).map(new acfa(this, i)).collect(aghu.a);
        String strE = this.o.E();
        acjb acjbVar = this.g;
        Collection.EL.stream(acjbVar.C(strE)).filter(new aajl(agkeVar2, 20)).forEach(new acfb(this, i));
        Iterable$EL.forEach(agkeVar, new acfb(this, 2));
        acjbVar.e(false, acjc.QUEUE_SEGMENTS);
    }

    @Override // defpackage.acey
    public final void O() {
        F(1);
        aP(this.r.a, 4, 1);
        boolean zAN = aN();
        acfs acfsVar = this.r;
        if (zAN) {
            D(false, 1, acfsVar.a);
        } else {
            acip acipVar = acfsVar.a;
            bO(acipVar, acipVar.w().g, this.r.a.w().f, this.r.a.w().j, this.r.a.w().k, false, 4, 1);
        }
        bP(m().w().o, 4, 1);
        wjf wjfVarF = this.o.a.f();
        if (wjfVarF != null) {
            wja wjaVarG = wjfVarF.g();
            wiu wiuVarF = wjfVarF.f();
            if (wjaVarG == null || wiuVarF == null) {
                return;
            }
            abnc abncVar = this.d;
            ytv ytvVar = this.c;
            acfs acfsVar2 = this.o;
            yoq yoqVar = this.W;
            abmt abmtVar = this.k;
            vxz vxzVar = abmtVar.e;
            axlj axljVar = null;
            if (vxzVar.m(312, 45743181L)) {
                yop yopVarN = yop.n(yoqVar.d(true, wiuVarF, acfsVar2.a.au(), null), wiuVarF, new yoh(2), wjaVarG.t, wjaVarG.w, null, MediaCapabilitiesOuterClass$MediaCapabilities.getDefaultInstance(), false, false, true, abmtVar.g.m(346, 45757343L), vxzVar.m(376, 45823374L), vxzVar.m(393, 45849131L), vxzVar.m(392, 45846823L));
                axljVar = new axlj(yopVarN.c(), yopVarN.g, yopVarN.h);
            } else {
                try {
                    yod yodVarB = ytvVar.b(wjaVarG, wiuVarF, abncVar.s(), null, Alert.DURATION_SHOW_INDEFINITELY);
                    axljVar = new axlj(yodVarB.g, yodVarB.e, yodVarB.f);
                } catch (yof unused) {
                }
            }
            if (axljVar != null) {
                Object obj = axljVar.b;
                Object obj2 = axljVar.a;
                wiw[] wiwVarArr = (wiw[]) obj;
                yvu yvuVar = new yvu(null, null, null, wiwVarArr, (wgo[]) obj2, (yog) axljVar.c, 0);
                this.r.a.p().g(yvuVar);
                this.B.x(yvuVar, this.r.a.au());
            }
        }
    }

    @Override // defpackage.acey
    public final void P() {
        Object obj;
        afvx afvxVarAd = tym.ad(tsa.LD_RELEASE);
        try {
            abmt abmtVar = this.k;
            if (!abmtVar.bo() && this.j.d(this) && !abmtVar.g.l(348, 45757846L, false)) {
                aX(5);
            }
            acfr acfrVar = this.h;
            acfrVar.i = true;
            if (!abmtVar.ad() && (obj = acfrVar.k) != null) {
                awka.f((AtomicReference) obj);
            }
            bv();
            abob abobVar = this.s;
            abob abobVar2 = abob.a;
            if (abobVar != abobVar2) {
                this.o.a.u().d(false);
                this.o.a.u().c();
                this.p = null;
                this.t = -1L;
                this.x = 1;
                if (this.j.d(this)) {
                    ytv ytvVar = this.c;
                    ytvVar.k();
                    if (!abmtVar.bo()) {
                        ytvVar.j();
                    }
                    aX(5);
                }
                if (!abmtVar.ad()) {
                    acfrVar.c();
                }
                aE(abobVar2);
                Map map = this.u;
                if (map.get(this.o.E()) == null) {
                    this.o.J();
                    bw(this.o.a);
                }
                Iterator it = this.g.G().iterator();
                while (it.hasNext()) {
                    aB((String) it.next());
                }
                W();
                ArrayList arrayList = new ArrayList(map.values());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    aB(((acfs) arrayList.get(i)).E());
                }
                afip afipVar = this.B;
                afipVar.u();
                this.d.f();
                afipVar.g();
                if (this.i) {
                    abvy abvyVar = this.y;
                    abvyVar.c = null;
                    abvyVar.d = null;
                    abvyVar.b.clear();
                }
            }
            afvxVarAd.close();
        } catch (Throwable th) {
            try {
                afvxVarAd.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.acey
    public final void Q() {
        K();
        for (acii aciiVar : this.B.d) {
        }
    }

    @Override // defpackage.acey
    public final void R() {
        K();
        if (this.k.ad()) {
            return;
        }
        this.h.b();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [axsp, java.lang.Object] */
    @Override // defpackage.acey
    public final void S(jrj jrjVar) throws Throwable {
        abnc abncVar = this.d;
        abncVar.p = jrjVar;
        abncVar.t.j.kk(new aawn(jrjVar));
        if (this.s.c(abob.h) && bI()) {
            aG(new acjf(true, acjc.UPDATE_ON_AUDIO_ROUTE, acji.a));
        }
    }

    @Override // defpackage.acey
    public final void T(String str, aazh aazhVar) {
        if (this.k.g.l(300, 45734947L, false) && this.c.h.b().equals(str)) {
            return;
        }
        ytv ytvVar = this.c;
        wgs wgsVarF = ytvVar.f();
        ytvVar.t(str);
        if (wgsVarF != null) {
            this.s.g();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [acij, java.lang.Object] */
    @Override // defpackage.acey
    public final void U(boolean z) {
        acik acikVarV = m().v();
        if (!acikVarV.a && z) {
            acikVarV.b = 0;
            acikVarV.c.jO((String) acikVarV.d, 0);
        }
        acikVarV.a = z;
    }

    @Override // defpackage.acey
    public final void V(float f) {
        m().w().e = f;
        if (this.s.h()) {
            return;
        }
        Optional optionalOfNullable = Optional.ofNullable(m().f());
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(((wjf) optionalOfNullable.get()).f());
        }
        this.c.y(f, (wiu) optionalOfNullable.orElse(wiu.c));
        if (!this.X.l(58, 45400591L, false) || aM()) {
            return;
        }
        this.B.o(new aaxh(an(), i(), f), m());
    }

    public final void W() {
        acfs acfsVar = this.q;
        if (acfsVar != null) {
            aB(acfsVar.a.au());
            this.q = null;
            ah();
        }
    }

    @Override // defpackage.acey
    public final void X(int i) {
        ytv ytvVar = this.c;
        wgs wgsVarF = ytvVar.f();
        String strP = p();
        arfb arfbVar = arfb.VIDEO_QUALITY_SETTING_ADVANCED_MENU;
        agpr agprVar = agpr.a;
        ytvVar.A(i, arfbVar, agprVar, strP);
        if ((abmt.aM(this.f) || wgsVarF != null) && !this.s.g()) {
            this.B.l(new aaxd(i, agprVar, aipc.QUALITY_ORDINAL_UNKNOWN), this.r.a);
        }
    }

    @Override // defpackage.acey
    public final void Y(wiw wiwVar) {
        ytv ytvVar = this.c;
        wgs wgsVarF = ytvVar.f();
        String strP = p();
        int i = wiwVar.a;
        arfb arfbVar = arfb.VIDEO_QUALITY_SETTING_ADVANCED_MENU;
        agkz agkzVar = wiwVar.d;
        ytvVar.A(i, arfbVar, agkzVar, strP);
        if ((abmt.aM(this.f) || wgsVarF != null) && !this.s.g()) {
            this.B.l(new aaxd(i, agkzVar, wiwVar.e), this.r.a);
        }
    }

    @Override // defpackage.acey
    public final void Z(arfb arfbVar) {
        ytv ytvVar = this.c;
        wgs wgsVarF = ytvVar.f();
        ytvVar.B(arfbVar, p());
        if ((abmt.aM(this.f) || wgsVarF != null) && !this.s.g()) {
            this.B.l(new aaxd(arfbVar, true), this.r.a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.acic
    public final void a() {
        for (acii aciiVar : this.B.d) {
        }
    }

    public final void aA(String str) {
        acfs acfsVar = (acfs) this.u.get(str);
        if (acfsVar != null) {
            if (acfsVar.a.a() == 1 && this.r == acfsVar) {
                d();
            } else {
                aB(str);
            }
        }
    }

    public final void aB(String str) {
        acfs acfsVar = (acfs) this.u.remove(str);
        if (acfsVar != null) {
            acfsVar.J();
            bw(acfsVar.a);
        }
        if (this.k.aF()) {
            this.ab.p(str);
        }
    }

    public final void aC(List list, boolean z, boolean z2, acjc acjcVar, acji acjiVar) throws Throwable {
        bC(list, z, z2, acjcVar, Optional.empty(), Optional.empty(), acjiVar);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Set] */
    public final void aD(Duration duration) {
        this.x = 1;
        abmi abmiVar = new abmi(duration);
        acip acipVar = this.r.a;
        for (acii aciiVar : this.B.d) {
        }
        acipVar.bb().kk(abmiVar);
    }

    /* JADX WARN: Type inference failed for: r4v41, types: [zki, zlm] */
    public final void aE(abob abobVar) {
        wjf wjfVarF;
        String str;
        ?? r4;
        String strAu = null;
        afvx afvxVarAe = tym.ae(tsa.LD_SET_VIDEO_STAGE, aawm.a(qci.b(null, abobVar), p()));
        try {
            if (abobVar == abob.b) {
                abnc abncVar = this.d;
                if (!abncVar.s() && (r4 = abncVar.d) != 0 && this.H) {
                    r4.K(2);
                }
            } else {
                bv();
            }
            int iOrdinal = abobVar.ordinal();
            if (iOrdinal == 2 || iOrdinal == 8) {
                String strE = this.o.E();
                wjfVarF = this.o.a.f();
                str = strAu;
                strAu = strE;
            } else if (iOrdinal == 4 || iOrdinal == 5) {
                acfs acfsVar = this.q;
                if (acfsVar != null) {
                    strAu = acfsVar.a.au();
                }
                String strE2 = this.o.E();
                wjfVarF = this.o.a.f();
                str = strAu;
                strAu = strE2;
            } else {
                str = null;
                wjfVarF = null;
            }
            ablr ablrVar = this.m;
            Optional optionalOfNullable = ablrVar.f;
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = Optional.ofNullable(Boolean.valueOf(((abob) optionalOfNullable.get()).d()));
            }
            if (((Boolean) optionalOfNullable.orElse(Boolean.FALSE)).booleanValue()) {
                if (!abobVar.d()) {
                    ablrVar.d = ablrVar.e.a().b(((Integer) ablrVar.c.orElse(0)).intValue(), ablr.a);
                }
            } else if (abobVar.d()) {
                ablrVar.d = Instant.MAX;
            }
            ablrVar.f = Optional.of(abobVar);
            if (strAu != null && wjfVarF != null) {
                int iOrdinal2 = abobVar.ordinal();
                if (iOrdinal2 == 2) {
                    agm agmVar = ablrVar.h;
                    if (agmVar.b(strAu) != null) {
                        agmVar.c(strAu, Optional.of(wjfVarF));
                    }
                } else if (iOrdinal2 != 4) {
                    if (iOrdinal2 == 8) {
                        ablrVar.h.d(strAu);
                    }
                } else if (str != null) {
                    agm agmVar2 = ablrVar.h;
                    if (agmVar2.b(strAu) != null) {
                        agmVar2.c(strAu, Optional.of(wjfVarF));
                    }
                }
            }
            this.s = abobVar;
            abmt abmtVar = this.k;
            acfs acfsVarBj = abmtVar.ad() ? bj(abobVar) : this.r;
            if (acfsVarBj != null) {
                acfsVarBj.a.w().m = abobVar;
            }
            int iOrdinal3 = abobVar.ordinal();
            if (iOrdinal3 == 2) {
                this.o.a.t().r();
            } else if (iOrdinal3 == 4) {
                acfs acfsVar2 = this.q;
                if (acfsVar2 != null) {
                    acip acipVar = acfsVar2.a;
                    acipVar.t().r();
                    acipVar.t().t();
                }
            } else if (iOrdinal3 == 7) {
                this.o.a.t().t();
            }
            F(0);
            abnv abnvVarC = acfz.c(abobVar);
            if (abnvVarC != null) {
                aY(abnvVarC, this.o.a);
            }
            if ((abobVar == abob.f && this.P) || (abmtVar.I() && abobVar == abob.i)) {
                acjc acjcVar = acjc.TIMELINE_QUEUE_REMAINING_SEGMENTS_AFTER_PLAYBACK_START;
                long jG = aawr.g(x());
                boolean zAu = abmtVar.au();
                acjb acjbVar = this.g;
                if (zAu) {
                    List listV = acjb.V(acjbVar, x().au(), jG, false, abmtVar, this.w);
                    G(jG);
                    bt(listV, acjcVar, Optional.empty(), Optional.empty());
                    if (!listV.isEmpty()) {
                        bz((aciu) listV.remove(0), listV);
                    }
                } else {
                    List listF = acjb.F(acjbVar, x().au(), jG, Long.MAX_VALUE, false, abmtVar, this.w);
                    bt(listF, acjcVar, Optional.empty(), Optional.empty());
                    bz((aciu) listF.remove(0), listF);
                }
                this.P = false;
            }
            afvxVarAe.close();
        } catch (Throwable th) {
            try {
                afvxVarAe.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void aF() {
        if (!aN()) {
            K();
            return;
        }
        D(false, 0, this.r.a);
        m().aw().kk(new aaxu());
        aH(this.r);
    }

    public final void aG(acjf acjfVar) throws Throwable {
        acfg acfgVar;
        if (!aawr.n(m())) {
            if (this.g.c(this.r.E()) != null) {
                bX(this.r.a, acjfVar.a, acjfVar.b, acjfVar.c);
                return;
            } else {
                bX(this.o.a, acjfVar.a, acjfVar.b, acjfVar.c);
                return;
            }
        }
        long jBf = bf();
        acjc acjcVar = acjfVar.b;
        acji acjiVar = acjfVar.c;
        abmt abmtVar = this.k;
        boolean zAu = abmtVar.au();
        acjb acjbVar = this.g;
        if (zAu) {
            List listV = acjb.V(acjbVar, null, jBf, false, abmtVar, this.w);
            G(jBf);
            acfgVar = this;
            acfgVar.aC(listV, false, false, acjcVar, acjiVar);
        } else {
            acfgVar = this;
            acfgVar.bA(acjb.F(acjbVar, null, jBf, Long.MAX_VALUE, false, abmtVar, this.w), false, false, acjcVar, acjiVar);
        }
        acfgVar.o.a.l().c();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Set] */
    public final void aH(acfs acfsVar) {
        acfs acfsVar2;
        Map map = this.u;
        boolean zContainsKey = map.containsKey(acfsVar.E());
        if (!zContainsKey) {
            map.put(acfsVar.E(), acfsVar);
        }
        if (this.r != acfsVar) {
            bu(acfsVar, acfsVar.b());
        }
        acip acipVar = acfsVar.a;
        if (acipVar.a() == 0 && (acfsVar2 = this.o) != acfsVar) {
            String strE = acfsVar2.E();
            abmt abmtVar = this.k;
            boolean z = false;
            if (abmtVar.ad() && this.i) {
                abvy abvyVar = this.y;
                strE.getClass();
                if (abvyVar.b.contains(strE)) {
                    z = true;
                }
            }
            if (z) {
                j$.util.Map.EL.putIfAbsent(map, strE, this.o);
            }
            for (String str : this.g.d(strE)) {
                if (!z || !str.equals(strE)) {
                    aB(str);
                }
            }
            this.o = acfsVar;
            if (this.i) {
                this.y.f(acipVar);
            }
            this.B.p(acipVar);
            this.m.b(acipVar.au(), acipVar.f(), this.j.d(this));
            if (abmtVar.aj()) {
                acipVar.u().d(true);
            }
            wjf wjfVarB = acfsVar.b();
            if (wjfVarB != null) {
                afip.G(wjfVarB, acipVar);
            }
            aE(abob.a);
            aE(abob.b);
            aE(abob.c);
            aE(abob.g);
        }
        if (this.r == acfsVar && zContainsKey) {
            return;
        }
        this.r = acfsVar;
        if (this.i) {
            this.y.e(acipVar);
        }
        if (abmt.ai(this.f, aawr.o(m()), aawr.n(m())) && acipVar.a() == 1) {
            this.q = acfsVar;
        }
        this.B.h(this.r.a);
        acfs acfsVar3 = this.o;
        acip acipVar2 = this.r.a;
        if (acipVar2.a() == 1) {
            afip afipVar = acfsVar3.n;
            String strE2 = acfsVar3.E();
            String strAu = acipVar2.au();
            Iterator it = afipVar.d.iterator();
            while (it.hasNext()) {
                ((acii) it.next()).n(strE2, strAu);
            }
            if (abmt.co(acfsVar3.m)) {
                acab acabVar = acfsVar3.j;
                String strAu2 = acipVar2.au();
                zgj zgjVar = acabVar.p;
                if (zgjVar != null) {
                    zgjVar.n(strAu2);
                }
            }
        }
    }

    @Override // defpackage.acfv
    public final void aI() {
        if (aM()) {
            wis wisVar = this.F;
            this.c.C(acfz.b(wisVar.io(), this.d, null));
        }
    }

    public final boolean aJ() {
        int i;
        wjf wjfVarF = this.o.a.f();
        wjf wjfVarF2 = this.o.a.f();
        mbc mbcVar = this.b;
        boolean zI = aaje.i(wjfVarF2, mbcVar);
        if (wjfVarF != null && zI) {
            wja wjaVarG = wjfVarF.g();
            long jB = mbcVar.b();
            if (wjaVarG.A(jB)) {
                long j = jB - wjaVarG.i;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                i = (int) (j / 1000);
            } else {
                i = -1;
            }
            aD(Duration.ofSeconds(i));
        }
        return zI;
    }

    public final boolean aM() {
        if (abmt.ce(this.f)) {
            return bJ(this.r.a);
        }
        return this.x != 1;
    }

    public final boolean aN() {
        return this.h.i;
    }

    public final boolean aO(abob... abobVarArr) {
        return this.s.a(abobVarArr);
    }

    public final void aP(acip acipVar, int i, int i2) {
        int i3;
        acfm acfmVar;
        aazn aaznVar = new aazn(aawr.b(acipVar), acipVar.au());
        avbs avbsVar = this.A;
        if (avbsVar.b == 2 && ((i3 = aaznVar.a) == 7 || i3 == 3)) {
            acfn acfnVar = this.j;
            if (avbsVar.b() && avbsVar.c == 2 && acfnVar.e && (acfmVar = acfnVar.a) != null) {
                ((acfg) acfmVar).K();
            }
        }
        afip afipVar = this.B;
        if (i2 == 0) {
            afipVar.F(aaznVar, i, acipVar);
        } else {
            afipVar.B(aaznVar);
        }
    }

    public final void aQ(aboe aboeVar, int i) {
        if (aawb.B(aboeVar.j)) {
            this.O = true;
        }
        abob abobVar = abob.g;
        if (as(abobVar)) {
            aE(abobVar);
        } else if (as(abob.e)) {
            aE(abob.c);
        }
        bP(aboeVar, i, 0);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    public final void aR(acip acipVar, int i, long j, long j2, long j3, long j4) {
        long j5;
        long j6;
        if (j2 >= 0) {
            abmt abmtVar = this.k;
            long jC = (abmt.aQ(this.f) && (abmtVar.ad() ? acipVar.t().u() : this.r.a.t().u())) ? Long.MAX_VALUE : acipVar.t().c(j2, j);
            if (!abmtVar.ad()) {
                this.h.a(jC);
            }
            if (!abmtVar.ad() ? !bJ(acipVar) : !(bJ(acipVar) || this.y.h(acipVar.au()))) {
                acipVar.w().g = j;
                aawr.k(acipVar, j2);
                j5 = j3;
                acipVar.w().j = j5;
                j6 = j4;
                acipVar.w().k = j6;
            } else if (aawr.e(acipVar) <= 0 || aawr.e(acipVar) != j2) {
                j5 = j3;
                j6 = j4;
            } else {
                acipVar.w().g = j;
                aawr.k(acipVar, j2);
                j5 = j3;
                acipVar.w().j = j5;
                j6 = j4;
                acipVar.w().k = j6;
            }
            if (i != 1) {
                bO(acipVar, j, j2, j5, j6, true, i, 0);
            }
        }
    }

    @Override // defpackage.acgr
    public final acfs aS(String str, wjf wjfVar, int i, abnp abnpVar) {
        acfg acfgVar;
        if (TextUtils.equals(str, p())) {
            return this.o;
        }
        acfs acfsVar = (acfs) this.u.get(str);
        if (acfsVar == null) {
            acfs acfsVarV = v(str, i, null, abnpVar, false);
            acfgVar = this;
            acfsVar = acfsVarV;
        } else {
            acfgVar = this;
        }
        acip acipVar = acfsVar.a;
        acipVar.w().j(wjfVar);
        if (!acfgVar.k.am()) {
            return acfsVar;
        }
        acipVar.w().h = wjfVar.f().u();
        return acfsVar;
    }

    final void aT(ywy ywyVar) {
        this.c.l(ywyVar);
    }

    public final acir aU(boolean z, boolean z2, boolean z3) {
        acir acirVar = this.p;
        if (acirVar != null) {
            return new acir(false, acirVar.b || z3, z, acirVar.d, acirVar.f, acirVar.g, acirVar.e);
        }
        return new acir((z || z2 || !bM()) ? false : true, this.s == abob.j || z3, z, Math.max(be(), 0L), this.o.a.p().a(), this.aa.k(), this.o.a.au());
    }

    public final void aV() {
        if (aM()) {
            this.c.m();
        } else {
            by(acjc.INITIAL_LOAD);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008a  */
    public final void aW(acip acipVar, long j, boolean z, acjc acjcVar, acji acjiVar) throws Throwable {
        long j2;
        long j3;
        List listV;
        if (aawr.r(x())) {
            long j4 = m().w().h;
            wjf wjfVarI = i();
            if (j <= j4 || wjfVarI == null) {
                j2 = j;
            } else {
                List list = wjfVarI.g().u;
                List list2 = wjfVarI.g().v;
                boolean zS = this.d.s();
                if (list.size() == 1 && (zS || list2.size() == 1)) {
                    if (this.c.d((wgs) list.get(0), zS ? null : (wgs) list2.get(0), j4, zS) >= j) {
                        j4 = j;
                    }
                    j2 = j4;
                } else {
                    zvp.a(zvn.b, zvm.k, "syncTimelineToVideoComponent: unexpected offline playback stream count: " + list.size() + " audio streams and " + list2.size() + " video streams");
                    j2 = j;
                }
            }
        } else {
            j2 = j;
        }
        abmt abmtVar = this.k;
        if (!abmtVar.au()) {
            long j5 = j2;
            bA((!abmtVar.I() || aM()) ? acjb.F(this.g, acipVar.au(), j5, Long.MAX_VALUE, false, abmtVar, this.w) : acjb.F(this.g, acipVar.au(), j5, Long.MAX_VALUE, true, abmtVar, this.w), z, bW(acipVar), acjcVar, acjiVar);
            return;
        }
        if (!abmtVar.I() || aM()) {
            j3 = j2;
            listV = acjb.V(this.g, acipVar.au(), j3, false, abmtVar, this.w);
        } else {
            j3 = j2;
            listV = acjb.V(this.g, acipVar.au(), j3, true, abmtVar, this.w);
        }
        G(j3);
        aC(listV, z, bW(acipVar), acjcVar, acjiVar);
    }

    public final void aX(int i) {
        boolean zB = this.A.b();
        if (zB) {
            acfn acfnVar = this.j;
            boolean zE = this.c.E();
            if (acfnVar.b == null) {
                acfnVar.e = zE;
            }
        }
        ablr ablrVar = this.m;
        ytv ytvVar = this.c;
        ablrVar.a(ytvVar.i());
        this.j.c(this);
        if (zB) {
            ytvVar.H(i);
        } else {
            ytvVar.I(i);
        }
    }

    @Override // defpackage.acfv
    public final boolean aZ(boolean z) {
        if (z) {
            this.d.v(2);
            aI();
            abyv abyvVarP = this.r.a.p();
            abzc abzcVar = abyvVarP.b;
            if (abzcVar != null && abyvVarP.f) {
                abzcVar.m();
            }
            abzh abzhVar = abyvVarP.c;
            if (abzhVar != null) {
                if (abzhVar.g) {
                    mbc mbcVar = abzhVar.d;
                    abzhVar.b(false, mbcVar.b());
                    abzhVar.h = true;
                    abzhVar.l(mbcVar.b());
                } else if (!abzhVar.h) {
                    abzhVar.h = true;
                }
            }
        } else {
            wiu wiuVarB = this.F.io();
            if (wiuVarB != null && wiuVarB.aO()) {
                return false;
            }
            this.d.v(3);
            aI();
            abyv abyvVarP2 = this.r.a.p();
            abzc abzcVar2 = abyvVarP2.b;
            if (abzcVar2 != null && abyvVarP2.f) {
                abzcVar2.s();
            }
            abzh abzhVar2 = abyvVarP2.c;
            if (abzhVar2 != null) {
                if (abzhVar2.g) {
                    mbc mbcVar2 = abzhVar2.d;
                    abzhVar2.b(false, mbcVar2.b());
                    abzhVar2.h = false;
                    abzhVar2.l(mbcVar2.b());
                } else if (abzhVar2.h) {
                    abzhVar2.h = false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.acey
    public final void aa(boolean z) {
        this.h.i = z;
    }

    @Override // defpackage.acey
    public final void ab() {
        acfs acfsVar = this.r;
        acfs acfsVar2 = this.o;
        if (acfsVar == acfsVar2) {
            acfsVar2.I(false);
        } else {
            this.B.w(new aaxl(acfsVar.E()), this.r.a);
            this.o.I(true);
        }
    }

    @Override // defpackage.acey
    public final boolean ac(abnl abnlVar, abnp abnpVar) {
        Map map;
        wjf wjfVarB;
        if (abnlVar != null && abnpVar != null && abnpVar.c && this.r != null) {
            acjb acjbVar = this.g;
            if (acjbVar.g() && (map = this.u) != null) {
                acjd acjdVarZ = acjbVar.z(this.r.E(), ((aciq) this.r.B()).f, Optional.of(new aciy(aciw.class, 1)));
                aciw aciwVar = acjdVarZ instanceof aciw ? (aciw) acjdVarZ : null;
                acfs acfsVar = aciwVar != null ? (acfs) map.get(aciwVar.h) : null;
                if (acfsVar != null && (wjfVarB = acfsVar.b()) != null && abnlVar.w().equals(wjfVarB.G())) {
                    acip acipVar = acfsVar.a;
                    acipVar.w().b = abnlVar;
                    acipVar.w().c = abnpVar;
                    bu(acfsVar, wjfVarB);
                    tyy tyyVarD = acipVar.d();
                    if (tyyVarD instanceof abmu) {
                        ((abmu) tyyVarD).a = abnpVar.b;
                    }
                    aV();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.acey
    public final boolean ad() {
        abob abobVar = this.s;
        return abobVar != null && abobVar.c(abob.b);
    }

    @Override // defpackage.acey
    public final boolean ae() {
        return false;
    }

    @Override // defpackage.acey
    public final boolean af() {
        return this.c.c.R();
    }

    @Override // defpackage.acey
    public final boolean ag() {
        return (this.h.i || this.s.c(abob.i)) ? false : true;
    }

    public final void ah() {
        if (!this.s.a(abob.f, abob.e) || this.o.b() == null) {
            return;
        }
        aE(abob.d);
    }

    @Override // defpackage.acey
    public final boolean ai() {
        if (this.s.b()) {
            return true;
        }
        return this.s.d() && this.c.E();
    }

    @Override // defpackage.acey, defpackage.acfl
    public final boolean aj() {
        return this.j.d(this) && this.c.E();
    }

    @Override // defpackage.acey
    public final boolean ak() {
        return this.s.h();
    }

    @Override // defpackage.acey
    public final boolean al() {
        return aO(abob.h, abob.i);
    }

    @Override // defpackage.acey
    public final boolean am() {
        if (abmt.ce(this.f)) {
            return this.c.i() == null;
        }
        return bH();
    }

    @Override // defpackage.acey
    public final boolean an() {
        return aawr.i(this.c, this.o.a.f()).a();
    }

    @Override // defpackage.acey
    public final boolean ao(long j, appa appaVar) {
        long jF;
        acjb acjbVar = this.g;
        if (acjbVar.g() && acjbVar.g) {
            jF = acjbVar.a(this.r.E(), this.r.a.w().f);
        } else {
            jF = this.k.aT(i()) ? f() : be();
        }
        return aq(jF + j, appaVar);
    }

    @Override // defpackage.acib
    public final void ap() {
        if (!this.k.as()) {
            this.B.i(x().au(), -1L, -1L);
        } else {
            zia ziaVarH = this.c.h(x().au());
            this.B.i(x().au(), ziaVarH.g, ziaVarH.h);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x023b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0251  */
    /* JADX WARN: Code duplicated, block: B:106:0x025d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0274  */
    /* JADX WARN: Code duplicated, block: B:109:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:110:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:114:0x0358  */
    /* JADX WARN: Code duplicated, block: B:116:0x035f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0364  */
    /* JADX WARN: Code duplicated, block: B:120:0x036c  */
    /* JADX WARN: Code duplicated, block: B:123:0x037f  */
    /* JADX WARN: Code duplicated, block: B:125:0x038d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0397  */
    /* JADX WARN: Code duplicated, block: B:129:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:132:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:134:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:136:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:138:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:139:0x0416  */
    /* JADX WARN: Code duplicated, block: B:140:0x043d  */
    /* JADX WARN: Code duplicated, block: B:142:0x0471  */
    /* JADX WARN: Code duplicated, block: B:143:0x0481  */
    /* JADX WARN: Code duplicated, block: B:146:0x049b  */
    /* JADX WARN: Code duplicated, block: B:147:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:148:0x04a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:150:0x04af  */
    /* JADX WARN: Code duplicated, block: B:152:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:36:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:47:0x0100  */
    /* JADX WARN: Code duplicated, block: B:49:0x010e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0117  */
    /* JADX WARN: Code duplicated, block: B:53:0x012d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0130  */
    /* JADX WARN: Code duplicated, block: B:56:0x0138  */
    /* JADX WARN: Code duplicated, block: B:65:0x015f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0175  */
    /* JADX WARN: Code duplicated, block: B:75:0x019d  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01be  */
    /* JADX WARN: Code duplicated, block: B:82:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01de  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:92:0x0202  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        defpackage.twu.c(4, "Attempting to seek during an ad or non-seekable video", null);
     */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x00c9, please report this as an issue */
    @Override // defpackage.acey
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean aq(long r46, defpackage.appa r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acfg.aq(long, appa):boolean");
    }

    @Override // defpackage.acey
    public final boolean ar(abob abobVar) {
        return this.s == abobVar;
    }

    @Override // defpackage.acey
    public final boolean as(abob abobVar) {
        return this.s.c(abobVar);
    }

    @Override // defpackage.acey
    public final acig at() {
        return this.o.a.u();
    }

    @Override // defpackage.acey
    public final void au(int i) {
        bZ(true, i);
        this.x = 1;
        aawr.l(x(), 4);
    }

    @Override // defpackage.acey
    public final void av(int i) {
        if (aM()) {
            this.c.H(i);
            bD();
        }
    }

    public final void aw(String str) {
        if (this.k.ad() && this.i && !this.y.g(str)) {
            aA(str);
        } else {
            aE(abob.j);
        }
    }

    @Override // defpackage.acey
    public final void ax(int i) {
        afvx afvxVarAd = tym.ad(tsa.LD_STOP);
        try {
            bZ(false, i);
            afvxVarAd.close();
        } catch (Throwable th) {
            try {
                afvxVarAd.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.acey
    public final void ay(acca accaVar) {
        this.c.J(accaVar);
    }

    @Override // defpackage.acey
    public final void az(boolean z) {
        m().w().n = z;
        if (!this.s.h()) {
            this.c.z(z);
        }
        m().aY().kk(new aayy(z));
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.acic
    public final void b() throws Throwable {
        boolean zO = aawr.o(m());
        boolean zN = aawr.n(m());
        vyo vyoVar = this.f;
        int i = 1;
        if (abmt.ai(vyoVar, zO, zN)) {
            acjd acjdVarC = this.g.c(this.r.E());
            if (acjdVarC instanceof aciw) {
                aciw aciwVar = (aciw) acjdVarC;
                aciw aciwVarG = aciwVar.g(f());
                if (aciwVarG != null) {
                    aciwVar = aciwVarG;
                }
                if (aciwVar.j == 1) {
                    this.p = null;
                    return;
                }
            }
        }
        acir acirVar = this.p;
        float fBa = ba(this.o);
        if (acirVar == null) {
            twu.c(4, "ContentVideoState is null but we're attempting to restore", null);
        } else {
            this.h.i = !acirVar.a;
            this.v = acirVar.b;
            this.o.a.w().f = acirVar.d;
            this.o.a.w().e = fBa;
            acfs acfsVar = this.q;
            if (acfsVar != null) {
                acip acipVar = acfsVar.a;
                bV(acipVar, null);
                acipVar.w().f = 0L;
            }
            this.d.f();
            this.o.a.p().o();
            boolean z = acirVar.c;
            if (!z) {
                this.o.a.p().e = acirVar.f;
            }
            acit acitVar = acirVar.g;
            if (acitVar != null) {
                ijt ijtVar = this.aa;
                acfh acfhVar = this.o.b;
                acih acihVar = new acih(z);
                for (acii aciiVar : ijtVar.a) {
                    Parcelable parcelable = (Parcelable) acitVar.a.get(aciiVar.getClass().toString());
                    if (parcelable != null) {
                        aciiVar.i(parcelable, acihVar);
                    }
                }
            }
        }
        abmt abmtVar = this.k;
        if (!abmtVar.ad()) {
            this.h.c();
        }
        this.p = null;
        acfs acfsVar2 = this.r;
        acfs acfsVar3 = this.o;
        if (acfsVar2 != acfsVar3) {
            aH(acfsVar3);
        }
        W();
        if (!abmt.ai(vyoVar, aawr.o(m()), aawr.n(m())) || !afxw.e(vyoVar).t) {
            aE(this.v ? abob.j : abob.g);
        } else if (!this.s.f()) {
            aE(abob.g);
        }
        if (!aN()) {
            this.x = 1;
            K();
            return;
        }
        if (this.v) {
            acjb acjbVar = this.g;
            if (acjbVar.g()) {
                Class<aciw> cls = aciw.class;
                if (!acjbVar.S(this.o.a.au(), Optional.of(new aciy(cls, i)))) {
                    acfs acfsVar4 = this.o;
                    acjc acjcVar = acjc.RESUME_INTERRUPTED_PLAYBACK;
                    acji acjiVarBm = bm(acfsVar4.a);
                    acjd acjdVarB = acjbVar.B(acfsVar4.E(), Optional.of(new aciy(cls, i)));
                    aciw aciwVar2 = acjdVarB instanceof aciw ? (aciw) acjdVarB : null;
                    if (aciwVar2 != null) {
                        if (!abmtVar.au()) {
                            bA(acjb.F(acjbVar, aciwVar2.h, 0L, Long.MAX_VALUE, false, abmtVar, this.w), true, false, acjcVar, acjiVarBm);
                            return;
                        }
                        List listV = acjb.V(acjbVar, aciwVar2.h, 0L, false, abmtVar, this.w);
                        G(0L);
                        aC(listV, true, false, acjcVar, acjiVarBm);
                        return;
                    }
                    return;
                }
            }
            wjf wjfVarF = this.o.a.f();
            if (wjfVarF != null) {
                bs(this.o.a.au(), wjfVarF);
            }
        }
    }

    @Override // defpackage.acey
    public final float c() {
        if (this.j.d(this)) {
            return this.c.c();
        }
        return 1.0f;
    }

    @Override // defpackage.acic
    public final void d() {
        if (this.s.h()) {
            ax(6);
            acfs acfsVar = this.q;
            if (acfsVar != null) {
                acip acipVar = acfsVar.a;
                acipVar.p().j(aawr.g(acipVar));
            }
            W();
            aH(this.o);
        }
    }

    @Override // defpackage.acey, defpackage.acic
    public final void e() {
        if (!abmt.ai(this.f, aawr.o(m()), aawr.n(m())) || this.r == this.o) {
            this.p = aU(false, false, false);
        }
        av(8);
        if (!this.k.ad()) {
            this.h.c();
        }
        aE(abob.d);
    }

    @Override // defpackage.acey
    public final long f() {
        if (aawr.n(m())) {
            return bf();
        }
        return this.s.h() ? u() : be();
    }

    @Override // defpackage.acey
    public final long g(long j) {
        if (!this.j.d(this)) {
            return -1L;
        }
        ytv ytvVar = this.c;
        taq.d();
        return ytvVar.c.j(j);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    @Override // defpackage.abyp, defpackage.acib
    public final void h(aboe aboeVar) {
        String str;
        ytv ytvVar = this.c;
        wgs wgsVarF = ytvVar.f();
        if (wgsVarF == null) {
            wgsVarF = ytvVar.e();
        }
        if (wgsVarF == null || !wgsVarF.W()) {
            int i = aboeVar.j;
            int i2 = i - 1;
            if (i2 == 2 || i2 == 16) {
                str = "stop";
            } else if (i2 != 6) {
                str = "net.retryexhausted";
                if (i2 != 7) {
                    if (i2 != 8) {
                        zvp.a(zvn.b, zvm.k, "Unexpected heartbeat response: ".concat(aawb.A(i)));
                    } else {
                        str = "stop";
                    }
                }
            } else {
                str = "servererror";
            }
            this.B.j(new zhz(zhw.g, str, ytvVar.h(this.r.E()).b, aboeVar.g), this.r.a);
            ax(i == 17 ? 45 : 41);
            aQ(aboeVar, 4);
        }
    }

    @Override // defpackage.acey
    public final wjf i() {
        return this.o.a.f();
    }

    @Override // defpackage.acey
    public final aboe j() {
        return m().w().o;
    }

    @Override // defpackage.acij
    public final void jO(String str, int i) {
        Optional optionalOfNullable = Optional.ofNullable((acfs) this.u.get(str));
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(((acfs) optionalOfNullable.get()).a);
        }
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(((acip) optionalOfNullable.get()).f());
        }
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(((wjf) optionalOfNullable.get()).G());
        }
        String str2 = (String) optionalOfNullable.orElse("");
        if (str == null) {
            throw new NullPointerException("Null cpn");
        }
        if (str2 == null) {
            throw new NullPointerException("Null videoId");
        }
        m().aH().kk(new aaws(str, str2, i, null));
    }

    @Override // defpackage.acic
    public final void jP(wjf wjfVar, String str) {
        this.p.getClass();
        this.o.a.p().o();
        this.x = 1;
        acfs acfsVarW = w(str);
        acip acipVar = acfsVarW.a;
        bV(acipVar, wjfVar);
        aawr.k(acipVar, this.k.j());
        afip.G(wjfVar, acipVar);
        this.B.n(this.o.a.au());
        bx(acfsVarW);
    }

    @Override // defpackage.acij
    public final void jQ(Duration duration) throws Throwable {
        aq(duration.toMillis(), appa.SEEK_SOURCE_AUTOMATIC_REPLAY_ACTION);
    }

    @Override // defpackage.acey
    public final acfw k() {
        return this.o.b;
    }

    @Override // defpackage.acey
    public final acfw l() {
        return bk(this.s);
    }

    @Override // defpackage.acey
    public final acip m() {
        acip acipVar;
        return (!this.i || (acipVar = this.y.d) == null) ? this.o.a : acipVar;
    }

    @Override // defpackage.acey
    public final acis n(int i) {
        String strAu;
        wjf wjfVar;
        String strAu2;
        boolean z = i == 0;
        acir acirVar = null;
        if (!z) {
            strAu = this.o.a.au();
        } else {
            if (this.s.h()) {
                return null;
            }
            strAu = null;
        }
        acfs acfsVar = this.q;
        if (z || this.p != null || acfsVar == null) {
            wjfVar = null;
            strAu2 = null;
        } else {
            acip acipVar = acfsVar.a;
            wjf wjfVarF = acipVar.f();
            strAu2 = acipVar.au();
            wjfVar = wjfVarF;
        }
        aboi aboiVar = this.U;
        boolean z2 = aboiVar.m() ? !aboiVar.n() : false;
        boolean z3 = i != 1;
        acir acirVarAU = aU(z, z3, false);
        acfs acfsVar2 = this.q;
        if (this.p != null && acfsVar2 != null) {
            boolean z4 = !z3 && bM();
            long jU = u();
            acip acipVar2 = acfsVar2.a;
            acirVar = new acir(z4, false, z, jU, acipVar2.p().a(), this.aa.k(), acipVar2.au());
        }
        return new acis(acirVarAU, acirVar, this.o.a.f(), this.o.a.n(), z2, wjfVar, strAu2, u(), strAu, ba(this.o), !z && this.O);
    }

    @Override // defpackage.acey
    public final acjb o() {
        return this.g;
    }

    @Override // defpackage.acey
    public final String p() {
        return this.o.a.au();
    }

    @Override // defpackage.acey
    public final String q() {
        wjf wjfVarF = m().f();
        if (wjfVarF != null) {
            return wjfVarF.G();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.abyp, defpackage.acib
    public final void r(aony aonyVar) {
        String strE = this.o.E();
        Iterator it = this.B.d.iterator();
        while (it.hasNext()) {
            ((acii) it.next()).r(aonyVar, strE);
        }
    }

    @Override // defpackage.acey
    public final void s() {
        String strE = this.o.E();
        acjb acjbVar = this.g;
        Iterable$EL.forEach(acjbVar.C(strE), new acfb(this, 0));
        acjbVar.e(false, acjc.REMOVE_QUEUED_SEGMENTS);
    }

    @Override // defpackage.acey
    public final void t() {
        this.c.k();
    }

    final long u() {
        acip acipVarY = y();
        if (!this.s.h() || acipVarY == null) {
            return 0L;
        }
        return aN() ? aawr.g(acipVarY) : aawr.h(this.c, acipVarY.au());
    }

    public final acfs v(String str, int i, abnl abnlVar, abnp abnpVar, boolean z) {
        zh zhVar = new zh((byte[]) null, (char[]) null);
        if (abnlVar != null) {
            zhVar.m(abnlVar.w());
        }
        ytv ytvVar = this.c;
        acfr acfrVar = this.h;
        afip afipVar = this.B;
        abnc abncVar = this.d;
        acfi acfiVar = this.G;
        abog abogVar = this.E;
        acfh acfhVar = new acfh(this);
        mbc mbcVar = this.b;
        acio acioVar = this.I;
        acioVar.d(str);
        acioVar.i(abnlVar);
        acioVar.j(abnpVar);
        acioVar.m(i);
        acioVar.k(this.g);
        acioVar.e(this);
        acioVar.f(z);
        acioVar.g(abnpVar != null ? abnpVar.b : null);
        acioVar.l(this.M.b(zhVar.l()));
        acioVar.h(this);
        acioVar.n(new ahhp(this, str));
        acip acipVarA = acioVar.a();
        abvy abvyVar = this.y;
        acfs acfsVar = new acfs(ytvVar, acfrVar, afipVar, abncVar, acfiVar, abogVar, acfhVar, mbcVar, acipVarA, abvyVar, new avgj(this), this.k, this.V, this.f, this.R, this.ab);
        acip acipVar = acfsVar.a;
        acipVar.p().a.i = this;
        afipVar.q(acipVar);
        if (this.i) {
            abvyVar.b(acipVar);
        }
        if (i != 0) {
            this.u.put(str, acfsVar);
        }
        return acfsVar;
    }

    public final acfs w(String str) {
        acfg acfgVar;
        acfs acfsVar = this.q;
        if (acfsVar == null || !TextUtils.equals(acfsVar.E(), str)) {
            acfsVar = (acfs) this.u.get(str);
            if (acfsVar == null) {
                acfs acfsVarV = v(str, 1, null, null, false);
                acfgVar = this;
                acfsVar = acfsVarV;
            } else {
                acfgVar = this;
            }
            acfgVar.q = acfsVar;
        }
        return acfsVar;
    }

    final acip x() {
        acip acipVar;
        return (!this.i || (acipVar = this.y.c) == null) ? this.r.a : acipVar;
    }

    final acip y() {
        acfs acfsVar = this.q;
        if (acfsVar != null) {
            return acfsVar.a;
        }
        return null;
    }

    @Override // defpackage.acey
    public final void z(wjf wjfVar, wjf wjfVar2) {
        if (!ad()) {
            throw new IllegalStateException("loadVideo() called on LocalDirector in wrong state");
        }
        bV(this.o.a, wjfVar);
        aE(abob.c);
        this.o.a.u().d(true);
        acfs acfsVarV = v(this.e.a(), 3, null, null, false);
        bV(acfsVarV.a, wjfVar2);
        bq(acfsVarV, null);
    }
}

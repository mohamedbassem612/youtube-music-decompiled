package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.reel.internal.pager.ReelLinearLayoutManager;
import com.google.android.libraries.youtube.reel.internal.pager.ReelRecyclerView;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import j$.util.concurrent.atomic.DesugarAtomicInteger;
import j$.util.function.IntUnaryOperator$CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.IntUnaryOperator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acqz {
    private static final agrf ay = agrf.h("com/google/android/libraries/youtube/reel/internal/pager/ReelPageController");
    public acqb A;
    public acvq B;
    public abhe C;
    public boolean D;
    public boolean H;
    public long W;
    public final szs Y;
    public final aclm a;
    private final Executor aA;
    private final abvk aB;
    private final acpo aH;
    private final abur aI;
    private final avju aJ;
    private final adz aK;
    private final adyc aL;
    private final qcb aN;
    public final acsv aa;
    public final acul ab;
    public final aeqq ac;
    public final aerv ad;
    public final awmd ae;
    public trt af;
    public acqh ag;
    public acqi ah;
    public acnb an;
    public final vxz ao;
    public final vxz ap;
    public final ijt aq;
    public final acud as;
    public final hno at;
    public final adif au;
    public final ahub av;
    public final qcb ax;
    private final acpc az;
    public final acrn b;
    public final agfr c;
    public final acrc d;
    public final actw e;
    public final actm f;
    public final acts g;
    public final tqj h;
    public final mbc i;
    public final ahey j;
    public final abvx k;
    public final xgm l;
    public final aeqw q;
    public final avmm r;
    public final awli t;
    public final awli u;
    public final awli v;
    public final awli w;
    public acqx x;
    public ReelRecyclerView y;
    public ReelLinearLayoutManager z;
    public final AtomicInteger m = new AtomicInteger(-1);
    public final AtomicInteger n = new AtomicInteger(-1);
    public final List o = new ArrayList();
    public final Set p = new HashSet();
    public boolean s = true;
    public Optional E = Optional.empty();
    public Optional F = Optional.empty();
    public int G = 0;
    public boolean I = false;
    public long J = -1;
    private long aC = -1;
    public long K = -1;
    public long L = -1;
    private int aD = 0;
    public long M = Long.MIN_VALUE;
    public long N = Long.MIN_VALUE;
    private long aE = Long.MIN_VALUE;
    public boolean O = false;
    public boolean P = true;
    public int Q = -1;
    public int R = -1;
    private int aF = 0;
    public int S = 0;
    public acqy T = new acqy(0, false);
    public Optional U = Optional.empty();
    public boolean V = false;
    private boolean aG = true;
    public final AtomicBoolean X = new AtomicBoolean(false);
    public boolean ai = false;
    public boolean aj = true;
    public final awlo al = new awlo();
    public final qa ar = new acqo(this);
    public final avgj aw = new avgj(this);
    public boolean am = false;
    public final boolean ak = true;
    public final boolean Z = true;
    private final adif aM = new adif((byte[]) null, (byte[]) null);

    public acqz(hno hnoVar, agfr agfrVar, abvk abvkVar, abvx abvxVar, abur aburVar, actw actwVar, acrc acrcVar, actm actmVar, acpc acpcVar, acud acudVar, qcb qcbVar, acud acudVar2, adz adzVar, aclm aclmVar, adyc adycVar, qcb qcbVar2, acts actsVar, xgm xgmVar, ahey aheyVar, Executor executor, tqj tqjVar, mbc mbcVar, ijt ijtVar, vwt vwtVar, vxz vxzVar, vxz vxzVar2, aeqw aeqwVar, ahub ahubVar, adif adifVar, acsv acsvVar, aeqq aeqqVar, acpo acpoVar, adif adifVar2, aerv aervVar, awmd awmdVar, acul aculVar) {
        this.W = 0L;
        this.aJ = new avju(actwVar);
        this.at = hnoVar;
        this.c = agfrVar;
        this.aB = abvkVar;
        this.k = abvxVar;
        this.aI = aburVar;
        this.e = actwVar;
        this.f = actmVar;
        this.az = acpcVar;
        this.d = acrcVar;
        this.as = acudVar;
        this.ax = qcbVar;
        this.aK = adzVar;
        this.a = aclmVar;
        this.aL = adycVar;
        this.aN = qcbVar2;
        this.g = actsVar;
        this.au = adifVar2;
        ((acuw) acudVar2.f.io()).getClass();
        acrq acrqVar = (acrq) acudVar2.c.io();
        acrqVar.getClass();
        awmd awmdVar2 = acudVar2.k;
        mbc mbcVar2 = (mbc) acudVar2.o.io();
        mbcVar2.getClass();
        Executor executor2 = (Executor) acudVar2.i.io();
        executor2.getClass();
        Executor executor3 = (Executor) acudVar2.m.io();
        executor3.getClass();
        ((vxz) acudVar2.l.io()).getClass();
        hno hnoVar2 = (hno) acudVar2.d.io();
        hnoVar2.getClass();
        zvl zvlVar = (zvl) acudVar2.a.io();
        zvlVar.getClass();
        ttm ttmVar = (ttm) acudVar2.p.io();
        ttmVar.getClass();
        xgm xgmVar2 = (xgm) acudVar2.b.io();
        xgmVar2.getClass();
        tqj tqjVar2 = (tqj) acudVar2.h.io();
        tqjVar2.getClass();
        actk actkVar = (actk) acudVar2.g.io();
        actkVar.getClass();
        vxe vxeVar = (vxe) acudVar2.n.io();
        vxeVar.getClass();
        ((ci) acudVar2.j.io()).getClass();
        adif adifVar3 = (adif) acudVar2.e.io();
        aesp aespVar = (aesp) acudVar2.q.io();
        aespVar.getClass();
        this.b = new acrn(acrqVar, awmdVar2, mbcVar2, executor2, executor3, hnoVar2, zvlVar, ttmVar, xgmVar2, tqjVar2, actkVar, vxeVar, adifVar3, aespVar, this);
        this.j = aheyVar;
        this.aA = executor;
        this.Y = new szs(aheyVar);
        this.h = tqjVar;
        this.l = xgmVar;
        this.i = mbcVar;
        this.aq = ijtVar;
        this.ao = vxzVar;
        this.ap = vxzVar2;
        this.q = aeqwVar;
        this.aa = acsvVar;
        this.ab = aculVar;
        acsvVar.d = this;
        this.r = new avmm();
        this.t = new awli(Optional.empty());
        this.u = new awli(Optional.empty());
        this.v = new awli(Optional.empty());
        awli awliVar = new awli(Optional.empty());
        this.w = awliVar;
        awliVar.K(new acpr(this, 5));
        this.av = ahubVar;
        int iC = (int) ((vxz) hnoVar.k).c(4, 45685669L, 3L);
        this.W = iC <= 0 ? 2 : iC;
        this.aH = acpoVar;
        this.ac = aeqqVar;
        this.ad = aervVar;
        this.ae = awmdVar;
        vwtVar.F(new acnd(this, 17));
        vwtVar.D(new acnd(this, 18));
        if (hnoVar.aZ()) {
            vwtVar.D(new aalq(this, adifVar, 10));
        }
    }

    private static int X(int i, boolean z, boolean z2) {
        if (i == 1) {
            return !z ? 37417 : 37416;
        }
        if (i == 2 || i == 3) {
            return 58160;
        }
        if (z2) {
            return !z ? 56922 : 56921;
        }
        return !z ? 296497 : 296496;
    }

    private final abuj Y() {
        return this.at.i() >= 2 ? abuj.d : abuj.b;
    }

    public final void A(int i, abnl abnlVar) {
        acqh acqhVar = this.ag;
        if (acqhVar == null || i < 0 || i >= acqhVar.D()) {
            return;
        }
        long jE = acqhVar.E(i);
        this.M = jE;
        this.Q = i;
        this.y.ab(i);
        agke agkeVarM = acqhVar.M(jE, abnlVar);
        if (agkeVarM.isEmpty()) {
            String str = "ReelPageController cannot initialize Sequencer due to empty sequence list. ReelDataList size=" + acqhVar.D();
            this.g.f(18, str);
            ((agrc) ((agrc) ay.b()).k("com/google/android/libraries/youtube/reel/internal/pager/ReelPageController", "selectInitialPage", 4061, "ReelPageController.java")).w("%s", str);
            return;
        }
        int i2 = this.Q;
        if (i2 < 0 || i2 >= agkeVarM.size()) {
            String str2 = "ReelPageController cannot initialize Sequencer due to invalid index. Index=" + i2 + ", sequence size=" + agkeVarM.size();
            this.g.f(18, str2);
            ((agrc) ((agrc) ay.b()).k("com/google/android/libraries/youtube/reel/internal/pager/ReelPageController", "selectInitialPage", 4075, "ReelPageController.java")).w("%s", str2);
            return;
        }
        abuj abujVarY = Y();
        abui abuiVarT = abuk.t();
        abuiVarT.b = abujVarY;
        abuk abukVarA = abuiVarT.a();
        zj zjVarT = abuc.t();
        zjVarT.h(i2);
        zjVarT.a = abtz.NONE;
        this.aI.c(agkeVarM, abukVarA, zjVarT.f());
    }

    public final void B(long j, abnl abnlVar) {
        acqh acqhVar;
        acqh acqhVar2;
        if (this.at.T()) {
            if (j == Long.MIN_VALUE || (acqhVar2 = this.ag) == null) {
                return;
            }
            A(acqhVar2.A(j), abnlVar);
            return;
        }
        if (j == Long.MIN_VALUE || (acqhVar = this.ag) == null) {
            return;
        }
        int iA = acqhVar.A(j);
        this.M = j;
        if (iA >= 0) {
            this.Q = iA;
            this.y.ab(iA);
            acqh acqhVar3 = this.ag;
            agke agkeVarM = acqhVar3 == null ? agpi.a : acqhVar3.M(j, abnlVar);
            if (agkeVarM.isEmpty()) {
                acqh acqhVar4 = this.ag;
                int iD = acqhVar4 == null ? 0 : acqhVar4.D();
                acts actsVar = this.g;
                String strBR = a.bR(iD, "ReelPageController cannot initialize Sequencer due to empty sequence list. ReelDataList size=");
                actsVar.f(18, strBR);
                ((agrc) ((agrc) ay.b()).k("com/google/android/libraries/youtube/reel/internal/pager/ReelPageController", "selectInitialPage", 4130, "ReelPageController.java")).w("%s", strBR);
                return;
            }
            int i = this.Q;
            if (i < 0 || i >= agkeVarM.size()) {
                String str = "ReelPageController cannot initialize Sequencer due to invalid index. Index=" + i + ", sequence size=" + agkeVarM.size();
                this.g.f(18, str);
                ((agrc) ((agrc) ay.b()).k("com/google/android/libraries/youtube/reel/internal/pager/ReelPageController", "selectInitialPage", 4144, "ReelPageController.java")).w("%s", str);
                return;
            }
            abuj abujVarY = Y();
            abui abuiVarT = abuk.t();
            abuiVarT.b = abujVarY;
            abuk abukVarA = abuiVarT.a();
            zj zjVarT = abuc.t();
            zjVarT.h(i);
            zjVarT.a = abtz.NONE;
            this.aI.c(agkeVarM, abukVarA, zjVarT.f());
        }
    }

    public final void C(int i) {
        int i2;
        if (((vxz) this.at.i).l(236, 45792817L, false) && !this.am && i != 0 && i != 1 && (i2 = this.Q) != -1 && i != -1 && Math.abs(i - i2) > 1) {
            this.g.d(9, "desiredAdapterPosition jumped by more than 1. Previous position: " + this.Q + ", New position: " + i);
        }
        this.Q = i;
    }

    public final void D(int i) {
        Object obj = this.B;
        if (obj != null) {
            ((View) obj).setScrollX(i);
            ViewGroup viewGroupA = this.B.a();
            if (viewGroupA != null) {
                viewGroupA.setScrollX(i);
            }
        }
    }

    public final void E(int i) {
        Object obj = this.B;
        if (obj != null) {
            ((View) obj).setScrollY(i);
            ViewGroup viewGroupA = this.B.a();
            if (viewGroupA != null) {
                viewGroupA.setScrollY(i);
            }
        }
    }

    public final void F() {
        acnb acnbVar;
        if (!this.ap.l(21, 45411909L, false) || (acnbVar = this.an) == null) {
            return;
        }
        SwipeRefreshLayout swipeRefreshLayout = acnbVar.a;
        if (swipeRefreshLayout.isEnabled() != acnbVar.d()) {
            swipeRefreshLayout.setEnabled(acnbVar.d());
            if (acnbVar.d()) {
                acnbVar.c.hB().l(acnbVar.i);
            }
        }
    }

    public final void G(apfp apfpVar) {
        acvu acvuVarB;
        if (apfpVar != null) {
            Optional optionalJ = j();
            if (true == optionalJ.isPresent()) {
                optionalJ = Optional.ofNullable(((acra) optionalJ.get()).i);
            }
            if (true == optionalJ.isPresent()) {
                optionalJ = Optional.ofNullable(((acrp) optionalJ.get()).H());
            }
            if (true == optionalJ.isPresent()) {
                optionalJ = Optional.ofNullable(((acvv) optionalJ.get()).b());
            }
            if (optionalJ.isPresent()) {
                return;
            }
            Optional optionalJ2 = j();
            if (true == optionalJ2.isPresent()) {
                optionalJ2 = Optional.ofNullable(((acra) optionalJ2.get()).i);
            }
            if (true == optionalJ2.isPresent() && true != ((acrp) optionalJ2.get()).F()) {
                optionalJ2 = Optional.empty();
            }
            if (true == optionalJ2.isPresent()) {
                optionalJ2 = Optional.ofNullable(null);
            }
            if (!optionalJ2.isPresent() || (acvuVarB = ((acpp) optionalJ2.get()).b()) == null) {
                return;
            }
            this.B.i(acvuVarB);
        }
    }

    protected final void H(acqy acqyVar, int i, boolean z) {
        if (((vxz) this.at.i).l(203, 45763446L, false) && z) {
            this.j.execute(afwl.i(new qd(this, acqyVar, i, 17)));
        } else {
            I(acqyVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [avmn, java.lang.Object] */
    public final void I(acqy acqyVar, int i) {
        boolean z;
        acrp acrpVar;
        int i2 = this.Q;
        if (i2 < 0) {
            String str = "ReelPageController cannot update sequence index due to invalid value. Index=" + i2 + ", sequence size=" + this.aI.a.size();
            this.g.f(17, str);
            ((agrc) ((agrc) ay.b()).k("com/google/android/libraries/youtube/reel/internal/pager/ReelPageController", "updateSequencerIndexImpl", 3606, "ReelPageController.java")).w("%s", str);
            return;
        }
        int i3 = acqyVar.a;
        hno hnoVar = this.at;
        boolean z2 = false;
        if (hnoVar.m() && this.am && i3 == 1) {
            abur aburVar = this.aI;
            if (aburVar != null && i2 < aburVar.a.size()) {
                ArrayList arrayList = new ArrayList(aburVar.a);
                abun abunVar = (abun) arrayList.get(i2);
                if (abunVar instanceof abuu) {
                    abuu abuuVar = (abuu) abunVar;
                    abnk abnkVarF = abuuVar.a.f();
                    abnkVarF.b = false;
                    abnkVarF.c = false;
                    abnl abnlVarA = abnkVarF.a();
                    abut abutVarI = abuu.i(abuuVar);
                    abutVarI.b(abnlVarA);
                    arrayList.set(i2, abutVarI.a());
                    zj zjVarT = abuc.t();
                    zjVarT.h(i2);
                    zjVarT.a = abtz.NONE;
                    abuc abucVarF = zjVarT.f();
                    abui abuiVarT = abuk.t();
                    abuiVarT.b = Y();
                    aburVar.c(arrayList, abuiVarT.a(), abucVarF);
                    aciz acizVarJ = this.au.j();
                    acizVarJ.k(15);
                    acizVarJ.g();
                }
            }
            i3 = 1;
        }
        if (i3 == 2) {
            z = true;
        } else if (i3 == 3) {
            i3 = 3;
            z = true;
        } else {
            z = false;
        }
        abtz abtzVar = z ? abtz.AUTOPLAY : abtz.JUMP;
        boolean z3 = i > 0;
        if (z && hnoVar.w()) {
            z2 = true;
        }
        if (hnoVar.aI() && !z2) {
            abtzVar = z3 ? abtz.NEXT : abtz.PREV;
        }
        int iX = X(i3, z3, this.ak);
        Object obj = acqyVar.c;
        acus acusVar = new acus(this.l, iX, this.aa, hnoVar);
        zj zjVarT2 = abuc.t();
        zjVarT2.a = abtzVar;
        zjVarT2.h(i2);
        zjVarT2.c = acusVar;
        abuc abucVarF2 = zjVarT2.f();
        acqh acqhVar = this.ag;
        if (acqhVar != null) {
            actm actmVar = this.f;
            actmVar.f("r_sgs");
            abul abulVar = abucVarF2.a;
            abur aburVar2 = this.aI;
            if (aburVar2.a.size() != acqhVar.D()) {
                agke agkeVarM = acqhVar.M(Long.MIN_VALUE, null);
                if (abulVar.b < agkeVarM.size()) {
                    abuj abujVarY = Y();
                    abui abuiVarT2 = abuk.t();
                    abuiVarT2.b = abujVarY;
                    aburVar2.c(agkeVarM, abuiVarT2.a(), abucVarF2);
                }
            } else if (abulVar.b < aburVar2.a.size()) {
                aburVar2.d(abucVarF2);
            }
            actmVar.f("r_sge");
        }
        acra acraVar = (acra) j().orElse(null);
        if (acraVar == null || (acrpVar = acraVar.i) == null || !acrpVar.F()) {
            return;
        }
        avju avjuVar = this.aJ;
        if (((Optional) avjuVar.c).isPresent() && !((Optional) avjuVar.c).get().f()) {
            avnr.b((AtomicReference) ((Optional) avjuVar.c).get());
        }
        if (!aecm.ag(acraVar.c()) || acraVar.h != null) {
            this.aB.A();
        } else {
            avjuVar.b = ((actw) avjuVar.a).d();
            avjuVar.c = Optional.of(acraVar.d().af(new acpf(avjuVar, 6)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    public final void J(boolean z) {
        boolean z2;
        abur aburVar = this.aI;
        if (aburVar != null) {
            agke agkeVar = aburVar.a;
            ArrayList arrayList = new ArrayList();
            int size = agkeVar.size();
            for (int i = 0; i < size; i++) {
                abun abunVar = (abun) agkeVar.get(i);
                if (abunVar instanceof abuu) {
                    abuu abuuVar = (abuu) abunVar;
                    abnl abnlVar = abuuVar.a;
                    if (z) {
                        apfp apfpVarZ = aecm.Z(abnlVar);
                        if (apfpVarZ != null) {
                            apdw apdwVarA = apdw.a(apfpVarZ.Y);
                            if (apdwVarA == null) {
                                apdwVarA = apdw.REEL_LOOP_BEHAVIOR_UNKNOWN;
                            }
                            if (apdwVarA == apdw.REEL_LOOP_BEHAVIOR_AUTO_ADVANCE) {
                                z2 = z;
                            }
                        }
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    abnk abnkVarF = abnlVar.f();
                    abnkVarF.b = z2;
                    abnkVarF.c = z2;
                    abnl abnlVarA = abnkVarF.a();
                    abut abutVarI = abuu.i(abuuVar);
                    abutVarI.b(abnlVarA);
                    arrayList.add(abutVarI.a());
                } else {
                    arrayList.add(abunVar);
                }
            }
            int i2 = this.Q;
            if (i2 < 0 || i2 >= arrayList.size()) {
                return;
            }
            zj zjVarT = abuc.t();
            zjVarT.h(i2);
            zjVarT.a = abtz.NONE;
            abuc abucVarF = zjVarT.f();
            abui abuiVarT = abuk.t();
            abuiVarT.b = Y();
            aburVar.c(arrayList, abuiVarT.a(), abucVarF);
            aciz acizVarJ = this.au.j();
            acizVarJ.k(15);
            acizVarJ.g();
        }
    }

    public final boolean K() {
        return this.b.j();
    }

    public final boolean L() {
        boolean zA;
        acrn acrnVar = this.b;
        synchronized (acrnVar.g) {
            zA = acrnVar.h.a();
        }
        return zA;
    }

    public final boolean M() {
        acqh acqhVar;
        int i = tqr.a;
        return this.h.l(1074025686, 4) && (acqhVar = this.ag) != null && acqhVar.D() == 0;
    }

    public final boolean N() {
        acqh acqhVar = this.ag;
        return acqhVar == null || acqhVar.B() == this.Q;
    }

    public final boolean O() {
        acqh acqhVar = this.ag;
        return acqhVar == null || acqhVar.C() == this.Q;
    }

    public final boolean P() {
        boolean z;
        acrn acrnVar = this.b;
        synchronized (acrnVar.g) {
            z = acrnVar.j.a;
        }
        return z;
    }

    public final boolean Q() {
        acqh acqhVar = this.ag;
        if (acqhVar == null) {
            return false;
        }
        return acqhVar.j;
    }

    public final boolean R(alvt alvtVar, long j) {
        Optional optionalK = k(j);
        if (optionalK.isEmpty()) {
            return false;
        }
        acra acraVar = (acra) optionalK.get();
        if (((vxz) this.at.i).l(228, 45782878L, false) && aecm.az(acraVar.f)) {
            return false;
        }
        alvl alvlVar = alvtVar.f;
        if (alvlVar == null) {
            alvlVar = alvl.a;
        }
        aony aonyVarA = aony.a(alvlVar.c);
        if (aonyVarA == null) {
            aonyVarA = aony.OK;
        }
        if (aonyVarA != aony.UNPLAYABLE || !acraVar.c().Q || acraVar.m || this.G != 0) {
            return false;
        }
        if (this.y.au()) {
            this.j.execute(new laz(this, alvtVar, j, 17));
            return false;
        }
        long jC = c();
        acqh acqhVar = this.ag;
        if (acqhVar == null) {
            return false;
        }
        p(acqj.b);
        acqhVar.Y(j, 10);
        int iA = acqhVar.A(jC);
        if (iA != -1) {
            this.Q = iA;
        }
        return true;
    }

    public final boolean S(ajwo ajwoVar) {
        hno hnoVar = this.at;
        return ((vxz) hnoVar.i).l(299, 45838482L, false) && hnoVar.ag() && aecm.az(ajwoVar);
    }

    public final boolean T() {
        return !this.ap.l(18, 45409781L, false);
    }

    public final Set U(int i, int i2, int i3) {
        acqh acqhVar = this.ag;
        if (acqhVar == null) {
            return null;
        }
        p(acqj.b);
        return acqhVar.X(i, i2, i3);
    }

    public final void V(List list, List list2, int i) {
        int size;
        List list3;
        acqh acqhVar = this.ag;
        if (acqhVar != null) {
            list.size();
            apgj apgjVarQ = acqhVar.Q(list);
            if (list2 != null) {
                ahno.O(list.size() == list2.size());
            }
            if (!list.isEmpty()) {
                List listR = acqhVar.R(list);
                synchronized (acqhVar.e) {
                    size = acqhVar.f.size();
                    long j = size == 0 ? -1L : ((acra) acqhVar.f.get(size - 1)).b;
                    long jB = acqhVar.k.b();
                    long jG = j;
                    int i2 = 0;
                    while (i2 < listR.size()) {
                        ajwo ajwoVar = (ajwo) listR.get(i2);
                        ahno.O(aecm.aD(ajwoVar));
                        if (aecm.ae(ajwoVar) && acqhVar.g.ak) {
                            list3 = list2;
                            jG = acqhVar.F(ajwoVar, list3, i2, jB, jG);
                        } else {
                            list3 = list2;
                            jG = acqhVar.G(ajwoVar, list3, i2, jB, jG);
                        }
                        i2++;
                        list2 = list3;
                    }
                }
                acqhVar.l(size, listR.size());
                acqhVar.U();
            }
            aciz acizVarJ = acqhVar.o.j();
            acizVarJ.k(i);
            acizVarJ.h(adif.f(aawo.i(list), apgjVarQ));
            acizVarJ.g();
            this.al.kk(new acvk(agke.n(list)));
            u(list);
            acqx acqxVar = this.x;
            if (acqxVar != null) {
                acqxVar.j();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void W(List list, alqi alqiVar, int i, boolean z) {
        acsv acsvVar;
        int iC;
        hno hnoVar = this.at;
        vxz vxzVar = (vxz) hnoVar.k;
        byte[] bArr = null;
        if (vxzVar.l(77, 45839081L, false)) {
            ?? r0 = this.aM.a;
            if (!r0.isEmpty()) {
                acqh acqhVar = this.ag;
                if (acqhVar != null && (iC = acqhVar.C()) != -1) {
                    acqhVar.L(iC);
                }
                list.getClass();
                Iterator it = r0.iterator();
                if (it.hasNext()) {
                    ((acro) it.next()).a();
                    throw null;
                }
            }
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            alqj alqjVar = (alqj) it2.next();
            if ((alqjVar.b & 1) != 0) {
                ajwo ajwoVar = alqjVar.c;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                if (aecm.aD(ajwoVar)) {
                    ajwo ajwoVar2 = alqjVar.c;
                    if (ajwoVar2 == null) {
                        ajwoVar2 = ajwo.a;
                    }
                    arrayList.add(aecm.U(ajwoVar2));
                    arrayList2.add(alqjVar.d.E() ? Optional.empty() : Optional.of(alqjVar.d));
                }
            }
        }
        if (hnoVar.aS()) {
            this.a.d(arrayList, alqiVar);
        }
        if (z && hnoVar.aJ()) {
            if (arrayList.isEmpty() || !aecm.af((ajwo) arrayList.get(0))) {
                this.ab.b();
            } else {
                ajwo ajwoVar3 = (ajwo) arrayList.get(0);
                mbc mbcVar = this.i;
                acul aculVar = this.ab;
                ListenableFuture listenableFutureAp = ahno.ap(new acql(this, ajwoVar3, mbcVar.b(), 0), this.aA);
                zyz zyzVar = (zyz) aculVar.a.get();
                if (zyzVar != null) {
                    ahno.at(listenableFutureAp, new acuk(zyzVar), MoreExecutors.directExecutor());
                }
            }
        }
        V(arrayList, arrayList2, i);
        if (z && vxzVar.l(73, 45818271L, false) && (acsvVar = this.aa) != null) {
            this.aA.execute(afwl.i(new acnp(arrayList, acsvVar, 5, bArr)));
        }
        if ((!z || !((vxz) hnoVar.m).l(110, 45824708L, false)) && ((vxz) hnoVar.i).l(81, 45639560L, false) && this.s) {
            this.s = false;
            ReelRecyclerView reelRecyclerView = this.y;
            if (reelRecyclerView != null && reelRecyclerView.q) {
                reelRecyclerView.scrollBy(0, 1);
                this.y.scrollBy(0, -1);
            }
        }
        if (hnoVar.aS()) {
            return;
        }
        this.a.d(arrayList, alqiVar);
    }

    public final int a(long j) {
        acqh acqhVar = this.ag;
        if (acqhVar != null) {
            return acqhVar.A(j);
        }
        return -1;
    }

    public final long b(ajwo ajwoVar) {
        acqh acqhVar;
        acra acraVarI;
        if (!aecm.aD(ajwoVar) || (acqhVar = this.ag) == null) {
            return Long.MIN_VALUE;
        }
        int i = this.Q;
        if (ajwoVar == null || !aecm.aD(ajwoVar) || (acraVarI = acqhVar.I(ajwoVar, i)) == null) {
            return Long.MIN_VALUE;
        }
        return (acqhVar.n.aP() && acqhVar.g.ak) ? acraVarI.q : acraVarI.b;
    }

    public final long c() {
        acqh acqhVar;
        int i = this.Q;
        if (i == -1 || (acqhVar = this.ag) == null) {
            return Long.MIN_VALUE;
        }
        return acqhVar.E(i);
    }

    public final long d(int i) {
        acqh acqhVar = this.ag;
        if (acqhVar != null) {
            return acqhVar.E(i);
        }
        return Long.MIN_VALUE;
    }

    public final acqq e() {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        if (this.ag != null) {
            hno hnoVar = this.at;
            int iMax = hnoVar.Q() ? Math.max(0, this.Q - hnoVar.d()) : 0;
            for (int i = 0; i < iMax; i++) {
                acra acraVarL = this.ag.L(i);
                if (acraVarL != null) {
                    hashSet.add(acraVarL.e());
                }
            }
            boolean zQ = Q();
            acqh acqhVar = this.ag;
            if (zQ) {
                int iD = acqhVar.D();
                while (iMax < iD) {
                    acra acraVarL2 = this.ag.L(iMax);
                    if (acraVarL2 != null) {
                        arrayList.add(g(acraVarL2));
                    }
                    iMax++;
                }
            } else {
                acqhVar.S(new acnq(this, arrayList, 3));
            }
        }
        return new acqq(arrayList, agkz.n(hashSet));
    }

    public final acra f(ajwo ajwoVar) {
        acqh acqhVar = this.ag;
        if (acqhVar == null) {
            return null;
        }
        return acqhVar.I(ajwoVar, this.Q);
    }

    public final ajwo g(acra acraVar) {
        ajwo ajwoVar = acraVar.f;
        if (!this.at.ai() || ajwoVar == null) {
            return ajwoVar;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            return ajwoVar;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        if (((apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).i != 44) {
            return ajwoVar;
        }
        aihh aihhVar = (aihh) ajwoVar.toBuilder();
        aihl aihlVar = apfp.b;
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite3);
        Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
        aihh aihhVar2 = (aihh) ((apfp) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).toBuilder();
        aihhVar2.copyOnWrite();
        apfp apfpVar = (apfp) aihhVar2.instance;
        if (apfpVar.i == 44) {
            apfpVar.i = 0;
            apfpVar.k = null;
        }
        aihhVar.e(aihlVar, (apfp) aihhVar2.build());
        return (ajwo) aihhVar.build();
    }

    public final apfu h() {
        acpo acpoVar = this.aH;
        if (acpoVar != null) {
            return acpoVar.hx();
        }
        return null;
    }

    public final Optional i() {
        Optional optionalJ = j();
        if (!this.at.aP() || optionalJ.isEmpty()) {
            return optionalJ;
        }
        return (((Boolean) (true != optionalJ.isPresent() ? optionalJ : Optional.ofNullable(Boolean.valueOf(((acra) optionalJ.get()).l()))).orElse(Boolean.FALSE)).booleanValue() && true == optionalJ.isPresent()) ? Optional.ofNullable(((acra) optionalJ.get()).a()) : optionalJ;
    }

    public final Optional j() {
        acqh acqhVar = this.ag;
        if (acqhVar == null) {
            return Optional.empty();
        }
        return Optional.ofNullable(this.ag.L(acqhVar.A(this.M)));
    }

    public final Optional k(long j) {
        Optional optionalOfNullable = Optional.ofNullable(this.ag);
        umd umdVar = new umd(j, 2);
        if (true != optionalOfNullable.isPresent()) {
            return optionalOfNullable;
        }
        return Optional.ofNullable(((acqh) optionalOfNullable.get()).J(umdVar.a));
    }

    public final Optional l(int i) {
        Optional optionalOfNullable = Optional.ofNullable(this.ag);
        ivg ivgVar = new ivg(i, 2);
        if (true != optionalOfNullable.isPresent()) {
            return optionalOfNullable;
        }
        return Optional.ofNullable(((acqh) optionalOfNullable.get()).L(ivgVar.a));
    }

    public final List m() {
        ArrayList arrayList = new ArrayList();
        acqh acqhVar = this.ag;
        if (acqhVar != null) {
            if (Q()) {
                hno hnoVar = this.at;
                int iD = this.ag.D();
                for (int iMax = hnoVar.Q() ? Math.max(0, this.Q - hnoVar.d()) : 0; iMax < iD; iMax++) {
                    acra acraVarL = this.ag.L(iMax);
                    if (acraVarL != null) {
                        arrayList.add(Optional.ofNullable(acraVarL.d));
                    }
                }
            } else {
                acqhVar.S(new aasz(arrayList, 15));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:283:0x0561 A[Catch: all -> 0x0775, TryCatch #2 {all -> 0x0775, blocks: (B:326:0x06bb, B:328:0x06f9, B:329:0x0702, B:331:0x0712, B:333:0x0719, B:335:0x071f, B:336:0x0723, B:339:0x0729, B:341:0x072f, B:344:0x074a, B:347:0x074d, B:349:0x0754, B:351:0x075d, B:353:0x0763, B:354:0x076a, B:307:0x0635, B:312:0x0659, B:314:0x065d, B:316:0x0664, B:318:0x0668, B:321:0x06a9, B:323:0x06af, B:325:0x06b3, B:319:0x066c, B:311:0x0653, B:320:0x06a6, B:303:0x0624, B:273:0x0519, B:275:0x0533, B:284:0x0565, B:286:0x056e, B:287:0x0571, B:289:0x0581, B:291:0x05a0, B:293:0x05a8, B:294:0x05aa, B:296:0x05b5, B:297:0x05c6, B:299:0x0610, B:301:0x061c, B:300:0x0617, B:276:0x053e, B:278:0x0546, B:280:0x054e, B:282:0x055c, B:283:0x0561, B:337:0x0724, B:338:0x0728), top: B:372:0x0519, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:304:0x0629  */
    /* JADX WARN: Code duplicated, block: B:309:0x064f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:310:0x0651  */
    /* JADX WARN: Code duplicated, block: B:311:0x0653 A[Catch: all -> 0x0775, TryCatch #2 {all -> 0x0775, blocks: (B:326:0x06bb, B:328:0x06f9, B:329:0x0702, B:331:0x0712, B:333:0x0719, B:335:0x071f, B:336:0x0723, B:339:0x0729, B:341:0x072f, B:344:0x074a, B:347:0x074d, B:349:0x0754, B:351:0x075d, B:353:0x0763, B:354:0x076a, B:307:0x0635, B:312:0x0659, B:314:0x065d, B:316:0x0664, B:318:0x0668, B:321:0x06a9, B:323:0x06af, B:325:0x06b3, B:319:0x066c, B:311:0x0653, B:320:0x06a6, B:303:0x0624, B:273:0x0519, B:275:0x0533, B:284:0x0565, B:286:0x056e, B:287:0x0571, B:289:0x0581, B:291:0x05a0, B:293:0x05a8, B:294:0x05aa, B:296:0x05b5, B:297:0x05c6, B:299:0x0610, B:301:0x061c, B:300:0x0617, B:276:0x053e, B:278:0x0546, B:280:0x054e, B:282:0x055c, B:283:0x0561, B:337:0x0724, B:338:0x0728), top: B:372:0x0519, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:314:0x065d A[Catch: all -> 0x0775, TryCatch #2 {all -> 0x0775, blocks: (B:326:0x06bb, B:328:0x06f9, B:329:0x0702, B:331:0x0712, B:333:0x0719, B:335:0x071f, B:336:0x0723, B:339:0x0729, B:341:0x072f, B:344:0x074a, B:347:0x074d, B:349:0x0754, B:351:0x075d, B:353:0x0763, B:354:0x076a, B:307:0x0635, B:312:0x0659, B:314:0x065d, B:316:0x0664, B:318:0x0668, B:321:0x06a9, B:323:0x06af, B:325:0x06b3, B:319:0x066c, B:311:0x0653, B:320:0x06a6, B:303:0x0624, B:273:0x0519, B:275:0x0533, B:284:0x0565, B:286:0x056e, B:287:0x0571, B:289:0x0581, B:291:0x05a0, B:293:0x05a8, B:294:0x05aa, B:296:0x05b5, B:297:0x05c6, B:299:0x0610, B:301:0x061c, B:300:0x0617, B:276:0x053e, B:278:0x0546, B:280:0x054e, B:282:0x055c, B:283:0x0561, B:337:0x0724, B:338:0x0728), top: B:372:0x0519, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:316:0x0664 A[Catch: all -> 0x0775, TryCatch #2 {all -> 0x0775, blocks: (B:326:0x06bb, B:328:0x06f9, B:329:0x0702, B:331:0x0712, B:333:0x0719, B:335:0x071f, B:336:0x0723, B:339:0x0729, B:341:0x072f, B:344:0x074a, B:347:0x074d, B:349:0x0754, B:351:0x075d, B:353:0x0763, B:354:0x076a, B:307:0x0635, B:312:0x0659, B:314:0x065d, B:316:0x0664, B:318:0x0668, B:321:0x06a9, B:323:0x06af, B:325:0x06b3, B:319:0x066c, B:311:0x0653, B:320:0x06a6, B:303:0x0624, B:273:0x0519, B:275:0x0533, B:284:0x0565, B:286:0x056e, B:287:0x0571, B:289:0x0581, B:291:0x05a0, B:293:0x05a8, B:294:0x05aa, B:296:0x05b5, B:297:0x05c6, B:299:0x0610, B:301:0x061c, B:300:0x0617, B:276:0x053e, B:278:0x0546, B:280:0x054e, B:282:0x055c, B:283:0x0561, B:337:0x0724, B:338:0x0728), top: B:372:0x0519, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:318:0x0668 A[Catch: all -> 0x0775, TryCatch #2 {all -> 0x0775, blocks: (B:326:0x06bb, B:328:0x06f9, B:329:0x0702, B:331:0x0712, B:333:0x0719, B:335:0x071f, B:336:0x0723, B:339:0x0729, B:341:0x072f, B:344:0x074a, B:347:0x074d, B:349:0x0754, B:351:0x075d, B:353:0x0763, B:354:0x076a, B:307:0x0635, B:312:0x0659, B:314:0x065d, B:316:0x0664, B:318:0x0668, B:321:0x06a9, B:323:0x06af, B:325:0x06b3, B:319:0x066c, B:311:0x0653, B:320:0x06a6, B:303:0x0624, B:273:0x0519, B:275:0x0533, B:284:0x0565, B:286:0x056e, B:287:0x0571, B:289:0x0581, B:291:0x05a0, B:293:0x05a8, B:294:0x05aa, B:296:0x05b5, B:297:0x05c6, B:299:0x0610, B:301:0x061c, B:300:0x0617, B:276:0x053e, B:278:0x0546, B:280:0x054e, B:282:0x055c, B:283:0x0561, B:337:0x0724, B:338:0x0728), top: B:372:0x0519, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:319:0x066c A[Catch: all -> 0x0775, TryCatch #2 {all -> 0x0775, blocks: (B:326:0x06bb, B:328:0x06f9, B:329:0x0702, B:331:0x0712, B:333:0x0719, B:335:0x071f, B:336:0x0723, B:339:0x0729, B:341:0x072f, B:344:0x074a, B:347:0x074d, B:349:0x0754, B:351:0x075d, B:353:0x0763, B:354:0x076a, B:307:0x0635, B:312:0x0659, B:314:0x065d, B:316:0x0664, B:318:0x0668, B:321:0x06a9, B:323:0x06af, B:325:0x06b3, B:319:0x066c, B:311:0x0653, B:320:0x06a6, B:303:0x0624, B:273:0x0519, B:275:0x0533, B:284:0x0565, B:286:0x056e, B:287:0x0571, B:289:0x0581, B:291:0x05a0, B:293:0x05a8, B:294:0x05aa, B:296:0x05b5, B:297:0x05c6, B:299:0x0610, B:301:0x061c, B:300:0x0617, B:276:0x053e, B:278:0x0546, B:280:0x054e, B:282:0x055c, B:283:0x0561, B:337:0x0724, B:338:0x0728), top: B:372:0x0519, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:320:0x06a6 A[Catch: all -> 0x0775, TryCatch #2 {all -> 0x0775, blocks: (B:326:0x06bb, B:328:0x06f9, B:329:0x0702, B:331:0x0712, B:333:0x0719, B:335:0x071f, B:336:0x0723, B:339:0x0729, B:341:0x072f, B:344:0x074a, B:347:0x074d, B:349:0x0754, B:351:0x075d, B:353:0x0763, B:354:0x076a, B:307:0x0635, B:312:0x0659, B:314:0x065d, B:316:0x0664, B:318:0x0668, B:321:0x06a9, B:323:0x06af, B:325:0x06b3, B:319:0x066c, B:311:0x0653, B:320:0x06a6, B:303:0x0624, B:273:0x0519, B:275:0x0533, B:284:0x0565, B:286:0x056e, B:287:0x0571, B:289:0x0581, B:291:0x05a0, B:293:0x05a8, B:294:0x05aa, B:296:0x05b5, B:297:0x05c6, B:299:0x0610, B:301:0x061c, B:300:0x0617, B:276:0x053e, B:278:0x0546, B:280:0x054e, B:282:0x055c, B:283:0x0561, B:337:0x0724, B:338:0x0728), top: B:372:0x0519, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:323:0x06af A[Catch: all -> 0x0775, TryCatch #2 {all -> 0x0775, blocks: (B:326:0x06bb, B:328:0x06f9, B:329:0x0702, B:331:0x0712, B:333:0x0719, B:335:0x071f, B:336:0x0723, B:339:0x0729, B:341:0x072f, B:344:0x074a, B:347:0x074d, B:349:0x0754, B:351:0x075d, B:353:0x0763, B:354:0x076a, B:307:0x0635, B:312:0x0659, B:314:0x065d, B:316:0x0664, B:318:0x0668, B:321:0x06a9, B:323:0x06af, B:325:0x06b3, B:319:0x066c, B:311:0x0653, B:320:0x06a6, B:303:0x0624, B:273:0x0519, B:275:0x0533, B:284:0x0565, B:286:0x056e, B:287:0x0571, B:289:0x0581, B:291:0x05a0, B:293:0x05a8, B:294:0x05aa, B:296:0x05b5, B:297:0x05c6, B:299:0x0610, B:301:0x061c, B:300:0x0617, B:276:0x053e, B:278:0x0546, B:280:0x054e, B:282:0x055c, B:283:0x0561, B:337:0x0724, B:338:0x0728), top: B:372:0x0519, inners: #3 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [java.lang.Object, xit] */
    /* JADX WARN: Type inference failed for: r0v148 */
    /* JADX WARN: Type inference failed for: r0v149, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v155 */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r14v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [avmn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v9, types: [aclq, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void n(final boolean z) throws Throwable {
        afuu afuuVar;
        Throwable th;
        acra acraVarA;
        boolean z2;
        acqh acqhVar;
        long j;
        int i;
        acrp acrpVar;
        acra acraVar;
        int i2;
        ViewGroup viewGroupA;
        adyc adycVar;
        ajwo ajwoVar;
        acqh acqhVar2;
        final int i3;
        int i4;
        xir xirVarE;
        aenr aenrVarC;
        int iAU;
        boolean zF;
        Object obj;
        boolean zL;
        final acqy acqyVar;
        int i5;
        final int iD;
        int i6;
        apfp apfpVarC;
        int iAU2;
        String str;
        hno hnoVar = this.at;
        if (hnoVar.W()) {
            p(acqj.a);
        }
        afuu afuuVarC = afwt.c(89, "ttr_ReelPageController.attachPlayer");
        try {
            int i7 = this.Q;
            try {
                if (i7 == -1) {
                    this.g.c(16, "Attach Player: Adapter Position cannot be set due to missing reel data.");
                } else {
                    acqh acqhVar3 = this.ag;
                    acra acraVarL = acqhVar3 == null ? null : acqhVar3.L(i7);
                    if (acraVarL == null || !acraVarL.l()) {
                        acraVarA = acraVarL;
                        z2 = false;
                    } else {
                        acraVarA = acraVarL.a();
                        z2 = true;
                    }
                    ReelRecyclerView reelRecyclerView = this.y;
                    if (reelRecyclerView != null) {
                        reelRecyclerView.ae = z2;
                    }
                    if (acraVarA != null) {
                        acrp acrpVar2 = acraVarA.i;
                        if (acrpVar2 != null && (acqhVar = this.ag) != null) {
                            if (!hnoVar.W()) {
                                p(acqj.a);
                            }
                            qcb qcbVar = this.aN;
                            ajwo ajwoVar2 = acraVarA.f;
                            Object obj2 = qcbVar.a;
                            gjz gjzVar = ((gij) obj2).c;
                            ghj ghjVar = ((gij) obj2).b;
                            ghjVar.bC().an();
                            ght ghtVar = ((gij) obj2).a;
                            ghjVar.cv();
                            acqk acqkVar = new acqk(ajwoVar2);
                            long j2 = this.M;
                            acra acraVar2 = acraVarA;
                            long jE = acqhVar.E(i7);
                            this.M = jE;
                            int iCompare = Long.compare(jE, j2);
                            boolean z3 = this.ak;
                            if (z3 && hnoVar.M()) {
                                long j3 = this.N;
                                if (j3 == Long.MIN_VALUE) {
                                    j3 = this.M;
                                    this.N = j3;
                                }
                                j = Long.MIN_VALUE;
                                long j4 = this.M;
                                if (j4 >= j3) {
                                    if (this.O) {
                                        r("SWIPE_FORWARD");
                                    }
                                    this.N = this.M;
                                } else if (iCompare < 0) {
                                    this.O = true;
                                    long j5 = this.aE;
                                    if (j5 == Long.MIN_VALUE || j4 < j5) {
                                        this.aE = j4;
                                    }
                                } else if (iCompare > 0 && this.O) {
                                    r("SWIPE_FORWARD");
                                }
                            } else {
                                j = Long.MIN_VALUE;
                            }
                            this.aD = iCompare;
                            if (iCompare != 0) {
                                this.P = iCompare > 0;
                            }
                            if (iCompare == 0) {
                                if (!this.E.isPresent()) {
                                    iCompare = 0;
                                }
                            }
                            this.aB.q();
                            abhe abheVar = this.C;
                            if (abheVar != null) {
                                abheVar.k(acca.b(""));
                            }
                            if (this.E.isEmpty()) {
                                iCompare = iCompare;
                                i = 2;
                                acrpVar = acrpVar2;
                                acraVar = acraVar2;
                            } else {
                                Object obj3 = this.E.get();
                                Object obj4 = ((aciz) obj3).b;
                                if (obj4 != null) {
                                    acraVar = acraVar2;
                                    if (obj4 != acraVar) {
                                        acrp acrpVar3 = ((acra) obj4).i;
                                        int i8 = this.T.a;
                                        i = 2;
                                        if (i8 == 2 || i8 == 3) {
                                            i2 = 1;
                                        } else if (((acra) obj4).k.get() > 0) {
                                            i2 = 3;
                                        } else {
                                            i2 = i8 == 4 ? 2 : 0;
                                        }
                                        t();
                                        ?? r5 = ((aciz) obj3).a;
                                        if (!((acqk) r5).c) {
                                            this.g.c(32, "reelAdsClientDelegate.onPageExit called but onPageEnter was never called.");
                                        }
                                        this.a.f(r5, i2);
                                        if (hnoVar.Z() && (adycVar = this.aL) != null) {
                                            String strE = ((acra) obj4).e();
                                            if (adycVar.f.containsKey(strE)) {
                                                adycVar.f(new tso(strE, i2, 4));
                                                adycVar.c.remove(strE);
                                            }
                                        }
                                        acvq acvqVar = this.B;
                                        if (acvqVar != null && (viewGroupA = acvqVar.a()) != null && viewGroupA.getChildCount() > 0) {
                                            viewGroupA.removeAllViews();
                                        }
                                        if (!z) {
                                            ((acra) obj4).m();
                                            Optional optionalOfNullable = Optional.ofNullable(((acra) obj4).i);
                                            if (true == optionalOfNullable.isPresent()) {
                                                Optional optionalJ = ((acrp) optionalOfNullable.get()).J();
                                                if (true == optionalJ.isPresent()) {
                                                    ((acph) optionalJ.get()).b();
                                                }
                                            }
                                        }
                                        acrpVar = acrpVar2;
                                        long j6 = ((acra) obj4).j;
                                        if (j6 != j) {
                                            acqhVar.J(j6);
                                        }
                                        if (acrpVar3 != null) {
                                            acrpVar3.P();
                                            this.al.kk(new acvi(((acra) obj4).f));
                                            avju avjuVar = this.aJ;
                                            int i9 = avjuVar.b;
                                            if (i9 != 0) {
                                                ((actw) avjuVar.a).e(i9);
                                                avjuVar.b = 0;
                                            }
                                            if (((Optional) avjuVar.c).isPresent() && !((Optional) avjuVar.c).get().f()) {
                                                avnr.b((AtomicReference) ((Optional) avjuVar.c).get());
                                            }
                                        }
                                    } else {
                                        iCompare = iCompare;
                                        obj4 = obj4;
                                        i = 2;
                                        acrpVar = acrpVar2;
                                    }
                                } else {
                                    iCompare = iCompare;
                                    obj4 = obj4;
                                    i = 2;
                                    acrpVar = acrpVar2;
                                    acraVar = acraVar2;
                                }
                                this.U = Optional.empty();
                                if (this.T.b || ((acra) obj4).k.get() > 0) {
                                    this.U = Optional.ofNullable(this.T);
                                }
                            }
                            boolean z4 = iCompare != 0;
                            this.I = z4;
                            if (z4 && hnoVar.U()) {
                                actw actwVar = this.e;
                                if (actwVar.j.U()) {
                                    actwVar.a.c();
                                }
                            }
                            boolean zIsEmpty = this.E.isEmpty();
                            if (this.I || zIsEmpty) {
                                if (!S(acraVar.f)) {
                                    acqkVar.a();
                                    this.a.e(acqkVar);
                                }
                                this.b.m();
                            }
                            if (acrpVar.F()) {
                                if (this.I && this.T.a == 0) {
                                    if (this.D) {
                                        acpc acpcVar = this.az;
                                        auor auorVar = acpcVar.i;
                                        iud iudVar = new iud(acpcVar, 15);
                                        Executor executor = acpcVar.a;
                                        auorVar.d(iudVar, executor);
                                        auorVar.d(new iud(acpcVar, 16), executor);
                                    }
                                    Iterator it = new HashSet(this.p).iterator();
                                    while (it.hasNext()) {
                                        ((acqr) it.next()).P();
                                    }
                                }
                                G(acraVar.c());
                            } else if (this.aF == 0) {
                                this.aF = this.e.d();
                            }
                            if ((!zIsEmpty || hnoVar.ak()) && !this.I) {
                                ajwoVar = acraVar.f;
                            } else {
                                ?? r0 = iCompare > 0 ? 1 : 0;
                                int i10 = 1 << r0;
                                int iX = X(this.T.a, r0, z3);
                                ((aenu) this.ae.io()).n(acraVar.e(), i10, Integer.valueOf(iX));
                                ajwo ajwoVar3 = acraVar.f;
                                String strI = this.l.hB().i();
                                aihf aihfVarP = acfz.P(ajwoVar3);
                                aihfVarP.copyOnWrite();
                                aoar aoarVar = (aoar) aihfVarP.instance;
                                aoar aoarVar2 = aoar.a;
                                strI.getClass();
                                aoarVar.b |= 1;
                                aoarVar.c = strI;
                                aihfVarP.copyOnWrite();
                                aoar aoarVar3 = (aoar) aihfVarP.instance;
                                aoarVar3.b |= 2;
                                aoarVar3.d = iX;
                                aihh aihhVar = (aihh) ajwoVar3.toBuilder();
                                aihhVar.e(aoaq.b, (aoar) aihfVarP.build());
                                ajwoVar = (ajwo) aihhVar.build();
                            }
                            ajwo ajwoVar4 = ajwoVar;
                            acrpVar.O(this.aG);
                            if (hnoVar.q()) {
                                adz adzVar = this.aK;
                                if (adzVar.a) {
                                    ((awlo) adzVar.c).kk(aclv.ON_RECREATED);
                                    adzVar.a = false;
                                }
                            }
                            this.aG = false;
                            if (zIsEmpty || this.I) {
                                acraVar.m = true;
                                this.al.kk(new acvh(zIsEmpty, ajwoVar4, acraVar));
                            }
                            if (!z) {
                                D(0);
                                E(0);
                            }
                            if (!this.I) {
                                afuuVar = afuuVarC;
                                acqhVar2 = acqhVar;
                            } else {
                                if (acrpVar.F() || (hnoVar.bb() && !acrpVar.F() && (!((apfpVarC = acraVar.c()) == null || (iAU2 = a.aU(apfpVarC.M)) == 0 || iAU2 != i) || (hnoVar.aB() && acraVar.b() != null)))) {
                                    this.aC = this.i.f().toEpochMilli();
                                    if (iCompare != 0) {
                                        long j7 = this.J;
                                        if (j7 != -1) {
                                            int i11 = this.T.a;
                                            if (i11 == 1) {
                                                i4 = iCompare < 0 ? 1 : 2;
                                            } else if (i11 == 2 || i11 == 3) {
                                                i4 = 5;
                                            } else {
                                                i4 = iCompare < 0 ? 3 : 4;
                                            }
                                            actm actmVar = this.f;
                                            actmVar.l = !z3;
                                            acpo acpoVar = this.aH;
                                            apfu apfuVarHx = acpoVar != null ? acpoVar.hx() : null;
                                            ajwo ajwoVar5 = acraVar.f;
                                            aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                                            ajwoVar5.c(aihlVarCheckIsLite);
                                            if (ajwoVar5.j.n(aihlVarCheckIsLite.d)) {
                                                apfp apfpVarC2 = acraVar.c();
                                                actmVar.m(i4, 3, apfpVarC2, null, j7, "warm", apfuVarHx);
                                                awmd awmdVar = actmVar.d;
                                                boolean z5 = ((hno) awmdVar.io()).bb() && apfpVarC2 != null && (iAU = a.aU(apfpVarC2.M)) != 0 && iAU == 2;
                                                if (((hno) awmdVar.io()).ak()) {
                                                    actmVar.i(apfpVarC2.U, apfpVarC2.o);
                                                } else if (z5) {
                                                    actmVar.h(apfpVarC2.U);
                                                } else {
                                                    actmVar.h(apfpVarC2.o);
                                                }
                                                actmVar.e();
                                            } else {
                                                apfu apfuVar = apfuVarHx;
                                                apef apefVarB = acraVar.b();
                                                if (apefVarB != null && aecm.ay(apefVarB)) {
                                                    afuuVar = afuuVarC;
                                                    try {
                                                        long jA = actmVar.a(j7, "warm");
                                                        aeiy aeiyVar = (aeiy) actmVar.a.io();
                                                        if (((hno) aeiyVar.g).aB()) {
                                                            acqhVar2 = acqhVar;
                                                            if (aeiyVar.h()) {
                                                                String str2 = apefVarB.e;
                                                                if (str2.isEmpty() || (aenrVarC = ((aenu) aeiyVar.b.io()).c(str2)) == null) {
                                                                    xirVarE = aeiyVar.e(apefVarB);
                                                                } else {
                                                                    xirVarE = aenrVarC.b();
                                                                }
                                                            } else {
                                                                xirVarE = aeiyVar.e(apefVarB);
                                                            }
                                                        } else {
                                                            acqhVar2 = acqhVar;
                                                            xirVarE = aeiyVar.d.o(42);
                                                        }
                                                        aeiyVar.f(xirVarE);
                                                        if (!actmVar.l()) {
                                                            xirVarE.l(jA);
                                                        }
                                                        aihf aihfVarC = aawr.C(i4);
                                                        aihf aihfVarCreateBuilder = amiu.a.createBuilder();
                                                        if ((apefVarB.c & 8) != 0) {
                                                            String str3 = apefVarB.e;
                                                            aihfVarCreateBuilder.copyOnWrite();
                                                            amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
                                                            str3.getClass();
                                                            amiuVar.b |= 32;
                                                            amiuVar.i = str3;
                                                        }
                                                        amjf amjfVar = ((amiu) aihfVarCreateBuilder.instance).S;
                                                        if (amjfVar == null) {
                                                            amjfVar = amjf.a;
                                                        }
                                                        aihf builder = amjfVar.toBuilder();
                                                        if (true == aecm.ay(apefVarB)) {
                                                            builder.copyOnWrite();
                                                            amjf amjfVar2 = (amjf) builder.instance;
                                                            amjfVar2.f = 12;
                                                            amjfVar2.b |= 8;
                                                        }
                                                        apft apftVarA = aawr.A(null, apfuVar);
                                                        builder.copyOnWrite();
                                                        amjf amjfVar3 = (amjf) builder.instance;
                                                        amjfVar3.l = apftVarA.g;
                                                        amjfVar3.b |= SemanticState.Modal;
                                                        aihfVarCreateBuilder.copyOnWrite();
                                                        amiu amiuVar2 = (amiu) aihfVarCreateBuilder.instance;
                                                        amjf amjfVar4 = (amjf) builder.build();
                                                        amjfVar4.getClass();
                                                        amiuVar2.S = amjfVar4;
                                                        amiuVar2.d |= 131072;
                                                        actmVar.n(i4, 3, xirVarE, jA, aihfVarC, aihfVarCreateBuilder);
                                                        if (((hno) actmVar.d.io()).ak()) {
                                                            actmVar.i(apefVarB.e, null);
                                                        } else {
                                                            actmVar.h(apefVarB.e);
                                                        }
                                                        actmVar.e();
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                    }
                                                }
                                                this.J = -1L;
                                            }
                                            afuuVar = afuuVarC;
                                            acqhVar2 = acqhVar;
                                            this.J = -1L;
                                        } else {
                                            afuuVar = afuuVarC;
                                            acqhVar2 = acqhVar;
                                        }
                                        i3 = iCompare;
                                        zF = acrpVar.F();
                                        obj = hnoVar.m;
                                        zL = ((vxz) obj).l(33, 45711506L, false);
                                        acqyVar = this.T;
                                        if (zL) {
                                            if (zF) {
                                                iD = this.e.d();
                                            } else {
                                                iD = 0;
                                            }
                                            i6 = this.S;
                                            if (i6 != 0) {
                                                this.e.e(i6);
                                            }
                                            if (iD != 0) {
                                                this.S = iD;
                                            }
                                            if (zF) {
                                                int iC = (int) ((vxz) obj).c(0, 45711508L, 0L);
                                                ahey aheyVar = this.j;
                                                ahew ahewVarSchedule = aheyVar.schedule(afwl.i(new Runnable() { // from class: acqn
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        acqz acqzVar = this.a;
                                                        acqzVar.H(acqyVar, i3, z);
                                                        int i12 = iD;
                                                        if (i12 == acqzVar.S) {
                                                            acqzVar.S = 0;
                                                        }
                                                        acqzVar.e.e(i12);
                                                    }
                                                }), iC, TimeUnit.MILLISECONDS);
                                                avmo avmoVar = new avmo(ahewVarSchedule);
                                                this.r.c(avmoVar);
                                                ahewVarSchedule.addListener(afwl.i(new acnp(this, avmoVar, 6)), aheyVar);
                                            } else {
                                                H(acqyVar, i3, z);
                                            }
                                        } else {
                                            H(acqyVar, i3, z);
                                        }
                                        if (acrpVar.F() && (i5 = this.aF) != 0) {
                                            this.e.e(i5);
                                            this.aF = 0;
                                        }
                                    } else {
                                        afuuVar = afuuVarC;
                                        acqhVar2 = acqhVar;
                                        i3 = 0;
                                        zF = acrpVar.F();
                                        obj = hnoVar.m;
                                        zL = ((vxz) obj).l(33, 45711506L, false);
                                        acqyVar = this.T;
                                        if (zL) {
                                            if (zF) {
                                                iD = 0;
                                            } else {
                                                iD = this.e.d();
                                            }
                                            i6 = this.S;
                                            if (i6 != 0) {
                                                this.e.e(i6);
                                            }
                                            if (iD != 0) {
                                                this.S = iD;
                                            }
                                            if (zF) {
                                                H(acqyVar, i3, z);
                                            } else {
                                                int iC2 = (int) ((vxz) obj).c(0, 45711508L, 0L);
                                                ahey aheyVar2 = this.j;
                                                ahew ahewVarSchedule2 = aheyVar2.schedule(afwl.i(new Runnable() { // from class: acqn
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        acqz acqzVar = this.a;
                                                        acqzVar.H(acqyVar, i3, z);
                                                        int i12 = iD;
                                                        if (i12 == acqzVar.S) {
                                                            acqzVar.S = 0;
                                                        }
                                                        acqzVar.e.e(i12);
                                                    }
                                                }), iC2, TimeUnit.MILLISECONDS);
                                                avmo avmoVar2 = new avmo(ahewVarSchedule2);
                                                this.r.c(avmoVar2);
                                                ahewVarSchedule2.addListener(afwl.i(new acnp(this, avmoVar2, 6)), aheyVar2);
                                            }
                                        } else {
                                            H(acqyVar, i3, z);
                                        }
                                        if (acrpVar.F()) {
                                            this.e.e(i5);
                                            this.aF = 0;
                                        }
                                    }
                                    th = th;
                                    try {
                                        afuuVar.close();
                                        throw th;
                                    } catch (Throwable th3) {
                                        th.addSuppressed(th3);
                                        throw th;
                                    }
                                }
                                afuuVar = afuuVarC;
                                acqhVar2 = acqhVar;
                                i3 = iCompare;
                                zF = acrpVar.F();
                                obj = hnoVar.m;
                                zL = ((vxz) obj).l(33, 45711506L, false);
                                acqyVar = this.T;
                                if (zL) {
                                    if (zF) {
                                        iD = 0;
                                    } else {
                                        iD = this.e.d();
                                    }
                                    i6 = this.S;
                                    if (i6 != 0) {
                                        this.e.e(i6);
                                    }
                                    if (iD != 0) {
                                        this.S = iD;
                                    }
                                    if (zF) {
                                        H(acqyVar, i3, z);
                                    } else {
                                        int iC3 = (int) ((vxz) obj).c(0, 45711508L, 0L);
                                        ahey aheyVar3 = this.j;
                                        ahew ahewVarSchedule3 = aheyVar3.schedule(afwl.i(new Runnable() { // from class: acqn
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                acqz acqzVar = this.a;
                                                acqzVar.H(acqyVar, i3, z);
                                                int i12 = iD;
                                                if (i12 == acqzVar.S) {
                                                    acqzVar.S = 0;
                                                }
                                                acqzVar.e.e(i12);
                                            }
                                        }), iC3, TimeUnit.MILLISECONDS);
                                        avmo avmoVar3 = new avmo(ahewVarSchedule3);
                                        this.r.c(avmoVar3);
                                        ahewVarSchedule3.addListener(afwl.i(new acnp(this, avmoVar3, 6)), aheyVar3);
                                    }
                                } else {
                                    H(acqyVar, i3, z);
                                }
                                if (acrpVar.F()) {
                                    this.e.e(i5);
                                    this.aF = 0;
                                }
                            }
                            this.T = new acqy(0, false);
                            this.F = this.E;
                            this.E = Optional.of(new aciz(acrpVar.w, acqkVar));
                            this.t.kk(Optional.ofNullable(null));
                            this.w.kk(this.E);
                            this.u.kk(Optional.ofNullable(acrpVar.H()));
                            if (hnoVar.ay()) {
                                this.v.kk(Optional.ofNullable(acrpVar));
                            }
                            if (((vxz) hnoVar.i).l(161, 45725551L, false) && i7 <= this.W && L()) {
                                acrn acrnVar = this.b;
                                synchronized (acrnVar.g) {
                                    try {
                                        str = acrnVar.h.b;
                                    } catch (Throwable th4) {
                                        throw th4;
                                    }
                                }
                                if (!ahno.aa(str)) {
                                    acrnVar.l(acrnVar.h, null, null, str, acrnVar.l, acrt.SHEDDABLE, false, false);
                                }
                            }
                            int iZ = acqhVar2.z();
                            if (iZ != -1) {
                                if (i7 >= ((long) iZ) - this.W && K()) {
                                    this.b.h(acrt.SHEDDABLE);
                                }
                            }
                            this.al.kk(new acvl(zIsEmpty, ajwoVar4, acraVar));
                        }
                        afuuVar.close();
                    }
                    if (!M()) {
                        this.g.d(7, a.bR(i7, "Attach Player: Adapter Position does not hold any reel data, position: "));
                    }
                }
                afuuVar = afuuVarC;
                afuuVar.close();
            } catch (Throwable th5) {
                th = th5;
                afuuVar = afuuVarC;
            }
        } catch (Throwable th6) {
            th = th6;
            afuuVar = afuuVarC;
        }
    }

    public final void o() {
        tgr tgrVarAG;
        ReelRecyclerView reelRecyclerView = this.y;
        if (reelRecyclerView == null || (tgrVarAG = reelRecyclerView.aG()) == null) {
            return;
        }
        tgrVarAG.k();
    }

    public final void p(acqj acqjVar) {
        Optional optional = this.E;
        abyy abyyVar = new abyy(acqjVar, 20);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            Object obj2 = abyyVar.a;
            Object obj3 = ((aciz) obj).a;
            obj2.toString();
            ((acqk) obj3).b = Optional.of(obj2);
        }
    }

    public final void q() {
        actm actmVar;
        Optional optionalJ = j();
        if (this.aD == 0 || optionalJ.isEmpty() || !((acra) optionalJ.get()).m() || ((acra) optionalJ.get()).c() == null || (actmVar = this.f) == null) {
            return;
        }
        apfp apfpVarC = ((acra) optionalJ.get()).c();
        long j = this.aC;
        if (j != -1) {
            actmVar.g("r_nav", j);
        }
        long j2 = this.K;
        if (j2 != -1) {
            String str = apfpVarC.o;
            synchronized (actmVar.b) {
                if (actmVar.k(str)) {
                    actmVar.e.c(66);
                    if (j2 != 0) {
                        actmVar.g("r_vtc", j2);
                    } else {
                        actmVar.f("r_vtc");
                    }
                }
            }
        }
        long j3 = this.L;
        if (j3 != -1) {
            actm actmVar2 = this.f;
            String str2 = apfpVarC.o;
            synchronized (actmVar2.b) {
                if (actmVar2.g != null && actmVar2.k(str2)) {
                    actmVar2.g("r_vtsk", j3);
                }
            }
        }
        this.aD = 0;
        this.aC = -1L;
        this.K = -1L;
        this.L = -1L;
    }

    public final void r(String str) {
        if (this.at.M()) {
            long j = this.N;
            if (j != Long.MIN_VALUE) {
                long j2 = this.aE;
                if (j2 != Long.MIN_VALUE) {
                    long j3 = j - j2;
                    if (j3 > 0) {
                        ((qtc) this.ad.y.io()).b(j3, str);
                    }
                }
            }
            this.O = false;
            this.aE = Long.MIN_VALUE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [aclq, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void s(long j) {
        Optional optionalK = k(j);
        if (optionalK.isEmpty()) {
            return;
        }
        Optional optionalOfNullable = true != optionalK.isPresent() ? optionalK : Optional.ofNullable(((acra) optionalK.get()).i);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(null);
        }
        acog acogVar = new acog(this, optionalK, 3);
        if (true == optionalOfNullable.isPresent()) {
            Object obj = optionalOfNullable.get();
            Object obj2 = acogVar.a;
            ajwo ajwoVar = ((acra) ((Optional) acogVar.b).get()).f;
            acqz acqzVar = (acqz) obj2;
            acqzVar.B.a();
            ((acpp) obj).c();
            if (acqzVar.S(ajwoVar) && acqzVar.E.isPresent() && ((acra) ((aciz) acqzVar.E.get()).b).f.equals(ajwoVar)) {
                ((acqk) ((aciz) acqzVar.E.get()).a).a();
                acqzVar.a.e(((aciz) acqzVar.E.get()).a);
            }
        }
    }

    public final void t() {
        String str;
        if (!((vxz) this.at.m).l(12, 45662992L, false) || this.E.isEmpty()) {
            return;
        }
        acra acraVar = (acra) ((aciz) this.E.get()).b;
        if (acraVar.m()) {
            switch (aecm.aB(acraVar.f)) {
                case 1:
                    str = "REEL_VIDEO_TYPE_UNKNOWN";
                    break;
                case 2:
                    str = "REEL_VIDEO_TYPE_STORY";
                    break;
                case 3:
                    str = "REEL_VIDEO_TYPE_VIDEO";
                    break;
                case 4:
                    str = "REEL_VIDEO_TYPE_AD";
                    break;
                case 5:
                    str = "REEL_VIDEO_TYPE_LIVE";
                    break;
                case 6:
                    str = "REEL_VIDEO_TYPE_VOD_VIDEO";
                    break;
                case 7:
                    str = "REEL_VIDEO_TYPE_STACKED_CARDS_PROMO";
                    break;
                case 8:
                    str = "REEL_VIDEO_TYPE_LIVE_PREVIEW";
                    break;
                case 9:
                    str = "REEL_VIDEO_TYPE_MUSIC_SAMPLES";
                    break;
                case 10:
                    str = "REEL_VIDEO_TYPE_MINI_APP_AD";
                    break;
                case 11:
                    str = "REEL_VIDEO_TYPE_POST";
                    break;
                case 12:
                    str = "REEL_VIDEO_TYPE_DISCO_DAILY";
                    break;
                case 13:
                    str = "REEL_VIDEO_TYPE_HATS_SURVEY";
                    break;
                case 14:
                    str = "REEL_VIDEO_TYPE_PODCAST_DISCO_DAILY";
                    break;
                case 15:
                    str = "REEL_VIDEO_TYPE_DM_CREATED";
                    break;
                case 16:
                    str = "REEL_VIDEO_TYPE_MINI_APP_PREVIEW";
                    break;
                default:
                    str = "REEL_VIDEO_TYPE_MINI_APP_GRID_PREVIEW";
                    break;
            }
            acvp acvpVarC = this.B.c();
            String str2 = acvpVarC.a;
            double d = acvpVarC.b;
            aerv aervVar = this.ad;
            ((qtf) aervVar.t.io()).b(1L, str2, str);
            if (str2.equals("DISABLED")) {
                return;
            }
            ((qtc) aervVar.s.io()).b((int) (d * 100.0d), str);
        }
    }

    public final void u(List list) {
        if (this.at.av()) {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                ajwo ajwoVar = (ajwo) it.next();
                if (ajwoVar != null) {
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                    ajwoVar.c(aihlVarCheckIsLite);
                    if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                        ajwoVar.c(aihlVarCheckIsLite2);
                        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                        if (((apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).i == 44) {
                            i++;
                        }
                    }
                }
            }
            if (i > 0) {
                ((qtf) this.ad.w.io()).b(i, new Object[0]);
            }
        }
    }

    public final void v(ajwo ajwoVar) {
        this.al.kk(new acvj(ajwoVar));
    }

    public final void w(List list) {
        hno hnoVar = this.at;
        if (hnoVar.s()) {
            if (list.isEmpty()) {
                return;
            }
            final int size = list.size();
            int i = this.Q;
            final int i2 = 0;
            if (i != -1) {
                this.Q = Math.max(0, i - size);
            }
            int i3 = this.R;
            if (i3 != -1) {
                this.R = Math.max(0, i3 - size);
            }
            final int i4 = 1;
            DesugarAtomicInteger.updateAndGet(this.n, new IntUnaryOperator() { // from class: acqm
                public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
                    return i4 != 0 ? IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator) : IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator);
                }

                @Override // java.util.function.IntUnaryOperator
                public final int applyAsInt(int i5) {
                    if (i4 != 0) {
                        return i5 >= 0 ? Math.max(0, i5 - size) : i5;
                    }
                    return i5 >= 0 ? Math.max(0, i5 - size) : i5;
                }

                public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
                    return i4 != 0 ? IntUnaryOperator$CC.$default$compose(this, intUnaryOperator) : IntUnaryOperator$CC.$default$compose(this, intUnaryOperator);
                }
            });
            DesugarAtomicInteger.updateAndGet(this.m, new IntUnaryOperator() { // from class: acqm
                public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
                    return i2 != 0 ? IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator) : IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator);
                }

                @Override // java.util.function.IntUnaryOperator
                public final int applyAsInt(int i5) {
                    if (i2 != 0) {
                        return i5 >= 0 ? Math.max(0, i5 - size) : i5;
                    }
                    return i5 >= 0 ? Math.max(0, i5 - size) : i5;
                }

                public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
                    return i2 != 0 ? IntUnaryOperator$CC.$default$compose(this, intUnaryOperator) : IntUnaryOperator$CC.$default$compose(this, intUnaryOperator);
                }
            });
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((acra) it.next()).g();
            }
        }
        if (hnoVar.R()) {
            agkx agkxVar = new agkx();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                acra acraVar = (acra) it2.next();
                if (aecm.az(acraVar.f)) {
                    agkxVar.c(aecm.ad(acraVar.f));
                }
            }
            agkz agkzVarG = agkxVar.g();
            if (agkzVarG.isEmpty()) {
                return;
            }
            this.a.a(agkzVarG);
        }
    }

    public final void x() {
        acrn acrnVar = this.b;
        if (acrnVar != null) {
            acrnVar.p = true;
            acrnVar.e();
        }
    }

    public final void y(acqr acqrVar) {
        this.p.remove(acqrVar);
    }

    public final void z(boolean z) {
        Object obj;
        acrp acrpVar;
        Optional optional = z ? this.E : this.F;
        if (true != optional.isPresent() || (obj = ((aciz) optional.get()).b) == null || (acrpVar = ((acra) obj).i) == null) {
            return;
        }
        Optional optionalJ = acrpVar.J();
        if (true == optionalJ.isPresent()) {
            ((acph) optionalJ.get()).b();
        }
    }
}

package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.proto.streaming.StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList;
import j$.time.Duration;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acfs implements yxh {
    public final acip a;
    public final acfh b;
    public final acfr c;
    public final abnc d;
    public final ytv e;
    public final mbc f;
    public final abmt g;
    public final vyo h;
    public final acab j;
    public final axsp k;
    public final abvy l;
    public final vxu m;
    public final afip n;
    public final ijt o;
    public final avgj p;
    private final acfi q;
    private final abog r;
    public final Handler i = new Handler(Looper.getMainLooper());
    private boolean s = false;

    public acfs(ytv ytvVar, acfr acfrVar, afip afipVar, abnc abncVar, acfi acfiVar, abog abogVar, acfh acfhVar, mbc mbcVar, acip acipVar, abvy abvyVar, avgj avgjVar, abmt abmtVar, vxu vxuVar, vyo vyoVar, axsp axspVar, ijt ijtVar) {
        int i = 0;
        this.a = acipVar;
        this.l = abvyVar;
        this.b = acfhVar;
        this.c = acfrVar;
        this.d = abncVar;
        this.p = avgjVar;
        this.n = afipVar;
        this.e = ytvVar;
        this.q = acfiVar;
        this.r = abogVar;
        this.f = mbcVar;
        this.g = abmtVar;
        this.m = vxuVar;
        this.h = vyoVar;
        this.k = axspVar;
        this.o = ijtVar;
        acfhVar.b = new WeakReference(acipVar);
        acab acabVarR = acipVar.r();
        this.j = acabVarR;
        int i2 = 12;
        int i3 = 13;
        int i4 = 15;
        int i5 = 11;
        int i6 = 14;
        if (abmt.co(vxuVar)) {
            int i7 = 1;
            int i8 = 18;
            acabVarR.q.c(acabVarR.d.N().al(new aawl(new abyr(acabVarR, 17), "QSMC", 1), new abyr(acabVarR, i8)));
            acabVarR.q.c(acabVarR.e.N().al(new abyr(acabVarR, i5), new abyr(acabVarR, i8)));
            acabVarR.q.c(acabVarR.f.N().al(new abyr(acabVarR, i6), new abyr(acabVarR, i8)));
            acabVarR.q.c(acabVarR.g.N().al(new abyr(acabVarR, i4), new abyr(acabVarR, i8)));
            acabVarR.q.c(acabVarR.h.N().al(new abyr(acabVarR, 19), new abyr(acabVarR, i8)));
            acabVarR.q.c(acabVarR.k.N().al(new acaa(acabVarR, 3), new abyr(acabVarR, i8)));
            acabVarR.q.c(acabVarR.j.N().al(new acaa(acabVarR, 2), new abyr(acabVarR, i8)));
            acabVarR.q.c(acabVarR.r.b().al(new acaa(acabVarR, i), new abyr(acabVarR, i8)));
            acabVarR.q.c(acabVarR.i.N().al(new abyr(acabVarR, 16), new abyr(acabVarR, i8)));
            acabVarR.q.c(acabVarR.l.N().al(new abyr(acabVarR, 10), new abyr(acabVarR, i8)));
            acabVarR.q.c(acabVarR.m.N().al(new abyr(acabVarR, 20), new abyr(acabVarR, i8)));
            acabVarR.q.c(acabVarR.n.N().al(new abyr(acabVarR, i3), new abyr(acabVarR, i8)));
            ajdf ajdfVar = acab.a(acabVarR.c).q;
            if ((ajdfVar == null ? ajdf.a : ajdfVar).b) {
                acabVarR.q.c(acabVarR.r.a().N().al(new abyr(acabVarR, i2), new abyr(acabVarR, i8)));
            }
            ajdf ajdfVar2 = acab.a(acabVarR.c).q;
            if ((ajdfVar2 == null ? ajdf.a : ajdfVar2).h) {
                acabVarR.q.c(acabVarR.o.N().al(new acaa(acabVarR, i7), new abyr(acabVarR, i8)));
            }
        }
        if (abmtVar.ad()) {
            acft acftVarS = acipVar.s();
            acftVarS.x = new avgj(this, null);
            vtu vtuVar = new vtu(acftVarS, i6);
            avmm avmmVar = acftVarS.o;
            avlh avlhVar = acftVarS.h;
            aceb acebVar = new aceb(acftVarS, i5);
            int i9 = 6;
            avmmVar.c(avlhVar.am(acebVar, new abxq(i9), vtuVar));
            acftVarS.o.c(acftVarS.i.am(new aceb(acftVarS, i2), new abxq(i9), vtuVar));
            acftVarS.o.c(acftVarS.j.am(new aceb(acftVarS, i3), new abxq(i9), vtuVar));
            acftVarS.o.c(acftVarS.k.am(new aceb(acftVarS, i6), new abxq(i9), vtuVar));
            acftVarS.o.c(acftVarS.l.am(new aceb(acftVarS, i4), new abxq(i9), vtuVar));
        }
    }

    private final void Q(aboe aboeVar) {
        abmt abmtVar = this.g;
        if (abmtVar.aK()) {
            if (abmtVar.bO() && aboeVar.j == 3) {
                aboeVar.b = E();
            } else {
                this.r.a(aboeVar, E());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [acij, java.lang.Object] */
    private final void R() {
        if (A() == abob.d) {
            acfg acfgVar = (acfg) this.p.a;
            acfgVar.p = acfgVar.aU(false, false, true);
            return;
        }
        if (this.g.ad() && !T()) {
            acip acipVar = this.a;
            acipVar.w().m = abob.j;
            this.p.m(acipVar.au());
            return;
        }
        avgj avgjVar = this.p;
        acik acikVarV = avgjVar.j().v();
        if (acikVarV.a) {
            acikVarV.b++;
            ?? r4 = acikVarV.c;
            Object obj = acikVarV.d;
            r4.jQ(Duration.ZERO);
            r4.jO((String) obj, acikVarV.b);
            return;
        }
        acip acipVar2 = this.a;
        if (acipVar2.x().i()) {
            wjf wjfVarF = acipVar2.f();
            if ((aawr.n(avgjVar.j()) && (wjfVarF == null || wjfVarF.g() == null || !wjfVarF.g().K())) || !acipVar2.x().h(acipVar2.au())) {
                return;
            }
        }
        avgjVar.m(acipVar2.au());
    }

    private final void S() {
        if (this.g.aU()) {
            abvy abvyVar = this.l;
            String strAu = this.a.au();
            strAu.getClass();
            abvyVar.b.remove(strAu);
        }
    }

    private final boolean T() {
        abmt abmtVar = this.g;
        String strAu = this.a.au();
        boolean zAU = abmtVar.aU();
        abvy abvyVar = this.l;
        return zAU ? abvyVar.g(strAu) : abvyVar.h(strAu);
    }

    public final abob A() {
        return this.g.ad() ? this.a.w().m : this.p.i();
    }

    public final acgu B() {
        return this.a.w();
    }

    final arfb C() {
        abnp abnpVarD = d();
        if (abnpVarD != null) {
            return (arfb) abnpVarD.h.orElse(null);
        }
        return null;
    }

    final Integer D() {
        abnp abnpVarD = d();
        if (abnpVarD != null) {
            return (Integer) abnpVarD.i.orElse(null);
        }
        return null;
    }

    public final String E() {
        return this.a.au();
    }

    public final void F(int i) {
        acip acipVar = this.a;
        aawr.l(acipVar, i);
        this.p.r(acipVar, 4);
    }

    public final void G(long j, appa appaVar) {
        acip acipVar = this.a;
        acipVar.aM().kk(new aaxj(a(), j, appaVar));
        acipVar.p().m(j, appaVar);
        long jD = acipVar.t().d(j, false);
        if (this.g.ad()) {
            return;
        }
        this.c.a(jD);
    }

    public final void H(String str, String str2, boolean z) {
        this.n.s(str, str2, z, E());
        zgj zgjVar = this.j.p;
        if (zgjVar == null || !abmt.co(this.m)) {
            return;
        }
        zgjVar.M(str, str2, 2);
    }

    final void I(boolean z) {
        if (!z) {
            afip afipVar = this.n;
            acip acipVar = this.a;
            afipVar.w(new aaxl(acipVar.au()), acipVar);
        }
        this.a.p().l();
    }

    public final void J() {
        String strH;
        acfh acfhVar = this.b;
        acfhVar.a = null;
        acfhVar.b = null;
        acip acipVar = this.a;
        acipVar.t().r();
        acipVar.u().d(false);
        acipVar.u().c();
        acipVar.p().j(acipVar.w().f);
        acipVar.p().o();
        aciq aciqVarW = acipVar.w();
        aciqVarW.f = 0L;
        aciqVarW.g = -1L;
        aciqVarW.h = 0L;
        aciqVarW.i = 0L;
        aciqVarW.j = 0L;
        aciqVarW.l = 4;
        aciqVarW.m = abob.a;
        acipVar.w().o = null;
        abmt abmtVar = this.g;
        if (abmtVar.bG() && (strH = acipVar.w().h()) != null) {
            if (abmt.co(this.m)) {
                abnl abnlVar = acipVar.w().b;
                this.j.b(strH, b(), E(), abnlVar != null ? abnlVar.w() : null);
            } else {
                this.n.t(strH, E());
            }
        }
        if (abmt.co(this.m)) {
            acab acabVar = this.j;
            zgj zgjVar = acabVar.p;
            if (zgjVar != null) {
                zgjVar.e();
            }
            acabVar.q.dispose();
        }
        if (abmtVar.ad()) {
            acipVar.s().a();
        }
        this.s = true;
    }

    public final void K(abnp abnpVar) {
        avgj avgjVar = this.p;
        if (abmt.ai(this.h, aawr.o(avgjVar.j()), aawr.n(avgjVar.j()))) {
            this.a.w().c = abnpVar;
        }
    }

    public final void L(abob abobVar) {
        this.a.w().m = abobVar;
        if (!this.g.ad()) {
            this.p.n(abobVar);
        } else if (T()) {
            this.p.n(abobVar);
        }
    }

    public final boolean M() {
        avgj avgjVar = this.p;
        if (abmt.ai(this.h, aawr.o(avgjVar.j()), aawr.n(avgjVar.j()))) {
            acip acipVar = this.a;
            if (acipVar.x().c(acipVar.au()) != null && !acipVar.x().h(acipVar.au())) {
                return true;
            }
        }
        return false;
    }

    public final boolean N() {
        aoqb aoqbVarCn = abmt.cn(this.m);
        if (aoqbVarCn == null || !aoqbVarCn.d) {
            if (!A().e()) {
                avgj avgjVar = this.p;
                if ((!aawr.n(avgjVar.j()) || !A().a(abob.d)) && (!abmt.ai(this.h, aawr.o(avgjVar.j()), aawr.n(avgjVar.j())) || !A().a(abob.d))) {
                    return false;
                }
            }
        } else if (this.s) {
            return false;
        }
        return true;
    }

    final byte[] O() {
        abnl abnlVarN = this.a.n();
        if (abnlVarN != null) {
            return abnlVarN.R();
        }
        return null;
    }

    public final void P(int i) {
        abmt abmtVar = this.g;
        zia ziaVarC = c();
        if (abmtVar.ad()) {
            if (ziaVarC.equals(zia.a)) {
                return;
            }
            String str = ziaVarC.i;
            if (!ahno.aa(str) && !str.equals(this.a.au())) {
                return;
            }
        }
        avgj avgjVar = this.p;
        acip acipVar = this.a;
        long j = ziaVarC.c;
        long j2 = ziaVarC.b;
        long j3 = ziaVarC.e;
        avgjVar.p(acipVar, i, j, j2, j3, ziaVarC.f);
        if (abmtVar.cb()) {
            wjf wjfVarB = b();
            if (aawr.n(avgjVar.j()) && wjfVarB != null && wjfVarB.T() && acipVar.l().d() && j3 - j2 < abmtVar.l()) {
                acipVar.l().b(j2);
            }
        }
    }

    public final long a() {
        return aawr.h(this.e, E());
    }

    public final wjf b() {
        return this.a.f();
    }

    public final zia c() {
        return this.e.h(E());
    }

    public final abnp d() {
        return this.a.o();
    }

    @Override // defpackage.yxg
    public final void e() {
        throw null;
    }

    @Override // defpackage.yxg
    public final void f(wgs wgsVar, long j, long j2, ywx[] ywxVarArr) {
        throw null;
    }

    @Override // defpackage.yxg
    public final void g() {
        acip acipVar = this.a;
        long jE = aawr.e(acipVar);
        long jE2 = aawr.e(acipVar);
        if (N() || (this.g.g.l(378, 45774712L, false) && A().a(abob.g, abob.h) && aawr.o(this.p.j()))) {
            abmt abmtVar = this.g;
            if (!abmtVar.ad()) {
                this.c.c();
            }
            avgj avgjVar = this.p;
            avgjVar.p(acipVar, 4, -1L, jE, jE2, -1L);
            abyv abyvVarP = acipVar.p();
            abzc abzcVar = abyvVarP.b;
            if (abzcVar != null && abyvVarP.f) {
                abzcVar.l();
            }
            abzn abznVar = abyvVarP.d;
            if (abznVar != null) {
                abznVar.a();
            }
            abzh abzhVar = abyvVarP.c;
            if (abzhVar != null) {
                abzhVar.f();
            }
            acipVar.t().l();
            if (A().h()) {
                aawr.l(acipVar, 7);
                avgjVar.r(acipVar, 2);
                avgjVar.l(false);
                avgjVar.r(acipVar, 3);
                if (aawr.n(avgjVar.j()) || M()) {
                    return;
                }
                this.n.r(acipVar);
                return;
            }
            if (!abmtVar.ad() || T()) {
                R();
                F(7);
                S();
            } else {
                F(7);
                S();
                R();
            }
        }
    }

    @Override // defpackage.yxg
    public final void h(zhz zhzVar) {
        i(zhzVar, yxj.a);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01f0 A[PHI: r14
      0x01f0: PHI (r14v1 int) = (r14v0 int), (r14v0 int), (r14v0 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:68:0x014b, B:70:0x0153, B:72:0x015b, B:74:0x0166, B:76:0x016e, B:78:0x0176, B:80:0x017e, B:82:0x0186] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:114:0x01f5  */
    @Override // defpackage.yxg
    public final void i(zhz zhzVar, yxj yxjVar) {
        boolean z;
        int i;
        int i2;
        aboe aboeVar;
        abmt abmtVar = this.g;
        boolean zB = false;
        boolean z2 = abmtVar.ad() && !(yxjVar == yxj.a && T());
        if (z2 || zhzVar.g || !this.q.k(zhzVar)) {
            if (zhzVar.f && !z2) {
                this.p.q(1);
            }
            if (N()) {
                afip afipVar = this.n;
                acip acipVar = this.a;
                afipVar.j(zhzVar, acipVar);
                if (z2) {
                    if (zhzVar.f) {
                        F(8);
                        S();
                        if (T()) {
                            return;
                        }
                        R();
                        return;
                    }
                    return;
                }
                if (zhzVar.g || !((acfg) this.p.a).aJ()) {
                    if (!zhzVar.g && zhzVar.b.equals("staleconfig")) {
                        ((acfg) this.p.a).aD(Duration.ofSeconds(0L));
                        return;
                    }
                    if (!zhzVar.g && zhzVar.f().equals("offline.partial.nocontent")) {
                        avgj avgjVar = this.p;
                        avgjVar.q(1);
                        if (!abmtVar.ad()) {
                            this.c.c();
                        }
                        aawr.k(acipVar, acipVar.w().h);
                        aboe aboeVar2 = new aboe(16, false, 1, "", null, null, null, null);
                        Q(aboeVar2);
                        avgjVar.s(aboeVar2);
                        H("ppedb", "currentPositionMs." + a() + ";durationMs." + aawr.e(acipVar), false);
                        return;
                    }
                    if (zhzVar.f) {
                        avgj avgjVar2 = this.p;
                        if (!avgjVar2.i().h() || aawr.n(avgjVar2.j())) {
                            wjf wjfVarB = b();
                            String strA = null;
                            String strG = wjfVarB != null ? wjfVarB.G() : null;
                            abog abogVar = this.r;
                            String strF = zhzVar.f();
                            boolean z3 = !zhzVar.g;
                            int i3 = 10;
                            if (strF.contains("net.unavailable")) {
                                i2 = R.string.common_no_network;
                                z = z3;
                            } else {
                                if (strF.contains("offline.nocontent")) {
                                    i2 = R.string.error_offline_no_streams;
                                } else {
                                    boolean zContains = strF.contains("net.connect");
                                    int i4 = R.string.unable_to_connect;
                                    if (zContains || strF.contains("net.connect.timeout") || strF.contains("net.dns")) {
                                        z = z3;
                                        i = 10;
                                        i2 = i4;
                                    } else {
                                        boolean zContains2 = strF.contains("net.retryexhausted");
                                        i4 = R.string.connection_to_server_lost;
                                        if (zContains2 || strF.contains("net.closed") || strF.contains("net.read") || strF.contains("net.read.timeout") || strF.contains("net.timeout")) {
                                            z = z3;
                                            i = 10;
                                            i2 = i4;
                                        } else if (strF.startsWith("fmt.unplayable")) {
                                            i2 = R.string.unsupported_video_format;
                                        } else if (strF.startsWith("drm.unimplemented")) {
                                            i2 = R.string.error_unsupported_device;
                                        } else if (strF.startsWith("drm.unavailable")) {
                                            i2 = R.string.error_drm_unavailable;
                                        } else {
                                            if (!strF.startsWith("drm.auth") || zhzVar.e(yvm.class) == null) {
                                                if (zhzVar.h()) {
                                                    z = false;
                                                    i = 7;
                                                } else {
                                                    if (strF.equals("policy.app")) {
                                                        i3 = 15;
                                                    } else {
                                                        z = z3;
                                                    }
                                                    i = i3;
                                                }
                                                i2 = R.string.problem_while_playing;
                                            } else {
                                                yvm yvmVar = (yvm) zhzVar.e(yvm.class);
                                                if (yvmVar != null) {
                                                    zB = yvmVar.b();
                                                    int i5 = true == zB ? 9 : 7;
                                                    strA = yvmVar.a();
                                                    i3 = i5;
                                                }
                                            }
                                            z = zB;
                                            i = i3;
                                            i2 = R.string.problem_while_playing;
                                        }
                                    }
                                    if (strA == null) {
                                        strA = abogVar.b.getString(i2);
                                    }
                                    aboeVar = new aboe(i, z, 1, strA, null, strG, strF, null);
                                    Q(aboeVar);
                                    if (aboeVar.a && avgjVar2.i().f()) {
                                        aawr.k(acipVar, a());
                                    }
                                    avgjVar2.s(aboeVar);
                                }
                                z = false;
                            }
                            i = 10;
                            if (strA == null) {
                                strA = abogVar.b.getString(i2);
                            }
                            aboeVar = new aboe(i, z, 1, strA, null, strG, strF, null);
                            Q(aboeVar);
                            if (aboeVar.a) {
                                aawr.k(acipVar, a());
                            }
                            avgjVar2.s(aboeVar);
                        } else {
                            avgjVar2.l(true);
                        }
                        if (!abmtVar.ad()) {
                            this.c.c();
                        }
                        F(8);
                        S();
                    }
                }
            }
        }
    }

    @Override // defpackage.yxg
    public final void j(yvu yvuVar) {
        throw null;
    }

    @Override // defpackage.yxg
    public final void k(long j, long j2) {
        throw null;
    }

    @Override // defpackage.yxg
    public final void l(String str) {
        throw null;
    }

    @Override // defpackage.yxg
    public final void m() {
        throw null;
    }

    @Override // defpackage.yxg
    public final void n() {
        throw null;
    }

    @Override // defpackage.yxg
    public final void o(long j, appa appaVar) {
        throw null;
    }

    @Override // defpackage.yxg
    public final void p(float f) {
        throw null;
    }

    @Override // defpackage.yxg
    public final void q() {
        throw null;
    }

    @Override // defpackage.yxg
    public final void r() {
        throw null;
    }

    @Override // defpackage.yxg
    public final void s(long j) {
        throw null;
    }

    @Override // defpackage.yxg
    public final void t(aphs aphsVar) {
        throw null;
    }

    @Override // defpackage.yxg
    public final void u() {
        throw null;
    }

    @Override // defpackage.yxg
    public final void v(long j, appa appaVar) {
        throw null;
    }

    @Override // defpackage.yxg
    public final void w(long j, appa appaVar) {
        throw null;
    }

    @Override // defpackage.yxg
    public final void x(StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadataList) {
        throw null;
    }

    @Override // defpackage.yxg
    public final void y() {
        avgj avgjVar = this.p;
        if (((acfg) avgjVar.a).aN()) {
            avgjVar.q(1);
            if (N()) {
                acip acipVar = this.a;
                abyv abyvVarP = acipVar.p();
                long j = acipVar.w().f;
                abzc abzcVar = abyvVarP.b;
                if (abzcVar != null && abyvVarP.f) {
                    abzcVar.q(j);
                }
                abzh abzhVar = abyvVarP.c;
                if (abzhVar != null) {
                    abzhVar.i(j);
                }
                if (!this.g.ad()) {
                    this.c.c();
                }
                F(4);
            }
        }
    }

    @Override // defpackage.yxg
    public final void z(arfb arfbVar) {
        throw null;
    }
}

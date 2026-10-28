package defpackage;

import com.google.protos.youtube.api.innertube.MediaFetchColdConfigOuterClass$MediaFetchColdConfig;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abmt {
    public final vyo a;
    public final tqj b;
    public final vxu c;
    public final vxz d;
    public final vxz e;
    public final vxz f;
    public final vxz g;
    public final vxz h;
    public final vxz i;
    public final vxz j;
    public final vxz k;
    public final vxz l;
    public final vxz m;
    public final vxz n;
    public final vxz o;
    public final vxz p;
    public final vxz q;
    public final vxz r;
    private final vxz s;

    public abmt(vxu vxuVar, vyo vyoVar, vxz vxzVar, vxz vxzVar2, vxz vxzVar3, vxz vxzVar4, vxz vxzVar5, vxz vxzVar6, vxz vxzVar7, vxz vxzVar8, vxz vxzVar9, vxz vxzVar10, vxz vxzVar11, vxz vxzVar12, tqj tqjVar, vxz vxzVar13, vxz vxzVar14, vxz vxzVar15, vxz vxzVar16) {
        this.c = vxuVar;
        this.a = vyoVar;
        this.d = vxzVar;
        this.e = vxzVar2;
        this.f = vxzVar3;
        this.g = vxzVar4;
        this.h = vxzVar5;
        this.i = vxzVar6;
        this.j = vxzVar7;
        this.k = vxzVar8;
        this.l = vxzVar9;
        this.m = vxzVar10;
        this.n = vxzVar11;
        this.s = vxzVar12;
        this.o = vxzVar13;
        this.b = tqjVar;
        this.p = vxzVar14;
        this.q = vxzVar15;
        this.r = vxzVar16;
    }

    public static boolean aG(vyo vyoVar) {
        aoqs aoqsVarR = r(vyoVar);
        return aoqsVarR != null && aoqsVarR.y;
    }

    public static boolean aM(vyo vyoVar) {
        anew anewVarQ = q(vyoVar);
        if (anewVarQ != null) {
            anfe anfeVar = anewVarQ.h;
            if (anfeVar == null) {
                anfeVar = anfe.a;
            }
            if (anfeVar.b) {
                return true;
            }
        }
        return false;
    }

    public static boolean aQ(vyo vyoVar) {
        aoqs aoqsVarR = r(vyoVar);
        return aoqsVarR != null && aoqsVarR.u;
    }

    public static boolean ai(vyo vyoVar, boolean z, boolean z2) {
        aizx aizxVarE = afxw.e(vyoVar);
        if (z2) {
            return aizxVarE.v;
        }
        return (aizxVarE != null && aizxVarE.j) || z;
    }

    public static boolean bC(vyo vyoVar) {
        aoqs aoqsVarR = r(vyoVar);
        return aoqsVarR != null && aoqsVarR.r;
    }

    public static boolean bJ(vyo vyoVar) {
        return afxw.e(vyoVar).aq;
    }

    public static boolean bW(vyo vyoVar) {
        return r(vyoVar).I;
    }

    public static boolean bp(vyo vyoVar) {
        return r(vyoVar).f;
    }

    public static boolean bs(vyo vyoVar) {
        aoqs aoqsVarR = r(vyoVar);
        return aoqsVarR != null && aoqsVarR.s;
    }

    public static boolean bt(vyo vyoVar) {
        aoqs aoqsVarR = r(vyoVar);
        return aoqsVarR != null && aoqsVarR.q;
    }

    public static boolean by(boolean z, vyo vyoVar) {
        return (z && r(vyoVar).g) ? false : true;
    }

    public static int c(vyo vyoVar) {
        aoqs aoqsVarR = r(vyoVar);
        if (aoqsVarR == null) {
            return 0;
        }
        aosk aoskVar = aoqsVarR.p;
        if (aoskVar == null) {
            aoskVar = aosk.a;
        }
        return aoskVar.b;
    }

    public static boolean cd(vyo vyoVar) {
        return r(vyoVar).k;
    }

    public static boolean ce(vyo vyoVar) {
        return r(vyoVar).o;
    }

    public static anag cm(vxu vxuVar) {
        if (vxuVar == null || vxuVar.c() == null) {
            return anag.a;
        }
        anag anagVar = vxuVar.c().o;
        return anagVar == null ? anag.a : anagVar;
    }

    public static aoqb cn(vxu vxuVar) {
        if (vxuVar == null || vxuVar.c() == null) {
            return null;
        }
        aoqb aoqbVar = vxuVar.c().r;
        return aoqbVar == null ? aoqb.a : aoqbVar;
    }

    public static boolean co(vxu vxuVar) {
        aoqb aoqbVarCn = cn(vxuVar);
        return aoqbVarCn != null && aoqbVarCn.e;
    }

    public static boolean cp(vxu vxuVar) {
        aoqb aoqbVarCn = cn(vxuVar);
        return aoqbVarCn != null && aoqbVarCn.f;
    }

    public static final boolean cq(vyo vyoVar) {
        aizx aizxVarE = afxw.e(vyoVar);
        return aizxVarE != null && aizxVarE.bT;
    }

    public static long k(vyo vyoVar, long j) {
        int i = r(vyoVar).e;
        return i != 0 ? i : j;
    }

    public static ajco p(vyo vyoVar) {
        ajco ajcoVar = r(vyoVar).c;
        return ajcoVar == null ? ajco.a : ajcoVar;
    }

    public static anew q(vyo vyoVar) {
        if (vyoVar == null || vyoVar.b() == null) {
            return anew.a;
        }
        anew anewVar = vyoVar.b().j;
        return anewVar == null ? anew.a : anewVar;
    }

    public static aoqs r(vyo vyoVar) {
        if (vyoVar == null || vyoVar.b() == null) {
            return aoqs.a;
        }
        aoqs aoqsVar = vyoVar.b().k;
        return aoqsVar == null ? aoqs.a : aoqsVar;
    }

    public final boolean A() {
        return this.g.l(161, 45664187L, false);
    }

    public final boolean B() {
        return this.g.l(163, 45664196L, false);
    }

    public final boolean C() {
        return this.g.l(350, 45758318L, false);
    }

    public final boolean D() {
        return this.g.l(352, 45758321L, false);
    }

    public final boolean E() {
        return this.g.l(250, 45715862L, false);
    }

    public final boolean F() {
        return this.g.m(159, 45663003L);
    }

    public final boolean G() {
        return this.h.m(108, 45615276L);
    }

    public final boolean H() {
        return this.g.l(492, 45836115L, false);
    }

    public final boolean I() {
        return this.g.l(211, 45691595L, false);
    }

    public final boolean J() {
        return this.g.m(99, 45619198L);
    }

    public final boolean K() {
        return this.g.l(303, 45737166L, false);
    }

    public final boolean L() {
        return this.g.l(238, 45710541L, false);
    }

    public final boolean M() {
        return this.n.l(318, 45793226L, false);
    }

    public final boolean N() {
        return this.g.l(490, 45835157L, false);
    }

    public final boolean O() {
        return this.e.l(68, 45377345L, false);
    }

    public final boolean P() {
        return this.g.l(136, 45645426L, false);
    }

    public final boolean Q() {
        return this.e.m(162, 45531571L);
    }

    public final boolean R() {
        return this.e.m(332, 45765560L);
    }

    public final boolean S() {
        return this.g.l(237, 45710410L, false);
    }

    public final boolean T() {
        return this.h.m(111, 45616427L);
    }

    public final boolean U() {
        return this.g.l(205, 45688637L, false);
    }

    public final boolean V() {
        return this.g.l(135, 45645357L, false);
    }

    public final boolean W() {
        return this.e.m(86, 45385509L);
    }

    public final boolean X() {
        return this.h.l(32, 45402200L, false);
    }

    public final boolean Y() {
        return aF() && this.g.l(384, 45778360L, false);
    }

    public final boolean Z() {
        return this.g.l(214, 45696146L, false);
    }

    public final int a() {
        return (int) this.e.d(55, 45755036L);
    }

    public final boolean aA() {
        return aF() && this.g.l(287, 45730351L, false);
    }

    public final boolean aB() {
        return this.g.l(296, 45732853L, false);
    }

    public final boolean aC() {
        return this.f.m(27, 45674556L);
    }

    public final boolean aD() {
        return this.g.l(489, 45833710L, false);
    }

    public final boolean aE() {
        return this.e.m(384, 45831390L);
    }

    public final boolean aF() {
        return this.g.l(240, 45712116L, false);
    }

    public final boolean aH() {
        return this.e.m(309, 45741396L);
    }

    public final boolean aI() {
        aoqs aoqsVarR = r(this.a);
        return aoqsVarR.z && !aoqsVarR.K;
    }

    public final boolean aJ() {
        return r(this.a).A;
    }

    public final boolean aK() {
        return this.e.m(355, 45800233L);
    }

    public final boolean aL() {
        return this.e.m(350, 45792786L);
    }

    public final boolean aN() {
        return this.g.l(469, 45819777L, false);
    }

    public final boolean aO() {
        return this.e.m(69, 45377654L);
    }

    public final boolean aP() {
        return this.g.l(370, 45770586L, false);
    }

    public final boolean aR() {
        return this.g.l(532, 45857125L, false);
    }

    public final boolean aS() {
        MediaFetchColdConfigOuterClass$MediaFetchColdConfig defaultInstance = cm(this.c).c;
        if (defaultInstance == null) {
            defaultInstance = MediaFetchColdConfigOuterClass$MediaFetchColdConfig.getDefaultInstance();
        }
        return defaultInstance.k;
    }

    public final boolean aT(wjf wjfVar) {
        return (wjfVar == null || wjfVar.V() || !this.e.l(338, 45773685L, false)) ? false : true;
    }

    public final boolean aU() {
        return this.g.l(531, 45857124L, false);
    }

    public final boolean aV() {
        return aF() && this.g.l(248, 45715380L, false);
    }

    public final boolean aW() {
        return this.g.l(171, 45673427L, false);
    }

    public final boolean aX() {
        return this.f.m(28, 45678040L);
    }

    public final boolean aY() {
        return this.f.m(23, 45640404L);
    }

    public final boolean aZ() {
        return this.h.m(96, 45531434L);
    }

    public final boolean aa() {
        return this.g.m(108, 45624102L);
    }

    public final boolean ab() {
        return this.j.l(175, 45702256L, false);
    }

    public final boolean ac() {
        return this.g.l(526, 45856777L, false);
    }

    public final boolean ad() {
        return this.g.l(530, 45857123L, false);
    }

    public final boolean ae() {
        return this.g.l(199, 45686127L, false);
    }

    public final boolean af() {
        return afxw.e(this.a).aw;
    }

    public final boolean ag() {
        return this.e.m(374, 45822856L) || this.g.m(473, 45822855L);
    }

    public final boolean ah() {
        return this.g.l(432, 45796322L, false);
    }

    public final boolean aj() {
        return this.e.l(4, 45361125L, false);
    }

    public final boolean ak() {
        return this.g.l(145, 45650826L, false);
    }

    public final boolean al() {
        return this.g.l(443, 45803835L, false);
    }

    public final boolean am() {
        return this.n.l(326, 45800190L, false);
    }

    public final boolean an() {
        return this.g.l(474, 45823622L, false);
    }

    public final boolean ao() {
        return this.g.l(244, 45714764L, false) || this.e.m(306, 45736884L);
    }

    public final boolean ap() {
        return this.g.m(330, 45752321L);
    }

    public final boolean aq() {
        return this.g.m(72, 45415263L);
    }

    public final boolean ar() {
        return this.e.l(325, 45757134L, false);
    }

    public final boolean as() {
        return this.g.l(416, 45792770L, false);
    }

    public final boolean at() {
        return this.g.l(397, 45784180L, false);
    }

    public final boolean au() {
        return this.e.m(368, 45817013L);
    }

    public final boolean av() {
        return this.e.l(345, 45781066L, false);
    }

    public final boolean aw() {
        return this.g.l(172, 45674825L, false);
    }

    public final boolean ax() {
        return this.g.m(466, 45817500L);
    }

    public final boolean ay() {
        return this.g.l(242, 45714295L, false);
    }

    public final boolean az() {
        return this.g.l(241, 45714294L, false);
    }

    public final int b() {
        return (int) this.e.d(54, 45755035L);
    }

    public final boolean bA() {
        return this.e.l(104, 45408049L, true);
    }

    public final boolean bB(long j) {
        return (this.g.c(55, 45823301L, 0L) & j) != 0;
    }

    public final boolean bD() {
        return this.l.l(5, 45384913L, false);
    }

    public final boolean bE() {
        return this.g.l(139, 45646808L, false);
    }

    public final boolean bF() {
        return this.e.m(279, 45694850L);
    }

    public final boolean bG() {
        return this.g.m(470, 45820250L);
    }

    public final boolean bH() {
        return this.g.l(475, 45823623L, false);
    }

    public final boolean bI() {
        return this.f.l(4, 45360803L, false);
    }

    public final boolean bK() {
        return this.g.m(109, 45624552L);
    }

    public final boolean bL() {
        return this.f.m(21, 45417435L);
    }

    public final boolean bM() {
        return this.f.m(16, 45371561L);
    }

    public final boolean bN() {
        return this.g.l(170, 45673165L, false);
    }

    public final boolean bO() {
        return this.g.l(48, 45398507L, false);
    }

    public final boolean bP() {
        return r(this.a).G;
    }

    public final boolean bQ() {
        return this.g.l(198, 45686124L, false);
    }

    public final boolean bR() {
        return this.g.l(272, 45725690L, false);
    }

    public final boolean bS() {
        return this.g.l(73, 45415907L, false);
    }

    public final boolean bT() {
        return this.g.l(320, 45746362L, false);
    }

    public final boolean bU() {
        return this.g.l(209, 45690536L, false);
    }

    public final boolean bV() {
        return this.g.l(78, 45421424L, false);
    }

    public final boolean bX() {
        return this.g.l(232, 45707059L, false);
    }

    public final boolean bY() {
        vxz vxzVar = this.e;
        return vxzVar != null && vxzVar.l(353, 45794964L, false);
    }

    public final boolean bZ() {
        return this.g.l(183, 45679445L, false);
    }

    public final boolean ba() {
        return this.g.l(477, 45824198L, false);
    }

    public final boolean bb() {
        return aF() && this.g.l(247, 45715373L, false);
    }

    public final boolean bc() {
        return this.g.l(355, 45758682L, false);
    }

    public final boolean bd() {
        return this.g.l(359, 45763732L, false);
    }

    public final boolean be() {
        int i = tqr.a;
        return this.b.k(1073840092);
    }

    public final boolean bf() {
        return this.f.m(18, 45398903L);
    }

    public final boolean bg() {
        return this.g.l(148, 45653755L, false);
    }

    public final boolean bh() {
        return this.g.m(207, 45689039L);
    }

    public final boolean bi() {
        return this.s.l(13, 45626249L, false);
    }

    public final boolean bj() {
        return this.g.l(476, 45823624L, false);
    }

    public final boolean bk() {
        return this.g.l(235, 45708919L, false);
    }

    public final boolean bl() {
        int i = tqr.a;
        return this.b.k(1073830464);
    }

    public final boolean bm() {
        return this.g.l(70, 45411738L, false);
    }

    public final boolean bn() {
        return this.e.m(231, 45647164L);
    }

    public final boolean bo() {
        return this.g.l(26, 45376611L, false);
    }

    public final boolean bq() {
        return this.g.l(427, 45794501L, false);
    }

    public final boolean br() {
        int i = tqr.a;
        return this.b.k(1073830151);
    }

    public final boolean bu() {
        int i = tqr.a;
        return this.b.k(1073840109);
    }

    public final boolean bv() {
        return this.n.l(280, 45767901L, false);
    }

    public final boolean bw() {
        return this.n.l(294, 45773966L, false);
    }

    public final boolean bx(long j) {
        return (this.g.c(20, 45624290L, 0L) & j) != 0;
    }

    public final boolean bz() {
        tqj tqjVar = this.b;
        if (tqjVar != null) {
            int i = tqr.a;
            if (tqjVar.k(1073816117)) {
                return true;
            }
        }
        return false;
    }

    public final boolean ca() {
        return this.h.m(110, 45615662L);
    }

    public final boolean cb() {
        return this.g.l(220, 45700053L, false);
    }

    public final boolean cc() {
        return this.g.l(160, 45663370L, false);
    }

    public final boolean cf() {
        return this.g.l(196, 45684912L, false);
    }

    public final boolean cg() {
        return this.e.l(361, 45807212L, false);
    }

    public final boolean ch() {
        return this.e.l(361, 45807212L, false);
    }

    public final boolean ci() {
        return this.g.l(263, 45720768L, false);
    }

    public final boolean cj() {
        return this.g.l(178, 45678829L, false);
    }

    public final boolean ck() {
        return this.f.l(5, 45360907L, false);
    }

    public final boolean cl() {
        return this.g.l(114, 45633863L, false);
    }

    public final int d() {
        return (int) this.g.c(38, 45737899L, 0L);
    }

    public final int e() {
        return (int) this.g.c(40, 45737901L, 0L);
    }

    public final int f() {
        return (int) this.g.c(41, 45737902L, 0L);
    }

    public final int g() {
        return (int) this.g.c(39, 45737900L, 0L);
    }

    public final int h() {
        return (int) this.g.c(42, 45737903L, 0L);
    }

    public final int i() {
        return (int) this.g.c(43, 45737904L, 0L);
    }

    public final long j() {
        return this.g.c(9, 45382718L, 0L);
    }

    public final long l() {
        return this.g.c(27, 45700054L, 10000L);
    }

    public final long m() {
        return this.e.d(56, 45765561L);
    }

    public final long n() {
        return this.e.d(35, 45631608L);
    }

    public final long o() {
        return this.e.d(34, 45631607L);
    }

    public final Duration s() {
        return Duration.ofSeconds(this.j.c(20, 45702258L, 86400L));
    }

    public final boolean t() {
        return !this.p.l(19, 45631494L, false);
    }

    public final boolean u() {
        return this.e.m(367, 45816858L);
    }

    public final boolean v() {
        return this.g.l(497, 45838104L, false);
    }

    public final boolean w() {
        return this.g.m(521, 45853349L);
    }

    public final boolean x() {
        return this.g.l(501, 45840961L, false);
    }

    public final boolean y() {
        return this.g.l(377, 45774709L, false);
    }

    public final boolean z() {
        return this.g.m(528, 45857115L);
    }
}

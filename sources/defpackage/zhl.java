package defpackage;

import com.google.cardboard.sdk.R;
import com.google.protos.youtube.api.innertube.MediaFetchColdConfigOuterClass$MediaFetchColdConfig;
import com.google.protos.youtube.api.innertube.MediaFetchHotConfigOuterClass$MediaFetchHotConfig;
import java.util.List;
import java.util.Observable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zhl extends Observable {
    public static int a = 500;
    public static int b = 5;
    public static int c = 2;
    private static final zhk q = new zhk();
    public final vyo d;
    public boolean e;
    public boolean f;
    protected final tfq g;
    public final vxz h;
    public final vxz i;
    public final vxz j;
    public final vxz k;
    public final vxz l;
    public final vxz m;
    public final vxz n;
    public final vxz o;
    public final vxz p;
    private avmn r;
    private avmn s;
    private final vxu t;
    private final vxz u;
    private final vxz v;

    public zhl(vyo vyoVar, vxu vxuVar, vxz vxzVar, vxz vxzVar2, vxz vxzVar3, vxz vxzVar4, vxz vxzVar5, vxz vxzVar6, vxz vxzVar7, tfq tfqVar, vxz vxzVar8, vxz vxzVar9, vxz vxzVar10, vxz vxzVar11) {
        this.d = vyoVar;
        this.t = vxuVar;
        this.h = vxzVar;
        this.i = vxzVar2;
        this.j = vxzVar3;
        this.k = vxzVar4;
        this.l = vxzVar5;
        this.u = vxzVar6;
        this.m = vxzVar7;
        this.g = tfqVar;
        this.n = vxzVar8;
        this.o = vxzVar9;
        this.v = vxzVar10;
        this.p = vxzVar11;
        avlr avlrVarD = vyoVar.d();
        int i = zic.a;
        avlrVarD.af(new xwu(this, 5));
        int iC = (int) vxzVar3.c(14, 45399931L, 0L);
        int iC2 = (int) vxzVar3.c(15, 45399932L, 0L);
        int iC3 = (int) vxzVar3.c(16, 45399933L, 0L);
        if (iC > 0) {
            a = iC;
        }
        if (iC2 > 0) {
            b = iC2;
        }
        if (iC3 > 0) {
            c = iC3;
        }
        int iC4 = (int) vxzVar2.c(12, 45416782L, 0L);
        int iC5 = (int) vxzVar2.c(13, 45416783L, 0L);
        int iC6 = (int) vxzVar2.c(14, 45416784L, 0L);
        if (iC4 > 0) {
            a = iC4;
        }
        if (iC5 > 0) {
            b = iC5;
        }
        if (iC6 > 0) {
            c = iC6;
        }
        q.a = vxzVar3.m(228, 45645412L);
    }

    public static apbx ab(vyo vyoVar) {
        anew anewVar = vyoVar.b().j;
        if (anewVar == null) {
            anewVar = anew.a;
        }
        apbx apbxVar = anewVar.d;
        return apbxVar == null ? apbx.b : apbxVar;
    }

    public static boolean bM(vyo vyoVar) {
        aoqs aoqsVar = vyoVar.b().k;
        if (aoqsVar == null) {
            aoqsVar = aoqs.a;
        }
        return aoqsVar.E;
    }

    private final anew eO() {
        anew anewVar = this.d.b().j;
        return anewVar == null ? anew.a : anewVar;
    }

    public static boolean ek() {
        return q.a;
    }

    public final long A() {
        return this.h.c(3, 45352579L, 0L);
    }

    public final long B() {
        long j = S().p;
        if (j <= 0) {
            return 1000L;
        }
        return j;
    }

    public final long C() {
        long j = S().q;
        if (j <= 0) {
            return 1000L;
        }
        return j;
    }

    public final long D() {
        return this.i.d(57, 45836294L);
    }

    public final long E() {
        return this.j.c(9, 45388772L, 0L);
    }

    public final long F() {
        return this.i.d(53, 45793487L);
    }

    public final long G() {
        return this.i.c(7, 45369538L, 0L);
    }

    public final long H() {
        return this.i.c(6, 45368594L, 0L);
    }

    public final long I() {
        return this.j.d(12, 45390926L);
    }

    public final long J() {
        return this.j.c(10, 45390057L, 0L);
    }

    public final long K() {
        return Z().l;
    }

    public final long L() {
        return S().w;
    }

    public final long M() {
        return this.i.d(52, 45792995L);
    }

    public final long N() {
        vxz vxzVar = this.j;
        if (vxzVar.m(95, 45400486L)) {
            return 0L;
        }
        long jD = vxzVar.d(19, 45400487L);
        if (jD > 0) {
            return jD;
        }
        return 5000L;
    }

    public final long O() {
        return this.l.d(0, 45621361L);
    }

    public final long P() {
        return this.j.d(43, 45654168L);
    }

    public final ajbu Q() {
        ajbu ajbuVar = U().b;
        return ajbuVar == null ? ajbu.a : ajbuVar;
    }

    public final ajbv R() {
        ajbv ajbvVar = eO().g;
        return ajbvVar == null ? ajbv.a : ajbvVar;
    }

    public final akwn S() {
        akwn akwnVar = eO().f;
        return akwnVar == null ? akwn.a : akwnVar;
    }

    public final akxc T() {
        if ((Z().b & 524288) != 0) {
            akxc akxcVar = Z().k;
            return akxcVar == null ? akxc.a : akxcVar;
        }
        aihf aihfVarCreateBuilder = akxc.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        akxc akxcVar2 = (akxc) aihfVarCreateBuilder.instance;
        akxcVar2.b |= 1;
        akxcVar2.c = 1000;
        aihfVarCreateBuilder.copyOnWrite();
        akxc akxcVar3 = (akxc) aihfVarCreateBuilder.instance;
        akxcVar3.b |= 2;
        akxcVar3.d = 2.0f;
        aihfVarCreateBuilder.copyOnWrite();
        akxc akxcVar4 = (akxc) aihfVarCreateBuilder.instance;
        akxcVar4.b |= 8;
        akxcVar4.f = 0.5f;
        return (akxc) aihfVarCreateBuilder.build();
    }

    public final anag U() {
        anag anagVar = this.t.c().o;
        return anagVar == null ? anag.a : anagVar;
    }

    public final MediaFetchColdConfigOuterClass$MediaFetchColdConfig V() {
        MediaFetchColdConfigOuterClass$MediaFetchColdConfig mediaFetchColdConfigOuterClass$MediaFetchColdConfig = U().c;
        return mediaFetchColdConfigOuterClass$MediaFetchColdConfig == null ? MediaFetchColdConfigOuterClass$MediaFetchColdConfig.getDefaultInstance() : mediaFetchColdConfigOuterClass$MediaFetchColdConfig;
    }

    public final MediaFetchHotConfigOuterClass$MediaFetchHotConfig W() {
        MediaFetchHotConfigOuterClass$MediaFetchHotConfig mediaFetchHotConfigOuterClass$MediaFetchHotConfig = eO().l;
        return mediaFetchHotConfigOuterClass$MediaFetchHotConfig == null ? MediaFetchHotConfigOuterClass$MediaFetchHotConfig.getDefaultInstance() : mediaFetchHotConfigOuterClass$MediaFetchHotConfig;
    }

    public final aojm X() {
        anhb anhbVar = this.t.c().j;
        if (anhbVar == null) {
            anhbVar = anhb.a;
        }
        aojm aojmVar = anhbVar.n;
        return aojmVar == null ? aojm.b : aojmVar;
    }

    public final aojn Y() {
        aojp aojpVar = eO().c;
        if (aojpVar == null) {
            aojpVar = aojp.a;
        }
        aojn aojnVar = aojpVar.g;
        return aojnVar == null ? aojn.a : aojnVar;
    }

    public final aojp Z() {
        aojp aojpVar = eO().c;
        return aojpVar == null ? aojp.a : aojpVar;
    }

    public final float a() {
        return (float) this.i.b(4, 45726786L);
    }

    public final boolean aA() {
        return this.j.m(238, 45653895L);
    }

    public final boolean aB() {
        return this.j.m(31, 45368864L);
    }

    public final boolean aC() {
        return this.i.l(490, 45835157L, false);
    }

    public final boolean aD() {
        return S().o;
    }

    public final boolean aE() {
        return this.j.l(40, 45370176L, false);
    }

    public final boolean aF() {
        return this.j.l(34, 45369959L, false);
    }

    public final boolean aG() {
        return S().ai;
    }

    public final boolean aH() {
        return this.j.m(304, 45731110L);
    }

    public final boolean aI() {
        return this.l.m(56, 45768045L);
    }

    public final boolean aJ() {
        if (this.s == null) {
            vxz vxzVar = this.j;
            this.f = vxzVar.m(51, 45374900L);
            this.s = vxzVar.p(51, 45374900L).af(new zgd(this, 2));
        }
        return this.f;
    }

    public final boolean aK() {
        return this.i.m(264, 45721040L);
    }

    public final boolean aL() {
        return S().u;
    }

    public final boolean aM() {
        return this.j.m(287, 45708711L);
    }

    public final boolean aN() {
        return S().v;
    }

    public final boolean aO() {
        return this.j.m(286, 45708707L);
    }

    public final boolean aP() {
        return this.j.m(153, 45462819L);
    }

    public final boolean aQ() {
        return R().j > 0;
    }

    public final boolean aR() {
        return this.j.m(334, 45766792L);
    }

    public final boolean aS() {
        return this.i.l(428, 45794782L, false);
    }

    public final boolean aT() {
        if (this.r == null) {
            vxz vxzVar = this.j;
            this.e = vxzVar.m(62, 45376743L);
            this.r = vxzVar.p(62, 45376743L).af(new xwu(this, 4));
        }
        return this.e;
    }

    public final boolean aU() {
        return this.i.m(482, 45830522L);
    }

    public final boolean aV() {
        return this.i.l(529, 45857122L, false);
    }

    public final boolean aW() {
        return this.j.m(362, 45807264L);
    }

    public final boolean aX() {
        return this.i.m(420, 45793122L);
    }

    public final boolean aY() {
        return this.i.m(362, 45765624L);
    }

    public final boolean aZ() {
        return W().o;
    }

    public final apbm aa() {
        apbm apbmVar = eO().j;
        return apbmVar == null ? apbm.a : apbmVar;
    }

    public final avlr ac() {
        return this.d.c(new xdx(11));
    }

    public final avlr ad() {
        return this.j.p(74, 45379401L);
    }

    public final List ae() {
        vxz vxzVar = this.j;
        vxzVar.h(2, 45626850L);
        return vxzVar.h(2, 45626850L).b;
    }

    public final List af() {
        return this.j.h(6, 45714686L).b;
    }

    public final List ag() {
        return this.j.h(5, 45714685L).b;
    }

    public final List ah() {
        return S().M;
    }

    public abstract void ai();

    public final boolean aj() {
        return this.i.m(103, 45621336L);
    }

    public final boolean ak() {
        return this.i.l(30, 45377773L, false);
    }

    public final boolean al() {
        return this.j.m(242, 45658487L);
    }

    public final boolean am() {
        return this.j.m(194, 45622834L);
    }

    public final boolean an() {
        return this.i.m(295, 45732650L);
    }

    public final boolean ao() {
        return this.i.l(405, 45788607L, false);
    }

    public final boolean ap() {
        return this.j.m(234, 45647783L);
    }

    public final boolean aq() {
        return this.i.l(185, 45681203L, false);
    }

    public final boolean ar() {
        return this.j.l(156, 45477257L, false);
    }

    public final boolean as() {
        return this.j.l(157, 45477258L, false);
    }

    public final boolean at() {
        return this.j.m(291, 45714599L);
    }

    public final boolean au() {
        return this.i.m(464, 45816113L);
    }

    public final boolean av() {
        return S().af;
    }

    public final boolean aw() {
        return S().j;
    }

    public final boolean ax() {
        return W().n;
    }

    public final boolean ay() {
        return this.i.m(483, 45830723L);
    }

    public final boolean az() {
        return this.i.l(51, 45400495L, false);
    }

    public final float b() {
        return (float) this.i.b(3, 45726785L);
    }

    public final boolean bA() {
        return this.i.m(353, 45758322L);
    }

    public final boolean bB() {
        return this.i.m(504, 45841177L);
    }

    public final boolean bC() {
        return this.i.m(279, 45727453L);
    }

    public final boolean bD() {
        return this.i.l(484, 45830798L, false);
    }

    public final boolean bE() {
        return this.j.m(261, 45679207L);
    }

    public final boolean bF() {
        MediaFetchColdConfigOuterClass$MediaFetchColdConfig defaultInstance = U().c;
        if (defaultInstance == null) {
            defaultInstance = MediaFetchColdConfigOuterClass$MediaFetchColdConfig.getDefaultInstance();
        }
        return defaultInstance.e;
    }

    public final boolean bG() {
        return this.i.l(176, 45677065L, false);
    }

    public final boolean bH() {
        return this.i.m(434, 45798722L);
    }

    public final boolean bI() {
        return V().f;
    }

    public final boolean bJ() {
        return this.j.l(104, 45408049L, true);
    }

    public final boolean bK() {
        return this.j.m(384, 45831390L);
    }

    public final boolean bL() {
        return this.i.l(363, 45765988L, false);
    }

    public final boolean bN() {
        return this.j.m(350, 45792786L);
    }

    public final boolean bO() {
        return this.j.m(351, 45793960L);
    }

    public final boolean bP() {
        return this.j.m(347, 45787123L);
    }

    public final boolean bQ() {
        return this.i.m(262, 45720636L);
    }

    public final boolean bR() {
        return V().k;
    }

    public final boolean bS() {
        return this.i.m(418, 45792990L);
    }

    public final boolean bT() {
        return this.j.m(314, 45746716L);
    }

    public final boolean bU() {
        return this.j.m(315, 45746717L);
    }

    public final boolean bV() {
        return this.i.m(410, 45791374L);
    }

    public final boolean bW() {
        return this.j.m(342, 45775212L);
    }

    public final boolean bX() {
        if (bZ()) {
            return (S().B && this.g.j(1)) ? false : true;
        }
        return false;
    }

    public final boolean bY() {
        return S().N;
    }

    public final boolean bZ() {
        if (bY() || ca()) {
            return ah().isEmpty() || ah().contains(Integer.valueOf(this.g.a()));
        }
        return false;
    }

    public final boolean ba() {
        return this.i.m(445, 45805296L);
    }

    public final boolean bb() {
        return this.i.m(446, 45805297L);
    }

    public final boolean bc() {
        return this.i.m(424, 45793958L);
    }

    public final boolean bd() {
        return this.i.m(514, 45846660L);
    }

    public final boolean be() {
        return this.i.m(412, 45791376L);
    }

    public final boolean bf() {
        return this.i.m(332, 45753350L);
    }

    public final boolean bg() {
        return this.i.m(413, 45791377L);
    }

    public final boolean bh() {
        return this.i.m(458, 45808635L);
    }

    public final boolean bi() {
        return this.i.m(493, 45836295L);
    }

    public final boolean bj() {
        return this.j.m(296, 45719140L);
    }

    public final boolean bk() {
        return this.j.l(38, 45370161L, false);
    }

    public final boolean bl() {
        int iAV = a.aV(R().d);
        return iAV != 0 && iAV == 4;
    }

    public final boolean bm() {
        return this.i.m(525, 45856429L);
    }

    public final boolean bn() {
        return this.i.m(459, 45808639L);
    }

    public final boolean bo() {
        return this.j.m(379, 45826521L);
    }

    public final boolean bp() {
        return this.i.l(336, 45755445L, false);
    }

    public final boolean bq() {
        return R().z;
    }

    public final boolean br() {
        return this.i.l(10, 45364757L, false);
    }

    public final boolean bs() {
        return this.i.m(510, 45843759L);
    }

    public final boolean bt() {
        return this.j.m(213, 45633243L);
    }

    public final boolean bu() {
        return this.i.m(422, 45793486L);
    }

    public final boolean bv() {
        return W().A;
    }

    public final boolean bw() {
        return this.i.m(301, 45735136L);
    }

    public final boolean bx() {
        return this.j.m(363, 45811632L);
    }

    public final boolean by() {
        return this.i.m(369, 45769216L);
    }

    public final boolean bz() {
        return this.i.l(403, 45787427L, false);
    }

    public final float c() {
        return (float) this.i.b(5, 45817986L);
    }

    public final boolean cA() {
        return this.i.m(401, 45784793L);
    }

    public final boolean cB() {
        return this.i.m(112, 45628168L);
    }

    public final boolean cC() {
        return S().an;
    }

    public final boolean cD() {
        return this.i.m(433, 45797229L);
    }

    public final boolean cE() {
        return this.l.m(34, 45675241L);
    }

    public final boolean cF() {
        return this.i.m(472, 45822248L) || this.j.m(373, 45822247L);
    }

    public final boolean cG() {
        return this.i.m(393, 45782959L);
    }

    public final boolean cH() {
        return this.v.m(79, 45422369L);
    }

    public final boolean cI() {
        return this.p.m(14, 45627566L);
    }

    public final boolean cJ() {
        return this.i.m(429, 45794946L);
    }

    public final boolean cK() {
        return this.j.m(250, 45661432L);
    }

    public final boolean cL() {
        return S().W;
    }

    public final boolean cM() {
        return Z().n;
    }

    public final boolean cN() {
        return this.j.l(208, 45631854L, false);
    }

    public final boolean cO() {
        return this.j.m(161, 45531107L);
    }

    public final boolean cP() {
        return this.j.m(174, 45616824L);
    }

    public final boolean cQ() {
        return this.j.m(92, 45400072L);
    }

    public final boolean cR() {
        return this.j.m(173, 45615465L);
    }

    public final boolean cS() {
        return this.i.m(414, 45792568L);
    }

    public final boolean cT() {
        return this.j.l(206, 45631292L, false);
    }

    public final boolean cU() {
        return this.j.m(R.styleable.AppCompatTheme_windowMinWidthMinor, 45424083L);
    }

    public final boolean cV() {
        return this.j.m(231, 45647164L);
    }

    public final boolean cW() {
        return this.j.m(297, 45719876L);
    }

    public final boolean cX() {
        return this.i.m(506, 45842533L);
    }

    public final boolean cY() {
        return S().r;
    }

    public final boolean cZ() {
        return this.i.m(338, 45756614L);
    }

    public final boolean ca() {
        return S().O;
    }

    public final boolean cb() {
        return this.j.m(328, 45761308L);
    }

    public final boolean cc() {
        return this.i.l(394, 45783288L, false);
    }

    public final boolean cd() {
        return this.i.m(425, 45794351L);
    }

    public final boolean ce() {
        return this.i.m(408, 45791344L);
    }

    public final boolean cf() {
        return this.i.m(498, 45838557L);
    }

    public final boolean cg() {
        return this.i.m(517, 45849092L);
    }

    public final boolean ch() {
        return this.j.l(383, 45831385L, false);
    }

    public final boolean ci() {
        return this.j.l(382, 45831384L, false);
    }

    public final boolean cj() {
        return this.i.m(522, 45853422L);
    }

    public final boolean ck() {
        return this.j.l(366, 45816521L, false);
    }

    public final boolean cl() {
        return this.i.m(503, 45841162L);
    }

    public final boolean cm() {
        return this.i.m(516, 45848351L);
    }

    public final boolean cn() {
        return this.i.m(518, 45849242L);
    }

    public final boolean co() {
        return this.j.l(371, 45817985L, false);
    }

    public final boolean cp() {
        return this.i.m(507, 45843430L);
    }

    public final boolean cq() {
        return this.i.m(519, 45849618L);
    }

    public final boolean cr() {
        return this.i.m(509, 45843738L);
    }

    public final boolean cs() {
        return this.j.m(386, 45832950L);
    }

    public final boolean ct() {
        return this.i.m(533, 45858895L);
    }

    public final boolean cu() {
        return this.j.l(370, 45817411L, false);
    }

    public final boolean cv() {
        return this.i.m(215, 45697229L);
    }

    public final boolean cw() {
        return this.i.m(419, 45793040L);
    }

    public final boolean cx() {
        return this.j.l(364, 45815565L, false);
    }

    public final boolean cy() {
        return this.i.m(496, 45837387L);
    }

    public final boolean cz() {
        return this.i.m(386, 45779747L);
    }

    public final int d() {
        return S().n;
    }

    public final boolean dA() {
        return this.i.m(488, 45832940L);
    }

    public final boolean dB() {
        return this.i.m(409, 45791345L);
    }

    public final boolean dC() {
        return this.j.m(274, 45693079L);
    }

    public final boolean dD() {
        return this.j.m(260, 45676322L);
    }

    public final boolean dE() {
        return this.j.m(225, 45642328L);
    }

    public boolean dF() {
        int iAs = ahng.as(S().i);
        return iAs != 0 && iAs == 5;
    }

    public final boolean dG() {
        return this.l.m(27, 45669759L);
    }

    public final boolean dH() {
        return this.l.m(66, 45780092L);
    }

    public final boolean dI() {
        return this.j.m(151, 45460221L);
    }

    public final boolean dJ() {
        return this.l.m(75, 45853402L);
    }

    public final boolean dK() {
        return this.l.l(57, 45778192L, false);
    }

    public final boolean dL() {
        return this.l.l(68, 45784123L, false);
    }

    public final boolean dM() {
        return this.l.l(65, 45780091L, false);
    }

    public final boolean dN() {
        return this.l.l(74, 45846809L, false);
    }

    public final boolean dO() {
        return this.l.m(67, 45781001L);
    }

    public final boolean dP() {
        return this.l.m(53, 45746771L);
    }

    public final boolean dQ() {
        return this.l.m(3, 45620613L);
    }

    public final boolean dR() {
        return this.k.m(1, 45698689L);
    }

    public final boolean dS() {
        return Q().d;
    }

    public final boolean dT() {
        return this.j.m(308, 45741029L);
    }

    public final boolean dU() {
        return this.j.m(150, 45460166L);
    }

    public final boolean dV() {
        return this.j.m(389, 45842276L);
    }

    public final boolean dW() {
        return S().y;
    }

    public final boolean dX() {
        return this.j.m(187, 45619570L);
    }

    public final boolean dY() {
        return this.l.m(17, 45655276L);
    }

    public final boolean dZ() {
        return this.i.l(118, 45638293L, false);
    }

    public final boolean da() {
        return this.i.m(276, 45726783L);
    }

    public final boolean db() {
        return this.u.m(3, 45355429L);
    }

    public final boolean dc() {
        return this.j.m(154, 45476079L);
    }

    public final boolean dd() {
        aple apleVar = eO().k;
        if (apleVar == null) {
            apleVar = aple.a;
        }
        return apleVar.b;
    }

    public final boolean de() {
        return this.j.m(159, 45478008L);
    }

    public final boolean df() {
        return this.i.l(43, 45386955L, false);
    }

    public final boolean dg() {
        return this.i.m(75, 45417407L);
    }

    public final boolean dh() {
        return this.i.m(40, 45385688L);
    }

    public final boolean di() {
        return this.i.m(339, 45756615L);
    }

    public final boolean dj() {
        return this.i.m(56, 45401047L);
    }

    public final boolean dk() {
        return this.i.m(327, 45748954L);
    }

    public final boolean dl() {
        return this.i.m(387, 45780069L);
    }

    public final boolean dm() {
        return this.j.m(360, 45803564L);
    }

    public final boolean dn() {
        return this.h.m(14, 45356963L);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final boolean m948do() {
        return d() > 0 || dW();
    }

    public final boolean dp() {
        return eL() != 2;
    }

    public final boolean dq() {
        return this.j.d(29, 45618268L) > 0;
    }

    public final boolean dr() {
        return this.j.l(46, 45373994L, false);
    }

    public final boolean ds() {
        return this.j.m(167, 45572243L);
    }

    public final boolean dt() {
        return R().u;
    }

    public final boolean du() {
        return this.i.l(462, 45811635L, false);
    }

    public final boolean dv() {
        return this.h.m(15, 45357409L);
    }

    public final boolean dw() {
        return this.j.m(356, 45800574L);
    }

    public final boolean dx() {
        return this.i.l(200, 45686592L, false);
    }

    public final boolean dy() {
        return S().ad;
    }

    public final boolean dz() {
        return this.j.m(317, 45752617L);
    }

    public final int e() {
        return S().c;
    }

    public final boolean eA() {
        return V().j;
    }

    public final boolean eB() {
        return this.j.m(257, 45670895L);
    }

    public final boolean eC() {
        return this.i.m(465, 45816307L);
    }

    public final boolean eD() {
        return this.i.m(479, 45826632L);
    }

    public final boolean eE() {
        return R().q;
    }

    public final boolean eF() {
        return this.i.m(83, 45430409L);
    }

    public final boolean eG() {
        return this.i.m(486, 45831644L);
    }

    public final boolean eH() {
        return this.i.m(337, 45756613L);
    }

    public final boolean eI() {
        return this.j.l(73, 45379400L, false);
    }

    public final boolean eJ() {
        return this.j.m(270, 45687333L);
    }

    public final boolean eK() {
        vxz vxzVar = this.i;
        vxzVar.o();
        return vxzVar.o().b.contains(45382718L);
    }

    public final int eL() {
        int iBa = a.ba(Long.valueOf(this.h.c(1, 45352575L, 0L)).intValue());
        if (iBa == 0) {
            return 2;
        }
        return iBa;
    }

    public final int eM() {
        int iBc = a.bc(R().e);
        if (iBc == 0) {
            return 1;
        }
        return iBc;
    }

    public final int eN() {
        int iO = atqp.O(S().t);
        if (iO == 0) {
            return 2;
        }
        return iO;
    }

    public final boolean ea() {
        return this.j.m(380, 45826528L);
    }

    public final boolean eb() {
        return this.l.m(33, 45675205L);
    }

    public final boolean ec() {
        return this.i.l(106, 45622613L, false);
    }

    public final boolean ed() {
        return this.j.m(217, 45637300L);
    }

    public final boolean ee() {
        return this.j.d(29, 45618268L) == 1;
    }

    public final boolean ef() {
        return this.i.m(440, 45801524L);
    }

    public final boolean eg() {
        return this.j.m(220, 45638748L);
    }

    public final boolean eh() {
        return this.i.l(379, 45776199L, false);
    }

    public final boolean ei() {
        return this.j.l(215, 45633892L, false);
    }

    public final boolean ej() {
        return this.i.l(269, 45725426L, false);
    }

    public final boolean el() {
        return this.j.m(186, 45619067L);
    }

    public final boolean em() {
        return this.j.m(99, 45402586L);
    }

    public final boolean en() {
        return this.j.m(131, 45426129L);
    }

    public final boolean eo() {
        return this.j.m(210, 45632537L);
    }

    public final boolean ep() {
        return this.l.m(19, 45657303L);
    }

    public final boolean eq() {
        return this.j.m(375, 45823253L);
    }

    public final boolean er() {
        return R().f;
    }

    public final boolean es() {
        return this.i.m(390, 45782279L);
    }

    public final boolean et() {
        return this.i.m(391, 45782301L);
    }

    public final boolean eu() {
        return this.j.m(282, 45701620L);
    }

    public final boolean ev() {
        return this.i.m(226, 45703806L);
    }

    public final boolean ew() {
        return this.j.m(302, 45727230L);
    }

    public final boolean ex() {
        return this.j.m(290, 45712886L);
    }

    public final boolean ey() {
        return this.i.m(437, 45800046L);
    }

    public final boolean ez() {
        return this.i.l(4, 45361050L, false);
    }

    public final int f() {
        anfe anfeVar = eO().h;
        if (anfeVar == null) {
            anfeVar = anfe.a;
        }
        int i = anfeVar.c;
        if (i == 0) {
            return 360;
        }
        return i;
    }

    public final int g() {
        return (int) this.j.d(40, 45652234L);
    }

    public final int h() {
        vxz vxzVar = this.j;
        if (vxzVar.d(41, 45652235L) > 0) {
            return (int) vxzVar.d(41, 45652235L);
        }
        return 4;
    }

    public final int i() {
        vxz vxzVar = this.j;
        if (vxzVar.d(42, 45652236L) > 0) {
            return (int) vxzVar.d(42, 45652236L);
        }
        return 4;
    }

    public final int j() {
        return (int) this.j.d(39, 45652233L);
    }

    public final int k() {
        return (int) this.j.d(58, 45820951L);
    }

    public final int l() {
        return (int) this.i.d(51, 45791378L);
    }

    public final int m() {
        return (int) this.j.d(30, 45619215L);
    }

    public final int n() {
        return S().X * 1000;
    }

    public final int o() {
        return Y().q;
    }

    public final int p() {
        return (int) this.i.d(33, 45731069L);
    }

    public final int q() {
        int i = X().j;
        if (i <= 0) {
            return 8000;
        }
        return i;
    }

    public final int r() {
        int i = X().k;
        if (i <= 0) {
            return 8000;
        }
        return i;
    }

    public final int s() {
        return (int) this.j.d(31, 45619217L);
    }

    public final int t() {
        return (int) this.j.d(50, 45681666L);
    }

    public final int u() {
        return (int) this.j.d(57, 45811634L);
    }

    public final long v() {
        return this.i.c(9, 45382718L, 0L);
    }

    public final long w() {
        return this.i.d(32, 45721497L);
    }

    public final long x() {
        return this.j.d(13, 45398789L);
    }

    public final long y() {
        return this.i.d(48, 45774466L);
    }

    public final long z() {
        return R().A;
    }
}

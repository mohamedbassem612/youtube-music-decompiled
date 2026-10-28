package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.activities.MusicActivity;
import com.google.android.apps.youtube.music.blocks.YoutubeActivityAccountContainer;
import com.google.android.apps.youtube.music.playlist.customthumbnail.CustomThumbnailCreationActivity;
import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.elements.interfaces.ComponentConfig;
import com.google.android.libraries.elements.interfaces.DirectUpdateDataRelay;
import com.google.android.libraries.elements.interfaces.ForeignFunction;
import com.google.android.libraries.elements.interfaces.PerformOnceCommandController;
import com.google.android.libraries.elements.interfaces.TemplateResolver;
import com.google.cardboard.sdk.R;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.elements.DirectUpdatePropertiesOuterClass$DirectUpdateProperties;
import com.google.protos.youtube.elements.ExecuteJsFunctionCommand$ExecuteJSFunctionCommand;
import com.youtube.android.libraries.elements.templates.UnifiedTemplateResolver;
import j$.util.Optional;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gjt implements afnu, aupg {
    aupr A;
    aupr B;
    aupr C;
    aupr D;
    aupr E;
    aupr F;
    aupr G;
    aupr H;
    aupr I;
    aupr J;
    aupr K;
    aupr L;
    aupr M;
    aupr N;
    aupr O;
    aupr P;
    aupr Q;
    aupr R;
    aupr S;
    aupr T;
    aupr U;
    aupr V;
    aupr W;
    aupr X;
    aupr Y;
    aupr Z;
    public final Activity a;
    aupr aA;
    aupr aB;
    aupr aC;
    aupr aD;
    aupr aE;
    aupr aF;
    aupr aG;
    aupr aH;
    aupr aI;
    aupr aJ;
    aupr aK;
    aupr aL;
    aupr aM;
    aupr aN;
    aupr aO;
    aupr aP;
    aupr aQ;
    aupr aR;
    aupr aS;
    aupr aT;
    aupr aU;
    aupr aV;
    public aupr aW;
    aupr aX;
    aupr aY;
    aupr aZ;
    aupr aa;
    aupr ab;
    aupr ac;
    aupr ad;
    aupr ae;
    aupr af;
    aupr ag;
    aupr ah;
    aupr ai;
    aupr aj;
    aupr ak;
    aupr al;
    aupr am;
    aupr an;
    aupr ao;
    aupr ap;
    aupr aq;
    aupr ar;
    aupr as;
    aupr at;
    aupr au;
    aupr av;
    aupr aw;
    aupr ax;
    aupr ay;
    aupr az;
    public final ght b;
    aupr bA;
    aupr bB;
    aupr bC;
    aupr bD;
    aupr bE;
    aupr bF;
    aupr bG;
    aupr bH;
    aupr bI;
    aupr bJ;
    aupr bK;
    aupr bL;
    aupr bM;
    aupr bN;
    aupr bO;
    aupr bP;
    aupr bQ;
    aupr bR;
    aupr bS;
    aupr bT;
    aupr bU;
    aupr bV;
    aupr bW;
    aupr bX;
    aupr bY;
    aupr bZ;
    aupr ba;
    aupr bb;
    aupr bc;
    aupr bd;
    aupr be;
    aupr bf;
    aupr bg;
    public aupr bh;
    aupr bi;
    aupr bj;
    aupr bk;
    aupr bl;
    aupr bm;
    aupr bn;
    aupr bo;
    public aupr bp;
    aupr bq;
    aupr br;
    aupr bs;
    aupr bt;
    aupr bu;
    aupr bv;
    aupr bw;
    aupr bx;
    aupr by;
    aupr bz;
    public aupr c;
    aupr ca;
    public final afpa cb;
    public final gkg cc;
    public final gju cd;
    aupr d;
    aupr e;
    aupr f;
    aupr g;
    aupr h;
    aupr j;
    aupr k;
    aupr l;
    aupr m;
    aupr n;
    aupr o;
    aupr p;
    aupr q;
    aupr r;
    aupr s;
    aupr t;
    aupr u;
    aupr v;
    aupr w;
    aupr x;
    aupr y;
    aupr z;
    private final gjt ce = this;
    public aupr i = new aupl();

    public gjt(ght ghtVar, gkg gkgVar, gju gjuVar, Activity activity, afpa afpaVar) {
        this.b = ghtVar;
        this.cc = gkgVar;
        this.cd = gjuVar;
        this.a = activity;
        this.cb = afpaVar;
        this.c = aupu.b(new ggt(ghtVar, gkgVar, this, 1));
        this.d = new ggt(ghtVar, gkgVar, this, 0);
        this.e = new ggt(ghtVar, gkgVar, this, 3);
        this.f = new ggt(ghtVar, gkgVar, this, 2);
        this.g = new ggt(ghtVar, gkgVar, this, 5);
        this.h = aupu.b(new ggt(ghtVar, gkgVar, this, 8));
        this.j = new ggt(ghtVar, gkgVar, this, 7);
        this.k = aupu.b(new ggt(ghtVar, gkgVar, this, 11));
        this.l = aupm.c(new ggt(ghtVar, gkgVar, this, 10));
        this.m = new ggt(ghtVar, gkgVar, this, 9);
        this.n = new ggt(ghtVar, gkgVar, this, 12);
        this.o = new ggt(ghtVar, gkgVar, this, 14);
        this.p = aupu.b(new ggt(ghtVar, gkgVar, this, 13));
        this.q = aupu.b(new ggt(ghtVar, gkgVar, this, 15));
        this.r = new ggt(ghtVar, gkgVar, this, 17);
        this.s = aupu.b(new ggt(ghtVar, gkgVar, this, 16));
        this.t = aupu.b(new ggt(ghtVar, gkgVar, this, 18));
        this.u = aupu.b(new ggt(ghtVar, gkgVar, this, 19));
        this.v = aupu.b(new ggt(ghtVar, gkgVar, this, 20));
        this.w = aupm.c(new ggt(ghtVar, gkgVar, this, 22));
        this.x = aupu.b(new ggt(ghtVar, gkgVar, this, 21));
        this.y = new ggt(ghtVar, gkgVar, this, 23);
        this.z = aupu.b(new ggt(ghtVar, gkgVar, this, 24));
        this.A = aupu.b(new ggt(ghtVar, gkgVar, this, 25));
        this.B = new ggt(ghtVar, gkgVar, this, 26);
        this.C = new ggt(ghtVar, gkgVar, this, 27);
        this.D = new ggt(ghtVar, gkgVar, this, 28);
        this.E = aupm.c(new ggt(ghtVar, gkgVar, this, 6));
        this.F = new ggt(ghtVar, gkgVar, this, 29);
        aupl.b((aupl) this.i, aupm.c(new ggt(ghtVar, gkgVar, this, 4)));
        aupr auprVar = gjo.b;
        this.G = auprVar;
        this.H = auprVar;
        this.I = new ggt(ghtVar, gkgVar, this, 31);
        this.J = new ggt(ghtVar, gkgVar, this, 32);
        this.K = new ggt(ghtVar, gkgVar, this, 33);
        this.L = aupu.b(new ggt(ghtVar, gkgVar, this, 30));
        this.M = new aupl();
        this.N = new ggt(ghtVar, gkgVar, this, 37);
        this.O = new aupl();
        this.P = new ggt(ghtVar, gkgVar, this, 41);
        aupl.b((aupl) this.O, new ggt(ghtVar, gkgVar, this, 40));
        this.Q = new ggt(ghtVar, gkgVar, this, 39);
        this.R = new ggt(ghtVar, gkgVar, this, 38);
        this.S = new ggt(ghtVar, gkgVar, this, 42);
        this.T = new ggt(ghtVar, gkgVar, this, 43);
        this.U = new ggt(ghtVar, gkgVar, this, 44);
        this.V = new ggt(ghtVar, gkgVar, this, 45);
        this.W = new ggt(ghtVar, gkgVar, this, 47);
        this.X = new ggt(ghtVar, gkgVar, this, 48);
        this.Y = new ggt(ghtVar, gkgVar, this, 46);
        this.Z = aupu.b(new ggt(ghtVar, gkgVar, this, 51));
        this.aa = new aupl();
        this.ab = aupu.b(new ggt(ghtVar, gkgVar, this, 52));
        this.ac = aupu.b(new ggt(ghtVar, gkgVar, this, 53));
        this.ad = aupu.b(new ggt(ghtVar, gkgVar, this, 54));
        this.ae = aupu.b(new ggt(ghtVar, gkgVar, this, 55));
        this.af = aupu.b(new ggt(ghtVar, gkgVar, this, 56));
        this.ag = new ggt(ghtVar, gkgVar, this, 58);
        this.ah = new ggt(ghtVar, gkgVar, this, 57);
        this.ai = new ggt(ghtVar, gkgVar, this, 60);
        this.aj = new ggt(ghtVar, gkgVar, this, 61);
        this.ak = new ggt(ghtVar, gkgVar, this, 59);
        this.al = aupu.b(new ggt(ghtVar, gkgVar, this, 62));
        this.am = aupu.b(new ggt(ghtVar, gkgVar, this, 63));
        this.an = aupu.b(new ggt(ghtVar, gkgVar, this, 65));
        this.ao = aupu.b(new ggt(ghtVar, gkgVar, this, 64));
        this.ap = new ggt(ghtVar, gkgVar, this, 66);
        this.aq = aupu.b(new ggt(ghtVar, gkgVar, this, 68));
        this.ar = aupm.c(new ggt(ghtVar, gkgVar, this, 69));
        this.as = aupu.b(new ggt(ghtVar, gkgVar, this, 67));
        this.at = aupu.b(new ggt(ghtVar, gkgVar, this, 71));
        this.au = new ggt(ghtVar, gkgVar, this, 73);
        this.av = new ggt(ghtVar, gkgVar, this, 72);
        this.aw = new ggt(ghtVar, gkgVar, this, 70);
        this.ax = aupu.b(new ggt(ghtVar, gkgVar, this, 75));
        this.ay = aupu.b(new ggt(ghtVar, gkgVar, this, 78));
        this.az = aupu.b(new ggt(ghtVar, gkgVar, this, 77));
        this.aA = new ggt(ghtVar, gkgVar, this, 79);
        this.aB = new ggt(ghtVar, gkgVar, this, 76);
        this.aC = aupu.b(new ggt(ghtVar, gkgVar, this, 80));
        this.aD = aupu.b(new ggt(ghtVar, gkgVar, this, 81));
        this.aE = aupu.b(new ggt(ghtVar, gkgVar, this, 82));
        this.aF = new ggt(ghtVar, gkgVar, this, 83);
        this.aG = aupu.b(new ggt(ghtVar, gkgVar, this, 84));
        ggt ggtVar = new ggt(ghtVar, gkgVar, this, 50);
        this.aH = ggtVar;
        this.aI = aupu.b(ggtVar);
        this.aJ = new ggt(ghtVar, gkgVar, this, 49);
        this.aK = new ggt(ghtVar, gkgVar, this, 85);
        this.aL = new ggt(ghtVar, gkgVar, this, 86);
        this.aM = aupu.b(new ggt(ghtVar, gkgVar, this, 36));
        this.aN = aupu.b(new ggt(ghtVar, gkgVar, this, 87));
        this.aO = aupu.b(new ggt(ghtVar, gkgVar, this, 88));
        aupl.b((aupl) this.M, aupu.b(new ggt(ghtVar, gkgVar, this, 35)));
        ggt ggtVar2 = new ggt(ghtVar, gkgVar, this, 34);
        this.aP = ggtVar2;
        aupl.b((aupl) this.aa, aupu.b(ggtVar2));
        this.aQ = new ggt(ghtVar, gkgVar, this, 91);
        this.aR = aupm.c(new ggt(ghtVar, gkgVar, this, 90));
        this.aS = new ggt(ghtVar, gkgVar, this, 92);
        this.aT = new ggt(ghtVar, gkgVar, this, 93);
        this.aU = new ggt(ghtVar, gkgVar, this, 95);
        this.aV = new ggt(ghtVar, gkgVar, this, 96);
        this.aW = new ggt(ghtVar, gkgVar, this, 94);
        this.aX = new ggt(ghtVar, gkgVar, this, 98);
        this.aY = aupm.c(new ggt(ghtVar, gkgVar, this, 97));
        this.aZ = new ggt(ghtVar, gkgVar, this, 101);
        this.ba = new ggt(ghtVar, gkgVar, this, 102);
        this.bb = new ggt(ghtVar, gkgVar, this, 103);
        this.bc = new ggt(ghtVar, gkgVar, this, 104);
        this.bd = new ggt(ghtVar, gkgVar, this, 105);
        this.be = new ggt(ghtVar, gkgVar, this, 100);
        this.bf = new ggt(ghtVar, gkgVar, this, 99);
        this.bg = new ggt(ghtVar, gkgVar, this, 106);
        this.bh = aupm.c(new ggt(ghtVar, gkgVar, this, 107));
        this.bi = new ggt(ghtVar, gkgVar, this, 108);
        this.bj = aupm.c(new ggt(ghtVar, gkgVar, this, 109));
        ggt ggtVar3 = new ggt(ghtVar, gkgVar, this, 111);
        this.bk = ggtVar3;
        this.bl = aupm.c(ggtVar3);
        this.bm = aupu.b(new ggt(ghtVar, gkgVar, this, 112));
        this.bn = new ggt(ghtVar, gkgVar, this, 113);
        this.bo = aupm.c(new ggt(ghtVar, gkgVar, this, 110));
        this.bp = aupm.c(new ggt(ghtVar, gkgVar, this, 114));
        this.bq = aupu.b(new ggt(ghtVar, gkgVar, this, 115));
        this.br = aupm.c(new ggt(ghtVar, gkgVar, this, 116));
        this.bs = aupm.c(new ggt(ghtVar, gkgVar, this, 117));
        this.bt = new ggt(ghtVar, gkgVar, this, 118);
        this.bu = aupm.c(new ggt(ghtVar, gkgVar, this, 119));
        this.bv = aupm.c(new ggt(ghtVar, gkgVar, this, 120));
        this.bw = aupu.b(new ggt(ghtVar, gkgVar, this, 122));
        this.bx = aupm.c(new ggt(ghtVar, gkgVar, this, 121));
        ggt ggtVar4 = new ggt(ghtVar, gkgVar, this, 123);
        this.by = ggtVar4;
        this.bz = aupm.c(ggtVar4);
        this.bA = aupm.c(new ggt(ghtVar, gkgVar, this, R.styleable.AppCompatTheme_windowMinWidthMajor));
        this.bB = new ggt(ghtVar, gkgVar, this, R.styleable.AppCompatTheme_windowMinWidthMinor);
        this.bC = new ggt(ghtVar, gkgVar, this, 127);
        this.bD = new ggt(ghtVar, gkgVar, this, SemanticState.Focused);
        this.bE = new ggt(ghtVar, gkgVar, this, 129);
        this.bF = new ggt(ghtVar, gkgVar, this, 130);
        this.bG = new ggt(ghtVar, gkgVar, this, 131);
        this.bH = new ggt(ghtVar, gkgVar, this, 132);
        this.bI = new ggt(ghtVar, gkgVar, this, 133);
        this.bJ = new ggt(ghtVar, gkgVar, this, 134);
        this.bK = new ggt(ghtVar, gkgVar, this, 135);
        this.bL = new ggt(ghtVar, gkgVar, this, 136);
        this.bM = new ggt(ghtVar, gkgVar, this, 137);
        this.bN = new ggt(ghtVar, gkgVar, this, 138);
        this.bO = new ggt(ghtVar, gkgVar, this, 139);
        this.bP = new ggt(ghtVar, gkgVar, this, 140);
        this.bQ = new ggt(ghtVar, gkgVar, this, 141);
        this.bR = new ggt(ghtVar, gkgVar, this, 142);
        this.bS = new ggt(ghtVar, gkgVar, this, 143);
        this.bT = new ggt(ghtVar, gkgVar, this, 144);
        this.bU = new ggt(ghtVar, gkgVar, this, 145);
        this.bV = new ggt(ghtVar, gkgVar, this, 146);
        this.bW = new ggt(ghtVar, gkgVar, this, 147);
        this.bX = new ggt(ghtVar, gkgVar, this, 149);
        this.bY = new ggt(ghtVar, gkgVar, this, 148);
        this.bZ = aupm.c(new ggt(ghtVar, gkgVar, this, R.styleable.AppCompatTheme_windowNoTitle));
        this.ca = new ggt(ghtVar, gkgVar, this, 150);
    }

    static Map aj() {
        return qnl.bL(agev.i(agpn.b));
    }

    public final uys A() {
        ght ghtVar = this.b;
        Context context = (Context) ghtVar.v.io();
        tgg tggVar = (tgg) ghtVar.zQ.io();
        ghx ghxVar = ghtVar.a;
        uyt uytVar = new uyt((ExecutorService) ghxVar.a.z.io());
        al();
        return new uys(context, tggVar, uytVar, (zwh) this.cc.c.io(), ghxVar.dk(), new zf(agkj.j(ajgh.a, new yno((byte[]) null))), (aaok) ghxVar.iz.io(), (vxz) ghtVar.aL.io(), (zvl) ghtVar.dO.io(), (ahex) ghtVar.z.io());
    }

    public final vet B() {
        return new vet((Context) this.b.v.io());
    }

    public final acxx C() {
        acxx acxxVarAg = ((adae) atqp.a(a(), adae.class)).ag();
        acxxVarAg.getClass();
        return acxxVarAg;
    }

    public final acyj D() {
        acyj acyjVarAi = ((adag) atqp.a(a(), adag.class)).ai();
        acyjVarAi.getClass();
        return acyjVarAi;
    }

    public final addl E() {
        addl addlVarAk = ((adaf) atqp.a(a(), adaf.class)).ak();
        addlVarAk.getClass();
        return addlVarAk;
    }

    public final aeez F() {
        aeez aeezVarAp = ((aeex) atqp.a(((afpa) this.c.io()).a, aeex.class)).ap();
        aeezVarAp.getClass();
        return aeezVarAp;
    }

    public final agev G() {
        return agev.h(aguu.ar(this.a));
    }

    public final agev H() {
        ght ghtVar = this.b;
        ghx ghxVar = ghtVar.a;
        return mda.d(agev.i(Boolean.valueOf(ghxVar.bG())), agev.i(Boolean.valueOf(ghxVar.bw())), agev.i(Boolean.valueOf(ghtVar.el())), agev.i(Boolean.valueOf(ghtVar.em())), agev.i(ghtVar.fU));
    }

    public final agkj I() {
        agkh agkhVar = new agkh(16);
        agkhVar.e(amla.class, this.j);
        agkhVar.e(aleo.class, this.m);
        agkhVar.e(aqzs.class, this.n);
        agkhVar.e(aldv.class, this.p);
        agkhVar.e(arar.class, this.q);
        agkhVar.e(ajfa.class, this.s);
        agkhVar.e(apcr.class, this.t);
        agkhVar.e(aplv.class, this.b.nU);
        agkhVar.e(aotp.class, this.u);
        agkhVar.e(apoy.class, this.v);
        agkhVar.e(ajfz.class, this.x);
        agkhVar.e(ajfx.class, this.y);
        agkhVar.e(ajgg.class, this.z);
        agkhVar.e(aras.class, this.A);
        agkhVar.e(algy.class, this.B);
        agkhVar.e(anfm.class, this.C);
        return agkhVar.d(true);
    }

    public final agkj J() {
        agkh agkhVarF = agkj.f(28);
        agkhVarF.e(asny.class, new mge(aupm.b(this.M), (avmb) this.N.io(), 5));
        aunn aunnVarB = aupm.b(this.M);
        ght ghtVar = this.b;
        ghx ghxVar = ghtVar.a;
        agkhVarF.e(asnz.class, new mqi(aunnVarB, agev.i(Boolean.valueOf(ghxVar.bX())), (avmb) this.N.io()));
        agkhVarF.e(asok.class, new mgl(aupm.b(this.M), 7));
        agkhVarF.e(asmi.class, new addf(aupm.b(this.M), (avmb) this.N.io(), 1));
        agkhVarF.e(asmr.class, new mge((nsr) ghxVar.hz.io(), aupm.b(this.M), 4));
        agkhVarF.e(asoj.class, new mqm());
        agkhVarF.e(aslm.class, h());
        PerformOnceCommandController performOnceCommandController = nyo.a;
        performOnceCommandController.getClass();
        agkhVarF.e(asoa.class, new mqj(performOnceCommandController, aupm.b(this.M)));
        aczr aczrVarAj = ((adad) atqp.a(((afpa) this.c.io()).a, adad.class)).aj();
        aczrVarAj.getClass();
        vxu vxuVar = (vxu) ghtVar.at.io();
        vyo vyoVar = (vyo) ghtVar.av.io();
        ght.fp();
        addm addmVar = new addm(aczrVarAj, new vxz(vxuVar, vyoVar, "HomeMiscUiShared"), (vxz) ghtVar.dP.io(), (nuc) this.R.io(), aawb.ab());
        agkhVarF.e(assn.class, aawb.ac(addmVar, this.S, ghtVar.fb()));
        vxe vxeVar = (vxe) this.i.io();
        adbv adbvVar = (adbv) ghtVar.eQ.io();
        vxz vxzVar = (vxz) ghtVar.dP.io();
        vxz vxzVar2 = (vxz) ghtVar.jP.io();
        addo addoVar = new addo(vxeVar, adbvVar, vxzVar, vxzVar2, (ci) ghtVar.Dp.io(), (Context) ghtVar.v.io(), aupm.b(ghxVar.hE), Optional.of((Boolean) ghxVar.hF.io()), (nuc) this.R.io());
        aupr auprVar = this.S;
        agkhVarF.e(ajwo.class, aawb.S(addoVar, auprVar, ghtVar.fb()));
        aupr auprVar2 = ghtVar.ez;
        aupr auprVar3 = ghtVar.ex;
        aupr auprVar4 = this.T;
        aupr auprVar5 = this.U;
        aupr auprVar6 = this.V;
        auprVar2.getClass();
        auprVar3.getClass();
        auprVar4.getClass();
        auprVar5.getClass();
        auprVar6.getClass();
        agkhVarF.e(ExecuteJsFunctionCommand$ExecuteJSFunctionCommand.class, mda.j(aupm.b(this.M), auprVar2, auprVar3, auprVar4, auprVar5, auprVar6));
        agkhVarF.e(akls.class, new mgl(f(), 1));
        agkhVarF.e(akly.class, new mge(f(), aupm.b(this.M), 1));
        agkhVarF.e(aowo.class, new mgl(D(), 2));
        agkhVarF.e(apxp.class, new mgl(D(), 4));
        agkhVarF.e(asst.class, new mgl(C(), 3));
        agkhVarF.e(asss.class, new mge(C(), (nuc) this.R.io(), 2));
        agkhVarF.e(astc.class, new mge(C(), (nuc) this.R.io(), 3));
        agkhVarF.e(akdo.class, new addf(aupm.b(this.M), (tfq) ghtVar.cd.io(), 0));
        agkhVarF.e(aknp.class, new addi((Context) ghtVar.v.io(), aupm.b(this.aJ), new ahto((abte) ghtVar.iS.io(), (vxz) ghtVar.jR.io()), aupm.b(this.M)));
        agkhVarF.e(asrb.class, new mgv((Context) ghtVar.v.io(), (nuc) this.R.io(), (avmb) this.N.io(), Optional.of(Boolean.valueOf(ghxVar.by()))));
        agkhVarF.e(asqt.class, new mgh((nuc) this.R.io()));
        agkhVarF.e(asqn.class, new mfz());
        agkhVarF.e(asqr.class, new mge(an(), new hed((awmd) aups.b(this.M), (awmd) aups.b(this.aK), (awmd) this.aL), 0));
        agkhVarF.e(asqw.class, new mgl(an(), 5));
        vqy vqyVarS = ((vra) atqp.a(((afpa) this.c.io()).a, vra.class)).S();
        vqyVarS.getClass();
        agkhVarF.e(apxv.class, vqyVarS);
        agkhVarF.e(asqv.class, new mgl(au(), 0));
        agkhVarF.e(asqx.class, new mgl(au(), 6));
        return agkhVarF.d(true);
    }

    public final agkj K() {
        agkh agkhVarF = agkj.f(12);
        agkhVarF.e(ner.class, v());
        agkhVarF.e(myn.class, m());
        agkhVarF.e(nad.class, p());
        agkhVarF.e(nee.class, t());
        agkhVarF.e(nbi.class, r());
        agkhVarF.e(myz.class, n());
        agkhVarF.e(nar.class, q());
        agkhVarF.e(mzt.class, u());
        agkhVarF.e(mzq.class, o());
        agkhVarF.e(ncq.class, s());
        agkhVarF.e(ndv.class, g());
        agkhVarF.e(mww.class, l());
        return agkhVarF.d(true);
    }

    public final agkj L() {
        agkh agkhVarF = agkj.f(6);
        nvp nvpVar = (nvp) this.aa.io();
        ght ghtVar = this.b;
        ghx ghxVar = ghtVar.a;
        agkhVarF.e(assq.class, tzk.ak(nvpVar, ghxVar.dg(), aupm.b(this.M)));
        axfd axfdVarDg = ghxVar.dg();
        nvp nvpVar2 = (nvp) this.aa.io();
        agkhVarF.e(astb.class, axfdVarDg.ae(nvpVar2, new hbg((nry) this.M.io(), 4), astb.b));
        agkhVarF.e(assv.class, ghxVar.dg().ae((nvp) this.aa.io(), new hbg(new adcn(aupm.b(this.M), (nuc) this.R.io(), ghxVar.bj()), 0), assv.b));
        agkhVarF.e(aplt.class, ghxVar.dg().ae((nvp) this.aa.io(), new vmc(y(), (xgn) ghtVar.Ac.io(), ghtVar.cQ, this.aF), aplt.b));
        agkhVarF.e(asnt.class, kro.bm(ghxVar.dg(), (nvp) this.aa.io(), (nuc) this.R.io(), (xje) this.aG.io(), (adhv) ghtVar.rB.io(), (Executor) ghtVar.B.io(), (Executor) ghtVar.z.io(), (Executor) ghtVar.u.io(), (zsl) ghxVar.ib.io(), (nry) this.M.io(), ghxVar.db(), (mbc) ghtVar.l.io()));
        agkhVarF.e(assm.class, ghxVar.dg().ae((nvp) this.aa.io(), new adcs((nuc) this.R.io(), aupm.b(ghxVar.ie), ghtVar.nj, (nsr) ghxVar.hz.io(), ghtVar.fK), assm.b));
        return agkhVarF.d(true);
    }

    public final agkj M() {
        agkh agkhVarF = agkj.f(8);
        ghx ghxVar = this.b.a;
        agkhVarF.e(aund.class, new mow(agev.i(Boolean.valueOf(ghxVar.bB()))));
        agkhVarF.e(aunh.class, new mpr());
        agkhVarF.e(aunf.class, new moz(aupm.b(this.M), aupm.b(this.N), aupm.b(this.aj)));
        nry nryVar = (nry) this.M.io();
        omj omjVar = (omj) this.aj.io();
        Object objIo = this.aO.io();
        agkhVarF.e(aung.class, new mpo(nryVar, omjVar, (mpe) objIo, agev.i(Boolean.valueOf(ghxVar.cc())), agev.i(Boolean.valueOf(ghxVar.bJ()))));
        agkhVarF.e(aunk.class, ghxVar.as());
        agkj agkjVar = agpn.b;
        adeg adegVar = new adeg();
        aqos aqosVar = aqos.a;
        Pair pairCreate = Pair.create(adegVar, aihn.getParserForClass(aqos.class));
        pairCreate.getClass();
        mic micVar = new mic((nuc) this.R.io());
        asoh asohVar = asoh.a;
        Pair pairCreate2 = Pair.create(micVar, aihn.getParserForClass(asoh.class));
        pairCreate2.getClass();
        agkj agkjVarK = agkj.k(adeg.class, pairCreate, asoh.class, pairCreate2);
        agev agevVarI = agev.i(Boolean.valueOf(ghxVar.cb()));
        ak();
        agkhVarF.e(aunl.class, new mqa(agkjVar, agkjVarK, agevVarI, agev.i(Boolean.FALSE), agev.i(Boolean.valueOf(ghxVar.bT())), (nuc) this.R.io()));
        agkhVarF.e(aunj.class, new mpu(agkj.l(nct.class, new mnk((nry) this.M.io(), (omj) this.aj.io(), 1), ncw.class, new mnk((nry) this.M.io(), (omj) this.aj.io(), 0), ndg.class, new mnw((nry) this.M.io(), (omj) this.aj.io(), agev.i(Boolean.valueOf(ghxVar.bq())))), Z(), (nuc) this.R.io(), agev.i(Boolean.valueOf(ghxVar.aK())), agev.i(Boolean.valueOf(ghxVar.bq()))));
        agkhVarF.e(aunm.class, new mqc((nry) this.M.io(), (omj) this.aj.io(), (nuc) this.R.io(), agev.i(Boolean.valueOf(ghxVar.cc()))));
        return agkhVarF.d(true);
    }

    public final agkj N() {
        agkh agkhVarF = agkj.f(22);
        ght ghtVar = this.b;
        ghx ghxVar = ghtVar.a;
        agkhVarF.e(asox.class, ghxVar.cE());
        agkhVarF.e(astd.class, new adds((DirectUpdateDataRelay) this.aK.io()));
        agkhVarF.e(akmc.class, new mgc(D(), 4, null));
        agkhVarF.e(akma.class, new mgc(D(), 3, null));
        agkhVarF.e(assk.class, new mgc(C(), 2, null));
        agkhVarF.e(amtv.class, new mgi(1));
        agkhVarF.e(amty.class, new mgi(0));
        agkhVarF.e(addt.class, new addt((Context) ghtVar.v.io()));
        agkhVarF.e(asqo.class, new mgc(a(), 1, null));
        agkhVarF.e(asqq.class, new mgc((Context) ghtVar.v.io(), 0));
        agkhVarF.e(aqkw.class, new mgs(aupm.b(ghxVar.ii), (nuc) this.R.io()));
        agkhVarF.e(aqde.class, new mgp(aupm.b(ghxVar.ii), 2));
        agkhVarF.e(apxk.class, new mgp(z(), 5));
        agkhVarF.e(aklx.class, new mgp(z(), 4));
        agkhVarF.e(ajss.class, new rkr((woz) ghxVar.ij.io(), (Executor) ghtVar.u.io(), (wbz) ghtVar.es.io(), (zwb) ghtVar.bd.io()));
        agkhVarF.e(alcq.class, new rku((woz) ghxVar.ij.io(), (Executor) ghtVar.u.io(), (wbz) ghtVar.es.io(), (zwb) ghtVar.bd.io(), 0));
        agkhVarF.e(aklv.class, new mgp(a(), 3));
        agkhVarF.e(asqy.class, new mgp(an(), 1));
        agkhVarF.e(akmb.class, new mgc(E(), 6));
        ahud ahudVarCO = ((aeoz) atqp.a(((afpa) this.c.io()).a, aeoz.class)).cO();
        ahudVarCO.getClass();
        agkhVarF.e(ajfk.class, new mgc(ahudVarCO, 7, null));
        agkhVarF.e(asqz.class, new mgp(au(), 0));
        agkhVarF.e(anje.class, new addr((aapw) ghtVar.xT.io(), (ttm) ghtVar.cJ.io()));
        return agkhVarF.d(true);
    }

    public final ExtensionRegistryLite O() {
        return iqf.f(ae());
    }

    public final Object P() {
        ght ghtVar = this.b;
        return new xsc((wco) ghtVar.jy.io(), (zwb) ghtVar.bd.io(), (zvl) ghtVar.dO.io(), (boolean[]) null);
    }

    public final Object Q() {
        return new elr((awmd) this.aj);
    }

    public final Object R() {
        return new kyr(a(), this.cc.o(), (char[]) null);
    }

    public final Object S() {
        aupr auprVar = this.ag;
        ght ghtVar = this.b;
        hee heeVarY = ghtVar.Gy.y(auprVar, agev.i(Boolean.valueOf(ghtVar.a.bD())));
        heeVarY.getClass();
        return heeVarY;
    }

    public final Object T() {
        return new xpl((Context) this.e.io(), (abfv) this.Y.io());
    }

    public final String U() {
        return iqf.i(agev.i(this.b.cJ()));
    }

    public final List V() {
        List listA = mpy.a(M());
        listA.getClass();
        return listA;
    }

    public final List W() {
        agkh agkhVarF = agkj.f(7);
        mpp mppVar = new mpp(0);
        agke agkeVar = mpy.a;
        asmd asmdVar = asmd.a;
        Pair pairCreate = Pair.create(mppVar, aihn.getParserForClass(asmd.class));
        pairCreate.getClass();
        agkhVarF.e(mpp.class, pairCreate);
        ght ghtVar = this.b;
        aupr auprVar = ghtVar.ex;
        aunn aunnVarB = aupm.b(this.aK);
        ghx ghxVar = ghtVar.a;
        mpq mpqVar = new mpq(auprVar, aunnVarB, agev.i(Boolean.valueOf(ghxVar.be())));
        DirectUpdatePropertiesOuterClass$DirectUpdateProperties directUpdatePropertiesOuterClass$DirectUpdateProperties = DirectUpdatePropertiesOuterClass$DirectUpdateProperties.a;
        Pair pairCreate2 = Pair.create(mpqVar, aihn.getParserForClass(DirectUpdatePropertiesOuterClass$DirectUpdateProperties.class));
        pairCreate2.getClass();
        agkhVarF.e(mpq.class, pairCreate2);
        adde addeVar = new adde((vxz) ghtVar.ce.io(), (tqj) ghtVar.q.io(), Z(), (nuc) this.R.io(), Optional.of(Boolean.valueOf(ghxVar.bn())), Optional.of(Boolean.valueOf(ghxVar.bq())));
        amuj amujVar = amuj.a;
        Pair pairCreate3 = Pair.create(addeVar, aihn.getParserForClass(amuj.class));
        pairCreate3.getClass();
        agkhVarF.e(amuj.class, pairCreate3);
        aded adedVar = new aded();
        apmj apmjVar = apmj.a;
        Pair pairCreate4 = Pair.create(adedVar, aihn.getParserForClass(apmj.class));
        pairCreate4.getClass();
        agkhVarF.e(aded.class, pairCreate4);
        addz addzVar = new addz();
        aleq aleqVar = aleq.a;
        Pair pairCreate5 = Pair.create(addzVar, aihn.getParserForClass(aleq.class));
        pairCreate5.getClass();
        agkhVarF.e(addz.class, pairCreate5);
        addx addxVar = new addx();
        ajdt ajdtVar = ajdt.a;
        Pair pairCreate6 = Pair.create(addxVar, aihn.getParserForClass(ajdt.class));
        pairCreate6.getClass();
        agkhVarF.e(addx.class, pairCreate6);
        mpp mppVar2 = new mpp(1);
        asom asomVar = asom.a;
        Pair pairCreate7 = Pair.create(mppVar2, aihn.getParserForClass(asom.class));
        pairCreate7.getClass();
        agkhVarF.e(asom.class, pairCreate7);
        List listB = mpy.b(agkhVarF.d(true), agpr.a);
        listB.getClass();
        return listB;
    }

    public final List X() {
        return mpy.c(M());
    }

    public final Map Y() {
        return agkj.j(aslc.class, new heg((Container) this.ar.io()));
    }

    public final Map Z() {
        abfv abfvVar = new abfv((nuc) this.R.io(), (mbc) this.b.l.io());
        albl alblVar = albl.a;
        Pair pairCreate = Pair.create(abfvVar, aihn.getParserForClass(albl.class));
        pairCreate.getClass();
        return agkj.j(albl.class, pairCreate);
    }

    public final Activity a() {
        Activity activity = this.a;
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Attempted use of the activity when it is null");
    }

    public final Map aa() {
        return agkj.k(CustomThumbnailCreationActivity.class, this.E, MusicActivity.class, this.F);
    }

    public final Map ab() {
        return agkj.j(525000006, this.aQ);
    }

    public final Map ac() {
        return agkj.j("B_spP", (ForeignFunction) this.at.io());
    }

    public final Map ad() {
        return agkj.k(CustomThumbnailCreationActivity.class, this.aU, MusicActivity.class, this.aV);
    }

    public final Set ae() {
        return new agqj((elr) this.b.a.hH.io());
    }

    public final boolean af() {
        ght ghtVar = this.b;
        return mda.e((Context) ghtVar.v.io(), agev.i(ghtVar.a.r()));
    }

    public final vbk ag() {
        vxz vxzVarCs = this.b.a.cs();
        vbj vbjVar = (vbj) this.bq.io();
        aupr auprVar = this.bn;
        vbjVar.getClass();
        auprVar.getClass();
        return vxzVarCs.l(122, 45833044L, false) ? vbjVar.a((uju) auprVar.io()) : (vbk) this.cc.am.io();
    }

    public final vor ah() {
        vor vorVarBA = ((hbw) atqp.a(((afpa) this.c.io()).a, hbw.class)).bA();
        vorVarBA.getClass();
        return vorVarBA;
    }

    @Override // defpackage.afnu
    public final gis ai() {
        return new gis(this.b, this.cc, this.cd, this.ce);
    }

    public final void ak() {
    }

    public final void al() {
    }

    public final mgk am() {
        mgk mgkVarBU = ((jky) atqp.a(((afpa) this.c.io()).a, jky.class)).bU();
        mgkVarBU.getClass();
        return mgkVarBU;
    }

    public final kjc an() {
        kjc kjcVarCp = ((mgm) atqp.a(((afpa) this.c.io()).a, mgm.class)).cp();
        kjcVarCp.getClass();
        return kjcVarCp;
    }

    public final isi ao() {
        return new isi(this.O, (nsc) agev.i((nsc) this.b.a.in.io()).e(nsc.a), this.ap, (byte[]) null);
    }

    public final abfv ap() {
        abfv abfvVarCA = ((acwt) atqp.a(((afpa) this.c.io()).a, acwt.class)).cA();
        abfvVarCA.getClass();
        return abfvVarCA;
    }

    public final omj aq() {
        ght ghtVar = this.b;
        return new omj(Optional.of(Boolean.valueOf(ghtVar.a.br())), agkj.j(arnq.class, new vwt(new vwt((adxj) ghtVar.Ad.io()), (byte[]) null)), agpr.a);
    }

    public final abhh ar() {
        return new abhh((awmd) this.f, (awmd) this.b.a.hp, (byte[]) null);
    }

    public final aehs as() {
        aupr auprVar = this.k;
        ght ghtVar = this.b;
        aupr auprVar2 = ghtVar.ys;
        aupr auprVar3 = ghtVar.bd;
        ghx ghxVar = ghtVar.a;
        return new aehs(auprVar, auprVar2, auprVar3, ghxVar.cn, ghxVar.hv, ghxVar.hw, ghtVar.t, ghtVar.B, ghtVar.ga, null, null, null, null);
    }

    public final aczl at() {
        ght ghtVar = this.b;
        aupr auprVar = ghtVar.iS;
        aupr auprVar2 = this.aX;
        ghx ghxVar = ghtVar.a;
        return new aczl(auprVar, auprVar2, ghtVar.cx, ghxVar.iz, ghtVar.dO, ghxVar.iH, ghtVar.u);
    }

    public final axfd au() {
        axfd axfdVarDd = ((mgn) atqp.a(a(), mgn.class)).dd();
        axfdVarDd.getClass();
        return axfdVarDd;
    }

    public final aczl av() {
        qcb qcbVar = (qcb) this.b.xQ.io();
        vxe vxeVar = (vxe) this.i.io();
        qcbVar.getClass();
        vxeVar.getClass();
        return qcbVar.M(vxeVar);
    }

    public final tld aw() {
        return new tld(this.M, this.N, (char[]) null, (byte[]) null);
    }

    public final xsc ax() {
        ght ghtVar = this.b;
        return new xsc(ghtVar.es.io(), ghtVar.bd.io(), ghtVar.dO.io(), (short[]) null);
    }

    public final gfp b() {
        gfp gfpVarB = ((gfm) atqp.a(((afpa) this.c.io()).a, gfm.class)).b();
        gfpVarB.getClass();
        return gfpVarB;
    }

    public final YoutubeActivityAccountContainer c() {
        ght ghtVar = this.b;
        return new YoutubeActivityAccountContainer(new gma(new wjr(ghtVar.yd, this.i, null, null)));
    }

    public final iol d() {
        iol iolVarS = ((iom) atqp.a(((afpa) this.c.io()).a, iom.class)).s();
        iolVarS.getClass();
        return iolVarS;
    }

    public final izu e() {
        return new izu(this.b.aY());
    }

    public final mfy f() {
        Activity activityA = a();
        abfv abfvVar = (abfv) this.Y.io();
        adfn adfnVarAl = ((adfo) atqp.a(((afpa) this.c.io()).a, adfo.class)).al();
        adfnVarAl.getClass();
        mfy mfyVarAj = aawb.aj(activityA, abfvVar, adfnVarAl, E());
        mfyVarAj.getClass();
        return mfyVarAj;
    }

    public final mlz g() {
        return new mlz(Optional.of(j()), new agqj((qnl) this.aD.io()), (nuc) this.R.io(), (nsu) this.ap.io());
    }

    public final mqg h() {
        return new mqg((avmb) this.N.io());
    }

    public final mrb i() {
        return new mrb((Context) this.b.v.io());
    }

    public final nso j() {
        return mda.c(agev.i(Boolean.valueOf(this.b.a.bM())));
    }

    public final ntd k() {
        return (ntd) agev.i((ntd) this.ae.io()).e(ntd.b);
    }

    public final ntv l() {
        mla mlaVar = (mla) this.aE.io();
        nvp nvpVar = (nvp) this.aa.io();
        nry nryVar = (nry) this.M.io();
        nxl nxlVarY = y();
        nuc nucVar = (nuc) this.R.io();
        ghx ghxVar = this.b.a;
        return mda.i(mlaVar, nvpVar, nryVar, nxlVarY, nucVar, agev.i(Boolean.valueOf(ghxVar.bu())), agev.i(Boolean.valueOf(ghxVar.aU())), agev.i(Boolean.valueOf(ghxVar.aV())), agdf.a);
    }

    public final ntv m() {
        return ((mla) this.Z.io()).a((nvp) this.aa.io(), new mid(), null, myn.E, false);
    }

    public final ntv n() {
        mla mlaVar = (mla) this.af.io();
        nvp nvpVar = (nvp) this.aa.io();
        nry nryVar = (nry) this.M.io();
        mqg mqgVarH = h();
        ght ghtVar = this.b;
        ghx ghxVar = ghtVar.a;
        agev agevVarI = agev.i(Boolean.valueOf(ghxVar.aL()));
        int i = adba.a;
        return ksy.at(mlaVar, nvpVar, nryVar, mqgVarH, agevVarI, agev.i(Boolean.TRUE), this.ah, (nuc) this.R.io(), this.ak, agev.i(ghxVar.da()), agev.i(Boolean.valueOf(ghxVar.bd())), agev.i(j()), agev.i((Boolean) ghtVar.ed.io()), agev.i(Boolean.valueOf(ghxVar.bm())), agev.i(Boolean.valueOf(ghxVar.bt())));
    }

    public final ntv o() {
        return ksy.au((mla) this.ax.io(), this.aB, new mln(), (nvp) this.aa.io(), agev.i(j()));
    }

    public final ntv p() {
        mla mlaVar = (mla) this.ab.io();
        nvp nvpVar = (nvp) this.aa.io();
        ghx ghxVar = this.b.a;
        return ksy.av(mlaVar, nvpVar, agev.i(Boolean.valueOf(ghxVar.ba())), agev.i(Boolean.valueOf(ghxVar.bi())), agev.i(Boolean.valueOf(ghxVar.bc())));
    }

    public final ntv q() {
        mla mlaVar = (mla) this.al.io();
        nvp nvpVar = (nvp) this.aa.io();
        nry nryVar = (nry) this.M.io();
        nxl nxlVarY = y();
        nuc nucVar = (nuc) this.R.io();
        agev agevVarI = agev.i(j());
        omj omjVarAq = aq();
        boolean zAf = af();
        ght ghtVar = this.b;
        ghx ghxVar = ghtVar.a;
        return ksy.aN(mlaVar, nvpVar, nryVar, nxlVarY, nucVar, agevVarI, omjVarAq, zAf, agev.i(Boolean.valueOf(ghxVar.bh())), aj(), agev.i(Boolean.valueOf(ghxVar.aN())), agev.i(Boolean.valueOf(ghxVar.bA())), (avmb) this.N.io(), (avmb) agev.i((avmb) ghtVar.dA.io()).d(nyq.a));
    }

    public final ntv r() {
        return ksy.aw((mla) this.ad.io(), (nvp) this.aa.io(), (nry) this.M.io(), y(), (nuc) this.R.io(), agev.i(j()), aj(), k());
    }

    public final ntv s() {
        mla mlaVar = (mla) this.aC.io();
        nvp nvpVar = (nvp) this.aa.io();
        ght ghtVar = this.b;
        ghx ghxVar = ghtVar.a;
        agev agevVarI = agev.i(ghxVar.ai());
        nuc nucVar = (nuc) this.R.io();
        nry nryVar = (nry) this.M.io();
        agkj agkjVarJ = agkj.j(aune.class, new hed((Context) ghtVar.v.io(), (nuc) this.R.io(), agev.i(ghxVar.q())));
        iwo iwoVar = new iwo(this.R, (Executor) ghtVar.u.io(), (wbz) ghtVar.es.io(), (iwm) ghxVar.dr.io());
        anmi anmiVar = anmi.a;
        Pair pairCreate = Pair.create(iwoVar, aihn.getParserForClass(anmi.class));
        pairCreate.getClass();
        return qnl.bP(mlaVar, nvpVar, agevVarI, nucVar, nryVar, new hed((Map) agkjVarJ, (Map) agkj.j(anmi.class, pairCreate), (nuc) this.R.io()), aq(), agev.i(Boolean.valueOf(ghxVar.bW())), agev.i(Float.valueOf(ghxVar.a())), agev.i(ghxVar.q()), agev.i(Boolean.valueOf(ghxVar.aT())), agev.i(Boolean.valueOf(ghxVar.bU())), agev.i(Boolean.valueOf(ghxVar.bT())), agev.i(Boolean.valueOf(ghxVar.aJ())));
    }

    public final ntv t() {
        mla mlaVar = (mla) this.ac.io();
        nvp nvpVar = (nvp) this.aa.io();
        nry nryVar = (nry) this.M.io();
        nuc nucVar = (nuc) this.R.io();
        ghx ghxVar = this.b.a;
        return ksy.ax(mlaVar, nvpVar, nryVar, nucVar, agev.i(Boolean.valueOf(ghxVar.bE())), agev.i(Boolean.valueOf(ghxVar.aW())), agev.i(Boolean.valueOf(ghxVar.aY())), agev.i(Boolean.valueOf(ghxVar.bt())), agev.i(Boolean.valueOf(ghxVar.aX())));
    }

    public final ntv u() {
        mla mlaVar = (mla) this.am.io();
        ght ghtVar = this.b;
        agev agevVarI = agev.i(ghtVar.ew);
        nuc nucVar = (nuc) this.R.io();
        mrl mrlVar = (mrl) this.ao.io();
        aupr auprVar = this.O;
        nsu nsuVar = (nsu) this.ap.io();
        avmb avmbVar = (avmb) this.N.io();
        agev agevVarI2 = agev.i((Boolean) ghtVar.eA.io());
        ak();
        agev agevVarI3 = agev.i(Boolean.FALSE);
        agev agevVarI4 = agev.i(this.as);
        ghx ghxVar = ghtVar.a;
        agev agevVarI5 = agev.i(Boolean.valueOf(ghxVar.ca()));
        int i = adba.a;
        return mlaVar.a((nvp) this.aa.io(), null, new mmv(agevVarI, nucVar, mrlVar, auprVar, nsuVar, avmbVar, agevVarI2, agevVarI3, agevVarI4, agevVarI5, agev.i(Boolean.TRUE), agev.i(Boolean.valueOf(ghxVar.cd())), aupm.b(this.aw), agev.i(Boolean.valueOf(ghxVar.aR())), agev.i(Boolean.valueOf(ghxVar.aS())), agev.i((Boolean) ghxVar.hP.io()), agev.i((nze) ghxVar.hR.io()), (Context) ghtVar.v.io(), agev.i((ComponentConfig) ghxVar.fi.io()), agev.i((Boolean) ghxVar.hS.io()), agev.i(Boolean.valueOf(ghxVar.aM())), agev.i(Boolean.valueOf(ghxVar.bC())), agev.i((agkz) ghxVar.hT.io()), agev.i(Boolean.valueOf(ghxVar.bw())), agev.i(Boolean.valueOf(ghxVar.aQ())), agev.i(Boolean.valueOf(ghxVar.bz())), agev.i((Boolean) ghxVar.hU.io())), mzt.K, false);
    }

    public final ntv v() {
        mla mlaVar = (mla) this.L.io();
        nvp nvpVar = (nvp) this.aa.io();
        nry nryVar = (nry) this.M.io();
        nxl nxlVarY = y();
        nuc nucVar = (nuc) this.R.io();
        agev agevVarI = agev.i(j());
        Map mapAj = aj();
        ntd ntdVarK = k();
        omj omjVarAq = aq();
        boolean zAf = af();
        ghx ghxVar = this.b.a;
        return ksy.aO(mlaVar, nvpVar, nryVar, nxlVarY, nucVar, agevVarI, mapAj, ntdVarK, omjVarAq, zAf, agev.i(Boolean.valueOf(ghxVar.bp())), agev.i(Boolean.valueOf(ghxVar.bO())), agev.i(Boolean.valueOf(ghxVar.aN())), agev.i(Boolean.valueOf(ghxVar.bf())), agev.i(Boolean.valueOf(ghxVar.bH())), agev.i(Boolean.valueOf(ghxVar.bI())));
    }

    public final nuc w() {
        ght ghtVar = this.b;
        nuc nucVar = (nuc) aupm.b(ghtVar.dT).io();
        nucVar.getClass();
        return nucVar;
    }

    public final TemplateResolver x() {
        return idj.k((UnifiedTemplateResolver) this.av.io());
    }

    public final nxl y() {
        ght ghtVar = this.b;
        nxl nxlVarBq = qnl.bq(agev.i(new aedx(aupm.b(ghtVar.a.gO), (Context) ghtVar.v.io(), (vxz) ghtVar.cB.io())), (nuc) this.R.io());
        nxlVarBq.getClass();
        return nxlVarBq;
    }

    public final sru z() {
        sru sruVarM = ((ssa) atqp.a(((afpa) this.c.io()).a, ssa.class)).M();
        sruVarM.getClass();
        return sruVarM;
    }
}

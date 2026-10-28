package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.settings.fragment.AboutSettingsFragment;
import com.google.android.apps.youtube.music.settings.fragment.DataSavingSettingsFragment;
import com.google.android.apps.youtube.music.settings.fragment.DrillDownSettingsFragment;
import com.google.android.apps.youtube.music.settings.fragment.GeneralSettingsFragment;
import com.google.android.apps.youtube.music.settings.fragment.NotificationsSettingsFragment;
import com.google.android.apps.youtube.music.settings.fragment.OfflineSettingsFragmentCompat;
import com.google.android.apps.youtube.music.settings.fragment.PlaybackSettingsFragment;
import com.google.android.apps.youtube.music.settings.fragment.PrivacyPrefsFragmentCompat;
import com.google.android.apps.youtube.music.settings.fragment.RecommendationsSettingsFragment;
import com.google.android.apps.youtube.music.settings.fragment.RestrictedModeSettingsFragment;
import com.google.android.apps.youtube.music.settings.fragment.SettingsHeadersFragment;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.cardboard.sdk.R;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Optional;
import java.security.Key;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gjx implements hhk, ipa, ipc, ipe, ipg, ipi, ipm, ipp, ips, ipu, ipx, iqa, unp, uob, upi, veb, vww, acxc, adfm, aeoe, afgv, afoo, afqa, afxi, aupg {
    final aupr A;
    final aupr B;
    final aupr C;
    final aupr D;
    final aupr E;
    final aupr F;
    final aupr G;
    final aupr H;
    final aupr I;
    final aupr J;
    public final aupr K;
    public final aupr L;
    final aupr M;
    final aupr N;
    final aupr O;
    public final aupr P;
    final aupr Q;
    public final aupr R;
    public final aupr S;
    public final aupr T;
    final aupr U;
    final aupr V;
    final aupr W;
    public final aupr X;
    final aupr Y;
    final aupr Z;
    public final ght a;
    final aupr aA;
    final aupr aB;
    final aupr aC;
    final aupr aD;
    final aupr aE;
    final aupr aF;
    final aupr aG;
    final aupr aH;
    final aupr aI;
    final aupr aJ;
    final aupr aK;
    final aupr aL;
    final aupr aM;
    final aupr aN;
    final aupr aO;
    final aupr aP;
    final aupr aQ;
    final aupr aR;
    final aupr aS;
    final aupr aT;
    final aupr aU;
    final aupr aV;
    final aupr aW;
    final aupr aX;
    final aupr aY;
    final aupr aZ;
    final aupr aa;
    final aupr ab;
    final aupr ac;
    final aupr ad;
    final aupr ae;
    public final aupr af;
    final aupr ag;
    final aupr ah;
    final aupr ai;
    final aupr aj;
    final aupr ak;
    final aupr al;
    final aupr am;
    final aupr an;
    final aupr ao;
    final aupr ap;
    final aupr aq;
    final aupr ar;
    final aupr as;
    final aupr at;
    final aupr au;
    final aupr av;
    final aupr aw;
    final aupr ax;
    final aupr ay;
    final aupr az;
    public final aupr b;
    final aupr bA;
    final aupr bB;
    final aupr bC;
    final aupr bD;
    final aupr bE;
    final aupr bF;
    final aupr bG;
    final aupr bH;
    final aupr bI;
    final aupr bJ;
    final aupr bK;
    final aupr bL;
    final aupr bM;
    final aupr bN;
    public final aupr bO;
    final aupr bP;
    public final aupr bQ;
    final aupr bR;
    public final aupr bS;
    final aupr bT;
    final aupr bU;
    public final aupr bV;
    final aupr bW;
    final aupr bX;
    final aupr bY;
    final aupr bZ;
    final aupr ba;
    final aupr bb;
    final aupr bc;
    final aupr bd;
    final aupr be;
    final aupr bf;
    final aupr bg;
    final aupr bh;
    final aupr bi;
    final aupr bj;
    final aupr bk;
    final aupr bl;
    final aupr bm;
    public final aupr bn;
    final aupr bo;
    final aupr bp;
    final aupr bq;
    final aupr br;
    final aupr bs;
    final aupr bt;
    final aupr bu;
    final aupr bv;
    final aupr bw;
    final aupr bx;
    final aupr by;
    final aupr bz;
    public final aupr c;
    final aupr ca;
    final aupr cb;
    final aupr cc;
    final aupr cd;
    final aupr ce;
    final aupr cf;
    final aupr cg;
    final aupr ch;
    final aupr ci;
    final aupr cj;
    final aupr ck;
    public final gkg cl;
    public final gju cm;
    public final gjt cn;
    private final gjx co = this;
    public final aupr d;
    final aupr e;
    final aupr f;
    final aupr g;
    final aupr h;
    final aupr i;
    final aupr j;
    final aupr k;
    final aupr l;
    final aupr m;
    final aupr n;
    final aupr o;
    public final aupr p;
    final aupr q;
    public final aupr r;
    final aupr s;
    final aupr t;
    final aupr u;
    final aupr v;
    final aupr w;
    final aupr x;
    final aupr y;
    final aupr z;

    public gjx(ght ghtVar, gkg gkgVar, gju gjuVar, gjt gjtVar, cc ccVar) {
        this.a = ghtVar;
        this.cl = gkgVar;
        this.cm = gjuVar;
        this.cn = gjtVar;
        ccVar.getClass();
        this.b = new aupo(ccVar);
        this.c = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 0));
        this.d = aupu.b(new gif(ghtVar, gkgVar, gjtVar, this, 1));
        this.e = new gif(ghtVar, gkgVar, gjtVar, this, 3);
        this.f = new gif(ghtVar, gkgVar, gjtVar, this, 4);
        this.g = new gif(ghtVar, gkgVar, gjtVar, this, 5);
        gif gifVar = new gif(ghtVar, gkgVar, gjtVar, this, 7);
        this.h = gifVar;
        this.i = aupu.b(gifVar);
        this.j = new gif(ghtVar, gkgVar, gjtVar, this, 6);
        this.k = new gif(ghtVar, gkgVar, gjtVar, this, 8);
        this.l = new gif(ghtVar, gkgVar, gjtVar, this, 10);
        this.m = new gif(ghtVar, gkgVar, gjtVar, this, 9);
        this.n = new gif(ghtVar, gkgVar, gjtVar, this, 11);
        this.o = new gif(ghtVar, gkgVar, gjtVar, this, 12);
        this.p = new gif(ghtVar, gkgVar, gjtVar, this, 2);
        this.q = new gif(ghtVar, gkgVar, gjtVar, this, 14);
        this.r = new gif(ghtVar, gkgVar, gjtVar, this, 13);
        this.s = new gif(ghtVar, gkgVar, gjtVar, this, 16);
        this.t = new gif(ghtVar, gkgVar, gjtVar, this, 18);
        this.u = new gif(ghtVar, gkgVar, gjtVar, this, 17);
        this.v = new gif(ghtVar, gkgVar, gjtVar, this, 19);
        this.w = new gif(ghtVar, gkgVar, gjtVar, this, 20);
        this.x = new gif(ghtVar, gkgVar, gjtVar, this, 21);
        this.y = new gif(ghtVar, gkgVar, gjtVar, this, 22);
        this.z = new gif(ghtVar, gkgVar, gjtVar, this, 23);
        this.A = new gif(ghtVar, gkgVar, gjtVar, this, 24);
        this.B = new gif(ghtVar, gkgVar, gjtVar, this, 25);
        this.C = new gif(ghtVar, gkgVar, gjtVar, this, 26);
        this.D = new gif(ghtVar, gkgVar, gjtVar, this, 27);
        this.E = new gif(ghtVar, gkgVar, gjtVar, this, 28);
        this.F = new gif(ghtVar, gkgVar, gjtVar, this, 29);
        this.G = new gif(ghtVar, gkgVar, gjtVar, this, 30);
        this.H = new gif(ghtVar, gkgVar, gjtVar, this, 31);
        this.I = new gif(ghtVar, gkgVar, gjtVar, this, 32);
        this.J = new gif(ghtVar, gkgVar, gjtVar, this, 33);
        this.K = new gif(ghtVar, gkgVar, gjtVar, this, 15);
        this.L = new gif(ghtVar, gkgVar, gjtVar, this, 34);
        this.M = new gif(ghtVar, gkgVar, gjtVar, this, 35);
        this.N = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 42));
        this.O = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 41));
        this.P = new gif(ghtVar, gkgVar, gjtVar, this, 43);
        this.Q = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 44));
        this.R = new gif(ghtVar, gkgVar, gjtVar, this, 46);
        this.S = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 47));
        this.T = new gif(ghtVar, gkgVar, gjtVar, this, 48);
        this.U = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 50));
        this.V = aupu.b(new gif(ghtVar, gkgVar, gjtVar, this, 51));
        this.W = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 52));
        this.X = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 49));
        this.Y = aupu.b(new gif(ghtVar, gkgVar, gjtVar, this, 45));
        this.Z = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 40));
        this.aa = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 53));
        gif gifVar2 = new gif(ghtVar, gkgVar, gjtVar, this, 54);
        this.ab = gifVar2;
        this.ac = aupm.c(gifVar2);
        this.ad = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 39));
        this.ae = aupm.c(ghtVar.kk);
        this.af = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 55));
        this.ag = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 38));
        this.ah = new gif(ghtVar, gkgVar, gjtVar, this, 37);
        this.ai = new gif(ghtVar, gkgVar, gjtVar, this, 56);
        this.aj = new gif(ghtVar, gkgVar, gjtVar, this, 60);
        this.ak = new gif(ghtVar, gkgVar, gjtVar, this, 61);
        this.al = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 62));
        this.am = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 59));
        this.an = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 63));
        this.ao = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 65));
        this.ap = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 64));
        this.aq = new gif(ghtVar, gkgVar, gjtVar, this, 66);
        this.ar = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 67));
        this.as = new gif(ghtVar, gkgVar, gjtVar, this, 58);
        this.at = new gif(ghtVar, gkgVar, gjtVar, this, 57);
        this.au = new gif(ghtVar, gkgVar, gjtVar, this, 69);
        this.av = new gif(ghtVar, gkgVar, gjtVar, this, 70);
        this.aw = new gif(ghtVar, gkgVar, gjtVar, this, 68);
        this.ax = new gif(ghtVar, gkgVar, gjtVar, this, 36);
        this.ay = new gif(ghtVar, gkgVar, gjtVar, this, 71);
        this.az = new gif(ghtVar, gkgVar, gjtVar, this, 73);
        this.aA = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 74));
        this.aB = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 76));
        this.aC = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 75));
        this.aD = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 77));
        this.aE = aupu.b(new gif(ghtVar, gkgVar, gjtVar, this, 81));
        this.aF = new gif(ghtVar, gkgVar, gjtVar, this, 80);
        this.aG = new gif(ghtVar, gkgVar, gjtVar, this, 79);
        this.aH = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 84));
        this.aI = new gif(ghtVar, gkgVar, gjtVar, this, 86);
        this.aJ = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 85));
        this.aK = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 83));
        this.aL = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 82));
        this.aM = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 87));
        this.aN = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 78));
        this.aO = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 88));
        gif gifVar3 = new gif(ghtVar, gkgVar, gjtVar, this, 90);
        this.aP = gifVar3;
        this.aQ = aupm.c(gifVar3);
        this.aR = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 91));
        gif gifVar4 = new gif(ghtVar, gkgVar, gjtVar, this, 92);
        this.aS = gifVar4;
        this.aT = aupm.c(gifVar4);
        aupr auprVar = gjo.b;
        this.aU = auprVar;
        this.aV = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 89));
        this.aW = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 93));
        this.aX = new gif(ghtVar, gkgVar, gjtVar, this, 94);
        this.aY = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 95));
        this.aZ = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 96));
        this.ba = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 98));
        gif gifVar5 = new gif(ghtVar, gkgVar, gjtVar, this, 99);
        this.bb = gifVar5;
        this.bc = aupm.c(gifVar5);
        gif gifVar6 = new gif(ghtVar, gkgVar, gjtVar, this, 100);
        this.bd = gifVar6;
        this.be = aupm.c(gifVar6);
        this.bf = new gif(ghtVar, gkgVar, gjtVar, this, 97);
        this.bg = new gif(ghtVar, gkgVar, gjtVar, this, 101);
        this.bh = new gif(ghtVar, gkgVar, gjtVar, this, 102);
        this.bi = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 72));
        this.bj = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 103));
        this.bk = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 104));
        this.bl = new gif(ghtVar, gkgVar, gjtVar, this, 107);
        this.bm = new gif(ghtVar, gkgVar, gjtVar, this, 108);
        this.bn = new gif(ghtVar, gkgVar, gjtVar, this, 106);
        this.bo = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 105));
        this.bp = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 109));
        this.bq = aupu.b(new gif(ghtVar, gkgVar, gjtVar, this, 111));
        this.br = new gif(ghtVar, gkgVar, gjtVar, this, 110);
        this.bs = new gif(ghtVar, gkgVar, gjtVar, this, 112);
        this.bt = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 114));
        this.bu = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 115));
        this.bv = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 113));
        this.bw = new gif(ghtVar, gkgVar, gjtVar, this, 116);
        this.bx = new gif(ghtVar, gkgVar, gjtVar, this, 117);
        this.by = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 120));
        this.bz = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 119));
        this.bA = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 121));
        this.bB = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 122));
        this.bC = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, R.styleable.AppCompatTheme_windowMinWidthMajor));
        this.bD = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 123));
        this.bE = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, R.styleable.AppCompatTheme_windowNoTitle));
        this.bF = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, R.styleable.AppCompatTheme_windowMinWidthMinor));
        this.bG = new gif(ghtVar, gkgVar, gjtVar, this, 118);
        this.bH = new gif(ghtVar, gkgVar, gjtVar, this, 127);
        this.bI = aupu.b(new gif(ghtVar, gkgVar, gjtVar, this, SemanticState.Focused));
        this.bJ = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 129));
        this.bK = aupu.b(new gif(ghtVar, gkgVar, gjtVar, this, 130));
        this.bL = aupu.b(new gif(ghtVar, gkgVar, gjtVar, this, 132));
        this.bM = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 131));
        this.bN = aupu.b(new gif(ghtVar, gkgVar, gjtVar, this, 135));
        this.bO = aupu.b(new gif(ghtVar, gkgVar, gjtVar, this, 134));
        this.bP = aupu.b(new gif(ghtVar, gkgVar, gjtVar, this, 137));
        this.bQ = aupu.b(new gif(ghtVar, gkgVar, gjtVar, this, 136));
        this.bR = new gif(ghtVar, gkgVar, gjtVar, this, 139);
        this.bS = new gif(ghtVar, gkgVar, gjtVar, this, 138);
        this.bT = aupu.b(new gif(ghtVar, gkgVar, gjtVar, this, 133));
        this.bU = aupu.b(new gif(ghtVar, gkgVar, gjtVar, this, 140));
        this.bV = aupu.b(new gif(ghtVar, gkgVar, gjtVar, this, 141));
        this.bW = new gif(ghtVar, gkgVar, gjtVar, this, 144);
        this.bX = new gif(ghtVar, gkgVar, gjtVar, this, 143);
        this.bY = new gif(ghtVar, gkgVar, gjtVar, this, 145);
        this.bZ = new gif(ghtVar, gkgVar, gjtVar, this, 146);
        this.ca = new gif(ghtVar, gkgVar, gjtVar, this, 149);
        this.cb = new gif(ghtVar, gkgVar, gjtVar, this, 148);
        this.cc = new gif(ghtVar, gkgVar, gjtVar, this, 151);
        this.cd = new gif(ghtVar, gkgVar, gjtVar, this, 150);
        this.ce = auprVar;
        this.cf = new gif(ghtVar, gkgVar, gjtVar, this, 152);
        this.cg = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 153));
        this.ch = new gif(ghtVar, gkgVar, gjtVar, this, 147);
        this.ci = new gif(ghtVar, gkgVar, gjtVar, this, 154);
        this.cj = new gif(ghtVar, gkgVar, gjtVar, this, 155);
        this.ck = aupm.c(new gif(ghtVar, gkgVar, gjtVar, this, 142));
    }

    @Override // defpackage.adfm
    public final adfk A() {
        cc ccVar = (cc) ((aupo) this.b).b;
        if (!(ccVar instanceof adfj)) {
            throw new IllegalStateException(enb.d(ccVar, adfk.class, "Attempt to inject a Fragment wrapper of type "));
        }
        adfj adfjVar = (adfj) ccVar;
        adfjVar.getClass();
        Bundle bundleA = a();
        ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) this.a.a.iQ.io();
        ahno.G(bundleA.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
        adfi adfiVar = (adfi) ahng.aC(bundleA, "TIKTOK_FRAGMENT_ARGUMENT", adfi.a, extensionRegistryLite);
        adfiVar.getClass();
        aupr auprVar = this.i;
        xgn xgnVar = (xgn) this.ae.io();
        afip afipVar = (afip) this.m.io();
        gjt gjtVar = this.cn;
        return new adfk(adfjVar, adfiVar, auprVar, xgnVar, afipVar, gjtVar.ap(), (abfv) gjtVar.Y.io());
    }

    @Override // defpackage.aeoe
    public final aeod B() {
        cc ccVar = (cc) ((aupo) this.b).b;
        if (!(ccVar instanceof aenx)) {
            throw new IllegalStateException(enb.d(ccVar, aeod.class, "Attempt to inject a Fragment wrapper of type "));
        }
        aenx aenxVar = (aenx) ccVar;
        aenxVar.getClass();
        return new aeod(aenxVar, aupm.b(this.ck), (tre) this.a.Q.io());
    }

    @Override // defpackage.afxi
    public final afxk C() {
        return new afxk((afvq) this.cn.cc.d.io());
    }

    public final agkj D() {
        agkh agkhVarF = agkj.f(12);
        gjt gjtVar = this.cn;
        agkhVarF.e(ner.class, gjtVar.v());
        agkhVarF.e(myn.class, gjtVar.m());
        agkhVarF.e(nad.class, gjtVar.p());
        agkhVarF.e(nee.class, gjtVar.t());
        agkhVarF.e(nbi.class, gjtVar.r());
        agkhVarF.e(myz.class, gjtVar.n());
        agkhVarF.e(nar.class, gjtVar.q());
        agkhVarF.e(mzt.class, gjtVar.u());
        agkhVarF.e(mzq.class, gjtVar.o());
        agkhVarF.e(ncq.class, gjtVar.s());
        agkhVarF.e(ndv.class, gjtVar.g());
        agkhVarF.e(mww.class, gjtVar.l());
        return agkhVarF.d(true);
    }

    public final agkj E() {
        agkh agkhVarF = agkj.f(9);
        ght ghtVar = this.a;
        ghx ghxVar = ghtVar.a;
        agkhVarF.e("EnableInteractionLoggingCrashes", ghxVar.P());
        agkhVarF.e("DebugCsi204Logging", ghxVar.N());
        agkhVarF.e("DebugCsiTickTimeSinceStart", ghxVar.O());
        agkhVarF.e(aawb.QUICK_SEEK_PREFERENCE_STRING, aaje.x((tpq) ghtVar.lx.io()));
        agkhVarF.e("nerd_stats_enabled", aaje.w((tpq) ghtVar.lx.io()));
        agkhVarF.e("autonav", aaje.v((tpq) ghtVar.lx.io(), (abix) ghtVar.ly.io()));
        agkhVarF.e("innertube_safety_mode_enabled", new vzp((hed) ghtVar.bC.io()));
        agkhVarF.e("pref_allow_external_devices_to_start_playback", new tvn((tpk) ghtVar.FJ.io(), new heo(4), new iam(17)));
        agkhVarF.e("limit_mobile_data_usage", new tvn((tpq) ghtVar.cK.io(), new heo(3), new iam(16)));
        return agkhVarF.d(true);
    }

    public final Map F() {
        return agkj.j(unj.class, this.aF);
    }

    public final gja G() {
        return rsb.n((cc) ((aupo) this.b).b);
    }

    @Override // defpackage.afqa
    public final gjb H() {
        return new gjb(this.a, this.cl, this.cn);
    }

    @Override // defpackage.afoo
    public final afpa I() {
        return (afpa) this.cn.c.io();
    }

    public final void J() {
        ght ghtVar = this.a;
    }

    public final zf K() {
        return new zf(this.cn.e.io(), (byte[]) null);
    }

    public final vwt L() {
        boc lifecycle = ((bog) ((aupo) this.b).b).getLifecycle();
        lifecycle.getClass();
        return new vwt(lifecycle);
    }

    @Override // defpackage.afoo
    public final aciz M() {
        return new aciz((awmd) aupt.a, new hil());
    }

    public final aaok N() {
        ght ghtVar = this.a;
        return new aaok((ytv) ghtVar.ia.io(), (abrg) ghtVar.gN.io(), (zfs) ghtVar.hO.io(), (txp) ghtVar.aS.io());
    }

    public final aaok O() {
        N();
        ght ghtVar = this.a;
        return new aaok((ahey) ghtVar.u.io(), (abps) ghtVar.ke.io(), ghtVar.a.dc(), (zwb) ghtVar.bd.io());
    }

    public final zs P() {
        return new zs(v(), (byte[]) null);
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [awmd, java.lang.Object] */
    public final qcb Q() {
        quo quoVarE;
        ghx ghxVar = this.a.a;
        vxz vxzVarCs = ghxVar.cs();
        ght ghtVar = ghxVar.a;
        rbi rbiVar = (rbi) ghxVar.iA.io();
        aunn aunnVarB = aupm.b(ghxVar.iD);
        Optional optionalEmpty = Optional.empty();
        Optional optionalOf = Optional.of(ghxVar.iE);
        sla slaVar = new sla(Optional.of((Key) ghtVar.hp.io()), 4);
        optionalOf.isPresent();
        ?? r9 = optionalOf.get();
        Object obj = slaVar.a;
        jsk jskVar = (jsk) r9.io();
        byte[] bArr = null;
        if (jskVar == null) {
            quoVarE = null;
        } else {
            sry sryVarA = quo.a();
            sryVarA.a = jskVar;
            sryVarA.b = obj;
            quoVarE = sryVarA.e();
        }
        Optional.ofNullable(quoVarE);
        qua quaVarC = ugi.c(vxzVarCs);
        if (vxzVarCs.l(102, 45769441L, false)) {
            optionalEmpty.isPresent();
        } else {
            Optional.empty();
        }
        return new qcb(new tzu(quaVarC, rbiVar, aunnVarB), bArr);
    }

    public final xsc R() {
        ght ghtVar = this.a;
        return new xsc((Context) ghtVar.v.io(), (ahey) ghtVar.u.io(), (aaok) ghtVar.a.iz.io(), (zvl) ghtVar.dO.io());
    }

    public final ahgb S() {
        ght ghtVar = this.a;
        return new ahgb((zvl) ghtVar.dO.io(), agkz.q("asset_item_selected_entity", "editor_asset_item_selected_entity"), (vao) this.az.io(), (aaok) ghtVar.a.iz.io(), (vbf) this.aG.io());
    }

    public final xsc T() {
        ght ghtVar = this.a;
        xeu xeuVar = (xeu) ghtVar.aZ.io();
        zvl zvlVar = (zvl) ghtVar.dO.io();
        return new xsc((Object) xeuVar, (Object) zvlVar, ghtVar.a.iD.io(), (char[]) null);
    }

    public final Bundle a() {
        Bundle arguments = ((cc) ((aupo) this.b).b).getArguments();
        return arguments == null ? new Bundle() : arguments;
    }

    @Override // defpackage.hhk
    public final hhj b() {
        cc ccVar = (cc) ((aupo) this.b).b;
        if (!(ccVar instanceof hhh)) {
            throw new IllegalStateException(enb.d(ccVar, hhj.class, "Attempt to inject a Fragment wrapper of type "));
        }
        hhh hhhVar = (hhh) ccVar;
        hhhVar.getClass();
        return new hhj(hhhVar, aupm.b(this.cl.x));
    }

    @Override // defpackage.ipa
    public final ioz c() {
        cc ccVar = (cc) ((aupo) this.b).b;
        if (!(ccVar instanceof AboutSettingsFragment)) {
            throw new IllegalStateException(enb.d(ccVar, ioz.class, "Attempt to inject a Fragment wrapper of type "));
        }
        AboutSettingsFragment aboutSettingsFragment = (AboutSettingsFragment) ccVar;
        aboutSettingsFragment.getClass();
        return new ioz(aboutSettingsFragment);
    }

    @Override // defpackage.ipc
    public final ipb d() {
        cc ccVar = (cc) ((aupo) this.b).b;
        if (!(ccVar instanceof DataSavingSettingsFragment)) {
            throw new IllegalStateException(enb.d(ccVar, ipb.class, "Attempt to inject a Fragment wrapper of type "));
        }
        DataSavingSettingsFragment dataSavingSettingsFragment = (DataSavingSettingsFragment) ccVar;
        dataSavingSettingsFragment.getClass();
        ght ghtVar = this.a;
        SharedPreferences sharedPreferences = (SharedPreferences) ghtVar.J.io();
        axfd axfdVar = (axfd) ghtVar.cE.io();
        hvs hvsVar = (hvs) ghtVar.a.dz.io();
        jnm jnmVar = (jnm) ghtVar.cF.io();
        aupr auprVar = ghtVar.cr;
        return new ipb(dataSavingSettingsFragment, sharedPreferences, axfdVar, hvsVar, jnmVar, (jkp) auprVar.io(), (hbf) ghtVar.cz.io(), new ahgb(this.cn.e, ghtVar.cs, ghtVar.bd, ghtVar.z, auprVar, (char[]) null));
    }

    @Override // defpackage.ipe
    public final ipd e() {
        cc ccVar = (cc) ((aupo) this.b).b;
        if (!(ccVar instanceof DrillDownSettingsFragment)) {
            throw new IllegalStateException(enb.d(ccVar, ipd.class, "Attempt to inject a Fragment wrapper of type "));
        }
        DrillDownSettingsFragment drillDownSettingsFragment = (DrillDownSettingsFragment) ccVar;
        drillDownSettingsFragment.getClass();
        return new ipd(drillDownSettingsFragment, this.cn.d());
    }

    @Override // defpackage.ipg
    public final ipf f() {
        cc ccVar = (cc) ((aupo) this.b).b;
        if (!(ccVar instanceof GeneralSettingsFragment)) {
            throw new IllegalStateException(enb.d(ccVar, ipf.class, "Attempt to inject a Fragment wrapper of type "));
        }
        GeneralSettingsFragment generalSettingsFragment = (GeneralSettingsFragment) ccVar;
        generalSettingsFragment.getClass();
        ght ghtVar = this.a;
        return new ipf(generalSettingsFragment, (jnm) ghtVar.cF.io(), (jnj) ghtVar.mp.io(), (jkp) ghtVar.cr.io(), (woh) ghtVar.xW.io(), (xeu) ghtVar.aZ.io(), (vxz) ghtVar.cu.io());
    }

    @Override // defpackage.ipi
    public final iph g() {
        cc ccVar = (cc) ((aupo) this.b).b;
        if (!(ccVar instanceof NotificationsSettingsFragment)) {
            throw new IllegalStateException(enb.d(ccVar, iph.class, "Attempt to inject a Fragment wrapper of type "));
        }
        NotificationsSettingsFragment notificationsSettingsFragment = (NotificationsSettingsFragment) ccVar;
        notificationsSettingsFragment.getClass();
        return new iph(notificationsSettingsFragment, this.cn.d());
    }

    @Override // defpackage.ipm
    public final ipk h() {
        cc ccVar = (cc) ((aupo) this.b).b;
        if (!(ccVar instanceof OfflineSettingsFragmentCompat)) {
            throw new IllegalStateException(enb.d(ccVar, ipk.class, "Attempt to inject a Fragment wrapper of type "));
        }
        OfflineSettingsFragmentCompat offlineSettingsFragmentCompat = (OfflineSettingsFragmentCompat) ccVar;
        offlineSettingsFragmentCompat.getClass();
        gjt gjtVar = this.cn;
        Context context = (Context) gjtVar.e.io();
        ght ghtVar = this.a;
        hnq hnqVar = (hnq) ghtVar.ct.io();
        hlp hlpVar = (hlp) ghtVar.iR.io();
        abxv abxvVar = (abxv) ghtVar.iK.io();
        hnz hnzVar = (hnz) ghtVar.a.aM.io();
        aanb aanbVar = (aanb) ghtVar.iG.io();
        xeu xeuVar = (xeu) ghtVar.aZ.io();
        jkp jkpVar = (jkp) ghtVar.cr.io();
        jnm jnmVar = (jnm) ghtVar.cF.io();
        tqa tqaVar = (tqa) ghtVar.iC.io();
        jkx jkxVarC = ((jkz) atqp.a(((afpa) gjtVar.c.io()).a, jkz.class)).C();
        jkxVarC.getClass();
        aauk aaukVar = (aauk) ghtVar.iL.io();
        aaqg aaqgVar = (aaqg) ghtVar.iR.io();
        abfv abfvVar = (abfv) ghtVar.iP.io();
        aatx aatxVar = (aatx) ghtVar.sx.io();
        abfv abfvVar2 = (abfv) gjtVar.Y.io();
        vxz vxzVar = (vxz) ghtVar.cu.io();
        vxz vxzVar2 = (vxz) ghtVar.et.io();
        aany aanyVar = (aany) ghtVar.sh.io();
        zwb zwbVar = (zwb) ghtVar.bd.io();
        syn synVar = (syn) ghtVar.cs.io();
        Executor executor = (Executor) ghtVar.z.io();
        return new ipk(offlineSettingsFragmentCompat, context, hnqVar, hlpVar, abxvVar, hnzVar, aanbVar, xeuVar, jkpVar, jnmVar, tqaVar, jkxVarC, aaukVar, aaqgVar, abfvVar, aatxVar, abfvVar2, vxzVar, vxzVar2, aanyVar, zwbVar, synVar, executor, new xsc((awmd) gjtVar.e, (awmd) gjtVar.k, (awmd) ghtVar.iR, (byte[]) null, (byte[]) null));
    }

    @Override // defpackage.ipp
    public final ipo i() {
        cc ccVar = (cc) ((aupo) this.b).b;
        if (!(ccVar instanceof PlaybackSettingsFragment)) {
            throw new IllegalStateException(enb.d(ccVar, ipo.class, "Attempt to inject a Fragment wrapper of type "));
        }
        PlaybackSettingsFragment playbackSettingsFragment = (PlaybackSettingsFragment) ccVar;
        playbackSettingsFragment.getClass();
        ght ghtVar = this.a;
        ytv ytvVar = (ytv) ghtVar.ia.io();
        gjt gjtVar = this.cn;
        return new ipo(playbackSettingsFragment, new aazo(ytvVar, gjtVar.a(), null), gjtVar.d(), (abvn) ghtVar.cH.io(), (jnm) ghtVar.a.cx.io(), (bog) ((aupo) this.b).b, (Executor) ghtVar.B.io(), (jkp) ghtVar.cr.io(), (vxz) ghtVar.cu.io());
    }

    @Override // defpackage.ips
    public final ipr j() {
        cc ccVar = (cc) ((aupo) this.b).b;
        if (!(ccVar instanceof PrivacyPrefsFragmentCompat)) {
            throw new IllegalStateException(enb.d(ccVar, ipr.class, "Attempt to inject a Fragment wrapper of type "));
        }
        PrivacyPrefsFragmentCompat privacyPrefsFragmentCompat = (PrivacyPrefsFragmentCompat) ccVar;
        privacyPrefsFragmentCompat.getClass();
        ght ghtVar = this.a;
        return new ipr(privacyPrefsFragmentCompat, (woh) ghtVar.xW.io(), (xeu) ghtVar.aZ.io(), this.cn.d(), (zwb) ghtVar.bd.io(), (syn) ghtVar.cs.io(), (hfx) ghtVar.cw.io(), (vxz) ghtVar.cv.io(), (Executor) ghtVar.z.io());
    }

    @Override // defpackage.ipu
    public final ipt k() {
        cc ccVar = (cc) ((aupo) this.b).b;
        if (!(ccVar instanceof RecommendationsSettingsFragment)) {
            throw new IllegalStateException(enb.d(ccVar, ipt.class, "Attempt to inject a Fragment wrapper of type "));
        }
        RecommendationsSettingsFragment recommendationsSettingsFragment = (RecommendationsSettingsFragment) ccVar;
        recommendationsSettingsFragment.getClass();
        return new ipt(recommendationsSettingsFragment, this.cn.d());
    }

    @Override // defpackage.ipx
    public final ipw l() {
        cc ccVar = (cc) ((aupo) this.b).b;
        if (!(ccVar instanceof RestrictedModeSettingsFragment)) {
            throw new IllegalStateException(enb.d(ccVar, ipw.class, "Attempt to inject a Fragment wrapper of type "));
        }
        RestrictedModeSettingsFragment restrictedModeSettingsFragment = (RestrictedModeSettingsFragment) ccVar;
        restrictedModeSettingsFragment.getClass();
        gjt gjtVar = this.cn;
        ght ghtVar = this.a;
        return new ipw(restrictedModeSettingsFragment, gjtVar.d(), (jkp) ghtVar.cr.io(), (woh) ghtVar.xW.io(), (xeu) ghtVar.aZ.io());
    }

    @Override // defpackage.iqa
    public final ipz m() {
        cc ccVar = (cc) ((aupo) this.b).b;
        if (!(ccVar instanceof SettingsHeadersFragment)) {
            throw new IllegalStateException(enb.d(ccVar, ipz.class, "Attempt to inject a Fragment wrapper of type "));
        }
        SettingsHeadersFragment settingsHeadersFragment = (SettingsHeadersFragment) ccVar;
        settingsHeadersFragment.getClass();
        ght ghtVar = this.a;
        return new ipz(settingsHeadersFragment, (axfd) ghtVar.cE.io(), (vxe) this.cn.i.io(), (zwb) ghtVar.bd.io(), (omj) ghtVar.ys.io(), (vxz) ghtVar.cu.io(), (vxz) this.M.io());
    }

    public final ulq n() {
        gjt gjtVar = this.cn;
        aupr auprVar = gjtVar.aW;
        ght ghtVar = this.a;
        aupr auprVar2 = ghtVar.B;
        aupr auprVar3 = this.b;
        aupr auprVar4 = gjtVar.bg;
        ghx ghxVar = ghtVar.a;
        return new ulq(auprVar, auprVar2, auprVar3, auprVar4, ghxVar.iz, this.az, this.X, this.aA, this.aC, this.av, this.P, ghtVar.du, ghxVar.iF, this.O, this.aD, this.aN, ghxVar.iP, ghtVar.dO, gjtVar.br, this.aO, this.aV, this.ak, ghtVar.dA, gjtVar.bs, this.aW, gjtVar.W, gjtVar.bf, ghxVar.iy, this.aX, this.aY, this.aZ, this.aT, this.Z, this.bf, this.bg, this.bh, this.aU);
    }

    @Override // defpackage.unp
    public final unn o() {
        aupr auprVar = this.b;
        cc ccVar = (cc) ((aupo) auprVar).b;
        if (!(ccVar instanceof unj)) {
            throw new IllegalStateException(enb.d(ccVar, unn.class, "Attempt to inject a Fragment wrapper of type "));
        }
        unj unjVar = (unj) ccVar;
        unjVar.getClass();
        aupr auprVar2 = this.ax;
        aupr auprVar3 = this.ay;
        gjt gjtVar = this.cn;
        aupr auprVar4 = this.bi;
        aupr auprVar5 = this.bj;
        aupr auprVar6 = this.bk;
        ght ghtVar = this.a;
        aupr auprVar7 = this.bo;
        aupr auprVar8 = this.bp;
        aupr auprVar9 = this.Z;
        aupr auprVar10 = this.br;
        aupr auprVar11 = this.af;
        aupr auprVar12 = this.bs;
        aupr auprVar13 = this.bv;
        aupr auprVar14 = this.bt;
        aupr auprVar15 = this.bw;
        aupr auprVar16 = this.bx;
        gkg gkgVar = this.cl;
        aupr auprVar17 = this.O;
        aupr auprVar18 = gjtVar.bo;
        ghx ghxVar = ghtVar.a;
        uni uniVar = new uni(auprVar2, auprVar3, auprVar18, auprVar4, auprVar5, auprVar, auprVar6, ghxVar.iS, gjtVar.aY, ghxVar.iI, auprVar7, auprVar8, ghtVar.u, ghtVar.B, auprVar9, auprVar10, auprVar11, auprVar12, ghtVar.um, auprVar13, auprVar14, auprVar15, gjtVar.aW, auprVar16, ghxVar.iz, ghtVar.es, gkgVar.c, auprVar17);
        ulp ulpVar = (ulp) this.bi.io();
        rsb.u(G());
        return new unn(unjVar, uniVar, ulpVar, (vfq) gjtVar.aY.io(), (ahey) ghtVar.u.io(), (afip) this.bn.io(), (roq) this.af.io(), (roq) this.al.io(), new roq(agkj.k(ufs.CREATION_FLOW_COMMON, this.bG, ufs.CREATION_FLOW_CUSTOM_PLAYLIST_THUMBNAIL, this.bH), (byte[]) null), (zvl) ghtVar.dO.io(), (adxj) ghtVar.Ad.io(), (uko) this.ac.io(), (vxz) ghtVar.um.io(), (vao) this.az.io());
    }

    @Override // defpackage.uob
    public final uoa p() {
        gjt gjtVar = this.cn;
        Context context = (Context) gjtVar.e.io();
        ght ghtVar = this.a;
        Executor executor = (Executor) ghtVar.B.io();
        qcb qcbVar = (qcb) this.bI.io();
        xsc xscVar = (xsc) this.bJ.io();
        cc ccVar = (cc) ((aupo) this.b).b;
        if (!(ccVar instanceof uns)) {
            throw new IllegalStateException(enb.d(ccVar, uoa.class, "Attempt to inject a Fragment wrapper of type "));
        }
        uns unsVar = (uns) ccVar;
        unsVar.getClass();
        gkg gkgVar = this.cl;
        ghx ghxVar = ghtVar.a;
        affd affdVarO = gkgVar.o();
        und undVar = (und) ghxVar.iS.io();
        qcb qcbVar2 = (qcb) this.bK.io();
        ahey aheyVar = (ahey) ghtVar.u.io();
        zvl zvlVar = (zvl) ghtVar.dO.io();
        roq roqVar = (roq) this.af.io();
        Bundle bundleA = a();
        ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) ghxVar.iQ.io();
        ahno.G(bundleA.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
        upz upzVar = (upz) ahng.aC(bundleA, "TIKTOK_FRAGMENT_ARGUMENT", upz.a, extensionRegistryLite);
        upzVar.getClass();
        xsc xscVar2 = (xsc) this.bM.io();
        zf zfVar = (zf) gjtVar.bA.io();
        unc uncVar = new unc(Optional.empty());
        wbz wbzVar = (wbz) ghtVar.es.io();
        zwh zwhVar = (zwh) gkgVar.c.io();
        vfq vfqVar = (vfq) gjtVar.aY.io();
        vxz vxzVar = (vxz) ghtVar.um.io();
        aaok aaokVar = (aaok) ghxVar.iz.io();
        adxj adxjVar = (adxj) ghtVar.Ad.io();
        adhv adhvVar = (adhv) ghtVar.rB.io();
        Optional.empty();
        return new uoa(context, executor, qcbVar, xscVar, unsVar, affdVarO, undVar, qcbVar2, aheyVar, zvlVar, roqVar, upzVar, xscVar2, zfVar, uncVar, wbzVar, zwhVar, vfqVar, vxzVar, aaokVar, adxjVar, adhvVar, Optional.empty(), gjtVar.F());
    }

    @Override // defpackage.upi
    public final upg q() {
        cc ccVar = (cc) ((aupo) this.b).b;
        if (!(ccVar instanceof uoq)) {
            throw new IllegalStateException(enb.d(ccVar, upg.class, "Attempt to inject a Fragment wrapper of type "));
        }
        uoq uoqVar = (uoq) ccVar;
        uoqVar.getClass();
        Bundle bundleA = a();
        ght ghtVar = this.a;
        ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) ghtVar.a.iQ.io();
        ahno.G(bundleA.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
        upv upvVar = (upv) ahng.aC(bundleA, "TIKTOK_FRAGMENT_ARGUMENT", upv.a, extensionRegistryLite);
        upvVar.getClass();
        gjt gjtVar = this.cn;
        return new upg(uoqVar, upvVar, new aaok(aupm.b(gjtVar.ar), (qcb) this.bT.io(), (Executor) ghtVar.u.io()), (adxj) ghtVar.Ad.io(), (aeda) gjtVar.W.io(), (Executor) ghtVar.B.io(), (qcb) this.bU.io(), (ahex) ghtVar.u.io(), new upj((qcb) ghtVar.yO.io(), (ahex) ghtVar.u.io(), (vxz) ghtVar.ca.io()), (adhv) ghtVar.rB.io(), (zvl) ghtVar.dO.io(), (vxe) gjtVar.i.io(), (acwq) gjtVar.X.io(), (roq) this.af.io());
    }

    public final vam r() {
        if (((vao) this.az.io()).d(((vbf) this.aG.io()).a())) {
            Object objIo = this.aL.io();
            objIo.getClass();
            return (vam) objIo;
        }
        Object objIo2 = this.aM.io();
        objIo2.getClass();
        return (vam) objIo2;
    }

    @Override // defpackage.veb
    public final vea s() {
        gjt gjtVar = this.cn;
        cf cfVar = (cf) gjtVar.k.io();
        ght ghtVar = this.a;
        ByteStore byteStore = (ByteStore) ghtVar.ew.io();
        cc ccVar = (cc) ((aupo) this.b).b;
        if (!(ccVar instanceof vdy)) {
            throw new IllegalStateException(enb.d(ccVar, vea.class, "Attempt to inject a Fragment wrapper of type "));
        }
        vdy vdyVar = (vdy) ccVar;
        vdyVar.getClass();
        gkg gkgVar = this.cl;
        ghx ghxVar = ghtVar.a;
        affd affdVarO = gkgVar.o();
        und undVar = (und) ghxVar.iS.io();
        xte xteVar = (xte) ghxVar.iV.io();
        xgn xgnVar = (xgn) ghtVar.kk.io();
        abfv abfvVar = (abfv) gjtVar.Y.io();
        wsl wslVar = (wsl) ghtVar.mt.io();
        Bundle bundleA = a();
        ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) ghxVar.iQ.io();
        ahno.G(bundleA.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
        aras arasVar = (aras) ahng.aC(bundleA, "TIKTOK_FRAGMENT_ARGUMENT", aras.a, extensionRegistryLite);
        arasVar.getClass();
        aupr auprVar = ghtVar.ga;
        aupr auprVar2 = ghtVar.cu;
        rg rgVarA = ((gfm) atqp.a(((afpa) gjtVar.c.io()).a, gfm.class)).a();
        rgVarA.getClass();
        return new vea(cfVar, byteStore, vdyVar, affdVarO, undVar, xteVar, xgnVar, abfvVar, wslVar, arasVar, auprVar, auprVar2, rgVarA);
    }

    public final vhu t() {
        vfq vfqVar = (vfq) this.cn.aY.io();
        ght ghtVar = this.a;
        return new vhu(vfqVar, (Context) ghtVar.v.io(), ghtVar.a.dk(), (awut) ghtVar.pJ.io(), (Executor) ghtVar.B.io());
    }

    public final vkc u() {
        ghx ghxVar = this.a.a;
        return new vkc((aaok) ghxVar.iz.io(), (xpl) ghxVar.iy.io());
    }

    public final vko v() {
        ght ghtVar = this.a;
        return new vko((Context) ghtVar.v.io(), (zvl) ghtVar.dO.io());
    }

    public final vkt w() {
        gjt gjtVar = this.cn;
        return new vkt((xgm) gjtVar.D.io(), K(), new auzc(gjtVar.a()), (aaok) this.a.a.iz.io());
    }

    public final vkv x() {
        return new vkv((Context) this.cn.e.io());
    }

    @Override // defpackage.vww
    public final vwt y() {
        return new vwt((vxe) this.cn.i.io());
    }

    @Override // defpackage.acxc
    public final acxb z() {
        cc ccVar = (cc) ((aupo) this.b).b;
        if (!(ccVar instanceof acwz)) {
            throw new IllegalStateException(enb.d(ccVar, acxb.class, "Attempt to inject a Fragment wrapper of type "));
        }
        acwz acwzVar = (acwz) ccVar;
        acwzVar.getClass();
        Bundle bundleA = a();
        ght ghtVar = this.a;
        ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) ghtVar.a.iQ.io();
        ahno.G(bundleA.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
        acwy acwyVar = (acwy) ahng.aC(bundleA, "TIKTOK_FRAGMENT_ARGUMENT", acwy.a, extensionRegistryLite);
        acwyVar.getClass();
        afip afipVar = (afip) this.bn.io();
        gjt gjtVar = this.cn;
        return new acxb(acwzVar, acwyVar, afipVar, (aciz) gjtVar.aF.io(), (xgn) this.ae.io(), (abfv) gjtVar.Y.io(), gjtVar.ap(), (vxe) gjtVar.i.io(), (vxz) ghtVar.cB.io());
    }
}

package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.activities.MusicActivity;
import com.google.android.apps.youtube.music.player.MusicPlayerView;
import com.google.android.apps.youtube.music.watch.WatchFragment;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import com.google.android.libraries.youtube.slimstatusbar.SlimStatusBar;
import com.google.android.material.tabs.TabLayout;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class get extends geu implements afgr, gey {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/activities/MusicActivityPeer");
    public static final Duration b = Duration.ofSeconds(3);
    public avmn A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final aunn E;
    public final aunn F;
    public final aunn G;
    public final aunn H;
    public final aunn I;
    public final aunn J;
    public final ScheduledExecutorService K;
    public final aunn L;
    public final aunn M;
    public final aunn N;
    public final aunn O;
    public final aunn P;
    public final aunn Q;
    public final aunn R;
    public final aunn S;
    public final aunn T;
    public final aunn U;
    public final aunn V;
    public final aunn W;
    public final aunn X;
    public final aunn Y;
    public final aunn Z;
    public final aunn aA;
    public final aunn aB;
    public final aunn aC;
    public final aunn aD;
    public final aunn aE;
    public final aunn aF;
    public final aunn aG;
    public final aunn aH;
    public final aunn aI;
    public final aunn aJ;
    public final aunn aK;
    public final aunn aL;
    public final aunn aM;
    public final aunn aN;
    public final aunn aO;
    public final aunn aP;
    public final aunn aQ;
    public final aunn aR;
    public final aunn aS;
    public final aunn aT;
    public final aunn aU;
    public final aunn aV;
    public final aunn aW;
    public final aunn aX;
    public final aunn aY;
    public final aunn aZ;
    public final Handler aa;
    public final aunn ab;
    public final aunn ac;
    public final aunn ad;
    public final aunn ae;
    public final aunn af;
    public final aunn ag;
    public final aunn ah;
    public final aunn ai;
    public final aunn aj;
    public final aunn ak;
    public final aunn al;
    public final aunn am;
    public final aunn an;
    public final aunn ao;
    public final aunn ap;
    public final aunn aq;
    public final aunn ar;
    public final aunn as;
    public final aunn at;
    public final aunn au;
    public final aunn av;
    public final aunn aw;
    public final aunn ax;
    public final aunn ay;
    public final aunn az;
    public final xir bA;
    public final aunn bB;
    public final aunn bC;
    public final aunn bD;
    public final aunn bE;
    public final aunn bF;
    public final aunn bG;
    public final aunn bH;
    public final aunn bI;
    public final aunn bJ;
    public final aunn bK;
    public final aunn bL;
    public final aunn bM;
    public final aunn bN;
    public final aunn bO;
    final aunn bP;
    public final aunn bQ;
    public final aunn bR;
    public final aunn bS;
    public final aunn bT;
    public final tfq bU;
    public final hkl bV;
    public final vxz bW;
    public final vxz bX;
    public final vxz bY;
    public final vxz bZ;
    public final jkg ba;
    public final isi bb;
    public final hlp bc;
    public final iwe bd;
    public final ibe be;
    public final aunn bf;
    public final Set bg;
    public final MusicActivity bh;
    public final tqj bi;
    public final aunn bj;
    public final aunn bk;
    public final aunn bl;
    public final aunn bm;
    public final aunn bn;
    public final aunn bo;
    public final aunn bp;
    public final aunn bq;
    public final aunn br;
    public final aunn bs;
    public final aunn bt;
    public final aunn bu;
    public final aunn bv;
    public final aunn bw;
    public final aunn bx;
    public final avlh by;
    public final avlh bz;
    public boolean c;
    private final vwt cA;
    private final syn cB;
    private final oml cC;
    private ahud cD;
    public afwv ca;
    public aaok cb;
    public final hhb cc;
    private boolean ce;
    private Uri cf;
    private ViewGroup cg;
    private final aunn ch;
    private final aunn ci;
    private final aunn cj;
    private final aunn ck;
    private final aunn cl;
    private final aunn cm;
    private final awmd cn;
    private final aunn co;
    private final aunn cp;
    private final aunn cq;
    private final aunn cr;
    private final affh cs;
    private final aunn ct;
    private final aunn cu;
    private final aunn cv;
    private final aunn cw;
    private final aunn cx;
    private final aunn cy;
    private final vxz cz;
    public final qr d;
    public final qr e;
    public dd f;
    public WatchFragment g;
    public boolean h;
    public boolean i;
    public WatchWhileLayout j;
    public ViewGroup k;
    public FrameLayout l;
    public View m;
    public View n;
    public hww o;
    public boolean p;
    public boolean q;
    public joz r;
    public final avmm s;
    public final avmm t;
    public final AtomicBoolean u;
    public final AtomicBoolean v;
    public final jlf w;
    public final cx x;
    public final avmb y;
    public avmn z;

    public get(final MusicActivity musicActivity, affh affhVar, oml omlVar, syn synVar, tqj tqjVar, vwt vwtVar, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6, aunn aunnVar7, aunn aunnVar8, aunn aunnVar9, aunn aunnVar10, vxz vxzVar, aunn aunnVar11, aunn aunnVar12, aunn aunnVar13, avmb avmbVar, aunn aunnVar14, aunn aunnVar15, aunn aunnVar16, aunn aunnVar17, vxz vxzVar2, aunn aunnVar18, aunn aunnVar19, vxz vxzVar3, aunn aunnVar20, avlh avlhVar, avlh avlhVar2, xir xirVar, aunn aunnVar21, aunn aunnVar22, aunn aunnVar23, aunn aunnVar24, aunn aunnVar25, aunn aunnVar26, aunn aunnVar27, aunn aunnVar28, aunn aunnVar29, aunn aunnVar30, aunn aunnVar31, aunn aunnVar32, aunn aunnVar33, aunn aunnVar34, aunn aunnVar35, aunn aunnVar36, aunn aunnVar37, aunn aunnVar38, ScheduledExecutorService scheduledExecutorService, aunn aunnVar39, aunn aunnVar40, aunn aunnVar41, aunn aunnVar42, aunn aunnVar43, aunn aunnVar44, aunn aunnVar45, aunn aunnVar46, aunn aunnVar47, aunn aunnVar48, aunn aunnVar49, aunn aunnVar50, aunn aunnVar51, aunn aunnVar52, aunn aunnVar53, aunn aunnVar54, aunn aunnVar55, aunn aunnVar56, aunn aunnVar57, aunn aunnVar58, Handler handler, aunn aunnVar59, aunn aunnVar60, aunn aunnVar61, aunn aunnVar62, aunn aunnVar63, aunn aunnVar64, aunn aunnVar65, aunn aunnVar66, aunn aunnVar67, aunn aunnVar68, aunn aunnVar69, aunn aunnVar70, aunn aunnVar71, aunn aunnVar72, aunn aunnVar73, aunn aunnVar74, aunn aunnVar75, aunn aunnVar76, aunn aunnVar77, aunn aunnVar78, aunn aunnVar79, aunn aunnVar80, aunn aunnVar81, aunn aunnVar82, awmd awmdVar, aunn aunnVar83, aunn aunnVar84, aunn aunnVar85, aunn aunnVar86, aunn aunnVar87, aunn aunnVar88, aunn aunnVar89, aunn aunnVar90, aunn aunnVar91, aunn aunnVar92, aunn aunnVar93, aunn aunnVar94, aunn aunnVar95, aunn aunnVar96, aunn aunnVar97, aunn aunnVar98, aunn aunnVar99, aunn aunnVar100, aunn aunnVar101, aunn aunnVar102, aunn aunnVar103, aunn aunnVar104, aunn aunnVar105, vxz vxzVar4, vxz vxzVar5, aunn aunnVar106, aunn aunnVar107, aunn aunnVar108, aunn aunnVar109, aunn aunnVar110, aunn aunnVar111, aunn aunnVar112, aunn aunnVar113, aunn aunnVar114, aunn aunnVar115, aunn aunnVar116, aunn aunnVar117, aunn aunnVar118, aunn aunnVar119, aunn aunnVar120, aunn aunnVar121, tfq tfqVar, jkg jkgVar, isi isiVar, hlp hlpVar, hkl hklVar, iwe iweVar, ibe ibeVar, aunn aunnVar122, Set set, aunn aunnVar123, aunn aunnVar124) {
        qih qihVar = qih.a;
        qfk qfkVar = new qfk(SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
        qfk qfkVar2 = qihVar.n.b;
        if (qpj.h(Thread.currentThread()) && qihVar.b != null && qfkVar.a <= SystemClock.elapsedRealtime() && ((qfkVar2 == null || qfkVar.a <= qfkVar2.a) && qihVar.g == null)) {
            qihVar.g = qfkVar;
        }
        this.d = new gen(this);
        this.e = new geo(this);
        this.o = hww.a;
        this.s = new avmm();
        this.t = new avmm();
        this.u = new AtomicBoolean();
        this.v = new AtomicBoolean(false);
        this.w = new gep(this);
        this.D = true;
        this.bh = musicActivity;
        this.cs = affhVar;
        this.cC = omlVar;
        this.cB = synVar;
        this.bi = tqjVar;
        this.cA = vwtVar;
        this.bj = aunnVar2;
        this.bk = aunnVar3;
        this.bl = aunnVar4;
        this.ct = aunnVar5;
        this.bm = aunnVar6;
        this.bn = aunnVar7;
        this.bo = aunnVar8;
        this.bp = aunnVar9;
        this.bq = aunnVar10;
        this.bY = vxzVar;
        this.br = aunnVar12;
        this.bs = aunnVar13;
        this.bB = aunnVar21;
        this.bC = aunnVar22;
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            Intent intent = musicActivity.getIntent();
            if (!intent.hasCategory("android.intent.category.LAUNCHER") && (intent.getFlags() & 268468224) == 0 && intent.getExtras() != null && !intent.getExtras().isEmpty()) {
                ((agrc) ((agrc) afhb.a.c()).k("com/google/apps/tiktok/account/api/controller/Config", "forLauncherActivity", 70, "Config.java")).w("Launcher config used on invalid activity: %s", musicActivity.getClass());
            }
        }
        afha afhaVarA = afhb.a();
        afhaVarA.c(true);
        afhaVarA.b(rqz.class);
        affhVar.a(afhaVarA.a()).c(this);
        this.cu = aunnVar11;
        this.y = avmbVar;
        this.cc = new hhb(this);
        this.bu = aunnVar14;
        this.bv = aunnVar17;
        this.bx = aunnVar16;
        this.bw = aunnVar18;
        this.cz = vxzVar3;
        this.bZ = vxzVar2;
        this.bt = aunnVar19;
        this.cv = aunnVar20;
        this.by = avlhVar;
        this.bz = avlhVar2;
        this.bA = xirVar;
        this.bD = aunnVar23;
        this.cx = aunnVar26;
        this.cw = aunnVar27;
        this.bE = aunnVar24;
        this.bF = aunnVar25;
        this.aZ = aunnVar123;
        this.cy = aunnVar;
        this.bG = aunnVar28;
        this.bH = aunnVar29;
        this.bI = aunnVar30;
        this.bJ = aunnVar31;
        this.bK = aunnVar124;
        this.E = aunnVar32;
        this.F = aunnVar33;
        this.G = aunnVar34;
        this.H = aunnVar35;
        this.I = aunnVar36;
        this.J = aunnVar37;
        this.bL = aunnVar38;
        this.K = scheduledExecutorService;
        this.L = aunnVar39;
        this.M = aunnVar40;
        this.N = aunnVar41;
        this.bM = aunnVar42;
        this.O = aunnVar43;
        this.P = aunnVar44;
        this.Q = aunnVar45;
        this.ch = aunnVar46;
        this.ci = aunnVar47;
        this.R = aunnVar48;
        this.cj = aunnVar49;
        this.S = aunnVar50;
        this.bN = aunnVar51;
        this.T = aunnVar52;
        this.U = aunnVar53;
        this.V = aunnVar54;
        this.W = aunnVar55;
        this.X = aunnVar56;
        this.Y = aunnVar57;
        this.Z = aunnVar58;
        this.aa = handler;
        this.ab = aunnVar59;
        this.ac = aunnVar60;
        this.ck = aunnVar61;
        this.ad = aunnVar62;
        this.ae = aunnVar63;
        this.cl = aunnVar64;
        this.bO = aunnVar65;
        this.af = aunnVar66;
        this.cm = aunnVar67;
        this.ag = aunnVar68;
        this.ah = aunnVar69;
        this.ai = aunnVar70;
        this.aj = aunnVar71;
        this.ak = aunnVar72;
        this.al = aunnVar73;
        this.am = aunnVar74;
        this.an = aunnVar75;
        this.ao = aunnVar76;
        this.ap = aunnVar77;
        this.aq = aunnVar78;
        this.ar = aunnVar79;
        this.as = aunnVar80;
        this.at = aunnVar81;
        this.au = aunnVar82;
        this.cn = awmdVar;
        this.av = aunnVar83;
        this.aw = aunnVar84;
        this.ax = aunnVar85;
        this.ay = aunnVar86;
        this.co = aunnVar87;
        this.bP = aunnVar88;
        this.az = aunnVar89;
        this.aA = aunnVar90;
        this.aB = aunnVar91;
        this.aC = aunnVar92;
        this.aD = aunnVar93;
        this.aE = aunnVar94;
        this.aF = aunnVar95;
        this.aG = aunnVar96;
        this.aH = aunnVar97;
        this.bQ = aunnVar98;
        this.aI = aunnVar99;
        this.aJ = aunnVar100;
        this.aK = aunnVar101;
        this.aL = aunnVar102;
        this.aM = aunnVar103;
        this.bR = aunnVar104;
        this.aN = aunnVar105;
        this.bW = vxzVar4;
        this.bX = vxzVar5;
        this.aO = aunnVar106;
        this.aP = aunnVar107;
        this.aQ = aunnVar108;
        this.aR = aunnVar109;
        this.bS = aunnVar110;
        this.aS = aunnVar111;
        this.bT = aunnVar112;
        this.cp = aunnVar113;
        this.aT = aunnVar114;
        this.aU = aunnVar115;
        this.aV = aunnVar116;
        this.aW = aunnVar117;
        this.aX = aunnVar118;
        this.aY = aunnVar119;
        this.cq = aunnVar120;
        this.cr = aunnVar121;
        this.bU = tfqVar;
        this.ba = jkgVar;
        this.bb = isiVar;
        this.bc = hlpVar;
        this.bV = hklVar;
        this.bd = iweVar;
        this.be = ibeVar;
        this.bf = aunnVar122;
        this.bg = set;
        this.x = new cx() { // from class: gej
            @Override // defpackage.cx
            public final void c() {
                agrf agrfVar = get.a;
                musicActivity.invalidateOptionsMenu();
            }

            @Override // defpackage.cx
            public final /* synthetic */ void a() {
            }

            @Override // defpackage.cx
            public final /* synthetic */ void e() {
            }

            @Override // defpackage.cx
            public final /* synthetic */ void hz() {
            }

            @Override // defpackage.cx
            public final /* synthetic */ void b(cc ccVar, boolean z) {
            }
        };
        musicActivity.getBaseContext();
        if (((aeda) aunnVar15.io()).e()) {
            musicActivity.getTheme().applyStyle(R.style.CairoRedThemeUpdates, true);
        }
    }

    private final void G(hww hwwVar) {
        int iH;
        int iH2;
        if (this.g == null || (iH = H(this.o)) == (iH2 = H(hwwVar))) {
            return;
        }
        hwc hwcVar = this.g.z;
        if (iH == 3) {
            ibe ibeVar = this.be;
            hwcVar.removeView(ibeVar);
            hwcVar.E.g(false);
            this.g.z.removeView(ibeVar);
        } else if (iH == 2) {
            WatchWhileLayout watchWhileLayout = this.j;
            ibe ibeVar2 = this.be;
            watchWhileLayout.aB.removeView(ibeVar2);
            if (watchWhileLayout.bU.l(118, 45823962L, false) && (ibeVar2 instanceof ibe)) {
                ibeVar2.d(null);
            }
            watchWhileLayout.G();
        }
        if (iH2 == 3) {
            hwcVar.addView(this.be);
            hwcVar.E.g(true);
            return;
        }
        if (iH2 == 2) {
            WatchWhileLayout watchWhileLayout2 = this.j;
            ibe ibeVar3 = this.be;
            int i = bac.a;
            ibeVar3.setImportantForAccessibility(4);
            watchWhileLayout2.aB.addView(ibeVar3);
            kro.F(ibeVar3, -1, -1);
            if (ibeVar3 instanceof ibe) {
                ibeVar3.d(watchWhileLayout2.ai);
            }
            watchWhileLayout2.G();
        }
    }

    private static int H(hww hwwVar) {
        int iOrdinal = hwwVar.ordinal();
        if (iOrdinal != 1) {
            return iOrdinal == 7 ? 3 : 1;
        }
        return 2;
    }

    @Override // defpackage.gey
    public final boolean A() {
        return this.h;
    }

    @Override // defpackage.gey
    public final boolean B() {
        return this.bh.isFinishing();
    }

    public final boolean C(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        Uri uri = this.cf;
        if (uri != null && uri.equals(data)) {
            this.cf = null;
            return false;
        }
        a().B();
        ((abi) this.ch.io()).b(data, intent.getStringExtra("referring_app_name"), intent.getStringExtra("referrer"), new gml((Object) this, data, 1));
        return true;
    }

    @Override // defpackage.gey
    public final /* bridge */ /* synthetic */ WatchWhileLayout D() {
        f();
        return this.j;
    }

    @Override // defpackage.afgr
    public final void F(ahud ahudVar) {
        this.cD = ahudVar;
        Optional optionalJ = ((hed) this.cq.io()).J(ahudVar.X());
        optionalJ.isPresent();
        ((aesp) optionalJ.get()).h();
        this.cB.k(12, 2, 2);
        this.cA.a(ahudVar.X());
        if (this.bZ.l(4, 45645916L, false)) {
            this.cb = ((ger) aguu.aw(this.bh, ger.class, ahudVar.X())).b();
        }
        vmy vmyVar = (vmy) this.bx.io();
        zwa zwaVarHw = ((ger) aguu.aw(this.bh, ger.class, ahudVar.X())).a().hw();
        zwa zwaVar = vmyVar.e;
        if (zwaVar == null || !zwaVar.i().equals(zwaVarHw.i())) {
            vmyVar.a();
            vmyVar.e = zwaVarHw;
            vmyVar.d.e(vmyVar.a.e(zwaVarHw).b(amld.class).O(vmyVar.c).ag(new jbq(vmyVar, zwaVarHw, 3), new jop(8)));
        }
        affd affdVarX = ahudVar.X();
        aenx aenxVar = new aenx();
        auom.f(aenxVar);
        afpu.d(aenxVar, affdVarX.a);
        av avVar = new av(this.f);
        avVar.g(0, aenxVar, "root_fragment", 1);
        avVar.e();
    }

    public final xgn a() {
        if (this.o.e()) {
            return (xgn) this.R.io();
        }
        bpp bppVarB = ((jki) this.af.io()).b();
        return bppVarB instanceof xgm ? ((xgm) bppVarB).hB() : (xgn) this.ci.io();
    }

    /* JADX WARN: Code duplicated, block: B:75:0x01c7  */
    /* JADX WARN: Type inference failed for: r3v2, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [aunn, java.lang.Object] */
    public final ListenableFuture b(Intent intent) {
        ajwo ajwoVar;
        gft gftVar;
        String stringExtra;
        int i = 1;
        if (!((zwb) this.P.io()).u()) {
            if (intent.getData() != null) {
                this.C = true;
            }
            if (!TextUtils.equals(intent.getAction(), "com.google.android.youtube.music.action.BLUETOOTH")) {
                this.p = true;
                return new aher(gft.a);
            }
            ((kyr) this.bI.io()).C();
            this.p = true;
            return new aher(gft.i);
        }
        Bundle bundleExtra = intent.getBundleExtra("intent_extra_command_bundle");
        if (bundleExtra != null) {
            try {
                ajwoVar = (ajwo) ahng.aA(bundleExtra, "command_bundle_key", ajwo.a, ExtensionRegistryLite.getGeneratedRegistry());
            } catch (aiik unused) {
                ajwoVar = null;
            }
        } else {
            ajwoVar = null;
        }
        if (ajwoVar != null) {
            ((vxe) this.bM.io()).c(ajwoVar, null);
            gftVar = gft.h;
        } else {
            if ("com.google.android.youtube.music.action.shortcut".equals(intent.getAction())) {
                int iBt = a.bt(intent.getIntExtra("com.google.android.youtube.music.action.shortcut_type", 0));
                String stringExtra2 = intent.getStringExtra("com.google.android.youtube.music.action.shortcut");
                if (iBt != 0 && iBt != 1 && stringExtra2 != null) {
                    MusicActivity musicActivity = this.bh;
                    gqs gqsVar = (gqs) this.cl.io();
                    return taf.a(musicActivity, gqsVar.c == null ? new aher(Optional.empty()) : iBt == 5 ? ahno.ar(gqsVar.d.h(), new gqa(gqsVar, stringExtra2, 3), gqsVar.f) : new aher(gqsVar.d(stringExtra2)), new gvw(this, iBt, i));
                }
                gftVar = gft.a;
            } else if ("android.intent.action.SEARCH".equals(intent.getAction())) {
                String stringExtra3 = intent.getStringExtra("query");
                if (!TextUtils.isEmpty(stringExtra3)) {
                    u(fhz.U(stringExtra3));
                }
                gftVar = gft.d;
            } else if ("android.media.action.MEDIA_PLAY_FROM_SEARCH".equals(intent.getAction())) {
                StringBuilder sb = new StringBuilder();
                String stringExtra4 = intent.getStringExtra("android.intent.extra.artist");
                if (!TextUtils.isEmpty(stringExtra4)) {
                    sb.append(stringExtra4);
                    sb.append(' ');
                }
                String[] strArr = {"android.intent.extra.title", "android.intent.extra.album", "android.intent.extra.genre", "android.intent.extra.playlist", "android.intent.extra.radio_channel"};
                for (int i2 = 0; i2 < 5; i2++) {
                    String stringExtra5 = intent.getStringExtra(strArr[i2]);
                    if (!TextUtils.isEmpty(stringExtra5)) {
                        sb.append(stringExtra5);
                        break;
                    }
                }
                if (TextUtils.isEmpty(sb)) {
                    stringExtra = intent.getStringExtra("query");
                    if (TextUtils.isEmpty(stringExtra)) {
                        stringExtra = "";
                    }
                } else {
                    stringExtra = sb.toString();
                }
                if (!TextUtils.isEmpty(stringExtra)) {
                    u(fhz.U(stringExtra));
                }
                gftVar = gft.d;
            } else if ("com.google.android.youtube.music.action.unlimited".equals(intent.getAction())) {
                ajwo ajwoVarF = ((xgn) this.ci.io()).f(((axfd) this.I.io()).ao());
                if (ajwoVarF != null) {
                    ((gfp) this.bR.io()).d(ajwoVarF);
                    gftVar = gft.e;
                } else {
                    gftVar = gft.a;
                }
            } else if (intent.getBooleanExtra("Waze.fromWaze", false)) {
                if (((jnm) this.H.io()).C()) {
                    gftVar = gft.f;
                } else {
                    intent.setData(Uri.parse("https://www.youtube.com/attribution_link?c=ptrshp-ytm-acq-ext-pd-app-wz19and&u=https%3A%2F%2Fmusic.youtube.com%2Fmusicpremium"));
                    if (C(intent)) {
                        gftVar = gft.f;
                    } else {
                        gftVar = gft.a;
                    }
                }
            } else if (intent.getBooleanExtra("com.google.android.apps.youtube.music.mediabrowser.consent.CONSENT_DIALOG_INTENT_ACTION", false)) {
                ahud ahudVar = this.cD;
                if (ahudVar == null) {
                    gftVar = gft.a;
                } else {
                    MusicActivity musicActivity2 = this.bh;
                    xsc xscVarC = ((ger) aguu.aw(musicActivity2, ger.class, ahudVar.X())).c();
                    if (((vxz) xscVarC.a.io()).l(5, 45671827L, false)) {
                        Intent intent2 = musicActivity2.getIntent();
                        if (intent2.hasExtra("com.google.android.apps.youtube.music.mediabrowser.consent.CONSENT_DIALOG_INTENT_ACTION") && intent2.getBooleanExtra("com.google.android.apps.youtube.music.mediabrowser.consent.CONSENT_DIALOG_INTENT_ACTION", false) && !TextUtils.isEmpty(intent2.getStringExtra("referrer"))) {
                            String stringExtra6 = intent2.getStringExtra("media_client_name");
                            if (!TextUtils.isEmpty(stringExtra6)) {
                                int i3 = zne.c;
                                if (((hfx) xscVarC.c.io()).h(zik.aA(stringExtra6))) {
                                    dd supportFragmentManager = musicActivity2.getSupportFragmentManager();
                                    if (((hhh) supportFragmentManager.g("CONSENT_DIALOG_FRAGMENT_TAG")) == null) {
                                        Object obj = xscVarC.b;
                                        hhh hhhVar = new hhh();
                                        auom.f(hhhVar);
                                        afpu.d(hhhVar, ((affd) obj).a);
                                        hhhVar.h(supportFragmentManager, "CONSENT_DIALOG_FRAGMENT_TAG");
                                    }
                                }
                            }
                        }
                    }
                    gftVar = gft.a;
                }
            } else if (TextUtils.equals(intent.getAction(), "com.google.android.youtube.music.action.BLUETOOTH")) {
                ((kyr) this.bI.io()).C();
                gftVar = gft.i;
            } else {
                ajwo ajwoVarBc = zik.bc(intent);
                if (ajwoVarBc != null) {
                    aunn aunnVar = this.bM;
                    ((vxe) aunnVar.io()).c(ajwoVarBc, null);
                    ajwo ajwoVarA = aabq.a(intent);
                    if (ajwoVarA != null) {
                        ((vxe) aunnVar.io()).c(ajwoVarA, null);
                    }
                    yno.X(this.bh, a(), intent);
                    gftVar = gft.b;
                } else {
                    gftVar = C(intent) ? gft.f : gft.a;
                }
            }
        }
        this.p = true;
        return new aher(gftVar);
    }

    public final void c() {
        while (this.f.ae(null, -1, 0)) {
        }
        gni gniVar = (gni) this.F.io();
        dd ddVar = gniVar.c;
        av avVar = new av(ddVar);
        HashMap map = gniVar.f;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            gnf gnfVar = (gnf) ddVar.g(str);
            if (gnfVar == null) {
                WeakReference weakReference = (WeakReference) map.get(str);
                gnfVar = weakReference != null ? (gnf) weakReference.get() : null;
            }
            if (gnfVar != null) {
                avVar.l(gnfVar);
                it.remove();
            } else {
                WeakReference weakReference2 = (WeakReference) map.get(str);
                if (weakReference2 != null && weakReference2.get() == null) {
                    it.remove();
                }
            }
        }
        avVar.e();
    }

    public final void d() {
        ((agrc) ((agrc) a.c()).k("com/google/android/apps/youtube/music/activities/MusicActivityPeer", "destroyQueuePlayback", 2414, "MusicActivityPeer.java")).t("destroyQueuePlayback");
        ((abjp) this.cp.io()).r();
        ((abvk) this.bS.io()).r();
        WatchFragment watchFragment = this.g;
        if (watchFragment != null) {
            watchFragment.Z = null;
        }
    }

    final void e() {
        this.bV.j();
        afwv afwvVar = this.ca;
        cc ccVarF = afwvVar.f();
        if (ccVarF != null) {
            av avVar = new av((dd) afwvVar.c);
            avVar.s(0, android.R.animator.fade_out, 0);
            avVar.l(ccVarF);
            avVar.a(true, true);
            afwvVar.b = null;
        }
        ((View) afwvVar.a).setVisibility(8);
        this.i = false;
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v18, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v17, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v22, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v101, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v103, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v111, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v113, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v115, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v117, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v119, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v121, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v123, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v128, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v130, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v132, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v134, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v139, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v141, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v143, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v151, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v26, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v30, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v47, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v49, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v51, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v53, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v58, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v60, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v62, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v64, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v66, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v74, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v85, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v92, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v94, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v99, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r74v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12, types: [aunn, java.lang.Object] */
    public final void f() {
        SlimStatusBar slimStatusBar;
        WatchWhileLayout watchWhileLayout = this.j;
        if (watchWhileLayout == null || this.g != null) {
            return;
        }
        ViewStub viewStub = (ViewStub) watchWhileLayout.findViewById(R.id.player_page_stub);
        if (viewStub != null) {
            viewStub.setLayoutInflater(this.bh.getLayoutInflater());
            viewStub.inflate();
            this.j.E();
        }
        if (this.g != null || this.f.f(R.id.watch_fragment) == null) {
            return;
        }
        WatchFragment watchFragment = (WatchFragment) this.f.f(R.id.watch_fragment);
        watchFragment.getClass();
        this.g = watchFragment;
        ((igw) this.bB.io()).m = this.h;
        tqj tqjVar = this.bi;
        int i = tqr.a;
        if (!tqjVar.k(1073830336)) {
            ((abea) this.ac.io()).f();
        }
        aunn aunnVar = this.ax;
        icq icqVar = (icq) aunnVar.io();
        abvn abvnVar = (abvn) this.X.io();
        int i2 = 1;
        int i3 = 11;
        boolean z = false;
        icqVar.c.e(((avlh) abvnVar.r().a).i(new abwr(i2)).al(new hxi(icqVar, 16), new hyx(i3)), abvnVar.P().i(new abwr(i2)).al(new hxi(icqVar, 17), new hyx(i3)));
        icqVar.a.e(icqVar);
        if (this.cz.m(230, 45646891L)) {
            ((abfp) this.bw.io()).onStart(this.bh);
            if (!((jnm) this.H.io()).C()) {
                ((kjs) this.aC.io()).f(this.w);
            }
        }
        aunn aunnVar2 = this.aC;
        ((kjs) aunnVar2.io()).f((jlf) aunnVar.io());
        ((kjs) aunnVar2.io()).f((jlf) this.aF.io());
        ((kjs) aunnVar2.io()).f((jlf) this.aG.io());
        MusicActivity musicActivity = this.bh;
        this.cg = (ViewGroup) musicActivity.findViewById(R.id.slim_bar_container);
        jhl jhlVar = (jhl) this.bC.io();
        ViewGroup viewGroup = this.cg;
        viewGroup.getClass();
        jhlVar.d = viewGroup;
        aeog aeogVar = jhlVar.a;
        if (aeogVar.g != null || aeogVar.h != null) {
            aeogVar.i = null;
            aeogVar.j = null;
        }
        aeogVar.g = viewGroup;
        aeogVar.h = viewGroup;
        SlimStatusBar slimStatusBarD = aeogVar.d(false);
        SlimStatusBar slimStatusBarD2 = aeogVar.d(true);
        final aeoh aeohVar = aeogVar.e;
        boolean zH = aeogVar.t.h();
        aeohVar.h = viewGroup;
        aeohVar.k = slimStatusBarD2;
        aeohVar.j = slimStatusBarD;
        aeohVar.i = viewGroup;
        aeohVar.I = aeohVar.a(true);
        aeohVar.J = aeohVar.a(false);
        int i4 = 5;
        if (aeohVar.N.l(151, 45649805L, false)) {
            slimStatusBar = slimStatusBarD2;
        } else {
            slimStatusBarD.addOnLayoutChangeListener(new hbp(aeohVar, i4));
            slimStatusBar = slimStatusBarD2;
            slimStatusBar.addOnLayoutChangeListener(new hbp(aeohVar, i4));
        }
        if (zH) {
            aeohVar.o(0);
        } else {
            aeohVar.o(2);
        }
        SlimStatusBar slimStatusBar2 = slimStatusBar;
        final ViewGroup viewGroup2 = aeohVar.h;
        viewGroup2.getClass();
        final SlimStatusBar slimStatusBar3 = aeohVar.j;
        slimStatusBar3.getClass();
        final ViewGroup viewGroup3 = aeohVar.i;
        viewGroup3.getClass();
        final SlimStatusBar slimStatusBar4 = aeohVar.k;
        slimStatusBar4.getClass();
        final boolean z2 = false;
        final boolean z3 = false;
        final boolean z4 = false;
        final boolean z5 = false;
        final boolean z6 = false;
        aeohVar.q = new Runnable() { // from class: aeoi
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
            @Override // java.lang.Runnable
            public final void run() {
                aeoh aeohVar2 = aeohVar;
                ViewGroup viewGroup4 = viewGroup2;
                SlimStatusBar slimStatusBar5 = slimStatusBar3;
                if (!aeoh.s(viewGroup4, slimStatusBar5)) {
                    if (slimStatusBar5.getParent() != null) {
                        viewGroup4.endViewTransition(slimStatusBar5);
                    }
                    aeohVar2.p(viewGroup4, slimStatusBar5);
                    viewGroup4.addView(slimStatusBar5);
                    slimStatusBar5.post(new aead(viewGroup4, slimStatusBar5, 15));
                }
                if (!z4) {
                    aeohVar2.o(2);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                    aeohVar2.h(37929);
                } else if (z5) {
                    aeohVar2.o(5);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                } else if (z6) {
                    aeohVar2.o(6);
                } else if (z2) {
                    aeohVar2.o(7);
                } else if (z3) {
                    aeohVar2.o(8);
                } else {
                    aeohVar2.o(4);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                    aeohVar2.h(37930);
                }
                if (!aeohVar2.q() || aeohVar2.N.l(151, 45649805L, false)) {
                    return;
                }
                aeohVar2.P.f(slimStatusBar5.getMeasuredHeight());
            }
        };
        final boolean z7 = true;
        aeohVar.p = new Runnable() { // from class: aeoi
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
            @Override // java.lang.Runnable
            public final void run() {
                aeoh aeohVar2 = aeohVar;
                ViewGroup viewGroup4 = viewGroup2;
                SlimStatusBar slimStatusBar5 = slimStatusBar3;
                if (!aeoh.s(viewGroup4, slimStatusBar5)) {
                    if (slimStatusBar5.getParent() != null) {
                        viewGroup4.endViewTransition(slimStatusBar5);
                    }
                    aeohVar2.p(viewGroup4, slimStatusBar5);
                    viewGroup4.addView(slimStatusBar5);
                    slimStatusBar5.post(new aead(viewGroup4, slimStatusBar5, 15));
                }
                if (!z7) {
                    aeohVar2.o(2);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                    aeohVar2.h(37929);
                } else if (z5) {
                    aeohVar2.o(5);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                } else if (z6) {
                    aeohVar2.o(6);
                } else if (z2) {
                    aeohVar2.o(7);
                } else if (z3) {
                    aeohVar2.o(8);
                } else {
                    aeohVar2.o(4);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                    aeohVar2.h(37930);
                }
                if (!aeohVar2.q() || aeohVar2.N.l(151, 45649805L, false)) {
                    return;
                }
                aeohVar2.P.f(slimStatusBar5.getMeasuredHeight());
            }
        };
        aeohVar.r = new dzn(aeohVar, viewGroup2, slimStatusBar3, 14);
        int i5 = 7;
        aeohVar.s = new frz(aeohVar, z, i5);
        final boolean z8 = false;
        aeohVar.u = new Runnable() { // from class: aeoi
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
            @Override // java.lang.Runnable
            public final void run() {
                aeoh aeohVar2 = aeohVar;
                ViewGroup viewGroup4 = viewGroup3;
                SlimStatusBar slimStatusBar5 = slimStatusBar4;
                if (!aeoh.s(viewGroup4, slimStatusBar5)) {
                    if (slimStatusBar5.getParent() != null) {
                        viewGroup4.endViewTransition(slimStatusBar5);
                    }
                    aeohVar2.p(viewGroup4, slimStatusBar5);
                    viewGroup4.addView(slimStatusBar5);
                    slimStatusBar5.post(new aead(viewGroup4, slimStatusBar5, 15));
                }
                if (!z8) {
                    aeohVar2.o(2);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                    aeohVar2.h(37929);
                } else if (z5) {
                    aeohVar2.o(5);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                } else if (z6) {
                    aeohVar2.o(6);
                } else if (z2) {
                    aeohVar2.o(7);
                } else if (z3) {
                    aeohVar2.o(8);
                } else {
                    aeohVar2.o(4);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                    aeohVar2.h(37930);
                }
                if (!aeohVar2.q() || aeohVar2.N.l(151, 45649805L, false)) {
                    return;
                }
                aeohVar2.P.f(slimStatusBar5.getMeasuredHeight());
            }
        };
        final boolean z9 = true;
        aeohVar.t = new Runnable() { // from class: aeoi
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
            @Override // java.lang.Runnable
            public final void run() {
                aeoh aeohVar2 = aeohVar;
                ViewGroup viewGroup4 = viewGroup3;
                SlimStatusBar slimStatusBar5 = slimStatusBar4;
                if (!aeoh.s(viewGroup4, slimStatusBar5)) {
                    if (slimStatusBar5.getParent() != null) {
                        viewGroup4.endViewTransition(slimStatusBar5);
                    }
                    aeohVar2.p(viewGroup4, slimStatusBar5);
                    viewGroup4.addView(slimStatusBar5);
                    slimStatusBar5.post(new aead(viewGroup4, slimStatusBar5, 15));
                }
                if (!z9) {
                    aeohVar2.o(2);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                    aeohVar2.h(37929);
                } else if (z5) {
                    aeohVar2.o(5);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                } else if (z6) {
                    aeohVar2.o(6);
                } else if (z2) {
                    aeohVar2.o(7);
                } else if (z3) {
                    aeohVar2.o(8);
                } else {
                    aeohVar2.o(4);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                    aeohVar2.h(37930);
                }
                if (!aeohVar2.q() || aeohVar2.N.l(151, 45649805L, false)) {
                    return;
                }
                aeohVar2.P.f(slimStatusBar5.getMeasuredHeight());
            }
        };
        aeohVar.v = new dzn(aeohVar, viewGroup3, slimStatusBar4, 14);
        aeohVar.w = new frz((Object) aeohVar, true, i5);
        final boolean z10 = true;
        aeohVar.x = new Runnable() { // from class: aeoi
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
            @Override // java.lang.Runnable
            public final void run() {
                aeoh aeohVar2 = aeohVar;
                ViewGroup viewGroup4 = viewGroup2;
                SlimStatusBar slimStatusBar5 = slimStatusBar3;
                if (!aeoh.s(viewGroup4, slimStatusBar5)) {
                    if (slimStatusBar5.getParent() != null) {
                        viewGroup4.endViewTransition(slimStatusBar5);
                    }
                    aeohVar2.p(viewGroup4, slimStatusBar5);
                    viewGroup4.addView(slimStatusBar5);
                    slimStatusBar5.post(new aead(viewGroup4, slimStatusBar5, 15));
                }
                if (!z9) {
                    aeohVar2.o(2);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                    aeohVar2.h(37929);
                } else if (z10) {
                    aeohVar2.o(5);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                } else if (z6) {
                    aeohVar2.o(6);
                } else if (z2) {
                    aeohVar2.o(7);
                } else if (z3) {
                    aeohVar2.o(8);
                } else {
                    aeohVar2.o(4);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                    aeohVar2.h(37930);
                }
                if (!aeohVar2.q() || aeohVar2.N.l(151, 45649805L, false)) {
                    return;
                }
                aeohVar2.P.f(slimStatusBar5.getMeasuredHeight());
            }
        };
        aeohVar.y = new Runnable() { // from class: aeoi
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
            @Override // java.lang.Runnable
            public final void run() {
                aeoh aeohVar2 = aeohVar;
                ViewGroup viewGroup4 = viewGroup3;
                SlimStatusBar slimStatusBar5 = slimStatusBar4;
                if (!aeoh.s(viewGroup4, slimStatusBar5)) {
                    if (slimStatusBar5.getParent() != null) {
                        viewGroup4.endViewTransition(slimStatusBar5);
                    }
                    aeohVar2.p(viewGroup4, slimStatusBar5);
                    viewGroup4.addView(slimStatusBar5);
                    slimStatusBar5.post(new aead(viewGroup4, slimStatusBar5, 15));
                }
                if (!z9) {
                    aeohVar2.o(2);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                    aeohVar2.h(37929);
                } else if (z10) {
                    aeohVar2.o(5);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                } else if (z6) {
                    aeohVar2.o(6);
                } else if (z2) {
                    aeohVar2.o(7);
                } else if (z3) {
                    aeohVar2.o(8);
                } else {
                    aeohVar2.o(4);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                    aeohVar2.h(37930);
                }
                if (!aeohVar2.q() || aeohVar2.N.l(151, 45649805L, false)) {
                    return;
                }
                aeohVar2.P.f(slimStatusBar5.getMeasuredHeight());
            }
        };
        int i6 = 5;
        aeohVar.z = new frz((Object) aeohVar, false, i6);
        aeohVar.A = new frz((Object) aeohVar, true, i6);
        final boolean z11 = true;
        final boolean z12 = false;
        aeohVar.C = new Runnable() { // from class: aeoi
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
            @Override // java.lang.Runnable
            public final void run() {
                aeoh aeohVar2 = aeohVar;
                ViewGroup viewGroup4 = viewGroup2;
                SlimStatusBar slimStatusBar5 = slimStatusBar3;
                if (!aeoh.s(viewGroup4, slimStatusBar5)) {
                    if (slimStatusBar5.getParent() != null) {
                        viewGroup4.endViewTransition(slimStatusBar5);
                    }
                    aeohVar2.p(viewGroup4, slimStatusBar5);
                    viewGroup4.addView(slimStatusBar5);
                    slimStatusBar5.post(new aead(viewGroup4, slimStatusBar5, 15));
                }
                if (!z9) {
                    aeohVar2.o(2);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                    aeohVar2.h(37929);
                } else if (z12) {
                    aeohVar2.o(5);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                } else if (z6) {
                    aeohVar2.o(6);
                } else if (z11) {
                    aeohVar2.o(7);
                } else if (z3) {
                    aeohVar2.o(8);
                } else {
                    aeohVar2.o(4);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                    aeohVar2.h(37930);
                }
                if (!aeohVar2.q() || aeohVar2.N.l(151, 45649805L, false)) {
                    return;
                }
                aeohVar2.P.f(slimStatusBar5.getMeasuredHeight());
            }
        };
        aeohVar.D = new Runnable() { // from class: aeoi
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
            @Override // java.lang.Runnable
            public final void run() {
                aeoh aeohVar2 = aeohVar;
                ViewGroup viewGroup4 = viewGroup3;
                SlimStatusBar slimStatusBar5 = slimStatusBar4;
                if (!aeoh.s(viewGroup4, slimStatusBar5)) {
                    if (slimStatusBar5.getParent() != null) {
                        viewGroup4.endViewTransition(slimStatusBar5);
                    }
                    aeohVar2.p(viewGroup4, slimStatusBar5);
                    viewGroup4.addView(slimStatusBar5);
                    slimStatusBar5.post(new aead(viewGroup4, slimStatusBar5, 15));
                }
                if (!z9) {
                    aeohVar2.o(2);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                    aeohVar2.h(37929);
                } else if (z12) {
                    aeohVar2.o(5);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                } else if (z6) {
                    aeohVar2.o(6);
                } else if (z11) {
                    aeohVar2.o(7);
                } else if (z3) {
                    aeohVar2.o(8);
                } else {
                    aeohVar2.o(4);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                    aeohVar2.h(37930);
                }
                if (!aeohVar2.q() || aeohVar2.N.l(151, 45649805L, false)) {
                    return;
                }
                aeohVar2.P.f(slimStatusBar5.getMeasuredHeight());
            }
        };
        int i7 = 6;
        aeohVar.E = new frz((Object) aeohVar, false, i7);
        aeohVar.F = new frz((Object) aeohVar, true, i7);
        final boolean z13 = false;
        final boolean z14 = true;
        aeohVar.B = new Runnable() { // from class: aeoi
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
            @Override // java.lang.Runnable
            public final void run() {
                aeoh aeohVar2 = aeohVar;
                ViewGroup viewGroup4 = viewGroup2;
                SlimStatusBar slimStatusBar5 = slimStatusBar3;
                if (!aeoh.s(viewGroup4, slimStatusBar5)) {
                    if (slimStatusBar5.getParent() != null) {
                        viewGroup4.endViewTransition(slimStatusBar5);
                    }
                    aeohVar2.p(viewGroup4, slimStatusBar5);
                    viewGroup4.addView(slimStatusBar5);
                    slimStatusBar5.post(new aead(viewGroup4, slimStatusBar5, 15));
                }
                if (!z9) {
                    aeohVar2.o(2);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                    aeohVar2.h(37929);
                } else if (z12) {
                    aeohVar2.o(5);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                } else if (z14) {
                    aeohVar2.o(6);
                } else if (z13) {
                    aeohVar2.o(7);
                } else if (z3) {
                    aeohVar2.o(8);
                } else {
                    aeohVar2.o(4);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                    aeohVar2.h(37930);
                }
                if (!aeohVar2.q() || aeohVar2.N.l(151, 45649805L, false)) {
                    return;
                }
                aeohVar2.P.f(slimStatusBar5.getMeasuredHeight());
            }
        };
        final boolean z15 = true;
        final boolean z16 = false;
        aeohVar.G = new Runnable() { // from class: aeoi
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
            @Override // java.lang.Runnable
            public final void run() {
                aeoh aeohVar2 = aeohVar;
                ViewGroup viewGroup4 = viewGroup2;
                SlimStatusBar slimStatusBar5 = slimStatusBar3;
                if (!aeoh.s(viewGroup4, slimStatusBar5)) {
                    if (slimStatusBar5.getParent() != null) {
                        viewGroup4.endViewTransition(slimStatusBar5);
                    }
                    aeohVar2.p(viewGroup4, slimStatusBar5);
                    viewGroup4.addView(slimStatusBar5);
                    slimStatusBar5.post(new aead(viewGroup4, slimStatusBar5, 15));
                }
                if (!z9) {
                    aeohVar2.o(2);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                    aeohVar2.h(37929);
                } else if (z12) {
                    aeohVar2.o(5);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                } else if (z16) {
                    aeohVar2.o(6);
                } else if (z13) {
                    aeohVar2.o(7);
                } else if (z15) {
                    aeohVar2.o(8);
                } else {
                    aeohVar2.o(4);
                    slimStatusBar5.setAccessibilityLiveRegion(2);
                    aeohVar2.h(37930);
                }
                if (!aeohVar2.q() || aeohVar2.N.l(151, 45649805L, false)) {
                    return;
                }
                aeohVar2.P.f(slimStatusBar5.getMeasuredHeight());
            }
        };
        int i8 = 4;
        aeohVar.H = new acem(aeohVar, i8);
        aeogVar.i = slimStatusBarD;
        aeogVar.j = slimStatusBar2;
        aeogVar.c.e(aeogVar);
        aeogVar.p.isPresent();
        vwt vwtVar = aeogVar.v;
        vwtVar.D(new rru(aeogVar, 13));
        aeogVar.l.f(aeogVar);
        if (aeogVar.u.l(430, 45846622L, false)) {
            vwtVar.G(new isg(aeogVar, 10));
        }
        vwt vwtVar2 = jhlVar.e;
        byte[] bArr = null;
        vwtVar2.D(new fzs(jhlVar, viewGroup, i8, bArr));
        vwtVar2.D(new fzs(jhlVar, viewGroup, 5, bArr));
        vwtVar2.D(new fzs(jhlVar, viewGroup, i7, bArr));
        if (this.g != null) {
            jpa jpaVar = (jpa) this.cm.io();
            WatchWhileLayout watchWhileLayout2 = this.j;
            watchWhileLayout2.getClass();
            vxz vxzVar = (vxz) jpaVar.a.io();
            vxzVar.getClass();
            cf cfVar = (cf) jpaVar.b.io();
            cfVar.getClass();
            ?? Io = jpaVar.c.io();
            Io.getClass();
            avmb avmbVar = (avmb) jpaVar.d.io();
            avmbVar.getClass();
            ?? Io2 = jpaVar.e.io();
            Io2.getClass();
            ?? Io3 = jpaVar.f.io();
            Io3.getClass();
            ?? Io4 = jpaVar.g.io();
            Io4.getClass();
            ?? Io5 = jpaVar.h.io();
            Io5.getClass();
            ?? Io6 = jpaVar.i.io();
            Io6.getClass();
            ?? Io7 = jpaVar.j.io();
            Io7.getClass();
            ?? Io8 = jpaVar.k.io();
            Io8.getClass();
            ?? Io9 = jpaVar.l.io();
            Io9.getClass();
            ?? Io10 = jpaVar.m.io();
            Io10.getClass();
            ?? Io11 = jpaVar.n.io();
            Io11.getClass();
            ?? Io12 = jpaVar.o.io();
            Io12.getClass();
            ?? Io13 = jpaVar.p.io();
            Io13.getClass();
            ?? Io14 = jpaVar.q.io();
            Io14.getClass();
            ?? Io15 = jpaVar.r.io();
            Io15.getClass();
            jqp jqpVar = (jqp) jpaVar.s.io();
            jom jomVar = (jom) jpaVar.t.io();
            xgg xggVar = (xgg) jpaVar.u.io();
            isi isiVar = (isi) jpaVar.v.io();
            xrn xrnVar = (xrn) jpaVar.w.io();
            xrnVar.getClass();
            ?? Io16 = jpaVar.x.io();
            Io16.getClass();
            ?? Io17 = jpaVar.y.io();
            Io17.getClass();
            ?? Io18 = jpaVar.z.io();
            Io18.getClass();
            ?? Io19 = jpaVar.A.io();
            Io19.getClass();
            zpw zpwVar = (zpw) jpaVar.B.io();
            ?? Io20 = jpaVar.C.io();
            Io20.getClass();
            ?? Io21 = jpaVar.D.io();
            Io21.getClass();
            ?? Io22 = jpaVar.E.io();
            Io22.getClass();
            ?? Io23 = jpaVar.F.io();
            Io23.getClass();
            ?? Io24 = jpaVar.G.io();
            Io24.getClass();
            xrx xrxVar = (xrx) jpaVar.H.io();
            xrxVar.getClass();
            jny jnyVar = (jny) jpaVar.I.io();
            jnyVar.getClass();
            ?? Io25 = jpaVar.J.io();
            Io25.getClass();
            Integer num = (Integer) jpaVar.K.io();
            num.getClass();
            awmd awmdVar = jpaVar.L;
            int iIntValue = num.intValue();
            jij jijVar = (jij) awmdVar.io();
            jijVar.getClass();
            acdq acdqVar = (acdq) jpaVar.M.io();
            acdqVar.getClass();
            ?? Io26 = jpaVar.N.io();
            Io26.getClass();
            izt iztVar = (izt) jpaVar.O.io();
            iztVar.getClass();
            awmd awmdVar2 = jpaVar.P;
            awmd awmdVar3 = jpaVar.Q;
            ?? Io27 = jpaVar.R.io();
            Io27.getClass();
            ?? Io28 = jpaVar.S.io();
            Io28.getClass();
            aefv aefvVar = (aefv) jpaVar.T.io();
            aefvVar.getClass();
            ?? Io29 = jpaVar.U.io();
            Io29.getClass();
            ?? Io30 = jpaVar.V.io();
            Io30.getClass();
            ?? Io31 = jpaVar.W.io();
            Io31.getClass();
            jij jijVar2 = (jij) jpaVar.X.io();
            jijVar2.getClass();
            hhb hhbVar = (hhb) jpaVar.Y.io();
            hhbVar.getClass();
            ?? Io32 = jpaVar.Z.io();
            Io32.getClass();
            ?? Io33 = jpaVar.aa.io();
            Io33.getClass();
            ?? Io34 = jpaVar.ab.io();
            Io34.getClass();
            ?? Io35 = jpaVar.ac.io();
            Io35.getClass();
            ?? Io36 = jpaVar.ad.io();
            Io36.getClass();
            ?? Io37 = jpaVar.ae.io();
            Io37.getClass();
            ?? Io38 = jpaVar.af.io();
            Io38.getClass();
            ((vyo) jpaVar.ag.io()).getClass();
            ?? Io39 = jpaVar.ah.io();
            Io39.getClass();
            ?? Io40 = jpaVar.ai.io();
            Io40.getClass();
            ?? Io41 = jpaVar.aj.io();
            Io41.getClass();
            ?? Io42 = jpaVar.ak.io();
            Io42.getClass();
            Executor executor = (Executor) jpaVar.al.io();
            executor.getClass();
            ?? Io43 = jpaVar.am.io();
            Io43.getClass();
            ?? Io44 = jpaVar.an.io();
            Io44.getClass();
            ?? Io45 = jpaVar.ao.io();
            Io45.getClass();
            ((aeda) jpaVar.ap.io()).getClass();
            hfn hfnVar = (hfn) jpaVar.aq.io();
            hfnVar.getClass();
            ?? Io46 = jpaVar.ar.io();
            Io46.getClass();
            ?? Io47 = jpaVar.as.io();
            Io47.getClass();
            joz jozVar = new joz(watchWhileLayout2, vxzVar, cfVar, Io, avmbVar, Io2, Io3, Io4, Io5, Io6, Io7, Io8, Io9, Io10, Io11, Io12, Io13, Io14, Io15, jqpVar, jomVar, xggVar, isiVar, xrnVar, Io16, Io17, Io18, Io19, zpwVar, Io20, Io21, Io22, Io23, Io24, xrxVar, jnyVar, Io25, iIntValue, jijVar, acdqVar, Io26, iztVar, awmdVar2, awmdVar3, Io27, Io28, aefvVar, Io29, Io30, Io31, jijVar2, hhbVar, Io32, Io33, Io34, Io35, Io36, Io37, Io38, Io39, Io40, Io41, Io42, executor, Io43, Io44, Io45, hfnVar, Io46, Io47);
            this.r = jozVar;
            jozVar.x.h.s(this.g.z.g);
            if (tqjVar.k(1073830358) && ((boh) musicActivity.getLifecycle()).d.a(bob.d)) {
                this.g.z.T((tth) this.G.io());
                this.r.p();
            }
        }
        ((aefv) this.co.io()).h(musicActivity.findViewById(android.R.id.content));
    }

    public final /* synthetic */ void g(Intent intent, gft gftVar) {
        if (gftVar != gft.a) {
            super.m(intent);
        }
    }

    public final void h() {
        if (this.ce || ((abvk) this.bS.io()).Y() || !this.j.aa()) {
            return;
        }
        ((tth) this.G.io()).g(0);
    }

    @tcc
    public void handleBrowseRendered(hag hagVar) {
        AtomicBoolean atomicBoolean = this.v;
        atomicBoolean.get();
        atomicBoolean.set(true);
        r();
        hvh hvhVar = (hvh) this.ct.io();
        int i = 0;
        if (hvhVar.i.l(78, 45404284L, false)) {
            return;
        }
        zwa zwaVarE = hvhVar.g.e();
        if (((aanb) hvhVar.d.io()).g()) {
            ListenableFuture listenableFutureB = hvhVar.b(zwaVarE, hvh.a);
            Executor executor = hvhVar.h;
            hmb hmbVar = new hmb(3);
            hvf hvfVar = new hvf(hvhVar, i);
            Executor executor2 = taf.a;
            taa taaVar = new taa(hvfVar, null, hmbVar);
            long j = afwl.a;
            listenableFutureB.addListener(new ahei(listenableFutureB, new afwj(afty.c(false), taaVar, 0)), executor);
        }
        hvhVar.d(zwaVarE, hvh.b);
    }

    @tcc
    void handleDismissWatchEvent(gse gseVar) {
        if (this.o == hww.h) {
            q();
        }
        d();
        ((idk) this.al.io()).i();
        WatchWhileLayout watchWhileLayout = this.j;
        if (watchWhileLayout != null) {
            watchWhileLayout.z();
        }
    }

    @tcc
    void handleHideEnclosingEvent(vvt vvtVar) {
        if (this.i) {
            e();
        }
    }

    @tcc
    void handlePlaybackSessionChangedEvent(aaxk aaxkVar) {
        if (aaxkVar.a) {
            fg.r(this.bh, (fg) ((fg) this.cn.io()).a);
        }
    }

    @tcc
    public void handleSearchRendered(hap hapVar) {
        r();
    }

    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        boolean z = this.i;
        aunn aunnVar = this.cw;
        if (z) {
            ((aack) aunnVar.io()).a = true;
        } else {
            ((aack) aunnVar.io()).a();
        }
        this.K.execute(afwl.i(new dxk(this, 12)));
        s();
        this.cc.n();
    }

    @tcc
    public void handleSignInFlow(rqg rqgVar) {
        if (this.i || rqgVar.a != rqf.b) {
            return;
        }
        aunn aunnVar = this.bS;
        if (((abvk) aunnVar.io()).X()) {
            ((abvk) aunnVar.io()).aq(false, 23);
        }
        this.j.z();
        c();
        x(true, true);
        ajwo ajwoVar = rqgVar.b;
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                ((gfp) this.bR.io()).d(ajwoVar);
            }
        }
        aihf aihfVarCreateBuilder = antn.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        antn antnVar = (antn) aihfVarCreateBuilder.instance;
        antnVar.c = 3;
        antnVar.b |= 1;
        aunn aunnVar2 = this.at;
        if (((xeu) aunnVar2.io()).b) {
            xff xffVarA = ((xeu) aunnVar2.io()).a(aihfVarCreateBuilder, alot.MUSIC_PERSISTENT_CACHE_CLEARED);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
        } else {
            alos alosVar = (alos) alou.a.createBuilder();
            alosVar.copyOnWrite();
            alou alouVar = (alou) alosVar.instance;
            antn antnVar2 = (antn) aihfVarCreateBuilder.build();
            antnVar2.getClass();
            alouVar.d = antnVar2;
            alouVar.c = 155;
            ((xeu) aunnVar2.io()).b((alou) alosVar.build());
        }
        ScheduledExecutorService scheduledExecutorService = this.K;
        inu inuVar = (inu) this.ck.io();
        inuVar.getClass();
        scheduledExecutorService.execute(afwl.i(new dxk(inuVar, 14)));
    }

    @tcc
    void handleVideoControlsVisibilityEvent(aazi aaziVar) {
        G(this.o);
        boolean z = aaziVar.a;
        this.ce = z;
        if (z) {
            return;
        }
        h();
    }

    public final void i(Menu menu, int i, arqz arqzVar) {
        MenuItem menuItemFindItem = menu.findItem(i);
        if (menuItemFindItem != null) {
            menuItemFindItem.setIcon(((adxj) this.cr.io()).b(arqzVar));
        }
    }

    @Override // defpackage.gey
    public final void j(boolean z) {
        if (this.bh.isDestroyed()) {
            return;
        }
        if (this.j.aa()) {
            q();
            this.j.N();
        } else if (((hfn) this.aE.io()).x().e()) {
            WatchWhileLayout watchWhileLayout = this.j;
            if (z) {
                watchWhileLayout.D();
            } else {
                watchWhileLayout.N();
            }
        }
    }

    public final void l() {
        q();
        MusicActivity musicActivity = this.bh;
        if (Settings.System.getInt(musicActivity.getApplicationContext().getContentResolver(), "accelerometer_rotation", 0) == 1 && yno.H(musicActivity) && !hfn.F(musicActivity)) {
            this.j.D();
        } else {
            this.j.L(false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, pal] */
    @Override // defpackage.geu
    public final void m(Intent intent) {
        this.p = false;
        this.C = false;
        ?? r0 = ((elr) this.cv.io()).a;
        MusicActivity musicActivity = this.bh;
        r0.a(musicActivity, intent);
        if (jku.d(musicActivity) && this.ba.a()) {
            int i = 1;
            taf.k(musicActivity, b(intent), new gnx(i), new hcq(this, intent, i, null));
        } else {
            musicActivity.setIntent(intent);
            super.m(intent);
        }
    }

    @Override // defpackage.afgr
    public final void n(affx affxVar) {
        this.cC.m("MusicActivity", affxVar, this.cs, 12);
    }

    public final void o() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        TabLayout tabLayout;
        int iJ = ((hfn) this.aL.io()).J();
        hkl hklVar = this.bV;
        int iIntValue = 0;
        int height = (hklVar.m() && (tabLayout = hklVar.g) != null && tabLayout.getTranslationY() == 0.0f) ? hklVar.g.getHeight() : 0;
        WatchWhileLayout watchWhileLayout = this.j;
        int measuredHeight = (watchWhileLayout.bE != hww.b || watchWhileLayout.ab()) ? 0 : watchWhileLayout.ai.getMeasuredHeight() + (watchWhileLayout.bU.l(118, 45823962L, false) ? watchWhileLayout.aU : 0);
        if (height > 0) {
            iJ = height;
        }
        jhl jhlVar = (jhl) this.bC.io();
        if (jhlVar.d != null) {
            aeoh aeohVar = jhlVar.b;
            if (aeohVar.q()) {
                Optional optionalOfNullable = Optional.ofNullable(aeohVar.j);
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = Optional.ofNullable(((SlimStatusBar) optionalOfNullable.get()).a);
                }
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = Optional.ofNullable(Integer.valueOf(((TextView) optionalOfNullable.get()).getMeasuredHeight()));
                }
                adha adhaVar = new adha(aeohVar, 10);
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = Optional.ofNullable(Integer.valueOf(((Integer) optionalOfNullable.get()).intValue() + ((aeoh) adhaVar.a).g));
                }
                iIntValue = ((Integer) optionalOfNullable.orElse(0)).intValue();
            }
        }
        int i = measuredHeight + iJ;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.m.getLayoutParams();
        marginLayoutParams2.getClass();
        int i2 = i + iIntValue;
        marginLayoutParams2.bottomMargin = i2;
        this.m.setLayoutParams(marginLayoutParams2);
        FrameLayout frameLayout = ((ivu) this.ao.io()).c;
        if (frameLayout == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()) == null) {
            return;
        }
        marginLayoutParams.bottomMargin = i2;
    }

    public final void p() {
        WatchWhileLayout watchWhileLayout = this.j;
        watchWhileLayout.getClass();
        watchWhileLayout.post(new dxk(watchWhileLayout, 13));
    }

    public final void q() {
        aunn aunnVar = this.G;
        ((tth) aunnVar.io()).e();
        ((tth) aunnVar.io()).g(1);
        z();
        WatchWhileLayout watchWhileLayout = this.j;
        int i = twb.a;
        watchWhileLayout.sendAccessibilityEvent(32);
    }

    public final void r() {
        if (this.u.compareAndSet(false, true)) {
            ied iedVar = (ied) this.bP.io();
            hww hwwVar = this.o;
            agrf agrfVar = ied.a;
            agru agruVarC = agrfVar.c();
            agrx agrxVar = agso.a;
            ((agrc) ((agrc) agruVarC.i(agrxVar, "QueueRestorationCtlr")).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueRestorationController", "restoreFromHomepage", 234, "QueueRestorationController.java")).w("restoreFromHomepage(currentPlayerViewMode: %s)", hwwVar);
            vxz vxzVar = iedVar.s;
            boolean zL = vxzVar.l(com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMajor, 45830468L, false);
            boolean zL2 = vxzVar.l(134, 45849000L, false);
            boolean zB = hwwVar.b(hww.b);
            aunn aunnVar = iedVar.b;
            ((abvk) aunnVar.io()).U();
            if (!zB || ((zL && !((abvk) aunnVar.io()).U()) || (zL2 && ((abjp) iedVar.c.io()).j() == null))) {
                iedVar.i(ieb.a, true);
                return;
            }
            ((agrc) ((agrc) agrfVar.c().i(agrxVar, "QueueRestorationCtlr")).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueRestorationController", "warmStartResumeQueueFromOtherDevice", SemanticState.Hidden, "QueueRestorationController.java")).t("warmStartResumeQueueFromOtherDevice");
            if (!iedVar.j(true) || iedVar.g()) {
                return;
            }
            iee ieeVar = iedVar.l;
            if (((abvn) ieeVar.b.io()).o().ac()) {
                ((agrc) ((agrc) iee.a.c().i(agrxVar, "QueueResumptionEligible")).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueResumptionEligibilityMonitor", "isEligibleForResumption", 105, "QueueResumptionEligibilityMonitor.java")).t("Currently playing, not eligible for resumption.");
                return;
            }
            long j = ieeVar.e.get();
            AtomicLong atomicLong = ieeVar.d;
            long j2 = atomicLong.get();
            if (ieeVar.g.l(134, 45849000L, false) && j2 == 0) {
                ((agrc) ((agrc) iee.a.c().i(agrxVar, "QueueResumptionEligible")).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueResumptionEligibilityMonitor", "isEligibleForResumption", 113, "QueueResumptionEligibilityMonitor.java")).t("No in-memory interaction recorded.");
                return;
            }
            long j3 = j - j2;
            long j4 = ieeVar.f;
            boolean z = j3 > j4;
            ((agrc) ((agrc) iee.a.c().i(agrxVar, "QueueResumptionEligible")).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueResumptionEligibilityMonitor", "isEligibleForResumption", 120, "QueueResumptionEligibilityMonitor.java")).G("activityStartTimestamp: %d, lastInteractionTimestamp: %d, warmStartQueueAgeThresholdMillis: %d, elapsedTimeSinceLastInteraction: %d, isEligible: %b", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j4), Long.valueOf(j3), Boolean.valueOf(z));
            if (z) {
                aunn aunnVar2 = iedVar.h;
                ((icq) aunnVar2.io()).o();
                iedVar.p = ((jnm) iedVar.d.io()).d(iedVar.g);
                iedVar.q = new iec(iedVar, atomicLong.get(), 0);
                ahno.at(iedVar.p, iedVar.q, iedVar.f);
                ((icq) aunnVar2.io()).q(8, 3);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awut, java.lang.Object] */
    public final void s() {
        jnm jnmVar = (jnm) this.cx.io();
        awro.t(jnmVar.c, null, 0, new bej(jnmVar, (awoq) null, 9), 3);
    }

    public final void t(hww hwwVar) {
        boolean z;
        yco ycoVar;
        if (hwwVar != this.o) {
            G(hwwVar);
            w(hwwVar);
            this.o = hwwVar;
            WatchFragment watchFragment = this.g;
            if (watchFragment != null) {
                if (watchFragment.X != hwwVar) {
                    watchFragment.X = hwwVar;
                    MusicPlayerView musicPlayerView = watchFragment.W;
                    if (hwwVar != musicPlayerView.e) {
                        musicPlayerView.e = hwwVar;
                    }
                    hwc hwcVar = watchFragment.z;
                    boolean z2 = hwcVar.q;
                    boolean z3 = hwcVar.n;
                    boolean z4 = hwcVar.p;
                    boolean z5 = hwcVar.r;
                    boolean z6 = hwcVar.o;
                    hwcVar.w = hwwVar;
                    hww hwwVar2 = hww.h;
                    hwcVar.p(hwwVar == hwwVar2);
                    hwcVar.i.c(hwwVar);
                    boolean z7 = hwwVar == hww.i;
                    hwcVar.q = z7;
                    hwcVar.n = hwwVar == hww.b || hwwVar == hww.l || z7;
                    hwcVar.p = hwwVar.b(hww.e, hww.f);
                    hww hwwVar3 = hww.c;
                    hww hwwVar4 = hww.d;
                    hwcVar.s = hwwVar.b(hwwVar3, hwwVar4, hww.g);
                    hwcVar.r = hwwVar.b(hww.j, hww.k);
                    tvg tvgVar = hwcVar.B;
                    hwc hwcVar2 = (hwcVar.o || hwcVar.s) ? hwcVar : null;
                    View view = tvgVar.b;
                    if (view != null) {
                        view.setOnTouchListener(null);
                    }
                    Iterator it = tvgVar.a.iterator();
                    while (it.hasNext()) {
                        ((tve) it.next()).a();
                    }
                    tvgVar.b = hwcVar2;
                    View view2 = tvgVar.b;
                    if (view2 != null) {
                        view2.setOnTouchListener(tvgVar);
                    }
                    if (z2 != hwcVar.q || z3 != hwcVar.n || z4 != hwcVar.p || z5 != hwcVar.r || (z6 && !hwcVar.o)) {
                        ibe ibeVar = hwcVar.F;
                        ibeVar.h = true;
                        if (hwcVar.n) {
                            ibeVar.b = ibeVar.getResources().getDimensionPixelSize(R.dimen.inline_time_bar_miniplayer_size);
                        } else {
                            ibeVar.b = ibeVar.getResources().getDimensionPixelSize(R.dimen.inline_time_bar_size);
                        }
                        ibeVar.requestLayout();
                        hwcVar.F();
                        if (hwcVar.n || (!hwcVar.o && (!hwcVar.m || hwcVar.r || hwcVar.p))) {
                            hwcVar.e();
                            hwcVar.E(0L);
                            hwcVar.K();
                        } else {
                            hwcVar.K();
                            abgh abghVar = hwcVar.j.a;
                            if (abghVar == abgh.c || abghVar == abgh.f || !hwcVar.J()) {
                                hwcVar.D();
                                if (hwcVar.p || hwcVar.s) {
                                    hwcVar.j();
                                }
                            }
                        }
                    }
                    hwn hwnVar = watchFragment.B;
                    boolean z8 = hwnVar.a;
                    boolean zB = hwwVar.b(hwwVar3, hwwVar4, hwwVar2);
                    boolean z9 = !zB;
                    hwnVar.a = z9;
                    if (z8 != z9) {
                        if (zB) {
                            if (hwnVar.b == null) {
                                hwnVar.b = AnimationUtils.loadAnimation(hwnVar.getContext(), android.R.anim.fade_in);
                                hwnVar.b.setDuration(hwnVar.getResources().getInteger(android.R.integer.config_mediumAnimTime));
                                hwnVar.b.setFillAfter(true);
                            }
                            hwnVar.startAnimation(hwnVar.b);
                        } else {
                            if (hwnVar.c == null) {
                                hwnVar.c = AnimationUtils.loadAnimation(hwnVar.getContext(), android.R.anim.fade_out);
                                hwnVar.c.setDuration(hwnVar.getResources().getInteger(android.R.integer.config_mediumAnimTime));
                                hwnVar.c.setFillAfter(true);
                            }
                            hwnVar.startAnimation(hwnVar.c);
                        }
                    }
                    acda acdaVar = watchFragment.aq;
                    acdaVar.c = hwwVar;
                    acdaVar.g();
                    jmt jmtVar = watchFragment.aa;
                    jmtVar.d = hwwVar == hwwVar2 || hwwVar == hwwVar3;
                    jmtVar.a();
                    if (watchFragment.Y != null) {
                        z = false;
                        if (!watchFragment.ag.l(81, 45739191L, false)) {
                            watchFragment.Y.e();
                        }
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (hwwVar == hww.a && (ycoVar = ((ycp) watchFragment.j.io()).e) != null && !TextUtils.isEmpty(ycoVar.D())) {
                    ycoVar.aj();
                }
                ((abvk) watchFragment.P.io()).I(hww.c(hwwVar));
                ((abvk) watchFragment.P.io()).G(hwwVar == hww.h ? true : z);
            } else {
                z = false;
            }
            iwe iweVar = this.bd;
            iweVar.b = hwwVar == hww.h ? true : z;
            iweVar.d();
            hfn hfnVar = (hfn) this.aE.io();
            hwwVar.name();
            ((awku) hfnVar.a).kk(hwwVar);
        }
    }

    public final void u(ajwo ajwoVar) {
        ((gfp) this.bR.io()).j(ajwoVar, null);
    }

    public final void v() {
        boolean z = true;
        if (!((swh) this.aq.io()).c() && this.f.b() <= 0) {
            z = false;
        }
        this.d.g(z);
    }

    public final void w(hww hwwVar) {
        this.j.post(new br(this, hwwVar, 16, (byte[]) null));
    }

    public final void x(boolean z, boolean z2) {
        String queryParameter;
        if (((zwb) this.P.io()).u() || this.B) {
            if (z) {
                HashMap map = new HashMap();
                if (z2) {
                    map.put("force_refresh", Boolean.TRUE);
                }
                if (!this.q) {
                    Uri data = this.bh.getIntent().getData();
                    if (data != null) {
                        Uri uri = ((Objects.equals(data.getScheme(), "https") || Objects.equals(data.getScheme(), "http")) && Objects.equals(data.getAuthority(), "music.youtube.com") && data.getPathSegments().size() == 1 && "attribution_link".equals(data.getPathSegments().get(0)) && (queryParameter = data.getQueryParameter("u")) != null) ? Uri.parse(queryParameter) : data;
                        if ((Objects.equals(uri.getScheme(), "https") || Objects.equals(uri.getScheme(), "http")) && Objects.equals(uri.getAuthority(), "music.youtube.com") && uri.getPathSegments().isEmpty() && uri.getQueryParameter("share") != null) {
                            this.cf = data;
                        }
                        ((hkk) this.cu.io()).a(data.toString());
                    }
                    this.q = true;
                }
                String strG = ((jnj) this.Q.io()).g();
                ((hke) this.bO.io()).b(true != hdu.h.contains(strG) ? strG : "FEmusic_library_landing");
                ((gfp) this.bR.io()).e(vxh.a(strG), map, gnl.a);
            }
        } else if (z) {
            MusicActivity musicActivity = this.bh;
            if (musicActivity.getIntent().getData() != null && !this.q) {
                hkk hkkVar = (hkk) this.cu.io();
                hkkVar.a = true;
                List<String> queryParameters = musicActivity.getIntent().getData().getQueryParameters("syncid");
                if (queryParameters != null && !queryParameters.isEmpty()) {
                    hkkVar.c = Optional.of(queryParameters.get(0));
                }
            }
            this.bV.a();
            afwv afwvVar = this.ca;
            dd ddVar = (dd) afwvVar.c;
            if (jku.e(ddVar)) {
                View view = (View) afwvVar.a;
                view.clearAnimation();
                view.setVisibility(0);
                cc ccVarF = afwvVar.f();
                if (ccVarF == null || !"interstitial_tag_sign_in".equals(ccVarF.getTag())) {
                    afwvVar.b = new ivn();
                    av avVar = new av(ddVar);
                    if (ccVarF != null) {
                        avVar.s(android.R.animator.fade_in, android.R.animator.fade_out, 0);
                    }
                    avVar.q(R.id.interstitials_container, (cc) afwvVar.b, "interstitial_tag_sign_in");
                    avVar.a(false, true);
                    ddVar.ah();
                }
            }
            this.i = true;
            ((dov) this.aM.io()).v();
        }
        ((rpy) this.aK.io()).a();
        if (this.j == null || !z2) {
            return;
        }
        y();
    }

    public final void y() {
        this.bh.invalidateOptionsMenu();
        ((jnj) this.cj.io()).a();
    }

    public final void z() {
        this.n.setPadding(this.j.aa() ? 0 : ((hfn) this.aL.io()).L().f(519).b, 0, this.j.aa() ? 0 : ((hfn) this.aL.io()).L().f(519).d, 0);
    }

    @Override // defpackage.afgr
    public final /* synthetic */ void E() {
    }

    @Override // defpackage.afgr
    public final /* synthetic */ void k() {
    }
}

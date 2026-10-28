package com.google.android.apps.youtube.music.activities;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import app.rive.semantics.SemanticState;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.audiopreview.AudioPreviewPlayerActivity;
import com.google.android.apps.youtube.music.mediabrowser.waze.MusicWazeBroadcastReceiver;
import com.google.android.apps.youtube.music.watch.WatchFragment;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.material.tabs.TabLayout;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import defpackage.aabz;
import defpackage.aaok;
import defpackage.aave;
import defpackage.aawb;
import defpackage.aawi;
import defpackage.aawl;
import defpackage.abbd;
import defpackage.abea;
import defpackage.abeq;
import defpackage.abfp;
import defpackage.abhb;
import defpackage.abjp;
import defpackage.abmc;
import defpackage.abmw;
import defpackage.abmx;
import defpackage.abnl;
import defpackage.abuz;
import defpackage.abvk;
import defpackage.abvn;
import defpackage.abwr;
import defpackage.abxv;
import defpackage.aduw;
import defpackage.afip;
import defpackage.afnb;
import defpackage.afov;
import defpackage.afow;
import defpackage.afpj;
import defpackage.aftc;
import defpackage.afty;
import defpackage.afuu;
import defpackage.afux;
import defpackage.afvn;
import defpackage.afwj;
import defpackage.afwl;
import defpackage.afwt;
import defpackage.afwv;
import defpackage.agdf;
import defpackage.agrc;
import defpackage.agrx;
import defpackage.agso;
import defpackage.aguu;
import defpackage.ahei;
import defpackage.ahno;
import defpackage.aihf;
import defpackage.aihh;
import defpackage.aihl;
import defpackage.aihn;
import defpackage.ainv;
import defpackage.ajet;
import defpackage.ajth;
import defpackage.ajwo;
import defpackage.alos;
import defpackage.alot;
import defpackage.alou;
import defpackage.ameb;
import defpackage.antn;
import defpackage.arqz;
import defpackage.atqp;
import defpackage.aumt;
import defpackage.aunn;
import defpackage.auof;
import defpackage.auym;
import defpackage.avlh;
import defpackage.avmb;
import defpackage.avmm;
import defpackage.avmn;
import defpackage.avmr;
import defpackage.avni;
import defpackage.avnn;
import defpackage.awka;
import defpackage.awku;
import defpackage.awlg;
import defpackage.awmd;
import defpackage.awq;
import defpackage.axfd;
import defpackage.azs;
import defpackage.bac;
import defpackage.bob;
import defpackage.boc;
import defpackage.boh;
import defpackage.bpp;
import defpackage.cc;
import defpackage.dd;
import defpackage.did;
import defpackage.dij;
import defpackage.dov;
import defpackage.fsu;
import defpackage.fw;
import defpackage.fx;
import defpackage.gdx;
import defpackage.gdz;
import defpackage.gec;
import defpackage.gek;
import defpackage.gem;
import defpackage.geq;
import defpackage.ges;
import defpackage.get;
import defpackage.gev;
import defpackage.gew;
import defpackage.gfh;
import defpackage.gfk;
import defpackage.gfp;
import defpackage.gfr;
import defpackage.gfu;
import defpackage.gfv;
import defpackage.gkq;
import defpackage.gks;
import defpackage.gla;
import defpackage.gml;
import defpackage.gmy;
import defpackage.gnf;
import defpackage.gni;
import defpackage.gnz;
import defpackage.grj;
import defpackage.gzg;
import defpackage.gzz;
import defpackage.hac;
import defpackage.had;
import defpackage.hag;
import defpackage.hbp;
import defpackage.hbq;
import defpackage.hcy;
import defpackage.heg;
import defpackage.heh;
import defpackage.hfk;
import defpackage.hfn;
import defpackage.hgu;
import defpackage.hhb;
import defpackage.hjd;
import defpackage.hkc;
import defpackage.hke;
import defpackage.hkl;
import defpackage.hkz;
import defpackage.hmb;
import defpackage.hmf;
import defpackage.hpw;
import defpackage.huz;
import defpackage.hvn;
import defpackage.hwd;
import defpackage.hwh;
import defpackage.hws;
import defpackage.hww;
import defpackage.hxb;
import defpackage.hxe;
import defpackage.hxj;
import defpackage.hys;
import defpackage.hyx;
import defpackage.hzk;
import defpackage.icq;
import defpackage.icy;
import defpackage.idi;
import defpackage.iee;
import defpackage.igr;
import defpackage.igw;
import defpackage.iho;
import defpackage.ihp;
import defpackage.ijj;
import defpackage.ilw;
import defpackage.ilx;
import defpackage.inn;
import defpackage.iox;
import defpackage.iqc;
import defpackage.iqd;
import defpackage.iup;
import defpackage.ivu;
import defpackage.jav;
import defpackage.jbt;
import defpackage.jeh;
import defpackage.jgq;
import defpackage.jjb;
import defpackage.jjn;
import defpackage.jki;
import defpackage.jkq;
import defpackage.jkr;
import defpackage.jku;
import defpackage.jkx;
import defpackage.jld;
import defpackage.jlf;
import defpackage.jmr;
import defpackage.jng;
import defpackage.jnj;
import defpackage.jnm;
import defpackage.jny;
import defpackage.joj;
import defpackage.jol;
import defpackage.jop;
import defpackage.joz;
import defpackage.jqo;
import defpackage.kjs;
import defpackage.kyr;
import defpackage.maj;
import defpackage.map;
import defpackage.mbo;
import defpackage.mdu;
import defpackage.mgk;
import defpackage.nh;
import defpackage.omj;
import defpackage.qnw;
import defpackage.qrx;
import defpackage.rks;
import defpackage.rkt;
import defpackage.rlt;
import defpackage.rmp;
import defpackage.rpy;
import defpackage.rrq;
import defpackage.rtc;
import defpackage.rya;
import defpackage.sbb;
import defpackage.suo;
import defpackage.swh;
import defpackage.sxt;
import defpackage.sxu;
import defpackage.taa;
import defpackage.tac;
import defpackage.taf;
import defpackage.taq;
import defpackage.tau;
import defpackage.tbt;
import defpackage.tfm;
import defpackage.tpw;
import defpackage.tqj;
import defpackage.tqr;
import defpackage.trf;
import defpackage.trn;
import defpackage.ttf;
import defpackage.tth;
import defpackage.tto;
import defpackage.tuk;
import defpackage.tun;
import defpackage.twb;
import defpackage.txz;
import defpackage.vgi;
import defpackage.vmy;
import defpackage.vqe;
import defpackage.vqs;
import defpackage.vub;
import defpackage.vvb;
import defpackage.vwd;
import defpackage.vwh;
import defpackage.vxe;
import defpackage.vxh;
import defpackage.vxz;
import defpackage.wmr;
import defpackage.wnw;
import defpackage.xbo;
import defpackage.xeu;
import defpackage.xff;
import defpackage.xgj;
import defpackage.xgn;
import defpackage.xhb;
import defpackage.xhc;
import defpackage.xkw;
import defpackage.xmu;
import defpackage.xmw;
import defpackage.xop;
import defpackage.xrn;
import defpackage.xru;
import defpackage.xun;
import defpackage.xzf;
import defpackage.xzm;
import defpackage.yco;
import defpackage.ycp;
import defpackage.ydu;
import defpackage.yno;
import defpackage.ztf;
import defpackage.zvm;
import defpackage.zvn;
import defpackage.zvp;
import defpackage.zwa;
import defpackage.zwb;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class MusicActivity extends gdz implements afnb, afov {
    private get a;
    private final aftc b = new aftc(this, this);
    private boolean c;
    private Context d;
    private boh e;
    private boolean f;

    public MusicActivity() {
        SystemClock.elapsedRealtime();
        addOnContextAvailableListener(new fw((fx) this, 5));
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.d;
        }
        ahno.al(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    @Override // defpackage.fx, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        this.d = context;
        super.attachBaseContext(context);
        this.d = null;
    }

    @Override // defpackage.gea
    public final /* synthetic */ auof c() {
        return new afpj(this);
    }

    @Override // defpackage.gfs
    public final View d() {
        return e().bh.findViewById(R.id.floating_layout);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        get getVarE = e();
        if (getVarE.bZ.l(4, 45645916L, false) && getVarE.cb != null && (motionEvent.getAction() == 0 || motionEvent.getAction() == 1)) {
            aaok aaokVar = getVarE.cb;
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Object obj = aaokVar.d;
            vwd vwdVar = (vwd) obj;
            ahno.ao(new vwh(obj, (Object) motionEventObtain, (Object) yno.eK(vwdVar.f), 1, (byte[]) null), vwdVar.b);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final get e() {
        j();
        return this.a;
    }

    @Override // defpackage.afnb
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final get peer() {
        get getVar = this.a;
        if (getVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.f) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return getVar;
    }

    @Override // android.app.Activity
    public final void finish() {
        afvn afvnVarA = this.b.a();
        try {
            super.finish();
            afvnVarA.close();
        } catch (Throwable th) {
            try {
                afvnVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.qe, defpackage.ee, defpackage.bog
    public final boc getLifecycle() {
        if (this.e == null) {
            this.e = new afow(this);
        }
        return this.e;
    }

    @Override // defpackage.afnb
    public final Class getPeerClass() {
        return get.class;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0051  */
    @Override // defpackage.wfw
    public final String h() {
        String strF;
        get getVarE = e();
        if (!getVarE.j.ae() || getVarE.r == null) {
            aunn aunnVar = getVarE.E;
            if (!((gnz) aunnVar.io()).h()) {
                cc ccVarB = ((gni) getVarE.F.io()).d.b();
                if (ccVarB instanceof gnf) {
                    strF = ((gnf) ccVarB).f();
                } else {
                    strF = null;
                }
            } else if (true == gnz.i(((gnz) aunnVar.io()).c.b())) {
                strF = "music_android_search";
            } else {
                strF = null;
            }
        } else {
            strF = "music_android_watch";
        }
        return strF == null ? "music_android_default" : strF;
    }

    @Override // defpackage.xgm
    public final xgn hB() {
        return e().a();
    }

    @Override // defpackage.igy
    public final void i(abnl abnlVar, hxb hxbVar) {
        get getVarE = e();
        getVarE.f();
        ((igw) getVarE.bB.io()).i(abnlVar, hxbVar);
    }

    @Override // defpackage.fx, android.app.Activity
    public final void invalidateOptionsMenu() {
        afvn afvnVarH = afty.h();
        try {
            super.invalidateOptionsMenu();
            afvnVarH.close();
        } catch (Throwable th) {
            try {
                afvnVarH.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void j() {
        if (this.a == null) {
            if (!this.c) {
                throw new IllegalStateException("createPeer() called outside of onCreate");
            }
            if (this.f && !isFinishing()) {
                throw new IllegalStateException("createPeer() called after destroyed.");
            }
            afuu afuuVarD = afwt.d(1, "CreateComponent", afux.a, true);
            try {
                generatedComponent();
                afuuVarD.close();
                afuu afuuVarD2 = afwt.d(2, "CreatePeer", afux.a, true);
                try {
                    this.a = ((gew) aguu.as(this, gew.class)).a();
                    afuuVarD2.close();
                    this.a.cd = this;
                } catch (Throwable th) {
                    try {
                        afuuVarD2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    afuuVarD.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    @Override // defpackage.sxp
    protected final void k(int i, int i2, Intent intent) {
        auym auymVar;
        Object obj;
        get getVarE = e();
        Object obj2 = ((mgk) getVarE.T.io()).b;
        if (obj2 != null && (obj = (auymVar = (auym) obj2).b) != null && ((SparseArray) obj).get(i) != null) {
            ((sxt) ((SparseArray) auymVar.b).get(i)).d(i, i2, intent);
            Object obj3 = auymVar.b;
            if (obj3 != null) {
                ((SparseArray) obj3).remove(i);
                return;
            }
            return;
        }
        afwv afwvVar = getVarE.ca;
        if (afwvVar != null) {
            MusicActivity musicActivity = getVarE.bh;
            bpp bppVarF = afwvVar.f();
            if ((bppVarF instanceof sxt) && ((sxt) bppVarF).d(i, i2, intent)) {
                return;
            }
        }
        super.k(i, i2, intent);
    }

    @Override // defpackage.hwk
    public final void l() {
        get getVarE = e();
        if (getVarE.j.aa()) {
            getVarE.q();
        }
        getVarE.j.D();
    }

    @Override // defpackage.hwk
    public final void m() {
        get getVarE = e();
        getVarE.z();
        ((dov) getVarE.aM.io()).v();
        cc ccVarG = ((dd) ((grj) getVarE.av.io()).a).g("STREAM_WIFI_ONLY_BOTTOM_SHEET_FRAGMENT");
        if (ccVarG instanceof qnw) {
            ((qnw) ccVarG).dismiss();
        }
        WatchWhileLayout watchWhileLayout = getVarE.j;
        watchWhileLayout.V();
        watchWhileLayout.O(hww.h);
        WatchWhileLayout watchWhileLayout2 = getVarE.j;
        int i = twb.a;
        watchWhileLayout2.sendAccessibilityEvent(32);
        getVarE.p();
    }

    @Override // defpackage.hwk
    public final void n() {
        e().l();
    }

    @Override // defpackage.hex
    public final void o(String str) {
        get getVarE = e();
        if (jku.c(getVarE.bh) && "interstitial_tag_sign_in".equals(str)) {
            getVarE.B = true;
            getVarE.x(true, false);
            if (((hfn) getVarE.aD.io()).E()) {
                getVarE.bc.h(true);
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        afvn afvnVarB = this.b.b();
        try {
            super.onAttachedToWindow();
            afvnVarB.close();
        } catch (Throwable th) {
            try {
                afvnVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.qe, android.app.Activity
    public final void onBackPressed() {
        afvn afvnVarC = this.b.c();
        try {
            super.onBackPressed();
            afvnVarC.close();
        } catch (Throwable th) {
            try {
                afvnVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fx, defpackage.qe, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        afvn afvnVarN = this.b.n("onConfigurationChanged", null);
        try {
            super.onConfigurationChanged(configuration);
            get getVarE = e();
            ((wmr) getVarE.ay.io()).b(getVarE.bh);
            joz jozVar = getVarE.r;
            if (jozVar != null) {
                jozVar.w(jozVar.ap, 0L);
                jol jolVar = jozVar.k;
                jolVar.h(((hfn) jolVar.g.io()).x());
                Iterator it = jolVar.H.values().iterator();
                while (it.hasNext()) {
                    ((nh) ((joj) it.next()).c.m).jW();
                }
                jav javVar = jolVar.x;
                if (javVar != null) {
                    ((nh) javVar.m).jW();
                }
                jolVar.p.a();
                jolVar.e.f();
            }
            ((aduw) getVarE.au.io()).i();
            ((swh) getVarE.aq.io()).b();
            getVarE.v();
            afvnVarN.close();
        } catch (Throwable th) {
            try {
                afvnVarN.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0077 A[Catch: all -> 0x0723, TryCatch #0 {all -> 0x0723, blocks: (B:3:0x000b, B:5:0x002d, B:7:0x003b, B:8:0x0044, B:9:0x0047, B:16:0x009b, B:18:0x00a1, B:20:0x00a7, B:24:0x00bc, B:26:0x00c7, B:28:0x00dd, B:30:0x0133, B:31:0x0145, B:33:0x01a0, B:39:0x01ff, B:41:0x0211, B:43:0x021e, B:45:0x022a, B:47:0x022e, B:48:0x0237, B:50:0x0286, B:51:0x028b, B:53:0x0295, B:55:0x0299, B:56:0x02a7, B:57:0x02aa, B:61:0x02d7, B:63:0x0302, B:65:0x030a, B:66:0x030f, B:67:0x0318, B:69:0x031e, B:70:0x0322, B:72:0x0336, B:73:0x033b, B:75:0x035c, B:76:0x0361, B:78:0x037a, B:79:0x0382, B:81:0x03bd, B:84:0x03e3, B:88:0x041c, B:91:0x0464, B:96:0x052b, B:98:0x054d, B:100:0x0553, B:101:0x055a, B:103:0x05bb, B:105:0x05e0, B:108:0x05ea, B:111:0x05f4, B:117:0x0603, B:121:0x060c, B:123:0x0612, B:124:0x0654, B:126:0x06cb, B:127:0x06ce, B:129:0x06e2, B:130:0x06e9, B:132:0x06f2, B:133:0x0700, B:135:0x070e, B:136:0x0719, B:95:0x0505, B:83:0x03c3, B:60:0x02d4, B:42:0x0218, B:34:0x01aa, B:36:0x01c6, B:38:0x01ef, B:37:0x01e3, B:13:0x005a, B:15:0x0077), top: B:146:0x000b, inners: #2 }] */
    /* JADX WARN: Type inference failed for: r7v36, types: [avmn, java.lang.Object] */
    @Override // defpackage.gea, defpackage.cf, defpackage.qe, defpackage.ee, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        avmm avmmVar;
        avmb avmbVar;
        aftc aftcVar = this.b;
        afvn afvnVarU = aftcVar.u();
        int i = 1;
        try {
            this.c = true;
            ((afow) getLifecycle()).g(aftcVar);
            super.onCreate(bundle);
            final get getVarE = e();
            dd.a = false;
            tqj tqjVar = getVarE.bi;
            int i2 = tqr.a;
            if (tqjVar.a(1074141851) > 0) {
                trn trnVar = (trn) getVarE.aX.io();
                MusicActivity musicActivity = getVarE.cd;
                if (!trnVar.a) {
                    musicActivity.getLifecycle().b(trnVar);
                    trnVar.a = true;
                }
                trnVar.a(1);
            }
            final boolean zK = tqjVar.k(1073807731);
            final boolean zK2 = tqjVar.k(1073830358);
            if (!zK) {
                if (zK2) {
                    zK2 = true;
                    avmmVar = getVarE.t;
                    avlh avlhVar = getVarE.by;
                    avmbVar = getVarE.y;
                    avmmVar.c(avlhVar.L(avmbVar).al(new avni() { // from class: gel
                        @Override // defpackage.avni
                        public final void a(Object obj) {
                            get getVar = getVarE;
                            gnk gnkVar = (gnk) obj;
                            if (zK && gnkVar == gnk.a) {
                                getVar.handleBrowseRendered(null);
                            }
                            if (zK2 && gnkVar == gnk.b) {
                                getVar.f();
                            }
                        }
                    }, new gfh(1)));
                    if (zK2) {
                        avmmVar.c(getVarE.bz.x(new gkq(i)).az().L(avmbVar).al(new gks(getVarE, i), new gfh(1)));
                    }
                }
                try {
                    afvnVarU.close();
                    throw th;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                    throw th;
                }
            }
            avmmVar = getVarE.t;
            avlh avlhVar2 = getVarE.by;
            avmbVar = getVarE.y;
            avmmVar.c(avlhVar2.L(avmbVar).al(new avni() { // from class: gel
                @Override // defpackage.avni
                public final void a(Object obj) {
                    get getVar = getVarE;
                    gnk gnkVar = (gnk) obj;
                    if (zK && gnkVar == gnk.a) {
                        getVar.handleBrowseRendered(null);
                    }
                    if (zK2 && gnkVar == gnk.b) {
                        getVar.f();
                    }
                }
            }, new gfh(1)));
            if (zK2) {
                avmmVar.c(getVarE.bz.x(new gkq(i)).az().L(avmbVar).al(new gks(getVarE, i), new gfh(1)));
            }
            if (!getVarE.ba.a && !tqjVar.k(1073807731)) {
                ((tbt) getVarE.O.io()).e(new hac());
            }
            getVarE.h = bundle == null;
            boolean zA = tqjVar.k(1073830355) ? ((tfm) getVarE.bG.io()).a(getVarE.h, getVarE.bh.getIntent()) : false;
            aunn aunnVar = getVarE.am;
            ((gec) aunnVar.io()).a((gdx) getVarE.Y.io());
            ((gec) aunnVar.io()).a.add((Application.ActivityLifecycleCallbacks) getVarE.an.io());
            MusicActivity musicActivity2 = getVarE.bh;
            musicActivity2.setVolumeControlStream(3);
            musicActivity2.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getVarE.f = musicActivity2.getSupportFragmentManager();
            getVarE.f.n(getVarE.x);
            ((iup) getVarE.aI.io()).A();
            if (!tqjVar.k(1073830355)) {
                zA = ((tfm) getVarE.bG.io()).a(getVarE.h, musicActivity2.getIntent());
            }
            ((afip) getVarE.bK.io()).c(musicActivity2, ajet.USER_INTERFACE_THEME_DARK);
            View viewInflate = LayoutInflater.from(musicActivity2).inflate(R.layout.main_activity, (ViewGroup) null);
            musicActivity2.setContentView(viewInflate);
            View viewInflate2 = LayoutInflater.from(musicActivity2).inflate(R.layout.main_activity_launch_animation, (ViewGroup) null);
            jkr jkrVar = (jkr) getVarE.bv.io();
            ViewGroup viewGroup = (ViewGroup) viewInflate;
            jkrVar.f = viewGroup;
            jkrVar.g = viewInflate2;
            jkrVar.d = true;
            jkrVar.e = false;
            viewGroup.addView(viewInflate2, new ViewGroup.LayoutParams(-1, -1));
            viewInflate2.bringToFront();
            LottieAnimationView lottieAnimationView = (LottieAnimationView) viewInflate2.findViewById(R.id.launch_animation);
            int i3 = 4;
            if (lottieAnimationView == null) {
                jkrVar.b("sa_e");
                jkrVar.a();
            } else {
                lottieAnimationView.h(R.raw.app_launch);
                lottieAnimationView.a(new jkq(jkrVar));
                lottieAnimationView.f();
                if (jkrVar.h.l(17, 45680971L, false)) {
                    jkrVar.c.x(new hxe(20)).al(new jgq(jkrVar, 4), new jeh(8));
                } else {
                    jkrVar.b.a(jkrVar, hag.class, new gla(jkrVar, i3));
                }
                jkrVar.a.c(new iqc(jkrVar, 5), 2500L, TimeUnit.MILLISECONDS);
            }
            ViewStub viewStub = (ViewStub) musicActivity2.findViewById(R.id.stub_watch_while_layout);
            if (tqjVar.k(1073830358)) {
                viewStub.setLayoutResource(R.layout.watch_while_layout_deferred);
            } else {
                viewStub.setLayoutResource(R.layout.watch_while_layout);
            }
            viewStub.inflate();
            View viewFindViewById = musicActivity2.findViewById(R.id.accessibility_layer_container);
            if (viewFindViewById != null && (viewFindViewById instanceof AccessibilityLayerLayout)) {
                ((AccessibilityLayerLayout) viewFindViewById).f = new hhb(getVarE);
            }
            musicActivity2.getOnBackPressedDispatcher().c(musicActivity2, getVarE.d);
            getVarE.m = musicActivity2.findViewById(R.id.floating_layout);
            View viewFindViewById2 = musicActivity2.findViewById(R.id.pivot_bar);
            viewFindViewById2.addOnLayoutChangeListener(new hbp(getVarE, 1));
            ((ivu) getVarE.ao.io()).c = (FrameLayout) musicActivity2.findViewById(R.id.survey_container);
            getVarE.n = musicActivity2.findViewById(R.id.main_layout_wrapper);
            getVarE.j = (WatchWhileLayout) musicActivity2.findViewById(R.id.watch_while_layout);
            WatchWhileLayout watchWhileLayout = getVarE.j;
            View view = watchWhileLayout.aq;
            if (view != null) {
                view.removeOnLayoutChangeListener(watchWhileLayout.bL);
            }
            watchWhileLayout.aq = viewFindViewById2;
            if (watchWhileLayout.bW.m()) {
                View view2 = watchWhileLayout.aq;
                if (view2 != null) {
                    watchWhileLayout.bJ = view2.getMeasuredHeight();
                    watchWhileLayout.aq.addOnLayoutChangeListener(watchWhileLayout.bL);
                } else {
                    watchWhileLayout.bJ = 0;
                }
            }
            watchWhileLayout.G();
            getVarE.j.bZ = getVarE.cc;
            getVarE.k = (ViewGroup) musicActivity2.findViewById(R.id.fragment_container);
            getVarE.k.setOnHierarchyChangeListener(new geq(getVarE, 0));
            if (!tqjVar.k(1073830358) || !zA) {
                getVarE.f();
            }
            ((heg) getVarE.bn.io()).a = new hhb(getVarE);
            hke hkeVar = (hke) getVarE.bO.io();
            dd ddVar = getVarE.f;
            vxe vxeVar = (vxe) getVarE.bM.io();
            Set set = getVarE.bg;
            hkeVar.d = ddVar;
            hkeVar.e = vxeVar;
            hkeVar.f = set;
            if (bundle != null) {
                ArrayList<String> stringArrayList = bundle.getStringArrayList("root_fragment_tags");
                if (stringArrayList != null) {
                    hkeVar.b.addAll(stringArrayList);
                }
                hkeVar.c = bundle.getString("active_root_fragment_tag", null);
            }
            if (ddVar.b() == 0) {
                hkeVar.e(null);
            }
            hkl hklVar = getVarE.bV;
            hklVar.g = (TabLayout) viewFindViewById2;
            vxz vxzVar = hklVar.r;
            if (!vxzVar.l(18, 45687381L, false)) {
                hklVar.g.e(hklVar);
            }
            hklVar.t.M().al(new hjd(hklVar, 11), new gfh(18));
            hklVar.h();
            if (vxzVar.l(18, 45687381L, false)) {
                hklVar.g.e(hklVar);
            }
            hklVar.h = musicActivity2;
            hklVar.j();
            musicActivity2.getWindow().setNavigationBarColor(musicActivity2.getColor(R.color.music_full_transparent));
            if (Build.VERSION.SDK_INT >= 29) {
                musicActivity2.getWindow().setNavigationBarContrastEnforced(false);
            }
            View viewFindViewById3 = musicActivity2.findViewById(R.id.accessibility_layer_container);
            viewFindViewById3.setSystemUiVisibility(1792);
            ttf ttfVar = new ttf(getVarE, 1);
            int i4 = bac.a;
            azs.c(viewFindViewById3, ttfVar);
            ((hfn) getVarE.aL.io()).M().al(new gem(getVarE, 1), new gfh(1));
            viewFindViewById3.addOnAttachStateChangeListener(new jld(viewFindViewById3, 0));
            avmn avmnVar = getVarE.z;
            if (avmnVar == null || avmnVar.f()) {
                getVarE.z = ((avlh) getVarE.aQ.io()).L(getVarE.y).al(new gem(getVarE, 0), new gfh(1));
            }
            ((tth) getVarE.G.io()).l(getVarE.j);
            ((gec) aunnVar.io()).a((gdx) getVarE.E.io());
            View viewFindViewById4 = musicActivity2.findViewById(R.id.interstitials_container);
            getVarE.ca = new afwv(viewFindViewById4, getVarE.f);
            boolean z = getVarE.ca.f() != null;
            getVarE.i = z;
            tuk.l(viewFindViewById4, z);
            aunn aunnVar2 = getVarE.ad;
            ((jmr) aunnVar2.io()).b = new WeakReference(new hhb(getVarE));
            aunn aunnVar3 = getVarE.O;
            ((tbt) aunnVar3.io()).f(aunnVar2.io());
            ScheduledExecutorService scheduledExecutorService = getVarE.K;
            txz.c(musicActivity2, scheduledExecutorService, AudioPreviewPlayerActivity.class, 0);
            getVarE.l = (FrameLayout) musicActivity2.findViewById(R.id.waze_bar_container);
            hkc hkcVar = (hkc) getVarE.aA.io();
            FrameLayout frameLayout = getVarE.l;
            int i5 = 2;
            if (frameLayout != null) {
                try {
                    hkcVar.e = new aumt(hkcVar.b);
                    frameLayout.addView(hkcVar.e);
                    frameLayout.setVisibility(0);
                    hkcVar.b(false);
                    hkcVar.e.c = new hhb(hkcVar);
                    avmm avmmVar2 = hkcVar.d;
                    avmmVar2.b();
                    avmmVar2.e(hkcVar.c.i(new abwr(1)).p().al(new hjd(hkcVar, 8), new gfh(17)), hkcVar.f.y().i(new abwr(1)).al(new hjd(hkcVar, 9), new gfh(17)), hkcVar.g.M().al(new hjd(hkcVar, 10), new gfh(17)));
                    hkcVar.e.getViewTreeObserver().addOnGlobalLayoutListener(new jbt(hkcVar, 1));
                } catch (Exception e) {
                    ((agrc) ((agrc) ((agrc) hkc.a.b().i(agso.a, "MusicWazeNavBarCtlr")).j(e)).k("com/google/android/apps/youtube/music/mediabrowser/waze/MusicWazeNavBarController", "setupNavigationBar", 'K', "MusicWazeNavBarController.java")).t("Waze exception in createAndInitializeNavigationBar");
                    zvp.b(zvn.b, zvm.n, "Waze exception in createAndInitializeNavigationBar: ", e);
                }
            }
            txz.c(musicActivity2, scheduledExecutorService, MusicWazeBroadcastReceiver.class, 1);
            trf trfVar = (trf) getVarE.aH.io();
            abvn abvnVar = (abvn) getVarE.X.io();
            ?? r7 = trfVar.c;
            if (r7 != 0 && !r7.f()) {
                awka.f((AtomicReference) trfVar.c);
            }
            trfVar.c = ((avlh) abvnVar.r().a).p().i(new abwr(1)).al(new hwd(trfVar, 13), new hpw(13));
            getVarE.j.getViewTreeObserver().addOnPreDrawListener(new ges(musicActivity2, getVarE.j));
            ((rkt) getVarE.M.io()).h.add((rks) getVarE.bH.io());
            if (musicActivity2.getIntent().hasExtra("widget_key")) {
                ((xgn) getVarE.R.io()).o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(79500)), null);
                Intent intent = musicActivity2.getIntent();
                ConcurrentHashMap concurrentHashMap = maj.a;
                musicActivity2.getClass();
                String stringExtra = intent != null ? intent.getStringExtra("com.google.android.libraries.androidatgoogle.widget.logging.WIDGET_NAME") : null;
                String stringExtra2 = intent != null ? intent.getStringExtra("com.google.android.libraries.androidatgoogle.widget.logging.TAP") : null;
                int intExtra = intent != null ? intent.getIntExtra("com.google.android.libraries.androidatgoogle.widget.logging.SERVICE_ID", -1) : -1;
                if (stringExtra == null) {
                    stringExtra = "";
                }
                if (stringExtra.length() != 0) {
                    if (stringExtra2 == null) {
                        stringExtra2 = "";
                    }
                    if (stringExtra2.length() != 0) {
                        aihf aihfVarCreateBuilder = ainv.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        ainv ainvVar = (ainv) aihfVarCreateBuilder.instance;
                        ainvVar.c = 1;
                        ainvVar.b |= 1;
                        aihfVarCreateBuilder.copyOnWrite();
                        ainv ainvVar2 = (ainv) aihfVarCreateBuilder.instance;
                        ainvVar2.b |= 2;
                        ainvVar2.d = stringExtra;
                        aihfVarCreateBuilder.copyOnWrite();
                        ainv ainvVar3 = (ainv) aihfVarCreateBuilder.instance;
                        ainvVar3.b |= 4;
                        ainvVar3.e = stringExtra2;
                        map mapVarK = mdu.k(musicActivity2, intExtra);
                        aihn aihnVarBuild = aihfVarCreateBuilder.build();
                        aihnVarBuild.getClass();
                        mapVarK.a((ainv) aihnVarBuild);
                    }
                }
            }
            ilw ilwVar = (ilw) getVarE.aO.io();
            ilwVar.c.n(ilwVar);
            ((hke) ilwVar.d.io()).a(ilwVar);
            ilwVar.g.e(((avlh) ((abvn) ilwVar.a.io()).r().o).al(new iho(ilwVar, i5), new ihp(2)), ((avlh) ((abvn) ilwVar.b.io()).r().o).al(new iho(ilwVar, 3), new ihp(2)));
            ((vqs) getVarE.bo.io()).c();
            if (tqjVar.k(1073830359)) {
                getVarE.r();
            }
            ((tpw) getVarE.bu.io()).a();
            if (tqjVar.k(1073807732)) {
                getVarE.bA.f(tau.ACTIVITY_CREATED);
            }
            if (!tqjVar.k(1073807731)) {
                ((tbt) aunnVar3.io()).c(new gzz());
            }
            if (getVarE.bW.l(200, 45717907L, false)) {
                musicActivity2.getTheme().applyStyle(R.style.DarkerDarkThemeUpdates, true);
            }
            this.c = false;
            aftcVar.o();
            afvnVarU.close();
        } catch (Throwable th2) {
            afvnVarU.close();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        View actionView;
        super.onCreateOptionsMenu(menu);
        get getVarE = e();
        getVarE.bh.getMenuInflater().inflate(R.menu.main_menu, menu);
        getVarE.i(menu, R.id.history_menu_item, arqz.ic);
        getVarE.i(menu, R.id.offline_settings_menu_item, arqz.hF);
        MenuItem menuItemFindItem = menu.findItem(R.id.action_search);
        if (menuItemFindItem != null) {
            ((inn) getVarE.az.io()).a(menuItemFindItem);
            if (!getVarE.bX.l(1, 45715026L, false) || !"FEmusic_library_landing".equals(((jki) getVarE.af.io()).e())) {
                ((abxv) getVarE.bf.io()).L("music-contextual-search-button");
            } else if (menuItemFindItem.isVisible() && (actionView = menuItemFindItem.getActionView()) != null) {
                ((abxv) getVarE.bf.io()).J("music-contextual-search-button", actionView);
            }
        }
        return true;
    }

    @Override // defpackage.qe, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        afvn afvnVarV = this.b.v();
        try {
            super.onCreatePanelMenu(i, menu);
            afvnVarV.close();
            return true;
        } catch (Throwable th) {
            try {
                afvnVarV.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [avmn, java.lang.Object] */
    @Override // defpackage.gea, defpackage.fx, defpackage.cf, android.app.Activity
    protected final void onDestroy() {
        afvn afvnVarD = this.b.d();
        try {
            super.onDestroy();
            get getVarE = e();
            rpy rpyVar = (rpy) getVarE.aK.io();
            rpyVar.h.a.remove(rpyVar);
            ((jjn) getVarE.Y.io()).e();
            tto ttoVar = ((tth) getVarE.G.io()).i;
            ttoVar.removeMessages(0);
            ttoVar.g = true;
            ((hkc) getVarE.aA.io()).d.b();
            aunn aunnVar = getVarE.O;
            ((tbt) aunnVar.io()).l(getVarE.ad.io());
            tqj tqjVar = getVarE.bi;
            int i = tqr.a;
            if (!tqjVar.k(1073830336)) {
                ((abea) getVarE.ac.io()).i();
            }
            aunn aunnVar2 = getVarE.ax;
            icq icqVar = (icq) aunnVar2.io();
            icqVar.c.b();
            icqVar.a.j(icqVar);
            aunn aunnVar3 = getVarE.aC;
            ((kjs) aunnVar3.io()).g((jlf) aunnVar2.io());
            ((kjs) aunnVar3.io()).g((jlf) getVarE.aF.io());
            ((kjs) aunnVar3.io()).g((jlf) getVarE.aG.io());
            if (!((jnm) getVarE.H.io()).C()) {
                ((kjs) aunnVar3.io()).g(getVarE.w);
            }
            ((awku) ((hfn) getVarE.aE.io()).a).kn();
            trf trfVar = (trf) getVarE.aH.io();
            ?? r5 = trfVar.c;
            if (r5 != 0 && !r5.f()) {
                awka.f((AtomicReference) trfVar.c);
            }
            trfVar.c = null;
            trfVar.b = null;
            ((suo) getVarE.aW.io()).h();
            ilw ilwVar = (ilw) getVarE.aO.io();
            ilwVar.c.P(ilwVar);
            ((hke) ilwVar.d.io()).a.remove(ilwVar);
            ilwVar.g.b();
            ((vqs) getVarE.bo.io()).b();
            avmn avmnVar = getVarE.z;
            if (avmnVar != null && !avmnVar.f()) {
                awka.f((AtomicReference) getVarE.z);
            }
            ((awku) ((hfn) getVarE.aL.io()).a).kn();
            ((tbt) aunnVar.io()).l(getVarE.ag.io());
            ((tbt) aunnVar.io()).l(getVarE.bb);
            ((vmy) getVarE.bx.io()).a();
            joz jozVar = getVarE.r;
            if (jozVar != null) {
                jozVar.k.i();
                Object obj = jozVar.av;
                if (obj != null) {
                    awka.f((AtomicReference) obj);
                }
                ((abuz) jozVar.aa.io()).a = null;
            }
            ((heg) getVarE.bm.io()).a = null;
            ((abfp) getVarE.bw.io()).onStop(getVarE.bh);
            getVarE.t.dispose();
            ((tpw) getVarE.bu.io()).b();
            ((abxv) getVarE.bf.io()).L("music-contextual-search-button");
            getVarE.f.P(getVarE.x);
            this.f = true;
            afvnVarD.close();
        } catch (Throwable th) {
            try {
                afvnVarD.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fx, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        WatchFragment watchFragment;
        get getVarE = e();
        if (((xzm) getVarE.br.io()).c(i) || ((watchFragment = getVarE.g) != null && watchFragment.z.onKeyDown(i, keyEvent))) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        InputMethodManager inputMethodManager;
        get getVarE = e();
        if (((ilx) getVarE.aP.io()).b || (((inputMethodManager = (InputMethodManager) getVarE.bh.getSystemService("input_method")) != null && inputMethodManager.isAcceptingText()) || i != 62)) {
            WatchFragment watchFragment = getVarE.g;
            if (watchFragment == null || !watchFragment.z.onKeyUp(i, keyEvent)) {
                return super.onKeyUp(i, keyEvent);
            }
        } else {
            aunn aunnVar = getVarE.bS;
            if (((abvk) aunnVar.io()).X()) {
                ((abvk) aunnVar.io()).ap(false, 19);
            } else {
                ((abvk) aunnVar.io()).A();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        afvn afvnVarW = this.b.w();
        try {
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            afvnVarW.close();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            try {
                afvnVarW.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cf, android.app.Activity
    protected final void onPause() {
        afvn afvnVarF = this.b.f();
        try {
            get getVarE = e();
            getVarE.D = false;
            aunn aunnVar = getVarE.O;
            ((tbt) aunnVar.io()).l(getVarE);
            getVarE.s.b();
            abmc abmcVar = (abmc) getVarE.aT.io();
            abmcVar.a.b();
            abmcVar.a();
            ((tbt) aunnVar.io()).l(getVarE.bE.io());
            ((tbt) aunnVar.io()).l(getVarE.bF.io());
            ((tbt) aunnVar.io()).l(getVarE.aZ.io());
            ((tbt) aunnVar.io()).l(getVarE.bL.io());
            ((tbt) aunnVar.io()).l(getVarE.W.io());
            ((tbt) aunnVar.io()).l(getVarE.aR.io());
            ((abbd) getVarE.N.io()).d();
            super.onPause();
            ((hkz) getVarE.bT.io()).c();
            hcy hcyVar = (hcy) getVarE.ap.io();
            hcyVar.b(false);
            hcyVar.a();
            hwh hwhVar = (hwh) getVarE.ar.io();
            if (hwhVar.a) {
                hwhVar.b.d(hwhVar);
                hwhVar.c.z(hwhVar);
                hwhVar.a = false;
            }
            ((xop) getVarE.bk.io()).d();
            ilw ilwVar = (ilw) getVarE.aO.io();
            agrx agrxVar = agso.a;
            ((ilx) ilwVar.f.io()).a(false);
            avmn avmnVar = getVarE.A;
            if (avmnVar != null && !((avmm) avmnVar).b) {
                getVarE.A.dispose();
            }
            if (Build.VERSION.SDK_INT >= 28 && !getVarE.f.ad()) {
                aunn aunnVar2 = getVarE.Z;
                if (((jjb) aunnVar2.io()).f()) {
                    ((jjb) aunnVar2.io()).a(false);
                }
            }
            afvnVarF.close();
        } catch (Throwable th) {
            try {
                afvnVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.qe, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        afvn afvnVarX = this.b.x();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            afvnVarX.close();
        } catch (Throwable th) {
            try {
                afvnVarX.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fx, android.app.Activity
    protected final void onPostCreate(Bundle bundle) {
        afvn afvnVarY = this.b.y();
        try {
            super.onPostCreate(bundle);
            get getVarE = e();
            if (bundle != null) {
                getVarE.p = bundle.getBoolean("has_handled_intent", false);
                getVarE.q = bundle.getBoolean("has_run_init_home_once", false);
            }
            getVarE.K.execute(afwl.i(new iqc((iqd) getVarE.aV.io(), 0)));
            huz huzVar = (huz) getVarE.ah.io();
            if (huzVar.h.o(huzVar.g.d()) == 0 && huzVar.e.g()) {
                ((agrc) ((agrc) huz.a.b()).k("com/google/android/apps/youtube/music/offline/sync/implementation/MusicPlaylistSyncLogger", "logSyncSettings", 89, "MusicPlaylistSyncLogger.java")).t("SmartDownload Enabled But No AutoOfflineTask");
            }
            hmf hmfVar = (hmf) getVarE.bD.io();
            zwa zwaVarE = ((zwb) getVarE.P.io()).e();
            vxz vxzVar = hmfVar.d;
            if (vxzVar.m(25, 45672018L)) {
                hmfVar.a(62, 28, true, zwaVarE);
            }
            if (vxzVar.m(26, 45672047L)) {
                hmfVar.a(557, 28, true, zwaVarE);
            }
            hmfVar.a(62, 28, false, zwaVarE);
            hmfVar.a(557, 28, false, zwaVarE);
            hmfVar.a(318, 24, false, zwaVarE);
            hmfVar.a(318, 17, false, zwaVarE);
            afvnVarY.close();
        } catch (Throwable th) {
            try {
                afvnVarY.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fx, defpackage.cf, android.app.Activity
    protected final void onPostResume() {
        afvn afvnVarG = this.b.g();
        try {
            super.onPostResume();
            afvnVarG.close();
        } catch (Throwable th) {
            try {
                afvnVarG.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        afvn afvnVarH = afty.h();
        try {
            boolean zOnPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
            afvnVarH.close();
            return zOnPrepareOptionsMenu;
        } catch (Throwable th) {
            try {
                afvnVarH.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cf, defpackage.qe, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        afvn afvnVarN = this.b.n("onRequestPermissionsResult", null);
        try {
            get getVarE = e();
            super.onRequestPermissionsResult(i, strArr, iArr);
            ((jkx) getVarE.as.io()).c(i, strArr, iArr);
            if (i == 106) {
                kyr kyrVar = (kyr) getVarE.bI.io();
                iArr.getClass();
                for (int i2 : iArr) {
                    if (i2 == -1) {
                        ((Activity) kyrVar.b).finish();
                    }
                }
                kyrVar.D();
                ((Activity) kyrVar.b).finish();
            }
            afvnVarN.close();
        } catch (Throwable th) {
            try {
                afvnVarN.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        afvn afvnVarH = this.b.h();
        try {
            super.onRestart();
            afvnVarH.close();
        } catch (Throwable th) {
            try {
                afvnVarH.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Object, rmu] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, rmu] */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.cf, android.app.Activity
    protected final void onResume() {
        afvn afvnVarI = this.b.i();
        try {
            super.onResume();
            get getVarE = e();
            aunn aunnVar = getVarE.ai;
            rrq rrqVar = (rrq) aunnVar.io();
            int i = 18;
            if (rrqVar.a.u()) {
                rrqVar.f.execute(afwl.i(new mbo(rrqVar, 18)));
            }
            int i2 = 1;
            if (((rrq) aunnVar.io()).b()) {
                rrq rrqVar2 = (rrq) aunnVar.io();
                if (rrqVar2.b()) {
                    ?? r4 = rrqVar2.a;
                    rlt rltVar = (rlt) r4.e();
                    String str = rltVar.a;
                    String str2 = rltVar.b;
                    ((wnw) rrqVar2.d).a(r4.e(), rlt.b(str2), new gml(str, (sxu) new vgi(rrqVar2, 1), 7), str2, 6);
                }
            }
            ((abuz) getVarE.J.io()).a = null;
            aunn aunnVar2 = getVarE.O;
            ((tbt) aunnVar2.io()).f(getVarE);
            ((tbt) aunnVar2.io()).f(getVarE.bE.io());
            ((tbt) aunnVar2.io()).f(getVarE.bF.io());
            ((tbt) aunnVar2.io()).f(getVarE.aZ.io());
            ((hkz) getVarE.bT.io()).b();
            avmm avmmVar = getVarE.s;
            final hws hwsVar = ((igw) getVarE.bB.io()).w;
            aunn aunnVar3 = getVarE.X;
            abvn abvnVar = (abvn) aunnVar3.io();
            avlh avlhVarP = abvnVar.P();
            avmb avmbVar = ((igw) hwsVar.a).u;
            int i3 = 0;
            avmmVar.e(avlhVarP.L(avmbVar).al(new avni() { // from class: igv
                @Override // defpackage.avni
                public final void a(Object obj) {
                    wgi wgiVar;
                    aayw aaywVar = (aayw) obj;
                    abnw abnwVar = aaywVar.b;
                    boolean zB = abnwVar.b(abnw.d);
                    hws hwsVar2 = hwsVar;
                    if (zB) {
                        if (aaywVar.c != null) {
                            igw igwVar = (igw) hwsVar2.a;
                            if (((abvk) igwVar.e.io()).U()) {
                                if (igwVar.o) {
                                    ((WatchWhileLayout) igwVar.p.io()).K();
                                }
                                aunn aunnVar4 = igwVar.p;
                                if (!((WatchWhileLayout) aunnVar4.io()).bz) {
                                    ((WatchWhileLayout) aunnVar4.io()).N();
                                    ((xgn) igwVar.r.io()).w(new xgj(xhb.b(26627)), null);
                                } else if (((WatchWhileLayout) aunnVar4.io()).Z()) {
                                    ((WatchWhileLayout) aunnVar4.io()).N();
                                }
                            }
                        }
                        igw igwVar2 = (igw) hwsVar2.a;
                        if (igwVar2.n) {
                            aunn aunnVar5 = igwVar2.p;
                            if (((WatchWhileLayout) aunnVar5.io()).Z()) {
                                igwVar2.n = false;
                                ((WatchWhileLayout) aunnVar5.io()).N();
                            }
                        }
                    }
                    if (abnwVar != abnw.e || (wgiVar = aaywVar.d) == null) {
                        return;
                    }
                    for (alzz alzzVar : wgiVar.a.g) {
                        int i4 = alzzVar.b;
                        if (i4 == 58057493) {
                            aunn aunnVar6 = ((igw) hwsVar2.a).q;
                            jin jinVar = (jin) aunnVar6.io();
                            ajam ajamVar = alzzVar.b == 58057493 ? (ajam) alzzVar.c : ajam.a;
                            ajamVar.getClass();
                            jio jioVarE = jin.e();
                            alay alayVar = ajamVar.b;
                            if (alayVar == null) {
                                alayVar = alay.a;
                            }
                            ((jik) jioVarE).k(ackj.k(null, alayVar, null, false));
                            jinVar.d(jioVarE.b());
                        } else if (i4 == 117586727) {
                            igw igwVar3 = (igw) hwsVar2.a;
                            aunn aunnVar7 = igwVar3.q;
                            jin jinVar2 = (jin) aunnVar7.io();
                            ajan ajanVar = alzzVar.b == 117586727 ? (ajan) alzzVar.c : ajan.a;
                            vxe vxeVar = (vxe) igwVar3.c.io();
                            xgn xgnVarHB = ((xgm) igwVar3.s.io()).hB();
                            ajanVar.getClass();
                            vxeVar.getClass();
                            xgnVarHB.getClass();
                            kyr kyrVar = new kyr(vxeVar, xgnVarHB, (char[]) null);
                            jio jioVarE2 = jin.e();
                            jik jikVar = (jik) jioVarE2;
                            jikVar.b = ajanVar;
                            alay alayVar2 = ajanVar.d;
                            if (alayVar2 == null) {
                                alayVar2 = alay.a;
                            }
                            jikVar.k(ackj.k(null, alayVar2, null, false));
                            if (!ajanVar.e.isEmpty() && (((ajng) ajanVar.e.get(0)).b & 1) != 0) {
                                ajnf ajnfVar = ((ajng) ajanVar.e.get(0)).c;
                                if (ajnfVar == null) {
                                    ajnfVar = ajnf.a;
                                }
                                if ((ajnfVar.b & 64) != 0) {
                                    alay alayVar3 = ajnfVar.m;
                                    if (alayVar3 == null) {
                                        alayVar3 = alay.a;
                                    }
                                    jioVarE2.l(ackj.k(null, alayVar3, null, false), new jip(kyrVar, ajnfVar, 0));
                                }
                            }
                            jikVar.a = new jiq(kyrVar, ajanVar, 0);
                            jinVar2.d(jioVarE2.b());
                        }
                    }
                }
            }, new hyx(19)), ((avlh) abvnVar.r().n).x(new hgu(19)).L(avmbVar).al(new icy(hwsVar, i), new hyx(19)));
            aunn aunnVar4 = getVarE.N;
            abbd abbdVar = (abbd) aunnVar4.io();
            abvn abvnVar2 = (abvn) aunnVar3.io();
            int i4 = 20;
            avmmVar.e(((avlh) abvnVar2.r().a).i(aawb.y(abvnVar2.X(), 32L)).i(new abwr(i2)).al(new aawl(new aawi(abbdVar, 10), "GS", 1), new jop(20)), ((avlh) abvnVar2.r().n).i(aawb.y(abvnVar2.X(), 32L)).i(new abwr(1)).al(new aawi(abbdVar, 11), new jop(20)));
            avmmVar.e(((abvn) aunnVar3.io()).P().i(new abwr(1)).al(new iho((ivu) getVarE.ao.io(), 5), new ihp(4)));
            ((tbt) aunnVar2.io()).f(getVarE.bL.io());
            ((tbt) aunnVar2.io()).f(getVarE.W.io());
            ((tbt) aunnVar2.io()).f(getVarE.aR.io());
            ((aabz) getVarE.U.io()).f();
            ((axfd) getVarE.V.io()).am(1);
            ((igr) getVarE.aS.io()).e.add(getVarE.bh);
            ((tun) getVarE.ab.io()).c();
            ((abbd) aunnVar4.io()).e();
            if (((zwb) getVarE.P.io()).u()) {
                getVarE.s();
            }
            hwh hwhVar = (hwh) getVarE.ar.io();
            if (!hwhVar.a) {
                hwhVar.a = true;
                ycp ycpVar = hwhVar.b;
                ycpVar.a(hwhVar);
                ycpVar.b(hwhVar);
                hwhVar.c.y(hwhVar);
            }
            abmc abmcVar = (abmc) getVarE.aT.io();
            avmm avmmVar2 = abmcVar.a;
            avmmVar2.b();
            abvn abvnVar3 = abmcVar.b;
            boolean zCg = abvnVar3.g().cg();
            avmn[] avmnVarArr = new avmn[3];
            int i5 = 14;
            avmnVarArr[0] = ((avlh) abvnVar3.r().a).i(aawb.y(abvnVar3.X(), 536870912L)).i(new abwr(1)).al(new aawl(new abhb(abmcVar, 18), "YTC", 1), new abeq(i5));
            avmnVarArr[1] = ((avlh) (zCg ? abvnVar3.r().t : abvnVar3.r().i)).i(aawb.y(abvnVar3.X(), 536870912L)).i(new abwr(1)).al(new aawl(new abhb(abmcVar, 19), "YTC", 2), new abeq(i5));
            avmnVarArr[2] = abvnVar3.ao().b().i(aawb.y(abvnVar3.X(), 536870912L)).i(new abwr(i3)).al(new abhb(abmcVar, i4), new abeq(i5));
            avmmVar2.e(avmnVarArr);
            hcy hcyVar = (hcy) getVarE.ap.io();
            hcyVar.b(hcyVar.c());
            hcyVar.a();
            hcyVar.c = hcyVar.a.d().O(hcyVar.b).ag(new gem(hcyVar, 8), new gfh(4));
            ((xop) getVarE.bk.io()).f();
            ilw ilwVar = (ilw) getVarE.aO.io();
            agrx agrxVar = agso.a;
            ((ilx) ilwVar.f.io()).a(ilwVar.j());
            avmn avmnVar = getVarE.A;
            if (avmnVar == null || ((avmm) avmnVar).b) {
                final gfk gfkVar = (gfk) getVarE.bl.io();
                avmm avmmVar3 = new avmm();
                avlh avlhVarF = avlh.f(gfkVar.b, gfkVar.c, new idi(1));
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                avmb avmbVar2 = awlg.b;
                avnn avnnVar = atqp.g;
                avmmVar3.e(avlhVarF.aa(300L, timeUnit, avmbVar2, false).P().L(gfkVar.d).al(new avni() { // from class: gfg
                    /* JADX WARN: Code duplicated, block: B:26:0x00fd  */
                    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, wer] */
                    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, wer] */
                    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, wer] */
                    @Override // defpackage.avni
                    public final void a(Object obj) {
                        String str3;
                        antt anttVar;
                        ajwo ajwoVar;
                        gfj gfjVar = (gfj) obj;
                        Optional optionalA = gfjVar.a.a();
                        boolean zIsEmpty = optionalA.isEmpty();
                        gfk gfkVar2 = gfkVar;
                        int i6 = 2;
                        if (zIsEmpty) {
                            wer werVarE = gfkVar2.i.c().e();
                            werVarE.j(gfk.a);
                            Optional optional = gfkVar2.e;
                            gfi gfiVar = new gfi(werVarE, 0);
                            if (true == optional.isPresent()) {
                                gfiVar.a.j(wfs.g(295, "video_".concat((String) optional.get())));
                            }
                            Optional optional2 = gfkVar2.f;
                            gfi gfiVar2 = new gfi(werVarE, i6);
                            if (true == optional2.isPresent()) {
                                gfiVar2.a.j(wfs.g(295, "playlist_".concat((String) optional2.get())));
                            }
                            Optional optional3 = gfkVar2.g;
                            gfi gfiVar3 = new gfi(werVarE, 3);
                            if (true == optional3.isPresent()) {
                                gfiVar3.a.j(wfs.g(295, "playlist_set_".concat((String) optional3.get())));
                            }
                            werVarE.b();
                            gfkVar2.e = Optional.empty();
                            gfkVar2.f = Optional.empty();
                            gfkVar2.g = Optional.empty();
                            gfkVar2.h = antt.MUSIC_PLAYBACK_STATE_UNKNOWN;
                            return;
                        }
                        wer werVarE2 = gfkVar2.i.c().e();
                        hyz hyzVar = (hyz) optionalA.get();
                        String strT = hyzVar.t();
                        String strR = hyzVar.r();
                        abnl abnlVarN = hyzVar.n();
                        if (abnlVarN == null || (ajwoVar = abnlVarN.b) == null) {
                            str3 = "NO_PLAYLIST_SET_ID";
                        } else {
                            aihl aihlVarCheckIsLite = aihn.checkIsLite(arik.a);
                            ajwoVar.c(aihlVarCheckIsLite);
                            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arik.a);
                                ajwoVar.c(aihlVarCheckIsLite2);
                                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                                str3 = ((arij) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).g;
                            } else {
                                str3 = "NO_PLAYLIST_SET_ID";
                            }
                        }
                        aazn aaznVar = gfjVar.b;
                        int i7 = 4;
                        if (aaznVar.c()) {
                            anttVar = antt.MUSIC_PLAYBACK_STATE_PLAYING;
                        } else if (aaznVar.b()) {
                            anttVar = antt.MUSIC_PLAYBACK_STATE_PAUSED;
                        } else {
                            anttVar = aaznVar.a == 4 ? antt.MUSIC_PLAYBACK_STATE_STOPPED : antt.MUSIC_PLAYBACK_STATE_UNKNOWN;
                        }
                        Optional optionalF = hyzVar instanceof hyw ? ((hyw) hyzVar).f() : Optional.empty();
                        antu antuVarE = antw.e(gfk.a);
                        antuVarE.am(anttVar);
                        aihf aihfVarCreateBuilder = anty.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        anty antyVar = (anty) aihfVarCreateBuilder.instance;
                        strT.getClass();
                        antyVar.b |= 1;
                        antyVar.c = strT;
                        aihfVarCreateBuilder.copyOnWrite();
                        anty antyVar2 = (anty) aihfVarCreateBuilder.instance;
                        strR.getClass();
                        antyVar2.b |= 2;
                        antyVar2.d = strR;
                        aihfVarCreateBuilder.copyOnWrite();
                        anty antyVar3 = (anty) aihfVarCreateBuilder.instance;
                        str3.getClass();
                        antyVar3.b |= 4;
                        antyVar3.e = str3;
                        gfi gfiVar4 = new gfi(aihfVarCreateBuilder, i7);
                        if (true == optionalF.isPresent()) {
                            Object obj2 = optionalF.get();
                            Object obj3 = gfiVar4.a;
                            float fFloatValue = ((Float) obj2).floatValue();
                            aihf aihfVar = (aihf) obj3;
                            aihfVar.copyOnWrite();
                            anty antyVar4 = (anty) aihfVar.instance;
                            antyVar4.b |= 8;
                            antyVar4.f = fFloatValue;
                        }
                        antuVarE.an(aihfVarCreateBuilder);
                        werVarE2.m(antuVarE);
                        if (strT.length() > 0 && (!strT.equals(gfkVar2.e.orElse("")) || anttVar != gfkVar2.h)) {
                            gfk.a("video_", strT, anttVar, optionalF, werVarE2);
                        }
                        if (strR.length() > 0 && (!strR.equals(gfkVar2.f.orElse("")) || anttVar != gfkVar2.h)) {
                            gfk.a("playlist_", strR, anttVar, optionalF, werVarE2);
                        }
                        if (str3.length() > 0 && (!str3.equals(gfkVar2.g.orElse("")) || anttVar != gfkVar2.h)) {
                            gfk.a("playlist_set_", str3, anttVar, optionalF, werVarE2);
                        }
                        if (gfkVar2.e.isPresent() && !((String) gfkVar2.e.get()).equals(strT)) {
                            werVarE2.j(wfs.g(295, "video_".concat((String) gfkVar2.e.get())));
                        }
                        if (gfkVar2.f.isPresent() && !((String) gfkVar2.f.get()).equals(strR)) {
                            werVarE2.j(wfs.g(295, "playlist_".concat((String) gfkVar2.f.get())));
                        }
                        if (gfkVar2.g.isPresent() && !((String) gfkVar2.g.get()).equals(str3)) {
                            werVarE2.j(wfs.g(295, "playlist_set_".concat((String) gfkVar2.g.get())));
                        }
                        werVarE2.b();
                        gfkVar2.e = Optional.of(strT);
                        gfkVar2.f = Optional.of(strR);
                        gfkVar2.g = Optional.of(str3);
                        gfkVar2.h = anttVar;
                    }
                }, new gfh(0)));
                getVarE.A = avmmVar3;
            }
            getVarE.D = true;
            getVarE.aa.post(new fsu(getVarE, 7, null));
            getVarE.v();
            iox ioxVar = (iox) getVarE.bs.io();
            ActivityManager activityManager = (ActivityManager) ioxVar.b.getSystemService("activity");
            if (activityManager == null || Build.VERSION.SDK_INT < 28 || !activityManager.isBackgroundRestricted()) {
                ListenableFuture listenableFutureA = ((qrx) ioxVar.c.io()).a(new hys(5), ioxVar.e);
                hmb hmbVar = new hmb(8);
                Executor executor = taf.a;
                Executor executorDirectExecutor = MoreExecutors.directExecutor();
                taa taaVar = new taa(taf.c, null, hmbVar);
                long j = afwl.a;
                listenableFutureA.addListener(new ahei(listenableFutureA, new afwj(afty.c(false), taaVar, 0)), executorDirectExecutor);
            } else {
                ListenableFuture listenableFutureC = ((qrx) ioxVar.c.io()).c();
                Executor executor2 = ioxVar.d;
                ijj ijjVar = new ijj(ioxVar, 2);
                hvn hvnVar = new hvn(ioxVar, 12);
                Executor executor3 = taf.a;
                taa taaVar2 = new taa(hvnVar, null, ijjVar);
                long j2 = afwl.a;
                listenableFutureC.addListener(new ahei(listenableFutureC, new afwj(afty.c(false), taaVar2, 0)), executor2);
            }
            afvnVarI.close();
        } catch (Throwable th) {
            try {
                afvnVarI.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.cf
    protected final void onResumeFragments() {
        Intent intent;
        super.onResumeFragments();
        get getVarE = e();
        MusicActivity musicActivity = getVarE.bh;
        if (jku.d(musicActivity)) {
            gec gecVar = (gec) getVarE.am.io();
            if (musicActivity instanceof gfr) {
                Iterator it = gecVar.b.iterator();
                while (it.hasNext()) {
                    ((gdx) it.next()).a();
                }
            }
            gmy gmyVar = (gmy) getVarE.L.io();
            ArrayList arrayList = new ArrayList(gmyVar.b);
            int size = arrayList.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                gmyVar.c((heh) arrayList.get(i2));
            }
            getVarE.x(getVarE.h, false);
            getVarE.h = false;
            ((igw) getVarE.bB.io()).m = getVarE.h;
            if (getVarE.p || (intent = musicActivity.getIntent()) == null) {
                return;
            }
            ListenableFuture listenableFutureB = getVarE.b(intent);
            gek gekVar = new gek(1);
            gek gekVar2 = new gek(i);
            Executor executor = taf.a;
            boc lifecycle = musicActivity.getLifecycle();
            bob bobVar = bob.b;
            taq.d();
            tac tacVar = new tac(bobVar, lifecycle, gekVar2, gekVar);
            Executor executor2 = taf.a;
            long j = afwl.a;
            listenableFutureB.addListener(new ahei(listenableFutureB, new afwj(afty.c(false), tacVar, 0)), executor2);
        }
    }

    @Override // defpackage.qe, defpackage.ee, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        afvn afvnVarZ = this.b.z();
        try {
            super.onSaveInstanceState(bundle);
            get getVarE = e();
            if (Build.VERSION.SDK_INT < 28 && !getVarE.f.ad()) {
                aunn aunnVar = getVarE.Z;
                if (((jjb) aunnVar.io()).f()) {
                    ((jjb) aunnVar.io()).a(false);
                }
            }
            hke hkeVar = (hke) getVarE.bO.io();
            bundle.putStringArrayList("root_fragment_tags", new ArrayList<>(hkeVar.b));
            bundle.putString("active_root_fragment_tag", hkeVar.c);
            bundle.putBoolean("has_handled_intent", getVarE.p);
            bundle.putBoolean("has_run_init_home_once", getVarE.q);
            afvnVarZ.close();
        } catch (Throwable th) {
            try {
                afvnVarZ.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fx, defpackage.cf, android.app.Activity
    protected final void onStart() {
        afvn afvnVarJ = this.b.j();
        try {
            get getVarE = e();
            jnm jnmVar = (jnm) getVarE.H.io();
            MusicActivity musicActivity = getVarE.bh;
            jnmVar.y(musicActivity);
            axfd axfdVar = (axfd) getVarE.I.io();
            if (musicActivity != null) {
                ((CopyOnWriteArrayList) axfdVar.e).add(new WeakReference(musicActivity));
            }
            super.onStart();
            if (!getVarE.bU.h() && !getVarE.j.aa()) {
                ((hkz) getVarE.bT.io()).a();
            }
            WatchFragment watchFragment = getVarE.g;
            if (watchFragment != null) {
                watchFragment.z.T((tth) getVarE.G.io());
            }
            ((xru) getVarE.S.io()).L();
            joz jozVar = getVarE.r;
            if (jozVar != null) {
                jozVar.p();
            }
            ((xkw) getVarE.aN.io()).onStart(musicActivity);
            aunn aunnVar = getVarE.aU;
            xrn xrnVar = (xrn) aunnVar.io();
            int i = 5;
            xhc[] xhcVarArr = {xhb.a(6827), xhb.a(3832), xhb.a(44098), xhb.a(44099), xhb.a(63349)};
            musicActivity.getClass();
            xrnVar.j = musicActivity;
            xrnVar.k = Arrays.asList(xhcVarArr);
            xrn xrnVar2 = (xrn) aunnVar.io();
            dij.b(xrnVar2.b).p((did) xrnVar2.d.io(), xrnVar2.e, 4);
            vxz vxzVar = xrnVar2.u;
            if (vxzVar.l(SemanticState.Hidden, 45837986L, false)) {
                xrnVar2.n.a(xrnVar2.t.e.O(xrnVar2.i).ag(new xbo(xrnVar2, 17), new vqe(20)));
            } else {
                avmn avmnVar = xrnVar2.m;
                if (avmnVar != null && avmnVar.f()) {
                    xrnVar2.f(xrnVar2.t, xrnVar2.i);
                }
            }
            if (xrnVar2.e()) {
                avmm avmmVar = xrnVar2.r;
                awmd awmdVar = xrnVar2.h;
                awku awkuVar = ((xun) awmdVar.io()).c;
                avmb avmbVar = xrnVar2.i;
                avmmVar.c(awkuVar.L(avmbVar).ak(new xbo(xrnVar2, 15)));
                if (vxzVar.l(164, 45673420L, false)) {
                    avmmVar.c(((xun) awmdVar.io()).g.p().L(avmbVar).ak(new xbo(xrnVar2, 16)));
                }
                ((xun) awmdVar.io()).a();
            }
            xrnVar2.c();
            xmw xmwVar = (xmw) getVarE.bj.io();
            avmr avmrVar = xmwVar.i;
            ydu yduVar = (ydu) xmwVar.g.io();
            avmrVar.a(yduVar.f.K(new vvb(yduVar, i)).af(new vub(xmwVar, 18)));
            ((dij) xmwVar.b.io()).p((did) xmwVar.c.io(), xmwVar.j, 4);
            xmwVar.k = new xmu(xmwVar);
            ycp ycpVar = (ycp) xmwVar.e.io();
            xzf xzfVar = xmwVar.k;
            xzfVar.getClass();
            ycpVar.a(xzfVar);
            ((heg) getVarE.bm.io()).a = (vxe) getVarE.bM.io();
            iee ieeVar = (iee) getVarE.aY.io();
            long epochMilli = ieeVar.c.f().toEpochMilli();
            ((agrc) ((agrc) iee.a.c().i(agso.a, "QueueResumptionEligible")).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueResumptionEligibilityMonitor", "onActivityStart", 153, "QueueResumptionEligibilityMonitor.java")).v("Activity started at %d", epochMilli);
            ieeVar.e.set(epochMilli);
            if (getVarE.v.get()) {
                ((agrc) ((agrc) get.a.c()).k("com/google/android/apps/youtube/music/activities/MusicActivityPeer", "onStart", 1426, "MusicActivityPeer.java")).t("onStart: browse already rendered, immediately restoring queue.");
                getVarE.r();
            } else {
                getVarE.aa.postDelayed(new fsu(getVarE, 6, null), get.b.toMillis());
            }
            getVarE.c = true;
            ((afwv) getVarE.bQ.io()).b = musicActivity;
            if (getVarE.bY.l(42, 45383916L, false)) {
                ((gfu) getVarE.bq.io()).onStart(musicActivity);
            }
            ((gfv) getVarE.bt.io()).onStart(musicActivity);
            afvnVarJ.close();
        } catch (Throwable th) {
            try {
                afvnVarJ.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, rtb] */
    @Override // defpackage.fx, defpackage.cf, android.app.Activity
    protected final void onStop() {
        gzg gzgVar;
        afvn afvnVarK = this.b.k();
        try {
            get getVarE = e();
            int i = tqr.a;
            tqj tqjVar = getVarE.bi;
            if (!tqjVar.k(1073807731)) {
                ((tbt) getVarE.O.io()).e(new had());
            }
            if (tqjVar.k(1073807732)) {
                getVarE.bA.f(tau.ACTION_ABANDONED);
            }
            jnm jnmVar = (jnm) getVarE.H.io();
            MusicActivity musicActivity = getVarE.bh;
            jnmVar.z(musicActivity);
            axfd axfdVar = (axfd) getVarE.I.io();
            if (musicActivity != null) {
                Object obj = axfdVar.e;
                for (WeakReference weakReference : (CopyOnWriteArrayList) obj) {
                    if (weakReference != null && ((gzgVar = (gzg) weakReference.get()) == null || musicActivity.equals(gzgVar))) {
                        ((CopyOnWriteArrayList) obj).remove(weakReference);
                    }
                }
            }
            ((xru) getVarE.S.io()).M();
            xrn xrnVar = (xrn) getVarE.aU.io();
            xrnVar.d();
            dij.b(xrnVar.b).q(xrnVar.e);
            xrnVar.c.l(xrnVar);
            if (xrnVar.e()) {
                ((xun) xrnVar.h.io()).b();
                xrnVar.r.b();
            }
            ((xkw) getVarE.aN.io()).onStop(musicActivity);
            xmw xmwVar = (xmw) getVarE.bj.io();
            ((dij) xmwVar.b.io()).q(xmwVar.j);
            xmwVar.i.a(null);
            if (xmwVar.k != null) {
                ycp ycpVar = (ycp) xmwVar.e.io();
                xzf xzfVar = xmwVar.k;
                xzfVar.getClass();
                ycpVar.d(xzfVar);
                xmwVar.k = null;
            }
            if (getVarE.bY.l(42, 45383916L, false)) {
                ((gfu) getVarE.bq.io()).onStop(musicActivity);
            }
            ((gfv) getVarE.bt.io()).onStop(musicActivity);
            super.onStop();
            joz jozVar = getVarE.r;
            if (jozVar != null) {
                ((ycp) jozVar.h.io()).d(jozVar);
                jozVar.p.bK.remove(jozVar);
                jozVar.R.a();
                jqo jqoVar = jozVar.n;
                if (jqoVar != null) {
                    jqoVar.o.b();
                    aunn aunnVar = jqoVar.b;
                    ((abjp) aunnVar.io()).b.n(jqoVar);
                    ((abjp) aunnVar.io()).t(jqoVar);
                    jqoVar.k.m(jqoVar.p);
                    jqoVar.l.m(jqoVar.q);
                    awka.f((AtomicReference) jqoVar.m.i);
                }
                jol jolVar = jozVar.k;
                jolVar.f.b();
                ((jng) jolVar.n.io()).c = null;
                ((abea) jolVar.b.io()).j(jolVar);
                ((abjp) jolVar.D.io()).t(jolVar);
                jolVar.j.l(jolVar);
                hxj hxjVar = jozVar.m;
                if (hxjVar != null) {
                    hxjVar.b();
                }
                gev gevVar = (gev) jozVar.Y.io();
                Iterator it = gevVar.b.iterator();
                while (it.hasNext()) {
                    ((rtc) it.next()).b(gevVar.a);
                }
                abuz abuzVar = (abuz) jozVar.aa.io();
                Object obj2 = abuzVar.a;
                if (obj2 != null) {
                    Object obj3 = abuzVar.b;
                    if (((rya) obj3).a.g() && !Objects.equals(((rya) obj3).a.c(), obj2)) {
                        rmp rmpVar = ((rya) obj3).b;
                        rmp.n(null, "Received mismatching unregistration request for companionApi");
                    }
                    ((rya) obj3).a = agdf.a;
                }
                Iterator it2 = ((omj) jozVar.Z.io()).a.iterator();
                while (it2.hasNext()) {
                    ((sbb) it2.next()).a = null;
                }
                hbq hbqVar = (hbq) jozVar.ac.io();
                hbqVar.e.w.i(hbqVar);
                hbqVar.d = null;
                jozVar.c.b();
                if (hxjVar != null && !jozVar.aw.l(81, 45739191L, false)) {
                    ((tbt) jozVar.d.io()).l(hxjVar.j);
                }
                jozVar.ae.b();
                ((hfk) jozVar.J.io()).d();
                jny jnyVar = jozVar.S;
                jnyVar.j.b();
                jnyVar.o = null;
                jozVar.l.f();
                ((abjp) jozVar.K.io()).t(jozVar);
                ((axfd) jozVar.f.io()).ak(jozVar);
                jozVar.ak.y(jozVar);
                YouTubeTextView youTubeTextView = jozVar.q;
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = jozVar.ag;
                if (onGlobalLayoutListener != null) {
                    youTubeTextView.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
                }
                jozVar.ag = null;
                ((vqs) jozVar.W.io()).b();
                jozVar.v(null);
            }
            ((tth) getVarE.G.io()).g(1);
            ((igr) getVarE.aS.io()).e.remove(musicActivity);
            afwv afwvVar = (afwv) getVarE.bQ.io();
            if (afwvVar.b == musicActivity) {
                afwvVar.b = null;
            }
            iee ieeVar = (iee) getVarE.aY.io();
            long epochMilli = ieeVar.c.f().toEpochMilli();
            ((agrc) ((agrc) iee.a.c().i(agso.a, "QueueResumptionEligible")).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueResumptionEligibilityMonitor", "onActivityStop", 146, "QueueResumptionEligibilityMonitor.java")).v("Activity stopped at %d", epochMilli);
            ieeVar.d.set(epochMilli);
            getVarE.u.set(false);
            afvnVarK.close();
        } catch (Throwable th) {
            try {
                afvnVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fx
    public final boolean onSupportNavigateUp() {
        afvn afvnVarL = this.b.l();
        try {
            boolean zOnSupportNavigateUp = super.onSupportNavigateUp();
            afvnVarL.close();
            return zOnSupportNavigateUp;
        } catch (Throwable th) {
            try {
                afvnVarL.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onUserInteraction() {
        afvn afvnVarM = this.b.m();
        try {
            get getVarE = e();
            ((tun) getVarE.ab.io()).c();
            super.onUserInteraction();
            afvnVarM.close();
        } catch (Throwable th) {
            try {
                afvnVarM.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        String str;
        super.onWindowFocusChanged(z);
        get getVarE = e();
        WatchFragment watchFragment = getVarE.g;
        if (watchFragment != null) {
            abvk abvkVar = (abvk) watchFragment.P.io();
            int i = z ? 3 : 1;
            aave aaveVar = abvkVar.h.f;
            int i2 = aave.d;
            if (i != aaveVar.c) {
                abmw abmwVar = abmw.AUDIOMANAGER;
                if (i != 1) {
                    str = i != 2 ? "FULL" : "PIP";
                } else {
                    str = "NONE";
                }
                abmx.a(abmwVar, "AudioFocus WindowFocusChanged, windowFocusType=".concat(str));
            }
            aaveVar.c = i;
            if (aaveVar.a && aaveVar.d()) {
                aaveVar.c(false);
                abvk abvkVar2 = aaveVar.b.o;
                if (abvkVar2 != null) {
                    abmx.a(abmw.AUDIOMANAGER, "AudioFocus WindowFocusChanged, causing play");
                    abvkVar2.Q();
                }
            }
        }
        tth tthVar = (tth) getVarE.G.io();
        if (z) {
            tthVar.f(tthVar.k);
        }
    }

    @Override // defpackage.sxp
    protected final void p(Intent intent) {
        e().m(intent);
    }

    @Override // defpackage.igq
    public final void q() {
        ((grj) e().av.io()).f();
    }

    @Override // defpackage.gfo
    public final void r() {
        get getVarE = e();
        aunn aunnVar = getVarE.bS;
        if (((abvk) aunnVar.io()).X()) {
            ((abvk) aunnVar.io()).aq(true, 23);
        }
        getVarE.j.z();
        getVarE.cc.n();
        vxe vxeVar = (vxe) getVarE.bM.io();
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihl aihlVar = ajth.b;
        aihf aihfVarCreateBuilder = ajth.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ajth ajthVar = (ajth) aihfVarCreateBuilder.instance;
        ajthVar.d = 2;
        ajthVar.e = Boolean.TRUE;
        aihhVar.e(aihlVar, (ajth) aihfVarCreateBuilder.build());
        vxeVar.a((ajwo) aihhVar.build());
        if (!getVarE.f.ad()) {
            getVarE.c();
        }
        getVarE.x(true, true);
        ((gfp) getVarE.bR.io()).d(vxh.a(((jnj) getVarE.Q.io()).g()));
        aunn aunnVar2 = getVarE.at;
        if (((xeu) aunnVar2.io()).b) {
            xeu xeuVar = (xeu) aunnVar2.io();
            aihf aihfVarCreateBuilder2 = antn.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            antn antnVar = (antn) aihfVarCreateBuilder2.instance;
            antnVar.c = 3;
            antnVar.b |= 1;
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder2, alot.MUSIC_PERSISTENT_CACHE_CLEARED);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        aihf aihfVarCreateBuilder3 = antn.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        antn antnVar2 = (antn) aihfVarCreateBuilder3.instance;
        antnVar2.c = 3;
        antnVar2.b |= 1;
        antn antnVar3 = (antn) aihfVarCreateBuilder3.build();
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        antnVar3.getClass();
        alouVar.d = antnVar3;
        alouVar.c = 155;
        ((xeu) aunnVar2.io()).b((alou) alosVar.build());
    }

    @Override // defpackage.igy
    public final void s(ajwo ajwoVar, hxb hxbVar) {
        get getVarE = e();
        getVarE.f();
        ((igw) getVarE.bB.io()).s(ajwoVar, hxbVar);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        aguu.at(intent, getApplicationContext());
        super.startActivity(intent);
    }

    public final void t(Intent intent) {
        super.p(intent);
    }

    @Override // defpackage.hex
    public final void u() {
        get getVarE = e();
        if (jku.c(getVarE.bh)) {
            getVarE.x(true, false);
        }
    }

    @Override // defpackage.gzh
    public final void v(zwa zwaVar) {
        e();
    }

    @Override // defpackage.gzh
    public final void w(zwa zwaVar, jnm jnmVar) {
        get getVarE = e();
        if (zwaVar.equals(((zwb) getVarE.P.io()).e())) {
            getVarE.y();
        }
    }

    @Override // defpackage.gzg
    public final void x(axfd axfdVar) {
        yco ycoVar;
        get getVarE = e();
        if (axfdVar.as() || (ycoVar = ((ycp) getVarE.bN.io()).e) == null || !ycoVar.am()) {
            return;
        }
        ycoVar.J();
        ((hzk) getVarE.bL.io()).a();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        aguu.at(intent, getApplicationContext());
        super.startActivity(intent, bundle);
    }

    @Override // defpackage.fx
    protected final void onLocalesChanged(awq awqVar) {
    }

    @Override // defpackage.fx
    protected final void onNightModeChanged(int i) {
    }
}

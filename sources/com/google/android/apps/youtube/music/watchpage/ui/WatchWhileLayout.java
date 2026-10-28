package com.google.android.apps.youtube.music.watchpage.ui;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.engagementpanel.WatchEngagementPanelResizeInputSource;
import com.google.android.apps.youtube.music.watch.WatchFragment;
import com.google.android.apps.youtube.music.watchpage.ui.PlayerBottomSheet;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import defpackage.afxw;
import defpackage.agkz;
import defpackage.agrc;
import defpackage.agrf;
import defpackage.agrx;
import defpackage.agso;
import defpackage.aihv;
import defpackage.aihw;
import defpackage.aihx;
import defpackage.akua;
import defpackage.akuj;
import defpackage.ameb;
import defpackage.asv;
import defpackage.aunn;
import defpackage.avlh;
import defpackage.avmb;
import defpackage.awku;
import defpackage.awkx;
import defpackage.bac;
import defpackage.bnn;
import defpackage.dfy;
import defpackage.dov;
import defpackage.ebs;
import defpackage.get;
import defpackage.gga;
import defpackage.hbp;
import defpackage.hhb;
import defpackage.hkl;
import defpackage.hwc;
import defpackage.hww;
import defpackage.hxg;
import defpackage.ibh;
import defpackage.ilw;
import defpackage.iqc;
import defpackage.iug;
import defpackage.ixe;
import defpackage.jhl;
import defpackage.jnj;
import defpackage.job;
import defpackage.jol;
import defpackage.jpb;
import defpackage.jpc;
import defpackage.jpg;
import defpackage.jph;
import defpackage.jpi;
import defpackage.jpk;
import defpackage.jpl;
import defpackage.jpo;
import defpackage.jpr;
import defpackage.jps;
import defpackage.jpt;
import defpackage.jpx;
import defpackage.jpy;
import defpackage.kjc;
import defpackage.kro;
import defpackage.ttg;
import defpackage.tth;
import defpackage.tuk;
import defpackage.twb;
import defpackage.tym;
import defpackage.vor;
import defpackage.vqi;
import defpackage.vwt;
import defpackage.vxz;
import defpackage.xgj;
import defpackage.xgn;
import defpackage.xhb;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class WatchWhileLayout extends jpg {
    private static final agrf ca = agrf.h("com/google/android/apps/youtube/music/watchpage/ui/WatchWhileLayout");
    final int A;
    final int B;
    public final int C;
    final int D;
    final int E;
    final int F;
    final int G;
    final int H;
    final int I;
    final int J;
    final int K;
    final int L;
    final int M;
    final int N;
    final int O;
    final int P;
    final int Q;
    final int R;
    public final int S;
    final int T;
    final int U;
    final int V;
    final int W;
    public View aA;
    public ViewGroup aB;
    public View aC;
    public View aD;
    public CardView aE;
    public View aF;
    public View aG;
    public View aH;
    public View aI;
    public PlayerPageBehavior aJ;
    public PlayerPageBehavior aK;
    public final int aL;
    final int aM;
    public final int aN;
    final int aO;
    final int aP;
    final int aQ;
    final int aR;
    final int aS;
    final int aT;
    public final int aU;
    final int aV;
    public float aW;
    public float aX;
    public final int aY;
    public final int aZ;
    final int aa;
    final int ab;
    final int ac;
    View ad;
    public PlayerBottomSheet ae;
    public View af;
    View ag;
    public View ah;
    public View ai;
    View aj;
    public View ak;
    View al;
    public ViewGroup am;
    public View an;
    ViewGroup ao;
    public View ap;
    public View aq;
    public View ar;
    public View as;
    public View at;
    public View au;
    public View av;
    public View aw;
    public View ax;
    public View ay;
    public View az;
    boolean bA;
    public boolean bB;
    public boolean bC;
    public ibh bD;
    public hww bE;
    public float bF;
    public akuj bG;
    public Optional bH;
    public int bI;
    public int bJ;
    public final List bK;
    public final View.OnLayoutChangeListener bL;
    public boolean bM;
    public boolean bN;
    public jpy bO;
    public final ValueAnimator bP;
    public final awkx bQ;
    public final awkx bR;
    public final awkx bS;
    public final awkx bT;
    public vxz bU;
    public vxz bV;
    public jnj bW;
    public kjc bX;
    public vwt bY;
    public hhb bZ;
    public final int ba;
    public final int bb;
    public final int bc;
    public final int bd;
    public final int be;
    public final int bf;
    public final int bg;
    public final int bh;
    public final int bi;
    public int bj;
    public int bk;
    public int bl;
    public int bm;
    public final int bn;
    public final int bo;
    public final int bp;
    public final int bq;
    public final int br;
    public final int bs;
    public int bt;
    public int bu;
    public hww bv;
    public boolean bw;
    public boolean bx;
    public hww by;
    public boolean bz;
    private ImageView cb;
    private ImageView cc;
    private View cd;
    private final ObjectAnimator ce;
    private final awku cf;
    public jol j;
    public awku k;
    public aunn l;
    public avmb m;
    public aunn n;
    public aunn o;
    public aunn p;
    public aunn q;
    final int r;
    final int s;
    final int t;
    final int u;
    final int v;
    final int w;
    final int x;
    final int y;
    final int z;

    public WatchWhileLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.by = null;
        this.bD = ibh.ATV_PREFERRED;
        this.bE = hww.a;
        this.bF = 1.0f;
        this.bG = null;
        this.bH = Optional.empty();
        this.bI = 0;
        this.bJ = 0;
        this.bK = new CopyOnWriteArrayList();
        this.bL = new hbp((Object) this, 2);
        this.bM = false;
        this.bN = false;
        this.bP = new ValueAnimator();
        this.ce = new ObjectAnimator();
        this.bQ = new awkx();
        this.bR = new awkx();
        this.bS = new awkx();
        this.bT = new awkx();
        this.cf = new awku();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jpl.b);
        this.r = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.s = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.t = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.u = typedArrayObtainStyledAttributes.getResourceId(6, 0);
        this.v = typedArrayObtainStyledAttributes.getResourceId(13, 0);
        this.w = typedArrayObtainStyledAttributes.getResourceId(16, 0);
        this.x = typedArrayObtainStyledAttributes.getResourceId(17, 0);
        this.y = typedArrayObtainStyledAttributes.getResourceId(18, 0);
        this.z = typedArrayObtainStyledAttributes.getResourceId(19, 0);
        this.C = typedArrayObtainStyledAttributes.getResourceId(24, 0);
        this.A = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.B = typedArrayObtainStyledAttributes.getResourceId(23, 0);
        this.D = typedArrayObtainStyledAttributes.getResourceId(25, 0);
        this.E = typedArrayObtainStyledAttributes.getResourceId(27, 0);
        this.F = typedArrayObtainStyledAttributes.getResourceId(28, 0);
        this.S = typedArrayObtainStyledAttributes.getResourceId(53, 0);
        this.R = typedArrayObtainStyledAttributes.getResourceId(52, 0);
        this.G = typedArrayObtainStyledAttributes.getResourceId(31, 0);
        this.H = typedArrayObtainStyledAttributes.getResourceId(35, 0);
        this.I = typedArrayObtainStyledAttributes.getResourceId(39, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        this.K = typedArrayObtainStyledAttributes.getResourceId(41, 0);
        this.L = typedArrayObtainStyledAttributes.getResourceId(42, 0);
        this.M = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(46, 0);
        this.O = typedArrayObtainStyledAttributes.getResourceId(49, 0);
        this.P = typedArrayObtainStyledAttributes.getResourceId(50, 0);
        this.Q = typedArrayObtainStyledAttributes.getResourceId(51, 0);
        this.T = typedArrayObtainStyledAttributes.getResourceId(57, 0);
        this.U = typedArrayObtainStyledAttributes.getResourceId(60, 0);
        this.ab = typedArrayObtainStyledAttributes.getResourceId(65, 0);
        this.ac = typedArrayObtainStyledAttributes.getResourceId(70, 0);
        this.aL = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.aM = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.aN = typedArrayObtainStyledAttributes.getDimensionPixelSize(26, 0);
        this.aO = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, 0);
        this.aP = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
        this.aQ = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        this.aR = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0);
        this.aS = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.aT = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        this.aU = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
        this.aV = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, 0);
        this.aY = typedArrayObtainStyledAttributes.getDimensionPixelSize(32, 0);
        this.aZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(33, 0);
        this.ba = typedArrayObtainStyledAttributes.getDimensionPixelSize(34, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(43, 0);
        this.bc = typedArrayObtainStyledAttributes.getDimensionPixelSize(44, 0);
        this.bb = typedArrayObtainStyledAttributes.getDimensionPixelSize(29, 0);
        this.bd = typedArrayObtainStyledAttributes.getDimensionPixelSize(58, 0);
        this.be = typedArrayObtainStyledAttributes.getDimensionPixelSize(59, 0);
        this.V = typedArrayObtainStyledAttributes.getResourceId(61, 0);
        this.W = typedArrayObtainStyledAttributes.getResourceId(62, 0);
        this.aa = typedArrayObtainStyledAttributes.getResourceId(63, 0);
        this.bf = typedArrayObtainStyledAttributes.getDimensionPixelSize(66, 0);
        this.bg = typedArrayObtainStyledAttributes.getDimensionPixelSize(67, 0);
        this.bh = typedArrayObtainStyledAttributes.getDimensionPixelSize(68, 0);
        this.bi = typedArrayObtainStyledAttributes.getDimensionPixelSize(69, 0);
        this.bn = typedArrayObtainStyledAttributes.getDimensionPixelSize(71, 0);
        this.bp = typedArrayObtainStyledAttributes.getDimensionPixelSize(73, 0);
        this.bo = typedArrayObtainStyledAttributes.getDimensionPixelSize(72, 0);
        this.bq = typedArrayObtainStyledAttributes.getDimensionPixelSize(74, 0);
        this.br = typedArrayObtainStyledAttributes.getDimensionPixelSize(47, 0);
        this.bs = typedArrayObtainStyledAttributes.getDimensionPixelSize(48, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void am(boolean z) {
        if (this.at == null || this.aJ == null) {
            return;
        }
        ObjectAnimator objectAnimator = this.ce;
        if (objectAnimator.isRunning()) {
            objectAnimator.cancel();
        }
        if (z) {
            objectAnimator.setFloatValues(0.0f, this.aJ.u());
        } else if (this.at.getVisibility() == 0) {
            return;
        } else {
            objectAnimator.setFloatValues(this.aJ.u(), 0.0f);
        }
        objectAnimator.removeAllListeners();
        objectAnimator.addListener(new jpt(this, z));
        objectAnimator.start();
    }

    private final void an() {
        View view = this.ai;
        jpx jpxVar = new jpx(this);
        bac.s(view);
        view.setAccessibilityDelegate(jpxVar.getBridge());
    }

    private final void ao() {
        this.aB.setImportantForAccessibility(1);
        this.aC.setImportantForAccessibility(1);
        this.ar.setImportantForAccessibility(1);
    }

    private final void ap() {
        hww hwwVar;
        if (ak()) {
            if (this.bE.b(hww.e) || (this.bU.l(105, 45795183L, false) && this.bE.a())) {
                this.bE = hww.c;
            }
        } else if (av() && this.aJ.d && this.bE.b(hww.c) && !ai()) {
            this.bE = hww.f;
        }
        switch (this.bE.ordinal()) {
            case 0:
            case 1:
            case 4:
            case 5:
                this.bF = 1.0f;
            case 2:
            case 7:
                this.bF = 0.0f;
                return;
            case 3:
            case 6:
                this.bF = q();
                return;
            case 8:
                hwwVar = hww.b;
                break;
            case 9:
            case 10:
                this.bE = hww.c;
                this.bF = 0.0f;
                return;
            case 11:
                hwwVar = hww.a;
                break;
            default:
                return;
        }
        this.bE = hwwVar;
        this.bF = 1.0f;
    }

    private final void aq() {
        kro.L(this.ai, this.ad, this.cb, this.cd, this.aj, this.al);
        int visibility = this.aD.getVisibility();
        View view = this.aC;
        if (visibility == 0) {
            kro.L(view, this.aD, this.ar);
        } else {
            kro.L(view, this.ar);
        }
    }

    private final void ar(int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.ai.getLayoutParams();
        if (marginLayoutParams != null) {
            marginLayoutParams.height = i;
            marginLayoutParams.setMarginStart(i2);
            marginLayoutParams.setMarginEnd(i2);
            marginLayoutParams.bottomMargin = i3;
            this.ai.setLayoutParams(marginLayoutParams);
        }
    }

    private final void as() {
        this.bS.kk(new Rect(getLeft(), getTop(), getRight(), getBottom()));
        this.bT.kk(new Rect(getLeft(), getTop() + x(), getRight(), getBottom() - this.bu));
    }

    private final void at(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view = this.ap;
        if (view == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        marginLayoutParams.setMarginStart(i);
        this.ap.setLayoutParams(marginLayoutParams);
    }

    private final boolean au(akua... akuaVarArr) {
        akuj akujVar = this.bG;
        if (akujVar == null) {
            return false;
        }
        aihv aihvVar = akujVar.r;
        aihw aihwVar = akuj.a;
        if (new aihx(aihvVar, aihwVar).isEmpty()) {
            return false;
        }
        for (akua akuaVar : akuaVarArr) {
            if (!new aihx(this.bG.r, aihwVar).contains(akuaVar)) {
                return false;
            }
        }
        return true;
    }

    private final boolean av() {
        return this.bU.l(105, 45795183L, false) || this.bU.l(132, 45845054L, false);
    }

    public final void A() {
        if (this.bW.s()) {
            O(hww.d);
        } else {
            O(hww.c);
        }
    }

    public final void B(boolean z) {
        View view = this.at;
        if (view != null) {
            if (!z) {
                view.setVisibility(8);
                G();
            } else if (!this.bU.l(19, 45649951L, false)) {
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.abc_slide_out_bottom);
                animationLoadAnimation.setAnimationListener(new dfy(this, 6));
                if (!this.bN) {
                    this.at.startAnimation(animationLoadAnimation);
                }
            } else if (this.at.getVisibility() == 8) {
                return;
            } else {
                am(true);
            }
            hhb hhbVar = this.bZ;
            if (hhbVar != null) {
                hhbVar.o();
            }
        }
    }

    public final void C() {
        if (Z() || af()) {
            L(false);
        }
    }

    public final void D() {
        if (Z()) {
            return;
        }
        if (this.bU.l(105, 45795183L, false) && this.bE.b(hww.k, hww.g)) {
            ((vor) this.l.io()).u(true);
        }
        N();
    }

    public final void E() {
        this.ad = findViewById(this.r);
        this.ae = (PlayerBottomSheet) findViewById(this.H);
        this.af = findViewById(this.s);
        this.cb = (ImageView) findViewById(this.u);
        this.ai = findViewById(this.w);
        this.aj = findViewById(this.x);
        this.ak = findViewById(this.y);
        this.al = findViewById(this.z);
        this.am = (ViewGroup) findViewById(this.A);
        this.an = findViewById(this.B);
        this.ao = (ViewGroup) findViewById(this.D);
        this.ap = findViewById(this.E);
        this.cc = (ImageView) findViewById(this.F);
        this.az = findViewById(this.R);
        this.ar = findViewById(this.G);
        this.as = findViewById(this.I);
        this.at = findViewById(this.L);
        this.au = findViewById(this.M);
        this.av = findViewById(this.N);
        this.aw = findViewById(this.O);
        this.ax = findViewById(this.J);
        this.ay = findViewById(this.K);
        this.aA = findViewById(this.P);
        this.ah = findViewById(this.v);
        this.aB = (ViewGroup) findViewById(this.Q);
        this.aC = findViewById(this.T);
        this.aD = findViewById(this.U);
        this.cd = findViewById(this.ac);
        this.aE = (CardView) findViewById(this.ab);
        this.aF = findViewById(this.V);
        this.aG = findViewById(this.W);
        this.aH = findViewById(this.aa);
        ObjectAnimator objectAnimator = this.ce;
        objectAnimator.setTarget(this.at);
        objectAnimator.setPropertyName("translationY");
        objectAnimator.setDuration(300L);
        objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        ValueAnimator valueAnimator = this.bP;
        valueAnimator.setDuration(300L);
        valueAnimator.setInterpolator(new bnn());
        valueAnimator.addUpdateListener(new gga(this, 2));
        an();
        aq();
        if (this.bU.l(118, 45823962L, false)) {
            ViewGroup viewGroup = this.am;
            if (viewGroup != null) {
                viewGroup.setClipToPadding(false);
                this.am.setClipChildren(false);
            }
            ViewGroup viewGroup2 = this.ao;
            if (viewGroup2 != null) {
                viewGroup2.setClipChildren(false);
            }
            this.aI = ((ViewStub) findViewById(R.id.mini_player_scrim_stub)).inflate();
        }
        PlayerPageBehavior playerPageBehavior = (PlayerPageBehavior) BottomSheetBehavior.x(this.at);
        this.aJ = playerPageBehavior;
        playerPageBehavior.I(5);
        this.ai.setVisibility(0);
        int i = 8;
        if (aj()) {
            this.as.setVisibility(8);
        }
        this.aJ.n = true;
        if (this.bW.s()) {
            this.ay.setVisibility(0);
            this.aJ.s();
            this.aJ.q(this.ay, true);
            this.ay.setClickable(true);
            if (this.bU.l(105, 45795183L, false)) {
                WatchEngagementPanelResizeInputSource watchEngagementPanelResizeInputSource = (WatchEngagementPanelResizeInputSource) this.q.io();
                ViewGroup.LayoutParams layoutParams = this.ay.getLayoutParams();
                if (layoutParams instanceof asv) {
                    ((asv) layoutParams).b(watchEngagementPanelResizeInputSource);
                }
            }
        }
        this.aJ.q(this.aE, true);
        this.aJ.q(this.af, true);
        this.aJ.q(this.aD, true);
        this.aJ.q(this.aB, true);
        this.aJ.q(this.ae, false);
        PlayerPageBehavior playerPageBehavior2 = this.aJ;
        playerPageBehavior2.c = new jpk() { // from class: jpq
            @Override // defpackage.jpk
            public final boolean a(boolean z) {
                switch (this.a.bE.ordinal()) {
                    case 0:
                    case 1:
                    case 8:
                    case 11:
                        return false;
                    case 2:
                        return z;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 9:
                    case 10:
                        return true;
                    default:
                        throw new RuntimeException(null, null);
                }
            }
        };
        playerPageBehavior2.y(new jpr(this));
        hxg hxgVar = new hxg(this, i);
        this.at.setOnClickListener(hxgVar);
        this.ak.setOnClickListener(hxgVar);
        this.cc.setOnClickListener(new hxg(this, 9));
        int i2 = 11;
        if (this.bU.l(95, 45762151L, false)) {
            this.bY.D(new iug(this, i2));
        }
        ((vor) this.l.io()).w.h(new vqi() { // from class: jpp
            @Override // defpackage.vqi
            public final void a(vob vobVar) {
                ViewGroup viewGroup3;
                int iIndexOfChild;
                PlayerBottomSheet playerBottomSheet;
                akuj akujVar;
                int iAV;
                vob vobVarC;
                WatchWhileLayout watchWhileLayout = this.a;
                watchWhileLayout.aJ.d = vobVar != null;
                watchWhileLayout.S();
                if (vobVar == null) {
                    if (watchWhileLayout.bU.l(132, 45845054L, false) && watchWhileLayout.ak() && (playerBottomSheet = watchWhileLayout.ae) != null) {
                        playerBottomSheet.e(1.0f);
                    }
                    View view = watchWhileLayout.aG;
                    if (view != null) {
                        view.setVisibility(8);
                        watchWhileLayout.aG.setOnClickListener(null);
                        watchWhileLayout.aG.setClickable(false);
                        watchWhileLayout.aG.setFocusable(false);
                    }
                    View view2 = watchWhileLayout.aF;
                    if (view2 != null) {
                        watchWhileLayout.aJ.r(view2);
                    }
                    if (watchWhileLayout.bW.r() && !watchWhileLayout.aa()) {
                        watchWhileLayout.O(hww.c);
                    }
                    if (watchWhileLayout.bW.s()) {
                        watchWhileLayout.U();
                    } else {
                        View view3 = watchWhileLayout.aH;
                        if (view3 != null) {
                            ViewParent parent = view3.getParent();
                            if ((parent instanceof ViewGroup) && (iIndexOfChild = (viewGroup3 = (ViewGroup) parent).indexOfChild(watchWhileLayout.aH)) > 0) {
                                viewGroup3.removeViewAt(iIndexOfChild);
                                viewGroup3.addView(watchWhileLayout.aH, 0);
                            }
                        }
                    }
                    if (watchWhileLayout.bU.l(105, 45795183L, false)) {
                        watchWhileLayout.bI = 0;
                        watchWhileLayout.by = null;
                    }
                    watchWhileLayout.F();
                    return;
                }
                akuj akujVarU = vobVar.u();
                if (akujVarU == null && watchWhileLayout.bU.l(105, 45795183L, false)) {
                    String str = (String) ((vor) watchWhileLayout.l.io()).i().f();
                    akujVarU = (str == null || (vobVarC = ((vor) watchWhileLayout.l.io()).c(str)) == null) ? null : vobVarC.u();
                }
                watchWhileLayout.bG = akujVarU;
                watchWhileLayout.Q();
                if (watchWhileLayout.ah()) {
                    if (!watchWhileLayout.aa()) {
                        watchWhileLayout.O(hww.c);
                    }
                } else if (watchWhileLayout.bU.l(105, 45795183L, false) && watchWhileLayout.ad() && watchWhileLayout.X()) {
                    watchWhileLayout.by = watchWhileLayout.bE;
                    watchWhileLayout.I(hww.g, watchWhileLayout.q());
                    watchWhileLayout.aK.I(4);
                }
                View view4 = watchWhileLayout.aF;
                if (view4 != null) {
                    watchWhileLayout.aJ.q(view4, false);
                }
                if (watchWhileLayout.aG != null) {
                    if (!watchWhileLayout.bV.l(164, 45673420L, false) || (akujVar = watchWhileLayout.bG) == null || (iAV = a.aV(akujVar.n)) == 0 || iAV != 3) {
                        watchWhileLayout.aG.setVisibility(8);
                        watchWhileLayout.aG.setOnClickListener(null);
                        watchWhileLayout.aG.setClickable(false);
                        watchWhileLayout.aG.setFocusable(false);
                    } else {
                        watchWhileLayout.aG.setVisibility(0);
                        watchWhileLayout.aG.setClickable(true);
                        watchWhileLayout.aG.setFocusable(true);
                        aktz aktzVarS = vobVar.s();
                        if (aktzVarS == aktz.ENGAGEMENT_PANEL_OUTSIDE_SCRIM_TAP_BEHAVIOR_POP || aktzVarS == aktz.ENGAGEMENT_PANEL_OUTSIDE_SCRIM_TAP_BEHAVIOR_POP_STACK) {
                            watchWhileLayout.aG.setOnClickListener(new jip(watchWhileLayout, aktzVarS, 6));
                        } else {
                            watchWhileLayout.aG.setOnClickListener(null);
                        }
                    }
                }
                View view5 = watchWhileLayout.aH;
                if (view5 != null) {
                    view5.bringToFront();
                }
                watchWhileLayout.F();
            }
        });
        this.bY.D(new ebs(this, i));
        PlayerPageBehavior playerPageBehavior3 = (PlayerPageBehavior) BottomSheetBehavior.x(this.ae);
        this.aK = playerPageBehavior3;
        playerPageBehavior3.I(4);
        this.aK.G(true != this.bW.s() ? 0.999f : 0.42f);
        this.aK.n = true;
        if (this.bW.s()) {
            this.aK.s();
            this.aK.q(this.ay, true);
        }
        this.aK.q(this.ae.c(), false);
        PlayerPageBehavior playerPageBehavior4 = this.aK;
        playerPageBehavior4.c = new jpo();
        playerPageBehavior4.y(new jps(this));
        this.ae.setOnClickListener(new hxg(this, 7));
        V();
        post(new iqc(this, i2));
    }

    public final void F() {
        this.at.setImportantForAccessibility(true != this.bE.b(hww.f) ? 1 : 2);
        this.aB.setImportantForAccessibility(4);
        this.ag.setImportantForAccessibility(4);
        this.aC.setImportantForAccessibility(4);
        this.ar.setImportantForAccessibility(4);
        this.ah.setImportantForAccessibility(4);
        this.ae.setImportantForAccessibility(4);
        this.aD.setImportantForAccessibility(4);
        this.af.setImportantForAccessibility(4);
        if (this.bW.s()) {
            this.ay.setImportantForAccessibility(4);
        }
        switch (this.bE.ordinal()) {
            case 0:
            case 1:
            case 11:
                this.aB.setImportantForAccessibility(1);
                this.ag.setImportantForAccessibility(1);
                break;
            case 2:
            case 8:
                if (!this.aJ.d || (this.bU.l(132, 45845054L, false) && ak())) {
                    ao();
                    this.ah.setImportantForAccessibility(1);
                    if (!this.aJ.d) {
                        this.ae.setImportantForAccessibility(1);
                    }
                    this.aD.setImportantForAccessibility(1);
                    this.af.setImportantForAccessibility(1);
                } else {
                    this.aB.setImportantForAccessibility(1);
                }
                aq();
                break;
            case 3:
            case 6:
                ao();
                if (!this.aJ.d) {
                    this.ae.setImportantForAccessibility(1);
                }
                this.af.setImportantForAccessibility(4);
                aq();
                break;
            case 4:
            case 9:
                this.aB.setImportantForAccessibility(1);
                this.ae.setImportantForAccessibility(1);
                break;
            case 5:
            case 10:
                this.aB.setImportantForAccessibility(1);
                break;
        }
    }

    public final void G() {
        post(new iqc(this, 10));
    }

    public final void H() {
        this.j.m(0);
    }

    public final void I(hww hwwVar, float f) {
        ViewGroup viewGroup;
        if (!this.bO.a().contains(hwwVar)) {
            V();
            if (ak()) {
                O(hww.c);
                return;
            }
            if (!aa() && (!hwwVar.b(hww.i) || f != 1.0f)) {
                if (hwwVar.b(hww.c)) {
                    ((xgn) this.p.io()).o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(54318)), null);
                }
                agkz agkzVarA = this.bO.a();
                hww hwwVar2 = hww.h;
                if (agkzVarA.contains(hwwVar2)) {
                    O(hwwVar2);
                    return;
                }
                return;
            }
            if (this.bA && aa() && hwwVar.b(hww.c, hww.f, hww.g)) {
                O(hww.b);
                return;
            } else {
                if (aa() && hwwVar.b(hww.h)) {
                    O(hww.c);
                    return;
                }
                return;
            }
        }
        this.bA = false;
        this.bz = true;
        this.bE = hwwVar;
        this.bF = f;
        if (this.bU.l(118, 45823962L, false)) {
            boolean zB = hwwVar.b(hww.b, hww.i, hww.l);
            View view = this.ai;
            if (zB) {
                int i = this.aR;
                int i2 = this.aQ;
                view.setPaddingRelative(i, i2, this.aS, i2);
                at(0);
                ar(this.aP, this.aT, this.aU);
                this.am.setPaddingRelative(i, 0, 0, 0);
            } else {
                view.setPaddingRelative(0, 0, 0, 0);
                int i3 = this.aV;
                at(i3);
                ar(this.aO, 0, 0);
                this.am.setPaddingRelative(i3, 0, 0, 0);
            }
        }
        PlayerBottomSheet playerBottomSheet = this.ae;
        if (playerBottomSheet != null) {
            playerBottomSheet.f = hwwVar;
            if (playerBottomSheet.f.b(hww.j, hww.e, hww.d) || playerBottomSheet.h()) {
                tuk.l(playerBottomSheet.c(), true);
                playerBottomSheet.c.x(playerBottomSheet.getContext().getColor(R.color.ytm_text_color_secondary_translucent), playerBottomSheet.getContext().getColor(R.color.ytm_color_white));
            } else {
                tuk.l(playerBottomSheet.c(), false);
                playerBottomSheet.c.x(playerBottomSheet.getContext().getColor(R.color.ytm_text_color_secondary_translucent), playerBottomSheet.getContext().getColor(R.color.ytm_text_color_secondary_translucent));
            }
        }
        hww hwwVar3 = this.bE;
        hww hwwVar4 = hww.h;
        if (!hwwVar3.b(hwwVar4)) {
            T();
            this.bO.p(f);
            this.bO.o();
            this.bO.n();
        }
        F();
        View view2 = this.cd;
        if (view2 != null && view2.isAttachedToWindow() && this.bE.b(hww.c)) {
            View view3 = this.cd;
            int i4 = bac.a;
            view3.performAccessibilityAction(64, null);
            if (!this.cd.isInTouchMode()) {
                this.cd.performAccessibilityAction(1, null);
            }
        }
        U();
        S();
        if (this.bZ != null) {
            switch (this.bE.ordinal()) {
                case 0:
                    this.bZ.n();
                    break;
                case 1:
                    get getVar = (get) this.bZ.a;
                    getVar.z();
                    getVar.t(hww.b);
                    getVar.bd.c(0.0f);
                    aunn aunnVar = getVar.G;
                    ((tth) aunnVar.io()).e();
                    ((tth) aunnVar.io()).g(1);
                    ilw ilwVar = (ilw) getVar.aO.io();
                    agrx agrxVar = agso.a;
                    ilwVar.j();
                    if (ilwVar.j() && !((WatchWhileLayout) ilwVar.e.io()).ab()) {
                        ilwVar.i();
                        ilwVar.h();
                    }
                    hkl hklVar = getVar.bV;
                    hklVar.i();
                    hklVar.j();
                    getVar.o();
                    getVar.e.f();
                    getVar.v();
                    break;
                case 2:
                    this.bZ.p(hww.c);
                    break;
                case 3:
                    hhb hhbVar = this.bZ;
                    WatchFragment watchFragment = ((get) hhbVar.a).g;
                    if (watchFragment != null) {
                        watchFragment.h(f);
                    }
                    hhbVar.p(hww.d);
                    break;
                case 4:
                    get getVar2 = (get) this.bZ.a;
                    getVar2.t(hww.e);
                    getVar2.bd.c(1.0f);
                    ((dov) getVar2.aM.io()).v();
                    aunn aunnVar2 = getVar2.G;
                    ((tth) aunnVar2.io()).e();
                    ((tth) aunnVar2.io()).g(1);
                    getVar2.o();
                    break;
                case 5:
                    get getVar3 = (get) this.bZ.a;
                    getVar3.t(hww.f);
                    ((dov) getVar3.aM.io()).v();
                    aunn aunnVar3 = getVar3.G;
                    ((tth) aunnVar3.io()).e();
                    ((tth) aunnVar3.io()).g(1);
                    break;
                case 6:
                    get getVar4 = (get) this.bZ.a;
                    WatchFragment watchFragment2 = getVar4.g;
                    if (watchFragment2 != null) {
                        watchFragment2.h(f);
                    }
                    getVar4.t(hww.g);
                    break;
                case 7:
                    get getVar5 = (get) this.bZ.a;
                    if (getVar5.j.ae()) {
                        ((tth) getVar5.G.io()).f(ttg.IMMERSIVE);
                        getVar5.z();
                        getVar5.h();
                        getVar5.p();
                        WatchWhileLayout watchWhileLayout = getVar5.j;
                        int i5 = twb.a;
                        watchWhileLayout.sendAccessibilityEvent(32);
                    }
                    getVar5.t(hwwVar4);
                    getVar5.bV.a();
                    getVar5.o();
                    break;
                case 8:
                    float f2 = 1.0f - f;
                    get getVar6 = (get) this.bZ.a;
                    getVar6.t(hww.i);
                    getVar6.bd.c(f2);
                    hkl hklVar2 = getVar6.bV;
                    TabLayout tabLayout = hklVar2.g;
                    if (tabLayout != null) {
                        tabLayout.setTranslationY(tabLayout.getHeight() * f2);
                    }
                    hklVar2.j();
                    aunn aunnVar4 = getVar6.bC;
                    ViewGroup viewGroup2 = ((jhl) aunnVar4.io()).d;
                    if (viewGroup2 != null) {
                        viewGroup2.setTranslationY(f2 * viewGroup2.getHeight());
                    }
                    jhl jhlVar = (jhl) aunnVar4.io();
                    if (jhlVar.b.q() && (viewGroup = jhlVar.d) != null) {
                        viewGroup.setVisibility(0);
                    }
                    getVar6.o();
                    break;
                case 9:
                    get getVar7 = (get) this.bZ.a;
                    WatchFragment watchFragment3 = getVar7.g;
                    if (watchFragment3 != null) {
                        watchFragment3.h(f);
                    }
                    getVar7.t(hww.j);
                    break;
                case 10:
                    get getVar8 = (get) this.bZ.a;
                    WatchFragment watchFragment4 = getVar8.g;
                    if (watchFragment4 != null) {
                        watchFragment4.h(f);
                    }
                    getVar8.t(hww.k);
                    break;
                case 11:
                    ((get) this.bZ.a).t(hww.l);
                    break;
            }
        }
        hww hwwVar5 = hww.b;
        hww hwwVar6 = hww.e;
        hww hwwVar7 = hww.f;
        boolean zB2 = hwwVar.b(hww.a, hwwVar5, hwwVar6, hwwVar7);
        ViewGroup viewGroup3 = this.aB;
        if (zB2) {
            kro.F(viewGroup3, -1, this.ai.getMeasuredHeight() + ((this.bU.l(118, 45823962L, false) && hwwVar.b(hwwVar5, hww.i, hww.l)) ? this.aU : 0));
        } else {
            kro.F(viewGroup3, -1, -2);
        }
        this.ak.setClickable(this.bW.p() ? hwwVar.b(hwwVar5, hwwVar6, hwwVar7) : hwwVar.b(hwwVar5, hwwVar6));
        G();
    }

    public final void J(float f) {
        if (this.bU.l(85, 45746502L, false)) {
            this.cf.kk(Float.valueOf(f));
        }
    }

    public final void K() {
        O(ak() ? hww.c : hww.e);
    }

    public final void L(boolean z) {
        if (!ac()) {
            this.bA = true;
        }
        if (this.bW.s() && Y()) {
            this.bH = Optional.of(4);
        }
        if (z && this.aJ.d) {
            ((vor) this.l.io()).u(true);
        }
        O(hww.c);
    }

    public final void M() {
        if (ad()) {
            return;
        }
        if (!ak()) {
            agkz agkzVarA = this.bO.a();
            hww hwwVar = hww.d;
            if (agkzVarA.contains(hwwVar)) {
                this.bH = Optional.of(6);
                O(hwwVar);
                return;
            }
        }
        O(hww.c);
    }

    public final void N() {
        if (this.bA) {
            return;
        }
        O(hww.b);
    }

    public final void O(hww hwwVar) {
        if (!this.bw || this.bO == null) {
            this.bv = hwwVar;
            return;
        }
        if (hwwVar.b(hww.h)) {
            I(hwwVar, 0.0f);
            kro.F(this.at, -1, -1);
            kro.F(this.aE, -1, -1);
            kro.G(this.aE, 0, 0);
            this.aE.b(0.0f);
        } else if (!aa() || !hwwVar.b(hww.c)) {
            hww hwwVar2 = hww.f;
            if (hwwVar.b(hwwVar2)) {
                I(hwwVar2, 1.0f);
            } else {
                hww hwwVar3 = hww.c;
                if (hwwVar.b(hwwVar3) && this.bE.a() && ai()) {
                    I(hwwVar3, 0.0f);
                }
            }
        } else if (!this.aJ.d || ((this.bU.l(132, 45845054L, false) && ak()) || ah())) {
            I(hwwVar, 0.0f);
        } else {
            I(hww.f, 1.0f);
        }
        Integer num = (Integer) this.bO.i().get(hwwVar);
        if (num != null) {
            this.aJ.I(num.intValue());
        }
        Integer num2 = (Integer) this.bO.h().get(hwwVar);
        if (num2 != null) {
            this.aK.I(num2.intValue());
        }
    }

    public final void P(boolean z) {
        if (this.at != null) {
            if (this.bU.l(19, 45649951L, false) && z) {
                am(false);
                return;
            }
            if (this.bN) {
                this.bM = true;
            }
            this.at.setVisibility(0);
            G();
            hhb hhbVar = this.bZ;
            if (hhbVar != null) {
                get getVar = (get) hhbVar.a;
                getVar.o();
                getVar.l.setVisibility(0);
                ilw ilwVar = (ilw) getVar.aO.io();
                agrx agrxVar = agso.a;
                ilwVar.j();
                if (ilwVar.j()) {
                    ilwVar.f();
                }
            }
        }
    }

    public final void Q() {
        this.bR.kk(Integer.valueOf(u()));
        this.bQ.kk(Integer.valueOf(s()));
    }

    public final void R() {
        an();
        View view = this.ak;
        int i = true != this.bC ? 0 : 2;
        int i2 = bac.a;
        view.setImportantForAccessibility(i);
    }

    public final void S() {
        if (this.bW.s()) {
            boolean z = this.bE.b(hww.d, hww.c, hww.j) && !this.aJ.d;
            if (z != this.aK.b.containsKey(this.ay)) {
                PlayerPageBehavior[] playerPageBehaviorArr = {this.aK, this.aJ};
                for (int i = 0; i < 2; i++) {
                    PlayerPageBehavior playerPageBehavior = playerPageBehaviorArr[i];
                    View view = this.ay;
                    if (z) {
                        playerPageBehavior.q(view, true);
                    } else {
                        playerPageBehavior.r(view);
                    }
                }
            }
        }
    }

    public final void T() {
        int i;
        if (this.bE.b(hww.f)) {
            this.ai.setVisibility(0);
            this.aA.setVisibility(4);
        }
        if (this.bE.b(hww.k)) {
            this.ai.setVisibility(0);
            this.aA.setVisibility(0);
            return;
        }
        switch (this.aJ.F) {
            case 1:
            case 2:
            case 6:
                this.ai.setVisibility(0);
                this.aA.setVisibility(0);
                if (!aj()) {
                    this.as.setVisibility(4);
                }
                break;
            case 3:
                if (ak() || (i = this.aK.F) == 4) {
                    this.ai.setVisibility(4);
                    this.aA.setVisibility(0);
                } else if (i == 3) {
                    this.ai.setVisibility(0);
                    this.aA.setVisibility(4);
                } else {
                    View view = this.ai;
                    if (i == 6) {
                        view.setVisibility(4);
                        this.aA.setVisibility(0);
                    } else {
                        view.setVisibility(0);
                        this.aA.setVisibility(0);
                    }
                }
                if (!aj()) {
                    this.as.setVisibility(0);
                }
                break;
            case 4:
            case 5:
                this.ai.setVisibility(0);
                this.aA.setVisibility(4);
                if (!aj()) {
                    this.as.setVisibility(4);
                }
                break;
        }
    }

    public final void U() {
        View view;
        boolean zS = this.bW.s();
        boolean zL = this.bU.l(95, 45762151L, false);
        boolean z = this.aJ.d;
        if (zS || zL) {
            this.ay.bringToFront();
            this.aE.bringToFront();
            this.az.bringToFront();
            this.aw.bringToFront();
            this.av.bringToFront();
            this.ax.bringToFront();
            this.ae.bringToFront();
            if (((this.bE.b(hww.b, hww.l, hww.f) || (this.bE.b(hww.i) && this.bF > 0.5f)) && this.bU.l(118, 45823962L, false)) || this.bE.b(hww.h)) {
                this.aE.bringToFront();
            }
            if (!z || (view = this.aH) == null) {
                return;
            }
            view.bringToFront();
        }
    }

    public final void V() {
        if (this.ai != null) {
            Point pointM = kjc.m((Activity) this.bX.a);
            if (pointM.y < 480 || pointM.x >= 600) {
                Point pointL = this.bX.l();
                if (pointL.y < 600 || pointL.x >= 840) {
                    boolean zAk = ak();
                    jpy jpyVar = this.bO;
                    if (zAk) {
                        if (jpyVar instanceof jpi) {
                            return;
                        } else {
                            this.bO = new jpi(this, this.bU);
                        }
                    } else if (jpyVar instanceof jpc) {
                        return;
                    } else {
                        this.bO = new jpc(this, this.bU);
                    }
                } else if (this.bO instanceof jph) {
                    return;
                } else {
                    this.bO = new jph(this, this.bU);
                }
            } else if (this.bO instanceof jpb) {
                return;
            } else {
                this.bO = new jpb(this, this.bU);
            }
            this.bO.k();
        }
    }

    public final boolean W() {
        return this.bE.b(hww.f);
    }

    public final boolean X() {
        jpy jpyVar;
        return this.bW.s() && (jpyVar = this.bO) != null && jpyVar.q() && au(akua.ENGAGEMENT_PANEL_SNAP_STATE_BELOW_THE_PLAYER, akua.ENGAGEMENT_PANEL_SNAP_STATE_BELOW_THE_MINI_PLAYER);
    }

    public final boolean Y() {
        return this.bE.b(hww.e);
    }

    public final boolean Z() {
        return this.bE.b(hww.a);
    }

    public final boolean aa() {
        return this.bE.b(hww.h);
    }

    public final boolean ab() {
        return this.at.getVisibility() == 8;
    }

    public final boolean ac() {
        return this.bE.b(hww.c);
    }

    public final boolean ad() {
        return this.bE.b(hww.d);
    }

    public final boolean ae() {
        return ac() || aa();
    }

    public final boolean af() {
        return hww.c(this.bE);
    }

    public final boolean ag() {
        hww hwwVar = this.by;
        return hwwVar != null && hwwVar.b(hww.d);
    }

    public final boolean ah() {
        akuj akujVar = this.bG;
        return akujVar != null && new aihx(akujVar.r, akuj.a).size() == 1 && au(akua.ENGAGEMENT_PANEL_SNAP_STATE_BELOW_THE_PLAYER);
    }

    public final boolean ai() {
        if (ah()) {
            return true;
        }
        akuj akujVar = this.bG;
        if (akujVar != null && new aihx(akujVar.r, akuj.a).size() == 1 && au(akua.ENGAGEMENT_PANEL_SNAP_STATE_WRAP_CONTENT)) {
            return true;
        }
        return av() && ak();
    }

    public final boolean aj() {
        return !this.bW.t() && this.bW.s();
    }

    public final boolean ak() {
        return this.bX.n();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        V();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (av()) {
            V();
            ap();
        } else {
            ap();
            V();
        }
        post(new ixe(this, 15));
        G();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.ag = findViewById(this.t);
        if (findViewById(R.id.player_page_stub) == null) {
            E();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        FrameLayout frameLayout;
        CardView cardView;
        if (aa() && (cardView = this.aE) != null) {
            kro.G(cardView, 0, 0);
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.bU.l(95, 45762151L, false) && this.aE != null && this.aA != null && this.af != null && (frameLayout = ((hwc) this.o.io()).d) != null) {
            float y = this.aE.getY();
            float height = this.aE.getHeight() + y;
            if (this.aA.getVisibility() == 0) {
                y = Math.max(y, x() + this.aA.getBottom());
            }
            int iMin = Math.min(this.aE.getMeasuredHeight(), Math.max(0, (int) ((this.af.getVisibility() == 0 ? Math.min(height, x() + this.af.getY()) : Math.min(height, x() + this.aC.getY())) - y)));
            boolean zB = this.bE.b(hww.c, hww.d, hww.j, hww.k, hww.i);
            if (true != zB) {
                iMin = -1;
            }
            kro.F(frameLayout, -1, iMin);
            kro.G(frameLayout, 0, zB ? Math.max(0, (int) (y - this.aE.getY())) : 0);
        }
        if (this.bU.l(105, 45795183L, false)) {
            float fR = 1.0f;
            if (X() && !this.bE.b(hww.i)) {
                fR = r(this.bF);
            }
            Float f = (Float) this.k.aD();
            if (f == null || f.floatValue() != fR) {
                this.k.kk(Float.valueOf(fR));
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredHeight;
        int measuredHeight2;
        asv asvVar;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.bW.m()) {
            measuredHeight = this.bJ;
        } else {
            View view = this.aq;
            measuredHeight = view == null ? 0 : view.getMeasuredHeight();
        }
        View view2 = this.aq;
        int i3 = measuredHeight + ((view2 == null || view2.getVisibility() != 0 || (marginLayoutParams = (ViewGroup.MarginLayoutParams) this.aq.getLayoutParams()) == null) ? 0 : marginLayoutParams.bottomMargin);
        View view3 = this.aI;
        if (view3 != null && (asvVar = (asv) view3.getLayoutParams()) != null && asvVar.bottomMargin != i3) {
            asvVar.bottomMargin = i3;
            this.aI.setLayoutParams(asvVar);
        }
        View view4 = this.aq;
        if (view4 == null || view4.getVisibility() != 0) {
            measuredHeight2 = 0;
        } else {
            measuredHeight2 = this.bW.m() ? this.bJ : this.aq.getMeasuredHeight();
        }
        if (measuredHeight2 == 0) {
            ((agrc) ((agrc) ca.c()).k("com/google/android/apps/youtube/music/watchpage/ui/WatchWhileLayout", "onMeasure", 1301, "WatchWhileLayout.java")).t("visiblePivotBarHeight is 0");
            measuredHeight2 = 0;
        }
        if (measuredHeight2 == 0) {
            measuredHeight2 = this.bu;
        }
        if (this.aJ != null && this.ai != null) {
            this.aJ.Q((this.bU.l(118, 45823962L, false) ? this.aP + this.aU : this.ai.getMeasuredHeight()) + i3);
        }
        PlayerPageBehavior playerPageBehavior = this.aK;
        if (playerPageBehavior != null) {
            playerPageBehavior.Q(w() + this.bu);
        }
        kro.F(this.ag, size, size2 - measuredHeight2);
        if (aa()) {
            CardView cardView = this.aE;
            if (cardView != null) {
                kro.F(cardView, size, size2);
                this.aE.b(0.0f);
            }
            J(0.0f);
            super.onMeasure(i, i2);
            as();
            return;
        }
        jpy jpyVar = this.bO;
        if (jpyVar != null) {
            jpyVar.j();
            this.bO.l(size, size2);
            this.bO.m(size2);
            this.bO.p(this.bF);
            this.bO.o();
            this.bO.n();
        }
        Q();
        super.onMeasure(i, i2);
        as();
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        G();
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        G();
    }

    public final float p(int i, int i2) {
        if (getHeight() - i2 <= 0) {
            return 0.0f;
        }
        return afxw.H((getHeight() - i) / (getHeight() - i2), 0.0f, 1.0f);
    }

    public final float q() {
        if (this.aJ.d) {
            float fP = p(s(), u());
            if (fP > 0.0f) {
                return fP;
            }
            return 0.42f;
        }
        int measuredHeight = this.at.getMeasuredHeight() - this.aK.u();
        if (measuredHeight == v()) {
            return 0.42f;
        }
        return (measuredHeight - ((int) (this.at.getMeasuredHeight() * 0.58000004f))) / (measuredHeight - v());
    }

    public final float r(float f) {
        float fQ = q();
        return tym.z((f - fQ) / (1.0f - fQ), 0.0f, 1.0f);
    }

    final int s() {
        if (this.bU.l(132, 45845054L, false) && ak()) {
            return 0;
        }
        if (ah()) {
            return (this.bk + this.bm) - x();
        }
        if (!X()) {
            return u();
        }
        return (int) ((getHeight() * 0.58000004f) - x());
    }

    public final int u() {
        if (this.ai == null) {
            return 0;
        }
        if (this.bU.l(132, 45845054L, false) && ak()) {
            return 0;
        }
        return this.bU.l(118, 45823962L, false) ? this.aO : this.ai.getMeasuredHeight();
    }

    public final int v() {
        return this.ai.getHeight() + x();
    }

    public final int w() {
        return this.ae.b.getMeasuredHeight() + this.ae.d().getMeasuredHeight() + this.aM;
    }

    public final int x() {
        if (this.bB) {
            return 0;
        }
        return this.bt;
    }

    public final avlh y() {
        return !this.bU.l(85, 45746502L, false) ? avlh.w() : this.cf.P();
    }

    public final void z() {
        if (this.bU.l(105, 45795183L, false) && this.aJ.d) {
            ((vor) this.l.io()).u(true);
        }
        this.aJ.H(true);
        O(hww.a);
        Iterator it = this.bK.iterator();
        while (it.hasNext()) {
            ((job) it.next()).c();
        }
    }
}

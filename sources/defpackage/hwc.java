package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.AppCompatImageView;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.image.AutoCropImageView;
import com.google.android.apps.youtube.music.watch.WatchFragment;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import j$.util.Optional;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hwc extends acdi implements View.OnClickListener, Animation.AnimationListener, Handler.Callback, abfz, abgw, acdg, hwi {
    public Drawable A;
    public final tvg B;
    public final abkk C;
    public final abks D;
    public final ibf E;
    public final ibe F;
    public final awku G;
    public final avlh H;
    public final acdq I;
    public final LottieAnimationView J;
    public final aunn K;
    public final jlh L;
    public final adxj M;
    public final ablt N;
    public WatchFragment O;
    public WatchFragment P;
    public final iba Q;
    public final vxz R;
    public final vxz S;
    final hwe T;
    public final heg U;
    public fg V;
    public final jnj W;
    public final vxe a;
    private final FrameLayout aA;
    private final ViewGroup aB;
    private final ViewGroup aC;
    private final jkn aD;
    private final AppCompatImageView aE;
    private final AppCompatImageView aF;
    private final YouTubeButton aG;
    private final View aH;
    private final View aI;
    private final View aJ;
    private final View aK;
    private final ProgressBar aL;
    private final View aM;
    private final View aN;
    private final Handler aO;
    private final Animation aP;
    private final Animation aQ;
    private final Animation aR;
    private final abgk aS;
    private boolean aT;
    private boolean aU;
    private boolean aV;
    private boolean aW;
    private boolean aX;
    private boolean aY;
    private long aZ;
    private abgv ad;
    private final awku ae;
    private final xgn af;
    private final abea ag;
    private final View ah;
    private final TouchImageView ai;
    private final TouchImageView aj;
    private final TextView ak;
    private final TouchImageView al;
    private final TouchImageView am;
    private final TouchImageView an;
    private final TouchImageView ao;
    private final TouchImageView ap;
    private final TouchImageView aq;
    private final TouchImageView ar;
    private final TouchImageView as;
    private final TouchImageView at;
    private final TouchImageView au;
    private final ViewGroup av;
    private final TextView aw;
    private final TextView ax;
    private final RelativeLayout ay;
    private final View az;
    public final AutoCropImageView b;
    private final aefv ba;
    private final aunn bb;
    private final awkx bc;
    private final TypedValue bd;
    private final igk be;
    private final jij bf;
    private final aerz bg;
    private final kjc bh;
    public final View c;
    public final FrameLayout d;
    public final View e;
    public final AccessibilityManager f;
    public final hwb g;
    public final int h;
    public final hwj i;
    public abgi j;
    public aony k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public hww w;
    public long x;
    public abgg y;
    public amks z;

    /* JADX WARN: Type inference failed for: r9v12, types: [awmd, java.lang.Object] */
    public hwc(Context context, xgn xgnVar, abea abeaVar, hbf hbfVar, vxe vxeVar, ibe ibeVar, jij jijVar, abkk abkkVar, heg hegVar, aefv aefvVar, igk igkVar, aunn aunnVar, aerz aerzVar, omn omnVar, hwo hwoVar, hfn hfnVar, hfn hfnVar2, awku awkuVar, acdq acdqVar, jlh jlhVar, adxj adxjVar, vxz vxzVar, vxz vxzVar2, aunn aunnVar2, kjc kjcVar, iwm iwmVar) {
        super(context);
        this.k = null;
        this.w = hww.a;
        this.I = acdqVar;
        this.L = jlhVar;
        this.M = adxjVar;
        this.R = vxzVar;
        this.S = vxzVar2;
        xgnVar.getClass();
        this.af = xgnVar;
        abeaVar.getClass();
        this.ag = abeaVar;
        this.a = vxeVar;
        this.K = aunnVar2;
        this.bh = kjcVar;
        this.aO = new Handler(this);
        TypedValue typedValue = new TypedValue();
        this.bd = typedValue;
        context.getResources().getValue(R.dimen.disabled_icon_alpha, typedValue, true);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.fade_out);
        this.aP = animationLoadAnimation;
        animationLoadAnimation.setAnimationListener(this);
        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.fade_in);
        this.aQ = animationLoadAnimation2;
        int integer = getResources().getInteger(R.integer.fade_duration_fast);
        this.h = integer;
        animationLoadAnimation2.setDuration(integer);
        Animation animationLoadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.fade_in);
        Animation animationLoadAnimation4 = AnimationUtils.loadAnimation(context, R.anim.fade_out);
        this.aR = animationLoadAnimation4;
        long integer2 = context.getResources().getInteger(R.integer.fade_overlay_fade_duration);
        animationLoadAnimation3.setDuration(integer2);
        animationLoadAnimation4.setDuration(integer2);
        animationLoadAnimation4.setAnimationListener(this);
        this.y = abgg.a;
        this.j = new abgi(abgh.a, false);
        setClipToPadding(false);
        hwb hwbVar = new hwb(this);
        this.g = hwbVar;
        LayoutInflater.from(context).inflate(R.layout.music_controls_overlay, this);
        this.F = ibeVar;
        YouTubeTextView youTubeTextView = (YouTubeTextView) findViewById(R.id.time_bar_current_time);
        YouTubeTextView youTubeTextView2 = (YouTubeTextView) findViewById(R.id.time_bar_total_time);
        this.ae = awkuVar;
        TextView textView = (TextView) findViewById(R.id.live_label);
        this.ak = textView;
        iba ibaVar = new iba(context, new tss(youTubeTextView, integer), new tss(youTubeTextView2, integer), new tss(textView, integer));
        this.Q = ibaVar;
        textView.setOnClickListener(new hxg(this, 1));
        ibf ibfVar = new ibf(ibeVar, ibaVar);
        this.E = ibfVar;
        ibeVar.j = vxzVar2;
        ibeVar.c.e(integer);
        ibeVar.d.e(integer);
        View viewFindViewById = findViewById(R.id.time_bar_reference_view);
        ibe ibeVar2 = ibfVar.f;
        View view = ibeVar2.e;
        if (viewFindViewById != view) {
            boolean zH = ibeVar2.h();
            if (view != null) {
                view.removeOnLayoutChangeListener(ibeVar2);
            }
            if (viewFindViewById != null) {
                viewFindViewById.addOnLayoutChangeListener(ibeVar2);
            }
            ibeVar2.e = viewFindViewById;
            ibeVar2.f = true;
            if (zH != ibeVar2.h()) {
                ibeVar2.requestLayout();
            }
        }
        ibfVar.a.s(hwbVar);
        this.G = new awku();
        awkx awkxVar = new awkx();
        this.bc = awkxVar;
        avlh avlhVarI = awkxVar.P().i(new abwr(2));
        iwmVar.getClass();
        this.H = avlhVarI.H(new hby(iwmVar, 3)).p().ax().kq(0);
        this.ay = (RelativeLayout) findViewById(R.id.controls_layout);
        this.aH = findViewById(R.id.music_controls_overlay_background);
        this.d = (FrameLayout) findViewById(R.id.music_controls_inner_container);
        this.e = findViewById(R.id.tooltip_anchor_view);
        this.ah = findViewById(R.id.fullscreen_button_container);
        TouchImageView touchImageView = (TouchImageView) findViewById(R.id.enter_fullscreen_button);
        this.ai = touchImageView;
        touchImageView.setOnClickListener(this);
        TouchImageView touchImageView2 = (TouchImageView) findViewById(R.id.exit_fullscreen_button);
        this.aj = touchImageView2;
        touchImageView2.setOnClickListener(this);
        this.az = findViewById(R.id.player_control_screen);
        this.aL = (ProgressBar) findViewById(R.id.player_loading_view);
        this.aJ = findViewById(R.id.overlay_queue_shuffle_button_view);
        this.aK = findViewById(R.id.overlay_queue_loop_button_view);
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.sleep_timer_button);
        this.aE = appCompatImageView;
        appCompatImageView.setOnClickListener(this);
        appCompatImageView.setContentDescription(hbfVar.d());
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) findViewById(R.id.playback_rate_button);
        this.aF = appCompatImageView2;
        if (!vxzVar2.l(44, 45682398L, false)) {
            appCompatImageView2.setOnClickListener(this);
        }
        this.aG = (YouTubeButton) findViewById(R.id.playback_rate_text_button);
        View viewFindViewById2 = findViewById(R.id.music_playback_error_root);
        this.aI = viewFindViewById2;
        hwj hwjVarL = omnVar.l(xgnVar, viewFindViewById2, this);
        this.i = hwjVarL;
        View viewFindViewById3 = findViewById(R.id.live_stream_offline_slate);
        adhv adhvVar = (adhv) hfnVar.a.io();
        adhvVar.getClass();
        viewFindViewById3.getClass();
        this.W = new jnj(adhvVar, viewFindViewById3);
        View view2 = hwjVarL.a;
        int i = bac.a;
        view2.setAccessibilityLiveRegion(1);
        this.c = findViewById(R.id.playback_controls);
        TouchImageView touchImageView3 = (TouchImageView) findViewById(R.id.player_control_play_pause_replay_button);
        this.am = touchImageView3;
        touchImageView3.setOnClickListener(this);
        adxjVar.getClass();
        this.aS = new abgk(touchImageView3, context, new agfa(adxjVar), true, true, true);
        TouchImageView touchImageView4 = (TouchImageView) findViewById(R.id.player_control_previous_button);
        this.aq = touchImageView4;
        touchImageView4.setOnClickListener(this);
        TouchImageView touchImageView5 = (TouchImageView) findViewById(R.id.player_control_rewind_button);
        this.ar = touchImageView5;
        touchImageView5.setOnClickListener(this);
        TouchImageView touchImageView6 = (TouchImageView) findViewById(R.id.player_control_seek_backward_button);
        this.as = touchImageView6;
        touchImageView6.setOnClickListener(this);
        TouchImageView touchImageView7 = (TouchImageView) findViewById(R.id.player_control_next_button);
        this.an = touchImageView7;
        touchImageView7.setOnClickListener(this);
        TouchImageView touchImageView8 = (TouchImageView) findViewById(R.id.player_control_fast_forward_button);
        this.ao = touchImageView8;
        touchImageView8.setOnClickListener(this);
        TouchImageView touchImageView9 = (TouchImageView) findViewById(R.id.player_control_seek_forward_button);
        this.ap = touchImageView9;
        touchImageView9.setOnClickListener(this);
        this.b = (AutoCropImageView) findViewById(R.id.player_thumbnail);
        this.aA = (FrameLayout) findViewById(R.id.audio_video_switch_pill_container);
        this.aB = (ViewGroup) findViewById(R.id.info_panel_overview_element_container);
        this.aC = (ViewGroup) findViewById(R.id.paid_content_overlay_element_container);
        this.J = (LottieAnimationView) findViewById(R.id.like_animation);
        TouchImageView touchImageView10 = (TouchImageView) findViewById(R.id.player_collapse_button);
        this.at = touchImageView10;
        touchImageView10.setOnClickListener(this);
        TouchImageView touchImageView11 = (TouchImageView) findViewById(R.id.hide_controls_button);
        this.au = touchImageView11;
        touchImageView11.setOnClickListener(this);
        this.aw = (TextView) findViewById(R.id.player_title);
        this.ax = (TextView) findViewById(R.id.player_artist);
        TouchImageView touchImageView12 = (TouchImageView) findViewById(R.id.player_overflow_button);
        this.al = touchImageView12;
        touchImageView12.setOnClickListener(this);
        this.av = (ViewGroup) findViewById(R.id.player_additional_view_container);
        Context context2 = getContext();
        int i2 = twb.a;
        this.f = (AccessibilityManager) context2.getSystemService("accessibility");
        this.aM = findViewById(R.id.player_bottom_shadow);
        this.aN = findViewById(R.id.player_top_shadow);
        tvg tvgVar = new tvg();
        this.B = tvgVar;
        this.U = hegVar;
        this.bf = jijVar;
        this.C = abkkVar;
        this.ba = aefvVar;
        this.be = igkVar;
        this.bb = aunnVar;
        this.bg = aerzVar;
        tvf tvfVar = new tvf(ViewConfiguration.get(getContext()));
        tvfVar.a = this;
        tvfVar.c = this;
        hwe hweVar = new hwe(this);
        this.T = hweVar;
        abks abksVar = new abks(this, hweVar, abkkVar.b);
        this.D = abksVar;
        abkkVar.g = abksVar;
        abksVar.e.addOnAttachStateChangeListener(new jld(abkkVar, 2));
        abkkVar.e = true;
        tvgVar.a.add(0, tvfVar);
        this.N = hwoVar;
        this.aD = hfnVar2.H();
        YouTubeTextView youTubeTextView3 = (YouTubeTextView) findViewById(R.id.time_bar_total_time);
        ibeVar.setAccessibilityTraversalAfter(R.id.time_bar_current_time);
        youTubeTextView3.setAccessibilityTraversalAfter(R.id.time_bar_reference_view);
        touchImageView.setAccessibilityTraversalAfter(R.id.time_bar_total_time);
        F();
        g();
    }

    private final void V() {
        if (this.aT || this.n || !this.o) {
            this.E.j(1);
        } else {
            this.E.j(2);
        }
    }

    private final boolean W() {
        return this.aW && this.I.B();
    }

    private final boolean X() {
        return this.aC.getChildCount() > 0 && (this.s || this.o) && this.y == abgg.a;
    }

    public final void A(CharSequence charSequence) {
        this.aw.setText(charSequence);
    }

    public final void B() {
        this.aV = true;
        F();
    }

    public final void C() {
        if (this.n || this.p) {
            K();
            return;
        }
        e();
        this.aT = false;
        if (!K()) {
            this.aT = true;
            return;
        }
        abgh abghVar = this.j.a;
        if (abghVar == abgh.b || abghVar == abgh.c) {
            this.E.f();
        }
        fg fgVar = this.V;
        if (fgVar != null) {
            ((tce) fgVar.b).a(new aazi(true));
        }
        j();
    }

    public final void D() {
        if (this.aT) {
            if (this.o || (!this.S.l(95, 45762151L, false) && jku.c(getContext()) && this.bh.n())) {
                C();
                RelativeLayout relativeLayout = this.ay;
                if (relativeLayout.getVisibility() == 0) {
                    relativeLayout.startAnimation(this.aQ);
                }
            }
        }
    }

    public final void E(long j) {
        if (this.ba.l()) {
            return;
        }
        this.aU = true;
        Animation animation = this.aP;
        animation.setDuration(j);
        if (!this.g.a && !this.y.C) {
            this.E.e(true);
        }
        RelativeLayout relativeLayout = this.ay;
        if (relativeLayout.getVisibility() == 0) {
            relativeLayout.startAnimation(animation);
        } else if (this.y.v && J()) {
            g();
        }
    }

    public final void F() {
        boolean z = true;
        if (!this.l && !this.aV) {
            z = false;
        }
        tuk.l(this.b, z);
    }

    public final void G() {
        vxz vxzVar = this.S;
        aerz aerzVar = this.bg;
        boolean z = aerzVar.a;
        if (vxzVar.l(44, 45682398L, false)) {
            YouTubeButton youTubeButton = this.aG;
            tuk.l(youTubeButton, z);
            youTubeButton.setText(aerz.f(getContext(), this.I.a()));
        } else {
            int iD = aerzVar.d(this.I.a());
            AppCompatImageView appCompatImageView = this.aF;
            appCompatImageView.setImageDrawable(new aduk(getContext(), iD).a());
            appCompatImageView.setVisibility(true != z ? 8 : 0);
            tuk.l(appCompatImageView, z);
        }
        if (z) {
            h(147448);
        }
    }

    public final void H() {
        igk igkVar = this.be;
        boolean z = igkVar.c;
        int i = true != z ? 8 : 0;
        AppCompatImageView appCompatImageView = this.aE;
        appCompatImageView.setVisibility(i);
        igi igiVarA = igkVar.a();
        igi igiVar = igi.a;
        adxj adxjVar = this.M;
        appCompatImageView.setImageResource(igiVarA == igiVar ? adxjVar.b(arqz.mK) : adxjVar.b(arqz.cI));
        tuk.l(appCompatImageView, z);
        if (z) {
            h(154605);
        }
    }

    public final boolean I() {
        return (this.p || this.j.a() || abgg.a(this.y)) ? false : true;
    }

    public final boolean J() {
        return (this.aT || this.m) ? false : true;
    }

    public final boolean K() {
        this.aO.removeMessages(2);
        this.aS.a(this.j);
        jnj jnjVar = this.W;
        boolean z = false;
        ((View) jnjVar.c).setVisibility(this.k != aony.LIVE_STREAM_OFFLINE ? 8 : 0);
        int i = 4;
        boolean z2 = true;
        ((View) jnjVar.d).setVisibility(true != this.n ? 0 : 4);
        setFocusable(this.j.a());
        vxz vxzVar = this.S;
        if (vxzVar.l(95, 45762151L, false)) {
            tuk.l(this.aH, this.aI.getVisibility() == 0);
        }
        tuk.l(this.aL, this.j.b && !jnjVar.A());
        if ((this.y.v && J()) || this.aT || this.j.a()) {
            hwb hwbVar = this.g;
            if (!hwbVar.a) {
                if (this.y.C && this.j.b()) {
                    this.E.k();
                } else {
                    this.E.e(false);
                }
            }
            this.ae.kk(Boolean.FALSE);
            tuk.l(this.aE, false);
            tuk.l(this.aF, false);
            tuk.l(this.aG, false);
            tuk.l(this.aJ, false);
            tuk.l(this.aK, false);
            this.al.setVisibility(8);
            tuk.l(this.at, false);
            tuk.l(this.aw, false);
            tuk.l(this.ax, false);
            tuk.l(this.av, false);
            tuk.l(this.az, false);
            tuk.l(this.aA, false);
            ViewGroup viewGroup = this.aB;
            tuk.l(viewGroup, viewGroup.getChildCount() > 0 && this.s && !this.o && this.y == abgg.a);
            tuk.l(this.aC, X());
            boolean z3 = (this.p || hwbVar.a) ? false : true;
            if (z3) {
                this.E.e(false);
            }
            tuk.l(this.ak, this.o && !z3 && abgg.b(this.y));
            tuk.l(this.c, false);
            this.ah.setVisibility(4);
            tuk.l(this.am, false);
            tuk.l(this.an, false);
            tuk.l(this.aq, false);
            tuk.l(this.aM, hwbVar.a && this.o);
            tuk.l(this.aN, hwbVar.a && this.o);
            tuk.l(this.ar, false);
            tuk.l(this.ao, false);
            tuk.l(this.as, false);
            tuk.l(this.ap, false);
            tuk.l(this.au, false);
            if (!this.j.b() && this.j.c()) {
                z2 = false;
            }
            tuk.l(this, z2);
            if (!hwbVar.a) {
                V();
            }
            return false;
        }
        tuk.l(this.at, this.o);
        boolean z4 = this.o && this.y != abgg.h;
        TextView textView = this.aw;
        tuk.l(textView, z4);
        TextView textView2 = this.ax;
        tuk.l(textView2, z4);
        if (z4) {
            textView.setSelected(true);
            textView2.setSelected(true);
        }
        this.ae.kk(Boolean.TRUE);
        boolean z5 = this.o || this.p || this.r;
        tuk.l(this.al, ((vxzVar.l(97, 45764568L, false) || this.y != abgg.h) && this.j.b()) ? this.o : false);
        boolean z6 = this.y != abgg.h && this.j.b() && z5;
        if (this.bg.a && this.be.c && z5) {
            G();
            H();
        } else {
            tuk.l(this.aJ, z6);
            tuk.l(this.aK, z6);
        }
        tuk.l(this.av, !this.j.a() && (this.o || !this.v));
        tuk.l(this.az, true);
        tuk.l(this.aA, this.o);
        ViewGroup viewGroup2 = this.aB;
        tuk.l(viewGroup2, viewGroup2.getChildCount() > 0 && !this.o && this.y == abgg.a);
        tuk.l(this.aC, X());
        boolean z7 = abgg.b(this.y) || abgg.d(this.y);
        if (vxzVar.l(76, 45734213L, false)) {
            z7 = z7 && this.o;
        }
        tuk.l(this.ak, z7);
        if (!this.y.w || (!(this.o || this.p) || jnjVar.A())) {
            this.E.e(false);
        } else {
            this.E.k();
        }
        tuk.l(this.ah, true);
        if (!this.r) {
            View view = this.c;
            view.setTranslationY(0.0f);
            tuk.l(view, z5);
        }
        this.am.setVisibility((this.j.c() && this.y.A && z5) ? 0 : 4);
        acdq acdqVar = this.I;
        if (acdqVar.D() && z5) {
            boolean zD = acdqVar.D();
            boolean z8 = this.y.z && acdqVar.A();
            TouchImageView touchImageView = this.as;
            touchImageView.setVisibility(true != zD ? 8 : 0);
            touchImageView.setEnabled(this.aY);
            touchImageView.setAlpha(this.aY ? 1.0f : this.bd.getFloat());
            if (zD) {
                tuk.l(touchImageView, z8);
                h(144246);
            }
            TouchImageView touchImageView2 = this.ap;
            touchImageView2.setVisibility(true == zD ? 0 : 8);
            touchImageView2.setEnabled(this.aY);
            touchImageView2.setAlpha(this.aY ? 1.0f : this.bd.getFloat());
            if (zD) {
                tuk.l(touchImageView2, z8);
                h(144245);
            }
        } else {
            TouchImageView touchImageView3 = this.an;
            touchImageView3.setVisibility((this.y.B && this.j.a != abgh.a && z5) ? 0 : 4);
            touchImageView3.setEnabled(W());
            touchImageView3.setAlpha(touchImageView3.isEnabled() ? 1.0f : this.bd.getFloat());
            abgg abggVar = this.y;
            boolean z9 = (abggVar == abgg.q || abgg.d(abggVar) || (!this.j.c() && !W()) || !acdqVar.A()) ? false : true;
            TouchImageView touchImageView4 = this.aq;
            if (this.y.B && this.j.a != abgh.a && z5) {
                i = 0;
            }
            touchImageView4.setVisibility(i);
            touchImageView4.setEnabled((this.aX && acdqVar.C()) || z9);
            touchImageView4.setAlpha(touchImageView4.isEnabled() ? 1.0f : this.bd.getFloat());
            boolean z10 = this.y.z && acdqVar.A() && this.f.isTouchExplorationEnabled();
            tuk.l(this.ar, z10);
            tuk.l(this.ao, z10);
        }
        TouchImageView touchImageView5 = this.au;
        if (this.m && !this.l && z5) {
            z = true;
        }
        tuk.l(touchImageView5, z);
        tuk.l(this.ay, true);
        tuk.l(this, true);
        V();
        return true;
    }

    @Override // defpackage.hwi
    public final void L() {
        WatchFragment watchFragment = this.O;
        if (watchFragment != null) {
            watchFragment.e.c(vxh.a("FEmusic_home"), null);
        }
    }

    @Override // defpackage.hwi
    public final void M() {
        WatchFragment watchFragment = this.O;
        if (watchFragment != null) {
            watchFragment.f();
        }
    }

    @Override // defpackage.hwi
    public final void N() {
        WatchFragment watchFragment = this.O;
        if (watchFragment != null) {
            watchFragment.e.c(vxh.b("FEmusic_offline"), null);
        }
    }

    @Override // defpackage.hwi
    public final void O() {
        fg fgVar = this.V;
        if (fgVar != null) {
            fgVar.v();
        }
        this.i.a(null);
    }

    @Override // defpackage.abfz
    public final /* synthetic */ void Q(long j, long j2, long j3, long j4) {
        long j5;
        long j6;
        if (this.j.c()) {
            if (j != 0) {
                j5 = j2;
                j6 = j3;
            } else if (j2 != 0) {
                j5 = j2;
                j6 = j3;
                j = 0;
            } else if (j3 != 0) {
                j6 = j3;
                j = 0;
                j5 = 0;
            } else {
                if (j4 == 0) {
                    return;
                }
                j = 0;
                j5 = 0;
                j6 = 0;
            }
            long j7 = j > j6 ? j6 : j;
            this.aZ = j7;
            this.x = j6;
            ibf ibfVar = this.E;
            abhl abhlVar = ibfVar.b;
            if (abhlVar.c == j7 && abhlVar.d == j5 && abhlVar.a == j6 && abhlVar.b == j4) {
                return;
            }
            abhlVar.l(j7, j5, j6, j4);
            ibfVar.a.v(abhlVar);
            iba ibaVar = ibfVar.e;
            boolean z = abhlVar.j;
            if (ibaVar.a != z) {
                ibaVar.a = z;
                ibaVar.f(false);
            }
            ibfVar.b();
            ibfVar.c();
        }
    }

    @Override // defpackage.abfz
    public final /* synthetic */ void R(aoqp aoqpVar) {
        aaja.g(aoqpVar);
    }

    @Override // defpackage.acdg
    public final ViewGroup.LayoutParams b() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public final void c(View view) {
        this.av.addView(view, 0);
    }

    @Override // defpackage.acdi
    protected final void d(acdg acdgVar, View view) {
        FrameLayout frameLayout;
        if (!this.S.l(95, 45762151L, false) || (frameLayout = this.d) == null) {
            super.d(acdgVar, view);
        } else {
            frameLayout.addView(view, acdgVar.b());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout;
        if (this.S.l(95, 45762151L, false) && (frameLayout = this.d) != null) {
            float x = (motionEvent.getX() - frameLayout.getLeft()) - frameLayout.getTranslationX();
            float y = (motionEvent.getY() - frameLayout.getTop()) - frameLayout.getTranslationY();
            if (x < 0.0f || x > frameLayout.getWidth() || y < 0.0f || y > frameLayout.getHeight()) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        this.aU = false;
        this.aO.removeMessages(1);
        this.ay.clearAnimation();
    }

    public final void f() {
        this.aV = false;
        F();
    }

    public final void g() {
        e();
        this.aT = true;
        K();
        fg fgVar = this.V;
        if (fgVar != null) {
            ((tce) fgVar.b).a(new aazi(false));
        }
    }

    public final void h(int i) {
        this.af.l(new xgj(xhb.b(i)));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1 && J()) {
            E(this.h);
            return true;
        }
        if (message.what != 2) {
            return false;
        }
        K();
        return true;
    }

    public final void i(ameb amebVar, int i) {
        this.af.o(amebVar, new xgj(xhb.b(i)), null);
    }

    public final void j() {
        abgi abgiVar = this.j;
        if ((abgiVar.a == abgh.b || abgiVar.b || !this.o) && J()) {
            Handler handler = this.aO;
            if (!handler.hasMessages(1)) {
                handler.sendEmptyMessageDelayed(1, 2500L);
            }
        }
        this.J.setVisibility(8);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, xgn] */
    public final void k(MotionEvent motionEvent) {
        if (this.n || this.p || this.j.a()) {
            return;
        }
        abkk abkkVar = this.C;
        if (abkkVar.d && this.I.A()) {
            abkkVar.a(motionEvent, this);
            return;
        }
        if (this.S.l(95, 45762151L, false) && this.w.equals(hww.c) && !abgg.a(this.y)) {
            kwq kwqVar = (kwq) this.K.io();
            ibt ibtVarK = kwqVar.k();
            ibt ibtVar = ibt.FILL;
            if (ibtVarK == ibtVar) {
                ibtVar = ibt.FIT;
            }
            ibt ibtVarK2 = kwqVar.k();
            if (ibtVar != ibtVarK2) {
                xgj xgjVarL = kwq.l(ibtVarK2);
                ?? r2 = kwqVar.b;
                r2.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgjVarL, null);
                ((awku) kwqVar.a).kk(ibtVar);
                r2.p(xgjVarL, null);
                r2.l(kwq.l(ibtVar));
            }
        }
        if (!this.aT) {
            e();
            E(this.h);
        } else {
            if (this.y.v) {
                return;
            }
            e();
            D();
        }
    }

    @Override // defpackage.abfz
    public final void l() {
        w(abgg.a);
        this.x = 0L;
        this.aZ = 0L;
        this.k = null;
        this.i.a(null);
    }

    @Override // defpackage.abfz
    public final void m() {
        this.aZ = 0L;
        this.x = 0L;
        ibf ibfVar = this.E;
        abhl abhlVar = ibfVar.b;
        abhlVar.j();
        ibfVar.d();
        ibfVar.a.v(abhlVar);
        this.Q.c(null, null);
    }

    public final void n(CharSequence charSequence) {
        this.ax.setText(charSequence);
    }

    @Override // defpackage.abfz
    public final void o(abgi abgiVar) {
        this.aD.b(new hqa(this, abgiVar, 11), abgiVar.b);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (animation == this.aP) {
            if (this.aU) {
                g();
            }
        } else if (animation == this.aR) {
            this.ay.setVisibility(4);
            this.aT = true;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.J.setVisibility(8);
    }

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
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        anfy anfyVarU;
        hyw hywVar;
        Object obj;
        fg fgVar = this.V;
        if (fgVar != null) {
            if (view == this.an) {
                if (W() && this.y.B && !this.bf.c()) {
                    if (J()) {
                        e();
                        E(this.h);
                    }
                    i(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, 36841);
                    if (this.S.l(122, 45828708L, false)) {
                        this.ag.n(new abec(this.af.i(), xhb.b(36841)));
                    }
                    this.ad.g();
                }
            } else if (view == this.aq) {
                if (this.y.B && !this.bf.c()) {
                    i(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, 36840);
                    if (this.S.l(122, 45828708L, false)) {
                        this.ag.n(new abec(this.af.i(), xhb.b(36840)));
                    }
                    this.ad.h();
                }
            } else if (view == this.am) {
                abgh abghVar = this.j.a;
                if (abghVar == abgh.f) {
                    fgVar.u();
                    i(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, 56386);
                } else if (abghVar == abgh.b) {
                    fgVar.s();
                    i(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, 36842);
                } else if (abghVar == abgh.c) {
                    fgVar.t();
                    i(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, 36842);
                }
            } else if (view == this.at) {
                this.O.f();
            } else if (view == this.al) {
                WatchFragment watchFragment = this.P;
                if (jku.d(watchFragment.requireActivity())) {
                    Optional optionalAh = watchFragment.aA.ah();
                    if (!optionalAh.isPresent() || ((hyw) optionalAh.get()).c() == null) {
                        hfn hfnVar = watchFragment.aw;
                        aihf aihfVarCreateBuilder = anfy.a.createBuilder();
                        aihfVarCreateBuilder.bH(hfnVar.v(Optional.empty(), false));
                        anfyVarU = (anfy) aihfVarCreateBuilder.build();
                        hywVar = null;
                    } else {
                        hyw hywVar2 = (hyw) optionalAh.get();
                        anfyVarU = watchFragment.aw.u(hywVar2);
                        hywVar = hywVar2;
                    }
                    if (watchFragment.aj.j(anfyVarU)) {
                        adyr adyrVar = (adyr) watchFragment.E.io();
                        adyp adypVar = new adyp();
                        adypVar.b(agpn.b);
                        adypVar.c(anfyVarU);
                        adypVar.d(false);
                        adyrVar.a(adypVar.a());
                    } else {
                        izr izrVar = (izr) watchFragment.D.io();
                        View viewFindViewById = watchFragment.z.findViewById(R.id.player_overflow_button);
                        if (hywVar == null) {
                            obj = hywVar;
                            obj = watchFragment;
                        }
                        obj = hywVar;
                        izrVar.k(anfyVarU, viewFindViewById, obj, watchFragment.t);
                    }
                    if (watchFragment.ag.l(137, 45858970L, false) && hfn.w(anfyVarU)) {
                        watchFragment.t.l(new xgj(xhb.b(141877)));
                    }
                }
            } else if (view == this.ai) {
                this.O.g.m();
                i(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, 54319);
            } else if (view == this.aj) {
                this.O.g.n();
            } else if (view == this.ar) {
                this.V.x(Math.max(0L, this.aZ - this.C.b.a().toMillis()), appa.SEEK_SOURCE_PRESS_REWIND_PLAY_BACK_CONTROL);
            } else if (view == this.ao) {
                this.V.x(Math.min(this.x, this.aZ + this.C.b.a().toMillis()), appa.SEEK_SOURCE_PRESS_FAST_FORWARD_PLAY_BACK_CONTROL);
            } else if (view == this.as) {
                i(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, 144246);
                this.V.w(Math.max(0L, this.aZ - 10000));
            } else if (view == this.ap) {
                i(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, 144245);
                this.V.w(Math.min(this.x, this.aZ + 30000));
            } else if (view == this.aE) {
                i(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, 154605);
                aihh aihhVar = (aihh) ajwo.a.createBuilder();
                aihhVar.e(aqaf.b, aqaf.a);
                this.a.a((ajwo) aihhVar.build());
            } else if (view == this.aF) {
                i(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, 147448);
                ((hyo) this.bb.io()).d();
            } else if (view == this.au && !this.aT) {
                e();
                E(this.h);
            }
        }
        if (J()) {
            e();
            j();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (zOnInterceptTouchEvent) {
            e();
        }
        return zOnInterceptTouchEvent;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z = false;
        if (i != 0) {
            if (keyEvent.isSystem() && i != 79 && i != 130 && i != 126 && i != 127) {
                switch (i) {
                    case 85:
                    case 86:
                    case 87:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                        z = true;
                        break;
                }
            } else {
                z = true;
            }
        }
        if (z) {
            C();
        }
        if (this.j.a != abgh.d || !z || i == 20 || i == 21 || i == 22 || i == 19) {
            return super.onKeyDown(i, keyEvent);
        }
        this.V.v();
        return true;
    }

    @Override // defpackage.abfz
    public final void p(boolean z) {
        if (this.o != z) {
            this.o = z;
            TouchImageView touchImageView = this.ai;
            if (z) {
                touchImageView.setVisibility(8);
                this.aj.setVisibility(0);
            } else {
                touchImageView.setVisibility(0);
                this.aj.setVisibility(8);
            }
            this.b.d = z;
            this.ah.setVisibility(true != this.aT ? 0 : 8);
            ViewGroup viewGroup = this.aC;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginStart(getContext().getResources().getDimensionPixelSize(true != z ? R.dimen.item_small_spacing : R.dimen.fullscreen_player_paid_content_overlay_start_margin));
            }
            viewGroup.requestLayout();
            K();
            if (this.j.a == abgh.b && J()) {
                e();
                E(this.h);
            }
            this.i.b(z);
        }
    }

    @Override // defpackage.abgw
    public final void q(boolean z) {
        this.aW = z;
        K();
    }

    @Override // defpackage.abgw
    public final void r(boolean z) {
        this.aX = z;
        K();
    }

    @Override // defpackage.abfz
    public final void s(CharSequence charSequence) {
        this.ak.setText(charSequence);
    }

    @Override // defpackage.abgw
    public final void t(abgv abgvVar) {
        this.ad = abgvVar;
    }

    @Override // defpackage.abfz
    public final void u(boolean z) {
        boolean z2 = false;
        if (this.I.A() && z) {
            z2 = true;
        }
        this.aY = z2;
        ibf ibfVar = this.E;
        abhl abhlVar = ibfVar.b;
        if (abhlVar.k != z2) {
            abhlVar.k = z2;
            if (!z2) {
                ibfVar.d();
            }
            ibfVar.a.v(abhlVar);
        }
        K();
    }

    @Override // defpackage.abfz
    public final void v(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z) {
                D();
                return;
            }
            K();
            if (this.o) {
                return;
            }
            j();
        }
    }

    @Override // defpackage.abfz
    public final void w(abgg abggVar) {
        this.y = abggVar;
        ibf ibfVar = this.E;
        int i = abgg.a(abggVar) ? abggVar.x : ibfVar.c;
        abhl abhlVar = ibfVar.b;
        abhlVar.g = i;
        abhlVar.i = abggVar.y;
        boolean z = abggVar.z;
        abhlVar.k = z;
        abhlVar.j = abggVar.D;
        abhlVar.l = abggVar.E;
        abhlVar.k(abggVar.F);
        abhlVar.m = abgg.d(abggVar) || abgg.c(abggVar);
        ibfVar.a.v(abhlVar);
        iba ibaVar = ibfVar.e;
        boolean zB = abgg.b(abggVar);
        if (ibaVar.c != zB) {
            ibaVar.c = zB;
            ibaVar.b = !zB;
            ibaVar.f(false);
            ibaVar.f(false);
            ibaVar.a();
            ibaVar.b();
        }
        if (ibaVar.d != z) {
            ibaVar.d = z;
            ((TextView) ibaVar.e.a).setClickable(z);
        }
        ibfVar.g = abggVar.w;
        ibfVar.h();
        ibfVar.i(false);
        K();
        j();
    }

    public final void x(Bitmap bitmap) {
        if (bitmap == null) {
            this.b.setImageDrawable(null);
            return;
        }
        if (this.S.l(131, 45844259L, false)) {
            this.bc.kk(bitmap);
        } else {
            this.G.kk(bitmap);
        }
        this.b.setImageBitmap(bitmap);
    }

    @Override // defpackage.abfz
    public final void y(Map map) {
        ibf ibfVar = this.E;
        abhl abhlVar = ibfVar.b;
        abhlVar.n = map;
        ibfVar.a.v(abhlVar);
    }

    @Override // defpackage.abfz
    public final void z(long j, long j2, long j3, long j4) {
        throw null;
    }

    @Override // defpackage.abfz
    public final void P() {
    }

    @Override // defpackage.acdg
    public final View jM() {
        return this;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}

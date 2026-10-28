package com.google.android.apps.youtube.music.watchpage;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.watchpage.MusicPlaybackControls;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import defpackage.aaja;
import defpackage.abea;
import defpackage.abec;
import defpackage.abfz;
import defpackage.abgg;
import defpackage.abgh;
import defpackage.abgi;
import defpackage.abgk;
import defpackage.abgv;
import defpackage.abgw;
import defpackage.abhf;
import defpackage.abhl;
import defpackage.abhm;
import defpackage.acdo;
import defpackage.acdq;
import defpackage.aduk;
import defpackage.adxj;
import defpackage.aerz;
import defpackage.agfa;
import defpackage.ameb;
import defpackage.aoqp;
import defpackage.arqz;
import defpackage.aunn;
import defpackage.awrc;
import defpackage.cf;
import defpackage.csd;
import defpackage.fg;
import defpackage.ght;
import defpackage.gjc;
import defpackage.hbf;
import defpackage.hfn;
import defpackage.hhb;
import defpackage.hxg;
import defpackage.hyd;
import defpackage.hye;
import defpackage.hyo;
import defpackage.igi;
import defpackage.igk;
import defpackage.ihq;
import defpackage.ixe;
import defpackage.jij;
import defpackage.jkn;
import defpackage.jnj;
import defpackage.jnn;
import defpackage.jno;
import defpackage.kyr;
import defpackage.tss;
import defpackage.vxz;
import defpackage.xgj;
import defpackage.xgn;
import defpackage.xhb;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class MusicPlaybackControls extends jnn implements View.OnClickListener, abgw, abfz, abhf {
    private ViewGroup A;
    private TouchImageView B;
    private TouchImageView C;
    private TouchImageView D;
    private TouchImageView E;
    private TouchImageView F;
    private View G;
    private AppCompatImageView H;
    private YouTubeButton I;
    private AppCompatImageView J;
    private View K;
    private abgk L;
    private abgv M;
    private abgg N;
    private boolean O;
    private boolean P;
    public cf a;
    public xgn b;
    public abea c;
    public acdq d;
    public aunn e;
    public aunn f;
    public adxj g;
    public MusicPlaybackControlsTimeBar h;
    public abhl i;
    public abgi j;
    public boolean k;
    public igk l;
    public hbf m;
    public jno n;
    public vxz o;
    public jnj p;
    public jij q;
    public aerz r;
    public fg s;
    public hhb t;
    public hfn u;
    private final jkn v;
    private final jkn w;
    private final jkn x;
    private final float y;
    private TextView z;

    public MusicPlaybackControls(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.playback_controls, this);
        TypedValue typedValue = new TypedValue();
        getContext().getResources().getValue(R.dimen.disabled_icon_alpha, typedValue, true);
        this.v = this.u.H();
        this.w = this.u.H();
        this.x = this.u.H();
        this.y = typedValue.getFloat();
    }

    private final void f(ameb amebVar, int i) {
        this.b.o(amebVar, new xgj(xhb.b(i)), null);
    }

    private static boolean g(abgi abgiVar) {
        return abgiVar.a == abgh.b && !abgiVar.b;
    }

    private static final void h(int i, View... viewArr) {
        for (View view : viewArr) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && (i != layoutParams.height || i != layoutParams.width)) {
                layoutParams.height = i;
                layoutParams.width = i;
                view.setLayoutParams(layoutParams);
            }
        }
    }

    private static final void i(View view, int i) {
        if (view.getPaddingStart() == i && view.getPaddingEnd() == i) {
            return;
        }
        view.setPaddingRelative(i, view.getPaddingTop(), i, view.getPaddingBottom());
    }

    @Override // defpackage.abfz
    public final /* synthetic */ void Q(long j, long j2, long j3, long j4) {
        z(j, j2, j3, j4);
    }

    @Override // defpackage.abfz
    public final /* synthetic */ void R(aoqp aoqpVar) {
        aaja.g(aoqpVar);
    }

    public final void d() {
        if (this.r.a) {
            if (this.o.l(44, 45682398L, false)) {
                this.I.setText(aerz.f(getContext(), this.d.a()));
            } else {
                this.H.setImageDrawable(new aduk(getContext(), this.r.d(this.d.a())).a());
            }
        }
    }

    public final void e() {
        this.h.setEnabled(this.k);
        if (this.j.c() && this.N.A) {
            this.L.a(this.j);
        }
        boolean zD = this.d.D();
        this.F.setVisibility(true != zD ? 8 : 0);
        this.F.setEnabled(this.k);
        this.F.setAlpha(this.k ? 1.0f : this.y);
        if (zD) {
            this.b.l(new xgj(xhb.b(144245)));
        }
        this.C.setVisibility(true != zD ? 0 : 8);
        boolean z = this.N.B && this.P && this.d.B();
        this.C.setAlpha(z ? 1.0f : this.y);
        this.C.setContentDescription(z ? getContext().getString(R.string.accessibility_next_track_enabled) : getContext().getString(R.string.accessibility_next_track_disabled));
        boolean zD2 = this.d.D();
        this.E.setVisibility(true != zD2 ? 8 : 0);
        this.E.setEnabled(this.k);
        this.E.setAlpha(this.k ? 1.0f : this.y);
        if (zD2) {
            this.b.l(new xgj(xhb.b(144246)));
        }
        this.D.setVisibility(true != zD2 ? 0 : 8);
        boolean z2 = this.N.B && ((this.O && this.d.C()) || (this.N != abgg.q && ((this.j.c() || this.P) && this.d.A())));
        this.D.setAlpha(z2 ? 1.0f : this.y);
        this.D.setContentDescription(z2 ? getContext().getString(R.string.accessibility_previous_track_enabled) : getContext().getString(R.string.accessibility_previous_track_disabled));
        d();
        boolean z3 = this.r.a;
        int i = true != z3 ? 8 : 0;
        if (this.o.l(44, 45682398L, false)) {
            this.I.setVisibility(i);
        } else {
            this.H.setVisibility(i);
        }
        this.G.setVisibility(true != z3 ? 0 : 8);
        if (z3) {
            this.b.l(new xgj(xhb.b(147448)));
        }
        boolean z4 = this.l.c;
        this.J.setVisibility(true != z4 ? 8 : 0);
        this.K.setVisibility(true != z4 ? 0 : 8);
        AppCompatImageView appCompatImageView = this.J;
        igi igiVarA = this.l.a();
        igi igiVar = igi.a;
        adxj adxjVar = this.g;
        appCompatImageView.setImageResource(igiVarA == igiVar ? adxjVar.b(arqz.mK) : adxjVar.b(arqz.cI));
        this.J.setSelected(this.l.a() != igiVar);
        if (z4) {
            this.b.l(new xgj(xhb.b(154605)));
        }
        if (this.n != null) {
            boolean zA = this.d.A();
            jno jnoVar = this.n;
            if (zA) {
                jnoVar.a();
                return;
            }
            TextView textView = (TextView) jnoVar.c.a;
            textView.setOnClickListener(null);
            textView.setClickable(false);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // defpackage.abfz
    public final void l() {
        m();
        w(this.N);
    }

    @Override // defpackage.abfz
    public final void m() {
        this.x.b(new ixe(this, 10), true);
    }

    @Override // defpackage.abfz
    public final void o(abgi abgiVar) {
        ihq ihqVar = new ihq(this, abgiVar, 4);
        boolean z = false;
        if (!g(abgiVar) && (!g(this.j) || abgiVar.a != abgh.c || abgiVar.b)) {
            z = true;
        }
        this.v.b(ihqVar, z);
    }

    /* JADX WARN: Type inference failed for: r6v15, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [aunn, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        fg fgVar = this.s;
        if (fgVar != null) {
            if (view == this.C) {
                if (this.P && this.d.B() && this.N.B && !this.q.c()) {
                    f(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, 36841);
                    if (this.o.l(122, 45828708L, false)) {
                        this.c.n(new abec(this.b.i(), xhb.b(36841)));
                    }
                    this.M.g();
                    return;
                }
                return;
            }
            if (view == this.D) {
                if (((this.O && this.d.C()) || this.k) && this.N.B && !this.q.c()) {
                    f(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, 36840);
                    if (this.o.l(122, 45828708L, false)) {
                        this.c.n(new abec(this.b.i(), xhb.b(36840)));
                    }
                    this.M.h();
                    return;
                }
                return;
            }
            if (view == this.B) {
                abgh abghVar = this.j.a;
                if (abghVar == abgh.f) {
                    fgVar.u();
                    f(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, 56386);
                    return;
                } else if (abghVar == abgh.b) {
                    fgVar.s();
                    f(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, 36842);
                    return;
                } else {
                    if (abghVar == abgh.c) {
                        fgVar.t();
                        f(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, 36842);
                        return;
                    }
                    return;
                }
            }
            if (view == this.E) {
                kyr kyrVar = (kyr) this.e.io();
                kyrVar.y(144246);
                ((acdo) kyrVar.a.io()).g(-10000L);
                return;
            }
            if (view == this.F) {
                kyr kyrVar2 = (kyr) this.e.io();
                kyrVar2.y(144245);
                ((acdo) kyrVar2.a.io()).g(30000L);
            } else if (view == this.H) {
                f(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, 147448);
                ((hyo) this.f.io()).d();
            } else if (view == this.J) {
                f(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, 154605);
                igi igiVarA = this.l.a();
                igi igiVar = igi.a;
                cf cfVar = this.a;
                if (igiVarA == igiVar) {
                    hyd.o(cfVar).p(this.a);
                } else {
                    hye.o(cfVar).r(this.a);
                }
            }
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.h = (MusicPlaybackControlsTimeBar) findViewById(R.id.time_bar);
        this.z = (TextView) findViewById(R.id.live_label);
        if (this.o.l(42, 45681452L, false)) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.player_page_padding_horizontal_medium);
            i(this.h, dimensionPixelSize);
            i(this.z, dimensionPixelSize);
        }
        boolean zO = this.p.o();
        MusicPlaybackControlsTimeBar musicPlaybackControlsTimeBar = this.h;
        if (zO) {
            musicPlaybackControlsTimeBar.e = true;
            musicPlaybackControlsTimeBar.h();
            musicPlaybackControlsTimeBar.i();
        } else {
            musicPlaybackControlsTimeBar.e = false;
            musicPlaybackControlsTimeBar.h();
            musicPlaybackControlsTimeBar.i();
        }
        this.h.setEnabled(false);
        abhl abhlVar = new abhl();
        this.i = abhlVar;
        abhlVar.e = getContext().getColor(R.color.time_bar_empty_color);
        this.h.v(this.i);
        int i = 5;
        if (this.o.l(76, 45734213L, false)) {
            hhb hhbVar = this.t;
            tss tssVar = new tss(this.z);
            ght ghtVar = ((gjc) hhbVar.a).a;
            jno jnoVar = new jno((Context) ghtVar.v.io(), (vxz) ghtVar.km.io(), tssVar);
            this.n = jnoVar;
            jnoVar.b = new hxg(this, i);
            jnoVar.a();
        }
        if (this.o.l(83, 45740639L, false)) {
            this.h.s(new abhm(this, 1));
        }
        this.A = (ViewGroup) findViewById(R.id.controls_container);
        TouchImageView touchImageView = (TouchImageView) findViewById(R.id.player_control_play_pause_replay_button);
        this.B = touchImageView;
        touchImageView.setOnClickListener(this);
        TouchImageView touchImageView2 = this.B;
        Context context = getContext();
        adxj adxjVar = this.g;
        adxjVar.getClass();
        this.L = new abgk(touchImageView2, context, new agfa(adxjVar), true, true, true);
        TouchImageView touchImageView3 = (TouchImageView) findViewById(R.id.player_control_previous_button);
        this.D = touchImageView3;
        touchImageView3.setOnClickListener(this);
        TouchImageView touchImageView4 = (TouchImageView) findViewById(R.id.player_control_next_button);
        this.C = touchImageView4;
        touchImageView4.setOnClickListener(this);
        TouchImageView touchImageView5 = (TouchImageView) findViewById(R.id.player_control_rewind_button);
        this.E = touchImageView5;
        touchImageView5.setOnClickListener(this);
        TouchImageView touchImageView6 = (TouchImageView) findViewById(R.id.player_control_fast_forward_button);
        this.F = touchImageView6;
        touchImageView6.setOnClickListener(this);
        this.H = (AppCompatImageView) findViewById(R.id.playback_rate_button);
        if (!this.o.l(44, 45682398L, false)) {
            this.H.setOnClickListener(this);
            ((hyo) this.f.io()).c = this.H;
        }
        this.I = (YouTubeButton) findViewById(R.id.playback_rate_text_button);
        this.G = findViewById(R.id.playback_queue_shuffle_button_view);
        this.K = findViewById(R.id.playback_queue_loop_button_view);
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.sleep_timer_button);
        this.J = appCompatImageView;
        appCompatImageView.setOnClickListener(this);
        this.J.setContentDescription(this.m.d());
        if (this.o.l(42, 45681452L, false)) {
            View[] viewArr = {this.D, this.E, this.C, this.F, this.H, this.I, this.J, this.G, this.K};
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.playback_control_button_size);
            h(dimensionPixelSize2, viewArr);
            h(dimensionPixelSize2, this.G.findViewById(R.id.playback_control_icon), this.K.findViewById(R.id.playback_control_icon));
            int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.playback_control_button_indicator_margin_top_large);
            View[] viewArr2 = {this.G, this.K};
            for (int i2 = 0; i2 < 2; i2++) {
                View viewFindViewById = viewArr2[i2].findViewById(R.id.playback_control_indicator);
                if (viewFindViewById != null) {
                    ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (marginLayoutParams.topMargin != dimensionPixelSize3) {
                            marginLayoutParams.topMargin = dimensionPixelSize3;
                            viewFindViewById.setLayoutParams(marginLayoutParams);
                        }
                    }
                }
            }
            i(this.A, getResources().getDimensionPixelSize(R.dimen.item_extra_small_spacing));
            for (int i3 = 0; i3 < 9; i3++) {
                viewArr[i3].setBackgroundResource(R.drawable.ripple_large);
            }
        }
        this.N = abgg.a;
        abgi abgiVar = new abgi(abgh.a, false);
        this.j = abgiVar;
        o(abgiVar);
        e();
        this.L.a(this.j);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.abgw
    public final void q(boolean z) {
        this.P = z;
        e();
    }

    @Override // defpackage.abgw
    public final void r(boolean z) {
        this.O = z;
        e();
    }

    @Override // defpackage.abfz
    public final void s(CharSequence charSequence) {
        jno jnoVar = this.n;
        if (jnoVar != null) {
            charSequence.getClass();
            TextView textView = (TextView) jnoVar.c.a;
            textView.setText(charSequence);
            textView.setContentDescription(charSequence);
        }
    }

    @Override // defpackage.abgw
    public final void t(abgv abgvVar) {
        this.M = abgvVar;
    }

    @Override // defpackage.abfz
    public final void u(boolean z) {
        this.w.b(new csd(this, z, 3), !z);
    }

    @Override // defpackage.abfz
    public final void w(abgg abggVar) {
        this.N = abggVar;
        boolean zA = abgg.a(abggVar);
        abhl abhlVar = this.i;
        boolean z = true;
        if (zA) {
            abhlVar.g = abggVar.x;
        } else {
            abhlVar.g = getContext().getColor(R.color.inline_time_bar_progress_color);
            this.i.e = getContext().getColor(true != this.p.o() ? R.color.inline_time_bar_empty_color : R.color.modern_time_bar_empty_color);
            this.i.f = getContext().getColor(true != this.p.o() ? R.color.inline_time_bar_buffered_color : R.color.modern_time_bar_buffered_color);
        }
        abhl abhlVar2 = this.i;
        abhlVar2.i = abggVar.y;
        abhlVar2.j = abggVar.D;
        abhlVar2.k(abggVar.F);
        this.i.k = abggVar.z && this.d.A();
        abhl abhlVar3 = this.i;
        abhlVar3.l = abggVar.E;
        if (!abgg.d(abggVar) && !abgg.c(abggVar)) {
            z = false;
        }
        abhlVar3.m = z;
        this.h.v(this.i);
        jno jnoVar = this.n;
        if (jnoVar != null) {
            abggVar.getClass();
            if (!awrc.c(jnoVar.a, abggVar)) {
                jnoVar.a = abggVar;
                jnoVar.c.h(jnoVar.c(), false);
            }
        }
        e();
    }

    @Override // defpackage.abfz
    public final void y(Map map) {
        abhl abhlVar = this.i;
        abhlVar.n = map;
        this.h.v(abhlVar);
    }

    @Override // defpackage.abfz
    public final void z(final long j, final long j2, final long j3, final long j4) {
        this.x.b(new Runnable() { // from class: jnp
            @Override // java.lang.Runnable
            public final void run() {
                MusicPlaybackControls musicPlaybackControls = this.a;
                abhl abhlVar = musicPlaybackControls.i;
                long j5 = j;
                long j6 = j2;
                long j7 = j3;
                abhlVar.l(j5, j6, j7, j4);
                musicPlaybackControls.h.v(musicPlaybackControls.i);
                jno jnoVar = musicPlaybackControls.n;
                if (jnoVar != null) {
                    jnoVar.b(j5, j7);
                }
            }
        }, false);
    }

    @Override // defpackage.abfz
    public final void P() {
    }

    @Override // defpackage.abhf
    public final void b(boolean z) {
    }

    @Override // defpackage.abfz
    public final void p(boolean z) {
    }

    @Override // defpackage.abfz
    public final void v(boolean z) {
    }
}

package com.google.android.apps.youtube.music.player.audiovideoswitcher.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import defpackage.auiu;
import defpackage.bac;
import defpackage.ggb;
import defpackage.hxk;
import defpackage.hxm;
import defpackage.hxn;
import defpackage.hxo;
import defpackage.hxp;
import defpackage.hxq;
import defpackage.hxr;
import defpackage.ibt;
import defpackage.iwl;
import defpackage.ok;
import defpackage.pr;
import defpackage.tzk;
import defpackage.vxz;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AudioVideoSwitcherToggleView extends hxq {
    private int A;
    private int B;
    private int C;
    private ColorStateList D;
    private ColorStateList E;
    private ColorStateList F;
    private ggb G;
    private ggb H;
    private String I;
    private ColorStateList J;
    private hxp K;
    private final int L;
    private final int M;
    public ibt a;
    public iwl b;
    public Drawable c;
    public View d;
    public TextView e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public boolean m;
    public float n;
    public boolean o;
    public vxz p;
    private ObjectAnimator q;
    private int r;
    private int s;
    private TextView t;
    private ImageView u;
    private ImageView v;
    private Drawable w;
    private Drawable x;
    private Drawable y;
    private Drawable z;

    public AudioVideoSwitcherToggleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = ibt.FILL;
        this.D = ColorStateList.valueOf(0);
        this.E = ColorStateList.valueOf(0);
        this.F = ColorStateList.valueOf(0);
        this.o = false;
        this.L = R.id.song_text;
        this.M = R.id.song_icon;
        Drawable drawableC = ok.e().c(context, R.drawable.audio_video_switcher_toggle_selector);
        if (drawableC == null) {
            throw new IllegalStateException("Failed to load drawable R.drawable.audio_video_switcher_toggle_selector");
        }
        Drawable.ConstantState constantState = drawableC.getConstantState();
        if (constantState == null) {
            throw new IllegalStateException("Drawable R.drawable.audio_video_switcher_toggle_selector has no constant state");
        }
        this.c = constantState.newDrawable().mutate();
        this.G = new hxm(this);
        this.H = new hxn(this);
        this.q = new ObjectAnimator();
        this.f = getResources().getString(R.string.audio_video_switcher_tap_accessibility);
        this.g = getResources().getString(R.string.audio_video_switcher_switch_to_accessibility);
        this.h = getResources().getString(R.string.audio_video_switcher_pill_song_accessibility);
        this.i = getResources().getString(R.string.audio_video_switcher_pill_audio_accessibility);
        this.j = this.h;
        this.k = getResources().getString(R.string.audio_video_switcher_pill_video_accessibility);
        this.l = String.format(this.f, this.j);
        this.I = String.format(this.f, this.k);
        this.J = ColorStateList.valueOf(context.getColor(R.color.ytm_color_white_70_percent));
        hxo hxoVar = new hxo(this);
        bac.s(this);
        setAccessibilityDelegate(hxoVar.getBridge());
        if (l()) {
            this.A = tzk.i(context, R.attr.ytOverlayBackgroundMediumLight);
            this.C = tzk.i(context, R.attr.ytAdditiveBackground);
            this.B = tzk.i(context, R.attr.ytOverlayButtonPrimary);
            this.D = ColorStateList.valueOf(tzk.i(context, R.attr.ytOverlayTextPrimary));
            this.E = ColorStateList.valueOf(tzk.i(context, R.attr.ytOverlayTextSecondary));
            this.F = ColorStateList.valueOf(tzk.i(context, R.attr.ytTextDisabled));
        }
        setWillNotDraw(false);
        this.n = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hxr.a);
        this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, this.r);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final ColorStateList k(boolean z) {
        if (this.o) {
            return z ? this.D : this.E;
        }
        return this.F;
    }

    private final boolean l() {
        vxz vxzVar = this.p;
        return vxzVar != null && vxzVar.l(81, 45739191L, false) && this.p.l(95, 45762151L, false);
    }

    public final Rect a(View view) {
        return new Rect(view.getLeft() + this.s, view.getTop() + this.r, view.getRight() - this.s, view.getBottom() - this.r);
    }

    public final View b(boolean z) {
        if (g()) {
            return z ? this.u : this.v;
        }
        return z ? this.e : this.t;
    }

    public final void c(View view) {
        Rect bounds = this.c.getBounds();
        Rect rectA = a(view);
        if (this.d == view && bounds.equals(rectA)) {
            return;
        }
        this.d = view;
        this.q.cancel();
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.c, "bounds", new hxk(), bounds, rectA);
        objectAnimatorOfObject.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfObject.setDuration(getResources().getInteger(android.R.integer.config_mediumAnimTime));
        objectAnimatorOfObject.addUpdateListener(new pr(this, 7, null));
        objectAnimatorOfObject.addListener(new Animator.AnimatorListener() { // from class: hxl
            @Override // android.animation.Animator.AnimatorListener
            public final /* synthetic */ void onAnimationCancel(Animator animator) {
                animator.getClass();
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                this.a.requestLayout();
            }

            @Override // android.animation.Animator.AnimatorListener
            public final /* synthetic */ void onAnimationRepeat(Animator animator) {
                animator.getClass();
            }

            @Override // android.animation.Animator.AnimatorListener
            public final /* synthetic */ void onAnimationStart(Animator animator) {
                animator.getClass();
            }
        });
        invalidate();
        objectAnimatorOfObject.start();
        this.q = objectAnimatorOfObject;
    }

    public final void d() {
        int color;
        int color2;
        if (this.b != null) {
            long j = true != g() ? 450L : 0L;
            ggb ggbVar = this.H;
            iwl iwlVar = this.b;
            if (l()) {
                color = (!Objects.equals(iwlVar, iwl.d) || this.a == ibt.FILL) ? this.A : this.C;
            } else if (g()) {
                color = Objects.equals(iwlVar, iwl.d) ? getContext().getColor(R.color.ytm_color_white_at_10pct) : getContext().getColor(R.color.ytm_color_black_at_60pct);
            } else {
                boolean zEquals = Objects.equals(iwlVar, iwl.d);
                auiu auiuVar = iwlVar.f;
                color = zEquals ? auiuVar.a : auiuVar.d;
            }
            ggbVar.a(color, j);
            ggb ggbVar2 = this.G;
            iwl iwlVar2 = this.b;
            if (l()) {
                color2 = Objects.equals(iwlVar2, iwl.d) ? this.B : iwlVar2.f.a;
            } else if (g()) {
                color2 = Objects.equals(iwlVar2, iwl.d) ? getContext().getColor(R.color.ytm_color_white_at_20pct) : iwlVar2.f.a;
            } else {
                int i = iwlVar2.e.c;
                color2 = i == iwl.c.e.c ? getContext().getColor(R.color.mpp_av_switcher_toggle_video_selected_color) : i;
            }
            ggbVar2.a(color2, j);
        }
    }

    public final void e(boolean z) {
        this.m = z;
        if (z) {
            setContentDescription(this.l);
        } else {
            setContentDescription(this.I);
        }
    }

    public final void f(boolean z) {
        if (g()) {
            this.u.setImageDrawable(z ? this.w : this.x);
            this.v.setImageDrawable(z ? this.z : this.y);
            boolean zL = l();
            ImageView imageView = this.u;
            if (zL) {
                imageView.setImageTintList(k(z));
                this.v.setImageTintList(k(!z));
            } else {
                imageView.setImageTintList(z ? null : this.J);
                this.v.setImageTintList(z ? this.J : null);
            }
        }
    }

    public final boolean g() {
        vxz vxzVar = this.p;
        return vxzVar != null && vxzVar.l(81, 45739191L, false);
    }

    public final boolean h() {
        boolean zG = g();
        View view = this.d;
        if (zG) {
            if (view.getId() == this.M) {
                return true;
            }
        } else if (view.getId() == this.L) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        this.c.draw(canvas);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.e = (TextView) findViewById(R.id.song_text);
        this.t = (TextView) findViewById(R.id.video_text);
        this.u = (ImageView) findViewById(R.id.song_icon);
        this.v = (ImageView) findViewById(R.id.video_icon);
        if (!g()) {
            this.s = 0;
            this.r = getResources().getDimensionPixelSize(R.dimen.item_small_spacing);
            return;
        }
        this.e.setVisibility(8);
        this.t.setVisibility(8);
        this.u.setVisibility(0);
        this.v.setVisibility(0);
        setBackgroundResource(R.drawable.audio_video_switcher_toggle_icon_background);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.item_extra_extra_small_spacing);
        this.s = dimensionPixelSize;
        this.r = dimensionPixelSize;
        this.w = getContext().getDrawable(R.drawable.yt_fill_experimental_headset_vd_theme_24);
        this.z = getContext().getDrawable(R.drawable.yt_outline_experimental_video_vd_theme_24);
        this.x = getContext().getDrawable(R.drawable.yt_outline_experimental_headset_vd_theme_24);
        this.y = getContext().getDrawable(R.drawable.yt_fill_experimental_video_vd_theme_24);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.d;
        if (view != null) {
            this.c.setBounds(a(view));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!g()) {
            return super.onTouchEvent(motionEvent);
        }
        hxp hxpVar = this.K;
        if (hxpVar == null) {
            hxpVar = new hxp(this);
            this.K = hxpVar;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            hxpVar.a = motionEvent.getX();
            hxpVar.b = motionEvent.getY();
            hxpVar.c = false;
            hxpVar.d = 0;
            return true;
        }
        if (action == 1) {
            if (hxpVar.c) {
                hxpVar.a();
            } else {
                hxpVar.e.performClick();
            }
            hxpVar.c = false;
            return true;
        }
        if (action != 2) {
            if (action != 3) {
                return super.onTouchEvent(motionEvent);
            }
            if (hxpVar.c) {
                hxpVar.a();
            }
            hxpVar.c = false;
            return true;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (!hxpVar.c) {
            AudioVideoSwitcherToggleView audioVideoSwitcherToggleView = hxpVar.e;
            if (audioVideoSwitcherToggleView.o && Math.abs(x - hxpVar.a) > audioVideoSwitcherToggleView.n && Math.abs(x - hxpVar.a) > Math.abs(y - hxpVar.b)) {
                hxpVar.c = true;
                audioVideoSwitcherToggleView.getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        if (!hxpVar.c) {
            return true;
        }
        hxpVar.d = (int) (x - hxpVar.a);
        AudioVideoSwitcherToggleView audioVideoSwitcherToggleView2 = hxpVar.e;
        Rect rectA = audioVideoSwitcherToggleView2.a(audioVideoSwitcherToggleView2.d);
        int i = rectA.left + hxpVar.d;
        int i2 = audioVideoSwitcherToggleView2.a(audioVideoSwitcherToggleView2.b(true)).left;
        int i3 = audioVideoSwitcherToggleView2.a(audioVideoSwitcherToggleView2.b(false)).left;
        int iMax = Math.max(Math.min(i2, i3), Math.min(i, Math.max(i2, i3)));
        audioVideoSwitcherToggleView2.c.setBounds(iMax, rectA.top, rectA.width() + iMax, rectA.bottom);
        audioVideoSwitcherToggleView2.invalidate();
        return true;
    }
}

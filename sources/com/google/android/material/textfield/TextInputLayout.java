package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatTextView;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.aemk;
import defpackage.aetz;
import defpackage.aewo;
import defpackage.aewp;
import defpackage.aeyb;
import defpackage.aeyc;
import defpackage.aeyg;
import defpackage.aeyh;
import defpackage.aeym;
import defpackage.afay;
import defpackage.afba;
import defpackage.afbc;
import defpackage.afbe;
import defpackage.afbk;
import defpackage.afcg;
import defpackage.afdv;
import defpackage.afdw;
import defpackage.afdx;
import defpackage.afef;
import defpackage.afei;
import defpackage.afel;
import defpackage.afen;
import defpackage.afeo;
import defpackage.afep;
import defpackage.afeq;
import defpackage.afer;
import defpackage.afet;
import defpackage.afev;
import defpackage.afjc;
import defpackage.afli;
import defpackage.ahto;
import defpackage.avg;
import defpackage.avgj;
import defpackage.avv;
import defpackage.axg;
import defpackage.bac;
import defpackage.drp;
import defpackage.dse;
import defpackage.kl;
import defpackage.lx;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.chromium.net.NetError;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final /* synthetic */ int t = 0;
    private static final int[][] u = {new int[]{R.attr.state_pressed}, new int[0]};
    private int A;
    private int B;
    private int C;
    private int D;
    private ColorStateList E;
    private int F;
    private drp G;
    private drp H;
    private ColorStateList I;
    private ColorStateList J;
    private ColorStateList K;
    private ColorStateList L;
    private boolean M;
    private CharSequence N;
    private afbe O;
    private afbe P;
    private StateListDrawable Q;
    private boolean R;
    private afbe S;
    private afbe T;
    private afbk U;
    private boolean V;
    private final int W;
    public final afeo a;
    private ValueAnimator aA;
    private boolean aB;
    private boolean aC;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private final Rect ag;
    private final Rect ah;
    private final RectF ai;
    private Drawable aj;
    private int ak;
    private Drawable al;
    private int am;
    private Drawable an;
    private ColorStateList ao;
    private ColorStateList ap;
    private int aq;
    private int ar;
    private int as;
    private ColorStateList at;
    private int au;
    private int av;
    private int aw;
    private int ax;
    private int ay;
    private boolean az;
    public final afef b;
    public EditText c;
    public final afei d;
    public boolean e;
    public int f;
    public boolean g;
    public TextView h;
    public CharSequence i;
    public boolean j;
    public TextView k;
    public boolean l;
    public int m;
    public final LinkedHashSet n;
    public int o;
    public boolean p;
    public final aeyb q;
    public boolean r;
    public boolean s;
    private final FrameLayout v;
    private final int w;
    private CharSequence x;
    private int y;
    private int z;

    /* JADX WARN: Code duplicated, block: B:100:0x0437  */
    /* JADX WARN: Code duplicated, block: B:102:0x043d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0442  */
    /* JADX WARN: Code duplicated, block: B:105:0x0448  */
    /* JADX WARN: Code duplicated, block: B:108:0x045d  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:40:0x0227  */
    /* JADX WARN: Code duplicated, block: B:42:0x022d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0252  */
    /* JADX WARN: Code duplicated, block: B:45:0x025a  */
    /* JADX WARN: Code duplicated, block: B:54:0x027f  */
    /* JADX WARN: Code duplicated, block: B:56:0x028e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0309  */
    /* JADX WARN: Code duplicated, block: B:61:0x030f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0322  */
    /* JADX WARN: Code duplicated, block: B:65:0x0364  */
    /* JADX WARN: Code duplicated, block: B:68:0x036b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0370  */
    /* JADX WARN: Code duplicated, block: B:71:0x0374  */
    /* JADX WARN: Code duplicated, block: B:75:0x0388  */
    /* JADX WARN: Code duplicated, block: B:78:0x0397  */
    /* JADX WARN: Code duplicated, block: B:81:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:94:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:97:0x0405  */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        int colorForState;
        ColorStateList colorStateListY;
        CharSequence charSequenceD;
        CharSequence charSequenceD2;
        int iW;
        int iW2;
        int i2;
        ColorStateList colorStateListA;
        ColorStateList colorStateListA2;
        ColorStateList colorStateListY2;
        super(afev.a(context, attributeSet, i, com.google.android.apps.youtube.music.R.style.Widget_Design_TextInputLayout), attributeSet, i);
        this.y = -1;
        this.z = -1;
        this.A = -1;
        this.B = -1;
        afei afeiVar = new afei(this);
        this.d = afeiVar;
        this.ag = new Rect();
        this.ah = new Rect();
        this.ai = new RectF();
        this.n = new LinkedHashSet();
        aeyb aeybVar = new aeyb(this);
        this.q = aeybVar;
        this.aC = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.v = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = aetz.a;
        aeybVar.D(timeInterpolator);
        aeybVar.B(timeInterpolator);
        aeybVar.s(8388659);
        ahto ahtoVarE = aeym.e(context2, attributeSet, afen.c, i, com.google.android.apps.youtube.music.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        afeo afeoVar = new afeo(this, ahtoVarE);
        this.a = afeoVar;
        this.M = ahtoVarE.G(48, true);
        s(ahtoVarE.D(4));
        this.r = ahtoVarE.G(47, true);
        this.az = ahtoVarE.G(42, true);
        if (ahtoVarE.H(6)) {
            x(ahtoVarE.w(6, -1));
        } else if (ahtoVarE.H(3)) {
            y(ahtoVarE.v(3, -1));
        }
        if (ahtoVarE.H(5)) {
            v(ahtoVarE.w(5, -1));
        } else if (ahtoVarE.H(2)) {
            w(ahtoVarE.v(2, -1));
        }
        this.U = new afbk(afbk.j(context2, attributeSet, i, com.google.android.apps.youtube.music.R.style.Widget_Design_TextInputLayout));
        this.W = context2.getResources().getDimensionPixelOffset(com.google.android.apps.youtube.music.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.aa = ahtoVarE.u(9, 0);
        this.w = getResources().getDimensionPixelSize(com.google.android.apps.youtube.music.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.ac = ahtoVarE.v(16, context2.getResources().getDimensionPixelSize(com.google.android.apps.youtube.music.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.ad = ahtoVarE.v(17, context2.getResources().getDimensionPixelSize(com.google.android.apps.youtube.music.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.ab = this.ac;
        float fJ = ahtoVarE.J(13);
        float fJ2 = ahtoVarE.J(12);
        float fJ3 = ahtoVarE.J(10);
        float fJ4 = ahtoVarE.J(11);
        afli afliVar = new afli(this.U);
        if (fJ >= 0.0f) {
            afliVar.f(fJ);
        }
        if (fJ2 >= 0.0f) {
            afliVar.g(fJ2);
        }
        if (fJ3 >= 0.0f) {
            afliVar.e(fJ3);
        }
        if (fJ4 >= 0.0f) {
            afliVar.d(fJ4);
        }
        this.U = new afbk(afliVar);
        ColorStateList colorStateListY3 = afba.Y(context2, ahtoVarE, 7);
        if (colorStateListY3 != null) {
            int defaultColor = colorStateListY3.getDefaultColor();
            this.au = defaultColor;
            this.af = defaultColor;
            if (colorStateListY3.isStateful()) {
                this.av = colorStateListY3.getColorForState(new int[]{-16842910}, -1);
                this.aw = colorStateListY3.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.ax = colorStateListY3.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.aw = this.au;
                ColorStateList colorStateListD = avg.d(context2, com.google.android.apps.youtube.music.R.color.mtrl_filled_background_color);
                this.av = colorStateListD.getColorForState(new int[]{-16842910}, -1);
                colorForState = colorStateListD.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
            if (ahtoVarE.H(1)) {
                ColorStateList colorStateListA3 = ahtoVarE.A(1);
                this.ap = colorStateListA3;
                this.ao = colorStateListA3;
            }
            colorStateListY = afba.Y(context2, ahtoVarE, 14);
            this.as = ahtoVarE.I(14);
            this.aq = context2.getColor(com.google.android.apps.youtube.music.R.color.mtrl_textinput_default_box_stroke_color);
            this.ay = context2.getColor(com.google.android.apps.youtube.music.R.color.mtrl_textinput_disabled_color);
            this.ar = context2.getColor(com.google.android.apps.youtube.music.R.color.mtrl_textinput_hovered_box_stroke_color);
            if (colorStateListY != null) {
                if (colorStateListY.isStateful()) {
                    this.aq = colorStateListY.getDefaultColor();
                    this.ay = colorStateListY.getColorForState(new int[]{-16842910}, -1);
                    this.ar = colorStateListY.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
                    this.as = colorStateListY.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                } else if (this.as != colorStateListY.getDefaultColor()) {
                    this.as = colorStateListY.getDefaultColor();
                }
                H();
            }
            if (ahtoVarE.H(15) && this.at != (colorStateListY2 = afba.Y(context2, ahtoVarE, 15))) {
                this.at = colorStateListY2;
                H();
            }
            if (ahtoVarE.z(50, -1) != -1) {
                aeybVar.q(ahtoVarE.z(50, 0));
                this.ap = aeybVar.h;
                if (this.c != null) {
                    F(false, false);
                    af();
                }
            }
            this.K = ahtoVarE.A(24);
            this.L = ahtoVarE.A(25);
            int iZ = ahtoVarE.z(40, 0);
            CharSequence charSequenceD3 = ahtoVarE.D(35);
            int iW3 = ahtoVarE.w(34, 1);
            boolean zG = ahtoVarE.G(36, false);
            int iZ2 = ahtoVarE.z(45, 0);
            boolean zG2 = ahtoVarE.G(44, false);
            charSequenceD = ahtoVarE.D(43);
            int iZ3 = ahtoVarE.z(58, 0);
            charSequenceD2 = ahtoVarE.D(57);
            boolean zG3 = ahtoVarE.G(18, false);
            l(ahtoVarE.w(19, -1));
            this.D = ahtoVarE.z(22, 0);
            this.C = ahtoVarE.z(20, 0);
            iW = ahtoVarE.w(8, 0);
            if (iW != this.m) {
                this.m = iW;
                if (this.c != null) {
                    X();
                }
            }
            afeiVar.g(charSequenceD3);
            afeiVar.f(iW3);
            afeiVar.j(iZ2);
            afeiVar.h(iZ);
            if (this.k == null) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.k = appCompatTextView;
                appCompatTextView.setId(com.google.android.apps.youtube.music.R.id.textinput_placeholder);
                this.k.setImportantForAccessibility(1);
                this.k.setAccessibilityLiveRegion(1);
                drp drpVarR = R();
                this.G = drpVarR;
                drpVarR.a = 67L;
                this.H = R();
                z(this.F);
                A(this.E);
                bac.p(this.k, new afeq());
            }
            if (TextUtils.isEmpty(charSequenceD2)) {
                ab(false);
            } else {
                if (!this.j) {
                    ab(true);
                }
                this.i = charSequenceD2;
            }
            ag();
            z(iZ3);
            if (ahtoVarE.H(41)) {
                afeiVar.i(ahtoVarE.A(41));
            }
            if (ahtoVarE.H(46)) {
                afeiVar.k(ahtoVarE.A(46));
            }
            if (ahtoVarE.H(51)) {
                u(ahtoVarE.A(51));
            }
            if (ahtoVarE.H(23) && this.I != (colorStateListA2 = ahtoVarE.A(23))) {
                this.I = colorStateListA2;
                ad();
            }
            if (ahtoVarE.H(21) && this.J != (colorStateListA = ahtoVarE.A(21))) {
                this.J = colorStateListA;
                ad();
            }
            if (ahtoVarE.H(59)) {
                A(ahtoVarE.A(59));
            }
            afef afefVar = new afef(this, ahtoVarE);
            this.b = afefVar;
            boolean zG4 = ahtoVarE.G(0, true);
            iW2 = ahtoVarE.w(49, 1);
            if (iW2 != aeybVar.r) {
                aeybVar.r = iW2;
                aeybVar.l(false);
            }
            aeybVar.u(iW2);
            requestLayout();
            ahtoVarE.F();
            setImportantForAccessibility(2);
            setImportantForAutofill(1);
            frameLayout.addView(afeoVar);
            frameLayout.addView(afefVar);
            addView(frameLayout);
            setEnabled(zG4);
            r(zG2);
            q(zG);
            k(zG3);
            if (TextUtils.isEmpty(charSequenceD)) {
                if (I()) {
                    r(false);
                    return;
                }
                return;
            }
            if (!I()) {
                r(true);
            }
            afeiVar.c();
            afeiVar.m = charSequenceD;
            afeiVar.o.setText(charSequenceD);
            i2 = afeiVar.d;
            if (i2 != 2) {
                afeiVar.e = 2;
            }
            afeiVar.l(i2, afeiVar.e, afeiVar.m(afeiVar.o, charSequenceD));
        }
        colorForState = 0;
        this.af = 0;
        this.au = 0;
        this.av = 0;
        this.aw = 0;
        this.ax = colorForState;
        if (ahtoVarE.H(1)) {
            ColorStateList colorStateListA4 = ahtoVarE.A(1);
            this.ap = colorStateListA4;
            this.ao = colorStateListA4;
        }
        colorStateListY = afba.Y(context2, ahtoVarE, 14);
        this.as = ahtoVarE.I(14);
        this.aq = context2.getColor(com.google.android.apps.youtube.music.R.color.mtrl_textinput_default_box_stroke_color);
        this.ay = context2.getColor(com.google.android.apps.youtube.music.R.color.mtrl_textinput_disabled_color);
        this.ar = context2.getColor(com.google.android.apps.youtube.music.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListY != null) {
            if (colorStateListY.isStateful()) {
                this.aq = colorStateListY.getDefaultColor();
                this.ay = colorStateListY.getColorForState(new int[]{-16842910}, -1);
                this.ar = colorStateListY.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
                this.as = colorStateListY.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
            } else if (this.as != colorStateListY.getDefaultColor()) {
                this.as = colorStateListY.getDefaultColor();
            }
            H();
        }
        if (ahtoVarE.H(15)) {
            this.at = colorStateListY2;
            H();
        }
        if (ahtoVarE.z(50, -1) != -1) {
            aeybVar.q(ahtoVarE.z(50, 0));
            this.ap = aeybVar.h;
            if (this.c != null) {
                F(false, false);
                af();
            }
        }
        this.K = ahtoVarE.A(24);
        this.L = ahtoVarE.A(25);
        int iZ4 = ahtoVarE.z(40, 0);
        CharSequence charSequenceD4 = ahtoVarE.D(35);
        int iW4 = ahtoVarE.w(34, 1);
        boolean zG5 = ahtoVarE.G(36, false);
        int iZ5 = ahtoVarE.z(45, 0);
        boolean zG6 = ahtoVarE.G(44, false);
        charSequenceD = ahtoVarE.D(43);
        int iZ6 = ahtoVarE.z(58, 0);
        charSequenceD2 = ahtoVarE.D(57);
        boolean zG7 = ahtoVarE.G(18, false);
        l(ahtoVarE.w(19, -1));
        this.D = ahtoVarE.z(22, 0);
        this.C = ahtoVarE.z(20, 0);
        iW = ahtoVarE.w(8, 0);
        if (iW != this.m) {
            this.m = iW;
            if (this.c != null) {
                X();
            }
        }
        afeiVar.g(charSequenceD4);
        afeiVar.f(iW4);
        afeiVar.j(iZ5);
        afeiVar.h(iZ4);
        if (this.k == null) {
            AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext());
            this.k = appCompatTextView2;
            appCompatTextView2.setId(com.google.android.apps.youtube.music.R.id.textinput_placeholder);
            this.k.setImportantForAccessibility(1);
            this.k.setAccessibilityLiveRegion(1);
            drp drpVarR2 = R();
            this.G = drpVarR2;
            drpVarR2.a = 67L;
            this.H = R();
            z(this.F);
            A(this.E);
            bac.p(this.k, new afeq());
        }
        if (TextUtils.isEmpty(charSequenceD2)) {
            ab(false);
        } else {
            if (!this.j) {
                ab(true);
            }
            this.i = charSequenceD2;
        }
        ag();
        z(iZ6);
        if (ahtoVarE.H(41)) {
            afeiVar.i(ahtoVarE.A(41));
        }
        if (ahtoVarE.H(46)) {
            afeiVar.k(ahtoVarE.A(46));
        }
        if (ahtoVarE.H(51)) {
            u(ahtoVarE.A(51));
        }
        if (ahtoVarE.H(23)) {
            this.I = colorStateListA2;
            ad();
        }
        if (ahtoVarE.H(21)) {
            this.J = colorStateListA;
            ad();
        }
        if (ahtoVarE.H(59)) {
            A(ahtoVarE.A(59));
        }
        afef afefVar2 = new afef(this, ahtoVarE);
        this.b = afefVar2;
        boolean zG8 = ahtoVarE.G(0, true);
        iW2 = ahtoVarE.w(49, 1);
        if (iW2 != aeybVar.r) {
            aeybVar.r = iW2;
            aeybVar.l(false);
        }
        aeybVar.u(iW2);
        requestLayout();
        ahtoVarE.F();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        frameLayout.addView(afeoVar);
        frameLayout.addView(afefVar2);
        addView(frameLayout);
        setEnabled(zG8);
        r(zG6);
        q(zG5);
        k(zG7);
        if (TextUtils.isEmpty(charSequenceD)) {
            if (I()) {
                r(false);
                return;
            }
            return;
        }
        if (!I()) {
            r(true);
        }
        afeiVar.c();
        afeiVar.m = charSequenceD;
        afeiVar.o.setText(charSequenceD);
        i2 = afeiVar.d;
        if (i2 != 2) {
            afeiVar.e = 2;
        }
        afeiVar.l(i2, afeiVar.e, afeiVar.m(afeiVar.o, charSequenceD));
    }

    private final int M() {
        float fC;
        if (!this.M) {
            return 0;
        }
        int i = this.m;
        if (i == 0) {
            fC = this.q.c();
        } else {
            if (i != 2) {
                return 0;
            }
            boolean zAk = ak();
            aeyb aeybVar = this.q;
            if (!zAk) {
                return Math.max(0, (int) (aeybVar.c() - (aeybVar.b() / 2.0f)));
            }
            fC = aeybVar.c() / 2.0f;
        }
        return (int) fC;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    private final int N(int i, boolean z) {
        int iA;
        if (z) {
            if (h() != null) {
                iA = this.b.a();
            } else {
                iA = this.c.getCompoundPaddingLeft();
            }
        } else if (g() != null) {
            iA = this.a.a();
        } else {
            iA = this.c.getCompoundPaddingLeft();
        }
        return i + iA;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    private final int O(int i, boolean z) {
        int iA;
        if (z) {
            if (g() != null) {
                iA = this.a.a();
            } else {
                iA = this.c.getCompoundPaddingRight();
            }
        } else if (h() != null) {
            iA = this.b.a();
        } else {
            iA = this.c.getCompoundPaddingRight();
        }
        return i - iA;
    }

    private final Rect P(Rect rect) {
        if (this.c == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.ah;
        boolean zC = afba.C(this);
        rect2.bottom = rect.bottom;
        int i = this.m;
        if (i == 1) {
            rect2.left = N(rect.left, zC);
            rect2.top = rect.top + this.aa;
            rect2.right = O(rect.right, zC);
        } else if (i != 2) {
            rect2.left = N(rect.left, zC);
            rect2.top = getPaddingTop();
            rect2.right = O(rect.right, zC);
        } else {
            rect2.left = rect.left + this.c.getPaddingLeft();
            rect2.top = rect.top - M();
            rect2.right = rect.right - this.c.getPaddingRight();
        }
        return rect2;
    }

    private final Drawable Q() {
        afbe afbeVar = this.P;
        if (afbeVar != null) {
            return afbeVar;
        }
        afbe afbeVarS = S(true);
        this.P = afbeVarS;
        return afbeVarS;
    }

    private final drp R() {
        drp drpVar = new drp();
        drpVar.b = afba.r(getContext(), com.google.android.apps.youtube.music.R.attr.motionDurationShort2, 87);
        drpVar.c = afba.y(getContext(), com.google.android.apps.youtube.music.R.attr.motionEasingLinearInterpolator, aetz.a);
        return drpVar;
    }

    private final afbe S(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.google.android.apps.youtube.music.R.dimen.mtrl_shape_corner_size_small_component);
        EditText editText = this.c;
        float dimensionPixelOffset2 = editText instanceof afel ? ((afel) editText).c : getResources().getDimensionPixelOffset(com.google.android.apps.youtube.music.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        float f = true != z ? 0.0f : dimensionPixelOffset;
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(com.google.android.apps.youtube.music.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        afli afliVar = new afli((byte[]) null);
        afliVar.f(f);
        afliVar.g(f);
        afliVar.d(dimensionPixelOffset);
        afliVar.e(dimensionPixelOffset);
        afbk afbkVar = new afbk(afliVar);
        EditText editText2 = this.c;
        ColorStateList colorStateListValueOf = editText2 instanceof afel ? ((afel) editText2).d : null;
        Context context = getContext();
        int i = afbe.l;
        if (colorStateListValueOf == null) {
            colorStateListValueOf = ColorStateList.valueOf(afba.K(context, com.google.android.apps.youtube.music.R.attr.colorSurface, afbe.class.getSimpleName()));
        }
        afbe afbeVar = new afbe();
        afbeVar.n(context);
        afbeVar.q(colorStateListValueOf);
        afbeVar.p(dimensionPixelOffset2);
        afbeVar.d(afbkVar);
        afbc afbcVar = afbeVar.a;
        if (afbcVar.i == null) {
            afbcVar.i = new Rect();
        }
        afbeVar.a.i.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        afbeVar.invalidateSelf();
        return afbeVar;
    }

    private final void T() {
        if (this.c == null || this.m != 1) {
            return;
        }
        if (!ak()) {
            EditText editText = this.c;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.q.c() + this.w), this.c.getPaddingEnd(), getResources().getDimensionPixelSize(com.google.android.apps.youtube.music.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            return;
        }
        if (afba.i(getContext())) {
            EditText editText2 = this.c;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.google.android.apps.youtube.music.R.dimen.material_filled_edittext_font_2_0_padding_top), this.c.getPaddingEnd(), getResources().getDimensionPixelSize(com.google.android.apps.youtube.music.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (afba.h(getContext())) {
            EditText editText3 = this.c;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.google.android.apps.youtube.music.R.dimen.material_filled_edittext_font_1_3_padding_top), this.c.getPaddingEnd(), getResources().getDimensionPixelSize(com.google.android.apps.youtube.music.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    private final void U() {
        afbe afbeVar = this.O;
        if (afbeVar != null) {
            afbk afbkVarL = afbeVar.l();
            afbk afbkVar = this.U;
            if (afbkVarL != afbkVar) {
                this.O.d(afbkVar);
            }
            if (this.m == 2 && ai()) {
                this.O.t(this.ab, this.ae);
            }
            int iE = this.af;
            if (this.m == 1) {
                iE = avv.e(this.af, afba.J(getContext(), com.google.android.apps.youtube.music.R.attr.colorSurface, 0));
            }
            this.af = iE;
            this.O.q(ColorStateList.valueOf(iE));
            afbe afbeVar2 = this.S;
            if (afbeVar2 != null && this.T != null) {
                if (ai()) {
                    afbeVar2.q(this.c.isFocused() ? ColorStateList.valueOf(this.aq) : ColorStateList.valueOf(this.ae));
                    this.T.q(ColorStateList.valueOf(this.ae));
                }
                invalidate();
            }
            E();
        }
    }

    private final void V() {
        if (aj()) {
            ((afdx) this.O).a(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private final void W() {
        TextView textView = this.k;
        if (textView == null || !this.j) {
            return;
        }
        textView.setText((CharSequence) null);
        dse.b(this.v, this.H);
        this.k.setVisibility(4);
    }

    private final void X() {
        int i = this.m;
        if (i == 0) {
            this.O = null;
            this.S = null;
            this.T = null;
        } else if (i == 1) {
            this.O = new afbe(this.U);
            this.S = new afbe();
            this.T = new afbe();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(i + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.M || (this.O instanceof afdx)) {
                this.O = new afbe(this.U);
            } else {
                afbk afbkVar = this.U;
                int i2 = afdx.n;
                if (afbkVar == null) {
                    afbkVar = new afbk();
                }
                this.O = new afdw(new afdv(afbkVar, new RectF()));
            }
            this.S = null;
            this.T = null;
        }
        E();
        H();
        if (this.m == 1) {
            if (afba.i(getContext())) {
                this.aa = getResources().getDimensionPixelSize(com.google.android.apps.youtube.music.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (afba.h(getContext())) {
                this.aa = getResources().getDimensionPixelSize(com.google.android.apps.youtube.music.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        T();
        if (this.m != 0) {
            af();
        }
        EditText editText = this.c;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.m;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(Q());
                    return;
                }
                if (i3 == 1) {
                    if (this.Q == null) {
                        StateListDrawable stateListDrawable = new StateListDrawable();
                        this.Q = stateListDrawable;
                        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, Q());
                        this.Q.addState(new int[0], S(false));
                    }
                    autoCompleteTextView.setDropDownBackgroundDrawable(this.Q);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0090  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:55:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    private final void Y() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float lineWidth;
        int i;
        int i2;
        if (aj()) {
            RectF rectF = this.ai;
            aeyb aeybVar = this.q;
            int width = this.c.getWidth();
            int gravity = this.c.getGravity();
            boolean zE = aeybVar.E(aeybVar.k);
            aeybVar.l = zE;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zE) {
                        i2 = aeybVar.e.left;
                        f3 = i2;
                    } else {
                        f = aeybVar.e.right;
                        f2 = aeybVar.p;
                    }
                } else if (zE) {
                    f = aeybVar.e.right;
                    f2 = aeybVar.p;
                } else {
                    i2 = aeybVar.e.left;
                    f3 = i2;
                }
                Rect rect = aeybVar.e;
                rectF.left = Math.max(f3, rect.left);
                rectF.top = rect.top;
                if (gravity == 17 && (gravity & 7) != 1) {
                    if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                        if (aeybVar.l) {
                            f4 = rectF.left;
                            f5 = aeybVar.p;
                        } else {
                            i = rect.right;
                            f6 = i;
                        }
                    } else if (aeybVar.l) {
                        i = rect.right;
                        f6 = i;
                    } else {
                        f4 = rectF.left;
                        f5 = aeybVar.p;
                    }
                    rectF.right = Math.min(f6, rect.right);
                    rectF.bottom = rect.top + aeybVar.c();
                    if (aeybVar.o != null && !aeybVar.I()) {
                        StaticLayout staticLayout = aeybVar.o;
                        lineWidth = staticLayout.getLineWidth(staticLayout.getLineCount() - 1) * (aeybVar.g / aeybVar.f);
                        if (aeybVar.l) {
                            rectF.left = rectF.right - lineWidth;
                        } else {
                            rectF.right = rectF.left + lineWidth;
                        }
                    }
                    if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                    }
                    float f7 = rectF.left;
                    float f8 = this.W;
                    rectF.left = f7 - f8;
                    rectF.right += f8;
                    rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.ab);
                    rectF.top = 0.0f;
                    ((afdx) this.O).a(rectF.left, rectF.top, rectF.right, rectF.bottom);
                    return;
                }
                f4 = width / 2.0f;
                f5 = aeybVar.p / 2.0f;
                f6 = f4 + f5;
                rectF.right = Math.min(f6, rect.right);
                rectF.bottom = rect.top + aeybVar.c();
                if (aeybVar.o != null) {
                    StaticLayout staticLayout2 = aeybVar.o;
                    lineWidth = staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1) * (aeybVar.g / aeybVar.f);
                    if (aeybVar.l) {
                        rectF.left = rectF.right - lineWidth;
                    } else {
                        rectF.right = rectF.left + lineWidth;
                    }
                }
                if (rectF.width() > 0.0f) {
                }
            }
            f = width / 2.0f;
            f2 = aeybVar.p / 2.0f;
            f3 = f - f2;
            Rect rect2 = aeybVar.e;
            rectF.left = Math.max(f3, rect2.left);
            rectF.top = rect2.top;
            if (gravity == 17) {
                f4 = width / 2.0f;
                f5 = aeybVar.p / 2.0f;
                f6 = f4 + f5;
            } else {
                f4 = width / 2.0f;
                f5 = aeybVar.p / 2.0f;
                f6 = f4 + f5;
            }
            rectF.right = Math.min(f6, rect2.right);
            rectF.bottom = rect2.top + aeybVar.c();
            if (aeybVar.o != null) {
                StaticLayout staticLayout3 = aeybVar.o;
                lineWidth = staticLayout3.getLineWidth(staticLayout3.getLineCount() - 1) * (aeybVar.g / aeybVar.f);
                if (aeybVar.l) {
                    rectF.left = rectF.right - lineWidth;
                } else {
                    rectF.right = rectF.left + lineWidth;
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    private static void Z(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                Z((ViewGroup) childAt, z);
            }
        }
    }

    private final void aa(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.N)) {
            return;
        }
        this.N = charSequence;
        this.q.C(charSequence);
        if (this.p) {
            return;
        }
        Y();
    }

    private final void ab(boolean z) {
        if (this.j != z) {
            TextView textView = this.k;
            if (!z) {
                if (textView != null) {
                    textView.setVisibility(8);
                }
                this.k = null;
            } else if (textView != null) {
                this.v.addView(textView);
                this.k.setVisibility(0);
            }
            this.j = z;
        }
    }

    private final void ac() {
        if (this.h != null) {
            EditText editText = this.c;
            C(editText == null ? null : editText.getText());
        }
    }

    private final void ad() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.h;
        if (textView != null) {
            B(textView, this.g ? this.C : this.D);
            if (!this.g && (colorStateList2 = this.I) != null) {
                this.h.setTextColor(colorStateList2);
            }
            if (!this.g || (colorStateList = this.J) == null) {
                return;
            }
            this.h.setTextColor(colorStateList);
        }
    }

    private final void ae() {
        ColorStateList colorStateList;
        ColorStateList colorStateListN = this.K;
        if (colorStateListN == null) {
            colorStateListN = afba.N(getContext(), com.google.android.apps.youtube.music.R.attr.colorControlActivated);
        }
        EditText editText = this.c;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.c.getTextCursorDrawable().mutate();
        if ((J() || (this.h != null && this.g)) && (colorStateList = this.L) != null) {
            colorStateListN = colorStateList;
        }
        drawableMutate.setTintList(colorStateListN);
    }

    private final void af() {
        if (this.m != 1) {
            FrameLayout frameLayout = this.v;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iM = M();
            if (iM != layoutParams.topMargin) {
                layoutParams.topMargin = iM;
                frameLayout.requestLayout();
            }
        }
    }

    private final void ag() {
        EditText editText = this.c;
        G(editText == null ? null : editText.getText());
    }

    private final void ah(boolean z, boolean z2) {
        int defaultColor = this.at.getDefaultColor();
        int colorForState = this.at.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.at.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            defaultColor = colorForState2;
        } else if (z2) {
            defaultColor = colorForState;
        }
        this.ae = defaultColor;
    }

    private final boolean ai() {
        return this.ab >= 0 && this.ae != 0;
    }

    private final boolean aj() {
        return this.M && !TextUtils.isEmpty(this.N) && (this.O instanceof afdx);
    }

    private final boolean ak() {
        return this.q.q == 1;
    }

    private final boolean al() {
        return this.m == 1 && this.c.getMinLines() <= 1;
    }

    static /* synthetic */ int c(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    public final void A(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            TextView textView = this.k;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public final void B(TextView textView, int i) {
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(2132083747);
        textView.setTextColor(getContext().getColor(com.google.android.apps.youtube.music.R.color.design_error));
    }

    public final void C(Editable editable) {
        int iC = c(editable);
        boolean z = this.g;
        int i = this.f;
        if (i == -1) {
            this.h.setText(String.valueOf(iC));
            this.h.setContentDescription(null);
            this.g = false;
        } else {
            this.g = iC > i;
            Context context = getContext();
            TextView textView = this.h;
            int i2 = this.f;
            int i3 = true != this.g ? com.google.android.apps.youtube.music.R.string.character_counter_content_description : com.google.android.apps.youtube.music.R.string.character_counter_overflowed_content_description;
            Integer numValueOf = Integer.valueOf(iC);
            textView.setContentDescription(context.getString(i3, numValueOf, Integer.valueOf(i2)));
            if (z != this.g) {
                ad();
            }
            this.h.setText(axg.a().b(getContext().getString(com.google.android.apps.youtube.music.R.string.character_counter_pattern, numValueOf, Integer.valueOf(this.f))));
        }
        if (this.c == null || z == this.g) {
            return;
        }
        F(false, false);
        H();
        D();
    }

    public final void D() {
        Drawable background;
        TextView textView;
        EditText editText = this.c;
        if (editText == null || this.m != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        Rect rect = lx.a;
        Drawable drawableMutate = background.mutate();
        if (J()) {
            drawableMutate.setColorFilter(kl.b(b(), PorterDuff.Mode.SRC_IN));
        } else if (this.g && (textView = this.h) != null) {
            drawableMutate.setColorFilter(kl.b(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.c.refreshDrawableState();
        }
    }

    public final void E() {
        Drawable rippleDrawable;
        EditText editText = this.c;
        if (editText == null || this.O == null) {
            return;
        }
        if ((this.R || editText.getBackground() == null) && this.m != 0) {
            EditText editText2 = this.c;
            if (!(editText2 instanceof AutoCompleteTextView) || aewo.g(editText2)) {
                rippleDrawable = this.O;
            } else {
                int I = afba.I(this.c, com.google.android.apps.youtube.music.R.attr.colorControlHighlight);
                int i = this.m;
                if (i == 2) {
                    Context context = getContext();
                    afbe afbeVar = this.O;
                    int[][] iArr = u;
                    int iK = afba.K(context, com.google.android.apps.youtube.music.R.attr.colorSurface, "TextInputLayout");
                    afbe afbeVar2 = new afbe(afbeVar.l());
                    int iL = afba.L(I, iK, 0.1f);
                    afbeVar2.q(new ColorStateList(iArr, new int[]{iL, 0}));
                    afbeVar2.setTint(iK);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iL, iK});
                    afbe afbeVar3 = new afbe(afbeVar.l());
                    afbeVar3.setTint(-1);
                    rippleDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, afbeVar2, afbeVar3), afbeVar});
                } else if (i == 1) {
                    afbe afbeVar4 = this.O;
                    int i2 = this.af;
                    rippleDrawable = new RippleDrawable(new ColorStateList(u, new int[]{afba.L(I, i2, 0.1f), i2}), afbeVar4, afbeVar4);
                } else {
                    rippleDrawable = null;
                }
            }
            this.c.setBackground(rippleDrawable);
            this.R = true;
        }
    }

    public final void F(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.c;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.c;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.ao;
        if (colorStateList2 != null) {
            this.q.m(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.ao;
            int colorForState = this.ay;
            if (colorStateList3 != null) {
                colorForState = colorStateList3.getColorForState(new int[]{-16842910}, colorForState);
            }
            this.q.m(ColorStateList.valueOf(colorForState));
        } else if (J()) {
            aeyb aeybVar = this.q;
            TextView textView2 = this.d.h;
            aeybVar.m(textView2 != null ? textView2.getTextColors() : null);
        } else if (this.g && (textView = this.h) != null) {
            this.q.m(textView.getTextColors());
        } else if (z4 && (colorStateList = this.ap) != null) {
            this.q.r(colorStateList);
        }
        if (z3 || !this.az || (isEnabled() && z4)) {
            if (z2 || this.p) {
                ValueAnimator valueAnimator = this.aA;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.aA.cancel();
                }
                if (z && this.r) {
                    i(1.0f);
                } else {
                    this.q.z(1.0f);
                }
                this.p = false;
                if (aj()) {
                    Y();
                }
                ag();
                this.a.c(false);
                this.b.f(false);
                return;
            }
            return;
        }
        if (z2 || !this.p) {
            ValueAnimator valueAnimator2 = this.aA;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.aA.cancel();
            }
            if (z && this.r) {
                i(0.0f);
            } else {
                this.q.z(0.0f);
            }
            if (aj() && !((afdx) this.O).m.w.isEmpty()) {
                V();
            }
            this.p = true;
            W();
            this.a.c(true);
            this.b.f(true);
        }
    }

    public final void G(Editable editable) {
        if (c(editable) != 0 || this.p) {
            W();
            return;
        }
        if (this.k == null || !this.j || TextUtils.isEmpty(this.i)) {
            return;
        }
        this.k.setText(this.i);
        dse.b(this.v, this.G);
        this.k.setVisibility(0);
        this.k.bringToFront();
    }

    public final void H() {
        int currentTextColor;
        TextView textView;
        int i;
        int i2;
        EditText editText;
        EditText editText2;
        if (this.O == null || this.m == 0) {
            return;
        }
        boolean z = isFocused() || ((editText2 = this.c) != null && editText2.hasFocus());
        boolean z2 = isHovered() || ((editText = this.c) != null && editText.isHovered());
        if (!isEnabled()) {
            this.ae = this.ay;
        } else if (!J()) {
            if (!this.g || (textView = this.h) == null) {
                if (z) {
                    currentTextColor = this.as;
                } else {
                    currentTextColor = z2 ? this.ar : this.aq;
                }
            } else if (this.at != null) {
                ah(z, z2);
            } else {
                currentTextColor = textView.getCurrentTextColor();
            }
            this.ae = currentTextColor;
        } else if (this.at != null) {
            ah(z, z2);
        } else {
            this.ae = b();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ae();
        }
        afef afefVar = this.b;
        afefVar.r();
        TextInputLayout textInputLayout = afefVar.a;
        aewp.f(textInputLayout, afefVar.b, afefVar.c);
        afefVar.g();
        if (afefVar.c().u()) {
            if (!textInputLayout.J() || afefVar.b() == null) {
                aewp.e(textInputLayout, afefVar.d, afefVar.f, afefVar.g);
            } else {
                Drawable drawableMutate = afefVar.b().mutate();
                drawableMutate.setTint(textInputLayout.b());
                afefVar.d.setImageDrawable(drawableMutate);
            }
        }
        this.a.d();
        if (this.m == 2) {
            int i3 = this.ab;
            if (z && isEnabled()) {
                i2 = this.ad;
                this.ab = i2;
            } else {
                i2 = this.ac;
                this.ab = i2;
            }
            if (i2 != i3 && aj() && !this.p) {
                V();
                Y();
            }
        }
        if (this.m == 1) {
            if (isEnabled()) {
                if (!z2 || z) {
                    i = z ? this.aw : this.au;
                } else {
                    i = this.ax;
                }
                this.af = i;
            } else {
                this.af = this.av;
            }
        }
        U();
        if (a() == 3) {
            EditText editText3 = this.c;
            if (!(editText3 instanceof AutoCompleteTextView) || aewo.g(editText3)) {
                d().setFocusable(true);
                d().setClickable(true);
            } else {
                d().setFocusable(false);
                d().setClickable(false);
            }
        }
    }

    public final boolean I() {
        return this.d.n;
    }

    public final boolean J() {
        afei afeiVar = this.d;
        return (afeiVar.e != 1 || afeiVar.h == null || TextUtils.isEmpty(afeiVar.f)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    public final boolean K() {
        boolean z;
        boolean z2;
        if (this.c == null) {
            return false;
        }
        afeo afeoVar = this.a;
        CheckableImageButton checkableImageButton = null;
        if ((afeoVar.c.getDrawable() != null || (g() != null && afeoVar.a.getVisibility() == 0)) && afeoVar.getMeasuredWidth() > 0) {
            int iMax = Math.max(0, afeoVar.getMeasuredWidth() - this.c.getPaddingLeft());
            if (this.aj == null || this.ak != iMax) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.aj = colorDrawable;
                this.ak = iMax;
                colorDrawable.setBounds(0, 0, iMax, 1);
            }
            Drawable[] compoundDrawablesRelative = this.c.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.aj;
            if (drawable != drawable2) {
                this.c.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            } else {
                z = false;
            }
        } else if (this.aj != null) {
            Drawable[] compoundDrawablesRelative2 = this.c.getCompoundDrawablesRelative();
            this.c.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
            this.aj = null;
            z = true;
        } else {
            z = false;
        }
        afef afefVar = this.b;
        if ((afefVar.v() || ((afefVar.t() && afefVar.u()) || afefVar.h != null)) && afefVar.getMeasuredWidth() > 0) {
            int measuredWidth = afefVar.i.getMeasuredWidth() - this.c.getPaddingRight();
            if (afefVar.v()) {
                checkableImageButton = afefVar.b;
            } else if (afefVar.t() && afefVar.u()) {
                checkableImageButton = afefVar.d;
            }
            if (checkableImageButton != null) {
                measuredWidth = measuredWidth + checkableImageButton.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart();
            }
            int iMax2 = Math.max(0, measuredWidth);
            Drawable[] compoundDrawablesRelative3 = this.c.getCompoundDrawablesRelative();
            Drawable drawable3 = this.al;
            if (drawable3 != null) {
                if (this.am != iMax2) {
                    this.am = iMax2;
                    drawable3.setBounds(0, 0, iMax2, 1);
                    this.c.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.al, compoundDrawablesRelative3[3]);
                }
                return true;
            }
            ColorDrawable colorDrawable2 = new ColorDrawable();
            this.al = colorDrawable2;
            this.am = iMax2;
            colorDrawable2.setBounds(0, 0, iMax2, 1);
            Drawable drawable4 = compoundDrawablesRelative3[2];
            Drawable drawable5 = this.al;
            if (drawable4 != drawable5) {
                this.an = drawable4;
                this.c.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.al != null) {
            Drawable[] compoundDrawablesRelative4 = this.c.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.al) {
                this.c.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.an, compoundDrawablesRelative4[3]);
                z2 = true;
            } else {
                z2 = z;
            }
            this.al = null;
            return z2;
        }
        return z;
    }

    public final void L() {
        this.b.n(-1);
    }

    public final int a() {
        return this.b.e;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH) | 16;
        FrameLayout frameLayout = this.v;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        af();
        EditText editText = (EditText) view;
        if (this.c != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        a();
        this.c = editText;
        int i2 = this.y;
        if (i2 != -1) {
            x(i2);
        } else {
            y(this.A);
        }
        int i3 = this.z;
        if (i3 != -1) {
            v(i3);
        } else {
            w(this.B);
        }
        this.R = false;
        X();
        afer aferVar = new afer(this);
        EditText editText2 = this.c;
        if (editText2 != null) {
            bac.p(editText2, aferVar);
        }
        aeyb aeybVar = this.q;
        Typeface typeface = this.c.getTypeface();
        boolean zF = aeybVar.F(typeface);
        boolean zG = aeybVar.G(typeface);
        if (zF || zG) {
            aeybVar.l(false);
        }
        aeybVar.y(this.c.getTextSize());
        float letterSpacing = this.c.getLetterSpacing();
        if (aeybVar.n != letterSpacing) {
            aeybVar.n = letterSpacing;
            aeybVar.l(false);
        }
        int gravity = this.c.getGravity();
        aeybVar.s((gravity & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH) | 48);
        aeybVar.x(gravity);
        this.o = editText.getMinimumHeight();
        this.c.addTextChangedListener(new afep(this, editText));
        if (this.ao == null) {
            this.ao = this.c.getHintTextColors();
        }
        if (this.M) {
            if (TextUtils.isEmpty(this.N)) {
                CharSequence hint = this.c.getHint();
                this.x = hint;
                s(hint);
                this.c.setHint((CharSequence) null);
            }
            this.l = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ae();
        }
        if (this.h != null) {
            C(this.c.getText());
        }
        D();
        this.d.b();
        this.a.bringToFront();
        afef afefVar = this.b;
        afefVar.bringToFront();
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((avgj) it.next()).d(this);
        }
        afefVar.s();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        F(false, true);
    }

    public final int b() {
        TextView textView = this.d.h;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final CheckableImageButton d() {
        return this.b.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.c;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.x != null) {
            boolean z = this.l;
            this.l = false;
            CharSequence hint = editText.getHint();
            this.c.setHint(this.x);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.c.setHint(hint);
                this.l = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.v;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.c) {
                viewStructureNewChild.setHint(f());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.s = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.s = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        afbe afbeVar;
        super.draw(canvas);
        if (this.M) {
            this.q.h(canvas);
        }
        if (this.T == null || (afbeVar = this.S) == null) {
            return;
        }
        afbeVar.draw(canvas);
        if (this.c.isFocused()) {
            Rect bounds = this.T.getBounds();
            Rect bounds2 = this.S.getBounds();
            float f = this.q.a;
            int iCenterX = bounds2.centerX();
            bounds.left = aetz.b(iCenterX, bounds2.left, f);
            bounds.right = aetz.b(iCenterX, bounds2.right, f);
            this.T.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        if (this.aB) {
            return;
        }
        this.aB = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        aeyb aeybVar = this.q;
        boolean zH = aeybVar != null ? aeybVar.H(drawableState) : false;
        if (this.c != null) {
            F(isLaidOut() && isEnabled(), false);
        }
        D();
        H();
        if (zH) {
            invalidate();
        }
        this.aB = false;
    }

    public final CharSequence e() {
        afei afeiVar = this.d;
        if (afeiVar.g) {
            return afeiVar.f;
        }
        return null;
    }

    public final CharSequence f() {
        if (this.M) {
            return this.N;
        }
        return null;
    }

    public final CharSequence g() {
        return this.a.b;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final int getBaseline() {
        EditText editText = this.c;
        return editText != null ? editText.getBaseline() + getPaddingTop() + M() : super.getBaseline();
    }

    public final CharSequence h() {
        return this.b.h;
    }

    final void i(float f) {
        aeyb aeybVar = this.q;
        if (aeybVar.a != f) {
            if (this.aA == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.aA = valueAnimator;
                valueAnimator.setInterpolator(afba.y(getContext(), com.google.android.apps.youtube.music.R.attr.motionEasingEmphasizedInterpolator, aetz.b));
                this.aA.setDuration(afba.r(getContext(), com.google.android.apps.youtube.music.R.attr.motionDurationMedium4, 167));
                this.aA.addUpdateListener(new afcg(this, 6));
            }
            this.aA.setFloatValues(aeybVar.a, f);
            this.aA.start();
        }
    }

    public final void j(int i) {
        if (this.as != i) {
            this.as = i;
            H();
        }
    }

    public final void k(boolean z) {
        if (this.e != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.h = appCompatTextView;
                appCompatTextView.setId(com.google.android.apps.youtube.music.R.id.textinput_counter);
                this.h.setMaxLines(1);
                this.d.a(this.h, 2);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.google.android.apps.youtube.music.R.dimen.mtrl_textinput_counter_margin_start));
                ad();
                ac();
            } else {
                this.d.e(this.h, 2);
                this.h = null;
            }
            this.e = z;
        }
    }

    public final void l(int i) {
        if (this.f != i) {
            if (i <= 0) {
                i = -1;
            }
            this.f = i;
            if (this.e) {
                ac();
            }
        }
    }

    public final void m(int i) {
        this.b.l(i);
    }

    public final void n(Drawable drawable) {
        this.b.m(drawable);
    }

    public final void o(ColorStateList colorStateList) {
        afef afefVar = this.b;
        if (afefVar.f != colorStateList) {
            afefVar.f = colorStateList;
            aewp.e(afefVar.a, afefVar.d, afefVar.f, afefVar.g);
        }
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.q.k(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        afef afefVar = this.b;
        afefVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.aC = false;
        if (this.c != null) {
            int iMax = Math.max(afefVar.getMeasuredHeight(), this.a.getMeasuredHeight());
            if (this.c.getMeasuredHeight() < iMax) {
                this.c.setMinimumHeight(iMax);
                z = true;
            }
        }
        boolean zK = K();
        if (z || zK) {
            this.c.post(new aemk(this, 20, null));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.c;
        if (editText != null) {
            Rect rect = this.ag;
            aeyc.a(this, editText, rect);
            if (this.S != null) {
                this.S.setBounds(rect.left, rect.bottom - this.ac, rect.right, rect.bottom);
            }
            if (this.T != null) {
                this.T.setBounds(rect.left, rect.bottom - this.ad, rect.right, rect.bottom);
            }
            if (this.M) {
                aeyb aeybVar = this.q;
                aeybVar.y(this.c.getTextSize());
                int gravity = this.c.getGravity();
                aeybVar.s((gravity & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH) | 48);
                aeybVar.x(gravity);
                aeybVar.n(P(rect));
                if (this.c == null) {
                    throw new IllegalStateException();
                }
                Rect rect2 = this.ah;
                float fE = ak() ? aeybVar.e() : aeybVar.d() * aeybVar.i;
                rect2.left = rect.left + this.c.getCompoundPaddingLeft();
                if (al()) {
                    compoundPaddingTop = (int) (rect.centerY() - (fE / 2.0f));
                } else {
                    compoundPaddingTop = (rect.top + this.c.getCompoundPaddingTop()) - ((this.m != 0 || ak()) ? 0 : (int) (aeybVar.e() / 2.0f));
                }
                rect2.top = compoundPaddingTop;
                rect2.right = rect.right - this.c.getCompoundPaddingRight();
                rect2.bottom = al() ? (int) (rect2.top + fE) : rect.bottom - this.c.getCompoundPaddingBottom();
                aeybVar.t(rect2.left, rect2.top, rect2.right, rect2.bottom, true);
                aeybVar.l(false);
                if (!aj() || this.p) {
                    return;
                }
                Y();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        if (!this.aC) {
            this.b.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.aC = true;
        }
        if (this.k != null && (editText = this.c) != null) {
            this.k.setGravity(editText.getGravity());
            this.k.setPadding(this.c.getCompoundPaddingLeft(), this.c.getCompoundPaddingTop(), this.c.getCompoundPaddingRight(), this.c.getCompoundPaddingBottom());
        }
        this.b.s();
        if (ak()) {
            return;
        }
        int measuredWidth = (this.c.getMeasuredWidth() - this.c.getCompoundPaddingLeft()) - this.c.getCompoundPaddingRight();
        aeyb aeybVar = this.q;
        TextPaint textPaint = aeybVar.m;
        aeybVar.i(textPaint);
        float f = measuredWidth;
        aeybVar.s = aeybVar.g(aeybVar.r, textPaint, aeybVar.k, (aeybVar.g / aeybVar.f) * f, aeybVar.l).getHeight();
        aeybVar.j(textPaint);
        aeybVar.t = aeybVar.g(aeybVar.q, textPaint, aeybVar.k, f, aeybVar.l).getHeight();
        Rect rect = this.ag;
        aeyc.a(this, this.c, rect);
        aeybVar.n(P(rect));
        af();
        T();
        if (this.c != null) {
            int i3 = aeybVar.t;
            float fE = i3 != -1 ? i3 : aeybVar.e();
            float height = 0.0f;
            if (this.i != null) {
                TextPaint textPaint2 = new TextPaint(129);
                textPaint2.set(this.k.getPaint());
                textPaint2.setTextSize(this.k.getTextSize());
                textPaint2.setTypeface(this.k.getTypeface());
                textPaint2.setLetterSpacing(this.k.getLetterSpacing());
                try {
                    aeyh aeyhVar = new aeyh(this.i, textPaint2, measuredWidth);
                    aeyhVar.e = getLayoutDirection() == 1;
                    aeyhVar.d = true;
                    aeyhVar.b(this.k.getLineSpacingExtra(), this.k.getLineSpacingMultiplier());
                    aeyhVar.g = new avgj(this, null);
                    height = aeyhVar.a().getHeight() + (this.m == 1 ? aeybVar.c() + this.aa + this.w : 0.0f);
                } catch (aeyg e) {
                    Log.e("TextInputLayout", e.getCause().getMessage(), e);
                }
            }
            float fMax = Math.max(fE, height);
            if (this.c.getMeasuredHeight() < fMax) {
                this.c.setMinimumHeight(Math.round(fMax));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof afet)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        afet afetVar = (afet) parcelable;
        super.onRestoreInstanceState(afetVar.d);
        CharSequence charSequence = afetVar.a;
        afei afeiVar = this.d;
        if (afeiVar.g) {
            if (TextUtils.isEmpty(charSequence)) {
                afeiVar.d();
            } else {
                afeiVar.c();
                afeiVar.f = charSequence;
                afeiVar.h.setText(charSequence);
                i = afeiVar.d;
                if (i != 1) {
                    afeiVar.e = 1;
                }
                afeiVar.l(i, afeiVar.e, afeiVar.m(afeiVar.h, charSequence));
            }
        } else if (!TextUtils.isEmpty(charSequence)) {
            q(true);
            if (TextUtils.isEmpty(charSequence)) {
                afeiVar.c();
                afeiVar.f = charSequence;
                afeiVar.h.setText(charSequence);
                i = afeiVar.d;
                if (i != 1) {
                    afeiVar.e = 1;
                }
                afeiVar.l(i, afeiVar.e, afeiVar.m(afeiVar.h, charSequence));
            } else {
                afeiVar.d();
            }
        }
        if (afetVar.b) {
            post(new afjc(this, 1, null));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.V) {
            afay afayVar = this.U.b;
            RectF rectF = this.ai;
            float fA = afayVar.a(rectF);
            float fA2 = this.U.c.a(rectF);
            float fA3 = this.U.e.a(rectF);
            float fA4 = this.U.d.a(rectF);
            afbk afbkVar = this.U;
            afba afbaVar = afbkVar.j;
            afba afbaVar2 = afbkVar.k;
            afba afbaVar3 = afbkVar.m;
            afba afbaVar4 = afbkVar.l;
            afli afliVar = new afli((byte[]) null);
            afliVar.l(afbaVar2);
            afliVar.m(afbaVar);
            afliVar.j(afbaVar4);
            afliVar.k(afbaVar3);
            afliVar.f(fA2);
            afliVar.g(fA);
            afliVar.d(fA4);
            afliVar.e(fA3);
            afbk afbkVar2 = new afbk(afliVar);
            this.V = z;
            afbe afbeVar = this.O;
            if (afbeVar == null || afbeVar.l() == afbkVar2) {
                return;
            }
            this.U = afbkVar2;
            U();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        afet afetVar = new afet(super.onSaveInstanceState());
        if (J()) {
            afetVar.a = e();
        }
        afef afefVar = this.b;
        boolean z = false;
        if (afefVar.t() && afefVar.d.a) {
            z = true;
        }
        afetVar.b = z;
        return afetVar;
    }

    public final void p(boolean z) {
        this.b.o(z);
    }

    public final void q(boolean z) {
        afei afeiVar = this.d;
        if (afeiVar.g != z) {
            afeiVar.c();
            if (z) {
                afeiVar.h = new AppCompatTextView(afeiVar.a);
                afeiVar.h.setId(com.google.android.apps.youtube.music.R.id.textinput_error);
                afeiVar.h.setTextAlignment(5);
                afeiVar.h(afeiVar.k);
                afeiVar.i(afeiVar.l);
                afeiVar.g(afeiVar.i);
                afeiVar.f(afeiVar.j);
                afeiVar.h.setVisibility(4);
                afeiVar.a(afeiVar.h, 0);
            } else {
                afeiVar.d();
                afeiVar.e(afeiVar.h, 0);
                afeiVar.h = null;
                TextInputLayout textInputLayout = afeiVar.b;
                textInputLayout.D();
                textInputLayout.H();
            }
            afeiVar.g = z;
        }
    }

    public final void r(boolean z) {
        afei afeiVar = this.d;
        if (afeiVar.n != z) {
            afeiVar.c();
            if (z) {
                afeiVar.o = new AppCompatTextView(afeiVar.a);
                afeiVar.o.setId(com.google.android.apps.youtube.music.R.id.textinput_helper_text);
                afeiVar.o.setTextAlignment(5);
                afeiVar.o.setVisibility(4);
                afeiVar.o.setImportantForAccessibility(2);
                afeiVar.j(afeiVar.p);
                afeiVar.k(afeiVar.q);
                afeiVar.a(afeiVar.o, 1);
            } else {
                afeiVar.c();
                int i = afeiVar.d;
                if (i == 2) {
                    afeiVar.e = 0;
                }
                afeiVar.l(i, afeiVar.e, afeiVar.m(afeiVar.o, ""));
                afeiVar.e(afeiVar.o, 1);
                afeiVar.o = null;
                TextInputLayout textInputLayout = afeiVar.b;
                textInputLayout.D();
                textInputLayout.H();
            }
            afeiVar.n = z;
        }
    }

    public final void s(CharSequence charSequence) {
        if (this.M) {
            aa(charSequence);
            sendAccessibilityEvent(SemanticState.Modal);
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        Z(this, z);
        super.setEnabled(z);
    }

    public final void t(boolean z) {
        if (z != this.M) {
            this.M = z;
            if (z) {
                CharSequence hint = this.c.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.N)) {
                        s(hint);
                    }
                    this.c.setHint((CharSequence) null);
                }
                this.l = true;
            } else {
                this.l = false;
                if (!TextUtils.isEmpty(this.N) && TextUtils.isEmpty(this.c.getHint())) {
                    this.c.setHint(this.N);
                }
                aa(null);
            }
            if (this.c != null) {
                af();
            }
        }
    }

    public final void u(ColorStateList colorStateList) {
        if (this.ap != colorStateList) {
            if (this.ao == null) {
                this.q.r(colorStateList);
            }
            this.ap = colorStateList;
            if (this.c != null) {
                F(false, false);
            }
        }
    }

    public final void v(int i) {
        this.z = i;
        EditText editText = this.c;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public final void w(int i) {
        this.B = i;
        EditText editText = this.c;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public final void x(int i) {
        this.y = i;
        EditText editText = this.c;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public final void y(int i) {
        this.A = i;
        EditText editText = this.c;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public final void z(int i) {
        this.F = i;
        TextView textView = this.k;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.youtube.music.R.attr.textInputStyle);
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }
}

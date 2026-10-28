package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import androidx.car.app.model.Alert;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.preference.SliderPreference;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.slider.Slider;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class afcd extends View {
    public static final String a = "afcd";
    static final int b = 2132085894;
    private static final int m = 2130970049;
    private static final int n = 2130970052;
    private static final int o = 2130970059;
    private static final int p = 2130970057;
    private boolean A;
    private ValueAnimator B;
    private ValueAnimator C;
    private final int D;
    private final int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private ArrayList aA;
    private int aB;
    private float aC;
    private int aD;
    private float[] aE;
    private int aF;
    private int aG;
    private int aH;
    private int aI;
    private boolean aJ;
    private boolean aK;
    private ColorStateList aL;
    private ColorStateList aM;
    private ColorStateList aN;
    private ColorStateList aO;
    private ColorStateList aP;
    private final Path aQ;
    private final RectF aR;
    private final RectF aS;
    private final RectF aT;
    private final RectF aU;
    private final Rect aV;
    private final RectF aW;
    private final Rect aX;
    private final Matrix aY;
    private final List aZ;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private boolean ag;
    private Drawable ah;
    private boolean ai;
    private Drawable aj;
    private boolean ak;
    private ColorStateList al;
    private Drawable am;
    private boolean an;
    private Drawable ao;
    private boolean ap;
    private ColorStateList aq;
    private int ar;
    private int as;
    private int at;
    private float au;
    private float av;
    private MotionEvent aw;
    private final Rect ax;
    private List ay;
    private boolean az;
    private List ba;
    private float bb;
    private float bc;
    private ColorStateList bd;
    private ColorStateList be;
    private float bf;
    private final ViewTreeObserver.OnScrollChangedListener bg;
    private final ViewTreeObserver.OnGlobalLayoutListener bh;
    private boolean bi;
    public final afca c;
    public final List d;
    public final List e;
    public final List f;
    List g;
    public float h;
    public float i;
    public int j;
    public final int k;
    public final Runnable l;
    private final Paint q;
    private final Paint r;
    private final Paint s;
    private final Paint t;
    private final Paint u;
    private final Paint v;
    private final Paint w;
    private final AccessibilityManager x;
    private afbz y;
    private int z;

    /* JADX WARN: Illegal instructions before constructor call */
    public afcd(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListF;
        int i2 = b;
        super(afev.a(context, attributeSet, i, i2), attributeSet, i);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.A = false;
        this.aa = -1;
        this.ab = -1;
        this.ac = -1;
        this.ag = false;
        this.ai = false;
        this.ak = false;
        this.an = false;
        this.ap = false;
        this.ax = new Rect();
        this.g = new ArrayList();
        this.ay = new ArrayList();
        this.az = false;
        this.aA = new ArrayList();
        this.j = -1;
        this.aB = -1;
        this.aC = 0.0f;
        this.aD = 0;
        this.aJ = false;
        this.aQ = new Path();
        this.aR = new RectF();
        this.aS = new RectF();
        this.aT = new RectF();
        this.aU = new RectF();
        this.aV = new Rect();
        this.aW = new RectF();
        this.aX = new Rect();
        this.aY = new Matrix();
        this.aZ = new ArrayList();
        this.ba = Collections.EMPTY_LIST;
        this.bg = new afbx(this, 0);
        byte[] bArr = null;
        this.bh = new jg(this, 11, bArr);
        this.l = new aemk(this, 14, bArr);
        Context context2 = getContext();
        this.bi = isShown();
        Paint paint = new Paint();
        this.q = paint;
        Paint paint2 = new Paint();
        this.r = paint2;
        Paint paint3 = new Paint(1);
        this.s = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.t = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.u = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.v = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        Paint paint7 = new Paint();
        this.w = paint7;
        paint7.setStyle(Paint.Style.FILL);
        paint7.setStrokeCap(Paint.Cap.ROUND);
        this.E = context2.getResources().getDimensionPixelSize(R.dimen.m3_slider_focus_ring_thumb_height_decrease);
        Resources resources = context2.getResources();
        this.O = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.F = dimensionPixelOffset;
        this.S = dimensionPixelOffset;
        this.G = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.H = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.I = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.J = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.K = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_min_spacing);
        this.at = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        this.as = resources.getDimensionPixelOffset(R.dimen.m3_slider_track_icon_padding);
        this.M = resources.getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayA = aeym.a(context2, attributeSet, afce.a, i, i2, new int[0]);
        int i3 = typedArrayA.getInt(2, 0);
        if (this.N != i3) {
            this.N = i3;
            Z(true);
        }
        this.z = typedArrayA.getResourceId(11, R.style.Widget_MaterialComponents_Tooltip);
        this.h = typedArrayA.getFloat(4, 0.0f);
        this.i = typedArrayA.getFloat(5, 1.0f);
        boolean z = typedArrayA.getBoolean(6, false);
        if (this.ag != z) {
            this.ag = z;
            float f = this.h;
            if (z) {
                h(Float.valueOf((f + this.i) / 2.0f));
            } else {
                h(Float.valueOf(f));
            }
            Z(true);
        }
        this.aC = typedArrayA.getFloat(3, 0.0f);
        this.aD = typedArrayA.getInt(7, 0);
        Resources.Theme theme = context2.getTheme();
        TypedValue typedValueU = afba.u(theme, R.attr.minTouchTargetSize);
        float dimension = Float.NaN;
        if (typedValueU != null && typedValueU.type == 5) {
            dimension = typedValueU.getDimension(theme.getResources().getDisplayMetrics());
        }
        float f2 = dimension;
        this.L = (int) Math.ceil(typedArrayA.getDimension(12, (int) (Float.isNaN(f2) ? context2.getResources().getDimension(R.dimen.mtrl_min_touch_target_size) : f2)));
        boolean zHasValue = typedArrayA.hasValue(28);
        int i4 = zHasValue ? 28 : 30;
        int i5 = true != zHasValue ? 29 : 28;
        ColorStateList colorStateListF2 = afba.f(context2, typedArrayA, i4);
        colorStateListF2 = colorStateListF2 == null ? avg.d(context2, R.color.material_slider_inactive_track_color) : colorStateListF2;
        if (!colorStateListF2.equals(this.aP)) {
            this.aP = colorStateListF2;
            paint.setColor(v(colorStateListF2));
            invalidate();
        }
        ColorStateList colorStateListF3 = afba.f(context2, typedArrayA, i5);
        colorStateListF3 = colorStateListF3 == null ? avg.d(context2, R.color.material_slider_active_track_color) : colorStateListF3;
        if (!colorStateListF3.equals(this.aO)) {
            this.aO = colorStateListF3;
            paint2.setColor(v(colorStateListF3));
            invalidate();
        }
        ColorStateList colorStateListF4 = afba.f(context2, typedArrayA, 13);
        colorStateListF4 = colorStateListF4 == null ? avg.d(context2, R.color.material_slider_thumb_color) : colorStateListF4;
        if (!colorStateListF4.equals(this.be)) {
            this.be = colorStateListF4;
            int i6 = 0;
            while (true) {
                List list = this.aZ;
                if (i6 >= list.size()) {
                    break;
                }
                ((afbe) list.get(i6)).q(this.be);
                i6++;
            }
            invalidate();
        }
        if (typedArrayA.hasValue(17) && (colorStateListF = afba.f(context2, typedArrayA, 17)) != this.bd) {
            this.bd = colorStateListF;
            int i7 = 0;
            while (true) {
                List list2 = this.aZ;
                if (i7 >= list2.size()) {
                    break;
                }
                ((afbe) list2.get(i7)).u(colorStateListF);
                i7++;
            }
            postInvalidate();
        }
        float dimension2 = typedArrayA.getDimension(18, 0.0f);
        if (dimension2 != this.bc) {
            this.bc = dimension2;
            int i8 = 0;
            while (true) {
                List list3 = this.aZ;
                if (i8 >= list3.size()) {
                    break;
                }
                ((afbe) list3.get(i8)).w(dimension2);
                i8++;
            }
            postInvalidate();
        }
        ColorStateList colorStateListF5 = afba.f(context2, typedArrayA, 8);
        colorStateListF5 = colorStateListF5 == null ? avg.d(context2, R.color.material_slider_halo_color) : colorStateListF5;
        if (!colorStateListF5.equals(this.aL)) {
            this.aL = colorStateListF5;
            RippleDrawable rippleDrawableZ = z();
            if (ah() || rippleDrawableZ == null) {
                Paint paint8 = this.t;
                paint8.setColor(v(colorStateListF5));
                paint8.setAlpha(63);
                invalidate();
            } else {
                rippleDrawableZ.setColor(colorStateListF5);
            }
        }
        this.aF = typedArrayA.hasValue(26) ? typedArrayA.getInt(26, -1) : true != typedArrayA.getBoolean(27, true) ? 2 : 0;
        boolean zHasValue2 = typedArrayA.hasValue(21);
        int i9 = zHasValue2 ? 21 : 23;
        int i10 = true != zHasValue2 ? 22 : 21;
        ColorStateList colorStateListF6 = afba.f(context2, typedArrayA, i9);
        colorStateListF6 = colorStateListF6 == null ? avg.d(context2, R.color.material_slider_inactive_tick_marks_color) : colorStateListF6;
        if (!colorStateListF6.equals(this.aN)) {
            this.aN = colorStateListF6;
            this.u.setColor(v(colorStateListF6));
            invalidate();
        }
        ColorStateList colorStateListF7 = afba.f(context2, typedArrayA, i10);
        colorStateListF7 = colorStateListF7 == null ? avg.d(context2, R.color.material_slider_active_tick_marks_color) : colorStateListF7;
        if (!colorStateListF7.equals(this.aM)) {
            this.aM = colorStateListF7;
            this.v.setColor(v(colorStateListF7));
            invalidate();
        }
        int dimensionPixelSize = typedArrayA.getDimensionPixelSize(19, 0);
        if (this.W != dimensionPixelSize) {
            this.W = dimensionPixelSize;
            invalidate();
        }
        int dimensionPixelSize2 = typedArrayA.getDimensionPixelSize(41, 0);
        if (this.ad != dimensionPixelSize2) {
            this.ad = dimensionPixelSize2;
            this.w.setStrokeWidth(dimensionPixelSize2);
            invalidate();
        }
        int dimensionPixelSize3 = typedArrayA.getDimensionPixelSize(31, -1);
        if (this.ae != dimensionPixelSize3) {
            this.ae = dimensionPixelSize3;
            invalidate();
        }
        int dimensionPixelSize4 = typedArrayA.getDimensionPixelSize(40, 0);
        if (this.af != dimensionPixelSize4) {
            this.af = dimensionPixelSize4;
            invalidate();
        }
        Drawable drawableG = afba.g(context2, typedArrayA, 35);
        if (drawableG != this.ah) {
            this.ah = drawableG;
            this.ai = false;
            V();
            invalidate();
        }
        Drawable drawableG2 = afba.g(context2, typedArrayA, 34);
        if (drawableG2 != this.aj) {
            this.aj = drawableG2;
            this.ak = false;
            U();
            invalidate();
        }
        ColorStateList colorStateListF8 = afba.f(context2, typedArrayA, 33);
        if (colorStateListF8 != this.al) {
            this.al = colorStateListF8;
            V();
            U();
            invalidate();
        }
        Drawable drawableG3 = afba.g(context2, typedArrayA, 38);
        if (drawableG3 != this.am) {
            this.am = drawableG3;
            this.an = false;
            X();
            invalidate();
        }
        Drawable drawableG4 = afba.g(context2, typedArrayA, 37);
        if (drawableG4 != this.ao) {
            this.ao = drawableG4;
            this.ap = false;
            W();
            invalidate();
        }
        ColorStateList colorStateListF9 = afba.f(context2, typedArrayA, 36);
        if (colorStateListF9 != this.aq) {
            this.aq = colorStateListF9;
            X();
            W();
            invalidate();
        }
        int dimensionPixelSize5 = typedArrayA.getDimensionPixelSize(39, 0);
        if (this.ar != dimensionPixelSize5) {
            this.ar = dimensionPixelSize5;
            invalidate();
        }
        int dimensionPixelSize6 = typedArrayA.getDimensionPixelSize(16, 0) << 1;
        int dimensionPixelSize7 = typedArrayA.getDimensionPixelSize(20, dimensionPixelSize6);
        int dimensionPixelSize8 = typedArrayA.getDimensionPixelSize(15, dimensionPixelSize6);
        if (dimensionPixelSize7 != this.T) {
            this.T = dimensionPixelSize7;
            for (int i11 = 0; i11 < this.ba.size(); i11++) {
                B(dimensionPixelSize7, (Drawable) this.ba.get(i11));
            }
            O(dimensionPixelSize7, -1, null);
        }
        if (dimensionPixelSize8 != this.U) {
            this.U = dimensionPixelSize8;
            int i12 = 0;
            while (true) {
                List list4 = this.aZ;
                if (i12 >= list4.size()) {
                    break;
                }
                ((afbe) list4.get(i12)).setBounds(0, 0, this.T, this.U);
                i12++;
            }
            Iterator it = this.ba.iterator();
            while (it.hasNext()) {
                B(this.T, (Drawable) it.next());
            }
            Z(false);
        }
        int dimensionPixelSize9 = typedArrayA.getDimensionPixelSize(9, 0);
        if (dimensionPixelSize9 != this.V) {
            this.V = dimensionPixelSize9;
            RippleDrawable rippleDrawableZ2 = z();
            if (ah() || rippleDrawableZ2 == null) {
                postInvalidate();
            } else {
                rippleDrawableZ2.setRadius(this.V);
            }
        }
        float dimension3 = typedArrayA.getDimension(14, 0.0f);
        if (dimension3 != this.bb) {
            this.bb = dimension3;
            int i13 = 0;
            while (true) {
                List list5 = this.aZ;
                if (i13 >= list5.size()) {
                    break;
                }
                ((afbe) list5.get(i13)).p(this.bb);
                i13++;
            }
        }
        int dimensionPixelSize10 = typedArrayA.getDimensionPixelSize(32, 0);
        if (this.R != dimensionPixelSize10) {
            this.R = dimensionPixelSize10;
            this.q.setStrokeWidth(dimensionPixelSize10);
            this.r.setStrokeWidth(this.R);
            Z(false);
        }
        int dimensionPixelSize11 = typedArrayA.getDimensionPixelSize(24, this.ad / 2);
        if (this.aG != dimensionPixelSize11) {
            this.aG = dimensionPixelSize11;
            this.v.setStrokeWidth(dimensionPixelSize11 << 1);
            Z(false);
        }
        int dimensionPixelSize12 = typedArrayA.getDimensionPixelSize(25, this.ad / 2);
        if (this.aH != dimensionPixelSize12) {
            this.aH = dimensionPixelSize12;
            this.u.setStrokeWidth(dimensionPixelSize12 << 1);
            Z(false);
        }
        int i14 = typedArrayA.getInt(10, 0);
        if (this.Q != i14) {
            this.Q = i14;
            Z(true);
        }
        if (!typedArrayA.getBoolean(0, true)) {
            setEnabled(false);
        }
        h(Float.valueOf(this.h));
        typedArrayA.recycle();
        setFocusable(true);
        setClickable(true);
        this.D = ViewConfiguration.get(context2).getScaledTouchSlop();
        afca afcaVar = new afca(this);
        this.c = afcaVar;
        bac.p(this, afcaVar);
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.x = accessibilityManager;
        this.k = Build.VERSION.SDK_INT >= 29 ? accessibilityManager.getRecommendedTimeoutMillis(10000, 6) : 120000;
    }

    private final FocusRingDrawable A() {
        return FocusRingDrawable.a(getBackground());
    }

    private final void B(int i, Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1) {
            if (intrinsicHeight == -1) {
                drawable.setBounds(0, 0, i, this.U);
                return;
            }
            intrinsicWidth = -1;
        }
        float fMax = Math.max(i, this.U) / Math.max(intrinsicWidth, intrinsicHeight);
        drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
    }

    private final void C(afex afexVar) {
        ViewGroup viewGroupZ = afba.z(this);
        if (viewGroupZ != null) {
            afexVar.C(viewGroupZ);
            viewGroupZ.addOnLayoutChangeListener(afexVar.o);
        }
    }

    private final void D(Canvas canvas, RectF rectF, Drawable drawable, boolean z) {
        if (drawable != null) {
            RectF rectF2 = this.aW;
            int i = this.ar;
            int i2 = this.as;
            if (rectF.right - rectF.left >= (i2 << 1) + i) {
                float f = i;
                float f2 = i2;
                boolean z2 = true;
                if (!l() && !m()) {
                    z2 = false;
                }
                float f3 = z ^ z2 ? rectF.left + f2 : (rectF.right - f2) - f;
                float fU = u() - (f / 2.0f);
                rectF2.set(f3, fU, f + f3, fU + f);
            } else {
                rectF2.setEmpty();
            }
            if (rectF2.isEmpty()) {
                return;
            }
            if (m()) {
                this.aY.mapRect(rectF2);
            }
            Rect rect = this.aX;
            rectF2.round(rect);
            drawable.setBounds(rect);
            drawable.draw(canvas);
        }
    }

    private final void E(afex afexVar) {
        ViewGroup viewGroupZ = afba.z(this);
        if (viewGroupZ != null) {
            viewGroupZ.getOverlay().remove(afexVar);
            viewGroupZ.removeOnLayoutChangeListener(afexVar.o);
        }
    }

    private final void F(Canvas canvas, float f, float f2) {
        for (int i = 0; i < this.aA.size(); i++) {
            float fS = s(((Float) this.aA.get(i)).floatValue());
            float fT = t(i) + (this.T / 2.0f);
            if (f >= fS - fT && f <= fS + fT) {
                return;
            }
        }
        boolean zM = m();
        Paint paint = this.w;
        if (zM) {
            canvas.drawPoint(f2, f, paint);
        } else {
            canvas.drawPoint(f, f2, paint);
        }
    }

    private final void G(Canvas canvas, int i, int i2, float f, Drawable drawable) {
        canvas.save();
        if (m()) {
            canvas.concat(this.aY);
        }
        canvas.translate((this.S + ((int) (r(f) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    private final void H(int i, int i2, Canvas canvas, Paint paint) {
        while (i < i2) {
            boolean zM = m();
            float[] fArr = this.aE;
            float f = zM ? fArr[i + 1] : fArr[i];
            int i3 = 0;
            while (true) {
                if (i3 >= this.aA.size()) {
                    if (!this.ag) {
                        float[] fArr2 = this.aE;
                        canvas.drawPoint(fArr2[i], fArr2[i + 1], paint);
                        break;
                        break;
                    }
                    int i4 = this.aI + (this.S << 1);
                    float f2 = this.W;
                    float f3 = i4 / 2.0f;
                    if (f >= f3 - f2 && f <= f3 + f2) {
                        break;
                    }
                    float[] fArr3 = this.aE;
                    canvas.drawPoint(fArr3[i], fArr3[i + 1], paint);
                    break;
                }
                float fS = s(((Float) this.aA.get(i3)).floatValue());
                float fT = t(i3) + (this.T / 2.0f);
                if (f >= fS - fT && f <= fS + fT) {
                    break;
                } else {
                    i3++;
                }
            }
            i += 2;
        }
    }

    private final void I(Canvas canvas, RectF rectF, RectF rectF2) {
        if (this.ah == null && this.aj == null && this.am == null && this.ao == null) {
            return;
        }
        if (this.aA.size() > 1) {
            Log.w(a, "Track icons can only be used when only 1 thumb is present.");
        }
        D(canvas, rectF, this.ah, true);
        D(canvas, rectF2, this.am, true);
        D(canvas, rectF, this.aj, false);
        D(canvas, rectF2, this.ao, false);
    }

    private final void J(boolean z) {
        if (!this.A) {
            this.A = true;
            ValueAnimator valueAnimatorY = y(true);
            this.B = valueAnimatorY;
            this.C = null;
            valueAnimatorY.start();
        }
        List list = this.d;
        Iterator it = list.iterator();
        if (z) {
            for (int i = 0; i < this.aA.size() && it.hasNext(); i++) {
                if (i != this.aB) {
                    P((afex) it.next(), ((Float) this.aA.get(i)).floatValue());
                }
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(list.size()), Integer.valueOf(this.aA.size())));
        }
        P((afex) it.next(), ((Float) this.aA.get(this.aB)).floatValue());
    }

    private final void K() {
        if (this.A) {
            this.A = false;
            ValueAnimator valueAnimatorY = y(false);
            this.C = valueAnimatorY;
            this.B = null;
            valueAnimatorY.addListener(new afby(this));
            this.C.start();
        }
    }

    private final void L() {
        for (SliderPreference sliderPreference : this.f) {
        }
    }

    private final void M() {
        for (SliderPreference sliderPreference : this.f) {
            Slider slider = (Slider) this;
            int iH = avkz.h(slider.q());
            if (sliderPreference.U(Integer.valueOf(iH))) {
                sliderPreference.l(iH);
            } else {
                slider.r(sliderPreference.a);
                qcb qcbVar = sliderPreference.f;
                if (qcbVar != null) {
                    sliderPreference.n(qcbVar.q(sliderPreference.a));
                }
            }
        }
    }

    private final void N() {
        int i;
        if (!ab() || (i = this.aa) == -1 || this.ab == -1) {
            return;
        }
        O(i, this.ac, Integer.valueOf(this.j));
    }

    private final void O(int i, int i2, Integer num) {
        int i3 = 0;
        while (true) {
            List list = this.aZ;
            if (i3 >= list.size()) {
                Z(false);
                return;
            }
            if (num == null || i3 == num.intValue()) {
                afbe afbeVar = (afbe) list.get(i3);
                afli afliVar = new afli((byte[]) null);
                afliVar.i(i / 2.0f);
                afbeVar.d(new afbk(afliVar));
                ((afbe) list.get(i3)).setBounds(0, 0, i, i2 >= 0 ? i2 : this.U);
            }
            i3++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0081  */
    /* JADX WARN: Code duplicated, block: B:15:0x009e  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    private final void P(afex afexVar, float f) {
        int iR;
        int intrinsicWidth;
        int iU;
        int intrinsicHeight;
        int iU2;
        Rect rect;
        ViewOverlay viewOverlayB;
        afexVar.B(c(f));
        boolean zM = m();
        int i = this.S;
        if (zM) {
            iR = (i + ((int) (r(f) * this.aI))) - (afexVar.getIntrinsicHeight() / 2);
            intrinsicWidth = afexVar.getIntrinsicHeight() + iR;
            if (l()) {
                iU = u() - (this.at + (this.U / 2));
                intrinsicHeight = afexVar.getIntrinsicWidth();
            } else {
                iU2 = this.at + (this.U / 2) + u();
                iU = afexVar.getIntrinsicWidth() + iU2;
            }
            rect = this.aV;
            rect.set(iR, iU2, intrinsicWidth, iU);
            if (m()) {
                RectF rectF = new RectF(rect);
                this.aY.mapRect(rectF);
                rectF.round(rect);
            }
            aeyc.b(afba.z(this), this, rect);
            afexVar.setBounds(rect);
            viewOverlayB = b();
            if (viewOverlayB != null) {
                viewOverlayB.add(afexVar);
            }
        }
        iR = (i + ((int) (r(f) * this.aI))) - (afexVar.getIntrinsicWidth() / 2);
        intrinsicWidth = afexVar.getIntrinsicWidth() + iR;
        iU = u() - (this.at + (this.U / 2));
        intrinsicHeight = afexVar.getIntrinsicHeight();
        iU2 = iU - intrinsicHeight;
        rect = this.aV;
        rect.set(iR, iU2, intrinsicWidth, iU);
        if (m()) {
            RectF rectF2 = new RectF(rect);
            this.aY.mapRect(rectF2);
            rectF2.round(rect);
        }
        aeyc.b(afba.z(this), this, rect);
        afexVar.setBounds(rect);
        viewOverlayB = b();
        if (viewOverlayB != null) {
            viewOverlayB.add(afexVar);
        }
    }

    private final void Q(ArrayList arrayList) {
        int resourceId;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.aA.size() == arrayList.size() && this.aA.equals(arrayList)) {
            return;
        }
        this.aA = arrayList;
        this.aK = true;
        List list = this.aZ;
        if (list.size() != this.aA.size()) {
            list.clear();
            for (int i = 0; i < this.aA.size(); i++) {
                afbe afbeVar = new afbe();
                afbeVar.z();
                afbeVar.q(this.be);
                afli afliVar = new afli((byte[]) null);
                afliVar.i(this.T / 2.0f);
                afbeVar.d(new afbk(afliVar));
                afbeVar.setBounds(0, 0, this.T, this.U);
                afbeVar.p(this.bb);
                afbeVar.w(this.bc);
                afbeVar.v(this.bd);
                afbeVar.setState(getDrawableState());
                list.add(afbeVar);
            }
        }
        this.aB = 0;
        j();
        List list2 = this.d;
        if (list2.size() > this.aA.size()) {
            List<afex> listSubList = list2.subList(this.aA.size(), list2.size());
            for (afex afexVar : listSubList) {
                if (isAttachedToWindow()) {
                    E(afexVar);
                }
            }
            listSubList.clear();
        }
        while (list2.size() < this.aA.size()) {
            Context context = getContext();
            int i2 = this.z;
            afex afexVar2 = new afex(context, i2);
            Context context2 = afexVar2.m;
            TypedArray typedArrayA = aeym.a(context2, null, afew.a, 0, i2, new int[0]);
            afexVar2.u = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
            boolean z = typedArrayA.getBoolean(8, true);
            afexVar2.t = z;
            if (z) {
                afli afliVar2 = new afli(afexVar2.l());
                afliVar2.l = afexVar2.A();
                afexVar2.d(new afbk(afliVar2));
            } else {
                afexVar2.u = 0;
            }
            afexVar2.B(typedArrayA.getText(6));
            afaq afaqVar = (!typedArrayA.hasValue(0) || (resourceId = typedArrayA.getResourceId(0, 0)) == 0) ? null : new afaq(context2, resourceId);
            if (afaqVar != null && typedArrayA.hasValue(1)) {
                afaqVar.k = afba.f(context2, typedArrayA, 1);
            }
            aeyk aeykVar = afexVar2.n;
            if (aeykVar.f != afaqVar) {
                aeykVar.f = afaqVar;
                if (afaqVar != null) {
                    TextPaint textPaint = aeykVar.a;
                    afar afarVar = aeykVar.b;
                    afaqVar.d(context2, textPaint, afarVar);
                    aeyj aeyjVar = (aeyj) aeykVar.e.get();
                    if (aeyjVar != null) {
                        textPaint.drawableState = aeyjVar.getState();
                    }
                    afaqVar.c(context2, textPaint, afarVar);
                    aeykVar.d = true;
                }
                aeyj aeyjVar2 = (aeyj) aeykVar.e.get();
                if (aeyjVar2 != null) {
                    aeyjVar2.a();
                    aeyjVar2.onStateChange(aeyjVar2.getState());
                }
            }
            afexVar2.q(ColorStateList.valueOf(typedArrayA.getColor(7, avv.e(avv.f(afba.K(context2, R.attr.colorOnBackground, afex.class.getCanonicalName()), 153), avv.f(afba.K(context2, android.R.attr.colorBackground, afex.class.getCanonicalName()), 229)))));
            afexVar2.u(ColorStateList.valueOf(afba.K(context2, R.attr.colorSurface, afex.class.getCanonicalName())));
            afexVar2.p = typedArrayA.getDimensionPixelSize(2, 0);
            afexVar2.q = typedArrayA.getDimensionPixelSize(4, 0);
            afexVar2.r = typedArrayA.getDimensionPixelSize(5, 0);
            afexVar2.s = typedArrayA.getDimensionPixelSize(3, 0);
            typedArrayA.recycle();
            list2.add(afexVar2);
            if (isAttachedToWindow()) {
                C(afexVar2);
            }
        }
        int i3 = list2.size() == 1 ? 0 : 1;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ((afex) it.next()).w(i3);
        }
        for (SliderPreference sliderPreference : this.e) {
            ArrayList arrayList2 = this.aA;
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                sliderPreference.k(this, ((Float) arrayList2.get(i4)).floatValue(), false);
            }
        }
        postInvalidate();
    }

    private final void R() {
        if (ab() && this.ba.isEmpty()) {
            int i = this.T;
            this.aa = i;
            this.ac = this.U;
            this.ab = this.W;
            int iRound = Math.round(i * 0.5f);
            FocusRingDrawable focusRingDrawableA = A();
            int i2 = -1;
            if (focusRingDrawableA != null && focusRingDrawableA.c.c) {
                i2 = this.U - this.E;
            }
            O(iRound, i2, Integer.valueOf(this.j));
        }
    }

    private final void S() {
        int iMin;
        aa();
        if (this.aC <= 0.0f) {
            T(this.aD);
            return;
        }
        int i = this.aF;
        if (i != 0) {
            iMin = 0;
            if (i == 1) {
                int iW = w();
                if (iW <= x()) {
                    iMin = iW;
                }
            } else if (i != 2) {
                throw new IllegalStateException(a.bR(i, "Unexpected tickVisibilityMode: "));
            }
        } else {
            iMin = Math.min(w(), x());
        }
        T(iMin);
    }

    private final void T(int i) {
        if (i == 0) {
            this.aE = null;
            return;
        }
        float[] fArr = this.aE;
        int i2 = i << 1;
        if (fArr == null || fArr.length != i2) {
            this.aE = new float[i2];
        }
        float f = this.aI;
        int i3 = i - 1;
        float fU = u();
        for (int i4 = 0; i4 < i2; i4 += 2) {
            float[] fArr2 = this.aE;
            fArr2[i4] = this.S + ((i4 / 2.0f) * (f / i3));
            fArr2[i4 + 1] = fU;
        }
        if (m()) {
            this.aY.mapPoints(this.aE);
        }
    }

    private final void U() {
        Drawable drawableMutate = this.aj;
        if (drawableMutate != null) {
            if (!this.ak) {
                if (this.al == null) {
                    return;
                }
                drawableMutate = drawableMutate.mutate();
                this.aj = drawableMutate;
                this.ak = true;
            }
            drawableMutate.setTintList(this.al);
        }
    }

    private final void V() {
        Drawable drawableMutate = this.ah;
        if (drawableMutate != null) {
            if (!this.ai) {
                if (this.al == null) {
                    return;
                }
                drawableMutate = drawableMutate.mutate();
                this.ah = drawableMutate;
                this.ai = true;
            }
            drawableMutate.setTintList(this.al);
        }
    }

    private final void W() {
        Drawable drawableMutate = this.ao;
        if (drawableMutate != null) {
            if (!this.ap) {
                if (this.aq == null) {
                    return;
                }
                drawableMutate = drawableMutate.mutate();
                this.ao = drawableMutate;
                this.ap = true;
            }
            drawableMutate.setTintList(this.aq);
        }
    }

    private final void X() {
        Drawable drawableMutate = this.am;
        if (drawableMutate != null) {
            if (!this.an) {
                if (this.aq == null) {
                    return;
                }
                drawableMutate = drawableMutate.mutate();
                this.am = drawableMutate;
                this.an = true;
            }
            drawableMutate.setTintList(this.aq);
        }
    }

    private final void Y(int i) {
        this.aI = Math.max(i - (this.S << 1), 0);
        S();
    }

    private final void Z(boolean z) {
        int paddingTop;
        int paddingBottom;
        boolean z2;
        if (m()) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i = paddingTop + paddingBottom;
        int iMax = Math.max(this.O, Math.max(this.R + i, this.U + i));
        boolean z3 = true;
        if (iMax == this.P) {
            z2 = false;
        } else {
            this.P = iMax;
            z2 = true;
        }
        int iMax2 = this.F + Math.max(Math.max(Math.max((this.T / 2) - this.G, 0), Math.max((this.R - this.H) / 2, 0)), Math.max(Math.max(this.aG - this.I, 0), Math.max(this.aH - this.J, 0)));
        if (this.S == iMax2) {
            z3 = false;
        } else {
            this.S = iMax2;
            if (isLaidOut()) {
                Y(m() ? getHeight() : getWidth());
            }
        }
        if (m()) {
            float fU = u();
            Matrix matrix = this.aY;
            matrix.reset();
            matrix.setRotate(90.0f, fU, fU);
        }
        if (z2 || z) {
            requestLayout();
        } else if (z3) {
            postInvalidate();
        }
    }

    private final void aa() {
        if (this.aK) {
            float f = this.h;
            if (f >= this.i) {
                throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.valueOf(f), Float.valueOf(this.i)));
            }
            ArrayList arrayList = this.aA;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Float f2 = (Float) arrayList.get(i);
                if (f2.floatValue() < this.h || f2.floatValue() > this.i) {
                    throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", f2, Float.valueOf(this.h), Float.valueOf(this.i)));
                }
                if (this.aC > 0.0f && !aj(f2.floatValue())) {
                    throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", f2, Float.valueOf(this.h), Float.valueOf(this.aC), Float.valueOf(this.aC)));
                }
            }
            if (this.aC > 0.0f && !aj(this.i)) {
                throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(this.aC), Float.valueOf(this.h), Float.valueOf(this.i)));
            }
            float f3 = this.aC;
            if (f3 != 0.0f) {
                if (((int) f3) != f3) {
                    Log.w(a, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", Float.valueOf(f3)));
                }
                float f4 = this.h;
                if (((int) f4) != f4) {
                    Log.w(a, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", Float.valueOf(f4)));
                }
                float f5 = this.i;
                if (((int) f5) != f5) {
                    Log.w(a, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", Float.valueOf(f5)));
                }
            }
            this.aK = false;
        }
    }

    private final boolean ab() {
        return this.W > 0;
    }

    private static boolean ac(MotionEvent motionEvent) {
        return motionEvent.getToolType(0) == 3;
    }

    private final boolean ad(MotionEvent motionEvent) {
        if (!ac(motionEvent)) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollHorizontally(1) || viewGroup.canScrollHorizontally(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean ae(MotionEvent motionEvent) {
        if (!ac(motionEvent)) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean af(int i) {
        int i2 = this.aB;
        int iD = (int) ast.d(((long) i2) + ((long) i), this.aA.size() - 1);
        this.aB = iD;
        if (iD == i2) {
            return false;
        }
        this.j = iD;
        R();
        j();
        postInvalidate();
        return true;
    }

    private final boolean ag() {
        return this.Q == 3;
    }

    private final boolean ah() {
        return z() == null;
    }

    private final boolean ai(float f) {
        return n(this.j, f);
    }

    private final boolean aj(float f) {
        double dDoubleValue = new BigDecimal(Double.toString(new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.h)), MathContext.DECIMAL64).doubleValue())).divide(new BigDecimal(Float.toString(this.aC)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    private final float[] ak() {
        float fFloatValue = ((Float) this.aA.get(0)).floatValue();
        ArrayList arrayList = this.aA;
        float fFloatValue2 = ((Float) arrayList.get(arrayList.size() - 1)).floatValue();
        if (this.aA.size() == 1) {
            fFloatValue = this.h;
        }
        float fR = r(fFloatValue);
        float fR2 = r(fFloatValue2);
        if (this.ag) {
            float fMin = Math.min(0.5f, fR2);
            fR2 = Math.max(0.5f, fR2);
            fR = fMin;
        }
        return (this.ag || !(l() || m())) ? new float[]{fR, fR2} : new float[]{fR2, fR};
    }

    private final void al(float f, float f2, float f3, float f4, Canvas canvas, RectF rectF, int i, int i2) {
        if (f2 - f > a() - i2) {
            rectF.set(f, f3, f2, f4);
        } else {
            rectF.setEmpty();
        }
        am(canvas, this.q, rectF, a(), i);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    private final void am(Canvas canvas, Paint paint, RectF rectF, float f, int i) {
        float fMax;
        if (rectF.isEmpty()) {
            return;
        }
        if (this.aA.isEmpty() || !ab()) {
            fMax = f;
        } else {
            float fS = s(((Float) this.aA.get((l() || m()) ? this.aA.size() - 1 : 0)).floatValue()) - this.S;
            if (fS < f) {
                fMax = Math.max(fS, this.af);
            } else {
                fMax = f;
            }
        }
        if (!this.aA.isEmpty() && ab()) {
            float fS2 = s(((Float) this.aA.get((l() || m()) ? 0 : this.aA.size() - 1)).floatValue()) - this.S;
            float f2 = this.aI;
            if (fS2 > f2 - f) {
                f = Math.max(f2 - fS2, this.af);
            }
        }
        int i2 = i - 1;
        if (i2 != 1) {
            fMax = this.af;
            if (i2 != 2) {
                f = fMax;
            }
        } else {
            f = this.af;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        if (ab()) {
            paint.setAntiAlias(true);
        }
        RectF rectF2 = new RectF(rectF);
        if (m()) {
            this.aY.mapRect(rectF2);
        }
        Path path = this.aQ;
        path.reset();
        if (rectF.width() >= fMax + f) {
            path.addRoundRect(rectF2, m() ? new float[]{fMax, fMax, fMax, fMax, f, f, f, f} : new float[]{fMax, fMax, f, f, f, f, fMax, fMax}, Path.Direction.CW);
            canvas.drawPath(path, paint);
            return;
        }
        float fMin = Math.min(fMax, f);
        float fMax2 = Math.max(fMax, f);
        canvas.save();
        path.addRoundRect(rectF2, fMin, fMin, Path.Direction.CW);
        canvas.clipPath(path);
        if (i2 != 1) {
            RectF rectF3 = this.aU;
            if (i2 != 2) {
                rectF3.set(rectF.centerX() - fMax2, rectF.top, rectF.centerX() + fMax2, rectF.bottom);
            } else {
                rectF3.set(rectF.right - (fMax2 + fMax2), rectF.top, rectF.right, rectF.bottom);
            }
        } else {
            this.aU.set(rectF.left, rectF.top, rectF.left + fMax2 + fMax2, rectF.bottom);
        }
        if (m()) {
            this.aY.mapRect(this.aU);
        }
        canvas.drawRoundRect(this.aU, fMax2, fMax2, paint);
        canvas.restore();
    }

    private final void an(int i) {
        if (l() || m()) {
            i = i == Integer.MIN_VALUE ? Alert.DURATION_SHOW_INDEFINITELY : -i;
        }
        af(i);
    }

    private final void ao() {
        double dRound;
        float f = this.bf;
        float f2 = this.aC;
        if (f2 > 0.0f) {
            int i = (int) ((this.i - this.h) / f2);
            dRound = ((double) Math.round(f * i)) / ((double) i);
        } else {
            dRound = f;
        }
        if (l() || m()) {
            dRound = 1.0d - dRound;
        }
        float f3 = this.i;
        float f4 = this.h;
        ai((float) ((dRound * ((double) (f3 - f4))) + ((double) f4)));
    }

    private final float q() {
        float f = this.aC;
        if (f == 0.0f) {
            return 1.0f;
        }
        return f;
    }

    private final float r(float f) {
        float f2 = this.h;
        float f3 = (f - f2) / (this.i - f2);
        return (l() || m()) ? 1.0f - f3 : f3;
    }

    private final float s(float f) {
        return (r(f) * this.aI) + this.S;
    }

    private final int t(int i) {
        if (!this.az || i != this.j || !this.ba.isEmpty()) {
            return this.W;
        }
        return this.W - ((this.T - Math.round(this.T * 0.5f)) / 2);
    }

    private final int u() {
        int i = this.P / 2;
        int intrinsicHeight = 0;
        if (this.Q == 1 || ag()) {
            List list = this.d;
            if (!list.isEmpty()) {
                intrinsicHeight = ((afex) list.get(0)).getIntrinsicHeight();
            }
        }
        return i + intrinsicHeight;
    }

    private final int v(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    private final int w() {
        return (int) (((this.i - this.h) / this.aC) + 1.0f);
    }

    private final int x() {
        return (this.aI / this.K) + 1;
    }

    private final ValueAnimator y(boolean z) {
        int iR;
        TimeInterpolator timeInterpolatorY;
        ValueAnimator valueAnimator = z ? this.C : this.B;
        float fFloatValue = true != z ? 1.0f : 0.0f;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, true != z ? 0.0f : 1.0f);
        if (z) {
            iR = afba.r(getContext(), m, 83);
            timeInterpolatorY = afba.y(getContext(), o, aetz.e);
        } else {
            iR = afba.r(getContext(), n, 117);
            timeInterpolatorY = afba.y(getContext(), p, aetz.c);
        }
        valueAnimatorOfFloat.setDuration(iR);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorY);
        valueAnimatorOfFloat.addUpdateListener(new adey(this, 11));
        return valueAnimatorOfFloat;
    }

    private final RippleDrawable z() {
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            return (RippleDrawable) background;
        }
        return null;
    }

    public final int a() {
        int i = this.ae;
        return i == -1 ? this.R / 2 : i;
    }

    public final ViewOverlay b() {
        ViewGroup viewGroupZ = afba.z(this);
        if (viewGroupZ == null) {
            return null;
        }
        return viewGroupZ.getOverlay();
    }

    public final String c(float f) {
        return String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
    }

    public final List d() {
        return new ArrayList(this.aA);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.c.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        this.q.setColor(v(this.aP));
        this.r.setColor(v(this.aO));
        this.u.setColor(v(this.aN));
        this.v.setColor(v(this.aM));
        this.w.setColor(v(this.aN));
        for (afex afexVar : this.d) {
            if (afexVar.isStateful()) {
                afexVar.setState(getDrawableState());
            }
        }
        int i = 0;
        while (true) {
            List list = this.aZ;
            if (i >= list.size()) {
                Paint paint = this.t;
                paint.setColor(v(this.aL));
                paint.setAlpha(63);
                return;
            } else {
                if (((afbe) list.get(i)).isStateful()) {
                    ((afbe) list.get(i)).setState(getDrawableState());
                }
                i++;
            }
        }
    }

    public final void e(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(f), Float.valueOf(this.h), Float.valueOf(this.i)));
        }
        if (this.aC != f) {
            this.aC = f;
            this.aK = true;
            postInvalidate();
        }
    }

    public final void f(float f) {
        this.h = f;
        this.aK = true;
        postInvalidate();
    }

    public final void g(float f) {
        this.i = f;
        this.aK = true;
        postInvalidate();
    }

    @Override // android.view.View
    public final CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public final void h(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        Q(arrayList);
    }

    final void i(int i, Rect rect) {
        int iR = this.S + ((int) (r(((Float) d().get(i)).floatValue()) * this.aI));
        int iU = u();
        int iMax = Math.max(this.L, this.M) / 2;
        int iMax2 = Math.max(this.T / 2, iMax);
        int iMax3 = Math.max(this.U / 2, iMax);
        RectF rectF = new RectF(iR - iMax2, iU - iMax3, iR + iMax2, iU + iMax3);
        if (m()) {
            this.aY.mapRect(rectF);
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void j() {
        RippleDrawable rippleDrawableZ;
        float fR = (r(((Float) this.aA.get(this.aB)).floatValue()) * this.aI) + this.S;
        int iU = u();
        if (!ah() && getMeasuredWidth() > 0 && (rippleDrawableZ = z()) != null) {
            int i = this.V;
            float f = i;
            float[] fArr = {fR - f, iU - i, f + fR, i + iU};
            if (m()) {
                this.aY.mapPoints(fArr);
            }
            rippleDrawableZ.setHotspotBounds((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
        }
        float f2 = iU;
        FocusRingDrawable focusRingDrawableA = A();
        if (focusRingDrawableA != null) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_slider_focus_ring_padding);
            float f3 = this.T;
            float f4 = dimensionPixelOffset;
            float f5 = this.U;
            boolean zM = m();
            float f6 = (f5 / 2.0f) + f4;
            float f7 = f2 + f6;
            float f8 = f2 - f6;
            float f9 = (f3 / 2.0f) + f4 + f4;
            float f10 = fR + f9;
            float f11 = fR - f9;
            float f12 = true != zM ? f7 : f10;
            float f13 = true != zM ? f8 : f11;
            if (true != zM) {
                f7 = f10;
            }
            if (true != zM) {
                f8 = f11;
            }
            focusRingDrawableA.mutate();
            aexs aexsVar = focusRingDrawableA.c;
            if (aexsVar.w == null) {
                aexsVar.w = new Rect();
            }
            focusRingDrawableA.c.w.set((int) f8, (int) f13, (int) f7, (int) f12);
        }
    }

    public final void k() {
        boolean zM = m();
        boolean zL = l();
        float f = 1.2f;
        float f2 = 0.5f;
        if (!zM) {
            f2 = 1.2f;
            f = 0.5f;
        } else if (zL) {
            f = -0.2f;
        }
        for (afex afexVar : this.d) {
            afexVar.x = f;
            afexVar.y = f2;
            afexVar.invalidateSelf();
        }
        int i = this.Q;
        if (i == 0 || i == 1) {
            if (this.j == -1 || !isEnabled()) {
                K();
                return;
            } else {
                J(false);
                return;
            }
        }
        if (i == 2) {
            K();
            return;
        }
        if (i != 3) {
            throw new IllegalArgumentException(a.bR(i, "Unexpected labelBehavior: "));
        }
        if (isEnabled()) {
            Rect rect = new Rect();
            afba.z(this).getHitRect(rect);
            if (getLocalVisibleRect(rect) && this.bi) {
                J(true);
                return;
            }
        }
        K();
    }

    final boolean l() {
        return getLayoutDirection() == 1;
    }

    public final boolean m() {
        return this.N == 1;
    }

    public final boolean n(int i, float f) {
        this.aB = i;
        if (Math.abs(f - ((Float) this.aA.get(i)).floatValue()) < 1.0E-4d) {
            return false;
        }
        l();
        int i2 = i + 1;
        int i3 = i - 1;
        this.aA.set(i, Float.valueOf(ast.b(f, i3 < 0 ? this.h : ((Float) this.aA.get(i3)).floatValue() + 0.0f, i2 >= this.aA.size() ? this.i : ((Float) this.aA.get(i2)).floatValue() + 0.0f)));
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((SliderPreference) it.next()).k(this, ((Float) this.aA.get(i)).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.x;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            Runnable runnable = this.y;
            if (runnable == null) {
                this.y = new afbz(this, 0);
            } else {
                removeCallbacks(runnable);
            }
            afbz afbzVar = this.y;
            afbzVar.a = i;
            postDelayed(afbzVar, 200L);
            this.c.invalidateVirtualView(i);
        }
        return true;
    }

    public final float o() {
        float fQ = q();
        float f = (this.i - this.h) / fQ;
        return f > 20.0f ? fQ * Math.round(f / 20.0f) : fQ;
    }

    @Override // android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.bi = isShown();
        getViewTreeObserver().addOnScrollChangedListener(this.bg);
        getViewTreeObserver().addOnGlobalLayoutListener(this.bh);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            C((afex) it.next());
        }
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        afbz afbzVar = this.y;
        if (afbzVar != null) {
            removeCallbacks(afbzVar);
        }
        this.A = false;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            E((afex) it.next());
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.bg);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.bh);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:129:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f7 A[PHI: r3
      0x00f7: PHI (r3v4 int) = (r3v3 int), (r3v3 int), (r3v21 int), (r3v21 int) binds: [B:36:0x00e2, B:38:0x00e6, B:40:0x00ed, B:42:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0195  */
    /* JADX WARN: Code duplicated, block: B:79:0x019a  */
    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int iT;
        int iT2;
        int i;
        float fT;
        float f;
        float f2;
        RectF rectF;
        int iT3;
        int i2;
        afcd afcdVar = this;
        if (afcdVar.aK) {
            afcdVar.aa();
            afcdVar.S();
        }
        super.onDraw(canvas);
        int iU = afcdVar.u();
        int i3 = afcdVar.aI;
        float[] fArrAk = afcdVar.ak();
        float f3 = iU;
        float f4 = afcdVar.R;
        float f5 = 0.5f;
        int i4 = 0;
        if (afcdVar.ag && fArrAk[0] == 0.5f) {
            iT = afcdVar.W;
        } else {
            iT = afcdVar.t((afcdVar.l() || afcdVar.m()) ? afcdVar.aA.size() - 1 : 0);
        }
        int i5 = iT;
        float f6 = 2.0f;
        float f7 = f4 / 2.0f;
        float f8 = f3 + f7;
        float f9 = f3 - f7;
        int i6 = afcdVar.S;
        int iA = i6 - afcdVar.a();
        float f10 = i3;
        float f11 = fArrAk[0] * f10;
        RectF rectF2 = afcdVar.aS;
        afcdVar.al(iA, (i6 + f11) - i5, f9, f8, canvas, rectF2, 2, i5);
        if (afcdVar.ag && fArrAk[1] == 0.5f) {
            iT2 = afcdVar.W;
        } else {
            iT2 = afcdVar.t((afcdVar.l() || afcdVar.m()) ? 0 : afcdVar.aA.size() - 1);
        }
        int i7 = iT2;
        int i8 = afcdVar.S;
        float f12 = i8;
        float f13 = fArrAk[1] * f10;
        int iA2 = i8 + i3 + afcdVar.a();
        RectF rectF3 = afcdVar.aT;
        afcdVar.al(f12 + f13 + i7, iA2, f9, f8, canvas, rectF3, 3, i7);
        int i9 = afcdVar.aI;
        float[] fArrAk2 = afcdVar.ak();
        float f14 = afcdVar.S;
        float f15 = i9;
        float f16 = fArrAk2[1] * f15;
        float fT2 = (fArrAk2[0] * f15) + f14;
        float fS = f14 + f16;
        int i10 = 2;
        if (fT2 >= fS) {
            afcdVar.aR.setEmpty();
        } else {
            int i11 = 4;
            if (afcdVar.aA.size() != 1 || afcdVar.ag) {
                i = i11;
            } else {
                i11 = 3;
                if (afcdVar.l() || afcdVar.m()) {
                    i = i11;
                } else {
                    i = 2;
                }
            }
            int i12 = 0;
            while (i12 < afcdVar.aA.size()) {
                if (afcdVar.aA.size() > 1) {
                    fS = i12 > 0 ? afcdVar.s(((Float) afcdVar.aA.get(i12 - 1)).floatValue()) : fT2;
                    float fS2 = afcdVar.s(((Float) afcdVar.aA.get(i12)).floatValue());
                    if (afcdVar.l() || afcdVar.m()) {
                        fT2 = fS2;
                    } else {
                        fT2 = fS;
                        fS = fS2;
                    }
                }
                int iA3 = afcdVar.a();
                float f17 = f5;
                int i13 = i - 1;
                if (i13 != 1) {
                    if (i13 != i10) {
                        if (i12 > 0) {
                            fT2 += afcdVar.t(i12 - 1);
                            iT3 = afcdVar.t(i12);
                        } else {
                            if (fArrAk2[1] == f17) {
                                fT2 += afcdVar.t(i12);
                            } else if (fArrAk2[0] == f17) {
                                iT3 = afcdVar.t(i12);
                            }
                            f = fS;
                            f6 = f6;
                        }
                        fS -= iT3;
                        f = fS;
                        f6 = f6;
                    } else {
                        fT2 += afcdVar.t(i12);
                        fT = fS + iA3;
                    }
                    f2 = fT2;
                    rectF = afcdVar.aR;
                    if (f2 >= f) {
                        rectF.setEmpty();
                    } else {
                        float f18 = iA3;
                        float f19 = afcdVar.R / f6;
                        rectF.set(f2, f3 - f19, f, f3 + f19);
                        afcdVar.am(canvas, afcdVar.r, rectF, f18, i);
                    }
                    i12++;
                    fS = f;
                    fT2 = f2;
                    f5 = f17;
                    f6 = f6;
                    i10 = 2;
                } else {
                    fT2 -= iA3;
                    fT = fS - afcdVar.t(i12);
                }
                f = fT;
                f2 = fT2;
                rectF = afcdVar.aR;
                if (f2 >= f) {
                    rectF.setEmpty();
                } else {
                    float f110 = iA3;
                    float f111 = afcdVar.R / f6;
                    rectF.set(f2, f3 - f111, f, f3 + f111);
                    afcdVar.am(canvas, afcdVar.r, rectF, f110, i);
                }
                i12++;
                fS = f;
                fT2 = f2;
                f5 = f17;
                f6 = f6;
                i10 = 2;
            }
        }
        Canvas canvas2 = canvas;
        float f20 = f6;
        if (afcdVar.l() || afcdVar.m()) {
            afcdVar.I(canvas2, afcdVar.aR, rectF2);
        } else {
            afcdVar.I(canvas2, afcdVar.aR, rectF3);
        }
        float[] fArr = afcdVar.aE;
        if (fArr != null && fArr.length != 0) {
            float[] fArrAk3 = afcdVar.ak();
            int iCeil = (int) Math.ceil(fArrAk3[0] * ((afcdVar.aE.length / f20) - 1.0f));
            int iFloor = (int) Math.floor(fArrAk3[1] * ((afcdVar.aE.length / f20) - 1.0f));
            if (iCeil > 0) {
                afcdVar.H(0, iCeil << 1, canvas2, afcdVar.u);
            }
            if (iCeil <= iFloor) {
                afcdVar.H(iCeil << 1, (iFloor + 1) << 1, canvas2, afcdVar.v);
            }
            int length = afcdVar.aE.length;
            int i14 = (iFloor + 1) << 1;
            if (i14 < length) {
                afcdVar.H(i14, length, canvas2, afcdVar.u);
            }
        }
        if (afcdVar.ad > 0 && !afcdVar.aA.isEmpty()) {
            ArrayList arrayList = afcdVar.aA;
            float fFloatValue = ((Float) arrayList.get(arrayList.size() - 1)).floatValue();
            float f21 = afcdVar.i;
            if (fFloatValue < f21) {
                afcdVar.F(canvas2, afcdVar.s(f21), f3);
            }
            if (afcdVar.ag || (afcdVar.aA.size() > 1 && ((Float) afcdVar.aA.get(0)).floatValue() > afcdVar.h)) {
                afcdVar.F(canvas2, afcdVar.s(afcdVar.h), f3);
            }
        }
        if ((afcdVar.az || afcdVar.isFocused()) && afcdVar.isEnabled()) {
            int i15 = afcdVar.aI;
            if (afcdVar.ah()) {
                float[] fArr2 = {afcdVar.S + (afcdVar.r(((Float) afcdVar.aA.get(afcdVar.aB)).floatValue()) * i15), f3};
                if (afcdVar.m()) {
                    afcdVar.aY.mapPoints(fArr2);
                }
                if (Build.VERSION.SDK_INT < 28) {
                    float f22 = fArr2[0];
                    float f23 = afcdVar.V;
                    float f24 = fArr2[1];
                    canvas.clipRect(f22 - f23, f24 - f23, f22 + f23, f24 + f23, Region.Op.UNION);
                    canvas2 = canvas;
                }
                canvas2.drawCircle(fArr2[0], fArr2[1], afcdVar.V, afcdVar.t);
            } else {
                afcdVar = afcdVar;
            }
        } else {
            afcdVar = afcdVar;
        }
        afcdVar.k();
        int i16 = afcdVar.aI;
        while (i4 < afcdVar.aA.size()) {
            float fFloatValue2 = ((Float) afcdVar.aA.get(i4)).floatValue();
            if (i4 < afcdVar.ba.size()) {
                i2 = iU;
                afcdVar.G(canvas2, i16, i2, fFloatValue2, (Drawable) afcdVar.ba.get(i4));
            } else {
                afcd afcdVar2 = afcdVar;
                i2 = iU;
                if (!afcdVar2.isEnabled()) {
                    canvas2.drawCircle(afcdVar2.S + (afcdVar2.r(fFloatValue2) * i16), f3, afcdVar2.T / 2, afcdVar2.s);
                }
                afcdVar2.G(canvas2, i16, i2, fFloatValue2, (Drawable) afcdVar2.aZ.get(i4));
            }
            i4++;
            afcdVar = this;
            canvas2 = canvas;
            iU = i2;
        }
    }

    @Override // android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            N();
            this.j = -1;
            this.c.clearKeyboardFocusForVirtualView(this.aB);
            return;
        }
        if (this.j == -1) {
            if (i == 1) {
                af(Alert.DURATION_SHOW_INDEFINITELY);
            } else if (i == 2) {
                af(Integer.MIN_VALUE);
            } else if (i == 17) {
                an(Alert.DURATION_SHOW_INDEFINITELY);
            } else if (i == 66) {
                an(Integer.MIN_VALUE);
            }
            this.j = this.aB;
        }
        N();
        R();
        this.c.requestKeyboardFocusForVirtualView(this.aB);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Float fValueOf;
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.j = this.aB;
        boolean zIsLongPress = this.aJ | keyEvent.isLongPress();
        this.aJ = zIsLongPress;
        float fO = zIsLongPress ? o() : q();
        if (i == 21) {
            if (!l()) {
                fO = -fO;
            }
            fValueOf = Float.valueOf(fO);
        } else if (i == 22) {
            if (l()) {
                fO = -fO;
            }
            fValueOf = Float.valueOf(fO);
        } else if (i != 69) {
            fValueOf = (i == 70 || i == 81) ? Float.valueOf(fO) : null;
        } else {
            fValueOf = Float.valueOf(-fO);
        }
        if (fValueOf != null) {
            if (ai(((Float) this.aA.get(this.j)).floatValue() + fValueOf.floatValue())) {
                j();
                postInvalidate();
            }
            return true;
        }
        if (i != 61) {
            return super.onKeyDown(i, keyEvent);
        }
        N();
        if (keyEvent.hasNoModifiers()) {
            return af(1);
        }
        if (keyEvent.isShiftPressed()) {
            return af(-1);
        }
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.aJ = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Rect rect = this.ax;
        rect.left = 0;
        rect.top = 0;
        rect.right = i3 - i;
        rect.bottom = i4 - i2;
        if (!this.g.contains(rect)) {
            this.g.add(rect);
        }
        List list = this.g;
        int i5 = bac.a;
        if (Build.VERSION.SDK_INT >= 29) {
            azx.c(this, list);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.P + ((this.Q == 1 || ag()) ? ((afex) this.d.get(0)).getIntrinsicHeight() : 0), 1073741824);
        if (m()) {
            super.onMeasure(iMakeMeasureSpec, i2);
        } else {
            super.onMeasure(i, iMakeMeasureSpec);
        }
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        afcc afccVar = (afcc) parcelable;
        super.onRestoreInstanceState(afccVar.getSuperState());
        this.h = afccVar.a;
        this.i = afccVar.b;
        Q(afccVar.c);
        this.aC = afccVar.d;
        if (afccVar.e) {
            requestFocus();
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        afcc afccVar = new afcc(super.onSaveInstanceState());
        afccVar.a = this.h;
        afccVar.b = this.i;
        afccVar.c = new ArrayList(this.aA);
        afccVar.d = this.aC;
        afccVar.e = hasFocus();
        return afccVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (true == m()) {
            i = i2;
        }
        Y(i);
        j();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float y = m() ? motionEvent.getY() : motionEvent.getX();
        float x = m() ? motionEvent.getX() : motionEvent.getY();
        float f = (y - this.S) / this.aI;
        this.bf = f;
        float fMax = Math.max(0.0f, f);
        this.bf = fMax;
        this.bf = Math.min(1.0f, fMax);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.au = y;
            this.av = x;
            this.ay.clear();
            this.ay = d();
            if ((m() || !ae(motionEvent)) && (!m() || !ad(motionEvent))) {
                getParent().requestDisallowInterceptTouchEvent(true);
                p();
                requestFocus();
                this.az = true;
                R();
                L();
                ao();
                j();
                invalidate();
            }
        } else if (actionMasked == 1) {
            this.az = false;
            MotionEvent motionEvent2 = this.aw;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0) {
                float x2 = this.aw.getX() - motionEvent.getX();
                float f2 = this.D;
                if (Math.abs(x2) <= f2 && Math.abs(this.aw.getY() - motionEvent.getY()) <= f2) {
                    p();
                    L();
                }
            }
            if (this.j != -1) {
                ao();
                j();
                N();
                this.j = -1;
                M();
            }
            invalidate();
        } else if (actionMasked == 2) {
            if (!this.az) {
                if (!m() && ae(motionEvent)) {
                    if (Math.abs(y - this.au) < this.D) {
                        return false;
                    }
                }
                if (m() && ad(motionEvent)) {
                    if (Math.abs(x - this.av) < this.D * 0.8f) {
                        return false;
                    }
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                p();
                this.az = true;
                R();
                L();
            }
            ao();
            j();
            invalidate();
        } else if (actionMasked == 3) {
            this.az = false;
            if (this.j != -1 && !this.ay.isEmpty()) {
                for (int i = 0; i < this.aA.size(); i++) {
                    if (i == this.j) {
                        n(i, ((Float) this.ay.get(i)).floatValue());
                        break;
                    }
                }
            }
            j();
            N();
            this.j = -1;
            M();
            invalidate();
        }
        setPressed(this.az);
        this.aw = MotionEvent.obtain(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        this.bi = z;
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        ViewOverlay viewOverlayB;
        super.onVisibilityChanged(view, i);
        if (i == 0 || (viewOverlayB = b()) == null) {
            return;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            viewOverlayB.remove((afex) it.next());
        }
    }

    protected void p() {
        throw null;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(true != z ? 2 : 0, null);
    }

    public afcd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    public afcd(Context context) {
        this(context, null);
    }
}

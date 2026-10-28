package android.support.v7.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import defpackage.a;
import defpackage.ahto;
import defpackage.azw;
import defpackage.bac;
import defpackage.bme;
import defpackage.bmm;
import defpackage.ci;
import defpackage.he;
import defpackage.hl;
import defpackage.le;
import defpackage.lx;
import defpackage.ow;
import defpackage.ox;
import defpackage.pj;
import defpackage.pl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class SwitchCompat extends CompoundButton {
    private static final Property c = new ow(Float.class);
    private static final int[] d = {R.attr.state_checked};
    private float A;
    private VelocityTracker B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private boolean K;
    private final TextPaint L;
    private ColorStateList M;
    private Layout N;
    private Layout O;
    private TransformationMethod P;
    private final le Q;
    private final Rect R;
    private pj S;
    public float a;
    ObjectAnimator b;
    private Drawable e;
    private ColorStateList f;
    private PorterDuff.Mode g;
    private boolean h;
    private boolean i;
    private Drawable j;
    private ColorStateList k;
    private PorterDuff.Mode l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private CharSequence s;
    private CharSequence t;
    private CharSequence u;
    private CharSequence v;
    private boolean w;
    private int x;
    private int y;
    private float z;

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable drawable2;
        Typeface typeface;
        super(context, attributeSet, i);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.k = null;
        this.l = null;
        this.m = false;
        this.n = false;
        this.B = VelocityTracker.obtain();
        this.K = true;
        this.R = new Rect();
        ox.d(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.L = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = he.v;
        ahto ahtoVarL = ahto.L(context, attributeSet, iArr, i, 0);
        bac.o(this, context, iArr, attributeSet, (TypedArray) ahtoVarL.b, i, 0);
        Drawable drawableB = ahtoVarL.B(2);
        this.e = drawableB;
        if (drawableB != null) {
            drawableB.setCallback(this);
        }
        Drawable drawableB2 = ahtoVarL.B(11);
        this.j = drawableB2;
        if (drawableB2 != null) {
            drawableB2.setCallback(this);
        }
        e(ahtoVarL.D(0));
        d(ahtoVarL.D(1));
        this.w = ahtoVarL.G(3, true);
        this.o = ahtoVarL.v(8, 0);
        this.p = ahtoVarL.v(5, 0);
        this.q = ahtoVarL.v(6, 0);
        this.r = ahtoVarL.G(4, false);
        ColorStateList colorStateListA = ahtoVarL.A(9);
        if (colorStateListA != null) {
            this.f = colorStateListA;
            this.h = true;
        }
        int iW = ahtoVarL.w(10, -1);
        Rect rect = lx.a;
        PorterDuff.Mode modeL = a.l(iW, null);
        if (this.g != modeL) {
            this.g = modeL;
            this.i = true;
        }
        boolean z = this.h;
        if ((z || this.i) && (drawable = this.e) != null && (z || this.i)) {
            Drawable drawableMutate = drawable.mutate();
            this.e = drawableMutate;
            if (this.h) {
                drawableMutate.setTintList(this.f);
            }
            if (this.i) {
                this.e.setTintMode(this.g);
            }
            if (this.e.isStateful()) {
                this.e.setState(getDrawableState());
            }
        }
        ColorStateList colorStateListA2 = ahtoVarL.A(12);
        if (colorStateListA2 != null) {
            this.k = colorStateListA2;
            this.m = true;
        }
        PorterDuff.Mode modeL2 = a.l(ahtoVarL.w(13, -1), null);
        if (this.l != modeL2) {
            this.l = modeL2;
            this.n = true;
        }
        boolean z2 = this.m;
        if ((z2 || this.n) && (drawable2 = this.j) != null && (z2 || this.n)) {
            Drawable drawableMutate2 = drawable2.mutate();
            this.j = drawableMutate2;
            if (this.m) {
                drawableMutate2.setTintList(this.k);
            }
            if (this.n) {
                this.j.setTintMode(this.l);
            }
            if (this.j.isStateful()) {
                this.j.setState(getDrawableState());
            }
        }
        int iZ = ahtoVarL.z(7, 0);
        if (iZ != 0) {
            ahto ahtoVar = new ahto(context, context.obtainStyledAttributes(iZ, he.w));
            ColorStateList colorStateListA3 = ahtoVar.A(3);
            if (colorStateListA3 != null) {
                this.M = colorStateListA3;
            } else {
                this.M = getTextColors();
            }
            int iV = ahtoVar.v(0, 0);
            if (iV != 0) {
                float f = iV;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int iW2 = ahtoVar.w(1, -1);
            int iW3 = ahtoVar.w(2, -1);
            if (iW2 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (iW2 != 2) {
                typeface = iW2 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (iW3 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(iW3) : Typeface.create(typeface, iW3);
                c(typefaceDefaultFromStyle);
                int i2 = iW3 & (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0));
                textPaint.setFakeBoldText(1 == (i2 & 1));
                textPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                c(typeface);
            }
            if (ahtoVar.G(14, false)) {
                this.P = new hl(getContext());
            } else {
                this.P = null;
            }
            e(this.s);
            d(this.u);
            ahtoVar.F();
        }
        le leVar = new le(this);
        this.Q = leVar;
        leVar.h(attributeSet, i);
        ahtoVarL.F();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.y = viewConfiguration.getScaledTouchSlop();
        this.C = viewConfiguration.getScaledMinimumFlingVelocity();
        m().i(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private final int g() {
        boolean zA = pl.a(this);
        float f = this.a;
        if (zA) {
            f = 1.0f - f;
        }
        return (int) ((f * h()) + 0.5f);
    }

    private final int h() {
        Drawable drawable = this.j;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.R;
        drawable.getPadding(rect);
        Drawable drawable2 = this.e;
        Rect rectA = drawable2 != null ? lx.a(drawable2) : lx.a;
        return ((((this.D - this.F) - rect.left) - rect.right) - rectA.left) - rectA.right;
    }

    private final Layout i(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.L, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, this.L)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private final CharSequence j(CharSequence charSequence) {
        Object obj = m().b;
        TransformationMethod transformationMethod = this.P;
        bme bmeVar = bme.b;
        return transformationMethod != null ? transformationMethod.getTransformation(charSequence, this) : charSequence;
    }

    private final void k() {
        if (((bmm) ((ci) this.S.b).a).a.a) {
            bme bmeVar = bme.b;
        }
    }

    private final boolean l() {
        return this.a > 0.5f;
    }

    private final pj m() {
        pj pjVar = this.S;
        if (pjVar != null) {
            return pjVar;
        }
        pj pjVar2 = new pj(this);
        this.S = pjVar2;
        return pjVar2;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.u;
            if (string == null) {
                string = getResources().getString(com.google.android.apps.youtube.music.R.string.abc_capital_off);
            }
            bac.t(this, string);
        }
    }

    public final void b() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.s;
            if (string == null) {
                string = getResources().getString(com.google.android.apps.youtube.music.R.string.abc_capital_on);
            }
            bac.t(this, string);
        }
    }

    public final void c(Typeface typeface) {
        TextPaint textPaint = this.L;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.u = charSequence;
        this.v = j(charSequence);
        this.O = null;
        if (this.w) {
            k();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.G;
        int i4 = this.H;
        int i5 = this.I;
        int i6 = this.J;
        int iG = g() + i3;
        Drawable drawable = this.e;
        Rect rectA = drawable != null ? lx.a(drawable) : lx.a;
        Rect rect = this.R;
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            iG += rect.left;
            if (rectA != null) {
                if (rectA.left > rect.left) {
                    i3 += rectA.left - rect.left;
                }
                i = rectA.top > rect.top ? (rectA.top - rect.top) + i4 : i4;
                if (rectA.right > rect.right) {
                    i5 -= rectA.right - rect.right;
                }
                if (rectA.bottom > rect.bottom) {
                    i2 = i6 - (rectA.bottom - rect.bottom);
                }
                this.j.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.j.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.e;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i7 = iG - rect.left;
            int i8 = iG + this.F + rect.right;
            this.e.setBounds(i7, i4, i8, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i7, i4, i8, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.e;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(CharSequence charSequence) {
        this.s = charSequence;
        this.t = j(charSequence);
        this.N = null;
        if (this.w) {
            k();
        }
    }

    public final void f(float f) {
        this.a = f;
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingLeft() {
        if (!pl.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.D;
        return !TextUtils.isEmpty(getText()) ? this.q + compoundPaddingLeft : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingRight() {
        if (pl.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.D;
        return !TextUtils.isEmpty(getText()) ? this.q + compoundPaddingRight : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return azw.g(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.b;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.b.end();
        this.b = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, d);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.j;
        Rect rect = this.R;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.H;
        int i2 = this.J;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.e;
        if (drawable != null) {
            if (!this.r || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectA = lx.a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectA.left;
                rect.right -= rectA.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = l() ? this.N : this.O;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.M;
            if (colorStateList != null) {
                this.L.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.L.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.s : this.u;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int i5;
        int paddingTop;
        int height;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.e != null) {
            Rect rect = this.R;
            Drawable drawable = this.j;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectA = lx.a(this.e);
            iMax = Math.max(0, rectA.left - rect.left);
            iMax2 = Math.max(0, rectA.right - rect.right);
        } else {
            iMax = 0;
        }
        if (pl.a(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.D + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.D) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                paddingTop = getPaddingTop();
                i5 = this.E;
            } else {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.E;
            }
            this.G = paddingLeft;
            this.H = paddingTop;
            this.J = height;
            this.I = width;
        }
        int paddingTop2 = (getPaddingTop() + getHeight()) - getPaddingBottom();
        i5 = this.E;
        paddingTop = (paddingTop2 / 2) - (i5 / 2);
        height = i5 + paddingTop;
        this.G = paddingLeft;
        this.H = paddingTop;
        this.J = height;
        this.I = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.w) {
            if (this.N == null) {
                this.N = i(this.t);
            }
            if (this.O == null) {
                this.O = i(this.v);
            }
        }
        Rect rect = this.R;
        Drawable drawable = this.e;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.e.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.e.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.F = Math.max(this.w ? Math.max(this.N.getWidth(), this.O.getWidth()) + (this.o << 1) : 0, intrinsicWidth);
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.j.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.e;
        if (drawable3 != null) {
            Rect rectA = lx.a(drawable3);
            iMax = Math.max(iMax, rectA.left);
            iMax2 = Math.max(iMax2, rectA.right);
        }
        boolean z = this.K;
        int iMax3 = this.p;
        if (z) {
            iMax3 = Math.max(iMax3, (this.F << 1) + iMax + iMax2);
        }
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.D = iMax3;
        this.E = iMax4;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.s : this.u;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00da  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f1  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean zIsChecked;
        boolean zL;
        float xVelocity;
        float f;
        this.B.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            float f2 = 0.0f;
            if (actionMasked == 1) {
                if (this.x == 2) {
                    this.x = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        this.B.computeCurrentVelocity(1000);
                        xVelocity = this.B.getXVelocity();
                        if (Math.abs(xVelocity) <= this.C) {
                            zL = pl.a(this) ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            zL = l();
                        }
                    } else {
                        zL = zIsChecked;
                    }
                    if (zL != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(zL);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.x = 0;
                this.B.clear();
            } else if (actionMasked == 2) {
                int i = this.x;
                if (i == 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (Math.abs(x - this.z) > this.y || Math.abs(y - this.A) > this.y) {
                        this.x = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.z = x;
                        this.A = y;
                        return true;
                    }
                } else if (i == 2) {
                    float x2 = motionEvent.getX();
                    int iH = h();
                    float f3 = x2 - this.z;
                    if (iH != 0) {
                        f = f3 / iH;
                    } else {
                        f = f3 > 0.0f ? 1.0f : -1.0f;
                    }
                    if (pl.a(this)) {
                        f = -f;
                    }
                    float f4 = this.a;
                    float f5 = f + f4;
                    if (f5 >= 0.0f) {
                        f2 = f5 > 1.0f ? 1.0f : f5;
                    }
                    if (f2 == f4) {
                        return true;
                    }
                    this.z = x2;
                    f(f2);
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.x == 2) {
                    this.x = 0;
                    if (motionEvent.getAction() == 1) {
                        z = false;
                    } else {
                        z = false;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        this.B.computeCurrentVelocity(1000);
                        xVelocity = this.B.getXVelocity();
                        if (Math.abs(xVelocity) <= this.C) {
                            zL = l();
                        } else if (pl.a(this)) {
                        }
                    } else {
                        zL = zIsChecked;
                    }
                    if (zL != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(zL);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.x = 0;
                this.B.clear();
            }
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled() && this.e != null) {
                int iG = g();
                Drawable drawable = this.e;
                Rect rect = this.R;
                drawable.getPadding(rect);
                int i2 = this.H;
                int i3 = this.y;
                int i4 = i2 - i3;
                int i5 = (this.G + iG) - i3;
                int i6 = this.F + i5 + rect.left + rect.right;
                int i7 = this.y;
                int i8 = i6 + i7;
                int i9 = this.J + i7;
                if (x3 > i5 && x3 < i8 && y2 > i4 && y2 < i9) {
                    this.x = 1;
                    this.z = x3;
                    this.A = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m();
        bme bmeVar = bme.b;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            b();
        } else {
            a();
        }
        float f = true != zIsChecked ? 0.0f : 1.0f;
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            f(f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) c, f);
        this.b = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.b.setAutoCancel(true);
        this.b.start();
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(azw.h(this, callback));
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        m();
        bme bmeVar = bme.b;
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.e || drawable == this.j;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.youtube.music.R.attr.switchStyle);
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }
}

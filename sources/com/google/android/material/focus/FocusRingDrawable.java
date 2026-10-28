package com.google.android.material.focus;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.util.FloatProperty;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.animation.OvershootInterpolator;
import defpackage.aexq;
import defpackage.aexr;
import defpackage.aexs;
import defpackage.aext;
import defpackage.aexu;
import defpackage.afba;
import defpackage.afbe;
import defpackage.afbj;
import defpackage.afbk;
import defpackage.afbm;
import defpackage.afli;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class FocusRingDrawable extends DrawableWrapper {
    public static final int[] a = {R.attr.state_focused, R.attr.state_window_focused};
    private static final TimeInterpolator d = new OvershootInterpolator(4.0f);
    private static final FloatProperty e = new aexq();
    public float b;
    public aexs c;
    private final Paint f;
    private final RectF g;
    private final Rect h;
    private final Path i;
    private final Path j;
    private final Matrix k;
    private final afbm l;
    private WeakReference m;
    private float n;
    private ObjectAnimator o;
    private boolean p;
    private boolean q;
    private boolean r;

    private FocusRingDrawable(aexs aexsVar, Resources resources) {
        super(null);
        this.f = new Paint(1);
        this.g = new RectF();
        this.h = new Rect();
        this.i = new Path();
        this.j = new Path();
        this.k = new Matrix();
        this.l = afbm.a();
        this.n = -1.0f;
        this.b = 1.0f;
        this.q = false;
        this.r = false;
        aexs aexsVar2 = new aexs(aexsVar);
        this.c = aexsVar2;
        Drawable.ConstantState constantState = aexsVar2.a;
        if (constantState != null) {
            setDrawable(resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
        }
        j();
    }

    public static FocusRingDrawable a(Drawable drawable) {
        if (drawable instanceof FocusRingDrawable) {
            return (FocusRingDrawable) drawable;
        }
        if (drawable instanceof DrawableWrapper) {
            Drawable drawable2 = ((DrawableWrapper) drawable).getDrawable();
            if (drawable2 instanceof FocusRingDrawable) {
                return (FocusRingDrawable) drawable2;
            }
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            for (int i = 0; i < layerDrawable.getNumberOfLayers(); i++) {
                Drawable drawable3 = layerDrawable.getDrawable(i);
                if (drawable3 instanceof FocusRingDrawable) {
                    return (FocusRingDrawable) drawable3;
                }
            }
        }
        return null;
    }

    public static FocusRingDrawable b(Context context, LayerDrawable layerDrawable, afbe afbeVar) {
        if (!d(context)) {
            return null;
        }
        FocusRingDrawable focusRingDrawable = new FocusRingDrawable(context, new ColorDrawable(0));
        if (afbeVar != null) {
            focusRingDrawable.c(afbeVar);
        }
        layerDrawable.addLayer(focusRingDrawable);
        focusRingDrawable.setCallback(layerDrawable);
        return focusRingDrawable;
    }

    public static boolean d(Context context) {
        return afba.x(context.getTheme(), com.google.android.apps.youtube.music.R.attr.focusRingsEnabled, false);
    }

    private final float e() {
        aexs aexsVar = this.c;
        return aexsVar.p + ((aexsVar.j / 2.0f) * this.b);
    }

    private final void f(RectF rectF) {
        Rect rect = this.c.w;
        if (rect != null) {
            rectF.set(rect);
            return;
        }
        WeakReference weakReference = this.m;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(((afbe) this.m.get()).getBounds());
            return;
        }
        if (!(getDrawable() instanceof RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
        Rect rect2 = this.h;
        rippleDrawable.getHotspotBounds(rect2);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            rect2.inset(Math.max(0, (rect2.width() / 2) - radius), Math.max(0, (rect2.height() / 2) - radius));
        }
        rectF.set(rect2);
    }

    private final void g(Canvas canvas, Path path, float f, float f2, int i) {
        RectF rectF = this.g;
        f(rectF);
        float f3 = f + f;
        float fWidth = f3 / rectF.width();
        float fHeight = f3 / rectF.height();
        Matrix matrix = this.k;
        matrix.reset();
        matrix.postScale(1.0f - fWidth, 1.0f - fHeight, rectF.centerX(), rectF.centerY());
        Path path2 = this.i;
        path.transform(matrix, path2);
        float f4 = f2 * this.b;
        Paint paint = this.f;
        paint.setStrokeWidth(f4);
        paint.setColor(i);
        canvas.drawPath(path2, paint);
    }

    private final void h(Canvas canvas, float f, float f2, float f3, int i) {
        RectF rectF = this.g;
        f(rectF);
        rectF.inset(f2, f2);
        float f4 = f3 * this.b;
        Paint paint = this.f;
        paint.setStrokeWidth(f4);
        paint.setColor(i);
        canvas.drawRoundRect(rectF, f, f, paint);
    }

    private final void i(Resources.Theme theme) {
        TypedValue typedValueU;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(aexu.a);
        int i = this.c.d;
        if (i != Integer.MIN_VALUE && (typedValueU = afba.u(theme, i)) != null) {
            this.c.c = typedValueU.data != 0;
            this.c.e = true;
        }
        aexs aexsVar = this.c;
        if (!aexsVar.e) {
            aexsVar.c = afba.x(theme, com.google.android.apps.youtube.music.R.attr.focusRingsEnabled, aexsVar.c);
        }
        aexs aexsVar2 = this.c;
        if (aexsVar2.c) {
            aexsVar2.f = o(aexsVar2.f, theme, aexsVar2.g, typedArrayObtainStyledAttributes, 5, -16777216);
            aexs aexsVar3 = this.c;
            aexsVar3.h = o(aexsVar3.h, theme, aexsVar3.i, typedArrayObtainStyledAttributes, 1, -1);
            aexs aexsVar4 = this.c;
            aexsVar4.j = p(aexsVar4.j, theme, aexsVar4.k, typedArrayObtainStyledAttributes, 6, com.google.android.apps.youtube.music.R.dimen.mtrl_focus_ring_outer_stroke_width);
            aexs aexsVar5 = this.c;
            aexsVar5.l = p(aexsVar5.l, theme, aexsVar5.m, typedArrayObtainStyledAttributes, 3, com.google.android.apps.youtube.music.R.dimen.mtrl_focus_ring_inner_stroke_width);
            aexs aexsVar6 = this.c;
            aexsVar6.n = p(aexsVar6.n, theme, aexsVar6.o, typedArrayObtainStyledAttributes, 7, 0);
            aexs aexsVar7 = this.c;
            aexsVar7.p = p(aexsVar7.p, theme, aexsVar7.q, typedArrayObtainStyledAttributes, 4, 0);
            if (Float.isNaN(this.c.p)) {
                this.c.p = 0.0f;
            }
            aexs aexsVar8 = this.c;
            aexsVar8.r = p(aexsVar8.r, theme, aexsVar8.s, typedArrayObtainStyledAttributes, 2, com.google.android.apps.youtube.music.R.dimen.mtrl_focus_ring_inner_stroke_inset);
            aexs aexsVar9 = this.c;
            int i2 = aexsVar9.u;
            if (i2 != Integer.MIN_VALUE) {
                aexsVar9.t = new afbk(afbk.g(theme, i2));
            } else {
                int i3 = aexsVar9.v;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = com.google.android.apps.youtube.music.R.attr.focusRingsShapeAppearance;
                }
                TypedValue typedValueU2 = afba.u(theme, i3);
                if (typedValueU2 != null) {
                    this.c.t = new afbk(afbk.g(theme, typedValueU2.resourceId));
                }
            }
            aexs aexsVar10 = this.c;
            int i4 = aexsVar10.y;
            if (i4 != Integer.MIN_VALUE) {
                aexsVar10.x = m(theme, i4);
            } else {
                TypedValue typedValueU3 = afba.u(theme, com.google.android.apps.youtube.music.R.attr.focusRingsStateSet);
                if (typedValueU3 != null && typedValueU3.resourceId != 0) {
                    this.c.x = m(theme, typedValueU3.resourceId);
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        j();
    }

    private final void j() {
        Paint paint = this.f;
        paint.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.c.j)) {
            return;
        }
        paint.setStrokeWidth(this.c.j);
    }

    private final void k(afbj afbjVar) {
        RectF rectF = this.g;
        f(rectF);
        afbk afbkVarB = afbjVar.b(a);
        if (!afbkVarB.f(rectF)) {
            this.l.c(afbkVarB, null, 1.0f, rectF, null, this.j);
            this.n = -1.0f;
        } else {
            float fE = e();
            rectF.inset(fE, fE);
            this.n = afbkVarB.b.a(rectF);
            this.j.reset();
        }
    }

    private static final int l(TypedArray typedArray, int i) {
        if (typedArray.getType(i) == 1) {
            return typedArray.getResourceId(i, Integer.MIN_VALUE);
        }
        return Integer.MIN_VALUE;
    }

    private static final int[] m(Resources.Theme theme, int i) {
        TypedArray typedArrayObtainTypedArray = theme.getResources().obtainTypedArray(i);
        int[] iArr = new int[typedArrayObtainTypedArray.length()];
        for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
            iArr[i2] = typedArrayObtainTypedArray.getResourceId(i2, 0);
        }
        typedArrayObtainTypedArray.recycle();
        return iArr;
    }

    private static final int n(TypedArray typedArray, int i) {
        if (typedArray.getType(i) == 2) {
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i, typedValue)) {
                return typedValue.data;
            }
        }
        return Integer.MIN_VALUE;
    }

    private static final int o(int i, Resources.Theme theme, int i2, TypedArray typedArray, int i3, int i4) {
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (i2 != Integer.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i2, typedValue, true)) {
                return typedValue.data;
            }
        }
        return typedArray.getColor(i3, i4);
    }

    private static final float p(float f, Resources.Theme theme, int i, TypedArray typedArray, int i2, int i3) {
        if (!Float.isNaN(f)) {
            return f;
        }
        Resources resources = theme.getResources();
        if (i != Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i2, Float.NaN);
        if (!Float.isNaN(dimension)) {
            return dimension;
        }
        if (i3 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i3);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        i(theme);
    }

    public final void c(afbe afbeVar) {
        this.m = new WeakReference(afbeVar);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0043 A[PHI: r4
      0x0043: PHI (r4v2 android.graphics.Path) = (r4v1 android.graphics.Path), (r4v22 android.graphics.Path) binds: [B:7:0x0026, B:13:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Path path;
        float fMax;
        Drawable drawable;
        int radius;
        super.draw(canvas);
        if (this.c.c && this.q) {
            float fE = e();
            aexs aexsVar = this.c;
            float f = aexsVar.p + aexsVar.r;
            float f2 = (aexsVar.l / 2.0f) * this.b;
            Path path2 = this.j;
            if (path2.isEmpty()) {
                WeakReference weakReference = this.m;
                if (weakReference != null && weakReference.get() != null) {
                    path2 = ((afbe) this.m.get()).g;
                    if (!path2.isEmpty()) {
                        path = path2;
                    }
                }
                path = null;
            } else {
                path = path2;
            }
            float f3 = f + f2;
            aexs aexsVar2 = this.c;
            if (path != null) {
                g(canvas, path, f3, aexsVar2.l, aexsVar2.h);
                aexs aexsVar3 = this.c;
                g(canvas, path, fE, aexsVar3.j, aexsVar3.f);
                return;
            }
            if (Float.isNaN(aexsVar2.n)) {
                fMax = this.n;
                if (fMax < 0.0f) {
                    WeakReference weakReference2 = this.m;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        drawable = getDrawable();
                        if ((drawable instanceof RippleDrawable) || (radius = ((RippleDrawable) drawable).getRadius()) < 0) {
                            fMax = 0.0f;
                        } else {
                            fMax = radius;
                        }
                    } else {
                        afbe afbeVar = (afbe) this.m.get();
                        float fB = afbeVar.b(afbeVar.k(), afbeVar.a.a.a(), afbeVar.j);
                        if (fB >= 0.0f) {
                            fB *= afbeVar.a.k;
                        }
                        if (fB >= 0.0f) {
                            fMax = Math.max(0.0f, fB - (this.c.j / 2.0f));
                        } else {
                            drawable = getDrawable();
                            if (drawable instanceof RippleDrawable) {
                                fMax = 0.0f;
                            } else {
                                fMax = 0.0f;
                            }
                        }
                    }
                }
            } else {
                fMax = this.c.n;
            }
            float fMax2 = Math.max(0.0f, fMax - (this.c.j / 2.0f));
            aexs aexsVar4 = this.c;
            h(canvas, fMax2, f3, aexsVar4.l, aexsVar4.h);
            aexs aexsVar5 = this.c;
            h(canvas, fMax, fE, aexsVar5.j, aexsVar5.f);
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        aexs aexsVar = this.c;
        if (aexsVar.a == null) {
            return null;
        }
        aexsVar.b = getChangingConfigurations();
        return this.c;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            return super.hasFocusStateSpecified() || this.c.c;
        } catch (NoSuchMethodError unused) {
            return this.c.c;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, aexu.a, 0, 0) : resources.obtainAttributes(attributeSet, aexu.a);
        this.c.d = n(typedArrayObtainStyledAttributes, 0);
        if (this.c.d == Integer.MIN_VALUE && typedArrayObtainStyledAttributes.hasValue(0)) {
            aexs aexsVar = this.c;
            aexsVar.c = typedArrayObtainStyledAttributes.getBoolean(0, aexsVar.c);
            this.c.e = true;
        }
        this.c.g = n(typedArrayObtainStyledAttributes, 5);
        aexs aexsVar2 = this.c;
        if (aexsVar2.g == Integer.MIN_VALUE) {
            aexsVar2.f = typedArrayObtainStyledAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.c.i = n(typedArrayObtainStyledAttributes, 1);
        aexs aexsVar3 = this.c;
        if (aexsVar3.i == Integer.MIN_VALUE) {
            aexsVar3.h = typedArrayObtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.c.k = n(typedArrayObtainStyledAttributes, 6);
        aexs aexsVar4 = this.c;
        if (aexsVar4.k == Integer.MIN_VALUE) {
            aexsVar4.j = typedArrayObtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.c.m = n(typedArrayObtainStyledAttributes, 3);
        aexs aexsVar5 = this.c;
        if (aexsVar5.m == Integer.MIN_VALUE) {
            aexsVar5.l = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.c.m = n(typedArrayObtainStyledAttributes, 3);
        aexs aexsVar6 = this.c;
        if (aexsVar6.m == Integer.MIN_VALUE) {
            aexsVar6.l = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.c.o = n(typedArrayObtainStyledAttributes, 7);
        aexs aexsVar7 = this.c;
        if (aexsVar7.o == Integer.MIN_VALUE) {
            aexsVar7.n = typedArrayObtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.c.q = n(typedArrayObtainStyledAttributes, 4);
        aexs aexsVar8 = this.c;
        if (aexsVar8.q == Integer.MIN_VALUE) {
            aexsVar8.p = typedArrayObtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.c.s = n(typedArrayObtainStyledAttributes, 2);
        aexs aexsVar9 = this.c;
        if (aexsVar9.s == Integer.MIN_VALUE) {
            aexsVar9.r = typedArrayObtainStyledAttributes.getDimension(2, Float.NaN);
        }
        this.c.v = n(typedArrayObtainStyledAttributes, 8);
        this.c.u = l(typedArrayObtainStyledAttributes, 8);
        this.c.y = l(typedArrayObtainStyledAttributes, 9);
        typedArrayObtainStyledAttributes.recycle();
        int depth = xmlPullParser.getDepth();
        Drawable colorDrawable = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                break;
            }
            if (next == 3) {
                if (xmlPullParser.getDepth() <= depth) {
                    break;
                }
            } else if (next == 2) {
                colorDrawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (colorDrawable == null) {
            colorDrawable = new ColorDrawable(0);
        }
        setDrawable(colorDrawable);
        this.c.a = colorDrawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Drawable drawable = getDrawable();
        return drawable != null && drawable.isProjected();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful() || this.c.c;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.o = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.r && super.mutate() == this) {
            this.c = new aexs(this.c);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.c.a = drawable.getConstantState();
            }
            this.r = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        float[] cornerRadii;
        float cornerRadius;
        super.onBoundsChange(rect);
        aexs aexsVar = this.c;
        if (aexsVar.c) {
            afbj afbjVar = aexsVar.t;
            if (afbjVar != null) {
                k(afbjVar);
                return;
            }
            Drawable drawable = getDrawable();
            afbk afbkVar = null;
            if (drawable instanceof ShapeDrawable) {
                Outline outline = new Outline();
                ((ShapeDrawable) drawable).getOutline(outline);
                if (outline.getRadius() > 0.0f) {
                    afli afliVar = new afli((byte[]) null);
                    afliVar.h(outline.getRadius());
                    afbkVar = new afbk(afliVar);
                }
            } else if (drawable instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                try {
                    cornerRadii = gradientDrawable.getCornerRadii();
                } catch (NullPointerException unused) {
                    cornerRadii = null;
                }
                if (cornerRadii != null) {
                    afli afliVar2 = new afli((byte[]) null);
                    afliVar2.f(Math.min(cornerRadii[0], cornerRadii[1]));
                    afliVar2.g(Math.min(cornerRadii[2], cornerRadii[3]));
                    afliVar2.e(Math.min(cornerRadii[4], cornerRadii[5]));
                    afliVar2.d(Math.min(cornerRadii[6], cornerRadii[7]));
                    afbkVar = new afbk(afliVar2);
                } else {
                    try {
                        cornerRadius = gradientDrawable.getCornerRadius();
                    } catch (NullPointerException unused2) {
                        cornerRadius = -1.0f;
                    }
                    if (cornerRadius > 0.0f) {
                        afli afliVar3 = new afli((byte[]) null);
                        afliVar3.h(cornerRadius);
                        afbkVar = new afbk(afliVar3);
                    }
                }
            }
            if (afbkVar != null) {
                k(afbkVar);
            } else {
                this.n = -1.0f;
                this.j.reset();
            }
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        aexs aexsVar = this.c;
        if (!aexsVar.c) {
            this.q = false;
            return super.onStateChange(iArr);
        }
        boolean zStateSetMatches = StateSet.stateSetMatches(aexsVar.x, iArr);
        boolean z = this.q != zStateSetMatches;
        this.q = zStateSetMatches;
        if (z && iArr.length > 0 && !this.p) {
            ObjectAnimator objectAnimator = this.o;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.o = null;
            }
            if (zStateSetMatches) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, e, 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.setInterpolator(d);
                objectAnimatorOfFloat.addListener(new aexr(this));
                this.o = objectAnimatorOfFloat;
                objectAnimatorOfFloat.start();
            } else {
                this.b = 1.0f;
            }
        }
        this.p = iArr.length == 0;
        return super.onStateChange(iArr) || z;
    }

    public FocusRingDrawable() {
        super(null);
        this.f = new Paint(1);
        this.g = new RectF();
        this.h = new Rect();
        this.i = new Path();
        this.j = new Path();
        this.k = new Matrix();
        this.l = afbm.a();
        this.n = -1.0f;
        this.b = 1.0f;
        this.q = false;
        this.r = false;
        this.c = new aexs(null);
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.f = new Paint(1);
        this.g = new RectF();
        this.h = new Rect();
        this.i = new Path();
        this.j = new Path();
        this.k = new Matrix();
        this.l = afbm.a();
        this.n = -1.0f;
        this.b = 1.0f;
        this.q = false;
        this.r = false;
        aexs aexsVar = new aexs(null);
        this.c = aexsVar;
        if (drawable != null) {
            aexsVar.a = drawable.getConstantState();
        }
        i(context.getTheme());
    }

    public /* synthetic */ FocusRingDrawable(aexs aexsVar, Resources resources, aext aextVar) {
        this(aexsVar, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}

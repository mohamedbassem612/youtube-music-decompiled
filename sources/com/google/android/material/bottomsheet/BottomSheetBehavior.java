package com.google.android.material.bottomsheet;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.music.R;
import defpackage.a;
import defpackage.aetz;
import defpackage.aevl;
import defpackage.aevm;
import defpackage.aevn;
import defpackage.aevo;
import defpackage.aevp;
import defpackage.aevq;
import defpackage.aevr;
import defpackage.aevs;
import defpackage.aevz;
import defpackage.aewa;
import defpackage.aeyo;
import defpackage.aeyp;
import defpackage.aeyq;
import defpackage.aeys;
import defpackage.aeyt;
import defpackage.aeyx;
import defpackage.afba;
import defpackage.afbe;
import defpackage.afbk;
import defpackage.ast;
import defpackage.asv;
import defpackage.azs;
import defpackage.bac;
import defpackage.bby;
import defpackage.bdq;
import defpackage.bdr;
import defpackage.bnn;
import defpackage.ci;
import defpackage.kdw;
import defpackage.pw;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class BottomSheetBehavior extends ast implements aeyt {
    public int A;
    float B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public bdr G;
    int H;
    public int I;
    public WeakReference J;
    final List K;
    public int L;
    public WeakReference M;
    public boolean N;
    final SparseIntArray O;
    final SparseIntArray P;
    final SparseIntArray Q;
    aeys R;
    private int S;
    private ColorStateList T;
    private boolean U;
    private boolean V;
    private afbk W;
    private boolean X;
    private final aevs Y;
    private ValueAnimator Z;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private int ae;
    private boolean af;
    private final float ag;
    private int ah;
    private final ArrayList ai;
    private VelocityTracker aj;
    private int ak;
    private Map al;
    private final Rect am;
    private final bdq an;
    private int b;
    private float c;
    private boolean d;
    private int e;
    public boolean f;
    public int g;
    public boolean h;
    public int i;
    public afbe j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    int w;
    public int x;
    public int y;
    public float z;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.f = true;
        this.k = -1;
        this.l = -1;
        this.Y = new aevs(this);
        this.z = 0.5f;
        this.B = -1.0f;
        this.E = true;
        this.aa = true;
        this.ac = true;
        this.F = 4;
        this.ag = 0.1f;
        this.K = new ArrayList();
        this.ai = new ArrayList();
        this.ak = -1;
        this.O = new SparseIntArray();
        this.P = new SparseIntArray();
        this.Q = new SparseIntArray();
        this.am = new Rect();
        this.an = new aevo(this);
        this.S = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aewa.a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.T = afba.f(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(24)) {
            this.W = new afbk(afbk.j(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal));
        }
        if (this.W != null) {
            afbe afbeVar = new afbe(this.W);
            this.j = afbeVar;
            afbeVar.n(context);
            ColorStateList colorStateList = this.T;
            if (colorStateList != null) {
                this.j.q(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.j.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(q(), 1.0f);
        this.Z = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.Z.addUpdateListener(new aevm(this));
        this.B = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(12);
        if (typedValuePeekValue == null || typedValuePeekValue.data != -1) {
            Q(typedArrayObtainStyledAttributes.getDimensionPixelSize(12, -1));
        } else {
            Q(typedValuePeekValue.data);
        }
        H(typedArrayObtainStyledAttributes.getBoolean(10, false));
        this.n = typedArrayObtainStyledAttributes.getBoolean(16, false);
        F(typedArrayObtainStyledAttributes.getBoolean(8, true));
        this.D = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.E = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.aa = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.b = typedArrayObtainStyledAttributes.getInt(13, 0);
        G(typedArrayObtainStyledAttributes.getFloat(9, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(7);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            E(typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0));
        } else {
            E(typedValuePeekValue2.data);
        }
        this.g = typedArrayObtainStyledAttributes.getInt(14, 500);
        this.h = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.ac = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.o = typedArrayObtainStyledAttributes.getBoolean(20, false);
        this.p = typedArrayObtainStyledAttributes.getBoolean(21, false);
        this.q = typedArrayObtainStyledAttributes.getBoolean(22, false);
        this.U = typedArrayObtainStyledAttributes.getBoolean(23, true);
        this.r = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.s = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.t = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.V = typedArrayObtainStyledAttributes.getBoolean(26, true);
        typedArrayObtainStyledAttributes.recycle();
        this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private final int S(int i) {
        if (i == 3) {
            return t();
        }
        if (i == 4) {
            return this.A;
        }
        if (i == 5) {
            return this.I;
        }
        if (i == 6) {
            return this.y;
        }
        throw new IllegalArgumentException(a.bR(i, "Invalid state to get top offset: "));
    }

    private final void T() {
        int iS = s();
        boolean z = this.f;
        int i = this.I - iS;
        if (z) {
            this.A = Math.max(i, this.x);
        } else {
            this.A = i;
        }
    }

    private final void U() {
        this.y = (int) (this.I * (1.0f - this.z));
    }

    private final void V() {
        this.L = -1;
        this.ak = -1;
        this.M = null;
        VelocityTracker velocityTracker = this.aj;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.aj = null;
        }
    }

    private final void W() {
        View view;
        WeakReference weakReference = this.J;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        bac.m(1048576, view);
        bac.j(view, 0);
        bac.m(524288, view);
        bac.j(view, 0);
        bac.m(262144, view);
        bac.j(view, 0);
        SparseIntArray sparseIntArray = this.P;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            bac.m(i, view);
            bac.j(view, 0);
            sparseIntArray.delete(0);
        }
        SparseIntArray sparseIntArray2 = this.O;
        int i2 = sparseIntArray2.get(0, -1);
        if (i2 != -1) {
            bac.m(i2, view);
            bac.j(view, 0);
            sparseIntArray2.delete(0);
        }
        SparseIntArray sparseIntArray3 = this.Q;
        int i3 = sparseIntArray3.get(0, -1);
        if (i3 != -1) {
            bac.m(i3, view);
            bac.j(view, 0);
            sparseIntArray3.delete(0);
        }
        if (!this.f && this.F != 6) {
            sparseIntArray2.put(0, r(view, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.C && this.F != 5) {
            bac.n(view, bby.g, null, new aevp(this, 5));
        }
        int i4 = this.F;
        if (i4 == 3) {
            if (O()) {
                sparseIntArray3.put(0, r(view, R.string.bottomsheet_action_collapse, 4));
            }
        } else if (i4 == 4) {
            sparseIntArray.put(0, r(view, R.string.bottomsheet_action_expand, 3));
        } else if (i4 == 6) {
            if (O()) {
                sparseIntArray3.put(0, r(view, R.string.bottomsheet_action_collapse, 4));
            }
            sparseIntArray.put(0, r(view, R.string.bottomsheet_action_expand, 3));
        }
    }

    private final void X(int i, boolean z) {
        ValueAnimator valueAnimator;
        if (i != 2) {
            boolean z2 = this.F == 3 && (this.V || aa());
            if (this.X == z2 || this.j == null) {
                return;
            }
            this.X = z2;
            if (!z || (valueAnimator = this.Z) == null) {
                ValueAnimator valueAnimator2 = this.Z;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.Z.cancel();
                }
                this.j.r(this.X ? q() : 1.0f);
                return;
            }
            if (valueAnimator.isRunning()) {
                this.Z.reverse();
            } else {
                this.Z.setFloatValues(this.j.a.k, z2 ? q() : 1.0f);
                this.Z.start();
            }
        }
    }

    private final void Y(boolean z) {
        WeakReference weakReference = this.J;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.al != null) {
                        return;
                    } else {
                        this.al = new HashMap(childCount);
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.J.get() && z) {
                        this.al.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (z) {
                    return;
                }
                this.al = null;
            }
        }
    }

    private final boolean Z() {
        Iterator it = this.K.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() != null) {
                return true;
            }
        }
        return false;
    }

    private final boolean aa() {
        WeakReference weakReference = this.J;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.J.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    private final boolean ab(View view) {
        Iterator it = this.K.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == view) {
                return true;
            }
        }
        return false;
    }

    private final boolean ac() {
        if (this.G != null) {
            return this.E || this.F == 1;
        }
        return false;
    }

    private static final float ad(float f, RoundedCorner roundedCorner) {
        if (roundedCorner == null) {
            return 0.0f;
        }
        float radius = roundedCorner.getRadius();
        if (radius <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return radius / f;
    }

    private static final int ae(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    private final float q() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.j != null && (weakReference = this.J) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.J.get();
            if (aa() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                afbe afbeVar = this.j;
                float[] fArr = afbeVar.j;
                float fAd = ad(fArr != null ? fArr[3] : afbeVar.a.a.a().b.a(afbeVar.k()), rootWindowInsets.getRoundedCorner(0));
                afbe afbeVar2 = this.j;
                float[] fArr2 = afbeVar2.j;
                return Math.max(fAd, ad(fArr2 != null ? fArr2[0] : afbeVar2.a.a.a().c.a(afbeVar2.k()), rootWindowInsets.getRoundedCorner(1)));
            }
        }
        return 0.0f;
    }

    private final int r(View view, int i, int i2) {
        return bac.a(view, view.getResources().getString(i), new aevp(this, i2));
    }

    private final int s() {
        int iMin;
        int i;
        int i2;
        if (this.d) {
            iMin = Math.min(Math.max(this.e, this.I - ((this.H * 9) / 16)), this.ah);
            i = this.u;
        } else {
            if (!this.n && !this.o && (i2 = this.m) > 0) {
                return Math.max(this.i, i2 + this.S);
            }
            iMin = this.i;
            i = this.u;
        }
        return iMin + i;
    }

    public static BottomSheetBehavior x(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof asv)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        ast astVar = ((asv) layoutParams).a;
        if (astVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) astVar;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public final void A(int i) {
        float fT;
        View view = (View) this.J.get();
        if (view != null) {
            ArrayList arrayList = this.ai;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.A;
            if (i > i2 || i2 == t()) {
                int i3 = this.A;
                fT = (i3 - i) / (this.I - i3);
            } else {
                int i4 = this.A;
                fT = (i4 - i) / (i4 - t());
            }
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((aevq) arrayList.get(i5)).a(view, fT);
            }
        }
    }

    @Override // defpackage.aeyt
    public final void B() {
        aeys aeysVar = this.R;
        if (aeysVar != null) {
            pw pwVar = aeysVar.f;
            aeysVar.f = null;
            if (pwVar == null || Build.VERSION.SDK_INT < 34) {
                I(true == this.C ? 5 : 4);
                return;
            }
            boolean z = this.C;
            aeys aeysVar2 = this.R;
            if (!z) {
                Animator animatorA = aeysVar2.a();
                animatorA.setDuration(aetz.b(aeysVar2.c, aeysVar2.d, pwVar.a));
                animatorA.start();
                I(4);
                return;
            }
            aevl aevlVar = new aevl(this);
            View view = aeysVar2.b;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getHeight() * view.getScaleY());
            objectAnimatorOfFloat.setInterpolator(new bnn());
            objectAnimatorOfFloat.setDuration(aetz.b(aeysVar2.c, aeysVar2.d, pwVar.a));
            objectAnimatorOfFloat.addListener(new aeyx(aeysVar2));
            objectAnimatorOfFloat.addListener(aevlVar);
            objectAnimatorOfFloat.start();
        }
    }

    final void C(View view) {
        if (view.getVisibility() == 0) {
            if (view.isNestedScrollingEnabled()) {
                this.K.add(new WeakReference(view));
                return;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    C(viewGroup.getChildAt(i));
                }
            }
        }
    }

    public final void D(aevq aevqVar) {
        this.ai.remove(aevqVar);
    }

    public final void E(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.w = i;
        X(this.F, true);
    }

    public final void F(boolean z) {
        if (this.f != z) {
            this.f = z;
            if (this.J != null) {
                T();
            }
            J((this.f && this.F == 6) ? 3 : this.F);
            X(this.F, true);
            W();
        }
    }

    public final void G(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.z = f;
        if (this.J != null) {
            U();
        }
    }

    public final void H(boolean z) {
        if (this.C != z) {
            this.C = z;
            if (!z && this.F == 5) {
                I(4);
            }
            W();
        }
    }

    public final void I(int i) {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.C && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: 5");
            return;
        }
        int i2 = (i == 6 && this.f && S(6) <= this.x) ? 3 : i;
        WeakReference weakReference = this.J;
        if (weakReference == null || weakReference.get() == null) {
            J(i);
            return;
        }
        View view = (View) this.J.get();
        kdw kdwVar = new kdw(this, view, i2, 4);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(kdwVar);
        } else {
            kdwVar.run();
        }
    }

    public final void J(int i) {
        View view;
        if (this.F == i) {
            return;
        }
        this.F = i;
        int i2 = 4;
        if (i != 4 && i != 3 && i != 6 && this.C && i == 5) {
            i = 5;
        }
        WeakReference weakReference = this.J;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i3 = 0;
        if (i == 3) {
            Y(true);
        } else {
            if (i == 6 || i == 5) {
                i2 = i;
            } else if (i == 4) {
            }
            Y(false);
            i = i2;
        }
        X(i, true);
        while (true) {
            ArrayList arrayList = this.ai;
            if (i3 >= arrayList.size()) {
                W();
                return;
            } else {
                ((aevq) arrayList.get(i3)).b(view, i);
                i3++;
            }
        }
    }

    @Override // defpackage.aeyt
    public final void K(pw pwVar) {
        aeys aeysVar = this.R;
        if (aeysVar != null) {
            aeysVar.f = pwVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.i(r3.getLeft(), r0) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.S(r4)
            bdr r1 = r2.G
            if (r1 == 0) goto L3f
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.i(r3, r0)
            if (r3 == 0) goto L3f
            goto L31
        L15:
            int r5 = r3.getLeft()
            r1.d = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.g(r5, r0, r3, r3)
            if (r3 != 0) goto L31
            int r3 = r1.a
            if (r3 != 0) goto L3f
            android.view.View r3 = r1.d
            if (r3 == 0) goto L3f
            r3 = 0
            r1.d = r3
            goto L3f
        L31:
            r3 = 2
            r2.J(r3)
            r3 = 1
            r2.X(r4, r3)
            aevs r2 = r2.Y
            r2.a(r4)
            goto L42
        L3f:
            r2.J(r4)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.L(android.view.View, int, boolean):void");
    }

    @Override // defpackage.aeyt
    public final void M(pw pwVar) {
        aeys aeysVar = this.R;
        if (aeysVar != null) {
            if (aeysVar.f == null) {
                Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
            }
            pw pwVar2 = aeysVar.f;
            aeysVar.f = pwVar;
            if (pwVar2 != null) {
                aeysVar.b(pwVar.a);
            }
        }
    }

    public final boolean N() {
        return this.C;
    }

    final boolean O() {
        return (this.D && this.C) ? false : true;
    }

    public final boolean P(View view, float f) {
        if (this.D) {
            return true;
        }
        if (view.getTop() >= this.A) {
            if (Math.abs((view.getTop() + (f * this.ag)) - this.A) / s() > 0.5f) {
                return true;
            }
        }
        return false;
    }

    public final void Q(int i) {
        boolean z = this.d;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.d = true;
            }
        } else {
            if (!z && this.i == i) {
                return;
            }
            this.d = false;
            this.i = Math.max(0, i);
        }
        R();
    }

    public final void R() {
        View view;
        if (this.J != null) {
            T();
            if (this.F != 4 || (view = (View) this.J.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // defpackage.ast
    public final void onAttachedToLayoutParams(asv asvVar) {
        this.J = null;
        this.G = null;
        this.R = null;
    }

    @Override // defpackage.ast
    public final void onDetachedFromLayoutParams() {
        this.J = null;
        this.G = null;
        this.R = null;
    }

    @Override // defpackage.ast
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        View viewW;
        int i;
        WeakReference weakReference;
        bdr bdrVar;
        if (view.isShown() && this.E) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                V();
                actionMasked = 0;
            }
            VelocityTracker velocityTrackerObtain = this.aj;
            if (velocityTrackerObtain == null) {
                velocityTrackerObtain = VelocityTracker.obtain();
                this.aj = velocityTrackerObtain;
            }
            velocityTrackerObtain.addMovement(motionEvent);
            View view2 = null;
            if (actionMasked == 0) {
                int x = (int) motionEvent.getX();
                this.ak = (int) motionEvent.getY();
                int x2 = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                List list = this.K;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        View view3 = (View) ((WeakReference) it.next()).get();
                        if (view3 != null && coordinatorLayout.l(view3, x2, y)) {
                            view2 = view3;
                            break;
                        }
                    }
                }
                WeakReference weakReference2 = new WeakReference(view2);
                this.M = weakReference2;
                if (this.F != 2 && weakReference2.get() != null) {
                    this.L = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.N = true;
                }
                this.ad = this.L == -1 && !coordinatorLayout.l(view, x, this.ak);
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.N = false;
                this.M = null;
                this.L = -1;
                if (this.ad) {
                    this.ad = false;
                }
            }
            if (!this.ad && (bdrVar = this.G) != null && bdrVar.j(motionEvent)) {
                return true;
            }
            if (actionMasked == 2 && Z() && !this.ad && this.F != 1 && (!this.h ? (viewW = w()) == null || !coordinatorLayout.l(viewW, (int) motionEvent.getX(), (int) motionEvent.getY()) : (weakReference = this.M) == null || weakReference.get() == null) && this.G != null && (i = this.ak) != -1) {
                if (Math.abs(i - motionEvent.getY()) > this.G.b) {
                    return true;
                }
            }
        } else {
            this.ad = true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    @Override // defpackage.ast
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i2 = 0;
        if (this.J == null) {
            this.e = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.n || this.d) ? false : true;
            if (this.o || this.p || this.q || this.r || this.s || this.t) {
                aeyo aeyoVar = new aeyo(new aevn(this, z), new aeyq(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom()), 0);
                int i3 = bac.a;
                azs.c(view, aeyoVar);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new aeyp());
                }
            } else if (z) {
                z = true;
                aeyo aeyoVar2 = new aeyo(new aevn(this, z), new aeyq(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom()), 0);
                int i4 = bac.a;
                azs.c(view, aeyoVar2);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new aeyp());
                }
            }
            aevz aevzVar = new aevz(view);
            int i5 = bac.a;
            ci.m(view, aevzVar);
            this.J = new WeakReference(view);
            this.R = new aeys(view);
            afbe afbeVar = this.j;
            if (afbeVar != null) {
                view.setBackground(afbeVar);
                afbe afbeVar2 = this.j;
                float elevation = this.B;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                afbeVar2.p(elevation);
            } else {
                ColorStateList colorStateList = this.T;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            W();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.G == null) {
            this.G = new bdr(coordinatorLayout.getContext(), coordinatorLayout, this.an);
        }
        int top = view.getTop();
        coordinatorLayout.j(view, i);
        this.H = coordinatorLayout.getWidth();
        this.I = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.ah = height;
        int i6 = this.I;
        int i7 = i6 - height;
        int i8 = this.v;
        if (i7 < i8) {
            boolean z2 = this.U;
            int i9 = this.l;
            if (z2) {
                height = i9 == -1 ? i6 : Math.min(i6, i9);
                this.ah = height;
            } else {
                int i10 = i6 - i8;
                height = i9 != -1 ? Math.min(i10, i9) : i10;
                this.ah = height;
            }
        }
        this.x = Math.max(0, this.I - height);
        U();
        T();
        int i11 = this.F;
        if (i11 == 3) {
            int iT = t();
            int i12 = bac.a;
            view.offsetTopAndBottom(iT);
        } else if (i11 == 6) {
            int i13 = this.y;
            int i14 = bac.a;
            view.offsetTopAndBottom(i13);
        } else if (this.C && i11 == 5) {
            int i15 = this.I;
            int i16 = bac.a;
            view.offsetTopAndBottom(i15);
        } else if (i11 == 4) {
            int i17 = this.A;
            int i18 = bac.a;
            view.offsetTopAndBottom(i17);
        } else if (i11 == 1 || i11 == 2) {
            int top2 = top - view.getTop();
            int i19 = bac.a;
            view.offsetTopAndBottom(top2);
        }
        X(this.F, false);
        List list = this.K;
        list.clear();
        if (this.h) {
            C(view);
        } else {
            list.add(new WeakReference(v(view)));
        }
        while (true) {
            ArrayList arrayList = this.ai;
            if (i2 >= arrayList.size()) {
                return true;
            }
            ((aevq) arrayList.get(i2)).r(view);
            i2++;
        }
    }

    @Override // defpackage.ast
    public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ae(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.k, marginLayoutParams.width), ae(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.l, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.ast
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        return Z() && ab(view2) && this.F != 3 && !this.ab;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r4 != false) goto L26;
     */
    @Override // defpackage.ast
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4, int r5, int r6, int[] r7, int r8) {
        /*
            r1 = this;
            r2 = 1
            if (r8 == r2) goto L92
            boolean r5 = r1.ab(r4)
            if (r5 == 0) goto L92
            int r5 = r3.getTop()
            int r8 = r5 - r6
            if (r6 <= 0) goto L47
            boolean r0 = r1.af
            if (r0 != 0) goto L1f
            boolean r0 = r1.aa
            if (r0 != 0) goto L1f
            boolean r4 = r4.canScrollVertically(r2)
            if (r4 != 0) goto L58
        L1f:
            int r4 = r1.t()
            if (r8 >= r4) goto L37
            int r4 = r1.t()
            int r5 = r5 - r4
            r7[r2] = r5
            int r4 = defpackage.bac.a
            int r4 = -r5
            r3.offsetTopAndBottom(r4)
            r4 = 3
            r1.J(r4)
            goto L84
        L37:
            boolean r4 = r1.E
            if (r4 == 0) goto L92
            r7[r2] = r6
            int r4 = -r6
            int r5 = defpackage.bac.a
            r3.offsetTopAndBottom(r4)
            r1.J(r2)
            goto L84
        L47:
            if (r6 >= 0) goto L84
            r0 = -1
            boolean r4 = r4.canScrollVertically(r0)
            boolean r0 = r1.af
            if (r0 != 0) goto L5b
            boolean r0 = r1.aa
            if (r0 != 0) goto L5b
            if (r4 == 0) goto L5d
        L58:
            r1.ab = r2
            goto L92
        L5b:
            if (r4 != 0) goto L84
        L5d:
            int r4 = r1.A
            if (r8 <= r4) goto L75
            boolean r8 = r1.N()
            if (r8 != 0) goto L75
            int r5 = r5 - r4
            r7[r2] = r5
            int r4 = defpackage.bac.a
            int r4 = -r5
            r3.offsetTopAndBottom(r4)
            r4 = 4
            r1.J(r4)
            goto L84
        L75:
            boolean r4 = r1.E
            if (r4 == 0) goto L92
            r7[r2] = r6
            int r4 = -r6
            int r5 = defpackage.bac.a
            r3.offsetTopAndBottom(r4)
            r1.J(r2)
        L84:
            int r3 = r3.getTop()
            r1.A(r3)
            r1.ae = r6
            r1.af = r2
            r2 = 0
            r1.ab = r2
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int, int, int[], int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r4.bottom <= r2.bottom) goto L20;
     */
    @Override // defpackage.ast
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onRequestChildRectangleOnScreen(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.graphics.Rect r4, boolean r5) {
        /*
            r1 = this;
            boolean r2 = r1.ac
            if (r2 == 0) goto L41
            boolean r2 = r3.isInTouchMode()
            if (r2 != 0) goto L41
            int r2 = r1.F
            r5 = 4
            if (r2 == r5) goto L12
            r5 = 6
            if (r2 != r5) goto L41
        L12:
            android.graphics.Rect r2 = r1.am
            boolean r5 = r3.getLocalVisibleRect(r2)
            if (r5 == 0) goto L3b
            int r5 = defpackage.bac.a
            bbn r3 = defpackage.azt.a(r3)
            if (r3 == 0) goto L2f
            int r5 = r2.bottom
            r0 = 519(0x207, float:7.27E-43)
            avw r3 = r3.f(r0)
            int r3 = r3.e
            int r5 = r5 - r3
            r2.bottom = r5
        L2f:
            int r3 = r4.top
            int r5 = r2.top
            if (r3 < r5) goto L3b
            int r3 = r4.bottom
            int r2 = r2.bottom
            if (r3 <= r2) goto L41
        L3b:
            r2 = 3
            r1.I(r2)
            r1 = 1
            goto L42
        L41:
            r1 = 0
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onRequestChildRectangleOnScreen(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.graphics.Rect, boolean):boolean");
    }

    @Override // defpackage.ast
    public final void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        aevr aevrVar = (aevr) parcelable;
        Parcelable parcelable2 = aevrVar.d;
        int i = this.b;
        int i2 = 4;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.i = aevrVar.b;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f = aevrVar.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.C = aevrVar.f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.D = aevrVar.g;
            }
        }
        int i3 = aevrVar.a;
        if (i3 != 1 && i3 != 2) {
            i2 = i3;
        }
        this.F = i2;
    }

    @Override // defpackage.ast
    public final Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
        return new aevr(super.onSaveInstanceState(coordinatorLayout, view), this);
    }

    @Override // defpackage.ast
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.ae = 0;
        this.af = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0072  */
    /* JADX WARN: Code duplicated, block: B:38:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0089  */
    /* JADX WARN: Code duplicated, block: B:43:0x008d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a4  */
    @Override // defpackage.ast
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        int top;
        int top2;
        int i2;
        int i3;
        float yVelocity;
        int i4 = 3;
        if (view.getTop() == t()) {
            J(3);
            return;
        }
        if (ab(view2) && this.af) {
            if (this.ae > 0) {
                if (!this.f && view.getTop() > this.y) {
                    i4 = 6;
                }
            } else if (this.C) {
                VelocityTracker velocityTracker = this.aj;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.c);
                    yVelocity = this.aj.getYVelocity(this.L);
                }
                if (P(view, yVelocity)) {
                    i4 = 5;
                } else if (this.ae == 0) {
                    top2 = view.getTop();
                    if (this.f) {
                        i2 = this.y;
                        i3 = this.A;
                        if (top2 < i2) {
                            if (top2 >= Math.abs(top2 - i3)) {
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - i3)) {
                            i4 = 4;
                        }
                        i4 = 6;
                    } else if (Math.abs(top2 - this.x) >= Math.abs(top2 - this.A)) {
                        i4 = 4;
                    }
                } else {
                    if (!this.f) {
                        top = view.getTop();
                        if (Math.abs(top - this.y) < Math.abs(top - this.A)) {
                            i4 = 6;
                        }
                    }
                    i4 = 4;
                }
            } else if (this.ae == 0) {
                top2 = view.getTop();
                if (this.f) {
                    i2 = this.y;
                    i3 = this.A;
                    if (top2 < i2) {
                        if (top2 >= Math.abs(top2 - i3)) {
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - i3)) {
                        i4 = 4;
                    }
                    i4 = 6;
                } else if (Math.abs(top2 - this.x) >= Math.abs(top2 - this.A)) {
                    i4 = 4;
                }
            } else {
                if (!this.f) {
                    top = view.getTop();
                    if (Math.abs(top - this.y) < Math.abs(top - this.A)) {
                        i4 = 6;
                    }
                }
                i4 = 4;
            }
            L(view, i4, false);
            this.af = false;
        }
    }

    @Override // defpackage.ast
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.F != 1 || actionMasked != 0) {
            if (ac()) {
                this.G.e(motionEvent);
            }
            if (actionMasked == 0) {
                V();
            }
            VelocityTracker velocityTrackerObtain = this.aj;
            if (velocityTrackerObtain == null) {
                velocityTrackerObtain = VelocityTracker.obtain();
                this.aj = velocityTrackerObtain;
            }
            velocityTrackerObtain.addMovement(motionEvent);
            if (ac() && actionMasked == 2 && !this.ad) {
                float fAbs = Math.abs(this.ak - motionEvent.getY());
                bdr bdrVar = this.G;
                if (fAbs > bdrVar.b) {
                    bdrVar.d(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
                }
            }
            if (this.ad) {
                return false;
            }
        }
        return true;
    }

    public final int t() {
        if (this.f) {
            return this.x;
        }
        return Math.max(this.w, this.U ? 0 : this.v);
    }

    public final int u() {
        if (this.d) {
            return -1;
        }
        return this.i;
    }

    final View v(View view) {
        if (view.getVisibility() == 0) {
            if (view.isNestedScrollingEnabled()) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View viewV = v(viewGroup.getChildAt(i));
                    if (viewV != null) {
                        return viewV;
                    }
                }
            }
        }
        return null;
    }

    public final View w() {
        List list = this.K;
        if (list.isEmpty()) {
            return null;
        }
        return (View) ((WeakReference) list.get(0)).get();
    }

    public final void y(aevq aevqVar) {
        ArrayList arrayList = this.ai;
        if (arrayList.contains(aevqVar)) {
            return;
        }
        arrayList.add(aevqVar);
    }

    @Override // defpackage.aeyt
    public final void z() {
        aeys aeysVar = this.R;
        if (aeysVar != null) {
            if (aeysVar.f == null) {
                Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
            }
            pw pwVar = aeysVar.f;
            aeysVar.f = null;
            if (pwVar != null) {
                Animator animatorA = aeysVar.a();
                animatorA.setDuration(aeysVar.e);
                animatorA.start();
            }
        }
    }

    public BottomSheetBehavior() {
        this.b = 0;
        this.f = true;
        this.k = -1;
        this.l = -1;
        this.Y = new aevs(this);
        this.z = 0.5f;
        this.B = -1.0f;
        this.E = true;
        this.aa = true;
        this.ac = true;
        this.F = 4;
        this.ag = 0.1f;
        this.K = new ArrayList();
        this.ai = new ArrayList();
        this.ak = -1;
        this.O = new SparseIntArray();
        this.P = new SparseIntArray();
        this.Q = new SparseIntArray();
        this.am = new Rect();
        this.an = new aevo(this);
    }

    @Override // defpackage.ast
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }
}

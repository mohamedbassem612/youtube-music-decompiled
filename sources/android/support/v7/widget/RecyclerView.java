package android.support.v7.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import defpackage.a;
import defpackage.aav;
import defpackage.ace;
import defpackage.agk;
import defpackage.aha;
import defpackage.ayg;
import defpackage.ayh;
import defpackage.ays;
import defpackage.ayt;
import defpackage.azv;
import defpackage.azx;
import defpackage.bac;
import defpackage.bag;
import defpackage.bdp;
import defpackage.bq;
import defpackage.cwp;
import defpackage.hg;
import defpackage.hhb;
import defpackage.kc;
import defpackage.kd;
import defpackage.lm;
import defpackage.lu;
import defpackage.mf;
import defpackage.mh;
import defpackage.mj;
import defpackage.ng;
import defpackage.nh;
import defpackage.nk;
import defpackage.nl;
import defpackage.np;
import defpackage.nq;
import defpackage.nr;
import defpackage.ns;
import defpackage.nt;
import defpackage.nv;
import defpackage.nx;
import defpackage.nz;
import defpackage.oe;
import defpackage.of;
import defpackage.og;
import defpackage.oh;
import defpackage.oj;
import defpackage.om;
import defpackage.pj;
import defpackage.pk;
import defpackage.qa;
import defpackage.tgr;
import defpackage.zf;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ays {
    public static final /* synthetic */ int ad = 0;
    private static final Class[] ag;
    public static final Interpolator c;
    static final of d;
    public EdgeEffect A;
    public EdgeEffect B;
    public EdgeEffect C;
    public EdgeEffect D;
    public nl E;
    public int F;
    public ns G;
    public final int H;
    public final int I;
    public float J;
    public float K;
    public final og L;
    public mj M;
    public mh N;
    public final oe O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public oj S;
    public final int[] T;
    final List U;
    boolean V;
    ayg W;
    private int aA;
    private int aB;
    private int aC;
    private int aD;
    private boolean aE;
    private boolean aF;
    private List aG;
    private nk aH;
    private final int[] aI;
    private ayt aJ;
    private final int[] aK;
    private final int[] aL;
    private Runnable aM;
    private boolean aN;
    private int aO;
    private int aP;
    private final ayh aQ;
    private qa aR;
    private hhb aS;
    private final hhb aT;
    public final pj aa;
    public qa ab;
    zf ac;
    private final float ah;
    private boolean ai;
    private final nx aj;
    private final Rect ak;
    private Rect al;
    private final ArrayList am;
    private nt an;
    private final Runnable ao;
    private boolean ap;
    private boolean aq;
    private int ar;
    private boolean as;
    private int at;
    private final AccessibilityManager au;
    private int av;
    private int aw;
    private int ax;
    private VelocityTracker ay;
    private int az;
    public final nv e;
    nz f;
    public kd g;
    public lm h;
    public boolean i;
    public final Runnable j;
    public final Rect k;
    public final RectF l;
    public nh m;
    public np n;
    public final List o;
    public final ArrayList p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public List x;
    public boolean y;
    boolean z;
    private static final int[] ae = {R.attr.nestedScrollingEnabled};
    private static final float af = 2.3582017f;
    public static final boolean a = true;
    static final boolean b = true;

    static {
        Class cls = Integer.TYPE;
        ag = new Class[]{Context.class, AttributeSet.class, cls, cls};
        c = new bdp(1);
        d = new of();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        RecyclerView recyclerView = this;
        recyclerView.ai = false;
        recyclerView.aj = new nx(recyclerView);
        recyclerView.e = new nv(recyclerView);
        recyclerView.aa = new pj();
        recyclerView.j = new bq(recyclerView, 16, null);
        recyclerView.k = new Rect();
        recyclerView.ak = new Rect();
        recyclerView.l = new RectF();
        recyclerView.o = new ArrayList();
        recyclerView.p = new ArrayList();
        recyclerView.am = new ArrayList();
        recyclerView.ao = new bq(recyclerView, 15);
        recyclerView.ar = 0;
        recyclerView.y = false;
        recyclerView.z = false;
        recyclerView.av = 0;
        recyclerView.aw = 0;
        recyclerView.aR = d;
        recyclerView.E = new lu();
        recyclerView.F = 0;
        recyclerView.ax = -1;
        recyclerView.J = Float.MIN_VALUE;
        recyclerView.K = Float.MIN_VALUE;
        recyclerView.aE = true;
        recyclerView.aF = true;
        recyclerView.L = new og(recyclerView);
        recyclerView.N = new mh();
        recyclerView.O = new oe();
        recyclerView.P = false;
        recyclerView.Q = false;
        recyclerView.aS = new hhb(recyclerView);
        recyclerView.R = false;
        recyclerView.aI = new int[2];
        recyclerView.aK = new int[2];
        recyclerView.aL = new int[2];
        recyclerView.T = new int[2];
        recyclerView.U = new ArrayList();
        recyclerView.aM = new bq(recyclerView, 17, null);
        recyclerView.aO = 0;
        recyclerView.aP = 0;
        recyclerView.aT = new hhb(recyclerView);
        ng ngVar = new ng(recyclerView);
        recyclerView.aQ = ngVar;
        recyclerView.W = new ayg(recyclerView.getContext(), ngVar);
        recyclerView.setScrollContainer(true);
        recyclerView.setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        recyclerView.aD = viewConfiguration.getScaledTouchSlop();
        recyclerView.J = viewConfiguration.getScaledHorizontalScrollFactor();
        recyclerView.K = viewConfiguration.getScaledVerticalScrollFactor();
        recyclerView.H = viewConfiguration.getScaledMinimumFlingVelocity();
        recyclerView.I = viewConfiguration.getScaledMaximumFlingVelocity();
        recyclerView.ah = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        recyclerView.setWillNotDraw(recyclerView.getOverScrollMode() == 2);
        recyclerView.E.j = recyclerView.aS;
        recyclerView.g = new kd(new hhb(recyclerView));
        recyclerView.h = new lm(new hhb(recyclerView));
        int i2 = bac.a;
        if (azv.a(recyclerView) == 0) {
            azv.b(recyclerView, 8);
        }
        if (recyclerView.getImportantForAccessibility() == 0) {
            recyclerView.setImportantForAccessibility(1);
        }
        recyclerView.au = (AccessibilityManager) recyclerView.getContext().getSystemService("accessibility");
        recyclerView.ac(new oj(recyclerView));
        int[] iArr = hg.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        bac.o(recyclerView, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(9);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            recyclerView.setDescendantFocusability(262144);
        }
        recyclerView.i = typedArrayObtainStyledAttributes.getBoolean(1, true);
        recyclerView.aF = typedArrayObtainStyledAttributes.getBoolean(8, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables.".concat(recyclerView.o()));
            }
            Resources resources = recyclerView.getContext().getResources();
            new mf(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.google.android.apps.youtube.music.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.google.android.apps.youtube.music.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.google.android.apps.youtube.music.R.dimen.fastscroll_margin));
            recyclerView = this;
        }
        typedArrayObtainStyledAttributes.recycle();
        recyclerView.V = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        recyclerView.bb(context, string, attributeSet, i);
        int[] iArr2 = ae;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        bac.o(recyclerView, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        recyclerView.setNestedScrollingEnabled(z);
        recyclerView.setTag(com.google.android.apps.youtube.music.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static void N(View view, Rect rect) {
        nq nqVar = (nq) view.getLayoutParams();
        Rect rect2 = nqVar.d;
        rect.set((view.getLeft() - rect2.left) - nqVar.leftMargin, (view.getTop() - rect2.top) - nqVar.topMargin, view.getRight() + rect2.right + nqVar.rightMargin, view.getBottom() + rect2.bottom + nqVar.bottomMargin);
    }

    private final int a(int i, float f) {
        float height = getHeight();
        float width = i / getWidth();
        float f2 = f / height;
        EdgeEffect edgeEffect = this.A;
        float f3 = 0.0f;
        if (edgeEffect == null || ace.k(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.C;
            if (edgeEffect2 != null && ace.k(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.C;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fL = ace.l(edgeEffect3, width, f2);
                    if (ace.k(this.C) == 0.0f) {
                        this.C.onRelease();
                    }
                    f3 = fL;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.A;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f4 = -ace.l(edgeEffect4, -width, 1.0f - f2);
                if (ace.k(this.A) == 0.0f) {
                    this.A.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getWidth());
    }

    private final int aK(int i, float f) {
        float width = getWidth();
        float height = i / getHeight();
        float f2 = f / width;
        EdgeEffect edgeEffect = this.B;
        float f3 = 0.0f;
        if (edgeEffect == null || ace.k(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.D;
            if (edgeEffect2 != null && ace.k(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.D;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fL = ace.l(edgeEffect3, height, 1.0f - f2);
                    if (ace.k(this.D) == 0.0f) {
                        this.D.onRelease();
                    }
                    f3 = fL;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.B;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f4 = -ace.l(edgeEffect4, -height, f2);
                if (ace.k(this.B) == 0.0f) {
                    this.B.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getHeight());
    }

    private final ayt aL() {
        ayt aytVar = this.aJ;
        if (aytVar != null) {
            return aytVar;
        }
        ayt aytVar2 = new ayt(this);
        this.aJ = aytVar2;
        return aytVar2;
    }

    private final void aM() {
        aV();
        ai(0);
    }

    private final void aN() {
        this.O.b(1);
        M(this.O);
        this.O.i = false;
        ak();
        pj pjVar = this.aa;
        pjVar.e();
        T();
        aR();
        View focusedChild = (this.aE && hasFocus() && this.m != null) ? getFocusedChild() : null;
        oh ohVarH = focusedChild == null ? null : h(focusedChild);
        if (ohVarH == null) {
            aU();
        } else {
            oe oeVar = this.O;
            oeVar.m = this.m.c ? ohVarH.e : -1L;
            oeVar.l = this.y ? -1 : ohVarH.v() ? ohVarH.d : ohVarH.a();
            oe oeVar2 = this.O;
            View focusedChild2 = ohVarH.a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            oeVar2.n = id;
        }
        oe oeVar3 = this.O;
        oeVar3.h = oeVar3.j && this.Q;
        this.Q = false;
        this.P = false;
        oeVar3.g = oeVar3.k;
        oeVar3.e = this.m.a();
        aP(this.aI);
        if (this.O.j) {
            int iA = this.h.a();
            for (int i = 0; i < iA; i++) {
                View viewD = this.h.d(i);
                oh ohVar = viewD == null ? null : ((nq) viewD.getLayoutParams()).c;
                if (!ohVar.A() && (!ohVar.t() || this.m.c)) {
                    nl.o(ohVar);
                    ohVar.d();
                    cwp cwpVar = new cwp();
                    cwpVar.b(ohVar);
                    pjVar.z(ohVar, cwpVar);
                    if (this.O.h && ohVar.y() && !ohVar.v() && !ohVar.A() && !ohVar.t()) {
                        pjVar.d(f(ohVar), ohVar);
                    }
                }
            }
        }
        if (this.O.k) {
            int iB = this.h.b();
            for (int i2 = 0; i2 < iB; i2++) {
                View viewE = this.h.e(i2);
                oh ohVar2 = viewE == null ? null : ((nq) viewE.getLayoutParams()).c;
                if (!ohVar2.A() && ohVar2.d == -1) {
                    ohVar2.d = ohVar2.c;
                }
            }
            oe oeVar4 = this.O;
            boolean z = oeVar4.f;
            oeVar4.f = false;
            this.n.onLayoutChildren(this.e, oeVar4);
            this.O.f = z;
            for (int i3 = 0; i3 < this.h.a(); i3++) {
                View viewD2 = this.h.d(i3);
                oh ohVar3 = viewD2 == null ? null : ((nq) viewD2.getLayoutParams()).c;
                if (!ohVar3.A()) {
                    aha ahaVar = (aha) pjVar.a;
                    pk pkVar = (pk) ahaVar.get(ohVar3);
                    if (pkVar == null || (pkVar.b & 4) == 0) {
                        nl.o(ohVar3);
                        boolean zQ = ohVar3.q(SemanticState.Multiline);
                        ohVar3.d();
                        cwp cwpVar2 = new cwp();
                        cwpVar2.b(ohVar3);
                        if (zQ) {
                            aD(ohVar3, cwpVar2);
                        } else {
                            pk pkVarA = (pk) ahaVar.get(ohVar3);
                            if (pkVarA == null) {
                                pkVarA = pk.a();
                                ahaVar.put(ohVar3, pkVarA);
                            }
                            pkVarA.b |= 2;
                            pkVarA.c = cwpVar2;
                        }
                    }
                }
            }
            z();
        } else {
            z();
        }
        U(true);
        al(false);
        this.O.d = 2;
    }

    private final void aO() {
        ak();
        T();
        this.O.b(6);
        this.g.d();
        int iA = this.m.a();
        oe oeVar = this.O;
        oeVar.e = iA;
        oeVar.c = 0;
        nz nzVar = this.f;
        if (nzVar != null) {
            int i = this.m.d;
            Parcelable parcelable = nzVar.a;
            if (parcelable != null) {
                this.n.onRestoreInstanceState(parcelable);
            }
            this.f = null;
        }
        oe oeVar2 = this.O;
        oeVar2.g = false;
        this.n.onLayoutChildren(this.e, oeVar2);
        oe oeVar3 = this.O;
        oeVar3.f = false;
        oeVar3.j = oeVar3.j && this.E != null;
        oeVar3.d = 4;
        U(true);
        al(false);
    }

    private final void aP(int[] iArr) {
        int iA = this.h.a();
        if (iA == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MIN_VALUE;
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        for (int i3 = 0; i3 < iA; i3++) {
            View viewD = this.h.d(i3);
            oh ohVar = viewD == null ? null : ((nq) viewD.getLayoutParams()).c;
            if (!ohVar.A()) {
                int iC = ohVar.c();
                if (iC < i2) {
                    i2 = iC;
                }
                if (iC > i) {
                    i = iC;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i;
    }

    private final void aQ(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.ax) {
            int i = actionIndex == 0 ? 1 : 0;
            this.ax = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.aB = x;
            this.az = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.aC = y;
            this.aA = y;
        }
    }

    private final void aR() {
        boolean z;
        if (this.y) {
            this.g.i();
            if (this.z) {
                this.n.onItemsChanged(this);
            }
        }
        boolean zAZ = aZ();
        kd kdVar = this.g;
        if (zAZ) {
            kdVar.f();
        } else {
            kdVar.d();
        }
        boolean z2 = this.P || this.Q;
        oe oeVar = this.O;
        boolean z3 = this.s && this.E != null && ((z = this.y) || z2 || this.n.mRequestedSimpleAnimations) && (!z || this.m.c);
        oeVar.j = z3;
        oeVar.k = z3 && z2 && !this.y && aZ();
    }

    private final void aS() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.A;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.A.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.B;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.B.isFinished();
        }
        EdgeEffect edgeEffect3 = this.C;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.C.isFinished();
        }
        EdgeEffect edgeEffect4 = this.D;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.D.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    private final void aT(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        Rect rect = this.k;
        rect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof nq) {
            nq nqVar = (nq) layoutParams;
            if (!nqVar.e) {
                Rect rect2 = nqVar.d;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        } else {
            view2 = null;
        }
        this.n.requestChildRectangleOnScreen(this, view, rect, !this.s, view2 == null);
    }

    private final void aU() {
        oe oeVar = this.O;
        oeVar.m = -1L;
        oeVar.l = -1;
        oeVar.n = -1;
    }

    private final void aV() {
        VelocityTracker velocityTracker = this.ay;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        am(0);
        aS();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void aW(int i) {
        boolean zCanScrollHorizontally = this.n.canScrollHorizontally();
        int i2 = zCanScrollHorizontally;
        if (this.n.canScrollVertically()) {
            i2 = (zCanScrollHorizontally ? 1 : 0) | 2;
        }
        aB(i2, i);
    }

    private final void aX() {
        this.L.d();
        np npVar = this.n;
        if (npVar != null) {
            npVar.stopSmoothScroller();
        }
    }

    private final boolean aY(MotionEvent motionEvent) {
        ArrayList arrayList = this.am;
        int action = motionEvent.getAction();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            nt ntVar = (nt) arrayList.get(i);
            if (ntVar.m(this, motionEvent) && action != 3) {
                this.an = ntVar;
                return true;
            }
        }
        return false;
    }

    private final boolean aZ() {
        return this.E != null && this.n.supportsPredictiveItemAnimations();
    }

    public static final int aw(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && ace.k(edgeEffect) != 0.0f) {
            int iRound = Math.round(((-i2) / 4.0f) * ace.l(edgeEffect, ((-i) * 4.0f) / i2, 0.5f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || ace.k(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round((f / 4.0f) * ace.l(edgeEffect2, (i * 4.0f) / f, 0.5f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    private final boolean ba(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fK = ace.k(edgeEffect) * i2;
        float fAbs = Math.abs(-i);
        float f = this.ah * 0.015f;
        double dLog = Math.log((fAbs * 0.35f) / f);
        double d2 = af;
        return ((float) (((double) f) * Math.exp((d2 / ((-1.0d) + d2)) * dLog))) < fK;
    }

    private final void bb(Context context, String str, AttributeSet attributeSet, int i) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            if (strTrim.charAt(0) == '.') {
                strTrim = String.valueOf(context.getPackageName()).concat(String.valueOf(strTrim));
            } else if (!strTrim.contains(".")) {
                strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
            }
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(np.class);
                try {
                    constructor = clsAsSubclass.getConstructor(ag);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                } catch (NoSuchMethodException e) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(a.bY(strTrim, attributeSet, ": Error creating LayoutManager "), e2);
                    }
                }
                constructor.setAccessible(true);
                ah((np) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(a.bY(strTrim, attributeSet, ": Class is not a LayoutManager "), e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(a.bY(strTrim, attributeSet, ": Unable to find LayoutManager "), e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(a.bY(strTrim, attributeSet, ": Cannot access non-public constructor "), e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(a.bY(strTrim, attributeSet, ": Could not instantiate the LayoutManager: "), e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(a.bY(strTrim, attributeSet, ": Could not instantiate the LayoutManager: "), e7);
            }
        }
    }

    private final zf bc() {
        zf zfVar = this.ac;
        if (zfVar != null) {
            return zfVar;
        }
        zf zfVar2 = new zf((View) this, (byte[]) null);
        this.ac = zfVar2;
        return zfVar2;
    }

    public static oh k(View view) {
        if (view == null) {
            return null;
        }
        return ((nq) view.getLayoutParams()).c;
    }

    public static RecyclerView l(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView recyclerViewL = l(viewGroup.getChildAt(i));
                if (recyclerViewL != null) {
                    return recyclerViewL;
                }
            }
        }
        return null;
    }

    public static void y(oh ohVar) {
        WeakReference weakReference = ohVar.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == ohVar.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            ohVar.b = null;
        }
    }

    public final void A() {
        List list = this.aG;
        if (list != null) {
            list.clear();
        }
    }

    public final void B(int i, int i2) {
        EdgeEffect edgeEffect = this.A;
        boolean zIsFinished = false;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.A.onRelease();
            zIsFinished = this.A.isFinished();
        }
        EdgeEffect edgeEffect2 = this.C;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.C.onRelease();
            zIsFinished |= this.C.isFinished();
        }
        EdgeEffect edgeEffect3 = this.B;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.B.onRelease();
            zIsFinished |= this.B.isFinished();
        }
        EdgeEffect edgeEffect4 = this.D;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.D.onRelease();
            zIsFinished |= this.D.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final void C() {
        if (!this.s || this.y) {
            F();
            return;
        }
        if (this.g.k()) {
            if (!this.g.j(4) || this.g.j(11)) {
                if (this.g.k()) {
                    F();
                    return;
                }
                return;
            }
            ak();
            T();
            this.g.f();
            if (!this.u) {
                int iA = this.h.a();
                for (int i = 0; i < iA; i++) {
                    oh ohVarK = k(this.h.d(i));
                    if (ohVarK != null && !ohVarK.A() && ohVarK.y()) {
                        F();
                    }
                }
                this.g.c();
            }
            al(true);
            U(true);
        }
    }

    public final void D(int i, int i2) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i3 = bac.a;
        setMeasuredDimension(np.chooseSize(i, paddingLeft, getMinimumWidth()), np.chooseSize(i2, getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
    }

    public final void E(View view) {
        oh ohVarK = k(view);
        nh nhVar = this.m;
        if (nhVar != null && ohVarK != null) {
            nhVar.r(ohVarK);
        }
        List list = this.x;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((nr) this.x.get(size)).b(view);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:145:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:164:0x0333  */
    /* JADX WARN: Code duplicated, block: B:166:0x0336  */
    /* JADX WARN: Code duplicated, block: B:170:0x0346  */
    /* JADX WARN: Code duplicated, block: B:172:0x034e  */
    /* JADX WARN: Code duplicated, block: B:174:0x0356  */
    /* JADX WARN: Code duplicated, block: B:177:0x035e  */
    /* JADX WARN: Code duplicated, block: B:179:0x0364  */
    /* JADX WARN: Code duplicated, block: B:182:0x036e A[LOOP:4: B:176:0x035c->B:182:0x036e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:185:0x037b  */
    /* JADX WARN: Code duplicated, block: B:187:0x0381  */
    /* JADX WARN: Code duplicated, block: B:190:0x038b A[LOOP:5: B:184:0x0379->B:190:0x038b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:192:0x0390  */
    /* JADX WARN: Code duplicated, block: B:230:0x0371 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0371 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x036c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x038e A[EDGE_INSN: B:234:0x038e->B:191:0x038e BREAK  A[LOOP:5: B:184:0x0379->B:190:0x038b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0389 A[SYNTHETIC] */
    final void F() {
        int i;
        long j;
        oh ohVar;
        int i2;
        int iA;
        int i3;
        int iMin;
        oh ohVarHG;
        View view;
        oh ohVarHG2;
        View view2;
        int i4;
        View viewFindViewById;
        lm lmVar;
        nh nhVar;
        int i5;
        if (this.m == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.n == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.O.i = false;
        boolean z = this.aN && !(this.aO == getWidth() && this.aP == getHeight());
        this.aO = 0;
        this.aP = 0;
        this.aN = false;
        if (this.O.d == 1) {
            aN();
            this.n.setExactMeasureSpecsFrom(this);
            aO();
        } else {
            kd kdVar = this.g;
            if ((kdVar.b.isEmpty() || kdVar.a.isEmpty()) && !z && this.n.getWidth() == getWidth() && this.n.getHeight() == getHeight()) {
                this.n.setExactMeasureSpecsFrom(this);
            } else {
                this.n.setExactMeasureSpecsFrom(this);
                aO();
            }
        }
        this.O.b(4);
        ak();
        T();
        oe oeVar = this.O;
        oeVar.d = 1;
        int i6 = -1;
        View view3 = null;
        if (oeVar.j) {
            int iA2 = this.h.a() - 1;
            while (iA2 >= 0) {
                View viewD = this.h.d(iA2);
                oh ohVar2 = viewD == null ? null : ((nq) viewD.getLayoutParams()).c;
                if (ohVar2.A()) {
                    i5 = i6;
                } else {
                    long jF = f(ohVar2);
                    cwp cwpVar = new cwp();
                    cwpVar.b(ohVar2);
                    pj pjVar = this.aa;
                    oh ohVar3 = (oh) ((agk) pjVar.b).e(jF);
                    if (ohVar3 == null || ohVar3.A()) {
                        i5 = i6;
                        pjVar.y(ohVar2, cwpVar);
                    } else {
                        boolean zH = pjVar.h(ohVar3);
                        boolean zH2 = pjVar.h(ohVar2);
                        if (zH && ohVar3 == ohVar2) {
                            pjVar.y(ohVar2, cwpVar);
                            i5 = i6;
                        } else {
                            i5 = i6;
                            cwp cwpVarX = pjVar.x(ohVar3, 4);
                            pjVar.y(ohVar2, cwpVar);
                            cwp cwpVarX2 = pjVar.x(ohVar2, 8);
                            if (cwpVarX == null) {
                                int iA3 = this.h.a();
                                for (int i7 = 0; i7 < iA3; i7++) {
                                    View viewD2 = this.h.d(i7);
                                    oh ohVar4 = viewD2 == null ? null : ((nq) viewD2.getLayoutParams()).c;
                                    if (ohVar4 != ohVar2 && f(ohVar4) == jF) {
                                        nh nhVar2 = this.m;
                                        if (nhVar2 == null || !nhVar2.c) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + ohVar4 + " \n View Holder 2:" + ohVar2 + o());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + ohVar4 + " \n View Holder 2:" + ohVar2 + o());
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + ohVar3 + " cannot be found but it is necessary for " + ohVar2 + o());
                            } else {
                                ohVar3.n(false);
                                if (zH) {
                                    u(ohVar3);
                                }
                                if (ohVar3 != ohVar2) {
                                    if (zH2) {
                                        u(ohVar2);
                                    }
                                    ohVar3.h = ohVar2;
                                    u(ohVar3);
                                    this.e.l(ohVar3);
                                    ohVar2.n(false);
                                    ohVar2.i = ohVar3;
                                }
                                if (this.E.q(ohVar3, ohVar2, cwpVarX, cwpVarX2)) {
                                    V();
                                }
                            }
                        }
                    }
                }
                iA2--;
                i6 = i5;
            }
            i = i6;
            pj pjVar2 = this.aa;
            hhb hhbVar = this.aT;
            aha ahaVar = (aha) pjVar2.a;
            for (int i8 = ahaVar.d - 1; i8 >= 0; i8--) {
                oh ohVar5 = (oh) ahaVar.d(i8);
                pk pkVar = (pk) ahaVar.e(i8);
                int i9 = pkVar.b;
                if ((i9 & 3) == 3) {
                    hhbVar.F(ohVar5);
                } else if ((i9 & 1) != 0) {
                    cwp cwpVar2 = pkVar.c;
                    if (cwpVar2 == null) {
                        hhbVar.F(ohVar5);
                    } else {
                        hhbVar.I(ohVar5, cwpVar2, pkVar.d);
                    }
                } else if ((i9 & 14) == 14) {
                    hhbVar.H(ohVar5, pkVar.c, pkVar.d);
                } else if ((i9 & 12) == 12) {
                    cwp cwpVar3 = pkVar.c;
                    cwp cwpVar4 = pkVar.d;
                    ohVar5.n(false);
                    RecyclerView recyclerView = (RecyclerView) hhbVar.a;
                    if (recyclerView.y) {
                        if (recyclerView.E.q(ohVar5, ohVar5, cwpVar3, cwpVar4)) {
                            recyclerView.V();
                        }
                    } else if (recyclerView.E.s(ohVar5, cwpVar3, cwpVar4)) {
                        recyclerView.V();
                    }
                } else if ((i9 & 4) != 0) {
                    hhbVar.I(ohVar5, pkVar.c, null);
                } else if ((i9 & 8) != 0) {
                    hhbVar.H(ohVar5, pkVar.c, pkVar.d);
                }
                pk.b(pkVar);
            }
        } else {
            i = -1;
        }
        np npVar = this.n;
        nv nvVar = this.e;
        npVar.removeAndRecycleScrapInt(nvVar);
        oe oeVar2 = this.O;
        oeVar2.b = oeVar2.e;
        this.y = false;
        this.z = false;
        oeVar2.j = false;
        oeVar2.k = false;
        this.n.mRequestedSimpleAnimations = false;
        ArrayList arrayList = nvVar.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        np npVar2 = this.n;
        if (npVar2.mPrefetchMaxObservedInInitialPrefetch) {
            npVar2.mPrefetchMaxCountObserved = 0;
            npVar2.mPrefetchMaxObservedInInitialPrefetch = false;
            nvVar.m();
        }
        this.n.onLayoutCompleted(this.O);
        U(true);
        al(false);
        this.aa.e();
        int[] iArr = this.aI;
        int i10 = iArr[0];
        int i11 = iArr[1];
        aP(iArr);
        if (iArr[0] != i10 || iArr[1] != i11) {
            H(0, 0);
        }
        if (this.aE && this.m != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j = this.O.m;
                if (j != -1) {
                    nhVar = this.m;
                    if (nhVar.c) {
                        ohVar = null;
                    } else {
                        ohVar = null;
                    }
                } else {
                    ohVar = null;
                }
                if (ohVar != null) {
                    lmVar = this.h;
                    view = ohVar.a;
                    if (lmVar.k(view)) {
                        if (this.h.a() > 0) {
                            oe oeVar3 = this.O;
                            int i12 = oeVar3.l;
                            if (i12 != i) {
                            }
                            iA = oeVar3.a();
                            i3 = i2;
                            while (true) {
                                if (i3 < iA) {
                                    ohVarHG2 = hG(i3);
                                    if (ohVarHG2 != null) {
                                        view2 = ohVarHG2.a;
                                        if (view2.hasFocusable()) {
                                            view3 = view2;
                                        } else {
                                            i3++;
                                        }
                                    }
                                }
                                while (iMin >= 0) {
                                    ohVarHG = hG(iMin);
                                    if (ohVarHG == null) {
                                        break;
                                        break;
                                    }
                                    view = ohVarHG.a;
                                    if (view.hasFocusable()) {
                                        view3 = view;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (this.h.a() > 0) {
                        oe oeVar4 = this.O;
                        int i13 = oeVar4.l;
                        if (i13 != i) {
                        }
                        iA = oeVar4.a();
                        i3 = i2;
                        while (true) {
                            if (i3 < iA) {
                                ohVarHG2 = hG(i3);
                                if (ohVarHG2 != null) {
                                    view2 = ohVarHG2.a;
                                    if (view2.hasFocusable()) {
                                        view3 = view2;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                ohVarHG = hG(iMin);
                                if (ohVarHG == null) {
                                    break;
                                    break;
                                }
                                view = ohVarHG.a;
                                if (view.hasFocusable()) {
                                    view3 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.h.a() > 0) {
                    oe oeVar5 = this.O;
                    int i14 = oeVar5.l;
                    if (i14 != i) {
                    }
                    iA = oeVar5.a();
                    i3 = i2;
                    while (true) {
                        if (i3 < iA) {
                            ohVarHG2 = hG(i3);
                            if (ohVarHG2 != null) {
                                view2 = ohVarHG2.a;
                                if (view2.hasFocusable()) {
                                    view3 = view2;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        for (iMin = Math.min(iA, i2) - 1; iMin >= 0; iMin--) {
                            ohVarHG = hG(iMin);
                            if (ohVarHG == null) {
                                break;
                                break;
                            }
                            view = ohVarHG.a;
                            if (view.hasFocusable()) {
                                view3 = view;
                                break;
                            }
                        }
                    }
                }
                if (view3 != null) {
                    i4 = this.O.n;
                    if (i4 != -1) {
                        view3 = viewFindViewById;
                    }
                    view3.requestFocus();
                }
            } else if (this.h.k(getFocusedChild())) {
                j = this.O.m;
                if (j != -1) {
                    nhVar = this.m;
                    if (nhVar.c || nhVar == null) {
                        ohVar = null;
                    } else {
                        int iB = this.h.b();
                        ohVar = null;
                        for (int i15 = 0; i15 < iB; i15++) {
                            View viewE = this.h.e(i15);
                            oh ohVar6 = viewE == null ? null : ((nq) viewE.getLayoutParams()).c;
                            if (ohVar6 != null && !ohVar6.v() && ohVar6.e == j) {
                                if (!this.h.k(ohVar6.a)) {
                                    ohVar = ohVar6;
                                    break;
                                }
                                ohVar = ohVar6;
                            }
                        }
                    }
                } else {
                    ohVar = null;
                }
                if (ohVar != null) {
                    lmVar = this.h;
                    view = ohVar.a;
                    if (lmVar.k(view) && view.hasFocusable()) {
                        view3 = view;
                        break;
                    }
                    if (this.h.a() > 0) {
                        oe oeVar6 = this.O;
                        int i16 = oeVar6.l;
                        i2 = i16 != i ? i16 : 0;
                        iA = oeVar6.a();
                        i3 = i2;
                        while (true) {
                            if (i3 < iA) {
                                ohVarHG2 = hG(i3);
                                if (ohVarHG2 != null) {
                                    view2 = ohVarHG2.a;
                                    if (view2.hasFocusable()) {
                                        view3 = view2;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                ohVarHG = hG(iMin);
                                if (ohVarHG == null) {
                                    break;
                                }
                                view = ohVarHG.a;
                                if (view.hasFocusable()) {
                                    view3 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.h.a() > 0) {
                    oe oeVar7 = this.O;
                    int i17 = oeVar7.l;
                    if (i17 != i) {
                    }
                    iA = oeVar7.a();
                    i3 = i2;
                    while (true) {
                        if (i3 < iA) {
                            ohVarHG2 = hG(i3);
                            if (ohVarHG2 != null) {
                                view2 = ohVarHG2.a;
                                if (view2.hasFocusable()) {
                                    view3 = view2;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            ohVarHG = hG(iMin);
                            if (ohVarHG == null) {
                                break;
                                break;
                            }
                            view = ohVarHG.a;
                            if (view.hasFocusable()) {
                                view3 = view;
                                break;
                            }
                        }
                    }
                }
                if (view3 != null) {
                    i4 = this.O.n;
                    if (i4 != -1 && (viewFindViewById = view3.findViewById(i4)) != null && viewFindViewById.isFocusable()) {
                        view3 = viewFindViewById;
                    }
                    view3.requestFocus();
                }
            }
        }
        aU();
    }

    public final void G(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        aL().f(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void H(int i, int i2) {
        this.aw++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        List list = this.aG;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((qa) this.aG.get(size)).e(this, i, i2);
                }
            }
        }
        this.aw--;
    }

    public final void I() {
        if (this.D == null) {
            EdgeEffect edgeEffectFP = this.aR.fP(this);
            this.D = edgeEffectFP;
            if (this.i) {
                edgeEffectFP.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffectFP.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final void J() {
        if (this.A == null) {
            EdgeEffect edgeEffectFP = this.aR.fP(this);
            this.A = edgeEffectFP;
            if (this.i) {
                edgeEffectFP.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffectFP.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void K() {
        if (this.C == null) {
            EdgeEffect edgeEffectFP = this.aR.fP(this);
            this.C = edgeEffectFP;
            if (this.i) {
                edgeEffectFP.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffectFP.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void L() {
        if (this.B == null) {
            EdgeEffect edgeEffectFP = this.aR.fP(this);
            this.B = edgeEffectFP;
            if (this.i) {
                edgeEffectFP.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffectFP.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    final void M(oe oeVar) {
        if (this.F != 2) {
            oeVar.o = 0;
            oeVar.p = 0;
        } else {
            OverScroller overScroller = this.L.a;
            oeVar.o = overScroller.getFinalX() - overScroller.getCurrX();
            oeVar.p = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    final void O() {
        this.D = null;
        this.B = null;
        this.C = null;
        this.A = null;
    }

    public final void P() {
        if (this.p.size() != 0) {
            np npVar = this.n;
            if (npVar != null) {
                npVar.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
            }
            R();
            requestLayout();
        }
    }

    public final void Q(int i) {
        if (this.n != null) {
            ai(2);
            this.n.scrollToPosition(i);
            awakenScrollBars();
        }
    }

    final void R() {
        int iB = this.h.b();
        for (int i = 0; i < iB; i++) {
            ((nq) this.h.e(i).getLayoutParams()).e = true;
        }
        ArrayList arrayList = this.e.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            nq nqVar = (nq) ((oh) arrayList.get(i2)).a.getLayoutParams();
            if (nqVar != null) {
                nqVar.e = true;
            }
        }
    }

    public final void S(int i, int i2, boolean z) {
        int i3;
        int iB = this.h.b();
        int i4 = 0;
        while (true) {
            i3 = i + i2;
            if (i4 >= iB) {
                break;
            }
            oh ohVarK = k(this.h.e(i4));
            if (ohVarK != null && !ohVarK.A()) {
                int i5 = ohVarK.c;
                if (i5 >= i3) {
                    ohVarK.k(-i2, z);
                    this.O.f = true;
                } else if (i5 >= i) {
                    ohVarK.f(8);
                    ohVarK.k(-i2, z);
                    ohVarK.c = i - 1;
                    this.O.f = true;
                }
            }
            i4++;
        }
        nv nvVar = this.e;
        ArrayList arrayList = nvVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            oh ohVar = (oh) arrayList.get(size);
            if (ohVar != null) {
                int i6 = ohVar.c;
                if (i6 >= i3) {
                    ohVar.k(-i2, z);
                } else if (i6 >= i) {
                    ohVar.f(8);
                    nvVar.h(size);
                }
            }
        }
    }

    public final void T() {
        this.av++;
    }

    public final void U(boolean z) {
        int i;
        int i2 = this.av - 1;
        this.av = i2;
        if (i2 <= 0) {
            this.av = 0;
            if (z) {
                int i3 = this.at;
                this.at = 0;
                if (i3 != 0 && at()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(SemanticState.Modal);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                List list = this.U;
                for (int size = list.size() - 1; size >= 0; size--) {
                    oh ohVar = (oh) list.get(size);
                    View view = ohVar.a;
                    if (view.getParent() == this && !ohVar.A() && (i = ohVar.p) != -1) {
                        view.setImportantForAccessibility(i);
                        ohVar.p = -1;
                    }
                }
                list.clear();
            }
        }
    }

    public final void V() {
        if (this.R || !this.q) {
            return;
        }
        Runnable runnable = this.aM;
        int i = bac.a;
        postOnAnimation(runnable);
        this.R = true;
    }

    public final void W(boolean z) {
        this.z |= z;
        this.y = true;
        int iB = this.h.b();
        int i = 0;
        while (true) {
            if (i >= iB) {
                break;
            }
            View viewE = this.h.e(i);
            oh ohVar = viewE != null ? ((nq) viewE.getLayoutParams()).c : null;
            if (ohVar != null && !ohVar.A()) {
                ohVar.f(6);
            }
            i++;
        }
        R();
        nv nvVar = this.e;
        ArrayList arrayList = nvVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            oh ohVar2 = (oh) arrayList.get(i2);
            if (ohVar2 != null) {
                ohVar2.f(6);
                ohVar2.e(null);
            }
        }
        nh nhVar = nvVar.g.m;
        if (nhVar == null || !nhVar.c) {
            nvVar.g();
        }
    }

    public final void X() {
        nl nlVar = this.E;
        if (nlVar != null) {
            nlVar.c();
        }
        np npVar = this.n;
        if (npVar != null) {
            nv nvVar = this.e;
            npVar.removeAndRecycleAllViews(nvVar);
            this.n.removeAndRecycleScrapInt(nvVar);
        }
        this.e.c();
    }

    public final void Y(nr nrVar) {
        List list = this.x;
        if (list != null) {
            list.remove(nrVar);
        }
    }

    public final void Z(nt ntVar) {
        this.am.remove(ntVar);
        if (this.an == ntVar) {
            this.an = null;
        }
    }

    public final void aA(int i, int i2, boolean z) {
        np npVar = this.n;
        if (npVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.v) {
            return;
        }
        if (true != npVar.canScrollHorizontally()) {
            i = 0;
        }
        if (true != this.n.canScrollVertically()) {
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return;
            } else {
                i = 0;
            }
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            aB(i3, 1);
        }
        this.L.c(i, i2, Integer.MIN_VALUE, null);
    }

    public final void aB(int i, int i2) {
        aL().h(i, i2);
    }

    public final void aC(qa qaVar) {
        if (this.aG == null) {
            this.aG = new ArrayList();
        }
        this.aG.add(qaVar);
    }

    public final void aD(oh ohVar, cwp cwpVar) {
        ohVar.m(0, SemanticState.Multiline);
        if (this.O.h && ohVar.y() && !ohVar.v() && !ohVar.A()) {
            this.aa.d(f(ohVar), ohVar);
        }
        this.aa.z(ohVar, cwpVar);
    }

    public final void aE(qa qaVar) {
        List list = this.aG;
        if (list != null) {
            list.remove(qaVar);
        }
    }

    public final qa aF(int i) {
        int iE = e();
        if (i >= 0 && i < iE) {
            return (qa) this.p.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + iE);
    }

    public final tgr aG() {
        return this.e.p();
    }

    public final void aH(qa qaVar) {
        np npVar = this.n;
        if (npVar != null) {
            npVar.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.p;
        arrayList.remove(qaVar);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        R();
        requestLayout();
    }

    public final void aI(tgr tgrVar) {
        nv nvVar = this.e;
        RecyclerView recyclerView = nvVar.g;
        nvVar.e(recyclerView.m, false);
        tgr tgrVar2 = nvVar.h;
        if (tgrVar2 != null) {
            tgrVar2.l();
        }
        nvVar.h = tgrVar;
        tgr tgrVar3 = nvVar.h;
        if (tgrVar3 != null && recyclerView.m != null) {
            tgrVar3.j();
        }
        nvVar.d();
    }

    public final void aJ(qa qaVar) {
        np npVar = this.n;
        if (npVar != null) {
            npVar.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.p;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(qaVar);
        R();
        requestLayout();
    }

    public final void aa(int i, int i2, int[] iArr) {
        oh ohVar;
        ak();
        T();
        M(this.O);
        int iScrollHorizontallyBy = i != 0 ? this.n.scrollHorizontallyBy(i, this.e, this.O) : 0;
        int iScrollVerticallyBy = i2 != 0 ? this.n.scrollVerticallyBy(i2, this.e, this.O) : 0;
        int iA = this.h.a();
        for (int i3 = 0; i3 < iA; i3++) {
            View viewD = this.h.d(i3);
            oh ohVarJ = j(viewD);
            if (ohVarJ != null && (ohVar = ohVarJ.i) != null) {
                int left = viewD.getLeft();
                int top = viewD.getTop();
                View view = ohVar.a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        U(true);
        al(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    public final void ab(int i) {
        if (this.v) {
            return;
        }
        an();
        np npVar = this.n;
        if (npVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            npVar.scrollToPosition(i);
            awakenScrollBars();
        }
    }

    public final void ac(oj ojVar) {
        this.S = ojVar;
        bac.p(this, ojVar);
    }

    public void ad(nh nhVar) {
        suppressLayout(false);
        ax(nhVar, false);
        W(false);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        np npVar = this.n;
        if (npVar == null || !npVar.onAddFocusables(this, arrayList, i, i2)) {
            if (b && isFocusable() && !this.aq && (!hasFocus() || this.ap)) {
                if (i != 2) {
                    if (i == 1) {
                        i = 1;
                    }
                }
                if (i == 2) {
                    arrayList.add(this);
                }
                super.addFocusables(arrayList, i, i2);
                if (i == 1) {
                    arrayList.add(this);
                }
                Runnable runnable = this.ao;
                removeCallbacks(runnable);
                this.t = true;
                post(runnable);
                return;
            }
            super.addFocusables(arrayList, i, i2);
        }
    }

    public final void ae(nk nkVar) {
        if (nkVar != this.aH) {
            this.aH = nkVar;
            setChildrenDrawingOrderEnabled(nkVar != null);
        }
    }

    public final void af(nl nlVar) {
        nl nlVar2 = this.E;
        if (nlVar2 != null) {
            nlVar2.c();
            this.E.j = null;
        }
        this.E = nlVar;
        if (nlVar != null) {
            nlVar.j = this.aS;
        }
    }

    public final void ag(int i) {
        nv nvVar = this.e;
        nvVar.e = i;
        nvVar.m();
    }

    public void ah(np npVar) {
        if (npVar != this.n) {
            an();
            if (this.n != null) {
                nl nlVar = this.E;
                if (nlVar != null) {
                    nlVar.c();
                }
                np npVar2 = this.n;
                nv nvVar = this.e;
                npVar2.removeAndRecycleAllViews(nvVar);
                this.n.removeAndRecycleScrapInt(nvVar);
                nvVar.c();
                if (this.q) {
                    this.n.dispatchDetachedFromWindow(this, nvVar);
                }
                this.n.setRecyclerView(null);
                this.n = null;
            } else {
                this.e.c();
            }
            lm lmVar = this.h;
            lmVar.a.d();
            List list = lmVar.b;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                lmVar.e.D((View) list.get(size));
                list.remove(size);
            }
            hhb hhbVar = lmVar.e;
            int iA = hhbVar.A();
            for (int i = 0; i < iA; i++) {
                View viewC = hhbVar.C(i);
                ((RecyclerView) hhbVar.a).E(viewC);
                viewC.clearAnimation();
            }
            ((RecyclerView) hhbVar.a).removeAllViews();
            this.n = npVar;
            if (npVar != null) {
                if (npVar.mRecyclerView != null) {
                    throw new IllegalArgumentException("LayoutManager " + npVar + " is already attached to a RecyclerView:" + npVar.mRecyclerView.o());
                }
                this.n.setRecyclerView(this);
                if (this.q) {
                    this.n.dispatchAttachedToWindow(this);
                }
            }
            this.e.m();
            requestLayout();
        }
    }

    public final void ai(int i) {
        if (i == this.F) {
            return;
        }
        boolean z = this.ai;
        if (i == 1) {
            if (!z) {
                System.identityHashCode(this);
                this.ai = true;
            }
            i = 1;
        } else if (z) {
            System.identityHashCode(this);
            this.ai = false;
        }
        this.F = i;
        if (i != 2) {
            aX();
        }
        np npVar = this.n;
        if (npVar != null) {
            npVar.onScrollStateChanged(i);
        }
        qa qaVar = this.ab;
        if (qaVar != null) {
            qaVar.fO(this, i);
        }
        List list = this.aG;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((qa) this.aG.get(size)).fO(this, i);
            }
        }
    }

    public final void aj(int i) {
        if (this.v) {
            return;
        }
        np npVar = this.n;
        if (npVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            npVar.smoothScrollToPosition(this, this.O, i);
        }
    }

    public final void ak() {
        int i = this.ar + 1;
        this.ar = i;
        if (i != 1 || this.v) {
            return;
        }
        this.u = false;
    }

    public final void al(boolean z) {
        int i = this.ar;
        if (i <= 0) {
            this.ar = 1;
            i = 1;
        }
        if (!z && !this.v) {
            this.u = false;
        }
        if (i == 1) {
            if (z && this.u && !this.v && this.n != null && this.m != null) {
                F();
            }
            if (!this.v) {
                this.u = false;
            }
        }
        this.ar--;
    }

    public final void am(int i) {
        aL().b(i);
    }

    public final void an() {
        ai(0);
        aX();
    }

    public final boolean ap(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return aL().e(i, i2, iArr, iArr2, i3);
    }

    public boolean aq(int i, int i2) {
        return ar(i, i2, this.H, this.I);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0075  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:80:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0105  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    public final boolean ar(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int iMax;
        int iMax2;
        float f;
        float f2;
        boolean z;
        ns nsVar;
        np npVar = this.n;
        if (npVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.v) {
            return false;
        }
        boolean zCanScrollHorizontally = npVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.n.canScrollVertically();
        if (!zCanScrollHorizontally || Math.abs(i) < i3) {
            i = 0;
        }
        if (!zCanScrollVertically || Math.abs(i2) < i3) {
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return false;
            }
            i = 0;
        }
        if (i == 0) {
            i5 = 0;
        } else {
            EdgeEffect edgeEffect = this.A;
            if (edgeEffect == null || ace.k(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.C;
                if (edgeEffect2 == null || ace.k(edgeEffect2) == 0.0f) {
                    i5 = 0;
                } else if (ba(this.C, i, getWidth())) {
                    this.C.onAbsorb(i);
                    i = 0;
                }
            } else {
                int i7 = -i;
                if (ba(this.A, i7, getWidth())) {
                    this.A.onAbsorb(i7);
                    i = 0;
                }
            }
            i5 = i;
            i = 0;
        }
        if (i2 == 0) {
            i6 = i2;
            i2 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.B;
            if (edgeEffect3 == null || ace.k(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.D;
                if (edgeEffect4 == null || ace.k(edgeEffect4) == 0.0f) {
                    i6 = i2;
                    i2 = 0;
                } else if (ba(this.D, i2, getHeight())) {
                    this.D.onAbsorb(i2);
                    i2 = 0;
                }
            } else {
                int i8 = -i2;
                if (ba(this.B, i8, getHeight())) {
                    this.B.onAbsorb(i8);
                    i2 = 0;
                }
            }
            i6 = 0;
        }
        if (i5 != 0) {
            int i9 = -i4;
            iMax = Math.max(i9, Math.min(i5, i4));
            iMax2 = Math.max(i9, Math.min(i2, i4));
            aW(1);
            this.L.a(iMax, iMax2);
        } else if (i2 != 0) {
            i5 = 0;
            int i10 = -i4;
            iMax = Math.max(i10, Math.min(i5, i4));
            iMax2 = Math.max(i10, Math.min(i2, i4));
            aW(1);
            this.L.a(iMax, iMax2);
        } else {
            iMax2 = 0;
            iMax = 0;
        }
        if (i != 0) {
            f = i;
            f2 = i6;
            if (!dispatchNestedPreFling(f, f2)) {
                return false;
            }
            if (!zCanScrollHorizontally || zCanScrollVertically) {
                z = true;
            } else {
                z = false;
            }
            dispatchNestedFling(f, f2, z);
            nsVar = this.G;
            if (nsVar != null || !nsVar.e(i, i6)) {
                if (!z) {
                    return false;
                }
                int i11 = -i4;
                aW(1);
                this.L.a(Math.max(i11, Math.min(i, i4)), Math.max(i11, Math.min(i6, i4)));
            }
        } else if (i6 != 0) {
            i = 0;
            f = i;
            f2 = i6;
            if (!dispatchNestedPreFling(f, f2)) {
                return false;
            }
            if (zCanScrollHorizontally) {
                z = true;
            } else {
                z = true;
            }
            dispatchNestedFling(f, f2, z);
            nsVar = this.G;
            if (nsVar != null) {
                if (!z) {
                    return false;
                }
                int i12 = -i4;
                aW(1);
                this.L.a(Math.max(i12, Math.min(i, i4)), Math.max(i12, Math.min(i6, i4)));
            } else {
                if (!z) {
                    return false;
                }
                int i13 = -i4;
                aW(1);
                this.L.a(Math.max(i13, Math.min(i, i4)), Math.max(i13, Math.min(i6, i4)));
            }
        } else if (iMax == 0 && iMax2 == 0) {
            return false;
        }
        return true;
    }

    public final boolean as() {
        return !this.s || this.y || this.g.k();
    }

    public final boolean at() {
        AccessibilityManager accessibilityManager = this.au;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public final boolean au() {
        return this.av > 0;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0116  */
    /* JADX WARN: Code duplicated, block: B:36:0x013d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0142  */
    /* JADX WARN: Code duplicated, block: B:39:0x0169  */
    /* JADX WARN: Code duplicated, block: B:47:0x017b  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a7  */
    /* JADX WARN: Multi-variable type inference failed */
    final boolean av(int i, int i2, int i3, int i4, MotionEvent motionEvent, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        int i11;
        int i12;
        int i13;
        float f;
        boolean z2;
        C();
        if (this.m != null) {
            int[] iArr = this.T;
            iArr[0] = 0;
            iArr[1] = 0;
            aa(i, i2, iArr);
            int i14 = iArr[0];
            int i15 = iArr[1];
            i8 = i - i14;
            i9 = i2 - i15;
            i7 = i15;
            i6 = i14;
        } else {
            i6 = 0;
            i7 = 0;
            i8 = 0;
            i9 = 0;
        }
        if (!this.p.isEmpty()) {
            invalidate();
        }
        int[] iArr2 = this.T;
        iArr2[0] = 0;
        iArr2[1] = 0;
        int[] iArr3 = this.aK;
        G(i6, i7, i8, i9, iArr3, i5, iArr2);
        int i16 = iArr2[0];
        int i17 = i8 - i16;
        int i18 = iArr2[1];
        int i19 = i9 - i18;
        boolean z3 = (i16 == 0 && i18 == 0) ? false : true;
        int i20 = this.aB;
        int i21 = iArr3[0];
        this.aB = i20 - i21;
        int i22 = this.aC;
        int i23 = iArr3[1];
        this.aC = i22 - i23;
        int[] iArr4 = this.aL;
        iArr4[0] = iArr4[0] + i21;
        iArr4[1] = iArr4[1] + i23;
        if (motionEvent != null) {
            if (i6 != 0) {
                bc().j(motionEvent.getDeviceId(), motionEvent.getSource(), i3, i6);
            }
            if (i7 != 0) {
                bc().j(motionEvent.getDeviceId(), motionEvent.getSource(), i4, i7);
            }
        }
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || aav.b(motionEvent, 8194)) {
                i10 = i6;
                z = true;
                i11 = 0;
            } else {
                float x = motionEvent.getX();
                float f2 = i17;
                float y = motionEvent.getY();
                float f3 = i19;
                if (f2 < 0.0f) {
                    J();
                    f = 0.0f;
                    i10 = i6;
                    ace.l(this.A, (-f2) / getWidth(), 1.0f - (y / getHeight()));
                    bc().i(motionEvent.getDeviceId(), motionEvent.getSource(), i3, true);
                } else {
                    i10 = i6;
                    f = 0.0f;
                    if (f2 > 0.0f) {
                        K();
                        ace.l(this.C, f2 / getWidth(), y / getHeight());
                        bc().i(motionEvent.getDeviceId(), motionEvent.getSource(), i3, false);
                    } else {
                        z2 = false;
                    }
                    if (f3 < f) {
                        L();
                        ace.l(this.B, (-f3) / getHeight(), x / getWidth());
                        z = true;
                        bc().i(motionEvent.getDeviceId(), motionEvent.getSource(), i4, true);
                        i11 = 0;
                    } else {
                        z = true;
                        if (f3 > f) {
                            I();
                            ace.l(this.D, f3 / getHeight(), 1.0f - (x / getWidth()));
                            i11 = 0;
                            bc().i(motionEvent.getDeviceId(), motionEvent.getSource(), i4, false);
                        } else {
                            i11 = 0;
                            if (!z2 || f2 != f || f3 != f) {
                            }
                            if (Build.VERSION.SDK_INT >= 31 && aav.b(motionEvent, 4194304)) {
                                aS();
                            }
                        }
                    }
                    postInvalidateOnAnimation();
                    if (Build.VERSION.SDK_INT >= 31) {
                        aS();
                    }
                }
                z2 = true;
                if (f3 < f) {
                    L();
                    ace.l(this.B, (-f3) / getHeight(), x / getWidth());
                    z = true;
                    bc().i(motionEvent.getDeviceId(), motionEvent.getSource(), i4, true);
                    i11 = 0;
                } else {
                    z = true;
                    if (f3 > f) {
                        I();
                        ace.l(this.D, f3 / getHeight(), 1.0f - (x / getWidth()));
                        i11 = 0;
                        bc().i(motionEvent.getDeviceId(), motionEvent.getSource(), i4, false);
                    } else {
                        i11 = 0;
                        if (!z2) {
                        }
                        if (Build.VERSION.SDK_INT >= 31) {
                            aS();
                        }
                    }
                }
                postInvalidateOnAnimation();
                if (Build.VERSION.SDK_INT >= 31) {
                    aS();
                }
            }
            B(i, i2);
        } else {
            i10 = i6;
            z = true;
            i11 = 0;
        }
        if (i10 == 0) {
            if (i7 != 0) {
                i12 = i11;
            } else {
                i13 = i11;
            }
            if (!awakenScrollBars()) {
                invalidate();
            }
            return (z3 && i13 == 0 && i7 == 0) ? i11 : z;
        }
        i12 = i10;
        H(i12, i7);
        i13 = i12;
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (z3) {
        }
    }

    public final void ax(nh nhVar, boolean z) {
        nh nhVar2 = this.m;
        if (nhVar2 != null) {
            nhVar2.y(this.aj);
            this.m.w();
        }
        X();
        this.g.i();
        nh nhVar3 = this.m;
        this.m = nhVar;
        if (nhVar != null) {
            nhVar.x(this.aj);
            nhVar.v();
        }
        np npVar = this.n;
        if (npVar != null) {
            npVar.onAdapterChanged(nhVar3, this.m);
        }
        nv nvVar = this.e;
        nh nhVar4 = this.m;
        nvVar.c();
        nvVar.e(nhVar3, true);
        tgr tgrVarP = nvVar.p();
        if (nhVar3 != null) {
            tgrVarP.l();
        }
        if (!z && tgrVarP.a == 0) {
            tgrVarP.k();
        }
        if (nhVar4 != null) {
            tgrVarP.j();
        }
        nvVar.d();
        this.O.f = true;
    }

    public final void ay(oh ohVar, int i) {
        if (!au()) {
            ohVar.a.setImportantForAccessibility(i);
        } else {
            ohVar.p = i;
            this.U.add(ohVar);
        }
    }

    public final void az() {
        this.aD = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
    }

    public final int b(oh ohVar) {
        if (ohVar.q(524) || !ohVar.s()) {
            return -1;
        }
        kd kdVar = this.g;
        int i = ohVar.c;
        ArrayList arrayList = kdVar.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            kc kcVar = (kc) arrayList.get(i2);
            int i3 = kcVar.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = kcVar.b;
                    if (i4 <= i) {
                        int i5 = kcVar.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = kcVar.b;
                    if (i6 == i) {
                        i = kcVar.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (kcVar.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (kcVar.b <= i) {
                i += kcVar.d;
            }
        }
        return i;
    }

    public final int c(View view) {
        oh ohVarK = k(view);
        if (ohVarK != null) {
            return ohVarK.a();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof nq) && this.n.checkLayoutParams((nq) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        np npVar = this.n;
        if (npVar == null || !npVar.canScrollHorizontally()) {
            return 0;
        }
        return this.n.computeHorizontalScrollExtent(this.O);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        np npVar = this.n;
        if (npVar == null || !npVar.canScrollHorizontally()) {
            return 0;
        }
        return this.n.computeHorizontalScrollOffset(this.O);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        np npVar = this.n;
        if (npVar == null || !npVar.canScrollHorizontally()) {
            return 0;
        }
        return this.n.computeHorizontalScrollRange(this.O);
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        np npVar = this.n;
        if (npVar == null || !npVar.canScrollVertically()) {
            return 0;
        }
        return this.n.computeVerticalScrollExtent(this.O);
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        np npVar = this.n;
        if (npVar == null || !npVar.canScrollVertically()) {
            return 0;
        }
        return this.n.computeVerticalScrollOffset(this.O);
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        np npVar = this.n;
        if (npVar == null || !npVar.canScrollVertically()) {
            return 0;
        }
        return this.n.computeVerticalScrollRange(this.O);
    }

    public final int d(View view) {
        oh ohVarK = k(view);
        if (ohVarK != null) {
            return ohVarK.c();
        }
        return -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        np npVar = this.n;
        int iA = 0;
        if (npVar != null) {
            if (npVar.canScrollVertically()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        aA(0, measuredHeight, false);
                        return true;
                    }
                    aA(0, -measuredHeight, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean zIsLayoutReversed = npVar.isLayoutReversed();
                    if (keyCode == 122) {
                        if (zIsLayoutReversed) {
                            iA = this.m.a();
                        }
                    } else if (!zIsLayoutReversed) {
                        iA = this.m.a();
                    }
                    aj(iA);
                    return true;
                }
            } else if (npVar.canScrollHorizontally()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        aA(measuredWidth, 0, false);
                        return true;
                    }
                    aA(-measuredWidth, 0, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean zIsLayoutReversed2 = npVar.isLayoutReversed();
                    if (keyCode2 == 122) {
                        if (zIsLayoutReversed2) {
                            iA = this.m.a();
                        }
                    } else if (!zIsLayoutReversed2) {
                        iA = this.m.a();
                    }
                    aj(iA);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return aL().c(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return aL().d(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return aL().e(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return aL().f(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((qa) arrayList.get(i)).n(canvas, this);
        }
        EdgeEffect edgeEffect = this.A;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.i ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.A;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.B;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.i) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.B;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.C;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.i ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.C;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.D;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.i) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.D;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if (z || (this.E != null && arrayList.size() > 0 && this.E.j())) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final int e() {
        return this.p.size();
    }

    final long f(oh ohVar) {
        return this.m.c ? ohVar.e : ohVar.c;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x015e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x0162 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0164 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0169  */
    /* JADX WARN: Code duplicated, block: B:114:0x0184 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0187 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x018a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x018d  */
    /* JADX WARN: Code duplicated, block: B:121:0x018f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0191  */
    /* JADX WARN: Code duplicated, block: B:125:0x0195  */
    /* JADX WARN: Code duplicated, block: B:126:0x0197  */
    /* JADX WARN: Code duplicated, block: B:127:0x0199  */
    /* JADX WARN: Code duplicated, block: B:129:0x019c  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:72:0x0105  */
    /* JADX WARN: Code duplicated, block: B:73:0x0107  */
    /* JADX WARN: Code duplicated, block: B:76:0x010e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0114  */
    /* JADX WARN: Code duplicated, block: B:91:0x0137  */
    /* JADX WARN: Code duplicated, block: B:93:0x013d  */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0166, code lost:
    
        if (r5 > 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0184, code lost:
    
        if (r14 > 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0187, code lost:
    
        if (r5 < 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x018a, code lost:
    
        if (r14 < 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0192, code lost:
    
        if ((r14 * r13) <= 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x019a, code lost:
    
        if ((r14 * r13) >= 0) goto L129;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:112:0x0169, please report this as an issue */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final Rect g(View view) {
        nq nqVar = (nq) view.getLayoutParams();
        if (!nqVar.e) {
            return nqVar.d;
        }
        if (this.O.g && (nqVar.gM() || nqVar.c.t())) {
            return nqVar.d;
        }
        Rect rect = nqVar.d;
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.k;
            rect2.set(0, 0, 0, 0);
            ((qa) arrayList.get(i)).c(rect2, view, this, this.O);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        nqVar.e = false;
        return rect;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        np npVar = this.n;
        if (npVar != null) {
            return npVar.generateDefaultLayoutParams();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(o()));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        np npVar = this.n;
        if (npVar != null) {
            return npVar.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(o()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }

    @Override // android.view.View
    public final int getBaseline() {
        np npVar = this.n;
        return npVar != null ? npVar.getBaseline() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        nk nkVar = this.aH;
        return nkVar == null ? super.getChildDrawingOrder(i, i2) : nkVar.a(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean getClipToPadding() {
        return this.i;
    }

    public final oh h(View view) {
        View viewN = n(view);
        if (viewN == null) {
            return null;
        }
        return j(viewN);
    }

    public final oh hG(int i) {
        oh ohVar = null;
        if (this.y) {
            return null;
        }
        int iB = this.h.b();
        for (int i2 = 0; i2 < iB; i2++) {
            oh ohVarK = k(this.h.e(i2));
            if (ohVarK != null && !ohVarK.v() && b(ohVarK) == i) {
                if (!this.h.k(ohVarK.a)) {
                    return ohVarK;
                }
                ohVar = ohVarK;
            }
        }
        return ohVar;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return aL().g(0);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.q;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.v;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return aL().a;
    }

    public final oh j(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException(a.bZ(this, view, "View ", " is not a direct child of "));
        }
        if (view == null) {
            return null;
        }
        return ((nq) view.getLayoutParams()).c;
    }

    public final View m(float f, float f2) {
        int iA = this.h.a();
        while (true) {
            iA--;
            if (iA < 0) {
                return null;
            }
            View viewD = this.h.d(iA);
            float translationX = viewD.getTranslationX();
            float translationY = viewD.getTranslationY();
            if (f >= viewD.getLeft() + translationX && f <= viewD.getRight() + translationX && f2 >= viewD.getTop() + translationY && f2 <= viewD.getBottom() + translationY) {
                return viewD;
            }
        }
    }

    public final View n(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent != this) {
            return null;
        }
        return view;
    }

    public final String o() {
        return " " + super.toString() + ", adapter:" + this.m + ", layout:" + this.n + ", context:" + getContext();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.av = 0;
        this.q = true;
        this.s = this.s && !isLayoutRequested();
        this.e.d();
        np npVar = this.n;
        if (npVar != null) {
            npVar.dispatchAttachedToWindow(this);
        }
        this.R = false;
        ThreadLocal threadLocal = mj.a;
        mj mjVar = (mj) threadLocal.get();
        this.M = mjVar;
        if (mjVar == null) {
            this.M = new mj();
            int i = bac.a;
            Display display = getDisplay();
            float f = 60.0f;
            if (!isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            mj mjVar2 = this.M;
            mjVar2.e = (long) (1.0E9f / f);
            threadLocal.set(mjVar2);
        }
        this.M.c.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nl nlVar = this.E;
        if (nlVar != null) {
            nlVar.c();
        }
        an();
        this.q = false;
        np npVar = this.n;
        if (npVar != null) {
            npVar.dispatchDetachedFromWindow(this, this.e);
        }
        this.U.clear();
        removeCallbacks(this.aM);
        while (pk.a.a() != null) {
        }
        nv nvVar = this.e;
        int i = 0;
        while (true) {
            ArrayList arrayList = nvVar.c;
            if (i >= arrayList.size()) {
                break;
            }
            azx.d(((oh) arrayList.get(i)).a);
            i++;
        }
        nvVar.e(nvVar.g.m, false);
        Iterator itA = new bag(this, 1).a();
        while (itA.hasNext()) {
            azx.n((View) itA.next()).a();
        }
        mj mjVar = this.M;
        if (mjVar != null) {
            mjVar.c.remove(this);
            this.M = null;
        }
        removeCallbacks(this.ao);
        this.t = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((qa) arrayList.get(i)).d(canvas, this);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r0v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v0 ??, new type: android.support.v7.widget.RecyclerView
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v0 ??, new type: android.support.v7.widget.RecyclerView
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v1 ??, new type: android.support.v7.widget.RecyclerView
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v4 ??, new type: android.support.v7.widget.RecyclerView
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r16v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r16v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r17v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v4 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r17v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v5 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r18v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 'this'  ??, new type: android.support.v7.widget.RecyclerView
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v15 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v15 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v16 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v17 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v18 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v20 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v21 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v22 ??, new type: mj
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v23 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v23 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v24 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v26 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v13 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v14 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v15 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v16 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v17 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v19 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v9 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v10 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v13 ??, new type: android.widget.OverScroller
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v14 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v17 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v18 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v19 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r18v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 'this'  ??, new type: android.support.v7.widget.RecyclerView
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
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
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v15 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.v) {
            return false;
        }
        this.an = null;
        if (aY(motionEvent)) {
            aM();
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            ArrayList arrayList = this.am;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                nt ntVar = (nt) arrayList.get(i);
                if (ntVar != null && ntVar != this.an) {
                    ntVar.m(this, motionEventObtain);
                }
            }
        } else {
            np npVar = this.n;
            if (npVar == null) {
                return false;
            }
            boolean zCanScrollHorizontally = npVar.canScrollHorizontally();
            boolean zCanScrollVertically = this.n.canScrollVertically();
            VelocityTracker velocityTrackerObtain = this.ay;
            if (velocityTrackerObtain == null) {
                velocityTrackerObtain = VelocityTracker.obtain();
                this.ay = velocityTrackerObtain;
            }
            velocityTrackerObtain.addMovement(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked == 0) {
                if (this.as) {
                    this.as = false;
                }
                this.ax = motionEvent.getPointerId(0);
                int x = (int) (motionEvent.getX() + 0.5f);
                this.aB = x;
                this.az = x;
                int y = (int) (motionEvent.getY() + 0.5f);
                this.aC = y;
                this.aA = y;
                EdgeEffect edgeEffect = this.A;
                if (edgeEffect == null || ace.k(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                    z = false;
                } else {
                    ace.l(this.A, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                    z = true;
                }
                EdgeEffect edgeEffect2 = this.C;
                if (edgeEffect2 != null && ace.k(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                    ace.l(this.C, 0.0f, motionEvent.getY() / getHeight());
                    z = true;
                }
                EdgeEffect edgeEffect3 = this.B;
                if (edgeEffect3 != null && ace.k(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                    ace.l(this.B, 0.0f, motionEvent.getX() / getWidth());
                    z = true;
                }
                EdgeEffect edgeEffect4 = this.D;
                if (edgeEffect4 == null || ace.k(edgeEffect4) == 0.0f || canScrollVertically(1)) {
                    if (z || this.F == 2) {
                    }
                    int[] iArr = this.aL;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    aW(0);
                } else {
                    ace.l(this.D, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                ai(1);
                am(1);
                int[] iArr2 = this.aL;
                iArr2[1] = 0;
                iArr2[0] = 0;
                aW(0);
            } else if (actionMasked == 1) {
                this.ay.clear();
                am(0);
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.ax);
                if (iFindPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.ax + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                float x2 = motionEvent.getX(iFindPointerIndex) + 0.5f;
                float y2 = motionEvent.getY(iFindPointerIndex) + 0.5f;
                if (this.F != 1) {
                    int i2 = (int) y2;
                    int i3 = (int) x2;
                    int i4 = i3 - this.az;
                    int i5 = i2 - this.aA;
                    if (!zCanScrollHorizontally || Math.abs(i4) <= this.aD) {
                        z2 = false;
                    } else {
                        this.aB = i3;
                        z2 = true;
                    }
                    if (zCanScrollVertically && Math.abs(i5) > this.aD) {
                        this.aC = i2;
                    } else if (z2) {
                    }
                    ai(1);
                }
            } else if (actionMasked == 3) {
                aM();
            } else if (actionMasked == 5) {
                this.ax = motionEvent.getPointerId(actionIndex);
                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.aB = x3;
                this.az = x3;
                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.aC = y3;
                this.aA = y3;
            } else if (actionMasked == 6) {
                aQ(motionEvent);
            }
            if (this.F != 1) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        F();
        this.s = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        np npVar = this.n;
        if (npVar == null) {
            D(i, i2);
            return;
        }
        boolean z = false;
        if (npVar.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.n.onMeasure(this.e, this.O, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.aN = z;
            if (z || this.m == null) {
                return;
            }
            if (this.O.d == 1) {
                aN();
            }
            this.n.setMeasureSpecs(i, i2);
            this.O.i = true;
            aO();
            this.n.setMeasuredDimensionFromChildren(i, i2);
            if (this.n.shouldMeasureTwice()) {
                this.n.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.O.i = true;
                aO();
                this.n.setMeasuredDimensionFromChildren(i, i2);
            }
            this.aO = getMeasuredWidth();
            this.aP = getMeasuredHeight();
            return;
        }
        if (this.r) {
            this.n.onMeasure(this.e, this.O, i, i2);
            return;
        }
        if (this.w) {
            ak();
            T();
            aR();
            U(true);
            oe oeVar = this.O;
            if (oeVar.k) {
                oeVar.g = true;
            } else {
                this.g.d();
                this.O.g = false;
            }
            this.w = false;
            al(false);
        } else if (this.O.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        nh nhVar = this.m;
        oe oeVar2 = this.O;
        if (nhVar != null) {
            oeVar2.e = nhVar.a();
        } else {
            oeVar2.e = 0;
        }
        ak();
        this.n.onMeasure(this.e, this.O, i, i2);
        al(false);
        this.O.g = false;
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        removeCallbacks(this.ao);
        this.t = false;
        if (au()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof nz)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        nz nzVar = (nz) parcelable;
        this.f = nzVar;
        super.onRestoreInstanceState(nzVar.d);
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        nz nzVar = new nz(super.onSaveInstanceState());
        nz nzVar2 = this.f;
        if (nzVar2 != null) {
            nzVar.a = nzVar2.a;
        } else {
            np npVar = this.n;
            nzVar.a = npVar != null ? npVar.onSaveInstanceState() : null;
        }
        return nzVar;
    }

    public final boolean onScrollToTop(int i) {
        np npVar;
        if (!this.aF || (npVar = this.n) == null || !npVar.canScrollVertically() || !canScrollVertically(-1)) {
            return false;
        }
        aj(0);
        return true;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        O();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fe  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        int iMin;
        int i2 = 0;
        if (this.v || this.as) {
            return false;
        }
        nt ntVar = this.an;
        if (ntVar == null) {
            if (motionEvent.getAction() == 0 || !aY(motionEvent)) {
                np npVar = this.n;
                if (npVar == null) {
                    return false;
                }
                boolean zCanScrollHorizontally = npVar.canScrollHorizontally();
                boolean zCanScrollVertically = this.n.canScrollVertically();
                if (this.ay == null) {
                    this.ay = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    int[] iArr = this.aL;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    actionMasked = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                int[] iArr2 = this.aL;
                motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.ay.addMovement(motionEventObtain);
                        this.ay.computeCurrentVelocity(1000, this.I);
                        float f = zCanScrollHorizontally ? -this.ay.getXVelocity(this.ax) : 0.0f;
                        float f2 = zCanScrollVertically ? -this.ay.getYVelocity(this.ax) : 0.0f;
                        if ((f == 0.0f && f2 == 0.0f) || !aq((int) f, (int) f2)) {
                            ai(0);
                        }
                        aV();
                    } else if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.ax);
                        if (iFindPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.ax + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        float x = motionEvent.getX(iFindPointerIndex) + 0.5f;
                        float y = motionEvent.getY(iFindPointerIndex) + 0.5f;
                        int i3 = (int) x;
                        int i4 = this.aB - i3;
                        int i5 = (int) y;
                        int i6 = this.aC - i5;
                        if (this.F != 1) {
                            if (zCanScrollHorizontally) {
                                int i7 = this.aD;
                                int iMax = i4 > 0 ? Math.max(0, i4 - i7) : Math.min(0, i4 + i7);
                                i4 = iMax;
                                if (iMax != 0) {
                                    zCanScrollHorizontally = true;
                                } else {
                                    z = false;
                                    zCanScrollHorizontally = true;
                                }
                                if (zCanScrollVertically) {
                                    i = this.aD;
                                    if (i6 > 0) {
                                        iMin = Math.max(0, i6 - i);
                                    } else {
                                        iMin = Math.min(0, i6 + i);
                                    }
                                    i6 = iMin;
                                    if (iMin != 0) {
                                        z = true;
                                        zCanScrollVertically = true;
                                    } else {
                                        zCanScrollVertically = true;
                                    }
                                } else {
                                    zCanScrollVertically = false;
                                }
                                if (z) {
                                    ai(1);
                                }
                            } else {
                                zCanScrollHorizontally = false;
                            }
                            z = zCanScrollHorizontally;
                            if (zCanScrollVertically) {
                                i = this.aD;
                                if (i6 > 0) {
                                    iMin = Math.max(0, i6 - i);
                                } else {
                                    iMin = Math.min(0, i6 + i);
                                }
                                i6 = iMin;
                                if (iMin != 0) {
                                    z = true;
                                    zCanScrollVertically = true;
                                } else {
                                    zCanScrollVertically = true;
                                }
                            } else {
                                zCanScrollVertically = false;
                            }
                            if (z) {
                                ai(1);
                            }
                        }
                        boolean z2 = zCanScrollHorizontally;
                        boolean z3 = zCanScrollVertically;
                        if (this.F == 1) {
                            int[] iArr3 = this.T;
                            iArr3[0] = 0;
                            iArr3[1] = 0;
                            int iA = i4 - a(i4, motionEvent.getY());
                            int iAK = i6 - aK(i6, motionEvent.getX());
                            int i8 = true != z2 ? 0 : iA;
                            int i9 = true != z3 ? 0 : iAK;
                            int[] iArr4 = this.aK;
                            if (ap(i8, i9, iArr3, iArr4, 0)) {
                                iA -= iArr3[0];
                                iAK -= iArr3[1];
                                iArr2[0] = iArr2[0] + iArr4[0];
                                iArr2[1] = iArr2[1] + iArr4[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i10 = iAK;
                            this.aB = i3 - iArr4[0];
                            this.aC = i5 - iArr4[1];
                            if (av(true != z2 ? 0 : iA, true != z3 ? 0 : i10, 0, 1, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            mj mjVar = this.M;
                            if (mjVar != null) {
                                if (iA != 0) {
                                    i2 = iA;
                                } else if (i10 != 0) {
                                }
                                mjVar.a(this, i2, i10);
                            }
                        }
                    } else if (actionMasked == 3) {
                        aM();
                    } else if (actionMasked == 5) {
                        this.ax = motionEvent.getPointerId(actionIndex);
                        int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.aB = x2;
                        this.az = x2;
                        int y2 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.aC = y2;
                        this.aA = y2;
                    } else if (actionMasked == 6) {
                        aQ(motionEvent);
                    }
                    motionEventObtain.recycle();
                } else {
                    this.ax = motionEvent.getPointerId(0);
                    int x3 = (int) (motionEvent.getX() + 0.5f);
                    this.aB = x3;
                    this.az = x3;
                    int y3 = (int) (motionEvent.getY() + 0.5f);
                    this.aC = y3;
                    this.aA = y3;
                    aW(0);
                }
                this.ay.addMovement(motionEventObtain);
                motionEventObtain.recycle();
            }
            return true;
        }
        ntVar.g(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.an = null;
        }
        aM();
        return true;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        oh ohVarK = k(view);
        if (ohVarK != null) {
            if (ohVarK.x()) {
                ohVarK.j();
            } else if (!ohVarK.A()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + ohVarK + o());
            }
        }
        view.clearAnimation();
        E(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.n.onRequestChildFocus(this, this.O, view, view2) && view2 != null) {
            aT(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        if (Build.VERSION.SDK_INT < 36 || om.a() < 3700001) {
            return this.n.requestChildRectangleOnScreen(this, view, rect, z);
        }
        Rect rect2 = this.al;
        if (rect2 == null) {
            rect2 = new Rect();
            this.al = rect2;
        }
        rect2.set(rect);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof nq) {
            nq nqVar = (nq) layoutParams;
            if (!nqVar.e) {
                Rect rect3 = nqVar.d;
                rect2.offset(-view.getScrollX(), -view.getScrollY());
                if (rect2.left <= 0) {
                    rect2.left -= rect3.left;
                }
                if (rect2.right >= view.getWidth()) {
                    rect2.right += rect3.right;
                }
                if (rect2.top <= 0) {
                    rect2.top -= rect3.top;
                }
                if (rect2.bottom >= view.getHeight()) {
                    rect2.bottom += rect3.bottom;
                }
                rect2.offset(view.getScrollX(), view.getScrollY());
            }
        }
        return this.n.requestChildRectangleOnScreen(this, view, rect2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.am;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((nt) arrayList.get(i)).f(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (!this.t) {
            return super.requestFocus(i, rect);
        }
        removeCallbacks(this.ao);
        this.t = false;
        View viewOnFocusEnter = null;
        if (this.m != null && this.n != null && !au() && !this.v) {
            C();
            viewOnFocusEnter = this.n.onFocusEnter(i, this.e, this.O);
        }
        if ((viewOnFocusEnter != null && viewOnFocusEnter.requestFocus(i, rect)) || super.requestFocus(i, rect)) {
            return true;
        }
        this.aq = true;
        try {
            View viewFocusSearch = super.focusSearch(getRootView().findFocus(), i);
            if (viewFocusSearch != null) {
                viewFocusSearch.requestFocus(i, rect);
            }
            return true;
        } finally {
            this.aq = false;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.ar != 0 || this.v) {
            this.u = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        np npVar = this.n;
        if (npVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.v) {
            return;
        }
        boolean zCanScrollHorizontally = npVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.n.canScrollVertically();
        if (!zCanScrollHorizontally) {
            if (!zCanScrollVertically) {
                return;
            } else {
                zCanScrollVertically = true;
            }
        }
        av(true != zCanScrollHorizontally ? 0 : i, true != zCanScrollVertically ? 0 : i2, -1, -1, null, 0);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!au()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.at |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void setClipToPadding(boolean z) {
        if (z != this.i) {
            O();
        }
        this.i = z;
        super.setClipToPadding(z);
        if (this.s) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        aL().a(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return aL().h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        aL().b(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.v) {
            x("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.v = true;
                this.as = true;
                an();
                return;
            }
            this.v = false;
            if (this.u && this.n != null && this.m != null) {
                requestLayout();
            }
            this.u = false;
        }
    }

    public final void u(oh ohVar) {
        View view = ohVar.a;
        ViewParent parent = view.getParent();
        this.e.l(j(view));
        if (ohVar.x()) {
            this.h.g(view, -1, view.getLayoutParams(), true);
            return;
        }
        lm lmVar = this.h;
        if (parent != this) {
            lmVar.f(view, -1, true);
            return;
        }
        int iB = lmVar.e.B(view);
        if (iB < 0) {
            Objects.toString(view);
            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(view.toString()));
        }
        lmVar.a.e(iB);
        lmVar.i(view);
    }

    public final void v(nr nrVar) {
        if (this.x == null) {
            this.x = new ArrayList();
        }
        this.x.add(nrVar);
    }

    public final void w(nt ntVar) {
        this.am.add(ntVar);
    }

    public final void x(String str) {
        if (au()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(o()));
        }
        if (this.aw > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("".concat(o())));
        }
    }

    final void z() {
        int iB = this.h.b();
        for (int i = 0; i < iB; i++) {
            View viewE = this.h.e(i);
            oh ohVar = viewE == null ? null : ((nq) viewE.getLayoutParams()).c;
            if (!ohVar.A()) {
                ohVar.g();
            }
        }
        nv nvVar = this.e;
        ArrayList arrayList = nvVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((oh) arrayList.get(i2)).g();
        }
        ArrayList arrayList2 = nvVar.a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((oh) arrayList2.get(i3)).g();
        }
        ArrayList arrayList3 = nvVar.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((oh) nvVar.b.get(i4)).g();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        np npVar = this.n;
        if (npVar != null) {
            return npVar.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(o()));
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.youtube.music.R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context) {
        this(context, null);
    }
}

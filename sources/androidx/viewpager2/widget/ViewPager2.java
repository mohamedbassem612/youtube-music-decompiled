package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import app.rive.semantics.SemanticState;
import defpackage.azw;
import defpackage.bac;
import defpackage.bbz;
import defpackage.dud;
import defpackage.due;
import defpackage.dug;
import defpackage.duh;
import defpackage.duj;
import defpackage.dul;
import defpackage.dum;
import defpackage.dun;
import defpackage.duo;
import defpackage.dup;
import defpackage.dur;
import defpackage.dut;
import defpackage.duu;
import defpackage.duv;
import defpackage.duw;
import defpackage.dux;
import defpackage.duy;
import defpackage.duz;
import defpackage.nf;
import defpackage.nh;
import defpackage.nl;
import defpackage.qa;
import defpackage.zs;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public int a;
    public boolean b;
    public LinearLayoutManager c;
    public RecyclerView d;
    public nf e;
    public dul f;
    public duh g;
    public boolean h;
    public final int i;
    public azw j;
    private final Rect k;
    private final Rect l;
    private final dug m;
    private int n;
    private Parcelable o;
    private dug p;
    private duj q;
    private boolean r;
    private final qa s;

    public ViewPager2(Context context) {
        super(context);
        this.k = new Rect();
        this.l = new Rect();
        this.m = new dug();
        this.b = false;
        this.s = new dum(this);
        this.n = -1;
        this.r = false;
        this.h = true;
        this.i = -1;
        n(context, null);
    }

    private final void n(Context context, AttributeSet attributeSet) {
        this.j = new duu(this);
        dux duxVar = new dux(this, context);
        this.d = duxVar;
        duxVar.setId(View.generateViewId());
        this.d.setDescendantFocusability(131072);
        dur durVar = new dur(this, context);
        this.c = durVar;
        this.d.ah(durVar);
        this.d.az();
        int[] iArr = dud.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        bac.o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            this.c.setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            ((duu) this.j).z();
            typedArrayObtainStyledAttributes.recycle();
            this.d.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.d.v(new dup());
            this.f = new dul(this);
            dul dulVar = this.f;
            RecyclerView recyclerView = this.d;
            this.g = new duh(this, dulVar, recyclerView);
            duw duwVar = new duw(this);
            this.e = duwVar;
            duwVar.f(recyclerView);
            this.d.aC(this.f);
            this.d.setOverScrollMode(getOverScrollMode());
            dug dugVar = new dug();
            this.p = dugVar;
            this.f.h = dugVar;
            dun dunVar = new dun(this);
            duo duoVar = new duo(this);
            dugVar.y(dunVar);
            this.p.y(duoVar);
            azw azwVar = this.j;
            this.d.setImportantForAccessibility(2);
            duu duuVar = (duu) azwVar;
            duuVar.b = new dut(duuVar);
            ViewPager2 viewPager2 = duuVar.a;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            this.p.y(this.m);
            duj dujVar = new duj(this.c);
            this.q = dujVar;
            this.p.y(dujVar);
            RecyclerView recyclerView2 = this.d;
            attachViewToParent(recyclerView2, 0, recyclerView2.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void o() {
        nh nhVarC;
        if (this.n == -1 || (nhVarC = c()) == 0) {
            return;
        }
        if (this.o != null) {
            if (nhVarC instanceof due) {
                ((due) nhVarC).b();
            }
            this.o = null;
        }
        int iMax = Math.max(0, Math.min(this.n, nhVarC.a() - 1));
        this.a = iMax;
        this.n = -1;
        this.d.ab(iMax);
        ((duu) this.j).z();
    }

    public final int a() {
        return this.c.getOrientation() != 1 ? 0 : 1;
    }

    public final int b() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.d;
        if (a() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public final nh c() {
        return this.d.m;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.d.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.d.canScrollVertically(i);
    }

    public final void d(nh nhVar) {
        nh nhVar2 = this.d.m;
        azw azwVar = this.j;
        if (nhVar2 != null) {
            nhVar2.y(((duu) azwVar).b);
            nhVar2.y(this.s);
        }
        this.d.ad(nhVar);
        this.a = 0;
        o();
        duu duuVar = (duu) this.j;
        duuVar.z();
        if (nhVar != null) {
            nhVar.x(duuVar.b);
            nhVar.x(this.s);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof duy) {
            int i = ((duy) parcelable).a;
            sparseArray.put(this.d.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        o();
    }

    public final void e(int i, boolean z) {
        if (j()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        f(i, z);
    }

    public final void f(int i, boolean z) {
        nh nhVarC = c();
        if (nhVarC == null) {
            if (this.n != -1) {
                this.n = Math.max(i, 0);
                return;
            }
            return;
        }
        if (nhVarC.a() > 0) {
            int iMin = Math.min(Math.max(i, 0), nhVarC.a() - 1);
            if (iMin == this.a && this.f.u()) {
                return;
            }
            int i2 = this.a;
            if (iMin == i2) {
                if (z) {
                    return;
                } else {
                    z = false;
                }
            }
            this.a = iMin;
            ((duu) this.j).z();
            double dM = i2;
            if (!this.f.u()) {
                dM = this.f.m();
            }
            dul dulVar = this.f;
            dulVar.a = true != z ? 3 : 2;
            dulVar.g = false;
            int i3 = dulVar.e;
            dulVar.e = iMin;
            dulVar.p(2);
            if (i3 != iMin) {
                dulVar.o(iMin);
            }
            if (!z) {
                this.d.ab(iMin);
                return;
            }
            double d = iMin;
            double dAbs = Math.abs(d - dM);
            RecyclerView recyclerView = this.d;
            if (dAbs <= 3.0d) {
                recyclerView.aj(iMin);
                return;
            }
            recyclerView.ab(d > dM ? iMin - 3 : iMin + 3);
            RecyclerView recyclerView2 = this.d;
            recyclerView2.post(new duz(iMin, recyclerView2, 0));
        }
    }

    public final void g(duv duvVar) {
        if (!this.r) {
            nl nlVar = this.d.E;
            this.r = true;
        }
        this.d.af(null);
        duj dujVar = this.q;
        if (duvVar != dujVar.a) {
            dujVar.a = duvVar;
            if (dujVar.a != null) {
                double dM = this.f.m();
                int i = (int) dM;
                float f = (float) (dM - ((double) i));
                this.q.v(i, f, Math.round(b() * f));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "androidx.viewpager.widget.ViewPager";
    }

    public final void h(boolean z) {
        this.h = z;
        ((duu) this.j).z();
    }

    public final void i() {
        nf nfVar = this.e;
        if (nfVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewB = nfVar.b(this.c);
        if (viewB != null) {
            int position = this.c.getPosition(viewB);
            if (position != this.a && this.f.b == 0) {
                this.p.w(position);
            }
            this.b = false;
        }
    }

    public final boolean j() {
        return this.g.b.g;
    }

    public final boolean k() {
        return this.c.getLayoutDirection() == 1;
    }

    public final void l(azw azwVar) {
        this.m.y(azwVar);
    }

    public final void m(azw azwVar) {
        this.m.a.remove(azwVar);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iA;
        int iA2;
        int iA3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        azw azwVar = this.j;
        bbz bbzVar = new bbz(accessibilityNodeInfo);
        ViewPager2 viewPager2 = ((duu) azwVar).a;
        if (viewPager2.c() == null) {
            iA = 0;
            iA2 = 0;
        } else if (viewPager2.a() == 1) {
            iA = viewPager2.c().a();
            iA2 = 1;
        } else {
            iA2 = viewPager2.c().a();
            iA = 1;
        }
        bbzVar.x(zs.h(iA, iA2, false, 0));
        nh nhVarC = viewPager2.c();
        if (nhVarC == null || (iA3 = nhVarC.a()) == 0 || !viewPager2.h) {
            return;
        }
        if (viewPager2.a > 0) {
            bbzVar.j(SemanticState.Multiline);
        }
        if (viewPager2.a < iA3 - 1) {
            bbzVar.j(SemanticState.Obscured);
        }
        bbzVar.L(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.d.getMeasuredWidth();
        int measuredHeight = this.d.getMeasuredHeight();
        Rect rect = this.k;
        rect.left = getPaddingLeft();
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.l;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.d.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.b) {
            i();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        measureChild(this.d, i, i2);
        int measuredWidth = this.d.getMeasuredWidth();
        int measuredHeight = this.d.getMeasuredHeight();
        int measuredState = this.d.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof duy)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        duy duyVar = (duy) parcelable;
        super.onRestoreInstanceState(duyVar.getSuperState());
        this.n = duyVar.b;
        this.o = duyVar.c;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        duy duyVar = new duy(super.onSaveInstanceState());
        duyVar.a = this.d.getId();
        int i = this.n;
        if (i == -1) {
            i = this.a;
        }
        duyVar.b = i;
        Parcelable parcelable = this.o;
        if (parcelable != null) {
            duyVar.c = parcelable;
        } else {
            Object obj = this.d.m;
            if (obj instanceof due) {
                duyVar.c = ((due) obj).a();
            }
        }
        return duyVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" does not support direct child views"));
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (!this.j.x(i)) {
            return super.performAccessibilityAction(i, bundle);
        }
        azw azwVar = this.j;
        if (!azwVar.x(i)) {
            throw new IllegalStateException();
        }
        duu duuVar = (duu) azwVar;
        duuVar.y(duuVar.a.a + (i == 8192 ? -1 : 1));
        return true;
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        ((duu) this.j).z();
    }

    @Override // android.view.View
    public final void setOverScrollMode(int i) {
        RecyclerView recyclerView = this.d;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(i);
        }
        super.setOverScrollMode(i);
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = new Rect();
        this.l = new Rect();
        this.m = new dug();
        this.b = false;
        this.s = new dum(this);
        this.n = -1;
        this.r = false;
        this.h = true;
        this.i = -1;
        n(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = new Rect();
        this.l = new Rect();
        this.m = new dug();
        this.b = false;
        this.s = new dum(this);
        this.n = -1;
        this.r = false;
        this.h = true;
        this.i = -1;
        n(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.k = new Rect();
        this.l = new Rect();
        this.m = new dug();
        this.b = false;
        this.s = new dum(this);
        this.n = -1;
        this.r = false;
        this.h = true;
        this.i = -1;
        n(context, attributeSet);
    }
}

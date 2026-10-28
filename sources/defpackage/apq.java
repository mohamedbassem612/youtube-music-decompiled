package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.apps.youtube.music.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class apq extends ViewGroup implements ayv, ayx {
    public final View a;
    public final akq b;
    public final apf c;
    public final int[] d;
    public final long e;
    public bbn f;
    public awqg g;
    public final Function0 h;
    public final awqg i;
    public final anq j;
    public final View k;
    public final acw l;
    private final int[] m;
    private final ayw n;
    private final ajs o;
    private final int p;
    private ajr q;

    /* JADX WARN: Type inference failed for: r10v7, types: [aia, java.lang.Object] */
    public apq(Context context, dl dlVar, View view, acw acwVar, ajs ajsVar, int i) {
        super(context);
        this.l = acwVar;
        this.a = view;
        if (dlVar != null) {
            int i2 = aor.a;
            setTag(R.id.androidx_compose_ui_view_composition_context, dlVar);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        apl aplVar = new apl(this);
        int i3 = bac.a;
        ci.m(this, aplVar);
        azs.c(this, this);
        akn aknVar = akq.c;
        this.b = aknVar;
        apg apgVar = new apg();
        this.c = apgVar;
        int i4 = 2;
        this.d = new int[2];
        this.e = 0L;
        this.h = new qf(this, 2);
        this.m = new int[2];
        this.n = new ayw();
        anq anqVar = new anq(null);
        int i5 = 1;
        akq akqVarA = aov.a(new amm(apr.a, acwVar), true, new akl(7));
        amt amtVar = new amt();
        amu amuVar = new amu();
        amu amuVar2 = amtVar.a;
        if (amuVar2 != null) {
            amuVar2.a = null;
        }
        amtVar.a = amuVar;
        amu amuVar3 = amtVar.a;
        if (amuVar3 != null) {
            amuVar3.a = amtVar;
        }
        this.i = amuVar;
        aknVar.then(akqVarA.then(amtVar).then(new akr(new ank(this, i4))).then(new anh(new apm(this, anqVar, i5))).then(new apu(new ank(this, 3))));
        anqVar.i(apgVar);
        apn apnVar = new apn(this, anqVar);
        if (!awrc.c(anqVar.a, apnVar)) {
            anqVar.a = apnVar;
            eol eolVar = anqVar.i;
            if (eolVar != null) {
                eolVar.b.f(anqVar.a);
            }
        }
        this.j = anqVar;
        this.k = view;
        this.o = ajsVar;
        this.p = i;
        setClipChildren(false);
        String.valueOf(i);
        Object objA = ajsVar != null ? ajsVar.a() : null;
        SparseArray<Parcelable> sparseArray = objA instanceof SparseArray ? (SparseArray) objA : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (ajsVar != null) {
            ajr ajrVarB = ajsVar.b();
            ajr ajrVar = this.q;
            if (ajrVar != null) {
                ajrVar.a();
            }
            this.q = ajrVarB;
        }
    }

    public static final int c(int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(awro.h(i3, i, i2), 1073741824);
        }
        if (i3 == -2) {
            if (i2 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
            }
        } else if (i3 == -1 && i2 != Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return 0;
    }

    @Override // defpackage.ayx
    public final bbn a(View view, bbn bbnVar) {
        this.f = new bbn(bbnVar);
        i(bbnVar);
        return bbnVar;
    }

    public final void b() {
        this.j.h();
    }

    @Override // defpackage.ayu
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
        if (isNestedScrollingEnabled()) {
            apr.a(i);
            apr.a(i2);
            iArr[0] = -avkz.h(0.0f);
            iArr[1] = -avkz.h(0.0f);
        }
    }

    @Override // defpackage.ayu
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        if (isNestedScrollingEnabled()) {
            apr.a(i);
            apr.a(i2);
            apr.a(i3);
            apr.a(i4);
        }
    }

    @Override // defpackage.ayv
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (isNestedScrollingEnabled()) {
            apr.a(i);
            apr.a(i2);
            apr.a(i3);
            apr.a(i4);
            iArr[0] = -avkz.h(0.0f);
            iArr[1] = -avkz.h(0.0f);
        }
    }

    @Override // defpackage.ayu
    public final void g(View view, View view2, int i, int i2) {
        this.n.b(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region != null) {
            int[] iArr = this.m;
            getLocationInWindow(iArr);
            int i = iArr[0];
            region.op(i, iArr[1], i + getWidth(), iArr[1] + getHeight(), Region.Op.DIFFERENCE);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.viewinterop.AndroidViewHolder";
    }

    @Override // android.view.View
    public final ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.n.a();
    }

    @Override // defpackage.ayu
    public final void h(View view, int i) {
        this.n.c(i);
    }

    public final void i(bbn bbnVar) {
        avw avwVarF = bbnVar.f(-1);
        avw avwVar = avw.a;
        if (avwVarF.equals(avwVar) && bbnVar.g(-9).equals(avwVar) && bbnVar.j() == null) {
            return;
        }
        this.j.c();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        b();
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.a.isNestedScrollingEnabled();
    }

    public final zs j() {
        if (!isAttachedToWindow()) {
            amw.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.a.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        View view = this.a;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        } else if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
        } else {
            view.measure(i, i2);
            setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (isNestedScrollingEnabled()) {
            awro.t(amn.a, null, 0, new apo(z, this, api.b(-f, -f2), null), 3);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (isNestedScrollingEnabled()) {
            awro.t(amn.a, null, 0, new app(this, api.b(-f, -f2), null), 3);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        awqg awqgVar = this.g;
        if (awqgVar == null) {
            return true;
        }
        awqgVar.invoke(rect != null ? new ale(rect.left, rect.top, rect.right, rect.bottom) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        awqg awqgVar = this.i;
        if (awqgVar != null) {
            awqgVar.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // defpackage.ayu
    public final boolean t(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }
}

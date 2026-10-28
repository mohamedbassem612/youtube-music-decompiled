package android.support.v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import defpackage.avw;
import defpackage.ayu;
import defpackage.ayv;
import defpackage.ayw;
import defpackage.azs;
import defpackage.bac;
import defpackage.bau;
import defpackage.bav;
import defpackage.baw;
import defpackage.bax;
import defpackage.bay;
import defpackage.baz;
import defpackage.bba;
import defpackage.bbb;
import defpackage.bbk;
import defpackage.bbn;
import defpackage.bh;
import defpackage.hd;
import defpackage.id;
import defpackage.iq;
import defpackage.ja;
import defpackage.jo;
import defpackage.jp;
import defpackage.jq;
import defpackage.jr;
import defpackage.jx;
import defpackage.ln;
import defpackage.pb;
import defpackage.ph;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ActionBarOverlayLayout extends ViewGroup implements ln, ayu, ayv {
    static final int[] a = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    private static final bbn k;
    private static final Rect l;
    private bbn A;
    private bbn B;
    private OverScroller C;
    private final Runnable D;
    private final Runnable E;
    private final ayw F;
    private final jr G;
    private ph H;
    public int b;
    public ActionBarContainer c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public jp h;
    public ViewPropertyAnimator i;
    public final AnimatorListenerAdapter j;
    private int m;
    private ContentFrameLayout n;
    private Drawable o;
    private boolean p;
    private int q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private final Rect v;
    private boolean w;
    private boolean x;
    private bbn y;
    private bbn z;

    static {
        bbb bavVar;
        if (Build.VERSION.SDK_INT >= 36) {
            bavVar = new bba();
        } else if (Build.VERSION.SDK_INT >= 35) {
            bavVar = new baz();
        } else if (Build.VERSION.SDK_INT >= 34) {
            bavVar = new bay();
        } else if (Build.VERSION.SDK_INT >= 31) {
            bavVar = new bax();
        } else if (Build.VERSION.SDK_INT >= 30) {
            bavVar = new baw();
        } else {
            bavVar = Build.VERSION.SDK_INT >= 29 ? new bav() : new bau();
        }
        bavVar.c(new avw(0, 1, 0, 1));
        k = bavVar.a();
        l = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = true;
        this.x = false;
        bbn bbnVar = bbn.a;
        this.y = bbnVar;
        this.z = bbnVar;
        this.A = bbnVar;
        this.B = bbnVar;
        this.j = new jo(this);
        this.D = new bh(this, 19, null);
        this.E = new bh(this, 20, null);
        v(context);
        this.F = new ayw();
        jr jrVar = new jr(context);
        this.G = jrVar;
        addView(jrVar);
    }

    private final void v(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(a);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.o = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.C = new OverScroller(context);
    }

    private static final boolean w(View view, int i, int i2, int i3, int i4) {
        boolean z;
        jq jqVar = (jq) view.getLayoutParams();
        if (jqVar.leftMargin != i) {
            jqVar.leftMargin = i;
            z = true;
        } else {
            z = false;
        }
        if (jqVar.topMargin != i2) {
            jqVar.topMargin = i2;
            z = true;
        }
        if (jqVar.rightMargin != i3) {
            jqVar.rightMargin = i3;
            z = true;
        }
        if (jqVar.bottomMargin == i4) {
            return z;
        }
        jqVar.bottomMargin = i4;
        return true;
    }

    @Override // defpackage.ln
    public final void a() {
        i();
        this.H.c();
    }

    public final void b() {
        removeCallbacks(this.D);
        removeCallbacks(this.E);
        ViewPropertyAnimator viewPropertyAnimator = this.i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // defpackage.ln
    public final void c(int i) {
        i();
        if (i == 109) {
            this.d = true;
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof jq;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.o != null) {
            int bottom = this.c.getVisibility() == 0 ? (int) (this.c.getBottom() + this.c.getTranslationY() + 0.5f) : 0;
            this.o.setBounds(0, bottom, getWidth(), this.o.getIntrinsicHeight() + bottom);
            this.o.draw(canvas);
        }
    }

    @Override // defpackage.ayu
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.ayv
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        e(view, i, i2, i3, i4, i5);
    }

    @Override // defpackage.ayu
    public final void g(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new jq();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new jq(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.F.a();
    }

    @Override // defpackage.ayu
    public final void h(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    final void i() {
        if (this.n == null) {
            this.n = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.c = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View viewFindViewById = findViewById(R.id.action_bar);
            if (!(viewFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(String.valueOf(viewFindViewById.getClass().getSimpleName())));
            }
            this.H = ((Toolbar) viewFindViewById).A();
        }
    }

    public final void j(int i) {
        b();
        this.c.setTranslationY(-Math.max(0, Math.min(i, this.c.getHeight())));
    }

    public final void k(boolean z) {
        if (z != this.p) {
            this.p = z;
            if (z) {
                return;
            }
            b();
            j(0);
        }
    }

    @Override // defpackage.ln
    public final void l(Menu menu, ja jaVar) {
        i();
        ph phVar = this.H;
        if (phVar.f == null) {
            phVar.f = new jx(phVar.a.getContext());
        }
        jx jxVar = phVar.f;
        jxVar.e = jaVar;
        Toolbar toolbar = phVar.a;
        if (menu == null && toolbar.a == null) {
            return;
        }
        toolbar.k();
        iq iqVar = toolbar.a.a;
        if (iqVar != menu) {
            if (iqVar != null) {
                iqVar.m(toolbar.x);
                iqVar.m(toolbar.y);
            }
            if (toolbar.y == null) {
                toolbar.y = new pb(toolbar);
            }
            jxVar.o();
            if (menu != null) {
                iq iqVar2 = (iq) menu;
                iqVar2.h(jxVar, toolbar.i);
                iqVar2.h(toolbar.y, toolbar.i);
            } else {
                jxVar.b(toolbar.i, null);
                toolbar.y.b(toolbar.i, null);
                jxVar.i();
                toolbar.y.i();
            }
            toolbar.a.j(toolbar.j);
            toolbar.a.k(jxVar);
            toolbar.x = jxVar;
            toolbar.w();
        }
    }

    @Override // defpackage.ln
    public final void m() {
        i();
        this.H.h();
    }

    @Override // defpackage.ln
    public final void n(Window.Callback callback) {
        i();
        this.H.d = callback;
    }

    @Override // defpackage.ln
    public final void o(CharSequence charSequence) {
        i();
        this.H.m(charSequence);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        boolean zW;
        i();
        int windowSystemUiVisibility = getWindowSystemUiVisibility();
        int i = windowSystemUiVisibility & SemanticState.Hidden;
        int i2 = windowSystemUiVisibility & 1536;
        bbn bbnVar = k;
        int i3 = bac.a;
        jr jrVar = this.G;
        Rect rect = this.v;
        azs.aa(jrVar, bbnVar, rect);
        boolean zEquals = rect.equals(l);
        this.w = !zEquals;
        boolean z = true;
        boolean z2 = i != 0;
        boolean z3 = zEquals || (z2 && i2 != 0);
        this.x = z3;
        jp jpVar = this.h;
        if (jpVar != null) {
            ((hd) jpVar).j = (z2 || z3) ? false : true;
        }
        bbn bbnVarO = bbn.o(windowInsets, this);
        bbk bbkVar = bbnVarO.b;
        Rect rect2 = this.u;
        avw avwVarD = bbkVar.d();
        int i4 = avwVarD.b;
        int i5 = avwVarD.c;
        int i6 = avwVarD.d;
        rect2.set(i4, i5, i6, avwVarD.e);
        if (this.x) {
            avw avwVarF = bbnVarO.f(2);
            int i7 = avwVarF.b;
            int i8 = avwVarF.d;
            this.c.setPadding(i4 - i7, i5, i6 - i8, 0);
            zW = w(this.c, i7, 0, i8, 0);
        } else {
            this.c.setPadding(0, 0, 0, 0);
            zW = w(this.c, i4, i5, i6, 0);
        }
        Rect rect3 = this.r;
        azs.aa(this, bbnVarO, rect3);
        bbn bbnVarN = bbnVarO.n(rect3.left, rect3.top, rect3.right, rect3.bottom);
        this.y = bbnVarN;
        if (this.z.equals(bbnVarN)) {
            z = zW;
        } else {
            this.z = this.y;
        }
        Rect rect4 = this.s;
        if (rect4.equals(rect3)) {
            if (z) {
            }
            return bbnVarO.k().m().l().e();
        }
        rect4.set(rect3);
        requestLayout();
        return bbnVarO.k().m().l().e();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        int i = bac.a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                jq jqVar = (jq) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = jqVar.leftMargin + paddingLeft;
                int i7 = jqVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredHeight;
        bbb bavVar;
        i();
        measureChildWithMargins(this.c, i, 0, i2, 0);
        jq jqVar = (jq) this.c.getLayoutParams();
        int iMax = Math.max(0, this.c.getMeasuredWidth() + jqVar.leftMargin + jqVar.rightMargin);
        int iMax2 = Math.max(0, this.c.getMeasuredHeight() + jqVar.topMargin + jqVar.bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.c.getMeasuredState());
        int i3 = bac.a;
        boolean z = (getWindowSystemUiVisibility() & SemanticState.Hidden) != 0;
        if (z) {
            measuredHeight = this.m;
            if (this.x) {
                measuredHeight += this.u.top;
            }
        } else {
            measuredHeight = this.c.getVisibility() != 8 ? this.c.getMeasuredHeight() : 0;
        }
        Rect rect = this.t;
        rect.set(this.r);
        bbn bbnVar = this.y;
        this.A = bbnVar;
        if (this.d || z || !this.w) {
            avw avwVarD = this.x ? avw.d(bbnVar.b(), Math.max(this.A.d(), measuredHeight), this.A.c(), Math.max(this.A.a(), 0)) : avw.d(bbnVar.b(), this.A.d() + measuredHeight, this.A.c(), this.A.a());
            bbn bbnVar2 = this.A;
            if (Build.VERSION.SDK_INT >= 36) {
                bavVar = new bba(bbnVar2);
            } else if (Build.VERSION.SDK_INT >= 35) {
                bavVar = new baz(bbnVar2);
            } else if (Build.VERSION.SDK_INT >= 34) {
                bavVar = new bay(bbnVar2);
            } else if (Build.VERSION.SDK_INT >= 31) {
                bavVar = new bax(bbnVar2);
            } else if (Build.VERSION.SDK_INT >= 30) {
                bavVar = new baw(bbnVar2);
            } else {
                bavVar = Build.VERSION.SDK_INT >= 29 ? new bav(bbnVar2) : new bau(bbnVar2);
            }
            bavVar.c(avwVarD);
            this.A = bavVar.a();
        } else {
            if (this.x) {
                rect.top = Math.max(rect.top, measuredHeight);
                rect.bottom = Math.max(rect.bottom, 0);
            } else {
                rect.top += measuredHeight;
                rect.bottom = rect.bottom;
            }
            this.A = this.A.n(0, measuredHeight, 0, 0);
        }
        w(this.n, rect.left, rect.top, rect.right, rect.bottom);
        if (!this.B.equals(this.A)) {
            bbn bbnVar3 = this.A;
            this.B = bbnVar3;
            bac.e(this.n, bbnVar3);
        }
        measureChildWithMargins(this.n, i, 0, i2, 0);
        jq jqVar2 = (jq) this.n.getLayoutParams();
        int iMax3 = Math.max(iMax, this.n.getMeasuredWidth() + jqVar2.leftMargin + jqVar2.rightMargin);
        int iMax4 = Math.max(iMax2, this.n.getMeasuredHeight() + jqVar2.topMargin + jqVar2.bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.n.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.p || !z) {
            return false;
        }
        this.C.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY);
        if (this.C.getFinalY() > this.c.getHeight()) {
            b();
            this.E.run();
        } else {
            b();
            this.D.run();
        }
        this.f = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.q + i2;
        this.q = i5;
        j(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        hd hdVar;
        id idVar;
        this.F.b(i, 0);
        ActionBarContainer actionBarContainer = this.c;
        this.q = actionBarContainer != null ? -((int) actionBarContainer.getTranslationY()) : 0;
        b();
        jp jpVar = this.h;
        if (jpVar == null || (idVar = (hdVar = (hd) jpVar).l) == null) {
            return;
        }
        idVar.a();
        hdVar.l = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.c.getVisibility() != 0) {
            return false;
        }
        return this.p;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.p || this.f) {
            return;
        }
        if (this.q <= this.c.getHeight()) {
            b();
            postDelayed(this.D, 600L);
        } else {
            b();
            postDelayed(this.E, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        i();
        int i2 = this.g ^ i;
        this.g = i;
        jp jpVar = this.h;
        if (jpVar != null) {
            boolean z = (i & SemanticState.Hidden) != 0;
            int i3 = i & 4;
            hd hdVar = (hd) jpVar;
            hdVar.j = (z || this.x) ? false : true;
            if (i3 == 0 || !z) {
                if (hdVar.k) {
                    hdVar.k = false;
                    hdVar.C(true);
                }
            } else if (!hdVar.k) {
                hdVar.k = true;
                hdVar.C(true);
            }
        }
        if ((i2 & SemanticState.Hidden) == 0 || this.h == null) {
            return;
        }
        int i4 = bac.a;
        requestApplyInsets();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        jp jpVar = this.h;
        if (jpVar != null) {
            ((hd) jpVar).i = i;
        }
    }

    @Override // defpackage.ln
    public final boolean p() {
        ActionMenuView actionMenuView;
        i();
        Toolbar toolbar = this.H.a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.b;
    }

    @Override // defpackage.ln
    public final boolean q() {
        i();
        return this.H.o();
    }

    @Override // defpackage.ln
    public final boolean r() {
        jx jxVar;
        i();
        ActionMenuView actionMenuView = this.H.a.a;
        if (actionMenuView == null || (jxVar = actionMenuView.c) == null) {
            return false;
        }
        return jxVar.l != null || jxVar.l();
    }

    @Override // defpackage.ln
    public final boolean s() {
        i();
        return this.H.p();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // defpackage.ayu
    public final boolean t(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // defpackage.ln
    public final boolean u() {
        i();
        return this.H.q();
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new jq(layoutParams);
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // defpackage.ayu
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
    }
}

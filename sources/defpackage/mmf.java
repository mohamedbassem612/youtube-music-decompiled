package defpackage;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mmf {
    public volatile boolean a;
    private volatile oyg b;
    private final boolean c;
    private int d;
    private int e;
    private float f;
    private float g;
    private boolean h;
    private boolean i;
    private int j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private float p;
    private float q;
    private final float[] r;
    private final int[] s;
    private final npt t;
    private final npr u;
    private volatile WeakReference v;
    private WeakReference w;
    private WeakReference x;
    private WeakReference y;
    private mme z;

    public mmf(boolean z, boolean z2) {
        npt nptVar = new npt();
        this.k = true;
        this.r = new float[2];
        this.s = new int[2];
        new Rect();
        this.u = new npr();
        this.a = z;
        this.b = null;
        this.c = false;
        this.t = nptVar;
    }

    private final mme n() {
        mme mmeVar = this.z;
        if (mmeVar != null) {
            return mmeVar;
        }
        mme mmeVar2 = new mme(this);
        this.z = mmeVar2;
        return mmeVar2;
    }

    private final void o(View view) {
        r(view, true);
        if (this.k) {
            view.setOnScrollChangeListener(null);
        }
        if (t(view)) {
            view.invalidate();
        }
    }

    private final void p(View view, boolean z) {
        r(view, z);
        WeakReference weakReference = this.w;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnLayoutChangeListener(n().a);
            this.w = null;
        }
        boolean zS = s(view);
        this.u.b();
        this.d = 0;
        this.e = 0;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = false;
        this.i = false;
        this.n = 0;
        this.o = 0;
        this.p = 0.0f;
        this.q = 0.0f;
        if (zS) {
            view.invalidate();
        }
    }

    private final void q(View view) {
        mme mmeVarN = n();
        View.OnLayoutChangeListener onLayoutChangeListener = mmeVarN.a;
        view.removeOnLayoutChangeListener(onLayoutChangeListener);
        view.addOnLayoutChangeListener(onLayoutChangeListener);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.setOnHierarchyChangeListener(mmeVarN.d);
            g(viewGroup);
        }
        View.OnAttachStateChangeListener onAttachStateChangeListener = mmeVarN.c;
        view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        view.addOnAttachStateChangeListener(onAttachStateChangeListener);
        if (this.k) {
            view.setOnScrollChangeListener(mmeVarN.b);
        }
    }

    private final void r(View view, boolean z) {
        mme mmeVarN = n();
        View.OnLayoutChangeListener onLayoutChangeListener = mmeVarN.a;
        view.removeOnLayoutChangeListener(onLayoutChangeListener);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.setOnHierarchyChangeListener(null);
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                viewGroup.getChildAt(i).removeOnLayoutChangeListener(onLayoutChangeListener);
            }
        }
        if (z) {
            view.removeOnAttachStateChangeListener(mmeVarN.c);
        }
    }

    private final boolean s(View view) {
        if (this.k) {
            view.setOnScrollChangeListener(null);
        }
        this.t.a(view);
        return t(view);
    }

    private final boolean t(View view) {
        WeakReference weakReference = this.y;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (!this.l || view2 != view) {
            return false;
        }
        view.setHorizontalFadingEdgeEnabled(false);
        view.setVerticalFadingEdgeEnabled(false);
        view.setFadingEdgeLength(0);
        this.l = false;
        this.y = null;
        this.m = 0;
        return true;
    }

    public final synchronized View a() {
        if (this.v == null) {
            return null;
        }
        return (View) this.v.get();
    }

    public final synchronized void b(View view) {
        if (a() != view) {
            return;
        }
        if (!k()) {
            p(view, false);
        } else {
            q(view);
            h(view);
        }
    }

    public final synchronized void c(View view) {
        m(view);
    }

    public final synchronized void d() {
        e(a());
    }

    public final synchronized void e(View view) {
        if (view == null) {
            return;
        }
        boolean z = a() == view;
        char[] cArr = null;
        if (z) {
            this.v = null;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (z) {
                this.x = new WeakReference(view);
            }
            new Handler(Looper.getMainLooper()).post(new lfa(this, view, 18, cArr));
            return;
        }
        WeakReference weakReference = this.x;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (!z && view2 != view) {
            o(view);
        } else {
            this.x = null;
            p(view, true);
        }
    }

    public final synchronized void f(View view) {
        if (a() == view) {
            return;
        }
        WeakReference weakReference = this.x;
        if ((weakReference != null ? (View) weakReference.get() : null) != view || a() != null) {
            o(view);
        } else {
            this.x = null;
            p(view, true);
        }
    }

    public final void g(ViewGroup viewGroup) {
        mme mmeVarN = n();
        View childAt = viewGroup.getChildCount() > 0 ? viewGroup.getChildAt(0) : null;
        WeakReference weakReference = this.w;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && view != childAt) {
            view.removeOnLayoutChangeListener(mmeVarN.a);
        }
        if (childAt == null) {
            this.w = null;
            return;
        }
        View.OnLayoutChangeListener onLayoutChangeListener = mmeVarN.a;
        childAt.removeOnLayoutChangeListener(onLayoutChangeListener);
        childAt.addOnLayoutChangeListener(onLayoutChangeListener);
        this.w = new WeakReference(childAt);
    }

    public final synchronized void h(View view) {
        i(view, this.a ? view.getScrollX() : view.getScrollY());
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0217 A[Catch: all -> 0x0227, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x0010, B:85:0x012f, B:87:0x0138, B:91:0x013f, B:93:0x0143, B:98:0x014e, B:100:0x0154, B:102:0x0158, B:104:0x0161, B:106:0x0165, B:108:0x016b, B:111:0x0172, B:113:0x0178, B:115:0x017e, B:118:0x0197, B:122:0x019d, B:124:0x01a3, B:126:0x01a9, B:128:0x01b3, B:130:0x01b9, B:132:0x01bf, B:134:0x01c3, B:138:0x01ca, B:140:0x01ce, B:145:0x01d7, B:147:0x01db, B:149:0x01e4, B:151:0x01e8, B:153:0x01f1, B:156:0x01f7, B:164:0x0220, B:159:0x01fd, B:152:0x01ed, B:148:0x01e0, B:160:0x0217, B:7:0x001a, B:9:0x001e, B:11:0x0027, B:13:0x002b, B:15:0x0034, B:17:0x0038, B:19:0x0049, B:21:0x004e, B:24:0x0058, B:30:0x007b, B:32:0x0084, B:34:0x0090, B:36:0x0096, B:38:0x009f, B:40:0x00a2, B:42:0x00a6, B:44:0x00c3, B:46:0x00c6, B:48:0x00ca, B:52:0x00d3, B:54:0x00de, B:68:0x0108, B:80:0x0121, B:83:0x0126, B:57:0x00e8, B:59:0x00ec, B:61:0x00f0, B:63:0x00f9, B:65:0x00fd, B:67:0x0106, B:43:0x00b5, B:37:0x009b, B:84:0x012b, B:25:0x006d, B:18:0x0041, B:10:0x0023), top: B:171:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5  */
    public final synchronized void i(View view, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        int height;
        int paddingBottom;
        int i7;
        int i8;
        int paddingTop;
        int paddingBottom2;
        View view2;
        boolean z;
        this.j = 0;
        this.h = false;
        this.i = false;
        boolean z2 = true;
        if (k()) {
            int width = this.a ? view.getWidth() : view.getHeight();
            boolean z3 = view instanceof ViewGroup;
            if (z3 && ((ViewGroup) view).getClipToPadding()) {
                if (this.a) {
                    paddingTop = view.getPaddingLeft();
                    paddingBottom2 = view.getPaddingRight();
                } else {
                    paddingTop = view.getPaddingTop();
                    paddingBottom2 = view.getPaddingBottom();
                }
                i2 = width - (paddingTop + paddingBottom2);
            } else {
                i2 = width;
            }
            int iMax = Math.max(0, i2);
            oyg oygVar = this.b;
            if (iMax <= 0 || oygVar == null) {
                this.d = 0;
                this.e = 0;
                i3 = 0;
                i4 = 0;
            } else {
                int[] iArr = this.s;
                oygVar.a(iMax, iArr);
                nqv.g(iArr[0], iArr[1], iMax, iArr);
                i3 = iArr[0];
                this.d = i3;
                i4 = iArr[1];
                this.e = i4;
            }
            if (width <= 0 || (i3 <= 0 && i4 <= 0)) {
                this.f = 0.0f;
                this.g = 0.0f;
            } else {
                if (z3) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (viewGroup.getChildCount() != 0) {
                        View childAt = viewGroup.getChildAt(0);
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            if (this.a) {
                                i7 = marginLayoutParams.leftMargin;
                                i8 = marginLayoutParams.rightMargin;
                            } else {
                                i7 = marginLayoutParams.topMargin;
                                i8 = marginLayoutParams.bottomMargin;
                            }
                            i6 = i7 + i8;
                        } else {
                            i6 = 0;
                        }
                        if (this.a) {
                            height = childAt.getWidth() + i6 + view.getPaddingLeft();
                            paddingBottom = view.getPaddingRight();
                        } else {
                            height = childAt.getHeight() + i6 + view.getPaddingTop();
                            paddingBottom = view.getPaddingBottom();
                        }
                        i5 = height + paddingBottom;
                    } else {
                        i5 = 0;
                    }
                } else {
                    i5 = 0;
                }
                boolean z4 = this.a && view.getLayoutDirection() == 1;
                boolean z5 = this.a;
                int i9 = this.d;
                int i10 = this.e;
                float[] fArr = this.r;
                int i11 = i5 - width;
                if (i11 <= 0) {
                    fArr[0] = 0.0f;
                    fArr[1] = 0.0f;
                    f = 0.0f;
                } else {
                    int i12 = (z5 && z4) ? i11 - i : i;
                    int i13 = i11 - i12;
                    fArr[0] = i9 > 0 ? nqv.f(i12 / i9) : 0.0f;
                    f = i10 > 0 ? nqv.f(i13 / i10) : 0.0f;
                    fArr[1] = f;
                }
                this.f = fArr[0];
                this.g = f;
                boolean z6 = i11 > 0 && i > 0;
                boolean z7 = i11 > 0 && i < i11;
                this.h = true != z4 ? z6 : z7;
                if (true != z4) {
                    z6 = z7;
                }
                this.i = z6;
                this.j = width;
            }
        } else {
            this.d = 0;
            this.e = 0;
            this.f = 0.0f;
            this.g = 0.0f;
        }
        int i14 = this.j;
        npw.b();
        boolean z8 = this.d > 0 || this.e > 0;
        boolean z9 = this.a && view.getLayoutDirection() == 1;
        if (z8 && npw.a() && (!(view instanceof ViewGroup) || !((ViewGroup) view).getClipToPadding() || (!this.a ? view.getPaddingTop() > 0 || view.getPaddingBottom() > 0 : view.getPaddingLeft() > 0 || view.getPaddingRight() > 0))) {
            boolean zT = t(view);
            view2 = view;
            if (this.t.b(view2, this.a, z9, i14, this.d, this.e, this.f, this.g)) {
                if (zT) {
                    view2.invalidate();
                    return;
                }
            }
        }
        view2 = view;
        npt nptVar = this.t;
        if (nptVar.a) {
            nptVar.a(view2);
            z = true;
        } else {
            z = false;
        }
        int iMax2 = Math.max(this.d, this.e);
        if (!z8 || (this.f <= 0.0f && this.g <= 0.0f)) {
            if (!t(view2)) {
                z2 = z;
                if (z2) {
                }
            }
        }
        boolean z10 = this.d == iMax2 || !this.h;
        boolean z11 = this.e == iMax2 || !this.i;
        if (!z10 || !z11) {
            if (!t(view2)) {
            }
        }
        boolean zIsHorizontalFadingEdgeEnabled = this.a ? view2.isHorizontalFadingEdgeEnabled() : view2.isVerticalFadingEdgeEnabled();
        int horizontalFadingEdgeLength = this.a ? view2.getHorizontalFadingEdgeLength() : view2.getVerticalFadingEdgeLength();
        if (!this.l || !zIsHorizontalFadingEdgeEnabled || this.m != iMax2 || horizontalFadingEdgeLength != iMax2) {
            view2.setHorizontalFadingEdgeEnabled(this.a);
            view2.setVerticalFadingEdgeEnabled(!this.a);
            view2.setFadingEdgeLength(iMax2);
            this.l = true;
            this.y = new WeakReference(view2);
            this.m = iMax2;
        }
        if (z2) {
        }
        z2 = z;
        if (z2) {
        }
        view2.invalidate();
    }

    public final synchronized void j(oyg oygVar, boolean z) {
        if (!Objects.equals(this.b, oygVar) || this.a != z) {
            this.b = oygVar;
            this.a = z;
            this.u.b();
            View viewA = a();
            if (viewA != null) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    b(viewA);
                    return;
                }
                new Handler(Looper.getMainLooper()).post(new lfa(this, viewA, 19, (char[]) null));
            }
        }
    }

    public final synchronized boolean k() {
        npw.b();
        return this.b != null;
    }

    public final synchronized boolean l(View view) {
        if (view != null) {
            if (a() == view) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void m(View view) {
        WeakReference weakReference = this.x;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        this.x = null;
        if (view2 != null && view2 != view) {
            p(view2, true);
        }
        View viewA = a();
        if (viewA != null && viewA != view) {
            e(viewA);
        }
        this.k = true;
        this.v = new WeakReference(view);
        if (k()) {
            q(view);
            h(view);
            return;
        }
        View.OnAttachStateChangeListener onAttachStateChangeListener = n().c;
        view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        view.addOnAttachStateChangeListener(onAttachStateChangeListener);
        if (s(view)) {
            view.invalidate();
        }
    }
}

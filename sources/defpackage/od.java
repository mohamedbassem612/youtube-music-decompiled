package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class od {
    public RecyclerView c;
    public np d;
    public boolean e;
    public boolean f;
    public View g;
    public boolean h;
    protected PointF k;
    private final DisplayMetrics n;
    private float p;
    public int b = -1;
    private final ob a = new ob();
    protected final LinearInterpolator i = new LinearInterpolator();
    protected final DecelerateInterpolator j = new DecelerateInterpolator();
    private boolean o = false;
    protected int l = 0;
    protected int m = 0;

    public od(Context context) {
        this.n = context.getResources().getDisplayMetrics();
    }

    private static int m(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    protected float a(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    protected int b(int i) {
        float fAbs = Math.abs(i);
        if (!this.o) {
            this.p = a(this.n);
            this.o = true;
        }
        return (int) Math.ceil(fAbs * this.p);
    }

    protected void c(View view, ob obVar) {
        od odVar;
        int iK = k();
        np npVar = this.d;
        int iH = 0;
        if (npVar == null || !npVar.canScrollHorizontally()) {
            odVar = this;
        } else {
            nq nqVar = (nq) view.getLayoutParams();
            int decoratedLeft = npVar.getDecoratedLeft(view) - nqVar.leftMargin;
            int decoratedRight = npVar.getDecoratedRight(view) + nqVar.rightMargin;
            int paddingLeft = npVar.getPaddingLeft();
            int width = npVar.getWidth() - npVar.getPaddingRight();
            odVar = this;
            iH = odVar.h(decoratedLeft, decoratedRight, paddingLeft, width, iK);
        }
        int i = odVar.i(view, odVar.l());
        int iJ = odVar.j((int) Math.sqrt((iH * iH) + (i * i)));
        if (iJ > 0) {
            obVar.b(-iH, -i, iJ, odVar.j);
        }
    }

    public final int d(View view) {
        return this.c.d(view);
    }

    public PointF e(int i) {
        Object obj = this.d;
        if (obj instanceof oc) {
            return ((oc) obj).computeScrollVectorForPosition(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement ".concat(String.valueOf(oc.class.getCanonicalName())));
        return null;
    }

    final void f(int i, int i2) {
        PointF pointFE;
        RecyclerView recyclerView = this.c;
        if (this.b == -1 || recyclerView == null) {
            g();
        }
        if (this.e && this.g == null && this.d != null && (pointFE = e(this.b)) != null && (pointFE.x != 0.0f || pointFE.y != 0.0f)) {
            recyclerView.aa((int) Math.signum(pointFE.x), (int) Math.signum(pointFE.y), null);
        }
        this.e = false;
        View view = this.g;
        if (view != null) {
            if (d(view) == this.b) {
                View view2 = this.g;
                oe oeVar = recyclerView.O;
                ob obVar = this.a;
                c(view2, obVar);
                obVar.a(recyclerView);
                g();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.g = null;
            }
        }
        if (this.f) {
            oe oeVar2 = recyclerView.O;
            ob obVar2 = this.a;
            if (this.c.n.getChildCount() == 0) {
                g();
            } else {
                int iM = m(this.l, i);
                this.l = iM;
                int iM2 = m(this.m, i2);
                this.m = iM2;
                if (iM == 0 && iM2 == 0) {
                    PointF pointFE2 = e(this.b);
                    if (pointFE2 == null || (pointFE2.x == 0.0f && pointFE2.y == 0.0f)) {
                        obVar2.a = this.b;
                        g();
                    } else {
                        float fSqrt = (float) Math.sqrt((pointFE2.x * pointFE2.x) + (pointFE2.y * pointFE2.y));
                        pointFE2.x /= fSqrt;
                        pointFE2.y /= fSqrt;
                        this.k = pointFE2;
                        this.l = (int) (pointFE2.x * 10000.0f);
                        this.m = (int) (pointFE2.y * 10000.0f);
                        obVar2.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (b(10000) * 1.2f), this.i);
                    }
                }
            }
            int i3 = obVar2.a;
            obVar2.a(recyclerView);
            if (i3 < 0 || !this.f) {
                return;
            }
            this.e = true;
            recyclerView.L.b();
        }
    }

    protected final void g() {
        if (this.f) {
            this.f = false;
            this.m = 0;
            this.l = 0;
            this.k = null;
            this.c.O.a = -1;
            this.g = null;
            this.b = -1;
            this.e = false;
            this.d.onSmoothScrollerStopped(this);
            this.d = null;
            this.c = null;
        }
    }

    public int h(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            return i4 - i2;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 >= 0) {
            return 0;
        }
        return i7;
    }

    public int i(View view, int i) {
        np npVar = this.d;
        if (npVar == null || !npVar.canScrollVertically()) {
            return 0;
        }
        nq nqVar = (nq) view.getLayoutParams();
        return h(npVar.getDecoratedTop(view) - nqVar.topMargin, npVar.getDecoratedBottom(view) + nqVar.bottomMargin, npVar.getPaddingTop(), npVar.getHeight() - npVar.getPaddingBottom(), i);
    }

    protected int j(int i) {
        return (int) Math.ceil(((double) b(i)) / 0.3356d);
    }

    protected int k() {
        PointF pointF = this.k;
        if (pointF == null || pointF.x == 0.0f) {
            return 0;
        }
        return this.k.x <= 0.0f ? -1 : 1;
    }

    protected int l() {
        PointF pointF = this.k;
        if (pointF == null || pointF.y == 0.0f) {
            return 0;
        }
        return this.k.y <= 0.0f ? -1 : 1;
    }
}

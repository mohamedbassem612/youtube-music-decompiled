package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.apps.youtube.music.R;
import j$.util.Objects;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ibe extends abhk implements View.OnLayoutChangeListener {
    public final Rect a;
    public int b;
    public final ibb c;
    public final ibc d;
    public View e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public vxz j;
    private final Rect n;
    private final Rect o;
    private final Rect p;
    private final Paint q;
    private final Paint r;
    private final Paint s;
    private final Paint t;
    private Shader u;
    private final int v;
    private final Paint w;
    private final IdentityHashMap x;
    private tup y;
    private View z;

    public ibe(Context context) {
        super(new abhl(), context, null);
        this.i = 1;
        Resources resources = context.getResources();
        this.n = new Rect();
        this.o = new Rect();
        this.p = new Rect();
        this.a = new Rect();
        this.q = new Paint();
        this.r = new Paint();
        this.s = new Paint();
        this.t = new Paint();
        this.x = new IdentityHashMap(4);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        this.b = getResources().getDimensionPixelSize(R.dimen.inline_time_bar_size);
        agrf agrfVar = twm.a;
        displayMetrics.getClass();
        this.v = (int) (((double) (displayMetrics.density * 4.0f)) + 0.5d);
        Paint paint = new Paint();
        this.w = paint;
        paint.setColor(resources.getColor(R.color.inline_time_bar_ad_break_marker_color));
        this.c = new ibb(this);
        this.d = new ibc(this, getResources().getDimensionPixelSize(R.dimen.inline_time_bar_miniplayer_size), resources.getDimensionPixelSize(R.dimen.inline_time_bar_scrubber_default_size), resources.getDimensionPixelSize(R.dimen.inline_time_bar_scrubber_drag_size));
        s(new jnr(this, 1));
    }

    private final int i() {
        return getResources().getDimensionPixelSize(R.dimen.controls_overlay_timebar_height);
    }

    private final void x(int i, int i2) {
        int i3 = i();
        int iHeight = i2 - i3;
        int i4 = this.b;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i - getPaddingRight();
        vxz vxzVar = this.j;
        boolean z = vxzVar != null && vxzVar.l(118, 45823962L, false);
        View view = this.z;
        if (view != null && view.getWidth() > 0 && this.z.getWidth() < i && !z) {
            paddingRight = this.z.getWidth() - getPaddingRight();
        }
        if (!h()) {
            if (this.y == null) {
                this.y = new tup();
            }
            tup.a(this.y, this.e, (View) getParent());
            Rect rect = this.y.a;
            setTop(rect.top);
            if (rect.width() > 0) {
                int left = getLeft();
                int i5 = rect.left - left;
                paddingRight = rect.right - left;
                paddingLeft = i5;
            }
            if (this.f) {
                iHeight = (rect.height() - i3) / 2;
            }
        }
        View view2 = this.z;
        if (view2 == null || view2.getWidth() <= 0 || this.z.getWidth() >= i || !z) {
            this.n.set(paddingLeft, iHeight, paddingRight, iHeight + i3);
        } else {
            View view3 = this.z;
            int paddingLeft2 = view3.getPaddingLeft();
            int left2 = getLeft();
            int top = getTop();
            int left3 = (view3.getLeft() - left2) + paddingLeft2;
            int right = (view3.getRight() - left2) - paddingLeft2;
            int bottom = (view3.getBottom() - top) - ((i3 + i4) / 2);
            this.n.set(left3, bottom, right, bottom + i3);
        }
        Rect rect2 = this.n;
        int i6 = rect2.top + ((i3 - i4) / 2);
        Rect rect3 = this.o;
        rect3.set(rect2);
        rect3.top = i6;
        rect3.bottom = i6 + i4;
        this.h = false;
        e();
    }

    private final boolean y() {
        return p() > 0;
    }

    @Override // defpackage.abhk
    public final long a() {
        long j = ((abhl) this.k).d;
        Rect rect = this.o;
        if (rect.width() <= 0) {
            return j;
        }
        return j + ((((long) this.a.width()) * p()) / ((long) rect.width()));
    }

    public final void b() {
        if (w()) {
            u(false);
            if (this.i != 2) {
                ibc ibcVar = this.d;
                ibcVar.f.removeCallbacks(ibcVar.e);
                ibcVar.g();
            }
        }
    }

    @Override // defpackage.abhk
    protected final void c(float f) {
        int i = (int) f;
        if (!h()) {
            Rect rect = this.a;
            Rect rect2 = this.o;
            rect.right = Math.max(rect2.left, Math.min(rect2.right, i));
            return;
        }
        int scaledEdgeSlop = ViewConfiguration.get(getContext()).getScaledEdgeSlop();
        Rect rect3 = this.n;
        int i2 = rect3.left + scaledEdgeSlop;
        int i3 = rect3.right - scaledEdgeSlop;
        int iMax = Math.max(i2, Math.min(i3, i)) - i2;
        Rect rect4 = this.a;
        Rect rect5 = this.o;
        rect4.right = rect5.left + ((rect5.width() * iMax) / (i3 - i2));
    }

    public final void d(View view) {
        View view2 = this.z;
        if (Objects.equals(view, view2)) {
            return;
        }
        if (view2 != null) {
            view2.removeOnLayoutChangeListener(this);
        }
        if (view != null) {
            view.addOnLayoutChangeListener(this);
        }
        this.z = view;
        requestLayout();
    }

    @Override // defpackage.abhk
    protected final void e() {
        Rect rect = this.p;
        Rect rect2 = this.o;
        rect.set(rect2);
        Rect rect3 = this.a;
        rect3.set(rect2);
        abho abhoVar = this.k;
        long jP = p();
        long jN = n();
        long jO = o();
        if (true == w()) {
            jN = jO;
        }
        if (abhoVar.o()) {
            rect3.right = rect2.right;
        } else if (jP > 0) {
            rect.right = rect2.left + ((int) ((((long) rect2.width()) * m()) / jP));
            rect3.right = rect2.left + ((int) ((((long) rect2.width()) * jN) / jP));
        } else {
            rect.right = rect2.left;
            rect3.right = rect2.left;
        }
        this.r.setColor(abhoVar.a());
        this.q.setColor(abhoVar.b());
        vxz vxzVar = this.j;
        if (vxzVar == null || !vxzVar.l(70, 45730033L, false)) {
            Paint paint = this.s;
            paint.setShader(null);
            paint.setColor(abhoVar.c() | (-16777216));
            Paint paint2 = this.t;
            paint2.setShader(null);
            paint2.setColor(abhoVar.c() | (-16777216));
        } else {
            int i = rect3.left;
            int i2 = rect3.top;
            LinearGradient linearGradientA = aedk.a(i, rect3.right, rect3.bottom, getContext());
            this.u = linearGradientA;
            Paint paint3 = this.s;
            paint3.setShader(linearGradientA);
            paint3.setColor(tzk.i(getContext(), R.attr.ytStaticBrandRed));
            Paint paint4 = this.t;
            paint4.setShader(null);
            paint4.setColor(tzk.i(getContext(), R.attr.ytStaticBrandRed));
        }
        setEnabled(abhoVar.n());
        invalidate(this.n);
    }

    @Override // defpackage.abhk
    public final void f() {
        if (w() && !isEnabled()) {
            u(false);
        }
        if (w()) {
            this.d.a();
            return;
        }
        if (this.i != 2) {
            ibc ibcVar = this.d;
            ibe ibeVar = ibcVar.f;
            Runnable runnable = ibcVar.e;
            ibeVar.removeCallbacks(runnable);
            if (ibcVar.b() == 0.0f) {
                ibcVar.g();
            } else {
                ibeVar.postDelayed(runnable, ibcVar.d);
            }
        }
    }

    @Override // defpackage.abhk
    protected final boolean g(float f, float f2) {
        return this.n.contains((int) f, (int) f2);
    }

    public final boolean h() {
        return this.g || this.e == null;
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        boolean z = false;
        if (super.isEnabled() && y()) {
            z = true;
        }
        setFocusable(z);
        return z;
    }

    @Override // android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = this.z;
        if (view != null) {
            view.removeOnLayoutChangeListener(this);
            this.z.addOnLayoutChangeListener(this);
        }
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        View view = this.z;
        if (view != null) {
            view.removeOnLayoutChangeListener(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int iRound;
        Map mapI;
        boolean z = (y() || ((abhl) this.k).m) ? false : true;
        if (this.h) {
            return;
        }
        if (!z || this.c.b() <= 0.0f) {
            canvas.save();
            abho abhoVar = this.k;
            ibb ibbVar = this.c;
            Rect rect = this.o;
            int iRound2 = Math.round(ibbVar.b() * rect.height());
            int iCenterY = rect.centerY() - (iRound2 / 2);
            int i3 = iRound2 + iCenterY;
            if (abhoVar.q()) {
                Rect rect2 = this.p;
                i2 = rect2.left;
                i = rect2.right;
            } else {
                i = 0;
                i2 = 0;
            }
            int i4 = rect.left;
            Rect rect3 = this.a;
            int iO = ahng.O(i4, i, rect3.right);
            if (iO < rect.right) {
                canvas.drawRect(iO, iCenterY, rect.right, i3, this.q);
            }
            int iMax = Math.max(i2, rect3.right);
            if (i > iMax) {
                canvas.drawRect(iMax, iCenterY, i, i3, this.r);
            }
            if (rect3.width() > 0) {
                canvas.drawRect(rect3.left, iCenterY, rect3.right, i3, this.s);
            }
            long jP = p();
            if (abhoVar.p()) {
                long j = 0;
                if (jP > 0 && (mapI = abhoVar.i()) != null) {
                    abhs abhsVar = abhs.a;
                    if (mapI.containsKey(abhsVar)) {
                        abht[] abhtVarArr = (abht[]) mapI.get(abhsVar);
                        int i5 = this.v;
                        int i6 = i5 / 2;
                        int length = abhtVarArr.length;
                        int i7 = 0;
                        while (i7 < length) {
                            int i8 = i7;
                            abht[] abhtVarArr2 = abhtVarArr;
                            int iMin = rect.left + Math.min(rect.width() - i5, Math.max(0, (int) (((((long) rect.width()) * Math.min(jP, Math.max(j, abhtVarArr2[i8].a))) / jP) - ((long) i6))));
                            canvas.drawRect(iMin, iCenterY, iMin + i5, i3, this.w);
                            i7 = i8 + 1;
                            i6 = i6;
                            length = length;
                            abhtVarArr = abhtVarArr2;
                            j = 0;
                        }
                    }
                }
            }
            ibc ibcVar = this.d;
            float fB = ibbVar.b();
            ibe ibeVar = ibcVar.f;
            if (ibeVar.isEnabled()) {
                int i9 = ibeVar.w() ? ibcVar.c : ibcVar.b;
                int i10 = ibcVar.a;
                iRound = i10 + Math.round(ibcVar.b() * (i9 - i10));
            } else {
                iRound = ibcVar.a;
            }
            int iRound3 = Math.round((fB * iRound) / 2.0f);
            canvas.drawCircle(Math.min(rect.right - iRound3, Math.max(rect3.left + iRound3, rect3.right)), rect3.exactCenterY(), iRound3, this.t);
            canvas.restore();
        }
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        x(i3 - i, i4 - i2);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view == this.e) {
            if (h()) {
                return;
            }
            x(getWidth(), getHeight());
        } else if (view != this.z) {
            view.removeOnLayoutChangeListener(this);
        } else if (i3 - i != i7 - i5) {
            x(getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (h()) {
            size2 += (i() - this.b) / 2;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // defpackage.abhk, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Point pointQ = q(motionEvent);
        int i = pointQ.x;
        int i2 = pointQ.y;
        if (this.i == 1 || this.c.b() <= 0.0f) {
            return false;
        }
        if (!w()) {
            Iterator it = this.x.values().iterator();
            if (it.hasNext()) {
                throw null;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}

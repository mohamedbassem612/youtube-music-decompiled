package com.google.android.libraries.youtube.player.features.overlay.timebar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.aaja;
import defpackage.aauz;
import defpackage.abhk;
import defpackage.abhl;
import defpackage.abhm;
import defpackage.abhn;
import defpackage.abho;
import defpackage.abhp;
import defpackage.abhr;
import defpackage.abhs;
import defpackage.abht;
import defpackage.ackm;
import defpackage.agke;
import defpackage.twm;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class TimeBar extends abhk {
    private int A;
    private String B;
    private final Rect C;
    private final Rect D;
    private int E;
    private int F;
    private int G;
    protected final Rect a;
    protected final Paint b;
    public abhr c;
    private int d;
    private final DisplayMetrics e;
    private final int f;
    private final Rect g;
    private final Rect h;
    private final Rect i;
    private final Rect j;
    private final Paint n;
    private final Paint o;
    private final Paint p;
    private final Paint q;
    private final Paint r;
    private final Paint s;
    private final abhn t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private boolean y;
    private boolean z;

    public TimeBar(Context context, AttributeSet attributeSet) {
        super(new abhl(), context, attributeSet);
        this.d = 2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.e = displayMetrics;
        ViewConfiguration.get(context);
        this.y = true;
        this.z = true;
        this.g = new Rect();
        this.h = new Rect();
        this.i = new Rect();
        this.j = new Rect();
        this.a = new Rect();
        this.n = new Paint();
        this.o = new Paint();
        this.p = new Paint();
        this.q = new Paint();
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(-1291845888);
        float fC = twm.c(displayMetrics, 12);
        Rect rect = new Rect();
        this.C = rect;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, aauz.b, 0, 0);
        this.B = aaja.d(0L);
        this.E = 255;
        int color = typedArrayObtainStyledAttributes.hasValue(6) ? typedArrayObtainStyledAttributes.getColor(6, -1) : -1;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        ackm ackmVar = ackm.ROBOTO_REGULAR;
        paint2.setTypeface(ackmVar.c(context, 0));
        paint2.setShadowLayer(6.0f, 1.0f, 1.0f, 1342177280);
        paint2.setColor(color);
        paint2.setTextSize(fC);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.getTextBounds("0:00:00", 0, 7, rect);
        Rect rect2 = new Rect();
        this.D = rect2;
        Paint paint3 = new Paint(1);
        this.s = paint3;
        paint3.setTypeface(ackmVar.c(context, 0));
        paint3.setShadowLayer(6.0f, 1.0f, 1.0f, 1342177280);
        paint3.setColor(color);
        paint3.setTextSize(fC);
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.getTextBounds("-0:00:00", 0, 8, rect2);
        this.u = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, twm.c(displayMetrics, 13));
        this.v = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, twm.c(displayMetrics, 8));
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, twm.c(displayMetrics, 42));
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, twm.c(displayMetrics, 12));
        this.w = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, twm.c(displayMetrics, 20));
        this.x = dimensionPixelOffset2;
        typedArrayObtainStyledAttributes.recycle();
        this.t = new abhn(this, dimensionPixelOffset, dimensionPixelOffset2);
        this.c = new abhr(null, 0);
        y();
        s(new abhm(this, 0));
        setFocusable(true);
        setClickable(true);
        setImportantForAccessibility(1);
    }

    private final float d() {
        abhn abhnVar = this.t;
        abhnVar.a();
        int i = abhnVar.c;
        int i2 = i / 2;
        Rect rect = this.h;
        return Math.max(rect.left - i2, Math.min((rect.right - i) + i2, this.F));
    }

    private final void h(int i, int i2) {
        float f = this.e.density * this.d;
        int paddingLeft = getPaddingLeft();
        if (!i()) {
            paddingLeft += this.A;
        }
        int i3 = (int) f;
        int i4 = (i2 / 2) - (i3 / 2);
        this.h.set(paddingLeft, i4, (i - getPaddingRight()) - this.A, i3 + i4);
    }

    private final boolean i() {
        return this.k.r() && p() > 0;
    }

    private final boolean x() {
        return this.k.s() && p() > 0;
    }

    private final boolean y() {
        int iWidth;
        int i = this.A;
        if (i()) {
            iWidth = this.D.width() + (this.t.c / 2);
            this.A = iWidth;
        } else if (!x() || i()) {
            this.A = 0;
            iWidth = 0;
        } else {
            iWidth = this.C.width() + (this.v << 1) + (this.t.c / 2);
            this.A = iWidth;
        }
        if (iWidth != i) {
            h(getMeasuredWidth(), getMeasuredHeight());
        }
        return this.A != i;
    }

    @Override // defpackage.abhk
    public final long a() {
        long j = ((abhl) this.k).d;
        Rect rect = this.h;
        if (rect.width() <= 0) {
            return j;
        }
        return j + ((((long) ((this.F + (this.t.c / 2)) - rect.left)) * p()) / ((long) rect.width()));
    }

    public final String b() {
        return aaja.d(((abhl) this.k).c);
    }

    @Override // defpackage.abhk
    protected final void c(float f) {
        int i = this.t.c / 2;
        Rect rect = this.h;
        int i2 = rect.right - i;
        int i3 = rect.left - i;
        int i4 = ((int) f) - i;
        this.F = i4;
        int iMin = Math.min(i2, Math.max(i3, i4));
        this.F = iMin;
        if (iMin - i3 <= 0) {
            this.F = i3;
        } else if (i2 - iMin <= 0) {
            this.F = i2;
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        abht[] abhtVarArr;
        super.draw(canvas);
        abho abhoVar = this.k;
        if (p() > 0) {
            canvas.drawRect(this.h, this.n);
            if (abhoVar.q()) {
                canvas.drawRect(this.i, this.o);
            }
            abhoVar.t();
            Rect rect = this.j;
            Paint paint = this.p;
            canvas.drawRect(rect, paint);
            if (this.y) {
                abhn abhnVar = this.t;
                float fA = abhnVar.a() / 2.0f;
                int i = abhnVar.c / 2;
                if (fA > 0.0f) {
                    float f = i;
                    Paint paint2 = this.q;
                    if (paint2.getColor() == 0) {
                        int alpha = paint.getAlpha();
                        paint.setAlpha(this.E);
                        canvas.drawCircle(d() + f, this.G + f, fA, paint);
                        paint.setAlpha(alpha);
                    } else {
                        paint2.setAlpha(this.E);
                        canvas.drawCircle(d() + f, this.G + f, fA, paint2);
                    }
                }
            }
        }
        if (i()) {
            if (!abhoVar.m()) {
                canvas.drawText(aaja.d(k()), getWidth() - ((this.A * 3) / 7), (getHeight() / 2) + (this.D.height() / 2), this.s);
            }
        } else if (x()) {
            int i2 = (this.A * 3) / 7;
            int height = getHeight() / 2;
            int iHeight = this.C.height() / 2;
            String strD = (this.z && w()) ? aaja.d(a()) : b();
            int i3 = height + iHeight;
            float f2 = i2;
            Paint paint3 = this.r;
            float f3 = i3;
            canvas.drawText(strD, f2, f3, paint3);
            canvas.drawText(this.B, getWidth() - f2, f3, paint3);
        }
        Map mapI = abhoVar.i();
        long jP = p();
        if (!abhoVar.p() || mapI == null || jP <= 0 || (abhtVarArr = (abht[]) mapI.get(abhs.a)) == null) {
            return;
        }
        for (abht abhtVar : abhtVarArr) {
            long jMin = Math.min(jP, Math.max(0L, abhtVar.a));
            Rect rect2 = this.h;
            long jWidth = ((((long) rect2.width()) * jMin) / jP) - 2;
            Rect rect3 = this.a;
            rect3.left = rect2.left + ((int) jWidth);
            rect3.right = rect3.left + 4;
            canvas.drawRect(rect3, this.b);
        }
    }

    @Override // defpackage.abhk
    protected final void e() {
        if (y()) {
            requestLayout();
        }
        Rect rect = this.i;
        Rect rect2 = this.h;
        rect.set(rect2);
        Rect rect3 = this.j;
        rect3.set(rect2);
        this.a.set(rect2);
        if (Build.VERSION.SDK_INT >= 29) {
            Rect rect4 = this.g;
            rect4.set(getLeft(), getTop(), getRight(), getBottom());
            setSystemGestureExclusionRects(agke.q(rect4));
        }
        abho abhoVar = this.k;
        long jP = p();
        long jN = n();
        long jO = o();
        if (true != w()) {
            jO = jN;
        }
        String strD = aaja.d(((abhl) this.k).a);
        this.B = strD;
        this.r.getTextBounds(strD, 0, strD.length(), this.C);
        if (jP > 0) {
            rect.right = rect2.left + ((int) ((((long) rect2.width()) * m()) / jP));
            rect3.right = rect2.left + ((int) ((((long) rect2.width()) * jN) / jP));
            this.F = (rect2.left - (this.t.c / 2)) + ((int) ((((long) rect2.width()) * jO) / jP));
        } else {
            rect.right = rect2.left;
            rect3.right = this.y ? rect2.left : rect2.right;
            this.F = rect2.left - (this.t.c / 2);
        }
        rect3.left = Math.min(rect2.right, Math.max(rect3.left, rect2.left));
        rect3.right = Math.max(rect2.left, Math.min(rect3.right, rect2.right));
        rect.left = Math.min(rect2.right, Math.max(rect.left, rect2.left));
        rect.right = Math.max(rect2.left, Math.min(rect.right, rect2.right));
        abhoVar.t();
        this.p.setColor(abhoVar.c());
        this.q.setColor(abhoVar.d());
        this.o.setColor(abhoVar.a());
        this.n.setColor(abhoVar.b());
        boolean zN = abhoVar.n();
        if (this.y != zN) {
            this.y = zN;
            if (!zN && w()) {
                u(false);
            }
            setFocusable(zN);
            requestLayout();
        }
        setEnabled(abhoVar.n());
        invalidate();
    }

    @Override // defpackage.abhk
    protected final void f() {
        if (w() && !isEnabled()) {
            u(false);
            e();
            return;
        }
        abhn abhnVar = this.t;
        TimeBar timeBar = abhnVar.e;
        if (!timeBar.isEnabled()) {
            abhnVar.a.cancel();
            return;
        }
        boolean zW = timeBar.w();
        boolean z = !zW;
        ValueAnimator valueAnimator = abhnVar.a;
        if (!valueAnimator.isRunning() && abhnVar.a() == abhnVar.d && zW) {
            valueAnimator.start();
            abhnVar.b = false;
            return;
        }
        if (!valueAnimator.isRunning() && abhnVar.a() == abhnVar.c && !zW) {
            valueAnimator.reverse();
            abhnVar.b = true;
        } else {
            if (!valueAnimator.isRunning() || z == abhnVar.b) {
                return;
            }
            valueAnimator.reverse();
            abhnVar.b = z;
        }
    }

    @Override // defpackage.abhk
    protected final boolean g(float f, float f2) {
        int i = this.G;
        int i2 = this.t.c;
        int i3 = i + i2;
        Rect rect = this.h;
        int i4 = rect.left - i2;
        int i5 = rect.right + i2;
        if (i4 < f && f < i5) {
            int i6 = this.G;
            int i7 = this.u;
            if (i6 - i7 < f2 && f2 < i3 + i7) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(b());
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0010  */
    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        float f = this.e.density;
        float f2 = f + f;
        if (x()) {
            i3 = this.f;
        } else {
            i3 = (int) f2;
            if (this.y) {
                i3 = this.f;
            }
        }
        int defaultSize = getDefaultSize(0, i);
        int iResolveSize = resolveSize(i3, i2);
        setMeasuredDimension(defaultSize, iResolveSize);
        if (x() || this.y) {
            this.G = (iResolveSize / 2) - (this.t.c / 2);
            h(defaultSize, iResolveSize);
        } else {
            this.h.set(0, 0, defaultSize, iResolveSize);
        }
        e();
    }

    public TimeBar(Context context, abhp abhpVar) {
        this(context, (AttributeSet) null);
        s(abhpVar);
    }
}

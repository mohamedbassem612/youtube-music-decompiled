package com.google.android.apps.youtube.music.watchpage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Spanned;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.youtube.music.R;
import defpackage.aaja;
import defpackage.abhk;
import defpackage.abhl;
import defpackage.abho;
import defpackage.abhr;
import defpackage.abhs;
import defpackage.abht;
import defpackage.ackj;
import defpackage.ackm;
import defpackage.aedk;
import defpackage.agrf;
import defpackage.iaz;
import defpackage.jnr;
import defpackage.jns;
import defpackage.jnt;
import defpackage.nsj;
import defpackage.twm;
import defpackage.typ;
import defpackage.tzk;
import defpackage.vxz;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class MusicPlaybackControlsTimeBar extends abhk {
    private jns A;
    private String B;
    private final int C;
    protected final Rect a;
    protected final Paint b;
    public int c;
    public int d;
    public boolean e;
    public vxz f;
    private final DisplayMetrics g;
    private final int h;
    private final Rect i;
    private final Rect j;
    private final Rect n;
    private final Paint o;
    private final Paint p;
    private final Paint q;
    private Shader r;
    private final Paint s;
    private final Paint t;
    private final Paint u;
    private final Paint v;
    private final Paint w;
    private final int x;
    private final Rect y;
    private final int z;

    public MusicPlaybackControlsTimeBar(Context context, AttributeSet attributeSet) {
        super(new abhl(), context, attributeSet);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.g = displayMetrics;
        ViewConfiguration.get(context);
        this.i = new Rect();
        this.j = new Rect();
        this.n = new Rect();
        this.a = new Rect();
        this.o = new Paint();
        this.p = new Paint();
        this.q = new Paint(1);
        this.s = new Paint(1);
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(-1291845888);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, jnt.a, 0, 0);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.B = typ.i(0L, 3).toString();
        this.C = 255;
        this.y = new Rect();
        this.t = new Paint(1);
        this.u = new Paint(1);
        this.v = new Paint(1);
        this.w = new Paint(1);
        agrf agrfVar = twm.a;
        displayMetrics.getClass();
        this.z = (int) (((double) (displayMetrics.density * 12.0f)) + 0.5d);
        displayMetrics.getClass();
        this.x = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, (int) (((double) (displayMetrics.density * 13.0f)) + 0.5d));
        displayMetrics.getClass();
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, (int) (((double) (displayMetrics.density * 42.0f)) + 0.5d));
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void x(Canvas canvas, Rect rect, Paint paint) {
        if (!this.e) {
            canvas.drawRect(rect, paint);
            return;
        }
        Rect rect2 = this.i;
        float fHeight = rect2.height();
        canvas.save();
        Path path = new Path();
        float f = fHeight / 2.0f;
        path.addRoundRect(new RectF(rect2), f, f, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawRect(rect, paint);
        canvas.restore();
    }

    private final void y(Paint paint, int i, boolean z) {
        agrf agrfVar = twm.a;
        DisplayMetrics displayMetrics = this.g;
        displayMetrics.getClass();
        float f = displayMetrics.density * 12.0f;
        paint.setTypeface(ackm.ROBOTO_REGULAR.c(getContext(), 0));
        paint.setShadowLayer(6.0f, 1.0f, 1.0f, 1342177280);
        paint.setColor(i);
        paint.setTextSize((int) (((double) f) + 0.5d));
        paint.setTextAlign(z ? Paint.Align.RIGHT : Paint.Align.LEFT);
    }

    @Override // defpackage.abhk
    public final long a() {
        long j = ((abhl) this.k).d;
        Rect rect = this.i;
        if (rect.width() <= 0) {
            return j;
        }
        return j + ((((long) ((this.c + (b() / 2)) - rect.left)) * p()) / ((long) rect.width()));
    }

    public final int b() {
        jns jnsVar = this.A;
        if (jnsVar == null) {
            return 0;
        }
        return this.e ? jnsVar.d : jnsVar.c;
    }

    @Override // defpackage.abhk
    protected final void c(float f) {
        int iB = b() / 2;
        Rect rect = this.i;
        int i = rect.right - iB;
        int i2 = rect.left - iB;
        int i3 = (int) (f - iB);
        this.c = i3;
        this.c = Math.min(i, Math.max(i2, i3));
    }

    public final String d() {
        return iaz.a(((abhl) this.k).c).toString();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Paint paint;
        abht[] abhtVarArr;
        jns jnsVar;
        super.draw(canvas);
        abho abhoVar = this.k;
        boolean zQ = abhoVar.q();
        if (this.e) {
            jns jnsVar2 = this.A;
            if (jnsVar2 != null && jnsVar2.a() / 2.0f > 0.0f && ((abhl) this.k).k) {
                int measuredHeight = getMeasuredHeight() / 2;
                float fA = this.A.a() / 2.0f;
                Rect rect = this.i;
                int i = (int) fA;
                int i2 = measuredHeight - i;
                int i3 = measuredHeight + i;
                rect.set(rect.left, i2, rect.right, i3);
                Rect rect2 = this.n;
                rect2.set(rect2.left, i2, rect2.right, i3);
                Rect rect3 = this.j;
                rect3.set(rect3.left, i2, rect3.right, i3);
                Rect rect4 = this.a;
                rect4.set(rect4.left, i2, rect4.right, i3);
            }
            Rect rect5 = this.i;
            float fHeight = rect5.height() / 2.0f;
            canvas.drawRoundRect(new RectF(rect5), fHeight, fHeight, this.o);
        } else {
            canvas.drawRect(this.i, this.o);
        }
        Rect rect6 = this.n;
        Paint paint2 = this.q;
        x(canvas, rect6, paint2);
        if (zQ) {
            x(canvas, this.j, this.p);
        }
        if (((abhl) this.k).k && !this.e && (jnsVar = this.A) != null) {
            float fA2 = jnsVar.a() / 2.0f;
            float fB = b() / 2.0f;
            if (fA2 > 0.0f) {
                vxz vxzVar = this.f;
                if (vxzVar == null || !vxzVar.l(70, 45730033L, false)) {
                    Paint paint3 = this.s;
                    if (paint3.getColor() == 0) {
                        int alpha = paint2.getAlpha();
                        paint2.setAlpha(this.C);
                        canvas.drawCircle(this.c + fB, this.d + fB, fA2, paint2);
                        paint2.setAlpha(alpha);
                    } else {
                        paint3.setAlpha(this.C);
                        canvas.drawCircle(this.c + fB, this.d + fB, fA2, paint3);
                    }
                } else {
                    canvas.drawCircle(this.c + fB, this.d + fB, fA2, this.s);
                }
            }
        }
        int iB = (this.e ? this.d + b() : this.i.bottom) + this.z + this.y.height();
        boolean z = true;
        boolean z2 = this.e && w();
        float f = iB;
        boolean zR = this.k.r();
        abho abhoVar2 = this.k;
        if (zR) {
            String string = "";
            if (((abhl) abhoVar2).c != 0) {
                long jA = w() ? a() : ((abhl) this.k).c;
                long j = ((abhl) this.k).a;
                if (!aaja.f(jA, j)) {
                    string = iaz.a(-(j - jA)).toString();
                }
            }
            canvas.drawText(string, this.i.right, f, z2 ? this.w : this.u);
        } else if (abhoVar2.s()) {
            String string2 = w() ? iaz.a(a()).toString() : d();
            Rect rect7 = this.i;
            float f2 = rect7.left;
            if (z2) {
                paint = this.v;
            } else {
                paint = this.t;
                z = false;
            }
            canvas.drawText(string2, f2, f, paint);
            canvas.drawText(this.B, rect7.right, f, z ? this.w : this.u);
        }
        Map mapI = abhoVar.i();
        long jP = p();
        if (!abhoVar.p() || mapI == null || jP <= 0 || (abhtVarArr = (abht[]) mapI.get(abhs.a)) == null) {
            return;
        }
        for (abht abhtVar : abhtVarArr) {
            long jMin = Math.min(jP, Math.max(0L, abhtVar.a));
            Rect rect8 = this.i;
            long jWidth = ((((long) rect8.width()) * jMin) / jP) - 2;
            Rect rect9 = this.a;
            rect9.left = rect8.left + ((int) jWidth);
            rect9.right = rect9.left + 4;
            x(canvas, rect9, this.b);
        }
    }

    @Override // defpackage.abhk
    protected final void e() {
        Rect rect = this.j;
        Rect rect2 = this.i;
        rect.set(rect2);
        Rect rect3 = this.n;
        rect3.set(rect2);
        this.a.set(rect2);
        abho abhoVar = this.k;
        long jP = p();
        long jN = n();
        long jO = o();
        if (true == w()) {
            jN = jO;
        }
        long jP2 = p() + 500;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        String string = typ.i(jP2 / 1000, 3).toString();
        this.B = string;
        this.u.getTextBounds(string, 0, string.length(), this.y);
        if (abhoVar.o()) {
            rect3.right = rect2.right;
        } else if (jP > 0) {
            rect.right = rect2.left + ((int) ((((long) rect2.width()) * m()) / jP));
            rect3.right = rect2.left + ((int) ((((long) rect2.width()) * jN) / jP));
            this.c = (rect2.left - (b() / 2)) + ((int) ((((long) rect2.width()) * jN) / jP));
        } else {
            rect.right = rect2.left;
            rect3.right = rect2.left;
            this.c = rect2.left - (b() / 2);
        }
        rect3.left = Math.min(rect2.right, Math.max(rect3.left, rect2.left));
        rect3.right = Math.max(rect2.left, Math.min(rect3.right, rect2.right));
        rect.left = Math.min(rect2.right, Math.max(rect.left, rect2.left));
        rect.right = Math.max(rect2.left, Math.min(rect.right, rect2.right));
        vxz vxzVar = this.f;
        if (vxzVar == null || !vxzVar.l(70, 45730033L, false)) {
            Paint paint = this.q;
            paint.setShader(null);
            paint.setColor(abhoVar.c());
            this.s.setColor(abhoVar.d());
        } else {
            int i = rect3.left;
            int i2 = rect3.top;
            LinearGradient linearGradientA = aedk.a(i, rect3.right, rect3.bottom, getContext());
            this.r = linearGradientA;
            Paint paint2 = this.q;
            paint2.setShader(linearGradientA);
            paint2.setColor(tzk.i(getContext(), R.attr.ytStaticBrandRed));
            this.s.setColor(tzk.i(getContext(), R.attr.ytStaticBrandRed));
        }
        this.p.setColor(abhoVar.a());
        this.o.setColor(abhoVar.b());
        setEnabled(abhoVar.n());
        setFocusable(abhoVar.n());
        invalidate();
    }

    @Override // defpackage.abhk
    public final void f() {
        if (w() && !isEnabled()) {
            u(false);
            e();
            return;
        }
        jns jnsVar = this.A;
        if (jnsVar != null) {
            MusicPlaybackControlsTimeBar musicPlaybackControlsTimeBar = jnsVar.e;
            if (!musicPlaybackControlsTimeBar.isEnabled()) {
                jnsVar.a.cancel();
                return;
            }
            boolean zW = musicPlaybackControlsTimeBar.w();
            boolean z = !zW;
            ValueAnimator valueAnimator = jnsVar.a;
            if (!valueAnimator.isRunning() && jnsVar.a() == jnsVar.d && zW) {
                valueAnimator.start();
                jnsVar.b = false;
                return;
            }
            if (!valueAnimator.isRunning() && jnsVar.a() == jnsVar.c && !zW) {
                valueAnimator.reverse();
                jnsVar.b = true;
            } else {
                if (!valueAnimator.isRunning() || z == jnsVar.b) {
                    return;
                }
                valueAnimator.reverse();
                jnsVar.b = z;
            }
        }
    }

    @Override // defpackage.abhk
    protected final boolean g(float f, float f2) {
        int iB = this.d + b();
        Rect rect = this.i;
        int iB2 = rect.left - b();
        int iB3 = rect.right + b();
        if (iB2 < f && f < iB3) {
            int i = this.d;
            int i2 = this.x;
            if (i - i2 < f2 && f2 < iB + i2) {
                return true;
            }
        }
        return false;
    }

    public final void h() {
        int i = true != this.e ? 12 : 4;
        agrf agrfVar = twm.a;
        DisplayMetrics displayMetrics = this.g;
        displayMetrics.getClass();
        float f = i * displayMetrics.density;
        int i2 = true != this.e ? 20 : 10;
        displayMetrics.getClass();
        this.A = new jns(this, (int) (((double) f) + 0.5d), (int) (((double) (i2 * displayMetrics.density)) + 0.5d), true != this.e ? 100 : 250);
        s(new abhr(1));
        s(new jnr(this, 0));
    }

    public final void i() {
        int color = getContext().getColor(true != this.e ? R.color.ytm_text_color_secondary_translucent : R.color.ytm_text_color_secondary);
        y(this.t, color, false);
        y(this.u, color, true);
        if (this.e) {
            int color2 = getContext().getColor(R.color.ytm_text_color_primary);
            y(this.v, color2, false);
            y(this.w, color2, true);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence charSequenceD = d();
        Resources resources = getResources();
        if (Pattern.compile("([0-9]+:)?([0-5]?[0-9]):[0-5][0-9]").matcher(charSequenceD).matches()) {
            charSequenceD = nsj.b(resources, charSequenceD);
        }
        Spanned spannedB = ackj.b(ackj.c(d()), charSequenceD.toString());
        if (spannedB != null) {
            accessibilityNodeInfo.setText(spannedB);
        } else {
            accessibilityNodeInfo.setText(charSequenceD);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        jns jnsVar;
        int defaultSize = getDefaultSize(0, i);
        int iResolveSize = resolveSize(this.h, i2);
        setMeasuredDimension(defaultSize, iResolveSize);
        int i4 = iResolveSize / 2;
        this.d = i4 - (b() / 2);
        if (!this.e || (jnsVar = this.A) == null) {
            float f = this.g.density;
            i3 = (int) (f + f);
        } else {
            i3 = jnsVar.d;
        }
        int i5 = i4 - (i3 / 2);
        this.i.set(getPaddingLeft(), i5, defaultSize - getPaddingRight(), i3 + i5);
        e();
    }
}

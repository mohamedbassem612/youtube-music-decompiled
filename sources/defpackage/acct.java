package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.EmbossMaskFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acct extends View {
    public StaticLayout a;
    public StaticLayout b;
    public Layout.Alignment c;
    public boolean d;
    public boolean e;
    public Pair f;
    public Pair g;
    private final float h;
    private final TextPaint i;
    private final TextPaint j;
    private final TextPaint k;
    private final Path l;
    private final Editable m;
    private int n;
    private int o;
    private float p;
    private boolean q;

    public acct(Context context) {
        super(context);
        this.q = false;
        setLayerType(1, null);
        setId(R.id.subtitle_window_identifier);
        TextPaint textPaint = new TextPaint();
        this.i = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        TextPaint textPaint2 = new TextPaint();
        this.j = textPaint2;
        textPaint2.setAntiAlias(true);
        textPaint2.setColor(0);
        textPaint2.setStyle(Paint.Style.STROKE);
        TextPaint textPaint3 = new TextPaint();
        this.k = textPaint3;
        textPaint3.setAntiAlias(true);
        this.l = new Path();
        this.m = Editable.Factory.getInstance().newEditable("");
        this.c = Layout.Alignment.ALIGN_CENTER;
        this.p = textPaint.getTextSize() * 0.0625f;
        this.h = TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics());
        setFocusable(true);
        setAccessibilityLiveRegion(1);
    }

    private final int j(CharSequence charSequence, int i) {
        float desiredWidth;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i2 = this.n;
        if (i2 == 0) {
            desiredWidth = Layout.getDesiredWidth(charSequence, this.i);
        } else if (i2 != 1) {
            if (i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5) {
                throw new IllegalStateException(String.format("Edge type %d is not supported.", Integer.valueOf(i2)));
            }
            desiredWidth = Layout.getDesiredWidth(charSequence, this.i);
        } else {
            desiredWidth = Layout.getDesiredWidth(charSequence, this.j);
        }
        int iCeil = this.e ? (int) Math.ceil(desiredWidth) : ((int) desiredWidth) + paddingLeft;
        if (true != this.e) {
            paddingLeft = 0;
        }
        if (mode != 0) {
            int i3 = size - paddingLeft;
            iCeil = mode == Integer.MIN_VALUE ? Math.min(iCeil, i3) : i3;
        }
        return this.e ? Math.max(iCeil, 0) : iCeil;
    }

    private final int k() {
        StaticLayout staticLayoutA = a();
        staticLayoutA.getClass();
        return staticLayoutA.getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [float] */
    /* JADX WARN: Type inference failed for: r5v4, types: [double] */
    private final int l() {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        StaticLayout staticLayoutA = a();
        if (staticLayoutA == null) {
            return paddingRight;
        }
        int lineCount = staticLayoutA.getLineCount();
        int iMax = 0;
        for (int i = 0; i < lineCount; i++) {
            float lineMax = staticLayoutA.getLineMax(i);
            if (this.e) {
                lineMax = Math.ceil((double) lineMax);
            }
            iMax = Math.max((int) lineMax, iMax);
        }
        return paddingRight + iMax;
    }

    private final StaticLayout m(int i) {
        Editable editable = this.m;
        StaticLayout staticLayout = this.b;
        int iJ = j(editable, i);
        if (staticLayout != null && iJ == staticLayout.getWidth()) {
            return staticLayout;
        }
        SpannableString spannableString = new SpannableString(editable);
        for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) spannableString.getSpans(0, spannableString.length(), ForegroundColorSpan.class)) {
            spannableString.removeSpan(foregroundColorSpan);
        }
        return new StaticLayout(spannableString, this.j, iJ, this.c, 1.0f, 0.0f, true);
    }

    private final StaticLayout n(int i) {
        Editable editable = this.m;
        StaticLayout staticLayout = this.a;
        int iJ = j(editable, i);
        return (staticLayout == null || iJ != staticLayout.getWidth()) ? new StaticLayout(editable, this.i, iJ, this.c, 1.0f, 0.0f, true) : staticLayout;
    }

    private final void o() {
        int i;
        if (!this.q || (i = this.n) == 4 || i == 3) {
            setLayerType(1, null);
        } else {
            setLayerType(0, null);
        }
    }

    public final StaticLayout a() {
        int i = this.n;
        if (i != 0) {
            if (i == 1) {
                return this.b;
            }
            if (i != 2 && i != 3 && i != 4 && i != 5) {
                throw new IllegalStateException(String.format("Edge type %d is not supported.", Integer.valueOf(i)));
            }
        }
        return this.a;
    }

    public final void b() {
        this.m.clear();
        setContentDescription(null);
        this.a = null;
        this.b = null;
        setVisibility(8);
    }

    public final void c(int i) {
        this.j.setColor(i);
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    public final void d(int i) {
        int i2 = this.n;
        if (i2 == 2) {
            this.i.clearShadowLayer();
        } else if (i2 == 3 || i2 == 4) {
            this.i.setMaskFilter(null);
        } else if (i2 == 5) {
            this.i.clearShadowLayer();
        }
        if (i != 0 && i != 1) {
            if (i == 2) {
                TextPaint textPaint = this.i;
                float f = this.p;
                textPaint.setShadowLayer(f, f, f, this.j.getColor());
            } else if (i == 3) {
                this.i.setMaskFilter(new EmbossMaskFilter(new float[]{1.0f, 1.0f, 1.0f}, 0.0f, 9.0f, 2.0f));
            } else if (i == 4) {
                this.i.setMaskFilter(new EmbossMaskFilter(new float[]{-1.0f, -1.0f, 1.0f}, 0.0f, 9.0f, 2.0f));
            } else if (i != 5) {
                i = 0;
            } else {
                Resources resources = getResources();
                this.i.setShadowLayer(resources.getDimensionPixelSize(R.dimen.subtitles_inline_muted_edge_radius), 0.0f, resources.getDimensionPixelSize(R.dimen.subtitles_inline_muted_edge_y), this.j.getColor());
            }
        }
        this.n = i;
        o();
        requestLayout();
    }

    public final void e(boolean z) {
        if (this.q != z) {
            this.q = z;
            o();
        }
    }

    public final void f(CharSequence charSequence) {
        Editable editable = this.m;
        editable.clear();
        editable.append(charSequence);
        setContentDescription(charSequence);
        this.a = null;
        this.b = null;
        requestLayout();
        invalidate();
    }

    public final void g(int i) {
        this.i.setColor(i);
        invalidate();
    }

    public final void h(float f) {
        float fApplyDimension = TypedValue.applyDimension(2, f, getResources().getDisplayMetrics());
        this.i.setTextSize(fApplyDimension);
        this.p = 0.0625f * fApplyDimension;
        TextPaint textPaint = this.j;
        textPaint.setTextSize(fApplyDimension);
        textPaint.setStrokeWidth(this.p);
        d(this.n);
        this.b = null;
        this.a = null;
        requestLayout();
        invalidate();
    }

    public final void i(Typeface typeface) {
        this.i.setTypeface(typeface);
        this.j.setTypeface(typeface);
        this.k.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        Editable editable = this.m;
        StaticLayout staticLayout = this.b;
        StaticLayout staticLayout2 = this.a;
        if (TextUtils.isEmpty(editable) || staticLayout == null || staticLayout2 == null) {
            return;
        }
        if (Color.alpha(this.o) != 0) {
            canvas.drawPath(this.l, this.k);
        }
        if (this.e) {
            canvas.save();
            canvas.translate(getPaddingLeft(), 0.0f);
        }
        if (this.n == 1) {
            staticLayout.draw(canvas);
        }
        staticLayout2.draw(canvas);
        if (this.e) {
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.m);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        super.onLayout(z, i, i2, i3, i4);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3 - i, 1073741824);
        this.a = n(iMakeMeasureSpec);
        this.b = m(iMakeMeasureSpec);
        StaticLayout staticLayout = this.a;
        if (staticLayout != null) {
            int lineCount = staticLayout.getLineCount();
            RectF rectF = new RectF();
            Path path = this.l;
            path.reset();
            for (int i5 = 0; i5 < lineCount; i5++) {
                float lineBottom = staticLayout.getLineBottom(i5);
                float lineTop = staticLayout.getLineTop(i5);
                float lineLeft = staticLayout.getLineLeft(i5);
                float lineRight = staticLayout.getLineRight(i5);
                if (this.e) {
                    rectF.set(lineLeft, lineTop, getPaddingLeft() + lineRight + getPaddingRight(), lineBottom);
                } else {
                    rectF.set(lineLeft - getPaddingLeft(), lineTop, getPaddingRight() + lineRight, lineBottom);
                }
                if (this.d) {
                    Float fValueOf4 = null;
                    if (i5 == 0) {
                        Pair pair = this.f;
                        fValueOf = pair != null ? (Float) pair.first : null;
                    } else {
                        fValueOf = Float.valueOf(staticLayout.getLineLeft(i5 - 1));
                    }
                    if (i5 == 0) {
                        Pair pair2 = this.f;
                        fValueOf2 = pair2 != null ? (Float) pair2.second : null;
                    } else {
                        fValueOf2 = Float.valueOf(staticLayout.getLineRight(i5 - 1));
                    }
                    int i6 = lineCount - 1;
                    if (i5 == i6) {
                        Pair pair3 = this.g;
                        fValueOf3 = pair3 != null ? (Float) pair3.first : null;
                    } else {
                        fValueOf3 = Float.valueOf(staticLayout.getLineLeft(i5 + 1));
                    }
                    if (i5 == i6) {
                        Pair pair4 = this.g;
                        if (pair4 != null) {
                            fValueOf4 = (Float) pair4.second;
                        }
                    } else {
                        fValueOf4 = Float.valueOf(staticLayout.getLineRight(i5 + 1));
                    }
                    boolean z2 = fValueOf == null || fValueOf.floatValue() - lineLeft >= this.h;
                    boolean z3 = fValueOf2 == null || lineRight - fValueOf2.floatValue() >= this.h;
                    boolean z4 = fValueOf3 == null || fValueOf3.floatValue() - lineLeft >= this.h;
                    boolean z5 = fValueOf4 == null || lineRight - fValueOf4.floatValue() >= this.h;
                    path.addRoundRect(rectF, new float[]{z2 ? this.h : 0.0f, z2 ? this.h : 0.0f, z3 ? this.h : 0.0f, z3 ? this.h : 0.0f, z5 ? this.h : 0.0f, z5 ? this.h : 0.0f, z4 ? this.h : 0.0f, z4 ? this.h : 0.0f}, Path.Direction.CCW);
                } else {
                    path.addRect(rectF, Path.Direction.CCW);
                }
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.a = n(i);
        this.b = m(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, l());
        } else if (mode != 1073741824) {
            size = l();
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, k());
        } else if (mode2 != 1073741824) {
            size2 = k();
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.o = i;
        this.k.setColor(i);
        invalidate();
    }
}

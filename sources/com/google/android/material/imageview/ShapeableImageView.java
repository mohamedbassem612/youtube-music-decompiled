package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.google.android.apps.youtube.music.R;
import defpackage.aexv;
import defpackage.aexw;
import defpackage.afba;
import defpackage.afbe;
import defpackage.afbk;
import defpackage.afbl;
import defpackage.afbm;
import defpackage.afbv;
import defpackage.afev;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class ShapeableImageView extends AppCompatImageView implements afbv {
    public final RectF a;
    public afbe b;
    public afbk c;
    private final afbm d;
    private final RectF e;
    private final Paint f;
    private final Paint g;
    private final Path h;
    private ColorStateList i;
    private float j;
    private Path k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean r;

    public ShapeableImageView(Context context, AttributeSet attributeSet, int i) {
        super(afev.a(context, attributeSet, i, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, i);
        this.d = afbl.a;
        this.h = new Path();
        this.r = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.g = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.a = new RectF();
        this.e = new RectF();
        this.k = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, aexv.a, i, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.i = afba.f(context2, typedArrayObtainStyledAttributes, 9);
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.l = dimensionPixelSize;
        this.m = dimensionPixelSize;
        this.n = dimensionPixelSize;
        this.o = dimensionPixelSize;
        this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.c = new afbk(afbk.j(context2, attributeSet, i, R.style.Widget_MaterialComponents_ShapeableImageView));
        setOutlineProvider(new aexw(this));
    }

    private final void f(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        int paddingRight = i - getPaddingRight();
        int paddingBottom = i2 - getPaddingBottom();
        RectF rectF = this.a;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        afbm afbmVar = this.d;
        afbk afbkVar = this.c;
        Path path = this.h;
        afbmVar.c(afbkVar, null, 1.0f, rectF, null, path);
        this.k.rewind();
        this.k.addPath(path);
        RectF rectF2 = this.e;
        rectF2.set(0.0f, 0.0f, i, i2);
        this.k.addRect(rectF2, Path.Direction.CCW);
    }

    private final boolean g() {
        return (this.p == Integer.MIN_VALUE && this.q == Integer.MIN_VALUE) ? false : true;
    }

    private final boolean h() {
        return getLayoutDirection() == 1;
    }

    public final int a() {
        int i = this.q;
        if (i == Integer.MIN_VALUE) {
            return h() ? this.l : this.n;
        }
        return i;
    }

    public final int b() {
        int i;
        int i2;
        if (g()) {
            if (h() && (i2 = this.q) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!h() && (i = this.p) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.l;
    }

    public final int c() {
        int i;
        int i2;
        if (g()) {
            if (h() && (i2 = this.p) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!h() && (i = this.q) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.n;
    }

    @Override // defpackage.afbv
    public final void d(afbk afbkVar) {
        this.c = afbkVar;
        afbe afbeVar = this.b;
        if (afbeVar != null) {
            afbeVar.d(afbkVar);
        }
        f(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public final int e() {
        int i = this.p;
        if (i == Integer.MIN_VALUE) {
            return h() ? this.n : this.l;
        }
        return i;
    }

    @Override // android.view.View
    public final int getPaddingBottom() {
        return super.getPaddingBottom() - this.o;
    }

    @Override // android.view.View
    public final int getPaddingEnd() {
        return super.getPaddingEnd() - a();
    }

    @Override // android.view.View
    public final int getPaddingLeft() {
        return super.getPaddingLeft() - b();
    }

    @Override // android.view.View
    public final int getPaddingRight() {
        return super.getPaddingRight() - c();
    }

    @Override // android.view.View
    public final int getPaddingStart() {
        return super.getPaddingStart() - e();
    }

    @Override // android.view.View
    public final int getPaddingTop() {
        return super.getPaddingTop() - this.m;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.k, this.g);
        if (this.i != null) {
            Paint paint = this.f;
            paint.setStrokeWidth(this.j);
            int colorForState = this.i.getColorForState(getDrawableState(), this.i.getDefaultColor());
            if (this.j <= 0.0f || colorForState == 0) {
                return;
            }
            paint.setColor(colorForState);
            canvas.drawPath(this.h, paint);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.r || !isLayoutDirectionResolved()) {
            return;
        }
        this.r = true;
        if (isPaddingRelative() || g()) {
            setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
        } else {
            setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        f(i, i2);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i + b(), i2 + this.m, i3 + c(), i4 + this.o);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i + e(), i2 + this.m, i3 + a(), i4 + this.o);
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }
}

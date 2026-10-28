package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import j$.util.Objects;
import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class afbe extends Drawable implements afbv {
    public static final /* synthetic */ int l = 0;
    private static final String m = "afbe";
    private static final Paint n;
    private static final afbd[] o;
    private PorterDuffColorFilter A;
    private final RectF B;
    private boolean C;
    private boolean D;
    private afbk E;
    private blg F;
    private float[] G;
    private final abpi H;
    private final abpi I;
    public afbc a;
    public final afbt[] b;
    public final afbt[] c;
    public final BitSet d;
    public boolean e;
    public boolean f;
    public final Path g;
    public int h;
    blf[] i;
    public float[] j;
    public avgj k;
    private final Matrix p;
    private final Path q;
    private final RectF r;
    private final RectF s;
    private final Region t;
    private final Region u;
    private final Paint v;
    private final Paint w;
    private final afau x;
    private final afbm y;
    private PorterDuffColorFilter z;

    static {
        new afli((byte[]) null).i(0.0f);
        Paint paint = new Paint(1);
        n = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        o = new afbd[4];
        int i = 0;
        while (true) {
            afbd[] afbdVarArr = o;
            int length = afbdVarArr.length;
            if (i >= 4) {
                return;
            }
            afbdVarArr[i] = new afbd(i);
            i++;
        }
    }

    protected afbe(afbc afbcVar) {
        this.I = new abpi(this);
        this.b = new afbt[4];
        this.c = new afbt[4];
        this.d = new BitSet(8);
        this.p = new Matrix();
        this.g = new Path();
        this.q = new Path();
        this.r = new RectF();
        this.s = new RectF();
        this.t = new Region();
        this.u = new Region();
        Paint paint = new Paint(1);
        this.v = paint;
        Paint paint2 = new Paint(1);
        this.w = paint2;
        this.x = new afau();
        this.y = afbm.a();
        this.B = new RectF();
        this.C = true;
        this.D = true;
        this.i = new blf[4];
        this.a = afbcVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        J();
        I(getState());
        this.H = new abpi(this);
    }

    private final RectF A() {
        RectF rectF = this.s;
        rectF.set(k());
        float fE = e();
        rectF.inset(fE, fE);
        return rectF;
    }

    private final void B(RectF rectF, Path path) {
        this.y.c(this.a.a.a(), this.j, this.a.k, rectF, this.H, path);
        if (this.a.j != 1.0f) {
            Matrix matrix = this.p;
            matrix.reset();
            float f = this.a.j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.B, true);
    }

    private final void C(Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w(m, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.a.s != 0) {
            canvas.drawPath(this.g, this.x.e);
        }
        for (int i = 0; i < 4; i++) {
            afbt[] afbtVarArr = this.b;
            afau afauVar = this.x;
            afbtVarArr[i].c(afauVar, this.a.r, canvas);
            this.c[i].c(afauVar, this.a.r, canvas);
        }
        if (this.C) {
            int iH = h();
            int i2 = i();
            canvas.translate(-iH, -i2);
            canvas.drawPath(this.g, n);
            canvas.translate(iH, i2);
        }
    }

    private final void D(Canvas canvas, Paint paint, Path path, afbk afbkVar, float[] fArr, RectF rectF) {
        float fB = b(rectF, afbkVar, fArr);
        if (fB < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = fB * this.a.k;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    private final void E(int[] iArr, boolean z) {
        boolean z2;
        boolean z3;
        RectF rectFK = k();
        if (!this.a.a.d() || rectFK.isEmpty()) {
            return;
        }
        boolean z4 = z | (this.F == null);
        if (this.j == null) {
            this.j = new float[4];
        }
        afbk afbkVarB = this.a.a.b(iArr);
        float[] fArr = this.j;
        int length = fArr.length;
        float f = fArr[0];
        int i = 1;
        while (true) {
            int length2 = fArr.length;
            if (i >= 4) {
                if (afbkVarB.f(k())) {
                    z2 = true;
                    break;
                }
            } else if (fArr[i] == f) {
                i++;
            }
            z2 = false;
            break;
        }
        this.D = z2;
        if (!z2) {
            this.e = true;
            this.f = true;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            float fA = afbm.b(i2, afbkVarB).a(rectFK);
            if (z4) {
                this.j[i2] = fA;
                z3 = true;
            } else {
                z3 = false;
            }
            blf blfVar = this.i[i2];
            if (blfVar != null) {
                blfVar.i(fA);
                if (z3) {
                    this.i[i2].k();
                }
            }
        }
        if (z4) {
            invalidateSelf();
        }
    }

    private final boolean F() {
        afbc afbcVar = this.a;
        int i = afbcVar.q;
        if (i == 1 || afbcVar.r <= 0) {
            return false;
        }
        return i == 2 || !(y() || this.g.isConvex() || Build.VERSION.SDK_INT >= 29);
    }

    private final boolean G() {
        return (this.a.v == Paint.Style.FILL_AND_STROKE || this.a.v == Paint.Style.STROKE) && this.w.getStrokeWidth() > 0.0f;
    }

    private final boolean H() {
        return F() || !y();
    }

    private final boolean I(int[] iArr) {
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        boolean z = false;
        if (this.a.d != null && color2 != (colorForState2 = this.a.d.getColorForState(iArr, (color2 = (paint2 = this.v).getColor())))) {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.a.e == null || color == (colorForState = this.a.e.getColorForState(iArr, (color = (paint = this.w).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    private final boolean J() {
        PorterDuffColorFilter porterDuffColorFilter = this.z;
        PorterDuffColorFilter porterDuffColorFilter2 = this.A;
        afbc afbcVar = this.a;
        this.z = a(afbcVar.g, afbcVar.h, this.v, true);
        afbc afbcVar2 = this.a;
        this.A = a(afbcVar2.f, afbcVar2.h, this.w, false);
        boolean z = this.a.u;
        return (Objects.equals(porterDuffColorFilter, this.z) && Objects.equals(porterDuffColorFilter2, this.A)) ? false : true;
    }

    private final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = g(colorForState);
            }
            this.h = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z) {
            int color = paint.getColor();
            int iG = g(color);
            this.h = iG;
            if (iG != color) {
                return new PorterDuffColorFilter(iG, PorterDuff.Mode.SRC_IN);
            }
        }
        return null;
    }

    public final float b(RectF rectF, afbk afbkVar, float[] fArr) {
        if (fArr == null) {
            if (afbkVar.f(rectF)) {
                return afbkVar.b.a(rectF);
            }
        } else if (this.D) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final float c() {
        float[] fArr = this.j;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFK = k();
        return (((l().b.a(rectFK) + l().e.a(rectFK)) - l().d.a(rectFK)) - afbm.b(0, l()).a(rectFK)) / 2.0f;
    }

    @Override // defpackage.afbv
    public final void d(afbk afbkVar) {
        this.a.a = afbkVar;
        this.j = null;
        this.G = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.v;
        paint.setColorFilter(this.z);
        int alpha = paint.getAlpha();
        int i = this.a.m;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.w;
        paint2.setColorFilter(this.A);
        paint2.setStrokeWidth(this.a.l);
        int alpha2 = paint2.getAlpha();
        int i2 = this.a.m;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean zH = H();
        if (this.a.v == Paint.Style.FILL_AND_STROKE || this.a.v == Paint.Style.FILL) {
            if (this.e) {
                if (zH) {
                    B(k(), this.g);
                }
                this.e = false;
            }
            if (F()) {
                canvas.save();
                canvas.translate(h(), i());
                if (this.C) {
                    Rect bounds = getBounds();
                    RectF rectF = this.B;
                    float fWidth = rectF.width() - bounds.width();
                    int iHeight = (int) (rectF.height() - bounds.height());
                    int i3 = (int) fWidth;
                    if (i3 < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path. extra width: " + i3 + " extra height: " + iHeight + " path bounds: " + String.valueOf(rectF));
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) rectF.width()) + (this.a.r << 1) + i3, ((int) rectF.height()) + (this.a.r << 1) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f = (bounds.left - this.a.r) - i3;
                    float f2 = (bounds.top - this.a.r) - iHeight;
                    canvas2.translate(-f, -f2);
                    C(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f, f2, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    C(canvas);
                    canvas.restore();
                }
            }
            D(canvas, paint, this.g, this.a.a.a(), this.j, k());
        }
        if (G()) {
            if (this.f) {
                afbk afbkVarL = l();
                abpi abpiVar = this.I;
                afli afliVar = new afli(afbkVarL);
                afliVar.d = abpiVar.g(afbkVarL.b);
                afliVar.k = abpiVar.g(afbkVarL.c);
                afliVar.b = abpiVar.g(afbkVarL.e);
                afliVar.f = abpiVar.g(afbkVarL.d);
                this.E = new afbk(afliVar);
                if (this.j != null) {
                    if (this.G == null) {
                        this.G = new float[4];
                    }
                    float fE = e();
                    int i4 = 0;
                    while (true) {
                        float[] fArr = this.j;
                        int length = fArr.length;
                        if (i4 >= 4) {
                            break;
                        }
                        this.G[i4] = Math.max(0.0f, fArr[i4] - fE);
                        i4++;
                    }
                } else {
                    this.G = null;
                }
                if (zH) {
                    this.y.c(this.E, this.G, this.a.k, A(), null, this.q);
                }
                this.f = false;
            }
            m(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final float e() {
        if (G()) {
            return this.w.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float f() {
        afbc afbcVar = this.a;
        float f = afbcVar.o;
        float f2 = afbcVar.p;
        return f + 0.0f;
    }

    protected final int g(int i) {
        float f = f();
        afbc afbcVar = this.a;
        float f2 = f + afbcVar.n;
        aewq aewqVar = afbcVar.b;
        return aewqVar != null ? aewqVar.a(i, f2) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.m;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.a.q != 2) {
            RectF rectFK = k();
            if (rectFK.isEmpty()) {
                return;
            }
            float fB = b(rectFK, this.a.a.a(), this.j);
            if (fB >= 0.0f) {
                outline.setRoundRect(getBounds(), fB * this.a.k);
                return;
            }
            if (this.e) {
                B(rectFK, this.g);
                this.e = false;
            }
            afba.E(outline, this.g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.a.i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Region region = this.t;
        region.set(getBounds());
        RectF rectFK = k();
        Path path = this.g;
        B(rectFK, path);
        Region region2 = this.u;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final int h() {
        afbc afbcVar = this.a;
        double d = afbcVar.s;
        int i = afbcVar.t;
        return (int) (d * 0.0d);
    }

    public final int i() {
        afbc afbcVar = this.a;
        double d = afbcVar.s;
        int i = afbcVar.t;
        return (int) (d * 1.0d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.e = true;
        this.f = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.a.g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.a.f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.a.e) != null && colorStateList3.isStateful()) || (((colorStateList4 = this.a.d) != null && colorStateList4.isStateful()) || this.a.a.d())));
    }

    public final ColorStateList j() {
        return this.a.d;
    }

    public final RectF k() {
        RectF rectF = this.r;
        rectF.set(getBounds());
        return rectF;
    }

    public final afbk l() {
        return this.a.a.a();
    }

    protected void m(Canvas canvas) {
        D(canvas, this.w, this.q, this.E, this.G, A());
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.a = new afbc(this.a);
        return this;
    }

    public final void n(Context context) {
        this.a.b = new aewq(context);
        x();
    }

    public final void o(blg blgVar) {
        if (this.F == blgVar) {
            return;
        }
        this.F = blgVar;
        int i = 0;
        while (true) {
            blf[] blfVarArr = this.i;
            int length = blfVarArr.length;
            if (i >= 4) {
                E(getState(), true);
                invalidateSelf();
                return;
            }
            if (blfVarArr[i] == null) {
                blfVarArr[i] = new blf(this, o[i]);
            }
            blf blfVar = this.i[i];
            blg blgVar2 = new blg();
            blgVar2.c((float) blgVar.b);
            double d = blgVar.a;
            blgVar2.e((float) (d * d));
            blfVar.p = blgVar2;
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.e = true;
        this.f = true;
        super.onBoundsChange(rect);
        if (!this.a.a.d() || rect.isEmpty()) {
            return;
        }
        int[] state = getState();
        blf[] blfVarArr = this.i;
        int length = blfVarArr.length;
        boolean z = false;
        for (int i = 0; i < 4; i++) {
            blf blfVar = blfVarArr[i];
            if (blfVar != null && blfVar.l) {
                z = true;
                break;
            }
        }
        E(state, !z);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        if (this.a.a.d()) {
            E(iArr, false);
        }
        boolean z = I(iArr) || J();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final void p(float f) {
        afbc afbcVar = this.a;
        if (afbcVar.o != f) {
            afbcVar.o = f;
            x();
        }
    }

    public final void q(ColorStateList colorStateList) {
        afbc afbcVar = this.a;
        if (afbcVar.d != colorStateList) {
            afbcVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void r(float f) {
        afbc afbcVar = this.a;
        if (afbcVar.k != f) {
            afbcVar.k = f;
            this.e = true;
            this.f = true;
            invalidateSelf();
        }
    }

    public final void s(afbj afbjVar) {
        if (afbjVar instanceof afbk) {
            d((afbk) afbjVar);
            return;
        }
        afbw afbwVar = (afbw) afbjVar;
        afbc afbcVar = this.a;
        if (afbcVar.a != afbwVar) {
            afbcVar.a = afbwVar;
            E(getState(), true);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        afbc afbcVar = this.a;
        if (afbcVar.m != i) {
            afbcVar.m = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.c = colorFilter;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.a.g = colorStateList;
        J();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        afbc afbcVar = this.a;
        if (afbcVar.h != mode) {
            afbcVar.h = mode;
            J();
            super.invalidateSelf();
        }
    }

    public final void t(float f, int i) {
        w(f);
        u(ColorStateList.valueOf(i));
    }

    public final void u(ColorStateList colorStateList) {
        afbc afbcVar = this.a;
        if (afbcVar.e != colorStateList) {
            afbcVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public final void v(ColorStateList colorStateList) {
        this.a.f = colorStateList;
        J();
        super.invalidateSelf();
    }

    public final void w(float f) {
        this.a.l = f;
        invalidateSelf();
    }

    public final void x() {
        float f = f();
        this.a.r = (int) Math.ceil(0.75f * f);
        this.a.s = (int) Math.ceil(f * 0.25f);
        J();
        if (H()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean y() {
        if (this.a.a.b(getState()).f(k())) {
            return this.j == null || this.D;
        }
        return false;
    }

    public final void z() {
        afbc afbcVar = this.a;
        if (afbcVar.q != 2) {
            afbcVar.q = 2;
            super.invalidateSelf();
        }
    }

    public afbe() {
        this(new afbk());
    }

    public afbe(afbj afbjVar) {
        this(new afbc(afbjVar));
    }

    public afbe(afbk afbkVar) {
        this(new afbc(afbkVar));
    }
}

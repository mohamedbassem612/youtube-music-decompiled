package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class mng extends mfj {
    private static final agrf a = agrf.h("com/google/android/libraries/elements/converters/imageprocessor/BorderImageProcessorDrawable");
    private final Paint b;
    private final float c;
    private final float d;
    private final boolean e;
    private final int f;
    private final agev g;
    private final Path h;
    public boolean q;
    mnh r;
    public nei s;
    public Paint t;

    public mng(Bitmap bitmap, ImageView.ScaleType scaleType, float f, int i, float f2, boolean z, nuc nucVar, agev agevVar) {
        super(bitmap, scaleType, nucVar, agevVar);
        this.q = false;
        this.h = new Path();
        this.e = z;
        this.c = f;
        this.d = f2;
        Paint paint = new Paint();
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(f);
        this.f = (int) (f * 0.5f);
        this.g = agevVar;
        this.m = bitmap;
    }

    private final void a(Canvas canvas) {
        Shader shader;
        Shader shader2;
        Shader shader3;
        Shader shader4;
        BitmapShader bitmapShader = new BitmapShader(this.m, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        bitmapShader.setLocalMatrix(this.i);
        Paint paint = this.j;
        paint.setShader(bitmapShader);
        if (this.e) {
            RectF rectF = this.k;
            float fMin = Math.min(rectF.width() * 0.5f, rectF.height() * 0.5f);
            Paint paint2 = this.t;
            if (paint2 != null) {
                canvas.drawCircle(rectF.centerX(), rectF.centerY(), fMin, paint2);
            }
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), fMin, paint);
            mnh mnhVar = this.r;
            if (mnhVar != null && (shader4 = mnhVar.a) != null) {
                paint.setShader(shader4);
                canvas.drawCircle(rectF.centerX(), rectF.centerY(), fMin, paint);
            }
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), fMin, this.b);
            return;
        }
        float f = this.d;
        if (f <= 0.5f) {
            Paint paint3 = this.t;
            if (paint3 != null) {
                canvas.drawRect(this.k, paint3);
            }
            RectF rectF2 = this.k;
            canvas.drawRect(rectF2, paint);
            mnh mnhVar2 = this.r;
            if (mnhVar2 != null && (shader = mnhVar2.a) != null) {
                paint.setShader(shader);
                canvas.drawRect(rectF2, paint);
            }
            if (this.c > 0.5f) {
                canvas.drawRect(rectF2, this.b);
                return;
            }
            return;
        }
        boolean zE = e();
        Paint paint4 = this.t;
        if (zE) {
            if (paint4 != null) {
                canvas.drawRoundRect(this.k, f, f, paint4);
            }
            RectF rectF3 = this.k;
            canvas.drawRoundRect(rectF3, f, f, paint);
            mnh mnhVar3 = this.r;
            if (mnhVar3 != null && (shader3 = mnhVar3.a) != null) {
                paint.setShader(shader3);
                canvas.drawRoundRect(rectF3, f, f, paint);
            }
            if (this.c > 0.5f) {
                canvas.drawRoundRect(rectF3, f, f, this.b);
                return;
            }
            return;
        }
        if (paint4 != null) {
            canvas.drawPath(this.h, paint4);
        }
        Path path = this.h;
        canvas.drawPath(path, paint);
        mnh mnhVar4 = this.r;
        if (mnhVar4 != null && (shader2 = mnhVar4.a) != null) {
            paint.setShader(shader2);
            canvas.drawPath(path, paint);
        }
        if (this.c > 0.5f) {
            canvas.drawPath(path, this.b);
        }
    }

    private final boolean f() {
        return getLayoutDirection() == 1;
    }

    @Override // defpackage.mfj
    protected final void b(Rect rect) {
        Rect rect2 = new Rect(rect);
        int i = this.f;
        rect2.inset(i, i);
        super.b(rect2);
        mnh mnhVar = this.r;
        if (mnhVar != null) {
            mnhVar.d(this.k, f(), this.n);
        }
        if (e()) {
            return;
        }
        d();
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, myi] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, myi] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, myi] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, myi] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, myi] */
    public final void c(myj myjVar, DisplayMetrics displayMetrics, nsl nslVar) {
        float[] fArr;
        int i;
        PointF pointF;
        PointF pointF2;
        if (myjVar.j() == 0) {
            this.o.c(aslh.LOG_TYPE_MISSING_FIELD, nslVar, "BorderImageProcessorDrawable Linear Gradient colors is null and linear gradient cannot be applied", new Object[0]);
            return;
        }
        if (myjVar.j() < 2) {
            this.o.c(aslh.LOG_TYPE_INVALID_FIELD, nslVar, "BorderImageProcessorDrawable There should be minimum 2 colors to apply linear gradient", new Object[0]);
            return;
        }
        if (myjVar.m() && myjVar.l().i() != myjVar.l().j()) {
            this.o.c(aslh.LOG_TYPE_MISSING_FIELD, nslVar, "BorderImageProcessorDrawable LinearGradient line should have both start and end values to apply linear gradient", new Object[0]);
            return;
        }
        agev agevVarI = myjVar.m() ? agev.i(myjVar.l()) : agdf.a;
        if (myjVar.k() > 0) {
            float[] fArr2 = new float[myjVar.k()];
            for (int i2 = 0; i2 < myjVar.k(); i2++) {
                fArr2[i2] = myjVar.h(i2);
            }
            fArr = fArr2;
        } else {
            fArr = null;
        }
        int[] iArr = new int[myjVar.j()];
        for (int i3 = 0; i3 < myjVar.j(); i3++) {
            iArr[i3] = myjVar.i(i3);
        }
        if (agevVarI.g() && agevVarI.c().j() && agevVarI.c().i()) {
            ndq ndqVarH = agevVarI.c().h();
            ndq ndqVarG = agevVarI.c().g();
            if (agevVarI.c().k() - 1 != 1) {
                pointF = new PointF(ndqVarH.ap(), ndqVarH.aq());
                pointF2 = new PointF(ndqVarG.ap(), ndqVarG.aq());
                i = 1;
            } else {
                pointF = new PointF(TypedValue.applyDimension(1, ndqVarH.ap(), displayMetrics), TypedValue.applyDimension(1, ndqVarH.aq(), displayMetrics));
                pointF2 = new PointF(TypedValue.applyDimension(1, ndqVarG.ap(), displayMetrics), TypedValue.applyDimension(1, ndqVarG.aq(), displayMetrics));
                i = 2;
            }
        } else {
            i = 1;
            pointF = null;
            pointF2 = null;
        }
        mnh mnhVar = new mnh(myjVar.g(), pointF, pointF2, iArr, fArr, i, this.o);
        this.r = mnhVar;
        mnhVar.d(this.k, f(), this.n);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x008d  */
    public final void d() {
        if (this.s != null) {
            float[] fArr = new float[8];
            boolean zF = f();
            Path path = this.h;
            path.reset();
            if (this.s.aA()) {
                float f = this.d;
                fArr[0] = f;
                fArr[1] = f;
            } else {
                nei neiVar = this.s;
                if (zF ? neiVar.az() : neiVar.aC()) {
                    float f2 = this.d;
                    fArr[0] = f2;
                    fArr[1] = f2;
                }
            }
            if (this.s.aB()) {
                float f3 = this.d;
                fArr[2] = f3;
                fArr[3] = f3;
            } else {
                nei neiVar2 = this.s;
                if (zF ? neiVar2.aC() : neiVar2.az()) {
                    float f4 = this.d;
                    fArr[2] = f4;
                    fArr[3] = f4;
                }
            }
            if (this.s.ax()) {
                float f5 = this.d;
                fArr[4] = f5;
                fArr[5] = f5;
            } else {
                nei neiVar3 = this.s;
                if (zF ? neiVar3.ay() : neiVar3.av()) {
                    float f6 = this.d;
                    fArr[4] = f6;
                    fArr[5] = f6;
                }
            }
            if (this.s.aw()) {
                float f7 = this.d;
                fArr[6] = f7;
                fArr[7] = f7;
            } else {
                nei neiVar4 = this.s;
                if (zF ? neiVar4.av() : neiVar4.ay()) {
                    float f8 = this.d;
                    fArr[6] = f8;
                    fArr[7] = f8;
                }
            }
            path.addRoundRect(this.k, fArr, Path.Direction.CW);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.mfj, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean zIsHardwareAccelerated = canvas.isHardwareAccelerated();
        agev agevVar = this.g;
        if (((agevVar.g() && ((nub) agevVar.c()).b) || this.q) && !zIsHardwareAccelerated && this.m.getConfig() == Bitmap.Config.HARDWARE) {
            Bitmap bitmapCopy = this.m.copy(this.p ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565, false);
            if (bitmapCopy != null) {
                this.m = bitmapCopy;
            } else {
                ((agrc) ((agrc) a.c()).k("com/google/android/libraries/elements/converters/imageprocessor/BorderImageProcessorDrawable", "maybeReplaceHardwareBitmap", 361, "BorderImageProcessorDrawable.java")).t("draw: copy failed");
            }
        }
        if (!agevVar.g() || !((nub) agevVar.c()).a) {
            a(canvas);
            return;
        }
        try {
            a(canvas);
        } catch (RuntimeException e) {
            boolean zIsHardwareAccelerated2 = canvas.isHardwareAccelerated();
            String strValueOf = String.valueOf(String.valueOf(this.l));
            String str = (((("BorderImageProcessorDrawable context, scaleType: ".concat(strValueOf) + " borderWidthPx: " + this.c) + " color: " + this.b.getColor()) + " radiusPx: " + this.d) + " circular: " + this.e) + " isHardwareAccelerated: " + zIsHardwareAccelerated2;
            nuc nucVar = this.o;
            String strConcat = "BorderImageProcessor context at crash: ".concat(str);
            nucVar.c(aslh.LOG_TYPE_INTERNAL_DEBUG_WARNING, nsl.a, "BorderImageProcessorDrawable failed to draw. %s", strConcat);
            throw new IllegalArgumentException(strConcat, e);
        }
    }

    public final boolean e() {
        nei neiVar = this.s;
        if (neiVar == null) {
            return true;
        }
        if (!neiVar.aI() && !this.s.aJ() && !this.s.aF() && !this.s.aE() && !this.s.aK() && !this.s.aH() && !this.s.aG() && !this.s.aD()) {
            return true;
        }
        if (this.s.aA() && this.s.aB() && this.s.ax() && this.s.aw()) {
            return true;
        }
        return this.s.aC() && this.s.az() && this.s.ay() && this.s.av();
    }

    @Override // defpackage.mfj, android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.d > 0.0f) {
            return -3;
        }
        return super.getOpacity();
    }
}

package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.widget.ImageView;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner;
import java.util.concurrent.atomic.AtomicBoolean;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class otu extends ouj implements Drawable.Callback {
    private float B;
    private volatile Context C;
    private ImageView.ScaleType D;
    private int E;
    private Matrix F;
    private Matrix G;
    private int H;
    private int I;
    private final RectF J;
    private final RectF K;
    private final sqe L;
    public final oui a;
    public final ElementsServices b;
    public final otw c;
    public volatile Drawable d;
    volatile atjc e;
    public volatile Size f;
    public volatile atjc g;
    public int h;
    public int i;
    public int j;
    public int k;
    public final float l;
    public Context m;
    public otv n;
    final AtomicBoolean o;
    public final kjc p;

    public otu(oui ouiVar, kjc kjcVar, boolean z, boolean z2, ElementsServices elementsServices) {
        super(z, z2);
        this.B = 1.0f;
        this.D = ImageView.ScaleType.FIT_CENTER;
        this.J = new RectF();
        this.K = new RectF();
        this.L = new sqe();
        this.o = new AtomicBoolean(false);
        this.a = ouiVar;
        this.p = kjcVar;
        this.l = elementsServices.a();
        this.b = elementsServices;
        agfr agfrVarS = elementsServices.s();
        this.c = agfrVarS != null ? (otw) agfrVarS.io() : null;
    }

    private final void D() {
        Matrix.ScaleToFit scaleToFit;
        float fMin;
        float f;
        float f2;
        Drawable drawable = this.d;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = ((this.u - this.s) - this.h) - this.j;
            int i2 = ((this.v - this.t) - this.i) - this.k;
            this.H = 0;
            this.I = 0;
            Matrix matrix = null;
            if (intrinsicWidth <= 0 || intrinsicHeight <= 0 || this.D == ImageView.ScaleType.FIT_XY) {
                int i3 = this.h;
                int i4 = this.i;
                drawable.setBounds(i3, i4, i + i3, i2 + i4);
                this.G = null;
                return;
            }
            drawable.setBounds(this.h, this.i, intrinsicWidth - this.j, intrinsicHeight - this.k);
            if (this.D == ImageView.ScaleType.MATRIX) {
                Matrix matrix2 = this.F;
                if (matrix2 != null && !matrix2.isIdentity()) {
                    matrix = this.F;
                }
                this.G = matrix;
                return;
            }
            ImageView.ScaleType scaleType = this.D;
            Matrix matrix3 = this.F;
            if (matrix3 == null) {
                matrix3 = new Matrix();
                this.F = matrix3;
            }
            RectF rectF = this.J;
            RectF rectF2 = this.K;
            sqe sqeVar = this.L;
            sqeVar.c = null;
            sqeVar.b = 0;
            sqeVar.a = 0;
            if (scaleType != ImageView.ScaleType.FIT_XY && (intrinsicWidth != i || intrinsicHeight != i2)) {
                if (scaleType == ImageView.ScaleType.CENTER) {
                    sqeVar.b = Math.round((i - intrinsicWidth) * 0.5f);
                    sqeVar.a = Math.round((i2 - intrinsicHeight) * 0.5f);
                } else {
                    float f3 = intrinsicWidth;
                    float f4 = i;
                    float f5 = intrinsicHeight;
                    float f6 = i2;
                    float f7 = 0.0f;
                    if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                        if (intrinsicWidth * i2 > i * intrinsicHeight) {
                            float f8 = f6 / f5;
                            float f9 = (f4 - (f3 * f8)) * 0.5f;
                            f = f8;
                            f2 = 0.0f;
                            f7 = f9;
                        } else {
                            f = f4 / f3;
                            f2 = (f6 - (f5 * f)) * 0.5f;
                        }
                        matrix3.setScale(f, f);
                        matrix3.postTranslate(Math.round(f7), Math.round(f2));
                        sqeVar.c = matrix3;
                    } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
                        if (intrinsicWidth > i || intrinsicHeight > i2) {
                            fMin = Math.min(f4 / f3, f6 / f5);
                        } else {
                            fMin = 1.0f;
                        }
                        float fRound = Math.round((f4 - (f3 * fMin)) * 0.5f);
                        float fRound2 = Math.round((f6 - (f5 * fMin)) * 0.5f);
                        matrix3.setScale(fMin, fMin);
                        matrix3.postTranslate(fRound, fRound2);
                        sqeVar.c = matrix3;
                    } else {
                        rectF.set(0.0f, 0.0f, f3, f5);
                        rectF2.set(0.0f, 0.0f, f4, f6);
                        int i5 = ots.a[scaleType.ordinal()];
                        if (i5 == 1) {
                            scaleToFit = Matrix.ScaleToFit.FILL;
                        } else if (i5 == 2) {
                            scaleToFit = Matrix.ScaleToFit.START;
                        } else if (i5 == 3) {
                            scaleToFit = Matrix.ScaleToFit.CENTER;
                        } else {
                            if (i5 != 4) {
                                throw new IllegalArgumentException("Unexpected ScaleType for ScaleToFit: ".concat(String.valueOf(String.valueOf(scaleType))));
                            }
                            scaleToFit = Matrix.ScaleToFit.END;
                        }
                        matrix3.setRectToRect(rectF, rectF2, scaleToFit);
                        sqeVar.c = matrix3;
                    }
                }
            }
            this.G = (Matrix) sqeVar.c;
            this.H = sqeVar.b;
            this.I = sqeVar.a;
        }
    }

    private final synchronized boolean E() {
        return this.n != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Drawable drawable) {
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setCallback(null);
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void b(Canvas canvas) {
        Context context = this.C;
        atjc atjcVar = this.g;
        boolean z = false;
        if (atjcVar != null && context != null) {
            h(context, atjcVar, false);
        }
        int i = this.s;
        int i2 = this.t;
        int i3 = this.u;
        int i4 = this.v;
        if (this.x) {
            oul oulVar = this.y;
            if (oulVar != null) {
                oulVar.t(i, i2, i3, i4);
                this.y.b(canvas);
            }
            ouv ouvVar = this.A;
            if (ouvVar != null) {
                ouvVar.t(i, i2, i3, i4);
                this.A.b(canvas);
            }
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            float f = this.s + this.H;
            float f2 = this.t + this.I;
            if (f != 0.0f || f2 != 0.0f) {
                canvas.translate(f, f2);
                z = true;
            }
            if (this.G == null) {
                drawable.draw(canvas);
            } else {
                int saveCount = canvas.getSaveCount();
                canvas.save();
                Matrix matrix = this.G;
                if (matrix != null) {
                    canvas.concat(matrix);
                }
                drawable.draw(canvas);
                canvas.restoreToCount(saveCount);
            }
            if (z) {
                canvas.translate(-f, -f2);
            }
        }
        int i5 = this.s;
        int i6 = this.t;
        int i7 = this.u;
        int i8 = this.v;
        oum oumVar = this.z;
        if (oumVar != null) {
            oumVar.t(i5, i6, i7, i8);
            this.z.b(canvas);
        }
    }

    @Override // defpackage.ouj
    public final void c() {
        D();
    }

    @Override // defpackage.ouj, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        Context context;
        if (!this.o.getAndSet(true)) {
            if (Memory.peekByte(FlagServices.b().c + 103) != 0 && this.g != null) {
                this.e = this.g;
            }
            this.g = null;
            this.C = null;
            this.f = null;
            otv otvVar = this.n;
            if (otvVar != null && (context = this.m) != null) {
                if (otvVar.a != null) {
                    if (qpj.g()) {
                        otvVar.i();
                    } else {
                        qpj.e(new ooz(otvVar, 10));
                    }
                }
                oub.a.execute(new msh(context, otvVar, 16));
                this.n = null;
                this.m = null;
            }
            Drawable drawable = this.d;
            if (drawable != null) {
                if (qpj.g()) {
                    a(drawable);
                } else {
                    qpj.e(new ooz(drawable, 11));
                }
                this.d = null;
            }
        }
    }

    public final void d(Context context, atjc atjcVar) {
        this.C = context;
        this.g = atjcVar;
    }

    @Override // defpackage.ouj, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void e(boolean z) {
        if (this.w != z) {
            super.e(z);
            this.E = z ? 1 : 0;
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setLayoutDirection(this.E);
            }
        }
    }

    @Override // defpackage.ouj, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void f(PaintUnitOwner paintUnitOwner) {
        super.f(paintUnitOwner);
        if (paintUnitOwner != null) {
            paintUnitOwner.k(this);
            Context context = this.C;
            atjc atjcVar = this.g;
            if (atjcVar == null || context == null) {
                return;
            }
            h(context, atjcVar, false);
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void g(int i, int i2, int i3, int i4) {
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        D();
    }

    public final void h(Context context, final atjc atjcVar, boolean z) {
        this.C = null;
        this.o.set(false);
        final int i = this.u - this.s;
        final int i2 = this.v - this.t;
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            this.g = null;
            return;
        }
        if (z && Memory.peekByte(FlagServices.b().c + 64) != 0 && (i <= 0 || i2 <= 0)) {
            d(context, atjcVar);
            return;
        }
        if (Memory.peekByte(FlagServices.b().c + 103) != 0) {
            this.g = atjcVar;
        }
        oub.a.execute(new Runnable() { // from class: ott
            /* JADX WARN: Code duplicated, block: B:178:0x02e3  */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x00c0, code lost:
            
                if (((java.lang.Boolean) j$.util.concurrent.ConcurrentMap.EL.computeIfAbsent(defpackage.otk.c, java.lang.Integer.valueOf(r7), new defpackage.iuk(r14, 12))).booleanValue() == false) goto L49;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instruction units count: 945
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ott.run():void");
            }
        });
    }

    @Override // defpackage.ouj, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final boolean i() {
        return true;
    }

    @Override // defpackage.ouj, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final boolean ic() {
        return this.d != null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(Drawable drawable, ImageView.ScaleType scaleType) {
        if (this.o.get()) {
            return;
        }
        Drawable drawable2 = this.d;
        if (drawable2 != 0 && !drawable2.equals(drawable)) {
            if (drawable2 instanceof Animatable) {
                ((Animatable) drawable2).stop();
            }
            drawable2.setCallback(null);
        }
        this.d = drawable;
        this.D = scaleType;
        if (drawable != 0) {
            drawable.setCallback(this);
            drawable.setLayoutDirection(this.E);
            float f = this.B;
            if (f < 1.0f) {
                drawable.setAlpha((int) (f * 255.0f));
            }
            if (!E() && (drawable instanceof Animatable)) {
                Animatable animatable = (Animatable) drawable;
                if (!animatable.isRunning()) {
                    animatable.start();
                }
            }
        }
        D();
        s();
    }

    public final void k(Drawable drawable, ImageView.ScaleType scaleType) {
        if (qpj.g()) {
            j(drawable, scaleType);
        } else {
            if (this.o.get()) {
                return;
            }
            qpj.e(new lez(this, drawable, scaleType, 12));
        }
    }

    public final boolean n() {
        return this.o.get();
    }

    @Override // defpackage.ouj, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final boolean o(float f) {
        this.B = f;
        Drawable drawable = this.d;
        if (drawable == null) {
            return true;
        }
        if (f < 1.0f) {
            drawable.setAlpha((int) (f * 255.0f));
            return true;
        }
        drawable.setAlpha(255);
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        PaintUnitOwner paintUnitOwner = this.q;
        if (paintUnitOwner != null) {
            paintUnitOwner.il(drawable, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        PaintUnitOwner paintUnitOwner = this.q;
        if (paintUnitOwner != null) {
            paintUnitOwner.im(drawable, runnable);
        }
    }
}

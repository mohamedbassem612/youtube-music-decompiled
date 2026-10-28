package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fre extends fkx {

    @fmt(a = 13)
    @fmu(a = fmv.l)
    Drawable a;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    ImageView.ScaleType b;

    public fre() {
        super("Image");
    }

    @Override // defpackage.fgy
    protected final Object C(Context context) {
        int i = frf.a;
        return new fjx();
    }

    @Override // defpackage.fgy
    protected final void E(fiz fizVar, fiz fizVar2) {
        mjy mjyVar = (mjy) fizVar;
        mjy mjyVar2 = (mjy) fizVar2;
        mjyVar.a = mjyVar2.a;
        mjyVar.c = mjyVar2.c;
        mjyVar.b = mjyVar2.b;
    }

    @Override // defpackage.fgy
    protected final void J(fhd fhdVar, Object obj, fiz fizVar) {
        mjy mjyVar = (mjy) fizVar;
        Integer num = mjyVar.b;
        Integer num2 = mjyVar.a;
        int i = frf.a;
        ((fjx) obj).a(num.intValue(), num2.intValue());
    }

    @Override // defpackage.fgy
    protected final void L(fhd fhdVar, Object obj, fiz fizVar) {
        Drawable drawable = this.a;
        Object obj2 = ((mjy) fizVar).c;
        int i = frf.a;
        ((fjx) obj).b(drawable, (fij) obj2);
    }

    @Override // defpackage.fgy
    public final boolean O() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean V() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean Z() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean ab() {
        return true;
    }

    @Override // defpackage.fgy
    protected final boolean ae(fgy fgyVar, fky fkyVar, fgy fgyVar2, fky fkyVar2) {
        fre freVar = (fre) fgyVar;
        fre freVar2 = (fre) fgyVar2;
        fif fifVar = new fif(freVar == null ? null : freVar.b, freVar2 == null ? null : freVar2.b);
        fif fifVar2 = new fif(freVar == null ? null : freVar.a, freVar2 != null ? freVar2.a : null);
        int i = frf.a;
        return (fifVar.b == fifVar.a && gzj.aR((Drawable) fifVar2.b, (Drawable) fifVar2.a)) ? false : true;
    }

    @Override // defpackage.fgy
    public final int af() {
        return 2;
    }

    @Override // defpackage.fgy
    public final void ag(fhd fhdVar, fji fjiVar, fiz fizVar) {
        Integer numValueOf;
        Integer numValueOf2;
        Matrix.ScaleToFit scaleToFit;
        float fMin;
        float f;
        float f2;
        Drawable drawable = this.a;
        ImageView.ScaleType scaleType = this.b;
        int i = frf.a;
        int iD = fjiVar.d() + fjiVar.e();
        int iF = fjiVar.f() + fjiVar.c();
        fij fijVar = null;
        if (ImageView.ScaleType.FIT_XY == scaleType || drawable == null || drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            numValueOf = Integer.valueOf(fjiVar.g() - iD);
            numValueOf2 = Integer.valueOf(fjiVar.b() - iF);
        } else {
            int iG = fjiVar.g() - iD;
            int iB = fjiVar.b() - iF;
            if (scaleType == null) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0 && ImageView.ScaleType.FIT_XY != scaleType && ImageView.ScaleType.MATRIX != scaleType && (iG != intrinsicWidth || iB != intrinsicHeight)) {
                fijVar = new fij();
                boolean z = true;
                if (ImageView.ScaleType.CENTER == scaleType) {
                    fijVar.setTranslate(rpi.p((iG - intrinsicWidth) * 0.5f), rpi.p((iB - intrinsicHeight) * 0.5f));
                    if (intrinsicWidth <= iG && intrinsicHeight <= iB) {
                        z = false;
                    }
                    fijVar.a = z;
                } else {
                    float f3 = intrinsicWidth;
                    float f4 = iG;
                    float f5 = intrinsicHeight;
                    float f6 = iB;
                    float f7 = 0.0f;
                    if (ImageView.ScaleType.CENTER_CROP == scaleType) {
                        if (intrinsicWidth * iB > iG * intrinsicHeight) {
                            f = f6 / f5;
                            f2 = 0.0f;
                            f7 = (f4 - (f3 * f)) * 0.5f;
                        } else {
                            float f8 = f4 / f3;
                            float f9 = (f6 - (f5 * f8)) * 0.5f;
                            f = f8;
                            f2 = f9;
                        }
                        fijVar.setScale(f, f);
                        fijVar.postTranslate(rpi.p(f7), rpi.p(f2));
                        fijVar.a = true;
                    } else if (ImageView.ScaleType.CENTER_INSIDE == scaleType) {
                        if (intrinsicWidth > iG || intrinsicHeight > iB) {
                            fMin = Math.min(f4 / f3, f6 / f5);
                        } else {
                            fMin = 1.0f;
                        }
                        fijVar.setScale(fMin, fMin);
                        fijVar.postTranslate(rpi.p((f4 - (f3 * fMin)) * 0.5f), rpi.p((f6 - (f5 * fMin)) * 0.5f));
                    } else {
                        RectF rectF = new RectF();
                        RectF rectF2 = new RectF();
                        rectF.set(0.0f, 0.0f, f3, f5);
                        rectF2.set(0.0f, 0.0f, f4, f6);
                        int i2 = fii.a[scaleType.ordinal()];
                        if (i2 == 1) {
                            scaleToFit = Matrix.ScaleToFit.FILL;
                        } else if (i2 == 2) {
                            scaleToFit = Matrix.ScaleToFit.START;
                        } else if (i2 == 3) {
                            scaleToFit = Matrix.ScaleToFit.CENTER;
                        } else {
                            if (i2 != 4) {
                                throw new IllegalArgumentException("Only FIT_... values allowed");
                            }
                            scaleToFit = Matrix.ScaleToFit.END;
                        }
                        fijVar.setRectToRect(rectF, rectF2, scaleToFit);
                    }
                }
            }
            numValueOf = Integer.valueOf(drawable.getIntrinsicWidth());
            numValueOf2 = Integer.valueOf(drawable.getIntrinsicHeight());
        }
        mjy mjyVar = (mjy) fizVar;
        mjyVar.c = fijVar;
        mjyVar.b = numValueOf;
        mjyVar.a = numValueOf2;
    }

    @Override // defpackage.fgy
    protected final void ah(fhd fhdVar, fji fjiVar, int i, int i2, fkw fkwVar, fiz fizVar) {
        Drawable drawable = this.a;
        int i3 = frf.a;
        if (drawable == null || drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            fkwVar.a = 0;
            fkwVar.b = 0;
            return;
        }
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (View.MeasureSpec.getMode(i) == 0 && View.MeasureSpec.getMode(i2) == 0) {
            fkwVar.a = intrinsicWidth;
            fkwVar.b = intrinsicHeight;
            return;
        }
        float f = intrinsicWidth;
        float f2 = intrinsicHeight;
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i) > intrinsicWidth) {
            i = View.MeasureSpec.makeMeasureSpec(intrinsicWidth, Integer.MIN_VALUE);
        }
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) > intrinsicHeight) {
            i2 = View.MeasureSpec.makeMeasureSpec(intrinsicHeight, Integer.MIN_VALUE);
        }
        fhz.q(i, i2, f / f2, fkwVar);
    }

    @Override // defpackage.fgy
    protected final void ar(fhd fhdVar, Object obj) {
        int i = frf.a;
        ((fjx) obj).c();
    }

    @Override // defpackage.fgy
    public final boolean g(fgy fgyVar) {
        if (this == fgyVar) {
            return true;
        }
        if (fgyVar != null && getClass() == fgyVar.getClass()) {
            fre freVar = (fre) fgyVar;
            Drawable drawable = this.a;
            if (drawable == null ? freVar.a == null : drawable.equals(freVar.a)) {
                ImageView.ScaleType scaleType = this.b;
                if (scaleType != null) {
                    if (scaleType.equals(freVar.b)) {
                        return true;
                    }
                } else if (freVar.b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.fgy
    protected final int h() {
        return 30;
    }

    @Override // defpackage.fgy
    public final /* bridge */ /* synthetic */ fgy l() {
        return (fre) super.l();
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fiz r() {
        return new mjy();
    }
}

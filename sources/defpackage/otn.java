package defpackage;

import android.graphics.LinearGradient;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class otn {
    public LinearGradient a;
    private final float b;
    private final int[] c;
    private final float[] d;
    private final PointF e;
    private final PointF f;
    private final oui g;
    private final int h;

    public otn(float f, PointF pointF, PointF pointF2, int[] iArr, float[] fArr, int i, oui ouiVar) {
        this.b = f;
        this.c = iArr;
        this.d = fArr;
        this.e = pointF;
        this.f = pointF2;
        this.h = i;
        this.g = ouiVar;
    }

    public final void a(RectF rectF, boolean z, boolean z2) {
        char c;
        PointF pointF;
        PointF pointF2;
        float fAbs;
        float fAbs2;
        LinearGradient linearGradient;
        PointF pointF3;
        float fWidth;
        float fWidth2;
        float fHeight;
        float fHeight2;
        PointF pointF4 = this.e;
        if (pointF4 == null || (pointF3 = this.f) == null) {
            float f = this.b;
            float fCenterX = rectF.centerX();
            double dCenterY = rectF.centerY();
            double d = f + 90.0f;
            double dTan = Math.tan(Math.toRadians(d)) * ((double) fCenterX);
            oui ouiVar = this.g;
            int i = (int) (f / 90.0f);
            int i2 = i % 4;
            if (i2 == 0) {
                c = 0;
                pointF = new PointF(rectF.left, rectF.bottom);
            } else if (i2 == 1) {
                c = 0;
                pointF = new PointF(rectF.left, rectF.top);
            } else if (i2 == 2) {
                c = 0;
                pointF = new PointF(rectF.right, rectF.top);
            } else if (i2 != 3) {
                c = 0;
                ouiVar.a(aslh.LOG_TYPE_INVALID_FIELD, String.format(Locale.US, "Quadrant has to be in the range 0 to 3, but was %d", Integer.valueOf(i2)));
                pointF = new PointF(rectF.left, rectF.bottom);
            } else {
                c = 0;
                pointF = new PointF(rectF.right, rectF.bottom);
            }
            int i3 = (i + 2) % 4;
            double d2 = dCenterY - dTan;
            double dTan2 = Math.tan(Math.toRadians(d));
            double d3 = ((double) pointF.x) * dTan2;
            double d4 = pointF.y;
            double dPow = Math.pow(dTan2, 2.0d) + 1.0d;
            PointF pointF5 = new PointF();
            double d5 = (-((d3 + (-d4)) + d2)) / dPow;
            pointF5.x = (float) (((double) pointF.x) + (dTan2 * d5));
            pointF5.y = (float) (((double) pointF.y) + (-d5));
            if (i3 == 0) {
                pointF2 = new PointF(rectF.left, rectF.bottom);
            } else if (i3 == 1) {
                pointF2 = new PointF(rectF.left, rectF.top);
            } else if (i3 == 2) {
                pointF2 = new PointF(rectF.right, rectF.top);
            } else if (i3 != 3) {
                aslh aslhVar = aslh.LOG_TYPE_INVALID_FIELD;
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                objArr[c] = Integer.valueOf(i3);
                ouiVar.a(aslhVar, String.format(locale, "Quadrant has to be in the range 0 to 3, but was %d", objArr));
                pointF2 = new PointF(rectF.left, rectF.bottom);
            } else {
                pointF2 = new PointF(rectF.right, rectF.bottom);
            }
            double dTan3 = Math.tan(Math.toRadians(d));
            double d6 = (((double) pointF2.x) * dTan3) + (-pointF2.y) + d2;
            double dPow2 = Math.pow(dTan3, 2.0d) + 1.0d;
            PointF pointF6 = new PointF();
            double d7 = (-d6) / dPow2;
            pointF6.x = (float) (((double) pointF2.x) + (dTan3 * d7));
            pointF6.y = (float) (((double) pointF2.y) + (-d7));
            if (z && z2) {
                fAbs = rectF.right - Math.abs(pointF5.x - rectF.left);
                fAbs2 = rectF.right - Math.abs(pointF6.x - rectF.left);
            } else {
                fAbs = pointF5.x;
                fAbs2 = pointF6.x;
            }
            float f2 = fAbs2;
            float f3 = pointF5.y;
            float f4 = pointF6.y;
            int[] iArr = this.c;
            float[] fArr = this.d;
            linearGradient = (fArr == null || iArr.length != fArr.length) ? new LinearGradient(fAbs, f3, f2, f4, iArr, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(fAbs, f3, f2, f4, iArr, fArr, Shader.TileMode.CLAMP);
        } else {
            if (this.h - 1 != 1) {
                if (z && z2) {
                    fWidth = rectF.right - (rectF.width() * pointF4.x);
                    fWidth2 = rectF.right - (rectF.width() * pointF3.x);
                } else {
                    fWidth = rectF.left + (rectF.width() * pointF4.x);
                    fWidth2 = rectF.left + (rectF.width() * pointF3.x);
                }
                fHeight = rectF.top + (rectF.height() * pointF4.y);
                fHeight2 = rectF.top + (rectF.height() * pointF3.y);
            } else {
                if (z && z2) {
                    fWidth = rectF.right - pointF4.x;
                    fWidth2 = rectF.right - pointF3.x;
                } else {
                    fWidth = rectF.left + pointF4.x;
                    fWidth2 = rectF.left + pointF3.x;
                }
                fHeight = rectF.top + pointF4.y;
                fHeight2 = pointF3.y + rectF.top;
            }
            float f5 = fWidth2;
            float f6 = fHeight2;
            float f7 = fWidth;
            float f8 = fHeight;
            int[] iArr2 = this.c;
            float[] fArr2 = this.d;
            linearGradient = (fArr2 == null || iArr2.length != fArr2.length) ? new LinearGradient(f7, f8, f5, f6, iArr2, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(f7, f8, f5, f6, iArr2, fArr2, Shader.TileMode.CLAMP);
        }
        this.a = linearGradient;
    }
}

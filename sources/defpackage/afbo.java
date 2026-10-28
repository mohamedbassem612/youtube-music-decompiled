package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class afbo extends afbt {
    private final afbq a;

    public afbo(afbq afbqVar) {
        this.a = afbqVar;
    }

    @Override // defpackage.afbt
    public final void a(Matrix matrix, afau afauVar, int i, Canvas canvas) {
        afbq afbqVar = this.a;
        float f = afbqVar.e;
        float f2 = afbqVar.f;
        RectF rectF = new RectF(afbqVar.a, afbqVar.b, afbqVar.c, afbqVar.d);
        Path path = afauVar.k;
        if (f2 < 0.0f) {
            int[] iArr = afau.c;
            iArr[0] = 0;
            int i2 = afauVar.j;
            iArr[1] = 0;
            int i3 = afauVar.i;
            iArr[2] = 335544320;
            int i4 = afauVar.h;
            iArr[3] = 1140850688;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = afau.c;
            iArr2[0] = 0;
            int i5 = afauVar.h;
            iArr2[1] = 1140850688;
            int i6 = afauVar.i;
            iArr2[2] = 335544320;
            int i7 = afauVar.j;
            iArr2[3] = 0;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth > 0) {
            float f4 = 1.0f - (i / fWidth);
            float[] fArr = afau.d;
            fArr[1] = f4;
            fArr[2] = f4 + ((1.0f - f4) / 2.0f);
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, afau.c, fArr, Shader.TileMode.CLAMP);
            Paint paint = afauVar.f;
            paint.setShader(radialGradient);
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (f2 >= 0.0f) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, afauVar.l);
            }
            canvas.drawArc(rectF, f, f2, true, paint);
            canvas.restore();
        }
    }
}

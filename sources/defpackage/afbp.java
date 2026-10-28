package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class afbp extends afbt {
    private final afbr a;
    private final float b;
    private final float e;

    public afbp(afbr afbrVar, float f, float f2) {
        this.a = afbrVar;
        this.b = f;
        this.e = f2;
    }

    @Override // defpackage.afbt
    public final void a(Matrix matrix, afau afauVar, int i, Canvas canvas) {
        afbr afbrVar = this.a;
        float f = afbrVar.b;
        float f2 = this.e;
        float f3 = afbrVar.a;
        float f4 = this.b;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = afau.a;
        int i2 = afauVar.j;
        iArr[0] = 0;
        int i3 = afauVar.i;
        iArr[1] = 335544320;
        int i4 = afauVar.h;
        iArr[2] = 1140850688;
        LinearGradient linearGradient = new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, iArr, afau.b, Shader.TileMode.CLAMP);
        Paint paint = afauVar.g;
        paint.setShader(linearGradient);
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    final float b() {
        afbr afbrVar = this.a;
        return (float) Math.toDegrees(Math.atan((afbrVar.b - this.e) / (afbrVar.a - this.b)));
    }
}

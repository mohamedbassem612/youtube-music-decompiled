package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Layout;
import android.text.Spanned;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class msg extends mrr {
    private float a;
    private final float b;
    private final Paint c = new Paint();
    private RectF d;

    public msg(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.mrr
    public final void b(Layout layout, CharSequence charSequence) {
        this.d = new RectF();
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (layout.getLineCount() == 0 || this.a <= 0.0f || !ket.H(layout, spanned)) {
                return;
            }
            this.a = Math.min(this.a, layout.getLineCount());
            int lineCount = layout.getLineCount() - ((int) this.a);
            float lineTop = layout.getLineTop(lineCount);
            float f = this.a;
            float f2 = (int) f;
            if (f != f2 && f > 0.0f) {
                float f3 = f - f2;
                int lineTop2 = layout.getLineTop(lineCount);
                int i = lineCount - 1;
                lineTop -= (lineTop2 - layout.getLineTop(i)) - ((1.0f - f3) * (layout.getLineBottom(i) - layout.getLineTop(i)));
            }
            float lineLeft = layout.getLineLeft(0);
            float width = layout.getWidth();
            float lineBottom = layout.getLineBottom(layout.getLineCount() - 1);
            float f4 = this.b;
            this.d = new RectF(lineLeft, lineTop - f4, width, lineBottom - f4);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, -16777216, Shader.TileMode.CLAMP);
            Matrix matrix = new Matrix();
            matrix.setScale(1.0f, this.d.height());
            matrix.postTranslate(0.0f, this.d.top);
            linearGradient.setLocalMatrix(matrix);
            Paint paint = this.c;
            paint.setShader(linearGradient);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
    }

    @Override // defpackage.mrr
    public final void c() {
        this.d = new RectF();
    }

    @Override // defpackage.mrr
    public final void d(Canvas canvas) {
        if (this.d.isEmpty()) {
            return;
        }
        canvas.drawRect(this.d, this.c);
    }

    @Override // defpackage.mrr
    public final boolean e(int i, int i2) {
        return !this.d.isEmpty() && this.d.contains((float) i, (float) i2);
    }

    @Override // defpackage.mrr
    public final boolean f() {
        return true;
    }
}

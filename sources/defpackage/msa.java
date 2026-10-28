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
public final class msa extends mrr {
    private final float a;
    private final float b;
    private final Paint c = new Paint();
    private final boolean d;
    private RectF e;

    public msa(boolean z, float f, float f2) {
        this.d = z;
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.mrr
    public final void b(Layout layout, CharSequence charSequence) {
        float primaryHorizontal;
        float primaryHorizontal2;
        this.e = new RectF();
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (layout.getLineCount() == 0 || !ket.H(layout, spanned)) {
                return;
            }
            fur[] furVarArr = (fur[]) spanned.getSpans(0, spanned.length(), fur.class);
            int spanStart = furVarArr.length > 0 ? spanned.getSpanStart(furVarArr[0]) : layout.getLineStart(layout.getLineCount() - 1) + layout.getEllipsisStart(layout.getLineCount() - 1);
            int lineForOffset = layout.getLineForOffset(spanStart);
            float lineTop = layout.getLineTop(lineForOffset);
            float lineBottom = layout.getLineBottom(lineForOffset);
            int lineEnd = layout.getLineEnd(layout.getLineCount() - 1) - 1;
            boolean z = this.d;
            int iMin = Math.min(lineEnd, spanStart);
            if (z) {
                primaryHorizontal = layout.getPrimaryHorizontal(iMin);
                primaryHorizontal2 = this.b + primaryHorizontal + this.a;
            } else {
                primaryHorizontal2 = layout.getPrimaryHorizontal(iMin);
                primaryHorizontal = (primaryHorizontal2 - this.b) - this.a;
            }
            this.e = new RectF(primaryHorizontal, lineTop, primaryHorizontal2, lineBottom);
            float f = this.a;
            float f2 = this.b + f;
            float f3 = f / f2;
            LinearGradient linearGradient = !z ? new LinearGradient(0.0f, 0.0f, f3, 0.0f, 0, -16777216, Shader.TileMode.CLAMP) : new LinearGradient(1.0f, 0.0f, 1.0f - f3, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
            Paint paint = this.c;
            paint.setShader(linearGradient);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            Matrix matrix = new Matrix();
            matrix.setScale(f2, 1.0f);
            matrix.postTranslate(this.e.left, 0.0f);
            linearGradient.setLocalMatrix(matrix);
        }
    }

    @Override // defpackage.mrr
    public final void c() {
        this.e = new RectF();
    }

    @Override // defpackage.mrr
    public final void d(Canvas canvas) {
        if (this.e.isEmpty()) {
            return;
        }
        canvas.drawRect(this.e, this.c);
    }

    @Override // defpackage.mrr
    public final boolean e(int i, int i2) {
        return !this.e.isEmpty() && this.e.contains((float) i, (float) i2);
    }

    @Override // defpackage.mrr
    public final boolean f() {
        return true;
    }
}

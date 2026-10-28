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
public final class oxz extends oxw {
    private final float a;
    private final float b;
    private final Paint c = new Paint();
    private RectF d;

    public oxz(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.oxw
    public final void a(Canvas canvas) {
        if (this.d.isEmpty()) {
            return;
        }
        canvas.drawRect(this.d, this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oxw
    public final void c(Layout layout, CharSequence charSequence) {
        float primaryHorizontal;
        float primaryHorizontal2;
        this.d = new RectF();
        if ((charSequence instanceof Spanned) && layout.getLineCount() != 0 && nuz.a(layout, charSequence)) {
            oyb[] oybVarArr = (oyb[]) charSequence.getSpans(0, charSequence.length(), oyb.class);
            int spanStart = oybVarArr.length > 0 ? charSequence.getSpanStart(oybVarArr[0]) : layout.getLineStart(layout.getLineCount() - 1) + layout.getEllipsisStart(layout.getLineCount() - 1);
            int lineForOffset = layout.getLineForOffset(spanStart);
            boolean z = layout.getParagraphDirection(lineForOffset) == -1;
            float lineTop = layout.getLineTop(lineForOffset);
            float lineBottom = layout.getLineBottom(lineForOffset);
            int iMin = Math.min(layout.getLineEnd(layout.getLineCount() - 1) - 1, spanStart);
            if (z) {
                primaryHorizontal = layout.getPrimaryHorizontal(iMin);
                primaryHorizontal2 = this.b + primaryHorizontal + this.a;
            } else {
                primaryHorizontal2 = layout.getPrimaryHorizontal(iMin);
                primaryHorizontal = (primaryHorizontal2 - this.b) - this.a;
            }
            this.d = new RectF(primaryHorizontal, lineTop, primaryHorizontal2, lineBottom);
            float f = this.a;
            float f2 = this.b + f;
            float f3 = f / f2;
            LinearGradient linearGradient = !z ? new LinearGradient(0.0f, 0.0f, f3, 0.0f, 0, -16777216, Shader.TileMode.CLAMP) : new LinearGradient(1.0f, 0.0f, 1.0f - f3, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
            Paint paint = this.c;
            paint.setShader(linearGradient);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            Matrix matrix = new Matrix();
            matrix.setScale(f2, 1.0f);
            matrix.postTranslate(this.d.left, 0.0f);
            linearGradient.setLocalMatrix(matrix);
        }
    }

    @Override // defpackage.oxw
    public final void d() {
        this.d = new RectF();
    }

    @Override // defpackage.oxw
    public final boolean e() {
        return true;
    }
}

package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class blp extends ReplacementSpan {
    public final blm a;
    private final Paint.FontMetricsInt b = new Paint.FontMetricsInt();
    private short c = -1;
    private float d = 1.0f;

    public blp(blm blmVar) {
        azs.m(blmVar, "metadata cannot be null");
        this.a = blmVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        bll.b();
        blm blmVar = this.a;
        dep depVar = blmVar.c;
        Object obj = depVar.c;
        Typeface typeface = paint.getTypeface();
        paint.setTypeface((Typeface) obj);
        canvas.drawText((char[]) depVar.d, blmVar.a << 1, 2, f, i4, paint);
        paint.setTypeface(typeface);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        short s;
        Paint.FontMetricsInt fontMetricsInt2 = this.b;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent);
        blm blmVar = this.a;
        this.d = fAbs / blmVar.d();
        blmVar.d();
        dqp dqpVarE = blmVar.e();
        int iA = dqpVarE.a(12);
        if (iA != 0) {
            s = ((ByteBuffer) dqpVarE.c).getShort(iA + dqpVarE.a);
        } else {
            s = 0;
        }
        this.c = (short) (s * this.d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return this.c;
    }
}

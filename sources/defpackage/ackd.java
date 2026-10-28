package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ackd extends ReplacementSpan {
    public final Paint a;
    public boolean b;
    private float c;

    public ackd() {
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.b = false;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.drawText(charSequence, i, i2, f, i4, paint);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i6 = fontMetricsInt.bottom - fontMetricsInt.ascent;
        if (!this.b) {
            this.a.setColor(paint.getColor());
        }
        float f2 = i5 - (i6 / 2.0f);
        canvas.drawLine(f, f2, this.c + f, f2, this.a);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.leading = fontMetricsInt2.leading;
            fontMetricsInt.top = fontMetricsInt2.top;
        }
        float fMeasureText = paint.measureText(charSequence, i, i2);
        this.c = fMeasureText;
        return Math.round(fMeasureText);
    }
}

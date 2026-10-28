package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acke extends ReplacementSpan {
    public final Paint a;
    public boolean b;
    private float c;

    public acke() {
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.b = false;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.drawText(charSequence, i, i2, f, i4, paint);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i6 = fontMetricsInt.bottom - fontMetricsInt.descent;
        if (!this.b) {
            this.a.setColor(paint.getColor());
        }
        float f2 = i5 - i6;
        canvas.drawLine(f, f2, this.c + f, f2, this.a);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float fMeasureText = paint.measureText(charSequence, i, i2);
        this.c = fMeasureText;
        return Math.round(fMeasureText);
    }
}

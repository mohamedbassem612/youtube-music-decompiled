package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class accr extends ReplacementSpan {
    private final Integer a;
    private final int b;

    public accr(Integer num, int i) {
        this.a = num;
        this.b = i;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.getClass();
        charSequence.getClass();
        paint.getClass();
        Paint.Style style = paint.getStyle();
        int color = paint.getColor();
        float strokeWidth = paint.getStrokeWidth();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.b);
        paint.setStrokeWidth(paint.getTextSize() * 0.0625f);
        float f2 = i4;
        canvas.drawText(charSequence, i, i2, f, f2, paint);
        paint.setStyle(Paint.Style.FILL);
        Integer num = this.a;
        paint.setColor(num != null ? num.intValue() : color);
        canvas.drawText(charSequence, i, i2, f, f2, paint);
        paint.setStyle(style);
        paint.setColor(color);
        paint.setStrokeWidth(strokeWidth);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getClass();
        charSequence.getClass();
        return (int) paint.measureText(charSequence, i, i2);
    }
}

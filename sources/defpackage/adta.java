package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adta extends ReplacementSpan {
    public final String a;
    private final float c;
    private final float d;
    private final float e;
    private final Paint g;
    private final boolean h;
    public final String b = UUID.randomUUID().toString();
    private final RectF f = new RectF();

    public adta(String str, float f, float f2, float f3, int i, boolean z) {
        this.a = str;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.h = z;
        Paint paint = new Paint();
        this.g = paint;
        paint.setColor(i);
    }

    private final float a(Paint paint, CharSequence charSequence, int i, int i2) {
        return Math.min(paint.measureText(TextUtils.substring(charSequence, i, i2)), this.e);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        float fA = a(paint, charSequence, i, i2);
        float f2 = this.d;
        float fCeil = (float) Math.ceil(f2 + f2 + fA);
        RectF rectF = this.f;
        rectF.set(f, i3 + 0.0f, fCeil + f, i5);
        float f3 = this.c;
        canvas.drawRoundRect(rectF, f3, f3, this.g);
        TextPaint textPaint = new TextPaint(paint);
        textPaint.setStrikeThruText(this.h);
        CharSequence charSequenceEllipsize = TextUtils.ellipsize(TextUtils.substring(charSequence, i, i2), textPaint, fA, TextUtils.TruncateAt.END);
        canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), f + f2, i4, textPaint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (charSequence == null || charSequence.length() == 0) {
            return 0;
        }
        float fA = a(paint, charSequence, i, i2);
        float f = this.d;
        return (int) Math.ceil(fA + f + f);
    }
}

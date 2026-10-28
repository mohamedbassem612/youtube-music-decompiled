package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adsb extends ImageSpan {
    int a;
    private final Paint.FontMetricsInt b;

    public adsb(Context context, Bitmap bitmap) {
        super(context, bitmap, 0);
        this.b = new Paint.FontMetricsInt();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = getDrawable();
        canvas.save();
        Paint.FontMetricsInt fontMetricsInt = this.b;
        paint.getFontMetricsInt(fontMetricsInt);
        Rect bounds = drawable.getBounds();
        int i6 = fontMetricsInt.bottom - fontMetricsInt.top;
        canvas.translate(f + this.a, ((i4 + fontMetricsInt.bottom) - (i6 / 2)) - (bounds.height() / 2));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = getDrawable().getBounds();
        Paint.FontMetricsInt fontMetricsInt2 = this.b;
        paint.getFontMetricsInt(fontMetricsInt2);
        int i3 = fontMetricsInt2.ascent - fontMetricsInt2.top;
        int i4 = fontMetricsInt2.bottom - fontMetricsInt2.descent;
        int i5 = fontMetricsInt2.bottom - ((fontMetricsInt2.bottom - fontMetricsInt2.top) / 2);
        int iHeight = bounds.height() / 2;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = i5 - iHeight;
            fontMetricsInt.descent = i5 + iHeight;
            fontMetricsInt.top = fontMetricsInt.ascent - i3;
            fontMetricsInt.bottom = fontMetricsInt.descent + i4;
        }
        return bounds.right + (this.a << 1);
    }

    public adsb(Drawable drawable) {
        super(drawable, 0);
        this.b = new Paint.FontMetricsInt();
    }
}

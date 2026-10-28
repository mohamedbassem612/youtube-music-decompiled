package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import com.google.android.apps.youtube.music.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wzd extends ReplacementSpan {
    private final List a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final Paint g;
    private final RectF h;
    private float i = -1.0f;
    private float j = -1.0f;

    public wzd(Context context, int i, int i2, List list) {
        Paint paint = new Paint();
        this.g = paint;
        paint.setColor(i2);
        this.b = i;
        this.h = new RectF();
        this.a = list;
        this.c = context.getResources().getDimensionPixelOffset(R.dimen.live_chat_background_highlight_corner_radius);
        this.d = context.getResources().getDimensionPixelOffset(R.dimen.live_chat_background_highlight_horizontal_padding);
        this.e = context.getResources().getDimensionPixelOffset(R.dimen.live_chat_background_highlight_horizontal_padding);
        this.f = context.getResources().getDimensionPixelOffset(R.dimen.live_chat_background_highlight_text_icon_gap);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.j < 0.0f) {
            this.j = paint.measureText(charSequence.subSequence(i, i2).toString());
        }
        int i6 = this.b;
        if (i6 != 0) {
            paint.setColor(i6);
        }
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f2 = i4;
        float fMax = Math.max(i3, fontMetrics.ascent + f2);
        float f3 = fontMetrics.descent + f2;
        RectF rectF = this.h;
        rectF.set(f, fMax, this.j + f, Math.min(i5, f3));
        float f4 = this.c;
        canvas.drawRoundRect(rectF, f4, f4, this.g);
        canvas.drawText(charSequence, i, i2, f + this.d, f2, paint);
        List<Drawable> list = this.a;
        if (list != null) {
            int intrinsicWidth = 0;
            for (Drawable drawable : list) {
                drawable.mutate();
                drawable.setTint(i6);
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                int intrinsicHeight = (i5 - i3) - drawable.getIntrinsicHeight();
                canvas.save();
                canvas.translate(this.i + f + intrinsicWidth + this.f, Math.max(intrinsicHeight / 2, 0) + i3);
                drawable.draw(canvas);
                canvas.restore();
                intrinsicWidth += drawable.getIntrinsicWidth();
            }
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float fMeasureText = this.i;
        if (fMeasureText < 0.0f) {
            fMeasureText = paint.measureText(charSequence.subSequence(i, i2).toString());
            this.i = fMeasureText;
        }
        this.j = fMeasureText + this.d + this.e;
        List list = this.a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.j += ((Drawable) it.next()).getIntrinsicWidth();
            }
        }
        return (int) this.j;
    }
}

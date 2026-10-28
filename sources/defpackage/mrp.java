package defpackage;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mrp extends mrr {
    private final Paint a;
    private final float b;
    private Layout c;

    public mrp(DisplayMetrics displayMetrics, int i) {
        Paint paint = new Paint(1);
        this.a = paint;
        float fApplyDimension = TypedValue.applyDimension(2, 1.25f, displayMetrics);
        float fApplyDimension2 = TypedValue.applyDimension(2, 0.1f, displayMetrics);
        float fApplyDimension3 = TypedValue.applyDimension(2, 2.0f, displayMetrics);
        this.b = TypedValue.applyDimension(2, 1.5f, displayMetrics);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(fApplyDimension);
        paint.setPathEffect(new DashPathEffect(new float[]{fApplyDimension2, fApplyDimension3}, 0.0f));
        paint.setColor(i == 0 ? -16777216 : i);
    }

    @Override // defpackage.mrr
    public final void a(Canvas canvas) {
        Spanned spanned;
        int spanStart;
        int lineEnd;
        Canvas canvas2;
        Layout layout = this.c;
        if (layout == null || layout.getLineCount() == 0 || !(layout.getText() instanceof Spanned) || (spanStart = (spanned = (Spanned) layout.getText()).getSpanStart(this)) == -1 || spanStart >= (lineEnd = layout.getLineEnd(layout.getLineCount() - 1))) {
            return;
        }
        int spanEnd = spanned.getSpanEnd(this);
        if (spanEnd != -1) {
            lineEnd = spanEnd;
        }
        int lineForOffset = layout.getLineForOffset(spanStart);
        int iMin = Math.min(layout.getLineCount() - 1, layout.getLineForOffset(lineEnd));
        while (lineForOffset <= iMin) {
            int lineStart = layout.getLineStart(lineForOffset);
            int lineEnd2 = layout.getLineEnd(lineForOffset);
            int iMax = Math.max(spanStart, lineStart);
            int iMin2 = Math.min(lineEnd, lineEnd2);
            if (iMax >= iMin2) {
                canvas2 = canvas;
            } else {
                float primaryHorizontal = layout.getPrimaryHorizontal(iMax);
                float primaryHorizontal2 = layout.getPrimaryHorizontal(iMin2);
                if (lineForOffset < iMin && iMin2 == lineEnd2) {
                    primaryHorizontal2 = layout.getLineRight(lineForOffset);
                }
                float lineBaseline = layout.getLineBaseline(lineForOffset) + this.b;
                canvas2 = canvas;
                canvas2.drawLine(primaryHorizontal, lineBaseline, primaryHorizontal2, lineBaseline, this.a);
            }
            lineForOffset++;
            canvas = canvas2;
        }
    }

    @Override // defpackage.mrr
    public final void b(Layout layout, CharSequence charSequence) {
        this.c = layout;
    }

    @Override // defpackage.mrr
    public final void c() {
        this.c = null;
    }
}

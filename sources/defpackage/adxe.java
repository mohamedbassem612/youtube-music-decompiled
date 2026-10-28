package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class adxe extends MetricAffectingSpan {
    private final float a;
    private final int b;

    public adxe(float f, int i) {
        this.a = f;
        this.b = i;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        updateMeasureState(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift = this.b;
        float f = this.a;
        if (f > 0.0f) {
            textPaint.setTextSize(f);
        }
    }
}

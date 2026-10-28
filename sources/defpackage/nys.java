package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nys extends TypefaceSpan {
    private final Typeface a;
    private final String b;

    public nys(String str, Typeface typeface, String str2) {
        super(str);
        this.a = typeface;
        this.b = str2;
    }

    private static void a(Paint paint, String str) {
        if (str != null) {
            Boolean bool = nya.b;
            if (nya.a || str.equals(paint.getFontVariationSettings())) {
                return;
            }
            paint.setFontVariationSettings("");
            paint.setFontVariationSettings(str);
        }
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Typeface typeface = this.a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        } else {
            super.updateDrawState(textPaint);
        }
        a(textPaint, this.b);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        } else {
            super.updateMeasureState(textPaint);
        }
        a(textPaint, this.b);
    }
}

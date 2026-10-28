package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zov extends TypefaceSpan {
    public final Typeface a;

    public zov(String str, Typeface typeface) {
        super(str);
        this.a = typeface;
    }

    private static void a(Paint paint, Typeface typeface) {
        if (typeface != null) {
            paint.setTypeface(typeface);
        }
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        a(textPaint, this.a);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        a(textPaint, this.a);
    }
}

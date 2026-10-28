package defpackage;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mrq implements LineHeightSpan {
    private final float a;
    private int b = -1;
    private int c = -1;
    private int d = -1;
    private int e = -1;

    public mrq(float f) {
        this.a = f;
    }

    @Override // android.text.style.LineHeightSpan
    public final synchronized void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if ((charSequence instanceof Spanned) && i == ((Spanned) charSequence).getSpanStart(this)) {
            this.b = -1;
            this.c = -1;
            this.d = -1;
            this.e = -1;
        }
        int i5 = fontMetricsInt.top;
        int i6 = fontMetricsInt.bottom;
        if (i != this.d || i2 != this.e) {
            this.b = i5;
            this.c = i6;
        }
        this.d = i;
        this.e = i2;
        float f = this.a;
        if (f > 0.0f) {
            int i7 = this.c;
            int i8 = this.b;
            double d = (f - (i7 - i8)) / 2.0f;
            fontMetricsInt.top = (int) (((double) i8) - Math.floor(d));
            fontMetricsInt.bottom = (int) (((double) this.c) + Math.ceil(d));
            fontMetricsInt.ascent = fontMetricsInt.top;
            fontMetricsInt.descent = fontMetricsInt.bottom;
        }
    }
}

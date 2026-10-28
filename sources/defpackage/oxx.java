package defpackage;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oxx implements LineHeightSpan {
    private final float a;
    private final float b;
    private int c;
    private int d;
    private int e;
    private int f;

    public oxx(float f) {
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.a = f;
        this.b = 0.0f;
    }

    @Override // android.text.style.LineHeightSpan
    public final synchronized void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if ((charSequence instanceof Spanned) && i == ((Spanned) charSequence).getSpanStart(this)) {
            this.c = -1;
            this.d = -1;
            this.e = -1;
            this.f = -1;
        }
        int i5 = fontMetricsInt.top;
        int i6 = fontMetricsInt.bottom;
        if (i != this.e || i2 != this.f) {
            this.c = i5;
            this.d = i6;
        }
        this.e = i;
        this.f = i2;
        float f = this.a;
        float f2 = this.b;
        if (f2 != 0.0f) {
            f = (this.d - this.c) * f2;
        }
        if (f > 0.0f) {
            int i7 = this.d;
            int i8 = this.c;
            double d = (f - (i7 - i8)) / 2.0f;
            fontMetricsInt.top = (int) (((double) i8) - Math.floor(d));
            fontMetricsInt.bottom = (int) (((double) this.d) + Math.ceil(d));
            fontMetricsInt.ascent = fontMetricsInt.top;
            fontMetricsInt.descent = fontMetricsInt.bottom;
        }
    }

    public oxx(float f, byte[] bArr) {
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.a = 0.0f;
        this.b = f;
    }
}

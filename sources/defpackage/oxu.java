package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oxu extends MetricAffectingSpan implements LineHeightSpan {
    private final float a;
    private int b;
    private int c;
    private final int d;

    public oxu(int i, float f) {
        this.d = i;
        this.a = f;
    }

    private final void a(TextPaint textPaint) {
        this.b = (int) textPaint.ascent();
        this.c = (int) textPaint.descent();
        int i = this.d;
        if (i == 1) {
            textPaint.baselineShift -= Math.round(this.b / 2.0f);
        } else if (i == 2) {
            textPaint.baselineShift += Math.round(this.b / 2.0f);
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = this.b;
        int iRound = this.c;
        if (i5 == 0) {
            if (iRound == 0) {
                float fAbs = this.a;
                if (fAbs <= 0.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) + Math.abs(fontMetricsInt.descent);
                }
                int i6 = -Math.round(0.75f * fAbs);
                iRound = Math.round(fAbs * 0.25f);
                i5 = i6;
            } else {
                i5 = 0;
            }
        }
        int iRound2 = Math.round(i5 / 2.0f);
        int i7 = -iRound2;
        int i8 = this.d;
        if (i8 == 1) {
            int i9 = i7 + iRound;
            if (fontMetricsInt.descent < i9) {
                fontMetricsInt.descent = i9;
            }
            if (fontMetricsInt.bottom < i9) {
                fontMetricsInt.bottom = i9;
                return;
            }
            return;
        }
        if (i8 == 2) {
            int i10 = iRound2 + i5;
            if (fontMetricsInt.ascent > i10) {
                fontMetricsInt.ascent = i10;
            }
            if (fontMetricsInt.top > i10) {
                fontMetricsInt.top = i10;
            }
        }
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}

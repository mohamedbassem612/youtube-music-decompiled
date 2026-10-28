package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vmn {
    public final TextPaint a;
    public final vml b;
    public final float c;
    public final float d;

    public vmn(TextPaint textPaint, vml vmlVar, float f, float f2) {
        if (textPaint == null) {
            throw new NullPointerException("Null paint");
        }
        this.a = textPaint;
        this.b = vmlVar;
        this.c = f;
        this.d = f2;
    }

    public static int c(Context context) {
        int i;
        if (Build.VERSION.SDK_INT < 31 || (i = context.getResources().getConfiguration().fontWeightAdjustment) == Integer.MAX_VALUE) {
            return 0;
        }
        return i;
    }

    public static vmn d(TextPaint textPaint, int i) {
        textPaint.setColor(i);
        float[] fArr = new float[10];
        for (int i2 = 0; i2 <= 9; i2++) {
            fArr[i2] = textPaint.measureText(String.valueOf(i2));
        }
        float[] fArr2 = new float[32];
        for (int i3 = 0; i3 < 10; i3++) {
            float f = fArr[i3];
            for (int i4 = i3 + 16; i4 > 0; i4 >>= 1) {
                fArr2[i4] = Math.max(fArr2[i4], f);
            }
        }
        vml vmlVar = new vml(fArr2);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        return new vmn(textPaint, vmlVar, fontMetrics.bottom - fontMetrics.top, -fontMetrics.top);
    }

    public static vmn e(Typeface typeface, int i, float f) {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(typeface);
        textPaint.setTextSize(f);
        return d(textPaint, i);
    }

    public final float a(int i) {
        return this.b.a[i + 16];
    }

    public final float b(String str) {
        return this.a.measureText(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vmn) {
            vmn vmnVar = (vmn) obj;
            if (this.a.equals(vmnVar.a) && this.b.equals(vmnVar.b)) {
                if (Float.floatToIntBits(this.c) == Float.floatToIntBits(vmnVar.c)) {
                    if (Float.floatToIntBits(this.d) == Float.floatToIntBits(vmnVar.d)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ Float.floatToIntBits(this.d);
    }

    public final String toString() {
        vml vmlVar = this.b;
        return "RollingNumberFontProperties{paint=" + this.a.toString() + ", digitWidthSegmentTree=" + vmlVar.toString() + ", height=" + this.c + ", baseline=" + this.d + '}';
    }

    public vmn() {
        throw null;
    }
}

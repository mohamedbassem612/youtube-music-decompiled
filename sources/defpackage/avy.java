package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.CancellationSignal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class avy {
    public static final awg a;
    public static final agm b;
    private static Paint c;

    static {
        if (Build.VERSION.SDK_INT >= 31) {
            a = new awd();
        } else if (Build.VERSION.SDK_INT >= 29) {
            a = new awc();
        } else if (Build.VERSION.SDK_INT >= 28) {
            a = new awb();
        } else {
            a = new awa();
        }
        b = new agm(16);
        c = null;
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, axd[] axdVarArr, int i) {
        return a.a(context, cancellationSignal, axdVarArr, i);
    }

    public static Typeface b(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface typefaceD = a.d(context, resources, i, str, i3);
        if (typefaceD != null) {
            b.c(e(resources, i, str, i2, i3), typefaceD);
        }
        return typefaceD;
    }

    public static Typeface c(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }

    public static Font d(Typeface typeface) {
        Paint paint = c;
        if (paint == null) {
            paint = new Paint();
            c = paint;
        }
        paint.setTextSize(10.0f);
        c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }

    public static String e(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}

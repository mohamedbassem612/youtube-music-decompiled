package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ld {
    public Typeface a;
    public String b;
    private final TextView c;
    private final axo d;
    private Typeface e;

    public ld(TextView textView, axo axoVar) {
        this.c = textView;
        this.d = axoVar;
    }

    private final void c(Typeface typeface) {
        this.e = typeface;
        this.d.accept(typeface);
    }

    public final void a(Typeface typeface) {
        this.a = typeface;
        c(typeface);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    public final boolean b(String str) {
        int i;
        String fontVariationSettings;
        FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings;
        int length;
        TextView textView = this.c;
        Typeface typeface = this.a;
        TextPaint paint = textView.getPaint();
        if (this.e != paint.getTypeface()) {
            Log.w("FontVarSettings", "getPaint().getTypeface() changed unexpectedly. App code should not modify the result of getPaint().");
            typeface = paint.getTypeface();
        }
        if (Build.VERSION.SDK_INT < 31 || (i = textView.getContext().getResources().getConfiguration().fontWeightAdjustment) == Integer.MAX_VALUE) {
            i = 0;
        }
        agm agmVar = lc.a;
        lb lbVar = new lb(typeface, str, i);
        agm agmVar2 = lc.a;
        Typeface typeface2 = (Typeface) agmVar2.b(lbVar);
        if (typeface2 == null) {
            Paint paint2 = lc.b;
            if (paint2 == null) {
                paint2 = new Paint();
                lc.b = paint2;
            }
            if (i == 0) {
                fontVariationSettings = str;
            } else {
                if (TextUtils.isEmpty(str)) {
                    fontVariationAxisArrFromFontVariationSettings = new FontVariationAxis[0];
                } else {
                    fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(str);
                    if (fontVariationAxisArrFromFontVariationSettings == null) {
                        fontVariationSettings = str;
                    }
                }
                int i2 = 0;
                boolean z = false;
                while (true) {
                    length = fontVariationAxisArrFromFontVariationSettings.length;
                    if (i2 >= length) {
                        break;
                    }
                    FontVariationAxis fontVariationAxis = fontVariationAxisArrFromFontVariationSettings[i2];
                    if ("wght".equals(fontVariationAxis.getTag())) {
                        fontVariationAxisArrFromFontVariationSettings[i2] = new FontVariationAxis("wght", lc.a(fontVariationAxis.getStyleValue() + i));
                        z = true;
                    }
                    i2++;
                }
                if (!z) {
                    FontVariationAxis[] fontVariationAxisArr = new FontVariationAxis[length + 1];
                    System.arraycopy(fontVariationAxisArrFromFontVariationSettings, 0, fontVariationAxisArr, 0, length);
                    fontVariationAxisArr[length] = new FontVariationAxis("wght", lc.a(i + 400));
                    fontVariationAxisArrFromFontVariationSettings = fontVariationAxisArr;
                }
                fontVariationSettings = FontVariationAxis.toFontVariationSettings(fontVariationAxisArrFromFontVariationSettings);
            }
            if (Objects.equals(paint2.getFontVariationSettings(), fontVariationSettings)) {
                paint2.setFontVariationSettings(null);
            }
            paint2.setTypeface(typeface);
            if (paint2.setFontVariationSettings(fontVariationSettings)) {
                typeface2 = paint2.getTypeface();
                agmVar2.c(lbVar, typeface2);
            } else {
                typeface2 = null;
            }
        }
        if (typeface2 == null) {
            return false;
        }
        c(typeface2);
        this.b = str;
        return true;
    }
}

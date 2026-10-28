package defpackage;

import android.graphics.Paint;
import android.widget.TextView;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lc {
    public static final agm a = new agm(30);
    public static Paint b;

    public static float a(float f) {
        if (f >= 1.0f) {
            return Math.min(f, 1000.0f);
        }
        return 1.0f;
    }

    static void b(TextView textView, String str) {
        if (Objects.equals(textView.getFontVariationSettings(), str)) {
            textView.setFontVariationSettings("");
        }
        textView.setFontVariationSettings(str);
    }
}

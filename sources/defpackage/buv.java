package defpackage;

import android.text.Spannable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class buv {
    public static void a(Spannable spannable, Object obj, int i, int i2) {
        for (Object obj2 : spannable.getSpans(i, i2, obj.getClass())) {
            b(spannable, obj2, i, i2);
        }
        spannable.setSpan(obj, i, i2, 33);
    }

    public static void b(Spannable spannable, Object obj, int i, int i2) {
        if (spannable.getSpanStart(obj) == i && spannable.getSpanEnd(obj) == i2 && spannable.getSpanFlags(obj) == 33) {
            spannable.removeSpan(obj);
        }
    }
}

package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ackp {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/proto/formatted/font/SafeTypeface");

    public static final Typeface a(Context context, String str, int i) {
        c(context);
        Typeface typefaceCreate = Typeface.create(str, i);
        typefaceCreate.getClass();
        return typefaceCreate;
    }

    public static final Typeface b(Context context, String str, int i, boolean z) {
        int i2 = 0;
        if (Build.VERSION.SDK_INT < 28) {
            if (i > 500) {
                i2 = z ? 3 : 1;
            } else if (z) {
                i2 = 2;
            }
            return a(context, str, i2);
        }
        Typeface typefaceA = a(context, str, 0);
        c(context);
        Typeface typefaceCreate = Typeface.create(typefaceA, i, z);
        typefaceCreate.getClass();
        return typefaceCreate;
    }

    public static final void c(Context context) {
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                ((ackq) aguu.av(applicationContext, ackq.class)).bZ().isPresent();
            } catch (RuntimeException e) {
                ((agrc) ((agrc) a.c()).j(e).k("com/google/android/libraries/youtube/proto/formatted/font/SafeTypeface", "isSafeTypefaceEnabled", 57, "SafeTypeface.kt")).t("Failed to check if safe typeface is enabled");
            }
        }
    }
}

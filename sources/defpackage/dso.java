package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dso {
    public static final dsp a;
    static final Property b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new dst();
        } else {
            a = new dss();
        }
        b = new dsm(Float.class);
        new dsn(Rect.class);
    }

    static float a(View view) {
        return a.a(view);
    }

    static void b(View view, int i, int i2, int i3, int i4) {
        a.b(view, i, i2, i3, i4);
    }

    static void c(View view, float f) {
        a.c(view, f);
    }

    static void d(View view, int i) {
        a.d(view, i);
    }
}

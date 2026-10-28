package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auix {
    public static final Class a;
    private final Object b;

    static {
        Class<?> cls = null;
        if (a.aK()) {
            try {
                cls = Class.forName("android.view.DisplayCutout");
            } catch (Exception unused) {
                Log.e("AndroidPCompat", "Failed to obtain DisplayCutout API.");
            }
        }
        a = cls;
    }

    public auix(Object obj) {
        this.b = obj;
    }

    public final int a(String str) {
        try {
            return ((Integer) a.getDeclaredMethod(str, null).invoke(this.b, null)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }
}

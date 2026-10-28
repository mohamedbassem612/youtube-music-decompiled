package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nya {
    public static final boolean a;
    public static volatile Boolean b;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT == 35 && ((Build.MANUFACTURER != null && ahno.ag("HONOR", Build.MANUFACTURER)) || (Build.BRAND != null && ahno.ag("HONOR", Build.BRAND)))) {
            z = true;
        }
        a = z;
    }

    public static boolean a() {
        Boolean bool = b;
        return a;
    }
}

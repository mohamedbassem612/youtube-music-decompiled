package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class npw {
    private static volatile Integer a = null;
    private static volatile int b = 1;

    public static boolean a() {
        int i = b;
        int i2 = b;
        Integer num = a;
        return Build.VERSION.SDK_INT >= 33;
    }

    public static void b() {
        int i = b;
    }
}

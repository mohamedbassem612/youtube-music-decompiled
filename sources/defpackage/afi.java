package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class afi {
    private static final Handler a = new Handler(Looper.getMainLooper());

    public static void a() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Not running on main thread when it is required to");
        }
    }

    public static void b(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            a.post(runnable);
        }
    }
}

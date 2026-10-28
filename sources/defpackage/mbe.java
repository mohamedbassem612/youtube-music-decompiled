package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mbe {
    private static final boolean a;

    static {
        boolean z;
        try {
            SystemClock.elapsedRealtimeNanos();
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        a = z;
    }

    public static long a() {
        return a ? SystemClock.elapsedRealtimeNanos() : SystemClock.elapsedRealtime() * 1000000;
    }
}

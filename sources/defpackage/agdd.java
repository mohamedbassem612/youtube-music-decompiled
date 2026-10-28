package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agdd {
    public static final agfx a;

    static {
        agfx agdcVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            agdcVar = new agdb();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            agdcVar = new agdc();
        }
        a = agdcVar;
    }
}

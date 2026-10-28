package org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import defpackage.axjq;
import defpackage.axjr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ThreadUtils {
    private static final Object a = new Object();
    private static volatile boolean b;
    private static volatile Handler c;

    public static Handler a() {
        if (c == null) {
            boolean z = b;
            Looper mainLooper = Looper.getMainLooper();
            synchronized (a) {
                if (c == null) {
                    c = new Handler(mainLooper);
                    TraceEvent.b = true;
                    if (TraceEvent.a) {
                        axjr.a();
                        b().setMessageLogging(axjq.a);
                    }
                } else if (c.getLooper() != mainLooper) {
                    throw new RuntimeException("UI thread looper is already set to " + String.valueOf(c.getLooper()) + " (Main thread looper is " + String.valueOf(Looper.getMainLooper()) + "), cannot set to new looper " + String.valueOf(mainLooper));
                }
            }
        }
        return c;
    }

    public static Looper b() {
        return a().getLooper();
    }

    private static boolean isThreadPriorityAudio(int i) {
        return Process.getThreadPriority(i) == -16;
    }

    public static void setThreadPriorityAudio(int i) {
        Process.setThreadPriority(i, -16);
    }
}

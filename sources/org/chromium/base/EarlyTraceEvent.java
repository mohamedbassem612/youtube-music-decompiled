package org.chromium.base;

import defpackage.axjd;
import defpackage.axjn;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class EarlyTraceEvent {
    public static volatile int a;
    static final Object b = new Object();
    static final List c = new ArrayList();
    static final List d = new ArrayList();
    private static boolean e;

    public static void a() {
        int i = a;
    }

    public static boolean getBackgroundStartupTracingFlag() {
        return e;
    }

    static void setBackgroundStartupTracingFlag(boolean z) {
        if (e != z) {
            e = z;
            axjn axjnVarB = axjn.b();
            try {
                axjd.a.edit().putBoolean("bg_startup_tracing", z).apply();
                axjnVarB.close();
            } catch (Throwable th) {
                try {
                    axjnVarB.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}

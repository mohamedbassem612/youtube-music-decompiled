package org.chromium.base;

import defpackage.axjf;
import defpackage.axjq;
import defpackage.axjr;
import defpackage.axmp;
import internal.J.N;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class TraceEvent implements AutoCloseable {
    public static volatile boolean a;
    public static volatile boolean b;
    public static boolean c;

    private TraceEvent(String str) {
        a(str, null);
    }

    public static void a(String str, String str2) {
        EarlyTraceEvent.a();
        if (a) {
            N.M9XfPu17(str, str2);
        }
    }

    public static void b(long j) {
        EarlyTraceEvent.a();
        if (a) {
            N.Mw73xTww(null, j);
        }
    }

    public static TraceEvent c(String str) {
        int i = EarlyTraceEvent.a;
        if (a) {
            return new TraceEvent(str);
        }
        return null;
    }

    public static void dumpViewHierarchy(long j, Object obj) {
        ApplicationStatus.b();
    }

    public static void setEnabled(boolean z) {
        if (z) {
            synchronized (EarlyTraceEvent.b) {
                int i = EarlyTraceEvent.a;
            }
        }
        if (a != z) {
            a = z;
            if (b) {
                ThreadUtils.b().setMessageLogging(z ? axjq.a : null);
            }
        }
        if (a) {
            synchronized (EarlyTraceEvent.b) {
                List<axmp> list = EarlyTraceEvent.c;
                if (!list.isEmpty()) {
                    for (axmp axmpVar : list) {
                        long j = axmpVar.b;
                        long j2 = axmpVar.a;
                        N.MvcVeOsg(0L, 0L);
                    }
                    list.clear();
                }
                List<axjf> list2 = EarlyTraceEvent.d;
                if (!list2.isEmpty()) {
                    for (axjf axjfVar : list2) {
                        long j3 = axjfVar.a;
                        long j4 = axjfVar.b;
                        int i2 = axjfVar.c;
                        N.MbWHcONC(0L, 0L, 0);
                    }
                    list2.clear();
                }
            }
        }
        if (b) {
            axjr.a();
        }
    }

    public static void setEventNameFilteringEnabled(boolean z) {
        c = z;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        b(0L);
    }
}

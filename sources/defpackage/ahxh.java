package defpackage;

import android.os.ConditionVariable;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahxh {
    private static final ConditionVariable h = new ConditionVariable();
    static final Map a = DesugarCollections.synchronizedMap(new HashMap());
    public static final Collection b = new ConcurrentLinkedQueue();
    public static final Collection c = new ConcurrentLinkedQueue();
    static final AtomicInteger d = new AtomicInteger();
    public static volatile boolean e = false;
    public static volatile ahxf f = new ahxg();
    public static volatile gzj g = null;
    private static volatile Thread i = null;

    public static void a(String str, String... strArr) {
        c(f, str);
    }

    private static void b(ahxf ahxfVar, String str) {
        boolean z;
        Map map = a;
        synchronized (map) {
            ConditionVariable conditionVariable = (ConditionVariable) map.get(str);
            ConditionVariable conditionVariable2 = h;
            if (conditionVariable == conditionVariable2) {
                return;
            }
            if (conditionVariable != null) {
                z = true;
            } else {
                conditionVariable = new ConditionVariable();
                map.put(str, conditionVariable);
                z = false;
            }
            if (!z) {
                Thread thread = i;
                synchronized (conditionVariable) {
                    try {
                        long jNanoTime = System.nanoTime();
                        ahxfVar.a(str);
                        map.put(str, conditionVariable2);
                        if (e) {
                            b.add(new axq(str, Long.valueOf(System.nanoTime() - jNanoTime)));
                        }
                        conditionVariable.open();
                    } catch (Throwable th) {
                        try {
                            a.remove(str);
                            throw th;
                        } catch (Throwable th2) {
                            conditionVariable.open();
                            throw th2;
                        }
                    }
                }
            }
            if (Thread.holdsLock(conditionVariable)) {
                return;
            }
            conditionVariable.block();
        }
    }

    private static void c(ahxf ahxfVar, String str) {
        if (!e) {
            b(ahxfVar, str);
            return;
        }
        long jNanoTime = System.nanoTime();
        b(ahxfVar, str);
        if (d.incrementAndGet() <= 20) {
            c.add(new axq(str, Long.valueOf(System.nanoTime() - jNanoTime)));
        }
    }
}

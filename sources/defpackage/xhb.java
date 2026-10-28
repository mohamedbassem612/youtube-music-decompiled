package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xhb {
    public static final AtomicInteger a = new AtomicInteger(0);
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static final ConcurrentHashMap e = new ConcurrentHashMap();

    static {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static xhc a(int i) {
        return new xhc(a.get() == 1, d, i, atqp.class.getName());
    }

    public static xhc b(int i) {
        Class cls;
        ConcurrentHashMap concurrentHashMap = e;
        Integer numValueOf = Integer.valueOf(i);
        if (concurrentHashMap.containsKey(numValueOf)) {
            return new xhc(a.get() == 1, concurrentHashMap, i, atqn.class.getName());
        }
        ConcurrentHashMap concurrentHashMap2 = c;
        boolean zContainsKey = concurrentHashMap2.containsKey(numValueOf);
        boolean z = a.get() == 1;
        if (zContainsKey) {
            cls = atqo.class;
        } else {
            concurrentHashMap2 = b;
            cls = atqq.class;
        }
        return new xhc(z, concurrentHashMap2, i, cls.getName());
    }
}

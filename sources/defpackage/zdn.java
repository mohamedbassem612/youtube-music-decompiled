package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zdn {
    public final Object a = new Object();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public volatile zcj e = zcj.W;

    public final zcj a(zcf zcfVar) {
        zcj zcjVar;
        return (zcfVar == null || (zcjVar = (zcj) this.b.get(zcfVar)) == null) ? this.e : zcjVar;
    }

    public final void b(zcj zcjVar) {
        zcj zcjVar2 = zcj.W;
        if (awrc.c(zcjVar, zcjVar2)) {
            return;
        }
        synchronized (this.a) {
            this.c.putIfAbsent(zcjVar, Collections.newSetFromMap(new ConcurrentHashMap()));
            if (!awrc.c(this.e, zcjVar2) && !awrc.c(this.e, zcjVar)) {
                this.d.put(this.e, yxj.c);
            }
            this.e = zcjVar;
            this.d.put(zcjVar, yxj.a);
        }
    }

    public final void c(zcj zcjVar) {
        zcj zcjVar2 = zcj.W;
        if (awrc.c(zcjVar, zcjVar2)) {
            return;
        }
        synchronized (this.a) {
            this.c.putIfAbsent(zcjVar, Collections.newSetFromMap(new ConcurrentHashMap()));
            if (awrc.c(this.e, zcjVar2)) {
                this.e = zcjVar;
                this.d.put(zcjVar, yxj.a);
            } else {
                this.d.putIfAbsent(zcjVar, yxj.b);
            }
        }
    }

    public final void d(zcf zcfVar, zcj zcjVar) {
        zcjVar.getClass();
        if (awrc.c(zcjVar, zcj.W)) {
            return;
        }
        synchronized (this.a) {
            if (((zcj) this.b.putIfAbsent(zcfVar, zcjVar)) == null) {
                c(zcjVar);
                Set set = (Set) this.c.get(zcjVar);
                if (set != null) {
                    set.add(zcfVar);
                }
            }
        }
    }
}

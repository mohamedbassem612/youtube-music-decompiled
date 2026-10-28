package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeij {
    public final aeii a;
    final Map b;
    boolean c;
    private final String d;
    private final ahex e = new ahdt();
    private final ConcurrentLinkedQueue f = new ConcurrentLinkedQueue();
    private final awlb g = new awlb();

    public aeij(aeii aeiiVar) {
        HashMap map = new HashMap();
        this.b = map;
        this.c = false;
        map.put(aeiiVar.a, aeiiVar);
        this.a = aeiiVar;
        this.d = "MiniAppStateMachine";
    }

    public final synchronized void a() {
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.f;
            if (concurrentLinkedQueue.isEmpty()) {
                break;
            }
            FutureTask futureTask = (FutureTask) concurrentLinkedQueue.poll();
            if (futureTask != null) {
                futureTask.run();
            }
        }
        awlb awlbVar = this.g;
        int i = awla.a;
        if (awlbVar.e.get() == null) {
            Lock lock = awlbVar.d;
            lock.lock();
            awlbVar.f++;
            awlbVar.a.lazySet(this);
            lock.unlock();
            avjt[] avjtVarArr = (avjt[]) awlbVar.b.get();
            if (avjtVarArr.length > 0) {
                avjt avjtVar = avjtVarArr[0];
                throw null;
            }
        }
    }

    public final synchronized void b() {
        if (this.c) {
            return;
        }
        aeii aeiiVar = this.a;
        String.format("%s: starting with %s", this, aeiiVar);
        this.c = true;
        twu.d("StateMachine", 4, String.format("%s: enter", aeiiVar), null);
        Runnable runnable = aeiiVar.h;
        if (runnable != null) {
            runnable.run();
        }
        aeiiVar.b(aguu.s(aeiiVar));
    }

    public final synchronized void c(Object obj) {
        if (this.c) {
            this.f.add(new FutureTask(new aalq(this, obj, 13)));
            this.e.execute(afwl.i(new aehz(this, 3)));
        } else {
            twu.d("StateMachine", 5, String.format("Machine not running: %s", this), null);
            new FutureTask(new fxv(18)).run();
        }
    }

    public final String toString() {
        return String.format("Machine(%s)", this.d);
    }
}

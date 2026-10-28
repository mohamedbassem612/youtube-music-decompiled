package defpackage;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class obd implements obc {
    private final Executor a;
    private final Queue b = new PriorityQueue();

    public obd(Executor executor) {
        this.a = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.obc
    public final void a() {
        Queue queue = this.b;
        synchronized (queue) {
            if (queue.isEmpty()) {
                return;
            }
            PriorityQueue priorityQueue = new PriorityQueue();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            for (obf obfVar = (obf) queue.peek(); obfVar != null && obfVar.a <= jElapsedRealtime; obfVar = (obf) queue.peek()) {
                priorityQueue.add(obfVar);
            }
            Iterator it = priorityQueue.iterator();
            while (it.hasNext()) {
                try {
                    this.a.execute(((obf) it.next()).b);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    @Override // defpackage.obc
    public final void b(Runnable runnable, long j) {
        if (j <= 0) {
            this.a.execute(runnable);
            return;
        }
        obf obfVar = new obf(runnable, SystemClock.elapsedRealtime() + j, 0);
        Queue queue = this.b;
        synchronized (queue) {
            queue.add(obfVar);
        }
    }
}

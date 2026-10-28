package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class ewm {
    private final Queue a;

    public ewm() {
        char[] cArr = ffs.a;
        this.a = new ArrayDeque(20);
    }

    public abstract ewy a();

    final ewy b() {
        ewy ewyVar = (ewy) this.a.poll();
        return ewyVar == null ? a() : ewyVar;
    }

    public final void c(ewy ewyVar) {
        Queue queue = this.a;
        if (queue.size() < 20) {
            queue.offer(ewyVar);
        }
    }
}

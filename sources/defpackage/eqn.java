package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class eqn {
    public final Set a;
    public final PriorityBlockingQueue b;
    public final PriorityBlockingQueue c;
    public final eqd[] d;
    public epy e;
    public final List f;
    public final und g;
    public final elq h;
    public final kyr i;
    private final AtomicInteger j;
    private final List k;

    public eqn(und undVar, kyr kyrVar) {
        elq elqVar = new elq(new Handler(Looper.getMainLooper()));
        this.j = new AtomicInteger();
        this.a = new HashSet();
        this.b = new PriorityBlockingQueue();
        this.c = new PriorityBlockingQueue();
        this.f = new ArrayList();
        this.k = new ArrayList();
        this.g = undVar;
        this.i = kyrVar;
        this.d = new eqd[4];
        this.h = elqVar;
    }

    public final void a(eqk eqkVar) {
        eqkVar.setRequestQueue(this);
        Set set = this.a;
        synchronized (set) {
            set.add(eqkVar);
        }
        eqkVar.setSequence(this.j.incrementAndGet());
        eqkVar.addMarker("add-to-queue");
        b();
        if (eqkVar.shouldCache()) {
            this.b.add(eqkVar);
        } else {
            this.c.add(eqkVar);
        }
    }

    final void b() {
        List list = this.k;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((eql) it.next()).a();
            }
        }
    }
}

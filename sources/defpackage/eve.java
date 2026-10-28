package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eve {
    final Map a;
    public final ReferenceQueue b;
    public volatile boolean c;
    public volatile evc d;
    public aerj e;
    private final boolean f;

    public eve(boolean z) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new evb());
        this.a = new HashMap();
        this.b = new ReferenceQueue();
        this.f = z;
        executorServiceNewSingleThreadExecutor.execute(new px(this, 16, null));
    }

    public final synchronized evz a(ett ettVar) {
        evd evdVar = (evd) this.a.get(ettVar);
        if (evdVar == null) {
            return null;
        }
        evz evzVar = (evz) evdVar.get();
        if (evzVar == null) {
            c(evdVar);
        }
        return evzVar;
    }

    public final synchronized void b(ett ettVar, evz evzVar) {
        evd evdVar = (evd) this.a.put(ettVar, new evd(ettVar, evzVar, this.b, this.f));
        if (evdVar != null) {
            evdVar.a();
        }
    }

    public final void c(evd evdVar) {
        synchronized (this) {
            Map map = this.a;
            ett ettVar = evdVar.a;
            map.remove(ettVar);
            if (!evdVar.b || evdVar.c == null) {
                return;
            }
            this.e.s(ettVar, new evz(evdVar.c, true, false, ettVar, this.e));
        }
    }

    public final synchronized void d(ett ettVar) {
        evd evdVar = (evd) this.a.remove(ettVar);
        if (evdVar != null) {
            evdVar.a();
        }
    }
}

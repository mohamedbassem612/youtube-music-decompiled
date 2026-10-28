package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class evx implements ffy {
    public ett b;
    public boolean c;
    public ewf d;
    public boolean e;
    public ewb f;
    public boolean g;
    public evz h;
    public volatile boolean i;
    public int j;
    public final aerj l;
    public final aerj m;
    private final axr n;
    private final exs o;
    private final exs p;
    private final exs q;
    private boolean s;
    private evl t;
    public final evw a = new evw(new ArrayList(2));
    public final wkr k = new wkr(null);
    private final AtomicInteger r = new AtomicInteger();

    public evx(exs exsVar, exs exsVar2, exs exsVar3, aerj aerjVar, aerj aerjVar2, axr axrVar) {
        this.o = exsVar;
        this.p = exsVar2;
        this.q = exsVar3;
        this.m = aerjVar;
        this.l = aerjVar2;
        this.n = axrVar;
    }

    private final boolean j() {
        return this.g || this.e || this.i;
    }

    public final exs a() {
        return this.s ? this.q : this.p;
    }

    public final void b() {
        evz evzVar;
        synchronized (this) {
            this.k.b();
            if (!j()) {
                throw new IllegalArgumentException("Not yet complete!");
            }
            int iDecrementAndGet = this.r.decrementAndGet();
            if (iDecrementAndGet < 0) {
                throw new IllegalArgumentException("Can't decrement below 0");
            }
            if (iDecrementAndGet == 0) {
                evzVar = this.h;
                d();
            } else {
                evzVar = null;
            }
        }
        if (evzVar != null) {
            evzVar.f();
        }
    }

    final synchronized void c(int i) {
        evz evzVar;
        if (!j()) {
            throw new IllegalArgumentException("Not yet complete!");
        }
        if (this.r.getAndAdd(i) != 0 || (evzVar = this.h) == null) {
            return;
        }
        evzVar.d();
    }

    public final synchronized void d() {
        if (this.b == null) {
            throw new IllegalArgumentException();
        }
        this.a.a.clear();
        this.b = null;
        this.h = null;
        this.d = null;
        this.g = false;
        this.i = false;
        this.e = false;
        evl evlVar = this.t;
        if (evlVar.q.f()) {
            evlVar.a();
        }
        this.t = null;
        this.f = null;
        this.j = 0;
        this.n.b(this);
    }

    public final synchronized void e(evl evlVar) {
        this.t = evlVar;
        int iE = evlVar.e(1);
        ((iE == 2 || iE == 3) ? this.o : a()).execute(evlVar);
    }

    public final synchronized void f(fed fedVar, Executor executor) {
        this.k.b();
        this.a.a.add(new evv(fedVar, executor));
        if (this.e) {
            c(1);
            executor.execute(new abta(this, fedVar, 1));
        } else if (this.g) {
            c(1);
            executor.execute(new hhy(this, fedVar, 1));
        } else if (this.i) {
            throw new IllegalArgumentException("Cannot add callbacks to a cancelled EngineJob");
        }
    }

    @Override // defpackage.ffy
    public final wkr g() {
        return this.k;
    }

    public final synchronized void h(fed fedVar) {
        this.k.b();
        evv evvVar = new evv(fedVar, ffk.b);
        evw evwVar = this.a;
        evwVar.a.remove(evvVar);
        if (evwVar.c()) {
            if (!j()) {
                this.i = true;
                evl evlVar = this.t;
                evlVar.n = true;
                evj evjVar = evlVar.m;
                if (evjVar != null) {
                    evjVar.a();
                }
                this.m.q(this, this.b);
            }
            if ((this.e || this.g) && this.r.get() == 0) {
                d();
            }
        }
    }

    public final synchronized void i(ett ettVar, boolean z, boolean z2) {
        this.b = ettVar;
        this.c = z;
        this.s = z2;
    }
}

package defpackage;

import java.util.Iterator;
import java.util.Observable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tun extends Observable {
    public final mbc c;
    public final Executor e;
    private final tqj g;
    private final Executor h;
    private final boolean i;
    private final boolean j;
    public final awku d = new awku();
    public volatile long a = -1;
    public volatile tum b = tum.UNKNOWN;
    private final CopyOnWriteArrayList k = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList f = new CopyOnWriteArrayList();

    public tun(mbc mbcVar, tqj tqjVar, Executor executor) {
        this.c = mbcVar;
        this.g = tqjVar;
        this.h = executor;
        this.e = new ahfg(executor);
        int i = tqr.a;
        this.i = tqjVar.k(1073815295);
        this.j = tqjVar.k(88063);
    }

    public final void a(CopyOnWriteArrayList copyOnWriteArrayList, tul tulVar) {
        if (copyOnWriteArrayList.addIfAbsent(tulVar)) {
            tulVar.jn(this.a);
        }
    }

    public final void b(tul tulVar) {
        a(this.k, tulVar);
    }

    public final void c() {
        d(tum.USER_INTERACTION);
    }

    public final void d(tum tumVar) {
        long jB = this.c.b();
        boolean z = this.i;
        if (!z || jB > this.a) {
            this.a = jB;
            if (!this.j) {
                tumVar = tum.UNKNOWN;
            }
            this.b = tumVar;
            CopyOnWriteArrayList copyOnWriteArrayList = this.k;
            if (!copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((tul) it.next()).jn(jB);
                }
            }
            int i = 10;
            if (!this.f.isEmpty()) {
                this.e.execute(new jup(this, jB, i));
            }
            if (z) {
                return;
            }
            setChanged();
            tqj tqjVar = this.g;
            int i2 = tqr.a;
            if (tqjVar.k(1073814182)) {
                this.h.execute(afwl.i(new syd(this, i)));
            } else {
                notifyObservers(Long.valueOf(this.a));
            }
            this.d.kk(Long.valueOf(this.a));
        }
    }

    public final void e(tul tulVar) {
        this.k.remove(tulVar);
        this.e.execute(new sxk(this, tulVar, 18, null));
    }
}

package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avro extends AtomicLong implements avlk, axsq {
    private static final long serialVersionUID = -7370244972039324525L;
    final axsp a;
    axsq f;
    boolean g;
    int h;
    public volatile boolean i;
    long j;
    final int b = 2;
    final int c = 1;
    final AtomicBoolean e = new AtomicBoolean();
    final ArrayDeque d = new ArrayDeque();

    public avro(axsp axspVar) {
        this.a = axspVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.g) {
            atqp.n(th);
            return;
        }
        this.g = true;
        this.d.clear();
        this.a.b(th);
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        if (awka.i(this.f, axsqVar)) {
            this.f = axsqVar;
            this.a.e(this);
        }
    }

    @Override // defpackage.axsq
    public final void kj() {
        this.i = true;
        this.f.kj();
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (this.g) {
            return;
        }
        ArrayDeque arrayDeque = this.d;
        int i = this.h;
        int i2 = i + 1;
        if (i == 0) {
            try {
                arrayDeque.offer(new ArrayList());
            } catch (Throwable th) {
                avkz.a(th);
                kj();
                b(th);
                return;
            }
        }
        Collection collection = (Collection) arrayDeque.peek();
        if (collection != null && collection.size() + 1 == this.b) {
            arrayDeque.poll();
            collection.add(obj);
            this.j++;
            this.a.kk(collection);
        }
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).add(obj);
        }
        if (i2 == this.c) {
            i2 = 0;
        }
        this.h = i2;
    }

    @Override // defpackage.axsp
    public final void kn() {
        long j;
        long j2;
        if (this.g) {
            return;
        }
        this.g = true;
        long j3 = this.j;
        if (j3 != 0) {
            atqp.F(this, j3);
        }
        axsp axspVar = this.a;
        ArrayDeque arrayDeque = this.d;
        if (arrayDeque.isEmpty()) {
            axspVar.kn();
            return;
        }
        if (atqp.s(get(), axspVar, arrayDeque, this, this)) {
            return;
        }
        do {
            j = get();
            if ((j & Long.MIN_VALUE) != 0) {
                return;
            } else {
                j2 = Long.MIN_VALUE | j;
            }
        } while (!compareAndSet(j, j2));
        if (j != 0) {
            atqp.s(j2, axspVar, arrayDeque, this, this);
        }
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        long j2;
        if (awka.h(j)) {
            axsp axspVar = this.a;
            ArrayDeque arrayDeque = this.d;
            do {
                j2 = get();
            } while (!compareAndSet(j2, (j2 & Long.MIN_VALUE) | atqp.D(Long.MAX_VALUE & j2, j)));
            if (j2 == Long.MIN_VALUE) {
                atqp.s(j | Long.MIN_VALUE, axspVar, arrayDeque, this, this);
                return;
            }
            AtomicBoolean atomicBoolean = this.e;
            if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
                this.f.ko(atqp.E(this.c, j));
            } else {
                this.f.ko(atqp.D(this.b, atqp.E(this.c, j - 1)));
            }
        }
    }
}

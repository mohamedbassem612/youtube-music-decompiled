package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avrg extends awma implements Iterator {
    final Semaphore a = new Semaphore(0);
    final AtomicReference b = new AtomicReference();
    avlq c;

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        atqp.n(th);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        avlq avlqVar = this.c;
        if (avlqVar == null) {
            try {
                boolean z = atqp.x;
                this.a.acquire();
                avlq avlqVar2 = (avlq) this.b.getAndSet(null);
                this.c = avlqVar2;
                if (avlqVar2.d()) {
                    throw awkh.b(avlqVar2.c());
                }
            } catch (InterruptedException e) {
                dispose();
                this.c = avlq.a(e);
                throw awkh.b(e);
            }
        } else {
            if (avlqVar.d()) {
                throw awkh.b(avlqVar.c());
            }
            avlqVar.e();
        }
        return this.c.e();
    }

    @Override // defpackage.axsp
    public final /* bridge */ /* synthetic */ void kk(Object obj) {
        if (this.b.getAndSet((avlq) obj) == null) {
            this.a.release();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext() || !this.c.e()) {
            throw new NoSuchElementException();
        }
        Object obj = this.c.b;
        if (obj == null || (obj instanceof awkj)) {
            obj = null;
        }
        this.c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Read-only iterator.");
    }

    @Override // defpackage.axsp
    public final void kn() {
    }
}

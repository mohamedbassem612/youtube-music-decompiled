package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class aghc implements Iterator {
    int b;
    int c = -1;
    int d;
    final /* synthetic */ aghd e;

    public aghc(aghd aghdVar) {
        this.e = aghdVar;
        this.b = aghdVar.a.a();
        this.d = aghdVar.a.d;
    }

    private final void b() {
        if (this.e.a.d != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        b();
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a(this.b);
        int i = this.b;
        this.c = i;
        this.b = this.e.a.e(i);
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        b();
        ahno.P(this.c != -1, "no calls to next() since the last call to remove()");
        aghd aghdVar = this.e;
        aghdVar.b -= (long) aghdVar.a.f(this.c);
        this.b--;
        this.c = -1;
        this.d = aghdVar.a.d;
    }
}

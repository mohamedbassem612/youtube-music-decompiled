package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class agib implements Iterator {
    int b;
    int c;
    int d = -1;
    final /* synthetic */ agif e;

    public agib(agif agifVar) {
        this.e = agifVar;
        this.b = agifVar.e;
        this.c = agifVar.a();
    }

    private final void b() {
        if (this.e.e != this.b) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.c;
        this.d = i;
        Object objA = a(i);
        this.c = this.e.b(this.c);
        return objA;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    @Override // java.util.Iterator
    public final void remove() {
        b();
        ahno.P((this.d ^ (-1)) >>> 31, "no calls to next() since the last call to remove()");
        this.b += 32;
        int i = this.d;
        agif agifVar = this.e;
        agifVar.remove(agifVar.e(i));
        this.c--;
        this.d = -1;
    }
}

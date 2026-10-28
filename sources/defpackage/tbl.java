package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tbl implements Iterator {
    private final Iterator a;
    private Object b;

    public tbl(Iterator it) {
        it.getClass();
        this.a = it;
        b();
    }

    private final void b() {
        Iterator it = this.a;
        this.b = it.hasNext() ? it.next() : null;
    }

    public final Object a() {
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.b;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        b();
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

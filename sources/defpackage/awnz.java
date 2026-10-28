package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awnz implements ListIterator, awrp {
    private final awoa a;
    private int b;
    private int c = -1;
    private int d;

    public awnz(awoa awoaVar, int i) {
        this.a = awoaVar;
        this.b = i;
        this.d = awoaVar.modCount;
    }

    private final void a() {
        if (this.a.modCount != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.b;
        this.b = i + 1;
        awoa awoaVar = this.a;
        awoaVar.add(i, obj);
        this.c = -1;
        this.d = awoaVar.modCount;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        int i = this.b;
        awoa awoaVar = this.a;
        if (i >= awoaVar.b) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        this.c = i;
        return awoaVar.a[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        int i = this.b;
        if (i <= 0) {
            throw new NoSuchElementException();
        }
        int i2 = i - 1;
        this.b = i2;
        this.c = i2;
        return this.a.a[i2];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.c;
        if (i == -1) {
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }
        awoa awoaVar = this.a;
        awoaVar.b(i);
        this.b = this.c;
        this.c = -1;
        this.d = awoaVar.modCount;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.c;
        if (i == -1) {
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
        this.a.set(i, obj);
    }
}

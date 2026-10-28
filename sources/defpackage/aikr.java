package defpackage;

import java.util.ListIterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aikr implements ListIterator, awrp {
    private final /* synthetic */ ListIterator a;

    public aikr(ListIterator listIterator) {
        listIterator.getClass();
        this.a = listIterator;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        a.aF();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a.aw();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a.aF();
    }
}

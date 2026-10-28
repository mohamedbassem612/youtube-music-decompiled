package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agmc implements ListIterator {
    boolean a;
    final /* synthetic */ ListIterator b;
    final /* synthetic */ agmd c;

    public agmc(agmd agmdVar, ListIterator listIterator) {
        this.b = listIterator;
        this.c = agmdVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.b;
        listIterator.add(obj);
        listIterator.previous();
        this.a = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = true;
        return this.b.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.c.a(this.b.nextIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.a = true;
        return this.b.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        ahno.P(this.a, "no calls to next() since the last call to remove()");
        this.b.remove();
        this.a = false;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        ahno.O(this.a);
        this.b.set(obj);
    }
}

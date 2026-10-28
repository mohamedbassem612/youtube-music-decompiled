package defpackage;

import java.util.ListIterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awnu implements ListIterator, awrp {
    final /* synthetic */ awnv a;
    private final ListIterator b;

    public awnu(awnv awnvVar, int i) {
        this.a = awnvVar;
        this.b = awnvVar.a.listIterator(atqq.S(awnvVar, i));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.b;
        listIterator.add(obj);
        listIterator.previous();
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
        return this.b.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return (this.a.a() - 1) - this.b.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.b.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (this.a.a() - 1) - this.b.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.b.remove();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.b.set(obj);
    }
}

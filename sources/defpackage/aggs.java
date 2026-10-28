package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
class aggs implements Iterator {
    final Iterator a;
    final Collection b;
    final /* synthetic */ aggt c;

    public aggs(aggt aggtVar) {
        this.c = aggtVar;
        this.b = aggtVar.b;
        Collection collection = aggtVar.b;
        this.a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    final void a() {
        aggt aggtVar = this.c;
        aggtVar.b();
        if (aggtVar.b != this.b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
        aggt aggtVar = this.c;
        aggtVar.e.b--;
        aggtVar.c();
    }

    public aggs(aggt aggtVar, Iterator it) {
        this.c = aggtVar;
        this.b = aggtVar.b;
        this.a = it;
    }
}

package defpackage;

import j$.lang.Iterable$CC;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ahd implements Collection, j$.util.Collection, awrp {
    public final agu a;

    public ahd(agu aguVar) {
        this.a = aguVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return a.aC();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        return a.aE();
    }

    @Override // java.util.Collection
    public final void clear() {
        a.aw();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.b(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.b(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.c();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return awqx.c(new age(this, (awoq) null, 2));
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return j$.util.Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return a.aC();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return a.aE();
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return a.aE();
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return this.a.e;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.Collection.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return j$.util.Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return awqw.b(this, objArr);
    }

    public final String toString() {
        return atqq.aD(this, null, "[", "]", null, 57);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return awqw.a(this);
    }
}

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
/* JADX INFO: loaded from: classes4.dex */
public class aikp implements Collection, j$.util.Collection, awrp {
    private final Collection a;

    public aikp(Collection collection) {
        collection.getClass();
        this.a = collection;
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
    public boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.a.containsAll(collection);
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new aikq(this.a.iterator());
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
        return this.a.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ Spliterator spliterator() {
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

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return awqw.a(this);
    }
}

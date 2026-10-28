package defpackage;

import j$.lang.Iterable$CC;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aikl implements List, j$.util.List, awrp {
    private final Function0 a;
    private List b;

    public aikl(List list) {
        Function0 function0 = aikn.a;
        awro.c(function0, 0);
        this.a = function0;
        this.b = list;
    }

    private final List a() {
        List list = this.b;
        if (list != null) {
            return list;
        }
        List list2 = (List) this.a.invoke();
        this.b = list2;
        return list2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        a.aw();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return a().contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return a().containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return awrc.c(a(), obj);
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return a().get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return a().hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return a().indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new aikq(a().iterator());
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return a().lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new aikr(a().listIterator());
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return j$.util.Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return a.aE();
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return j$.util.Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return a.aE();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return a().size();
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return j$.util.Collection.CC.$default$stream(this);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return a().subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return awqw.b(this, objArr);
    }

    public final String toString() {
        return a().toString();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        return a.aC();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return a.aE();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return a.aC();
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return awqw.a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new aikr(a().listIterator(i));
    }
}

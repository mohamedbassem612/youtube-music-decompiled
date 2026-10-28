package j$.util.concurrent;

import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class q extends ConcurrentHashMap.CollectionView implements Collection {
    private static final long serialVersionUID = 2249069246763182397L;

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        j[] jVarArr = this.a.a;
        if (jVarArr == null) {
            return;
        }
        n nVar = new n(jVarArr, jVarArr.length, 0, jVarArr.length);
        while (true) {
            j jVarA = nVar.a();
            if (jVarA == null) {
                return;
            } else {
                consumer.r(jVarA.c);
            }
        }
    }

    @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.a;
        j[] jVarArr = concurrentHashMap.a;
        int length = jVarArr == null ? 0 : jVarArr.length;
        return new g(jVarArr, length, length, concurrentHashMap, (byte) 1);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
    public final boolean remove(Object obj) {
        a aVar;
        if (obj != null) {
            Object it = iterator();
            do {
                aVar = (a) it;
                if (aVar.hasNext()) {
                }
            } while (!obj.equals(((g) it).next()));
            aVar.remove();
            return true;
        }
        return false;
    }

    @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        Object it = iterator();
        boolean z = false;
        while (true) {
            a aVar = (a) it;
            if (!aVar.hasNext()) {
                return z;
            }
            if (collection.contains(((g) it).next())) {
                aVar.remove();
                z = true;
            }
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        ConcurrentHashMap concurrentHashMap = this.a;
        predicate.getClass();
        j[] jVarArr = concurrentHashMap.a;
        boolean z = false;
        if (jVarArr != null) {
            n nVar = new n(jVarArr, jVarArr.length, 0, jVarArr.length);
            while (true) {
                j jVarA = nVar.a();
                if (jVarA == null) {
                    break;
                }
                Object obj = jVarA.b;
                Object obj2 = jVarA.c;
                if (predicate.test(obj2) && concurrentHashMap.g(obj, null, obj2) != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final Spliterator spliterator() {
        ConcurrentHashMap concurrentHashMap = this.a;
        long j = concurrentHashMap.j();
        j[] jVarArr = concurrentHashMap.a;
        int length = jVarArr == null ? 0 : jVarArr.length;
        return new h(jVarArr, length, 0, length, j < 0 ? 0L : j, (byte) 1);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }
}

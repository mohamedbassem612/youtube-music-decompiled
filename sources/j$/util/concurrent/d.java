package j$.util.concurrent;

import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class d extends ConcurrentHashMap.CollectionView implements Set, j$.util.Set {
    private static final long serialVersionUID = 2249069246763182397L;

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return this.a.f(entry.getKey(), entry.getValue(), false) == null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (this.a.f(entry.getKey(), entry.getValue(), false) == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        Object obj2;
        Object value;
        return (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = this.a.get(key)) == null || (value = entry.getValue()) == null || (value != obj2 && !value.equals(obj2))) ? false : true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Set set;
        return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
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
                consumer.r(new i(jVarA.b, jVarA.c, this.a));
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        j[] jVarArr = this.a.a;
        int iHashCode = 0;
        if (jVarArr != null) {
            n nVar = new n(jVarArr, jVarArr.length, 0, jVarArr.length);
            while (true) {
                j jVarA = nVar.a();
                if (jVarA == null) {
                    break;
                }
                iHashCode += jVarA.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.a;
        j[] jVarArr = concurrentHashMap.a;
        int length = jVarArr == null ? 0 : jVarArr.length;
        return new c(jVarArr, length, length, concurrentHashMap);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return j$.util.Collection.CC.$default$parallelStream(this);
    }

    @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && this.a.remove(key, value);
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
                if (predicate.test(new AbstractMap.SimpleImmutableEntry(obj, obj2)) && concurrentHashMap.g(obj, null, obj2) != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Set, j$.util.Collection, j$.lang.a
    public final Spliterator spliterator() {
        ConcurrentHashMap concurrentHashMap = this.a;
        long j = concurrentHashMap.j();
        j[] jVarArr = concurrentHashMap.a;
        int length = jVarArr == null ? 0 : jVarArr.length;
        return new e(jVarArr, length, 0, length, j < 0 ? 0L : j, concurrentHashMap);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return j$.util.Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }
}

package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class awng implements Map, j$.util.Map, awrp {
    protected awng() {
    }

    private final Map.Entry d(Object obj) {
        Object next;
        Iterator it = b().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (awrc.c(((Map.Entry) next).getKey(), obj)) {
                return (Map.Entry) next;
            }
        }
        next = null;
        return (Map.Entry) next;
    }

    public Collection a() {
        throw null;
    }

    public abstract Set b();

    public Set c() {
        throw null;
    }

    @Override // java.util.Map
    public final void clear() {
        a.aw();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        return a.bs();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        return a.bs();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set setB = b();
        if (setB.isEmpty()) {
            return false;
        }
        Iterator it = setB.iterator();
        while (it.hasNext()) {
            if (awrc.c(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public final String e(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return b();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.size() == 0) {
                Set<Map.Entry> setEntrySet = map.entrySet();
                if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
                    return true;
                }
                for (Map.Entry entry : setEntrySet) {
                    if (entry != null) {
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = get(key);
                        if (!awrc.c(value, obj2) || (obj2 == null && !containsKey(key))) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map, java.util.HashMap
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        Map.Entry entryD = d(obj);
        if (entryD != null) {
            return entryD.getValue();
        }
        return null;
    }

    @Override // java.util.Map, j$.util.Map, java.util.HashMap
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return b().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return c();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return a.bs();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        return a.bs();
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map, java.util.HashMap
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return 0;
    }

    public final String toString() {
        return atqq.aD(b(), ", ", "{", "}", new awnf(this, 0), 24);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return a();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return a.bs();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        return a.bs();
    }
}

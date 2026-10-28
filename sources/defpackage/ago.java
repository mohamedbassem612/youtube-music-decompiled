package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ago implements Map, j$.util.Map, awrp {
    private final agu a;
    private afy b;
    private agf c;
    private ahd d;

    public ago(agu aguVar) {
        this.a = aguVar;
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
    public final boolean containsKey(Object obj) {
        return agu.d(this.a, obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.a.b(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        afy afyVar = this.b;
        if (afyVar != null) {
            return afyVar;
        }
        afy afyVar2 = new afy(this.a);
        this.b = afyVar2;
        return afyVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return awrc.c(this.a, ((ago) obj).a);
    }

    @Override // java.util.Map, j$.util.Map, java.util.HashMap
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.a.a(obj);
    }

    @Override // java.util.Map, j$.util.Map, java.util.HashMap
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.a.c();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        agf agfVar = this.c;
        if (agfVar != null) {
            return agfVar;
        }
        agf agfVar2 = new agf(this.a);
        this.c = agfVar2;
        return agfVar2;
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
        return this.a.e;
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        ahd ahdVar = this.d;
        if (ahdVar != null) {
            return ahdVar;
        }
        ahd ahdVar2 = new ahd(this.a);
        this.d = ahdVar2;
        return ahdVar2;
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

package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aggj extends AbstractMap {
    final transient Map a;
    final /* synthetic */ aggz b;

    public aggj(aggz aggzVar, Map map) {
        this.b = aggzVar;
        this.a = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Collection get(Object obj) {
        Object obj2;
        Map map = this.a;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            return this.b.e(obj, collection);
        }
        return null;
    }

    final Map.Entry b(Map.Entry entry) {
        Object key = entry.getKey();
        return new AbstractMap.SimpleImmutableEntry(key, this.b.e(key, (Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.a;
        aggz aggzVar = this.b;
        if (map == aggzVar.a) {
            aggzVar.r();
        } else {
            aguu.E(new aggi(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.a;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new aggh(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.a.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.b.q();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.a.remove(obj);
        if (collection == null) {
            return null;
        }
        aggz aggzVar = this.b;
        Collection collectionA = aggzVar.a();
        collectionA.addAll(collection);
        aggzVar.b -= collection.size();
        collection.clear();
        return collectionA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.a.toString();
    }
}

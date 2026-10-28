package j$.util.concurrent;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class i implements Map.Entry {
    public final Object a;
    public Object b;
    public final ConcurrentHashMap c;

    public i(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.a = obj;
        this.b = obj2;
        this.c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.a) || key.equals(obj2)) && (value == (obj3 = this.b) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.b;
        this.b = obj;
        this.c.put(this.a, obj);
        return obj2;
    }

    public final String toString() {
        return j$.desugar.sun.nio.fs.g.M(this.a, this.b);
    }
}

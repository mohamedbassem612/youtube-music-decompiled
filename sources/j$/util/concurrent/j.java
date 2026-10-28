package j$.util.concurrent;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public class j implements Map.Entry {
    public final int a;
    public final Object b;
    public volatile Object c;
    public volatile j d;

    public j(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public j a(int i, Object obj) {
        do {
            if (this.a == i) {
                Object obj2 = this.b;
                if (obj2 == obj) {
                    return this;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return this;
                }
            }
            this = this.d;
        } while (this != null);
        return null;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.b) || key.equals(obj2)) && (value == (obj3 = this.c) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.b.hashCode() ^ this.c.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return j$.desugar.sun.nio.fs.g.M(this.b, this.c);
    }

    public j(int i, Object obj, Object obj2, j jVar) {
        this(i, obj, obj2);
        this.d = jVar;
    }
}

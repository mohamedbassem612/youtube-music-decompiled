package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class agja extends agjb implements Map {
    protected agja() {
    }

    @Override // defpackage.agjb
    protected /* bridge */ /* synthetic */ Object a() {
        throw null;
    }

    protected abstract Map b();

    @Override // java.util.Map
    public final void clear() {
        b().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return b().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return b().containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        return b().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || b().equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return b().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return b().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return b().isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return b().keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return b().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return b().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return b().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return b().values();
    }
}

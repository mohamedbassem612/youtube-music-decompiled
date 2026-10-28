package defpackage;

import j$.util.Objects;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
abstract class agoe extends agqg {
    public abstract Map a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        try {
            obj2 = a().get(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        if (Objects.equals(obj2, entry.getValue())) {
            return obj2 != null || a().containsKey(key);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return a().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // defpackage.agqg, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return ahng.am(this, collection);
        } catch (UnsupportedOperationException unused) {
            return ahng.an(this, collection.iterator());
        }
    }

    @Override // defpackage.agqg, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSetAg = ahng.ag(collection.size());
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSetAg.add(((Map.Entry) obj).getKey());
                }
            }
            return a().keySet().retainAll(hashSetAg);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return a().size();
    }
}

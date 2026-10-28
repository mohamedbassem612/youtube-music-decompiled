package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
class aggm extends agoi {
    final /* synthetic */ aggz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aggm(aggz aggzVar, Map map) {
        super(map);
        this.a = aggzVar;
    }

    @Override // defpackage.agoi, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        aguu.E(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.d.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.d.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.keySet().hashCode();
    }

    @Override // defpackage.agoi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new aggl(this, this.d.entrySet().iterator());
    }

    @Override // defpackage.agoi, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.d.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.a.b -= size;
            if (size > 0) {
                return true;
            }
        }
        return false;
    }
}

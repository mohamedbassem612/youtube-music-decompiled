package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class txr extends AbstractSet {
    final /* synthetic */ txy a;

    public txr(txy txyVar) {
        this.a = txyVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        txw txwVarA;
        if (!(obj instanceof Map.Entry) || (txwVarA = this.a.a(((Map.Entry) obj).getKey())) == null || (txwVarA.get() == null && !txwVarA.b)) {
            return false;
        }
        return obj.equals(txwVarA);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new txx(this.a, new txq());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        this.a.remove(((Map.Entry) obj).getKey());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}

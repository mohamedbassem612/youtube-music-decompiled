package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aggh extends agoe {
    final /* synthetic */ aggj a;

    public aggh(aggj aggjVar) {
        this.a = aggjVar;
    }

    @Override // defpackage.agoe
    public final Map a() {
        return this.a;
    }

    @Override // defpackage.agoe, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return aguu.ae(this.a.a.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new aggi(this.a);
    }

    @Override // defpackage.agoe, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object objRemove;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        aggj aggjVar = this.a;
        Object key = entry.getKey();
        aggz aggzVar = aggjVar.b;
        Map map = aggzVar.a;
        map.getClass();
        try {
            objRemove = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            aggzVar.b -= size;
        }
        return true;
    }
}

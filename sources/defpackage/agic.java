package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agic extends AbstractSet {
    final /* synthetic */ agif a;

    public agic(agif agifVar) {
        this.a = agifVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        agif agifVar = this.a;
        Map mapJ = agifVar.j();
        return mapJ != null ? mapJ.keySet().iterator() : new aghx(agifVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        agif agifVar = this.a;
        Map mapJ = agifVar.j();
        if (mapJ != null) {
            return mapJ.keySet().remove(obj);
        }
        return agifVar.f(obj) != agif.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}

package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agod extends AbstractMap {
    public final Set a;
    final agek b;

    public agod(Set set, agek agekVar) {
        this.a = set;
        this.b = agekVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new agoc(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (aguu.ae(this.a, obj)) {
            return this.b.apply(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new agoa(this.a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (this.a.remove(obj)) {
            return this.b.apply(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new aghw(this.a, this.b);
    }
}

package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class aggz extends aghh implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map a;
    public transient int b;

    public aggz(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.a = map;
    }

    public abstract Collection a();

    public Collection b() {
        throw null;
    }

    @Override // defpackage.agom
    public Collection c(Object obj) {
        Collection collectionI = (Collection) this.a.get(obj);
        if (collectionI == null) {
            collectionI = i(obj);
        }
        return e(obj, collectionI);
    }

    public abstract Collection d(Collection collection);

    public abstract Collection e(Object obj, Collection collection);

    @Override // defpackage.agom
    public final int h() {
        return this.b;
    }

    public Collection i(Object obj) {
        return a();
    }

    @Override // defpackage.agom
    public Collection j() {
        return this instanceof agpv ? new aghf(this) : new agot(this);
    }

    @Override // defpackage.aghh
    public final Iterator k() {
        return new aggg(this);
    }

    @Override // defpackage.aghh
    public final Iterator l() {
        return new aggf(this);
    }

    final List m(Object obj, List list, aggt aggtVar) {
        return list instanceof RandomAccess ? new aggp(this, obj, list, aggtVar) : new aggv(this, obj, list, aggtVar);
    }

    @Override // defpackage.agom
    public Map n() {
        return new aggj(this, this.a);
    }

    final Map o() {
        Map map = this.a;
        if (map instanceof NavigableMap) {
            return new aggn(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new aggq(this, (SortedMap) map) : new aggj(this, map);
    }

    final Set p() {
        Map map = this.a;
        if (map instanceof NavigableMap) {
            return new aggo(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new aggr(this, (SortedMap) map) : new aggm(this, map);
    }

    @Override // defpackage.agom
    public Set q() {
        return new aggm(this, this.a);
    }

    @Override // defpackage.agom
    public final void r() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.a.clear();
        this.b = 0;
    }

    final void s(Map map) {
        this.a = map;
        this.b = 0;
        for (Collection collection : map.values()) {
            ahno.F(!collection.isEmpty());
            this.b += collection.size();
        }
    }

    @Override // defpackage.agom
    public final boolean t(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.aghh, defpackage.agom
    public final void u(Object obj, Object obj2) {
        Collection collection = (Collection) this.a.get(obj);
        if (collection != null) {
            if (collection.add(obj2)) {
                this.b++;
            }
        } else {
            Collection collectionI = i(obj);
            if (!collectionI.add(obj2)) {
                throw new AssertionError("New Collection violated the Collection spec");
            }
            this.b++;
            this.a.put(obj, collectionI);
        }
    }
}

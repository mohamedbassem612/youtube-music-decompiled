package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aggn extends aggq implements NavigableMap {
    final /* synthetic */ aggz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aggn(aggz aggzVar, NavigableMap navigableMap) {
        super(aggzVar, navigableMap);
        this.c = aggzVar;
    }

    final Map.Entry c(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        aggz aggzVar = this.c;
        Collection collectionA = aggzVar.a();
        collectionA.addAll((Collection) entry.getValue());
        it.remove();
        return new AbstractMap.SimpleImmutableEntry(entry.getKey(), aggzVar.d(collectionA));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = f().ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return b(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return f().ceilingKey(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.aggq
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final NavigableMap f() {
        return (NavigableMap) super.f();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return ((aggn) descendingMap()).g();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new aggn(this.c, f().descendingMap());
    }

    @Override // defpackage.aggq, defpackage.aggj, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final NavigableSet keySet() {
        return new aggo(this.c, f());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = f().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return b(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = f().floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return b(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return f().floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new aggn(this.c, f().headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = f().higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return b(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return f().higherKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = f().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return b(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = f().lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return b(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return f().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return g();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return c(new aggh(this).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return c(new aggh((aggj) descendingMap()).iterator());
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new aggn(this.c, f().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new aggn(this.c, f().tailMap(obj, z));
    }

    @Override // defpackage.aggq, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // defpackage.aggq, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // defpackage.aggq, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}

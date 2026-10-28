package defpackage;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aggo extends aggr implements NavigableSet {
    final /* synthetic */ aggz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aggo(aggz aggzVar, NavigableMap navigableMap) {
        super(aggzVar, navigableMap);
        this.b = aggzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.aggr
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final NavigableMap b() {
        return (NavigableMap) super.b();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return b().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new aggo(this.b, b().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return b().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new aggo(this.b, b().headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return b().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return b().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return aguu.D(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return aguu.D(descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new aggo(this.b, b().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new aggo(this.b, b().tailMap(obj, z));
    }

    @Override // defpackage.aggr, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // defpackage.aggr, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // defpackage.aggr, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}

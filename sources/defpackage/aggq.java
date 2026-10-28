package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class aggq extends aggj implements SortedMap {
    final /* synthetic */ aggz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aggq(aggz aggzVar, SortedMap sortedMap) {
        super(aggzVar, sortedMap);
        this.d = aggzVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return f().comparator();
    }

    public SortedMap f() {
        return (SortedMap) this.a;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return f().firstKey();
    }

    @Override // defpackage.aggj, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g */
    public SortedSet keySet() {
        return new aggr(this.d, f());
    }

    public SortedMap headMap(Object obj) {
        return new aggq(this.d, f().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return f().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new aggq(this.d, f().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new aggq(this.d, f().tailMap(obj));
    }
}

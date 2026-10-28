package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class aggr extends aggm implements SortedSet {
    final /* synthetic */ aggz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aggr(aggz aggzVar, SortedMap sortedMap) {
        super(aggzVar, sortedMap);
        this.c = aggzVar;
    }

    public SortedMap b() {
        return (SortedMap) this.d;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return b().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new aggr(this.c, b().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new aggr(this.c, b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new aggr(this.c, b().tailMap(obj));
    }
}

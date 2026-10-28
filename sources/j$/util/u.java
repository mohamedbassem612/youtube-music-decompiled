package j$.util;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class u extends t implements java.util.SortedSet, SortedSet {
    private static final long serialVersionUID = -4929149591599911165L;
    public final java.util.SortedSet b;

    public u(java.util.SortedSet sortedSet) {
        super(sortedSet);
        this.b = sortedSet;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.b.comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.b.first();
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet headSet(Object obj) {
        return new u(this.b.headSet(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.b.last();
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet subSet(Object obj, Object obj2) {
        return new u(this.b.subSet(obj, obj2));
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet tailSet(Object obj) {
        return new u(this.b.tailSet(obj));
    }
}

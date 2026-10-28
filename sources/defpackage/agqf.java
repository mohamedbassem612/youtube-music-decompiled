package defpackage;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agqf extends agqe implements SortedSet {
    public agqf(SortedSet sortedSet, agex agexVar) {
        super(sortedSet, agexVar);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return aguu.A(this.a.iterator(), this.b);
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new agqf(((SortedSet) this.a).headSet(obj), this.b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.a;
        while (true) {
            agex agexVar = this.b;
            Object objLast = sortedSetHeadSet.last();
            if (agexVar.a(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new agqf(((SortedSet) this.a).subSet(obj, obj2), this.b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new agqf(((SortedSet) this.a).tailSet(obj), this.b);
    }
}

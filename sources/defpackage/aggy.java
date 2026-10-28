package defpackage;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class aggy extends aggt implements SortedSet {
    final /* synthetic */ aggz g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aggy(aggz aggzVar, Object obj, SortedSet sortedSet, aggt aggtVar) {
        super(aggzVar, obj, sortedSet, aggtVar);
        this.g = aggzVar;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return e().comparator();
    }

    public SortedSet e() {
        return (SortedSet) this.b;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        b();
        return e().first();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        b();
        SortedSet sortedSetHeadSet = e().headSet(obj);
        aggt aggtVar = this.c;
        if (aggtVar == null) {
            aggtVar = this;
        }
        return new aggy(this.g, this.a, sortedSetHeadSet, aggtVar);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        b();
        return e().last();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        b();
        SortedSet sortedSetSubSet = e().subSet(obj, obj2);
        aggt aggtVar = this.c;
        if (aggtVar == null) {
            aggtVar = this;
        }
        return new aggy(this.g, this.a, sortedSetSubSet, aggtVar);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        b();
        SortedSet sortedSetTailSet = e().tailSet(obj);
        aggt aggtVar = this.c;
        if (aggtVar == null) {
            aggtVar = this;
        }
        return new aggy(this.g, this.a, sortedSetTailSet, aggtVar);
    }
}

package defpackage;

import java.util.Iterator;
import java.util.NavigableSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aggw extends aggy implements NavigableSet {
    final /* synthetic */ aggz f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aggw(aggz aggzVar, Object obj, NavigableSet navigableSet, aggt aggtVar) {
        super(aggzVar, obj, navigableSet, aggtVar);
        this.f = aggzVar;
    }

    private final NavigableSet f(NavigableSet navigableSet) {
        aggt aggtVar = this.c;
        if (aggtVar == null) {
            aggtVar = this;
        }
        return new aggw(this.f, this.a, navigableSet, aggtVar);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return e().ceiling(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.aggy
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final NavigableSet e() {
        return (NavigableSet) super.e();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return new aggs(this, e().descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return f(e().descendingSet());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return e().floor(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return f(e().headSet(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return e().higher(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return e().lower(obj);
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
        return f(e().subSet(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return f(e().tailSet(obj, z));
    }
}

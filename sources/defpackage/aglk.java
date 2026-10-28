package defpackage;

import j$.util.SortedSet;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Comparator;
import java.util.NavigableSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class aglk extends agkz implements NavigableSet, SortedSet, agqk {
    private static final long serialVersionUID = 912559;
    final transient Comparator a;
    transient aglk b;

    public aglk(Comparator comparator) {
        this.a = comparator;
    }

    static agps E(Comparator comparator) {
        return agpb.a.equals(comparator) ? agps.c : new agps(agpi.a, comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final aglk subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        ahno.F(this.a.compare(obj, obj2) <= 0);
        return B(obj, z, obj2, z2);
    }

    public abstract aglk B(Object obj, boolean z, Object obj2, boolean z2);

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final aglk tailSet(Object obj, boolean z) {
        obj.getClass();
        return D(obj, z);
    }

    public abstract aglk D(Object obj, boolean z);

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public abstract agqr descendingIterator();

    final int a(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Deprecated
    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        return aguu.J(tailSet(obj, true), null);
    }

    @Override // java.util.SortedSet, defpackage.agqk
    public final Comparator comparator() {
        return this.a;
    }

    @Override // java.util.SortedSet
    public Object first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        return aguu.B(headSet(obj, true).descendingIterator(), null);
    }

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ java.util.SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        return aguu.J(tailSet(obj, false), null);
    }

    @Override // defpackage.agkz, defpackage.agjw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: k */
    public abstract agqr iterator();

    @Override // java.util.SortedSet
    public Object last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        return aguu.B(headSet(obj, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ java.util.SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ java.util.SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    public abstract aglk w();

    @Override // defpackage.agkz, defpackage.agjw
    public Object writeReplace() {
        return new aglj(this.a, toArray());
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final aglk descendingSet() {
        aglk aglkVar = this.b;
        if (aglkVar != null) {
            return aglkVar;
        }
        aglk aglkVarW = w();
        this.b = aglkVarW;
        aglkVarW.b = this;
        return aglkVarW;
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final aglk headSet(Object obj, boolean z) {
        obj.getClass();
        return z(obj, z);
    }

    public abstract aglk z(Object obj, boolean z);
}

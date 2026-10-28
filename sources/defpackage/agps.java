package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agps extends aglk {
    public static final agps c = new agps(agpi.a, agpb.a);
    final transient agke d;

    public agps(agke agkeVar, Comparator comparator) {
        super(comparator);
        this.d = agkeVar;
    }

    @Override // defpackage.aglk
    public final aglk B(Object obj, boolean z, Object obj2, boolean z2) {
        return D(obj, z).z(obj2, z2);
    }

    @Override // defpackage.aglk
    public final aglk D(Object obj, boolean z) {
        return I(H(obj, z), size());
    }

    @Override // defpackage.aglk, java.util.NavigableSet
    /* JADX INFO: renamed from: F */
    public final agqr descendingIterator() {
        return this.d.a().listIterator(0);
    }

    final int G(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.d, obj, ((aglk) this).a);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    final int H(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.d, obj, ((aglk) this).a);
        if (iBinarySearch >= 0) {
            return !z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    final agps I(int i, int i2) {
        if (i == 0) {
            if (i2 == size()) {
                return this;
            }
            i = 0;
        }
        if (i >= i2) {
            return E(this.a);
        }
        agke agkeVar = this.d;
        return new agps(agkeVar.subList(i, i2), this.a);
    }

    @Override // defpackage.agjw
    public final int b(Object[] objArr, int i) {
        return this.d.b(objArr, i);
    }

    @Override // defpackage.aglk, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iH = H(obj, true);
        if (iH == size()) {
            return null;
        }
        return this.d.get(iH);
    }

    @Override // defpackage.agjw, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return Collections.binarySearch(this.d, obj, this.a) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof agow) {
            collection = ((agow) collection).i();
        }
        if (!agvp.g(((aglk) this).a, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        agqr it = iterator();
        Iterator it2 = collection.iterator();
        if (it.hasNext()) {
            Object next = it2.next();
            Object next2 = it.next();
            while (true) {
                try {
                    int iA = a(next2, next);
                    if (iA >= 0) {
                        if (iA != 0) {
                            break;
                        }
                        if (!it2.hasNext()) {
                            return true;
                        }
                        next = it2.next();
                    } else {
                        if (!it.hasNext()) {
                            break;
                        }
                        next2 = it.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // defpackage.agjw
    public final int d() {
        return this.d.d();
    }

    @Override // defpackage.agjw
    public final int e() {
        return this.d.e();
    }

    @Override // defpackage.agkz, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                if (!agvp.g(this.a, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    agqr it2 = iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        Object next2 = it.next();
                        if (next2 == null || a(next, next2) != 0) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override // defpackage.aglk, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d.get(0);
    }

    @Override // defpackage.aglk, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iG = G(obj, true) - 1;
        if (iG == -1) {
            return null;
        }
        return this.d.get(iG);
    }

    @Override // defpackage.agkz, defpackage.agjw
    public final agke g() {
        return this.d;
    }

    @Override // defpackage.aglk, java.util.NavigableSet
    public final Object higher(Object obj) {
        int iH = H(obj, false);
        if (iH == size()) {
            return null;
        }
        return this.d.get(iH);
    }

    @Override // defpackage.aglk, defpackage.agkz, defpackage.agjw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: k */
    public final agqr iterator() {
        return this.d.listIterator(0);
    }

    @Override // defpackage.agjw
    public final boolean l() {
        return this.d.l();
    }

    @Override // defpackage.aglk, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d.get(size() - 1);
    }

    @Override // defpackage.aglk, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iG = G(obj, false) - 1;
        if (iG == -1) {
            return null;
        }
        return this.d.get(iG);
    }

    @Override // defpackage.agjw
    public final Object[] m() {
        return this.d.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }

    @Override // defpackage.aglk
    public final aglk w() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.a);
        return isEmpty() ? E(comparatorReverseOrder) : new agps(this.d.a(), comparatorReverseOrder);
    }

    @Override // defpackage.aglk, defpackage.agkz, defpackage.agjw
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // defpackage.aglk
    public final aglk z(Object obj, boolean z) {
        return I(0, G(obj, z));
    }
}

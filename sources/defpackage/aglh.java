package defpackage;

import j$.util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aglh extends agkj implements NavigableMap, Map {
    public static final Comparator b;
    private static final aglh e;
    private static final long serialVersionUID = 0;
    public final transient agps c;
    public final transient agke d;
    private final transient aglh f;

    static {
        agpb agpbVar = agpb.a;
        b = agpbVar;
        e = new aglh(aglk.E(agpbVar), agpi.a, null);
    }

    public aglh(agps agpsVar, agke agkeVar, aglh aglhVar) {
        this.c = agpsVar;
        this.d = agkeVar;
        this.f = aglhVar;
    }

    public static aglh a(Comparator comparator) {
        return agpb.a.equals(comparator) ? e : new aglh(aglk.E(comparator), agpi.a, null);
    }

    public static aglh c(Comparator comparator, Object obj, Object obj2) {
        return new aglh(new agps(agke.q(obj), comparator), agke.q(obj2), null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    private final aglh w(int i, int i2) {
        if (i == 0) {
            if (i2 == size()) {
                return this;
            }
            i = 0;
        }
        if (i == i2) {
            return a(comparator());
        }
        return new aglh(this.c.I(i, i2), this.d.subList(i, i2), null);
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aglh headMap(Object obj, boolean z) {
        obj.getClass();
        return w(0, this.c.G(obj, z));
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return aguu.m(ceilingEntry(obj));
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return ((aglk) this.c).a;
    }

    @Override // defpackage.agkj
    /* JADX INFO: renamed from: d */
    public final agjw values() {
        return this.d;
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableSet descendingKeySet() {
        return this.c.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        aglh aglhVar = this.f;
        if (aglhVar != null) {
            return aglhVar;
        }
        if (!isEmpty()) {
            return new aglh((agps) this.c.descendingSet(), this.d.a(), this);
        }
        Comparator comparator = comparator();
        return a((comparator instanceof agpd ? (agpd) comparator : new agii(comparator)).a());
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final aglh subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        ahno.M(comparator().compare(obj, obj2) <= 0, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return headMap(obj2, z2).tailMap(obj, z);
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (java.util.Map.Entry) entrySet().g().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.c.first();
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return aguu.m(floorEntry(obj));
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000f  */
    @Override // defpackage.agkj, java.util.Map
    public final Object get(Object obj) {
        int iBinarySearch;
        agps agpsVar = this.c;
        if (obj != null) {
            try {
                iBinarySearch = Collections.binarySearch(agpsVar.d, obj, agpsVar.a);
                if (iBinarySearch < 0) {
                    iBinarySearch = -1;
                }
            } catch (ClassCastException unused) {
            }
        } else {
            iBinarySearch = -1;
        }
        if (iBinarySearch == -1) {
            return null;
        }
        return this.d.get(iBinarySearch);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return aguu.m(higherEntry(obj));
    }

    @Override // defpackage.agkj, java.util.Map
    public final /* synthetic */ Set keySet() {
        return this.c;
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (java.util.Map.Entry) entrySet().g().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.c.last();
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return aguu.m(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.c;
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final java.util.Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final java.util.Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.agkj, java.util.Map
    /* JADX INFO: renamed from: s */
    public final agkz entrySet() {
        return isEmpty() ? agpr.a : new aglf(this);
    }

    @Override // java.util.Map
    public final int size() {
        return this.d.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // defpackage.agkj
    /* JADX INFO: renamed from: t */
    public final /* synthetic */ agkz keySet() {
        return this.c;
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // defpackage.agkj
    public final boolean u() {
        return this.c.l() || this.d.l();
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final aglh tailMap(Object obj, boolean z) {
        obj.getClass();
        return w(this.c.H(obj, z), size());
    }

    @Override // defpackage.agkj, java.util.Map
    public final /* synthetic */ Collection values() {
        return this.d;
    }

    @Override // defpackage.agkj
    public Object writeReplace() {
        return new aglg(this);
    }
}

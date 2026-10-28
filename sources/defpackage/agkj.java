package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class agkj implements Map, Serializable, j$.util.Map {
    public static final Map.Entry[] a = new Map.Entry[0];
    private static final long serialVersionUID = 912559;

    public static agkh f(int i) {
        aguu.ag(i, "expectedSize");
        return new agkh(i);
    }

    public static agkj g(Iterable iterable) {
        agkh agkhVar = new agkh(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        agkhVar.h(iterable);
        return agkhVar.d(true);
    }

    public static agkj h(Map map) {
        if ((map instanceof agkj) && !(map instanceof SortedMap)) {
            agkj agkjVar = (agkj) map;
            if (!agkjVar.u()) {
                return agkjVar;
            }
        }
        return g(map.entrySet());
    }

    public static agkj i() {
        return agpn.b;
    }

    public static agkj j(Object obj, Object obj2) {
        aguu.af(obj, obj2);
        return agpn.a(1, new Object[]{obj, obj2}, null);
    }

    public static agkj k(Object obj, Object obj2, Object obj3, Object obj4) {
        aguu.af(obj, obj2);
        aguu.af(obj3, obj4);
        return agpn.a(2, new Object[]{obj, obj2, obj3, obj4}, null);
    }

    public static agkj l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        aguu.af(obj, obj2);
        aguu.af(obj3, obj4);
        aguu.af(obj5, obj6);
        return agpn.a(3, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}, null);
    }

    public static agkj m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        aguu.af(obj, obj2);
        aguu.af(obj3, obj4);
        aguu.af(obj5, obj6);
        aguu.af(obj7, obj8);
        return agpn.a(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}, null);
    }

    public static agkj n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        aguu.af(obj, obj2);
        aguu.af(obj3, obj4);
        aguu.af(obj5, obj6);
        aguu.af(obj7, obj8);
        aguu.af(obj9, obj10);
        return agpn.a(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10}, null);
    }

    public static agkj o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        return agpn.a(6, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12}, null);
    }

    public static agkj p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        return agpn.a(7, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14}, null);
    }

    public static agkj q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18) {
        return agpn.a(9, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18}, null);
    }

    @SafeVarargs
    public static agkj r(Map.Entry... entryArr) {
        return g(Arrays.asList(entryArr));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return j$.util.Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return j$.util.Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return j$.util.Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public abstract agjw values();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return aguu.q(this, obj);
    }

    @Override // java.util.Map, j$.util.Map, java.util.HashMap
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map, java.util.HashMap
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return ahng.ab(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, java.util.HashMap
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public abstract agkz entrySet();

    @Override // java.util.Map
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public abstract agkz keySet();

    public final String toString() {
        return aguu.n(this);
    }

    public abstract boolean u();

    public Object writeReplace() {
        return new agki(this);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$remove(this, obj, obj2);
    }
}

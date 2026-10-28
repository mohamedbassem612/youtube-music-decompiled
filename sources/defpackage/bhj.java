package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhj {
    public final ci a;
    private final Map b;

    public bhj(Map map, boolean z) {
        this.b = map;
        this.a = new ci(z);
    }

    public final bhj a() {
        return new bhj(new LinkedHashMap(c()), true);
    }

    public final Object b(bhi bhiVar) {
        Object obj = this.b.get(bhiVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        bArrCopyOf.getClass();
        return bArrCopyOf;
    }

    public final Map c() {
        awml awmlVar;
        Set<Map.Entry> setEntrySet = this.b.entrySet();
        int iU = atqq.u(atqq.N(setEntrySet, 10));
        if (iU < 16) {
            iU = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iU);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                bArrCopyOf.getClass();
                awmlVar = new awml(key, bArrCopyOf);
            } else {
                awmlVar = new awml(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(awmlVar.a, awmlVar.b);
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    public final void d() {
        if (((AtomicBoolean) this.a.a).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void e(bhi bhiVar, Object obj) {
        bhiVar.getClass();
        d();
        if (obj == null) {
            g(bhiVar);
            return;
        }
        if (obj instanceof Set) {
            Map map = this.b;
            Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(atqq.aw((Set) obj));
            setUnmodifiableSet.getClass();
            map.put(bhiVar, setUnmodifiableSet);
            return;
        }
        boolean z = obj instanceof byte[];
        Map map2 = this.b;
        if (!z) {
            map2.put(bhiVar, obj);
            return;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        bArrCopyOf.getClass();
        map2.put(bhiVar, bArrCopyOf);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    public final boolean equals(Object obj) {
        boolean zC;
        if (!(obj instanceof bhj)) {
            return false;
        }
        Map map = ((bhj) obj).b;
        Map map2 = this.b;
        if (map != map2) {
            if (map.size() != map2.size()) {
                return false;
            }
            if (!map.isEmpty()) {
                for (Map.Entry entry : map.entrySet()) {
                    Object obj2 = map2.get(entry.getKey());
                    if (obj2 != null) {
                        Object value = entry.getValue();
                        if (!(value instanceof byte[])) {
                            zC = awrc.c(value, obj2);
                        } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                            zC = true;
                        } else {
                            zC = false;
                        }
                    } else {
                        zC = false;
                    }
                    if (!zC) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final bhj f() {
        return new bhj(new LinkedHashMap(c()), false);
    }

    public final void g(bhi bhiVar) {
        bhiVar.getClass();
        d();
        this.b.remove(bhiVar);
    }

    public final int hashCode() {
        Iterator it = this.b.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return atqq.aD(this.b.entrySet(), ",\n", "{\n", "\n}", new akl(10), 24);
    }

    public bhj() {
        throw null;
    }

    public /* synthetic */ bhj(boolean z) {
        this(new LinkedHashMap(), z);
    }
}

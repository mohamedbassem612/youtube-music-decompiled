package defpackage;

import android.util.Pair;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import java.lang.ref.ReferenceQueue;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class txy extends AbstractMap implements Map {
    public volatile int b;
    private final ReferenceQueue c;
    private int f;
    private Set g;
    private Collection h;
    private final hwf i;
    private int d = 0;
    public txw[] a = new txw[SemanticState.Hidden];
    private final int e = 7500;

    public txy(hwf hwfVar) {
        this.i = hwfVar;
        c();
        this.c = new ReferenceQueue();
    }

    private final void c() {
        this.f = (int) ((((long) this.a.length) * ((long) this.e)) / 10000);
    }

    private final void d() {
        HashSet hashSet = null;
        while (true) {
            txw txwVar = (txw) this.c.poll();
            if (txwVar == null) {
                break;
            }
            if (hashSet == null) {
                hashSet = new HashSet();
            }
            hashSet.add(Pair.create(txwVar, txwVar.c));
            b(txwVar);
        }
        if (hashSet == null || hashSet.isEmpty()) {
            return;
        }
        hwf hwfVar = this.i;
        Object obj = hwfVar.a;
        ((tbt) obj).g.writeLock().lock();
        try {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) ((Pair) it.next()).second;
                if (set != null && !set.isEmpty()) {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        ((tbt) obj).m((tbv) it2.next());
                    }
                }
            }
            ((tbt) hwfVar.a).g.writeLock().unlock();
        } catch (Throwable th) {
            ((tbt) hwfVar.a).g.writeLock().unlock();
            throw th;
        }
    }

    public final txw a(Object obj) {
        txw txwVar;
        d();
        if (obj == null) {
            txwVar = this.a[0];
            while (txwVar != null) {
                if (!txwVar.b) {
                    txwVar = txwVar.d;
                }
            }
            return null;
        }
        int iHashCode = obj.hashCode();
        int i = iHashCode + ((iHashCode << 15) ^ (-12931));
        txw[] txwVarArr = this.a;
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        txwVar = txwVarArr[((i5 ^ (i5 >>> 16)) & Alert.DURATION_SHOW_INDEFINITELY) % txwVarArr.length];
        while (txwVar != null) {
            if (!obj.equals(txwVar.get())) {
                txwVar = txwVar.d;
            }
        }
        return null;
        return txwVar;
    }

    public final void b(txw txwVar) {
        txw[] txwVarArr = this.a;
        int length = (txwVar.a & Alert.DURATION_SHOW_INDEFINITELY) % txwVarArr.length;
        txw txwVar2 = null;
        for (txw txwVar3 = txwVarArr[length]; txwVar3 != null; txwVar3 = txwVar3.d) {
            if (txwVar == txwVar3) {
                this.b++;
                if (txwVar2 == null) {
                    this.a[length] = txwVar3.d;
                } else {
                    txwVar2.d = txwVar3.d;
                }
                this.d--;
                return;
            }
            txwVar2 = txwVar3;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (this.d > 0) {
            this.d = 0;
            Arrays.fill(this.a, (Object) null);
            this.b++;
            while (this.c.poll() != null) {
            }
        }
    }

    @Override // java.util.AbstractMap
    protected final Object clone() {
        txy txyVar = (txy) super.clone();
        txyVar.g = null;
        txyVar.h = null;
        return txyVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return a(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        d();
        txw[] txwVarArr = this.a;
        if (obj == null) {
            int length = txwVarArr.length;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                for (txw txwVar = this.a[length]; txwVar != null; txwVar = txwVar.d) {
                    if ((txwVar.get() != null || txwVar.b) && txwVar.c == null) {
                        return true;
                    }
                }
            }
        } else {
            int length2 = txwVarArr.length;
            while (true) {
                length2--;
                if (length2 < 0) {
                    break;
                }
                for (txw txwVar2 = this.a[length2]; txwVar2 != null; txwVar2 = txwVar2.d) {
                    if ((txwVar2.get() != null || txwVar2.b) && obj.equals(txwVar2.c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        d();
        return new txr(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        txw txwVar;
        d();
        if (obj == null) {
            txwVar = this.a[0];
            while (txwVar != null) {
                if (txwVar.b) {
                    return txwVar.c;
                }
                txwVar = txwVar.d;
            }
            return null;
        }
        int iHashCode = obj.hashCode();
        int i = iHashCode + ((iHashCode << 15) ^ (-12931));
        txw[] txwVarArr = this.a;
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        txwVar = txwVarArr[((i5 ^ (i5 >>> 16)) & Alert.DURATION_SHOW_INDEFINITELY) % txwVarArr.length];
        while (txwVar != null) {
            if (obj.equals(txwVar.get())) {
                return txwVar.c;
            }
            txwVar = txwVar.d;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        d();
        if (this.g == null) {
            this.g = new txs(this);
        }
        return this.g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        txw txwVar;
        int length;
        d();
        int length2 = 0;
        if (obj != null) {
            int iHashCode = obj.hashCode();
            int i = iHashCode + ((iHashCode << 15) ^ (-12931));
            int i2 = i ^ (i >>> 10);
            int i3 = i2 + (i2 << 3);
            int i4 = i3 ^ (i3 >>> 6);
            int i5 = i4 + (i4 << 2) + (i4 << 14);
            int i6 = (i5 ^ (i5 >>> 16)) & Alert.DURATION_SHOW_INDEFINITELY;
            txw[] txwVarArr = this.a;
            length = i6 % txwVarArr.length;
            txwVar = txwVarArr[length];
            while (txwVar != null && !obj.equals(txwVar.get())) {
                txwVar = txwVar.d;
            }
        } else {
            txwVar = this.a[0];
            while (txwVar != null && !txwVar.b) {
                txwVar = txwVar.d;
            }
            length = 0;
        }
        if (txwVar != null) {
            Object obj3 = txwVar.c;
            txwVar.c = obj2;
            return obj3;
        }
        this.b++;
        int i7 = this.d + 1;
        this.d = i7;
        if (i7 > this.f) {
            int length3 = this.a.length << 1;
            int i8 = length3 != 0 ? length3 : 1;
            txw[] txwVarArr2 = new txw[i8];
            int i9 = 0;
            while (true) {
                txw[] txwVarArr3 = this.a;
                if (i9 >= txwVarArr3.length) {
                    break;
                }
                txw txwVar2 = txwVarArr3[i9];
                while (txwVar2 != null) {
                    int i10 = txwVar2.b ? 0 : (txwVar2.a & Alert.DURATION_SHOW_INDEFINITELY) % i8;
                    txw txwVar3 = txwVar2.d;
                    txwVar2.d = txwVarArr2[i10];
                    txwVarArr2[i10] = txwVar2;
                    txwVar2 = txwVar3;
                }
                i9++;
            }
            this.a = txwVarArr2;
            c();
            if (obj != null) {
                int iHashCode2 = obj.hashCode();
                int i11 = iHashCode2 + ((iHashCode2 << 15) ^ (-12931));
                int i12 = i11 ^ (i11 >>> 10);
                int i13 = i12 + (i12 << 3);
                int i14 = i13 ^ (i13 >>> 6);
                int i15 = i14 + (i14 << 2) + (i14 << 14);
                length2 = ((i15 ^ (i15 >>> 16)) & Alert.DURATION_SHOW_INDEFINITELY) % this.a.length;
            }
        } else {
            length2 = length;
        }
        txw txwVar4 = new txw(obj, obj2, this.c);
        txw[] txwVarArr4 = this.a;
        txwVar4.d = txwVarArr4[length2];
        txwVarArr4[length2] = txwVar4;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        if (map.entrySet() != null) {
            super.putAll(map);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int length;
        txw txwVar;
        txw txwVar2;
        d();
        if (obj != null) {
            int iHashCode = obj.hashCode();
            int i = iHashCode + ((iHashCode << 15) ^ (-12931));
            txw[] txwVarArr = this.a;
            int i2 = i ^ (i >>> 10);
            int i3 = i2 + (i2 << 3);
            int i4 = i3 ^ (i3 >>> 6);
            int i5 = i4 + (i4 << 2) + (i4 << 14);
            length = ((i5 ^ (i5 >>> 16)) & Alert.DURATION_SHOW_INDEFINITELY) % txwVarArr.length;
            txwVar2 = txwVarArr[length];
            txwVar = null;
            while (txwVar2 != null && !obj.equals(txwVar2.get())) {
                txwVar = txwVar2;
                txwVar2 = txwVar2.d;
            }
        } else {
            length = 0;
            txw txwVar3 = this.a[0];
            txwVar = null;
            while (true) {
                txwVar2 = txwVar3;
                if (txwVar2 == null || txwVar2.b) {
                    break;
                }
                txwVar3 = txwVar2.d;
                txwVar = txwVar2;
            }
        }
        if (txwVar2 == null) {
            return null;
        }
        this.b++;
        if (txwVar == null) {
            this.a[length] = txwVar2.d;
        } else {
            txwVar.d = txwVar2.d;
        }
        this.d--;
        return txwVar2.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        d();
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        d();
        if (this.h == null) {
            this.h = new txu(this);
        }
        return this.h;
    }
}

package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agnw implements ConcurrentMap, Serializable, j$.util.concurrent.ConcurrentMap {
    static final agnt a = new agmk();
    public static final /* synthetic */ int h = 0;
    private static final boolean i;
    private static final long serialVersionUID = 5;
    final transient int b;
    final transient int c;
    final transient agmw[] d;
    final int e;
    final ageb f;
    final transient agmt g;

    static {
        String property = System.getProperty("java.runtime.name", "");
        property.getClass();
        i = property.contains("Android");
    }

    public agnw(agmj agmjVar, agmt agmtVar) {
        this.e = Math.min(agmjVar.a(), 65536);
        this.f = (ageb) ahno.ad(agmjVar.f, agmjVar.c().a());
        this.g = agmtVar;
        int iMin = Math.min(agmjVar.b(), 1073741824);
        int i2 = 1;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i4 < this.e) {
            i5++;
            i4 <<= 1;
        }
        this.c = 32 - i5;
        this.b = i4 - 1;
        this.d = new agmw[i4];
        int i6 = iMin / i4;
        while (i2 < (i4 * i6 < iMin ? i6 + 1 : i6)) {
            i2 <<= 1;
        }
        while (true) {
            agmw[] agmwVarArr = this.d;
            if (i3 >= agmwVarArr.length) {
                return;
            }
            agmwVarArr[i3] = this.g.c(this, i2);
            i3++;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void d(Object obj) {
        if (obj == null || i) {
            return;
        }
        String name = obj.getClass().getName();
        switch (name.hashCode()) {
            case -2123038604:
                if (!name.equals("java.time.chrono.HijrahDate")) {
                    return;
                }
                break;
            case -2073921873:
                if (!name.equals("java.util.OptionalInt")) {
                    return;
                }
                break;
            case -1917484011:
                if (!name.equals("java.time.OffsetTime")) {
                    return;
                }
                break;
            case -1246518012:
                if (!name.equals("java.time.LocalDate")) {
                    return;
                }
                break;
            case -1246033885:
                if (!name.equals("java.time.LocalTime")) {
                    return;
                }
                break;
            case -1244060399:
                if (!name.equals("java.util.OptionalDouble")) {
                    return;
                }
                break;
            case -1179039247:
                if (!name.equals("java.time.LocalDateTime")) {
                    return;
                }
                break;
            case -1062742510:
                if (!name.equals("java.time.Year")) {
                    return;
                }
                break;
            case -1023498007:
                if (!name.equals("java.time.Duration")) {
                    return;
                }
                break;
            case -1022890317:
                if (!name.equals("java.time.chrono.MinguoDate")) {
                    return;
                }
                break;
            case -761719520:
                if (!name.equals("java.util.Optional")) {
                    return;
                }
                break;
            case -682591005:
                if (!name.equals("java.time.OffsetDateTime")) {
                    return;
                }
                break;
            case -537503858:
                if (!name.equals("java.time.YearMonth")) {
                    return;
                }
                break;
            case -527879800:
                if (!name.equals("java.lang.Float")) {
                    return;
                }
                break;
            case -515992664:
                if (!name.equals("java.lang.Short")) {
                    return;
                }
                break;
            case 133021628:
                if (!name.equals("java.util.OptionalLong")) {
                    return;
                }
                break;
            case 155276373:
                if (!name.equals("java.lang.Character")) {
                    return;
                }
                break;
            case 398507100:
                if (!name.equals("java.lang.Byte")) {
                    return;
                }
                break;
            case 649475153:
                if (!name.equals("java.time.MonthDay")) {
                    return;
                }
                break;
            case 649503318:
                if (!name.equals("java.time.Period")) {
                    return;
                }
                break;
            case 761287205:
                if (!name.equals("java.lang.Double")) {
                    return;
                }
                break;
            case 968136245:
                if (!name.equals("java.time.chrono.JapaneseDate")) {
                    return;
                }
                break;
            case 1296075756:
                if (!name.equals("java.time.Instant")) {
                    return;
                }
                break;
            case 1505337278:
                if (!name.equals("java.time.ZonedDateTime")) {
                    return;
                }
                break;
            case 1518087925:
                if (!name.equals("java.time.chrono.ThaiBuddhistDate")) {
                    return;
                }
                break;
            default:
                return;
        }
        throw new IllegalArgumentException("Cannot create a weak or soft reference to a value class: ".concat(String.valueOf(obj.getClass().getName())));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    public final int a(Object obj) {
        int iA = this.f.a(obj);
        int i2 = iA + ((iA << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    final ageb b() {
        return this.g.e().a();
    }

    public final agmw c(int i2) {
        return this.d[(i2 >>> this.c) & this.b];
    }

    @Override // java.util.Map
    public final void clear() {
        int i2 = 0;
        while (true) {
            agmw[] agmwVarArr = this.d;
            if (i2 >= agmwVarArr.length) {
                return;
            }
            agmw agmwVar = agmwVarArr[i2];
            if (agmwVar.b != 0) {
                agmwVar.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = agmwVar.e;
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        atomicReferenceArray.set(i3, null);
                    }
                    agmwVar.g();
                    agmwVar.f.set(0);
                    agmwVar.c++;
                    agmwVar.b = 0;
                    agmwVar.unlock();
                } catch (Throwable th) {
                    agmwVar.unlock();
                    throw th;
                }
            }
            i2++;
        }
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return j$.util.concurrent.ConcurrentMap.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return j$.util.concurrent.ConcurrentMap.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return j$.util.concurrent.ConcurrentMap.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        agms agmsVarB;
        boolean z = false;
        if (obj != null) {
            int iA = a(obj);
            agmw agmwVarC = c(iA);
            try {
                if (agmwVarC.b != 0 && (agmsVarB = agmwVarC.b(obj, iA)) != null && agmsVarB.d() != null) {
                    z = true;
                }
            } finally {
                agmwVarC.i();
            }
        }
        return z;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Object objD;
        if (obj != null) {
            agmw[] agmwVarArr = this.d;
            long j = -1;
            int i2 = 0;
            while (i2 < 3) {
                int length = agmwVarArr.length;
                long j2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    agmw agmwVar = agmwVarArr[i3];
                    int i4 = agmwVar.b;
                    AtomicReferenceArray atomicReferenceArray = agmwVar.e;
                    for (int i5 = 0; i5 < atomicReferenceArray.length(); i5++) {
                        for (agms agmsVarB = (agms) atomicReferenceArray.get(i5); agmsVarB != null; agmsVarB = agmsVarB.b()) {
                            if (agmsVarB.c() == null || (objD = agmsVarB.d()) == null) {
                                agmwVar.l();
                                objD = null;
                            }
                            if (objD != null && b().c(obj, objD)) {
                                return true;
                            }
                        }
                    }
                    j2 += (long) agmwVar.c;
                }
                if (j2 == j) {
                    break;
                }
                i2++;
                j = j2;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new agmq(this);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return aguu.q(this, obj);
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map, j$.util.concurrent.ConcurrentMap, j$.util.Map, java.util.HashMap
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        j$.util.concurrent.ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        Object objD = null;
        if (obj != null) {
            int iA = a(obj);
            agmw agmwVarC = c(iA);
            try {
                agms agmsVarB = agmwVarC.b(obj, iA);
                if (agmsVarB != null && (objD = agmsVarB.d()) == null) {
                    agmwVarC.l();
                }
            } finally {
                agmwVarC.i();
            }
        }
        return objD;
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map, j$.util.concurrent.ConcurrentMap, j$.util.Map, java.util.HashMap
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return j$.util.concurrent.ConcurrentMap.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return new agmq(this).hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        int i2 = 0;
        long j = 0;
        while (true) {
            agmw[] agmwVarArr = this.d;
            if (i2 >= agmwVarArr.length) {
                if (j != 0) {
                    for (int i3 = 0; i3 < agmwVarArr.length; i3++) {
                        if (agmwVarArr[i3].b != 0) {
                            return false;
                        }
                        j -= (long) agmwVarArr[i3].c;
                    }
                    if (j != 0) {
                        return false;
                    }
                }
                return true;
            }
            if (agmwVarArr[i2].b != 0) {
                return false;
            }
            j += (long) agmwVarArr[i2].c;
            i2++;
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new agmv(this);
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return j$.util.concurrent.ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        return c(iA).d(obj, iA, obj2, false);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        return c(iA).d(obj, iA, obj2, true);
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        boolean z = false;
        if (obj != null && obj2 != null) {
            int iA = a(obj);
            agmw agmwVarC = c(iA);
            agmwVarC.lock();
            try {
                agmwVarC.j();
                int i2 = agmwVarC.b;
                AtomicReferenceArray atomicReferenceArray = agmwVarC.e;
                int length = (atomicReferenceArray.length() - 1) & iA;
                agms agmsVar = (agms) atomicReferenceArray.get(length);
                for (agms agmsVarB = agmsVar; agmsVarB != null; agmsVarB = agmsVarB.b()) {
                    Object objC = agmsVarB.c();
                    if (agmsVarB.a() == iA && objC != null) {
                        agnw agnwVar = agmwVarC.a;
                        if (agnwVar.f.c(obj, objC)) {
                            if (!agnwVar.b().c(obj2, agmsVarB.d())) {
                                if (!agmw.m(agmsVarB)) {
                                    break;
                                }
                                break;
                            }
                            z = true;
                            agmwVarC.c++;
                            agms agmsVarC = agmwVarC.c(agmsVar, agmsVarB);
                            int i3 = agmwVarC.b - 1;
                            atomicReferenceArray.set(length, agmsVarC);
                            agmwVarC.b = i3;
                            break;
                        }
                    }
                }
            } finally {
                agmwVarC.unlock();
            }
        }
        return z;
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj3.getClass();
        boolean z = false;
        if (obj2 != null) {
            int iA = a(obj);
            agmw agmwVarC = c(iA);
            agmwVarC.lock();
            try {
                agmwVarC.j();
                AtomicReferenceArray atomicReferenceArray = agmwVarC.e;
                int length = (atomicReferenceArray.length() - 1) & iA;
                agms agmsVar = (agms) atomicReferenceArray.get(length);
                for (agms agmsVarB = agmsVar; agmsVarB != null; agmsVarB = agmsVarB.b()) {
                    Object objC = agmsVarB.c();
                    if (agmsVarB.a() == iA && objC != null) {
                        agnw agnwVar = agmwVarC.a;
                        if (agnwVar.f.c(obj, objC)) {
                            Object objD = agmsVarB.d();
                            if (objD != null) {
                                if (!agnwVar.b().c(obj2, objD)) {
                                    break;
                                }
                                agmwVarC.c++;
                                agmwVarC.k(agmsVarB, obj3);
                                z = true;
                                break;
                            }
                            if (!agmw.m(agmsVarB)) {
                                break;
                            }
                            int i2 = agmwVarC.b;
                            agmwVarC.c++;
                            agms agmsVarC = agmwVarC.c(agmsVar, agmsVarB);
                            int i3 = agmwVarC.b - 1;
                            atomicReferenceArray.set(length, agmsVarC);
                            agmwVarC.b = i3;
                            break;
                        }
                    }
                }
            } finally {
                agmwVarC.unlock();
            }
        }
        return z;
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map, j$.util.concurrent.ConcurrentMap, j$.util.Map, java.util.HashMap
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        j$.util.concurrent.ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final int size() {
        int i2 = 0;
        long j = 0;
        while (true) {
            agmw[] agmwVarArr = this.d;
            if (i2 >= agmwVarArr.length) {
                return ahng.P(j);
            }
            j += (long) agmwVarArr[i2].b;
            i2++;
        }
    }

    public final String toString() {
        return aguu.n(this);
    }

    @Override // java.util.Map
    public final Collection values() {
        return new agni(this);
    }

    Object writeReplace() {
        agmt agmtVar = this.g;
        agmy agmyVarD = agmtVar.d();
        agmy agmyVarE = agmtVar.e();
        agmtVar.e().a();
        return new agmx(agmyVarD, agmyVarE, this.f, this.e, this);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Object obj2 = null;
        if (obj != null) {
            int iA = a(obj);
            agmw agmwVarC = c(iA);
            agmwVarC.lock();
            try {
                agmwVarC.j();
                int i2 = agmwVarC.b;
                AtomicReferenceArray atomicReferenceArray = agmwVarC.e;
                int length = (atomicReferenceArray.length() - 1) & iA;
                agms agmsVar = (agms) atomicReferenceArray.get(length);
                for (agms agmsVarB = agmsVar; agmsVarB != null; agmsVarB = agmsVarB.b()) {
                    Object objC = agmsVarB.c();
                    if (agmsVarB.a() == iA && objC != null && agmwVarC.a.f.c(obj, objC)) {
                        Object objD = agmsVarB.d();
                        if (objD == null && !agmw.m(agmsVarB)) {
                            break;
                        }
                        agmwVarC.c++;
                        agms agmsVarC = agmwVarC.c(agmsVar, agmsVarB);
                        int i3 = agmwVarC.b - 1;
                        atomicReferenceArray.set(length, agmsVarC);
                        agmwVarC.b = i3;
                        obj2 = objD;
                        break;
                    }
                }
            } finally {
                agmwVarC.unlock();
            }
        }
        return obj2;
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        Object obj3;
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        agmw agmwVarC = c(iA);
        agmwVarC.lock();
        try {
            agmwVarC.j();
            AtomicReferenceArray atomicReferenceArray = agmwVarC.e;
            int length = (atomicReferenceArray.length() - 1) & iA;
            agms agmsVar = (agms) atomicReferenceArray.get(length);
            agms agmsVarB = agmsVar;
            while (true) {
                obj3 = null;
                if (agmsVarB == null) {
                    break;
                }
                Object objC = agmsVarB.c();
                if (agmsVarB.a() == iA && objC != null && agmwVarC.a.f.c(obj, objC)) {
                    Object objD = agmsVarB.d();
                    if (objD == null) {
                        if (!agmw.m(agmsVarB)) {
                            break;
                        }
                        int i2 = agmwVarC.b;
                        agmwVarC.c++;
                        agms agmsVarC = agmwVarC.c(agmsVar, agmsVarB);
                        int i3 = agmwVarC.b - 1;
                        atomicReferenceArray.set(length, agmsVarC);
                        agmwVarC.b = i3;
                        break;
                    }
                    agmwVarC.c++;
                    agmwVarC.k(agmsVarB, obj2);
                    obj3 = objD;
                    break;
                }
                agmsVarB = agmsVarB.b();
            }
            return obj3;
        } finally {
            agmwVarC.unlock();
        }
    }
}

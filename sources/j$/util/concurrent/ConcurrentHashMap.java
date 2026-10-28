package j$.util.concurrent;

import androidx.car.app.model.Alert;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements java.util.concurrent.ConcurrentMap<K, V>, Serializable, ConcurrentMap<K, V> {
    public static final int g = Runtime.getRuntime().availableProcessors();
    public static final j$.sun.misc.a h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final long l;
    public static final long m;
    public static final int n;
    public static final int o;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;
    public volatile transient j[] a;
    public volatile transient j[] b;
    private volatile transient long baseCount;
    public volatile transient b[] c;
    private volatile transient int cellsBusy;
    public transient KeySetView d;
    public transient q e;
    public transient d f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    /* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
    public static class KeySetView<K, V> extends CollectionView<K, V, K> implements Set<K>, Serializable, j$.util.Set<K> {
        private static final long serialVersionUID = 7249069246763182397L;
        public final Boolean b;

        public KeySetView(ConcurrentHashMap concurrentHashMap, Boolean bool) {
            super(concurrentHashMap);
            this.b = bool;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean add(K k) {
            Boolean bool = this.b;
            if (bool != null) {
                return this.a.f(k, bool, true) == null;
            }
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            Boolean bool = this.b;
            if (bool == null) {
                throw new UnsupportedOperationException();
            }
            Iterator it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (this.a.f(it.next(), bool, true) == null) {
                    z = true;
                }
            }
            return z;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
        public final boolean contains(Object obj) {
            return this.a.containsKey(obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            Set set;
            return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
        }

        @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
        public final void forEach(Consumer consumer) {
            consumer.getClass();
            j[] jVarArr = this.a.a;
            if (jVarArr == null) {
                return;
            }
            n nVar = new n(jVarArr, jVarArr.length, 0, jVarArr.length);
            while (true) {
                j jVarA = nVar.a();
                if (jVarA == null) {
                    return;
                } else {
                    consumer.accept(jVarA.b);
                }
            }
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            Iterator<K> it = iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                iHashCode += it.next().hashCode();
            }
            return iHashCode;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            ConcurrentHashMap concurrentHashMap = this.a;
            j[] jVarArr = concurrentHashMap.a;
            int length = jVarArr == null ? 0 : jVarArr.length;
            return new g(jVarArr, length, length, concurrentHashMap, (byte) 0);
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Stream parallelStream() {
            return j$.util.Collection.CC.$default$parallelStream(this);
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
        public boolean remove(Object obj) {
            return this.a.remove(obj) != null;
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ boolean removeIf(Predicate predicate) {
            return j$.util.Collection.CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Set, j$.util.Collection, j$.lang.a
        public final Spliterator spliterator() {
            ConcurrentHashMap concurrentHashMap = this.a;
            long j = concurrentHashMap.j();
            j[] jVarArr = concurrentHashMap.a;
            int length = jVarArr == null ? 0 : jVarArr.length;
            return new h(jVarArr, length, 0, length, j < 0 ? 0L : j, (byte) 0);
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Stream stream() {
            return j$.util.Collection.CC.$default$stream(this);
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return toArray((Object[]) intFunction.apply(0));
        }
    }

    static {
        ObjectStreamField objectStreamField = new ObjectStreamField("segments", l[].class);
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{objectStreamField, new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        j$.sun.misc.a aVar = j$.sun.misc.a.b;
        h = aVar;
        i = aVar.a(ConcurrentHashMap.class, "sizeCtl");
        j = aVar.a(ConcurrentHashMap.class, "transferIndex");
        k = aVar.a(ConcurrentHashMap.class, "baseCount");
        l = aVar.a(ConcurrentHashMap.class, "cellsBusy");
        m = aVar.a(b.class, "value");
        n = aVar.a.arrayBaseOffset(j[].class);
        int iArrayIndexScale = aVar.a.arrayIndexScale(j[].class);
        if (((iArrayIndexScale - 1) & iArrayIndexScale) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        o = 31 - Integer.numberOfLeadingZeros(iArrayIndexScale);
    }

    public ConcurrentHashMap(int i2, float f, int i3) {
        if (f <= 0.0f || i2 < 0 || i3 <= 0) {
            throw new IllegalArgumentException();
        }
        long j2 = (long) (((double) ((i2 < i3 ? i3 : i2) / f)) + 1.0d);
        this.sizeCtl = j2 >= 1073741824 ? 1073741824 : l((int) j2);
    }

    public static final boolean b(j[] jVarArr, int i2, j jVar) {
        long j2 = ((long) n) + (((long) i2) << o);
        Unsafe unsafe = h.a;
        while (true) {
            j[] jVarArr2 = jVarArr;
            j jVar2 = jVar;
            if (unsafe.compareAndSwapObject(jVarArr2, j2, (Object) null, jVar2)) {
                return true;
            }
            if (unsafe.getObject(jVarArr2, j2) != null) {
                return false;
            }
            jVarArr = jVarArr2;
            jVar = jVar2;
        }
    }

    public static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (obj instanceof Comparable) {
            Class<?> cls = obj.getClass();
            if (cls == String.class) {
                return cls;
            }
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces != null) {
                for (Type type : genericInterfaces) {
                    if (type instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) type;
                        if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                            return cls;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final void h(j[] jVarArr, int i2, j jVar) {
        h.a.putObjectVolatile(jVarArr, (((long) i2) << o) + ((long) n), jVar);
    }

    public static final int i(int i2) {
        return (i2 ^ (i2 >>> 16)) & Alert.DURATION_SHOW_INDEFINITELY;
    }

    public static final j k(j[] jVarArr, int i2) {
        return (j) h.a.getObjectVolatile(jVarArr, (((long) i2) << o) + ((long) n));
    }

    public static final int l(int i2) {
        int iNumberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i2 - 1);
        if (iNumberOfLeadingZeros < 0) {
            return 1;
        }
        if (iNumberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return 1 + iNumberOfLeadingZeros;
    }

    public static <K> KeySetView<K, Boolean> newKeySet() {
        return new KeySetView<>(new ConcurrentHashMap(), Boolean.TRUE);
    }

    public static j p(p pVar) {
        j jVar = null;
        j jVar2 = null;
        for (j jVar3 = pVar; jVar3 != null; jVar3 = jVar3.d) {
            j jVar4 = new j(jVar3.a, jVar3.b, jVar3.c);
            if (jVar2 == null) {
                jVar = jVar4;
            } else {
                jVar2.d = jVar4;
            }
            jVar2 = jVar4;
        }
        return jVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        long j2;
        long j3;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j4 = 0;
        long j5 = 0;
        j jVar = null;
        while (true) {
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            j2 = 1;
            if (object == null || object2 == null) {
                break;
            }
            j5++;
            jVar = new j(i(object.hashCode()), object, object2, jVar);
        }
        if (j5 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j6 = (long) (((double) (j5 / 0.75f)) + 1.0d);
        int iL = j6 >= 1073741824 ? 1073741824 : l((int) j6);
        j[] jVarArr = new j[iL];
        int i2 = iL - 1;
        while (jVar != null) {
            j jVar2 = jVar.d;
            int i3 = jVar.a;
            int i4 = i3 & i2;
            j jVarK = k(jVarArr, i4);
            boolean z = true;
            if (jVarK == null) {
                j3 = j2;
            } else {
                Object obj2 = jVar.b;
                if (jVarK.a < 0) {
                    if (((o) jVarK).e(i3, obj2, jVar.c) == null) {
                        j4 += j2;
                    }
                    j3 = j2;
                } else {
                    j3 = j2;
                    int i5 = 0;
                    for (j jVar3 = jVarK; jVar3 != null; jVar3 = jVar3.d) {
                        if (jVar3.a == i3 && ((obj = jVar3.b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z = false;
                            break;
                        }
                        i5++;
                    }
                    if (z && i5 >= 8) {
                        j4 += j3;
                        jVar.d = jVarK;
                        j jVar4 = jVar;
                        p pVar = null;
                        p pVar2 = null;
                        while (jVar4 != null) {
                            p pVar3 = new p(jVar4.a, jVar4.b, jVar4.c, null, null);
                            pVar3.h = pVar2;
                            if (pVar2 == null) {
                                pVar = pVar3;
                            } else {
                                pVar2.d = pVar3;
                            }
                            jVar4 = jVar4.d;
                            pVar2 = pVar3;
                        }
                        h(jVarArr, i4, new o(pVar));
                    }
                }
                z = false;
            }
            if (z) {
                j4 += j3;
                jVar.d = jVarK;
                h(jVarArr, i4, jVar);
            }
            jVar = jVar2;
            j2 = j3;
        }
        this.a = jVarArr;
        this.sizeCtl = iL - (iL >>> 2);
        this.baseCount = j4;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i2 = 0;
        int i3 = 1;
        while (i3 < 16) {
            i2++;
            i3 <<= 1;
        }
        int i4 = 32 - i2;
        int i5 = i3 - 1;
        l[] lVarArr = new l[16];
        for (int i6 = 0; i6 < 16; i6++) {
            lVarArr[i6] = new l();
        }
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("segments", lVarArr);
        putFieldPutFields.put("segmentShift", i4);
        putFieldPutFields.put("segmentMask", i5);
        objectOutputStream.writeFields();
        j[] jVarArr = this.a;
        if (jVarArr != null) {
            n nVar = new n(jVarArr, jVarArr.length, 0, jVarArr.length);
            while (true) {
                j jVarA = nVar.a();
                if (jVarA == null) {
                    break;
                }
                objectOutputStream.writeObject(jVarA.b);
                objectOutputStream.writeObject(jVarA.c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x019e  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ff  */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r0.a.compareAndSwapLong(r1, r2, r4, r6) == false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r25, int r27) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.a(long, int):void");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        j jVarK;
        j jVar;
        j[] jVarArrD = this.a;
        long j2 = 0;
        loop0: while (true) {
            int i2 = 0;
            while (true) {
                if (jVarArrD == null || i2 >= jVarArrD.length) {
                    break loop0;
                }
                jVarK = k(jVarArrD, i2);
                if (jVarK == null) {
                    i2++;
                } else {
                    int i3 = jVarK.a;
                    if (i3 == -1) {
                        break;
                    }
                    synchronized (jVarK) {
                        if (k(jVarArrD, i2) == jVarK) {
                            if (i3 >= 0) {
                                jVar = jVarK;
                            } else {
                                jVar = jVarK instanceof o ? ((o) jVarK).f : null;
                            }
                            while (jVar != null) {
                                j2--;
                                jVar = jVar.d;
                            }
                            h(jVarArrD, i2, null);
                            i2++;
                        }
                    }
                }
            }
            jVarArrD = d(jVarArrD, jVarK);
        }
        if (j2 != 0) {
            a(j2, -1);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x004c */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object compute(java.lang.Object r14, java.util.function.BiFunction r15) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.compute(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x004b */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object computeIfAbsent(java.lang.Object r12, java.util.function.Function r13) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object, java.util.function.Function):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        p pVarB;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int i2 = i(obj.hashCode());
        j[] jVarArrE = this.a;
        int i3 = 0;
        Object objApply = null;
        int i4 = 0;
        while (true) {
            if (jVarArrE != null) {
                int length = jVarArrE.length;
                if (length != 0) {
                    int i5 = (length - 1) & i2;
                    j jVarK = k(jVarArrE, i5);
                    if (jVarK == null) {
                        break;
                    }
                    int i6 = jVarK.a;
                    if (i6 == -1) {
                        jVarArrE = d(jVarArrE, jVarK);
                    } else {
                        synchronized (jVarK) {
                            if (k(jVarArrE, i5) == jVarK) {
                                if (i6 >= 0) {
                                    i4 = 1;
                                    j jVar = null;
                                    j jVar2 = jVarK;
                                    while (true) {
                                        if (jVar2.a == i2 && ((obj2 = jVar2.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                            objApply = biFunction.apply(obj, jVar2.c);
                                            if (objApply == null) {
                                                j jVar3 = jVar2.d;
                                                if (jVar != null) {
                                                    jVar.d = jVar3;
                                                } else {
                                                    h(jVarArrE, i5, jVar3);
                                                }
                                                i3 = -1;
                                                break;
                                            }
                                            jVar2.c = objApply;
                                            break;
                                        }
                                        j jVar4 = jVar2.d;
                                        if (jVar4 == null) {
                                            break;
                                        }
                                        i4++;
                                        jVar = jVar2;
                                        jVar2 = jVar4;
                                    }
                                } else if (jVarK instanceof o) {
                                    o oVar = (o) jVarK;
                                    p pVar = oVar.e;
                                    if (pVar != null && (pVarB = pVar.b(i2, obj, null)) != null) {
                                        objApply = biFunction.apply(obj, pVarB.c);
                                        if (objApply != null) {
                                            pVarB.c = objApply;
                                        } else {
                                            if (oVar.f(pVarB)) {
                                                h(jVarArrE, i5, p(oVar.f));
                                            }
                                            i3 = -1;
                                        }
                                    }
                                    i4 = 2;
                                } else if (jVarK instanceof k) {
                                    throw new IllegalStateException("Recursive update");
                                }
                            }
                        }
                        if (i4 != 0) {
                            break;
                        }
                    }
                }
            }
            jVarArrE = e();
        }
        if (i3 != 0) {
            a(i3, i4);
        }
        return objApply;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        j[] jVarArr = this.a;
        if (jVarArr == null) {
            return false;
        }
        n nVar = new n(jVarArr, jVarArr.length, 0, jVarArr.length);
        while (true) {
            j jVarA = nVar.a();
            if (jVarA == null) {
                return false;
            }
            Object obj2 = jVarA.c;
            if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                return true;
            }
        }
    }

    public final j[] d(j[] jVarArr, j jVar) {
        j[] jVarArr2;
        int i2;
        if (!(jVar instanceof f) || (jVarArr2 = ((f) jVar).e) == null) {
            return this.a;
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(jVarArr.length) | 32768;
        while (jVarArr2 == this.b && this.a == jVarArr && (i2 = this.sizeCtl) < 0 && (i2 >>> 16) == iNumberOfLeadingZeros && i2 != iNumberOfLeadingZeros + 1 && i2 != 65535 + iNumberOfLeadingZeros && this.transferIndex > 0) {
            ConcurrentHashMap<K, V> concurrentHashMap = this;
            if (h.a.compareAndSwapInt(concurrentHashMap, i, i2, i2 + 1)) {
                concurrentHashMap.m(jVarArr, jVarArr2);
                break;
            }
            this = concurrentHashMap;
        }
        return jVarArr2;
    }

    public final j[] e() {
        while (true) {
            j[] jVarArr = this.a;
            if (jVarArr != null && jVarArr.length != 0) {
                return jVarArr;
            }
            int i2 = this.sizeCtl;
            if (i2 < 0) {
                Thread.yield();
            } else {
                ConcurrentHashMap<K, V> concurrentHashMap = this;
                if (h.a.compareAndSwapInt(concurrentHashMap, i, i2, -1)) {
                    try {
                        j[] jVarArr2 = concurrentHashMap.a;
                        if (jVarArr2 == null || jVarArr2.length == 0) {
                            int i3 = i2 > 0 ? i2 : 16;
                            j[] jVarArr3 = new j[i3];
                            concurrentHashMap.a = jVarArr3;
                            i2 = i3 - (i3 >>> 2);
                            jVarArr2 = jVarArr3;
                        }
                        return jVarArr2;
                    } finally {
                        concurrentHashMap.sizeCtl = i2;
                    }
                }
                this = concurrentHashMap;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        d dVar = this.f;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.f = dVar2;
        return dVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        V value;
        V v;
        if (obj != this) {
            if (!(obj instanceof Map)) {
                return false;
            }
            Map map = (Map) obj;
            j[] jVarArr = this.a;
            int length = jVarArr == null ? 0 : jVarArr.length;
            n nVar = new n(jVarArr, length, 0, length);
            while (true) {
                j jVarA = nVar.a();
                if (jVarA != null) {
                    Object obj2 = jVarA.c;
                    Object obj3 = map.get(jVarA.b);
                    if (obj3 == null) {
                        return false;
                    }
                    if (obj3 != obj2 && !obj3.equals(obj2)) {
                        return false;
                    }
                } else {
                    for (Map.Entry<K, V> entry : map.entrySet()) {
                        K key = entry.getKey();
                        if (key == null || (value = entry.getValue()) == null || (v = get(key)) == null) {
                            return false;
                        }
                        if (value != v && !value.equals(v)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00aa, code lost:
    
        if (r7 != null) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.Object r9, java.lang.Object r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto Lbe
            if (r10 == 0) goto Lbe
            int r1 = r9.hashCode()
            int r1 = i(r1)
            j$.util.concurrent.j[] r2 = r8.a
            r3 = 0
        L10:
            if (r2 == 0) goto Lb8
            int r4 = r2.length
            if (r4 == 0) goto Lb8
            int r4 = r4 + (-1)
            r4 = r4 & r1
            j$.util.concurrent.j r5 = k(r2, r4)
            if (r5 != 0) goto L2b
            j$.util.concurrent.j r5 = new j$.util.concurrent.j
            r5.<init>(r1, r9, r10)
            boolean r4 = b(r2, r4, r5)
            if (r4 == 0) goto L10
            goto Lae
        L2b:
            int r6 = r5.a
            r7 = -1
            if (r6 != r7) goto L35
            j$.util.concurrent.j[] r2 = r8.d(r2, r5)
            goto L10
        L35:
            if (r11 == 0) goto L49
            if (r6 != r1) goto L49
            java.lang.Object r7 = r5.b
            if (r7 == r9) goto L45
            if (r7 == 0) goto L49
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L49
        L45:
            java.lang.Object r7 = r5.c
            if (r7 != 0) goto Lac
        L49:
            monitor-enter(r5)
            j$.util.concurrent.j r7 = k(r2, r4)     // Catch: java.lang.Throwable -> Lb6
            if (r7 != r5) goto L9f
            if (r6 < 0) goto L7b
            r3 = 1
            r6 = r5
        L54:
            int r7 = r6.a     // Catch: java.lang.Throwable -> Lb6
            if (r7 != r1) goto L6b
            java.lang.Object r7 = r6.b     // Catch: java.lang.Throwable -> Lb6
            if (r7 == r9) goto L64
            if (r7 == 0) goto L6b
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> Lb6
            if (r7 == 0) goto L6b
        L64:
            java.lang.Object r7 = r6.c     // Catch: java.lang.Throwable -> Lb6
            if (r11 != 0) goto La0
            r6.c = r10     // Catch: java.lang.Throwable -> Lb6
            goto La0
        L6b:
            j$.util.concurrent.j r7 = r6.d     // Catch: java.lang.Throwable -> Lb6
            if (r7 != 0) goto L77
            j$.util.concurrent.j r7 = new j$.util.concurrent.j     // Catch: java.lang.Throwable -> Lb6
            r7.<init>(r1, r9, r10)     // Catch: java.lang.Throwable -> Lb6
            r6.d = r7     // Catch: java.lang.Throwable -> Lb6
            goto L9f
        L77:
            int r3 = r3 + 1
            r6 = r7
            goto L54
        L7b:
            boolean r6 = r5 instanceof j$.util.concurrent.o     // Catch: java.lang.Throwable -> Lb6
            if (r6 == 0) goto L93
            r3 = r5
            j$.util.concurrent.o r3 = (j$.util.concurrent.o) r3     // Catch: java.lang.Throwable -> Lb6
            j$.util.concurrent.p r3 = r3.e(r1, r9, r10)     // Catch: java.lang.Throwable -> Lb6
            if (r3 == 0) goto L90
            java.lang.Object r6 = r3.c     // Catch: java.lang.Throwable -> Lb6
            if (r11 != 0) goto L8e
            r3.c = r10     // Catch: java.lang.Throwable -> Lb6
        L8e:
            r7 = r6
            goto L91
        L90:
            r7 = r0
        L91:
            r3 = 2
            goto La0
        L93:
            boolean r6 = r5 instanceof j$.util.concurrent.k     // Catch: java.lang.Throwable -> Lb6
            if (r6 == 0) goto L9f
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r9 = "Recursive update"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lb6
            throw r8     // Catch: java.lang.Throwable -> Lb6
        L9f:
            r7 = r0
        La0:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lb6
            if (r3 == 0) goto L10
            r9 = 8
            if (r3 < r9) goto Laa
            r8.n(r2, r4)
        Laa:
            if (r7 == 0) goto Lae
        Lac:
            r0 = r7
            goto Lb3
        Lae:
            r9 = 1
            r8.a(r9, r3)
        Lb3:
            return r0
        Lb4:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lb6
            throw r8
        Lb6:
            r8 = move-exception
            goto Lb4
        Lb8:
            j$.util.concurrent.j[] r2 = r8.e()
            goto L10
        Lbe:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.f(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map, java.util.HashMap
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        j[] jVarArr = this.a;
        if (jVarArr == null) {
            return;
        }
        n nVar = new n(jVarArr, jVarArr.length, 0, jVarArr.length);
        while (true) {
            j jVarA = nVar.a();
            if (jVarA == null) {
                return;
            } else {
                biConsumer.accept(jVarA.b, jVarA.c);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00a6 A[PHI: r7
      0x00a6: PHI (r7v3 boolean) = 
      (r7v1 boolean)
      (r7v4 boolean)
      (r7v4 boolean)
      (r7v4 boolean)
      (r7v4 boolean)
      (r7v4 boolean)
      (r7v4 boolean)
      (r7v4 boolean)
     binds: [B:61:0x00a5, B:43:0x006e, B:45:0x0074, B:49:0x007c, B:51:0x0082, B:87:0x00a6, B:28:0x0045, B:30:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object g(Object obj, Object obj2, Object obj3) {
        int length;
        int i2;
        j jVarK;
        boolean z;
        Object obj4;
        p pVarB;
        Object obj5;
        int i3 = i(obj.hashCode());
        j[] jVarArrD = this.a;
        while (jVarArrD != null && (length = jVarArrD.length) != 0 && (jVarK = k(jVarArrD, (i2 = (length - 1) & i3))) != null) {
            int i4 = jVarK.a;
            if (i4 == -1) {
                jVarArrD = d(jVarArrD, jVarK);
            } else {
                synchronized (jVarK) {
                    if (k(jVarArrD, i2) == jVarK) {
                        z = true;
                        if (i4 >= 0) {
                            j jVar = null;
                            j jVar2 = jVarK;
                            while (true) {
                                if (jVar2.a != i3 || ((obj5 = jVar2.b) != obj && (obj5 == null || !obj.equals(obj5)))) {
                                    j jVar3 = jVar2.d;
                                    if (jVar3 != null) {
                                        jVar = jVar2;
                                        jVar2 = jVar3;
                                    }
                                } else {
                                    obj4 = jVar2.c;
                                    if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                        if (obj2 != null) {
                                            jVar2.c = obj2;
                                        } else {
                                            j jVar4 = jVar2.d;
                                            if (jVar != null) {
                                                jVar.d = jVar4;
                                            } else {
                                                h(jVarArrD, i2, jVar4);
                                            }
                                        }
                                    }
                                }
                                obj4 = null;
                            }
                        } else if (jVarK instanceof o) {
                            o oVar = (o) jVarK;
                            p pVar = oVar.e;
                            if (pVar == null || (pVarB = pVar.b(i3, obj, null)) == null) {
                                obj4 = null;
                            } else {
                                obj4 = pVarB.c;
                                if (obj3 != null && obj3 != obj4 && (obj4 == null || !obj3.equals(obj4))) {
                                    obj4 = null;
                                } else if (obj2 != null) {
                                    pVarB.c = obj2;
                                } else if (oVar.f(pVarB)) {
                                    h(jVarArrD, i2, p(oVar.f));
                                }
                            }
                        } else {
                            if (jVarK instanceof k) {
                                throw new IllegalStateException("Recursive update");
                            }
                            z = false;
                            obj4 = null;
                        }
                    } else {
                        z = false;
                        obj4 = null;
                    }
                }
                if (z) {
                    if (obj4 == null) {
                        return null;
                    }
                    if (obj2 == null) {
                        a(-1L, -1);
                    }
                    return obj4;
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        int length;
        j jVarK;
        Object obj2;
        int i2 = i(obj.hashCode());
        j[] jVarArr = this.a;
        if (jVarArr == null || (length = jVarArr.length) <= 0 || (jVarK = k(jVarArr, (length - 1) & i2)) == null) {
            return null;
        }
        int i3 = jVarK.a;
        if (i3 == i2) {
            Object obj3 = jVarK.b;
            if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                return (V) jVarK.c;
            }
        } else if (i3 < 0) {
            j jVarA = jVarK.a(i2, obj);
            if (jVarA != null) {
                return (V) jVarA.c;
            }
            return null;
        }
        while (true) {
            jVarK = jVarK.d;
            if (jVarK == null) {
                return null;
            }
            if (jVarK.a == i2 && ((obj2 = jVarK.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return (V) jVarK.c;
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map, java.util.HashMap
    public final Object getOrDefault(Object obj, Object obj2) {
        V v = get(obj);
        return v != null ? v : obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        j[] jVarArr = this.a;
        int iHashCode = 0;
        if (jVarArr != null) {
            n nVar = new n(jVarArr, jVarArr.length, 0, jVarArr.length);
            while (true) {
                j jVarA = nVar.a();
                if (jVarA == null) {
                    break;
                }
                iHashCode += jVarA.b.hashCode() ^ jVarA.c.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return j() <= 0;
    }

    public final long j() {
        b[] bVarArr = this.c;
        long j2 = this.baseCount;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                if (bVar != null) {
                    j2 += bVar.value;
                }
            }
        }
        return j2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        KeySetView keySetView = this.d;
        if (keySetView != null) {
            return keySetView;
        }
        KeySetView keySetView2 = new KeySetView(this, null);
        this.d = keySetView2;
        return keySetView2;
    }

    public final void m(j[] jVarArr, j[] jVarArr2) {
        j[] jVarArr3;
        int i2;
        boolean z;
        char c;
        int i3;
        int i4;
        j oVar;
        j oVar2;
        j jVar;
        ConcurrentHashMap<K, V> concurrentHashMap = this;
        int length = jVarArr.length;
        int i5 = g;
        boolean z2 = true;
        int i6 = i5 > 1 ? (length >>> 3) / i5 : length;
        char c2 = 16;
        int i7 = i6 < 16 ? 16 : i6;
        if (jVarArr2 == null) {
            try {
                j[] jVarArr4 = new j[length << 1];
                concurrentHashMap.b = jVarArr4;
                concurrentHashMap.transferIndex = length;
                jVarArr3 = jVarArr4;
            } catch (Throwable unused) {
                concurrentHashMap.sizeCtl = Alert.DURATION_SHOW_INDEFINITELY;
                return;
            }
        } else {
            jVarArr3 = jVarArr2;
        }
        int length2 = jVarArr3.length;
        f fVar = new f(jVarArr3);
        boolean zB = true;
        int i8 = 0;
        int i9 = 0;
        boolean z3 = false;
        while (true) {
            if (zB) {
                int i10 = i8 - 1;
                if (i10 >= i9 || z3) {
                    i9 = i9;
                    i8 = i10;
                    zB = false;
                } else {
                    int i11 = concurrentHashMap.transferIndex;
                    if (i11 <= 0) {
                        i8 = -1;
                    } else {
                        j$.sun.misc.a aVar = h;
                        long j2 = j;
                        int i12 = i11 > i7 ? i11 - i7 : 0;
                        int i13 = i9;
                        if (aVar.a.compareAndSwapInt(concurrentHashMap, j2, i11, i12)) {
                            i8 = i11 - 1;
                            i9 = i12;
                        } else {
                            i9 = i13;
                            i8 = i10;
                        }
                    }
                    zB = false;
                }
            } else {
                int i14 = i9;
                p pVar = null;
                j jVar2 = null;
                if (i8 < 0 || i8 >= length || (i4 = i8 + length) >= length2) {
                    i2 = length;
                    z = z2;
                    c = c2;
                    i3 = i7;
                    if (z3) {
                        concurrentHashMap.b = null;
                        concurrentHashMap.a = jVarArr3;
                        concurrentHashMap.sizeCtl = (i2 << 1) - (i2 >>> 1);
                        return;
                    }
                    j$.sun.misc.a aVar2 = h;
                    long j3 = i;
                    int i15 = concurrentHashMap.sizeCtl;
                    int i16 = i8;
                    if (!aVar2.a.compareAndSwapInt(concurrentHashMap, j3, i15, i15 - 1)) {
                        i8 = i16;
                    } else {
                        if (i15 - 2 != ((Integer.numberOfLeadingZeros(i2) | 32768) << 16)) {
                            return;
                        }
                        zB = z;
                        z3 = zB;
                        i8 = i2;
                    }
                } else {
                    j jVarK = k(jVarArr, i8);
                    if (jVarK == null) {
                        zB = b(jVarArr, i8, fVar);
                        i2 = length;
                        z = z2;
                        c = c2;
                        i3 = i7;
                    } else {
                        z = z2;
                        int i17 = jVarK.a;
                        if (i17 == -1) {
                            i2 = length;
                            c = c2;
                            i3 = i7;
                            zB = z;
                        } else {
                            synchronized (jVarK) {
                                if (k(jVarArr, i8) == jVarK) {
                                    if (i17 >= 0) {
                                        int i18 = i17 & length;
                                        j jVar3 = jVarK;
                                        j jVar4 = jVar3;
                                        while (true) {
                                            jVar4 = jVar4.d;
                                            if (jVar4 == null) {
                                                break;
                                            }
                                            char c3 = c2;
                                            int i19 = jVar4.a & length;
                                            if (i19 != i18) {
                                                i18 = i19;
                                                jVar3 = jVar4;
                                            }
                                            c2 = c3;
                                        }
                                        c = c2;
                                        if (i18 == 0) {
                                            jVar = null;
                                            jVar2 = jVar3;
                                        } else {
                                            jVar = jVar3;
                                        }
                                        j jVar5 = jVarK;
                                        while (jVar5 != jVar3) {
                                            int i20 = jVar5.a;
                                            Object obj = jVar5.b;
                                            j jVar6 = jVar3;
                                            Object obj2 = jVar5.c;
                                            if ((i20 & length) == 0) {
                                                jVar2 = new j(i20, obj, obj2, jVar2);
                                            } else {
                                                jVar = new j(i20, obj, obj2, jVar);
                                            }
                                            jVar5 = jVar5.d;
                                            jVar3 = jVar6;
                                            length = length;
                                        }
                                        i2 = length;
                                        h(jVarArr3, i8, jVar2);
                                        h(jVarArr3, i4, jVar);
                                        h(jVarArr, i8, fVar);
                                        i3 = i7;
                                    } else {
                                        i2 = length;
                                        c = c2;
                                        if (jVarK instanceof o) {
                                            o oVar3 = (o) jVarK;
                                            p pVar2 = null;
                                            p pVar3 = null;
                                            j jVar7 = oVar3.f;
                                            int i21 = 0;
                                            int i22 = 0;
                                            p pVar4 = null;
                                            while (jVar7 != null) {
                                                int i23 = i7;
                                                int i24 = jVar7.a;
                                                p pVar5 = new p(i24, jVar7.b, jVar7.c, null, null);
                                                if ((i24 & i2) == 0) {
                                                    pVar5.h = pVar3;
                                                    if (pVar3 == null) {
                                                        pVar = pVar5;
                                                    } else {
                                                        pVar3.d = pVar5;
                                                    }
                                                    i22++;
                                                    pVar3 = pVar5;
                                                } else {
                                                    pVar5.h = pVar2;
                                                    if (pVar2 == null) {
                                                        pVar4 = pVar5;
                                                    } else {
                                                        pVar2.d = pVar5;
                                                    }
                                                    i21++;
                                                    pVar2 = pVar5;
                                                }
                                                jVar7 = jVar7.d;
                                                i7 = i23;
                                            }
                                            i3 = i7;
                                            if (i22 <= 6) {
                                                oVar = p(pVar);
                                            } else {
                                                oVar = i21 != 0 ? new o(pVar) : oVar3;
                                            }
                                            if (i21 <= 6) {
                                                oVar2 = p(pVar4);
                                            } else {
                                                oVar2 = i22 != 0 ? new o(pVar4) : oVar3;
                                            }
                                            h(jVarArr3, i8, oVar);
                                            h(jVarArr3, i4, oVar2);
                                            h(jVarArr, i8, fVar);
                                        }
                                    }
                                    zB = z;
                                } else {
                                    i2 = length;
                                    c = c2;
                                }
                                i3 = i7;
                            }
                        }
                    }
                }
                concurrentHashMap = this;
                i9 = i14;
                z2 = z;
                c2 = c;
                length = i2;
                i7 = i3;
            }
        }
    }

    public long mappingCount() {
        long j2 = j();
        if (j2 < 0) {
            return 0L;
        }
        return j2;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i2;
        Object obj3;
        Object obj4 = obj2;
        if (obj == null || obj4 == null || biFunction == null) {
            throw null;
        }
        int i3 = i(obj.hashCode());
        j[] jVarArrE = this.a;
        int i4 = 0;
        Object obj5 = null;
        int i5 = 0;
        while (true) {
            if (jVarArrE != null) {
                int length = jVarArrE.length;
                if (length != 0) {
                    int i6 = (length - 1) & i3;
                    j jVarK = k(jVarArrE, i6);
                    i2 = 1;
                    if (jVarK != null) {
                        int i7 = jVarK.a;
                        if (i7 == -1) {
                            jVarArrE = d(jVarArrE, jVarK);
                        } else {
                            synchronized (jVarK) {
                                if (k(jVarArrE, i6) == jVarK) {
                                    if (i7 >= 0) {
                                        j jVar = null;
                                        j jVar2 = jVarK;
                                        i4 = 1;
                                        while (true) {
                                            if (jVar2.a == i3 && ((obj3 = jVar2.b) == obj || (obj3 != null && obj.equals(obj3)))) {
                                                Object objApply = biFunction.apply(jVar2.c, obj4);
                                                if (objApply == null) {
                                                    j jVar3 = jVar2.d;
                                                    if (jVar != null) {
                                                        jVar.d = jVar3;
                                                    } else {
                                                        h(jVarArrE, i6, jVar3);
                                                    }
                                                    obj5 = objApply;
                                                    i5 = -1;
                                                    break;
                                                }
                                                jVar2.c = objApply;
                                                obj5 = objApply;
                                                break;
                                            }
                                            j jVar4 = jVar2.d;
                                            if (jVar4 == null) {
                                                jVar2.d = new j(i3, obj, obj4);
                                                obj5 = obj4;
                                                i5 = 1;
                                                break;
                                            }
                                            i4++;
                                            jVar = jVar2;
                                            jVar2 = jVar4;
                                        }
                                    } else if (jVarK instanceof o) {
                                        o oVar = (o) jVarK;
                                        p pVar = oVar.e;
                                        p pVarB = pVar == null ? null : pVar.b(i3, obj, null);
                                        Object objApply2 = pVarB == null ? obj4 : biFunction.apply(pVarB.c, obj4);
                                        if (objApply2 != null) {
                                            if (pVarB != null) {
                                                pVarB.c = objApply2;
                                            } else {
                                                oVar.e(i3, obj, objApply2);
                                                i5 = 1;
                                            }
                                        } else if (pVarB != null) {
                                            if (oVar.f(pVarB)) {
                                                h(jVarArrE, i6, p(oVar.f));
                                            }
                                            i5 = -1;
                                        }
                                        i4 = 2;
                                        obj5 = objApply2;
                                    } else if (jVarK instanceof k) {
                                        throw new IllegalStateException("Recursive update");
                                    }
                                }
                            }
                            if (i4 != 0) {
                                if (i4 >= 8) {
                                    n(jVarArrE, i6);
                                }
                                i2 = i5;
                                obj4 = obj5;
                                break;
                            }
                        }
                    } else if (b(jVarArrE, i6, new j(i3, obj, obj4))) {
                        break;
                    }
                }
            }
            jVarArrE = e();
        }
        if (i2 != 0) {
            a(i2, i4);
        }
        return obj4;
    }

    public final void n(j[] jVarArr, int i2) {
        int length = jVarArr.length;
        if (length < 64) {
            o(length << 1);
            return;
        }
        j jVarK = k(jVarArr, i2);
        if (jVarK == null || jVarK.a < 0) {
            return;
        }
        synchronized (jVarK) {
            if (k(jVarArr, i2) == jVarK) {
                p pVar = null;
                j jVar = jVarK;
                p pVar2 = null;
                while (jVar != null) {
                    p pVar3 = new p(jVar.a, jVar.b, jVar.c, null, null);
                    pVar3.h = pVar2;
                    if (pVar2 == null) {
                        pVar = pVar3;
                    } else {
                        pVar2.d = pVar3;
                    }
                    jVar = jVar.d;
                    pVar2 = pVar3;
                }
                h(jVarArr, i2, new o(pVar));
            }
        }
    }

    public final void o(int i2) {
        ConcurrentHashMap<K, V> concurrentHashMap;
        int length;
        int iL = i2 >= 536870912 ? 1073741824 : l(i2 + (i2 >>> 1) + 1);
        while (true) {
            int i3 = this.sizeCtl;
            if (i3 < 0) {
                return;
            }
            j[] jVarArr = this.a;
            if (jVarArr == null || (length = jVarArr.length) == 0) {
                concurrentHashMap = this;
                int i4 = i3 > iL ? i3 : iL;
                if (h.a.compareAndSwapInt(concurrentHashMap, i, i3, -1)) {
                    try {
                        if (concurrentHashMap.a == jVarArr) {
                            concurrentHashMap.a = new j[i4];
                            i3 = i4 - (i4 >>> 2);
                        }
                        concurrentHashMap.sizeCtl = i3;
                    } catch (Throwable th) {
                        concurrentHashMap.sizeCtl = i3;
                        throw th;
                    }
                } else {
                    continue;
                }
            } else {
                if (iL <= i3 || length >= 1073741824) {
                    return;
                }
                if (jVarArr == this.a) {
                    int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(length) | 32768;
                    j$.sun.misc.a aVar = h;
                    long j2 = i;
                    int i5 = (iNumberOfLeadingZeros << 16) + 2;
                    Unsafe unsafe = aVar.a;
                    concurrentHashMap = this;
                    if (unsafe.compareAndSwapInt(concurrentHashMap, j2, i3, i5)) {
                        concurrentHashMap.m(jVarArr, null);
                    }
                } else {
                    concurrentHashMap = this;
                }
            }
            this = concurrentHashMap;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        return (V) f(k2, v, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        o(map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            f(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k2, V v) {
        return (V) f(k2, v, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || g(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return g(obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map, java.util.HashMap
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        j[] jVarArr = this.a;
        if (jVarArr == null) {
            return;
        }
        n nVar = new n(jVarArr, jVarArr.length, 0, jVarArr.length);
        while (true) {
            j jVarA = nVar.a();
            if (jVarA == null) {
                return;
            }
            Object obj = jVarA.c;
            Object obj2 = jVarA.b;
            do {
                Object objApply = biFunction.apply(obj2, obj);
                objApply.getClass();
                if (g(obj2, objApply, obj) != null) {
                    break;
                } else {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j2 = j();
        if (j2 < 0) {
            return 0;
        }
        return j2 > 2147483647L ? Alert.DURATION_SHOW_INDEFINITELY : (int) j2;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        j[] jVarArr = this.a;
        int length = jVarArr == null ? 0 : jVarArr.length;
        n nVar = new n(jVarArr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        j jVarA = nVar.a();
        if (jVarA != null) {
            while (true) {
                Object obj = jVarA.b;
                Object obj2 = jVarA.c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                jVarA = nVar.a();
                if (jVarA == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        q qVar = this.e;
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this);
        this.e = qVar2;
        return qVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        return (V) g(obj, null, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        if (obj != null && obj2 != null) {
            return g(obj, obj2, null);
        }
        throw null;
    }

    public ConcurrentHashMap(int i2) {
        this(i2, 0.75f, 1);
    }

    public ConcurrentHashMap(Map<? extends K, ? extends V> map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    public ConcurrentHashMap() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
    public static abstract class CollectionView<K, V, E> implements Collection<E>, Serializable {
        private static final long serialVersionUID = 7249069246763182397L;
        public final ConcurrentHashMap a;

        public CollectionView(ConcurrentHashMap concurrentHashMap) {
            this.a = concurrentHashMap;
        }

        @Override // java.util.Collection
        public final void clear() {
            this.a.clear();
        }

        @Override // java.util.Collection
        public abstract boolean contains(Object obj);

        @Override // java.util.Collection
        public final boolean containsAll(Collection collection) {
            if (collection != this) {
                for (E e : collection) {
                    if (e == null || !contains(e)) {
                        return false;
                    }
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public abstract Iterator iterator();

        @Override // java.util.Collection
        public abstract boolean remove(Object obj);

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            collection.getClass();
            j[] jVarArr = this.a.a;
            boolean zRemove = false;
            if (jVarArr != null) {
                if (!(collection instanceof Set) || collection.size() <= jVarArr.length) {
                    Iterator<E> it = collection.iterator();
                    while (it.hasNext()) {
                        zRemove |= remove(it.next());
                    }
                } else {
                    Iterator it2 = iterator();
                    while (it2.hasNext()) {
                        if (collection.contains(it2.next())) {
                            it2.remove();
                            zRemove = true;
                        }
                    }
                }
            }
            return zRemove;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection collection) {
            collection.getClass();
            Iterator it = iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.Collection
        public final int size() {
            return this.a.size();
        }

        @Override // java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            long jMappingCount = this.a.mappingCount();
            if (jMappingCount > 2147483639) {
                throw new OutOfMemoryError("Required array size too large");
            }
            int i = (int) jMappingCount;
            Object[] objArrCopyOf = objArr.length >= i ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
            int length = objArrCopyOf.length;
            int i2 = 0;
            for (Object obj : this) {
                if (i2 == length) {
                    if (length >= 2147483639) {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                    int i3 = length < 1073741819 ? (length >>> 1) + 1 + length : 2147483639;
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    length = i3;
                }
                objArrCopyOf[i2] = obj;
                i2++;
            }
            if (objArr == objArrCopyOf && i2 < length) {
                objArrCopyOf[i2] = null;
            } else if (i2 != length) {
                return Arrays.copyOf(objArrCopyOf, i2);
            }
            return objArrCopyOf;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("[");
            Iterator it = iterator();
            if (it.hasNext()) {
                while (true) {
                    Object next = it.next();
                    if (next == this) {
                        next = "(this Collection)";
                    }
                    sb.append(next);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append(", ");
                }
            }
            sb.append(']');
            return sb.toString();
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            long jMappingCount = this.a.mappingCount();
            if (jMappingCount <= 2147483639) {
                int i = (int) jMappingCount;
                Object[] objArrCopyOf = new Object[i];
                int i2 = 0;
                for (Object obj : this) {
                    if (i2 == i) {
                        if (i < 2147483639) {
                            int i3 = i < 1073741819 ? (i >>> 1) + 1 + i : 2147483639;
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                            i = i3;
                        } else {
                            throw new OutOfMemoryError("Required array size too large");
                        }
                    }
                    objArrCopyOf[i2] = obj;
                    i2++;
                }
                return i2 == i ? objArrCopyOf : Arrays.copyOf(objArrCopyOf, i2);
            }
            throw new OutOfMemoryError("Required array size too large");
        }
    }
}

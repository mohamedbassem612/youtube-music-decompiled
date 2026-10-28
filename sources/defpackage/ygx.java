package defpackage;

import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.proto.FormatInitializationMetadataOuterClass$FormatInitializationMetadata;
import com.google.android.apps.youtube.proto.streaming.BufferedRangeOuterClass$BufferedRange;
import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.android.apps.youtube.proto.streaming.TimeRangeOuterClass$TimeRange;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BooleanSupplier;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ygx implements ygu {
    private final Map A;
    private final Set B;
    private final abxv C;
    public final mbc a;
    public final ahey b;
    public final ahey c;
    public final AtomicLong d;
    public long e;
    public final AtomicReference f;
    public final ReentrantLock g;
    public final zjr h;
    public final yfo i;
    public final Lock j;
    final LinkedHashSet k;
    public final Map l;
    public final Set m;
    public final xeu n;
    public long o;
    public final Set p;
    public final yfz q;
    public xhn r;
    public xxy s;
    public final xxy t;
    private final boolean u;
    private final long v;
    private final Condition w;
    private final Map x;
    private final Map y;
    private final Map z;

    public ygx(xeu xeuVar, ahey aheyVar, ahey aheyVar2, mbc mbcVar, yfo yfoVar, yfz yfzVar, zjr zjrVar, xxy xxyVar, abxv abxvVar) {
        this.n = xeuVar;
        this.C = abxvVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.g = reentrantLock;
        this.j = new ReentrantLock();
        this.w = reentrantLock.newCondition();
        this.c = aheyVar;
        this.b = aheyVar2;
        this.f = new AtomicReference(ygw.a);
        this.i = yfoVar;
        this.a = mbcVar;
        this.h = zjrVar;
        this.q = yfzVar;
        this.l = new HashMap();
        this.y = new HashMap();
        this.k = new LinkedHashSet();
        this.B = new HashSet();
        this.A = new HashMap();
        this.z = new HashMap();
        this.m = new HashSet();
        int i = zic.a;
        this.x = new zib(10, 10);
        this.d = new AtomicLong(0L);
        this.o = 5000L;
        this.p = new HashSet();
        this.u = zjrVar.j.c(11, 45390770L, 0L) > 0;
        this.v = zjrVar.j.c(11, 45390770L, 0L);
        this.t = xxyVar;
    }

    public static long B(File file) {
        File[] fileArrListFiles;
        long jB = 0;
        if (file != null && file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    jB += B(file2);
                    if (file2.getName().endsWith(".tmp")) {
                        jB += file2.length();
                        file2.delete();
                    }
                }
            }
        }
        return jB;
    }

    public static jsp E(yez yezVar, ygt ygtVar, long j, yfz yfzVar) {
        String strB = ygtVar.b();
        File fileP = P(ygtVar, yezVar, yfzVar);
        if (fileP != null && fileP.exists()) {
            return new jsp(strB, yezVar.f, yezVar.g, j, fileP);
        }
        long j2 = yezVar.g;
        if (j2 <= 0) {
            j2 = -1;
        }
        return new jsp(strB, yezVar.f, j2, -9223372036854775807L, null);
    }

    static final boolean F(long j, long j2, long[] jArr, int[] iArr) {
        long j3 = j2 + j;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        int iBinarySearch2 = Arrays.binarySearch(jArr, j3);
        int length = jArr.length;
        if (j == 0 || (iBinarySearch >= 0 && iBinarySearch < length)) {
            long j4 = jArr[length - 1];
            long j5 = iArr[iArr.length - 1];
            if ((iBinarySearch2 > iBinarySearch && iBinarySearch2 < length) || j3 == j4 + j5) {
                return true;
            }
        }
        return false;
    }

    private final long G(String str, long j, long j2) {
        ygt ygtVarA = ygt.a(str);
        String str2 = ygtVarA.a;
        ygk ygkVar = ygtVarA.b;
        Map map = this.l;
        if (!map.containsKey(str2)) {
            return -j2;
        }
        ygl yglVar = (ygl) map.get(str2);
        yez yezVarC = yglVar.c(ygkVar, j);
        if ((yezVarC.b & 64) == 0) {
            long j3 = yezVarC.g;
            if (j3 == -1) {
                j3 = Long.MAX_VALUE;
            }
            return -Math.min(j3, j2);
        }
        long j4 = j + j2;
        long jMax = yezVarC.f + yezVarC.g;
        TreeSet treeSet = ((ygj) yglVar.f.get(ygkVar)).b;
        if (jMax < j4) {
            for (yez yezVar : treeSet.tailSet(yezVarC, false)) {
                long j5 = yezVar.f;
                if (j5 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j5 + yezVar.g);
                if (jMax >= j4) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j2);
    }

    private final jsp H(ygl yglVar, ygt ygtVar, long j) {
        if (yglVar == null) {
            return new jsp(ygtVar.b(), j, -1L, -9223372036854775807L, null);
        }
        return E(yglVar.c(ygtVar.b, j), ygtVar, yglVar.b(), this.q);
    }

    private final ygl I(String str) {
        woi woiVar = new woi(this, 7);
        Map map = this.l;
        j$.util.Map.EL.computeIfAbsent(map, str, woiVar);
        return (ygl) map.get(str);
    }

    private final File J(ygt ygtVar, long j) {
        yfz yfzVar = this.q;
        String str = yfzVar.b;
        String str2 = ygtVar.a;
        ygk ygkVar = ygtVar.b;
        return new File(new File(yfzVar.f(str, str2, ygkVar)), ygkVar.a + '_' + j + ".tmp");
    }

    private final void K(ygt ygtVar, ywn ywnVar, String str) {
        yfa yfaVar = (yfa) this.A.remove(ygtVar);
        if (yfaVar != null) {
            AtomicLong atomicLong = this.d;
            File file = yfaVar.b;
            long length = file.length();
            atomicLong.getAndAdd(-length);
            file.delete();
            ywnVar.w("cdpseg", yfaVar.a.f + '.' + length + '.' + str);
        }
    }

    private final void L(ygl yglVar) throws jsi {
        LinkedHashSet linkedHashSet = this.k;
        long jA = yglVar.a();
        Map map = this.l;
        String str = yglVar.c;
        boolean zRemove = linkedHashSet.remove(str);
        map.remove(str);
        this.d.getAndAdd(-jA);
        agke agkeVar = (agke) Collection.EL.stream(yglVar.g()).map(new woi(str, 4)).collect(aghu.a);
        int size = agkeVar.size();
        for (int i = 0; i < size; i++) {
            ygt ygtVar = (ygt) agkeVar.get(i);
            this.m.remove(ygtVar.b());
            this.x.remove(ygtVar.b());
        }
        this.b.execute(afwl.i(new xoy(this, str, 8)));
        String strConcat = jA == 0 ? "m.vidSizeZero" : "m";
        if (!zRemove) {
            strConcat = strConcat.concat(".lruRemoveFailed");
        }
        if (!strConcat.equals("m")) {
            throw new jsi(strConcat);
        }
    }

    private final void M(File file) {
        this.z.remove(file);
        if (file.exists()) {
            file.delete();
        }
    }

    private final void N(ygt ygtVar, yez yezVar, String str, ywn ywnVar) throws jsi {
        woi woiVar = new woi(this, 8);
        Map map = this.l;
        String str2 = ygtVar.a;
        ygl yglVar = (ygl) j$.util.Map.EL.computeIfAbsent(map, str2, woiVar);
        yglVar.h(ygtVar.b, str, yezVar);
        this.d.getAndAdd(yezVar.g);
        String str3 = yglVar.c;
        LinkedHashSet linkedHashSet = this.k;
        linkedHashSet.remove(str3);
        linkedHashSet.add(str3);
        this.m.add(ygtVar.b());
        jsp jspVarE = E(yezVar, ygtVar, yglVar.b(), this.q);
        String str4 = jspVarE.a;
        Map map2 = this.x;
        if (map2.containsKey(str4)) {
            ((NavigableSet) map2.get(str4)).add(jspVarE);
        }
        if (this.u) {
            O(str2, yglVar, ywnVar);
            return;
        }
        try {
            yglVar.j();
        } catch (IOException e) {
            throw new jsi(e);
        }
    }

    private final void O(String str, ygl yglVar, ywn ywnVar) {
        Set set = this.p;
        synchronized (set) {
            if (!set.contains(str)) {
                this.b.schedule(new xhv(this, str, yglVar, ywnVar, 3), this.v, TimeUnit.MILLISECONDS);
                set.add(str);
            }
        }
    }

    private static File P(ygt ygtVar, yez yezVar, yfz yfzVar) {
        Set setY = wir.y();
        ygk ygkVar = ygtVar.b;
        if (setY.contains(Integer.valueOf(ygkVar.a))) {
            return yfzVar.d(ygtVar.a, ygkVar, yezVar.f);
        }
        if ((yezVar.b & 64) != 0) {
            return yfzVar.d(ygtVar.a, ygkVar, yezVar.h);
        }
        return null;
    }

    @Override // defpackage.ygu
    public final void A(xxy xxyVar) {
        if (this.h.eg() && xxyVar == null) {
            zik.bB(this.n, 15, new jsi("c.regInitListener;m.nullListener"));
            return;
        }
        Lock lock = this.j;
        lock.lock();
        try {
            ygw ygwVar = (ygw) this.f.get();
            if (this.s != null) {
                throw new IllegalStateException();
            }
            if (ygwVar == ygw.a) {
                this.s = xxyVar;
            } else {
                xhn xhnVar = this.r;
                if (xhnVar == null) {
                    zik.bB(this.n, 2, new jsi("c.regInitListener;m.nullInitStats"));
                } else {
                    this.b.execute(afwl.i(new xoy(xxyVar, xhnVar, 9, null)));
                }
            }
            lock.unlock();
        } catch (Throwable th) {
            this.j.unlock();
            throw th;
        }
    }

    public final void C(boolean z, boolean z2) {
        if (z) {
            this.y.clear();
        }
        if (z2) {
            this.B.clear();
        }
        this.l.clear();
        this.m.clear();
        this.x.clear();
        this.d.set(0L);
        this.k.clear();
        Map map = this.z;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        map.clear();
        Map map2 = this.A;
        Iterator it2 = map2.entrySet().iterator();
        while (it2.hasNext()) {
            ((yfa) ((Map.Entry) it2.next()).getValue()).b.delete();
        }
        map2.clear();
    }

    final void D(String str, boolean z) throws jsi {
        Map map = this.A;
        Stream streamFilter = Collection.EL.stream(map.keySet()).filter(new xdo(str, 7));
        Collector collector = aghu.a;
        agke agkeVar = (agke) streamFilter.collect(collector);
        int size = agkeVar.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            yfa yfaVar = (yfa) map.remove((ygt) agkeVar.get(i));
            if (yfaVar != null) {
                this.d.getAndAdd(-yfaVar.b.length());
                z2 = true;
            }
        }
        Map map2 = this.l;
        ygl yglVar = (ygl) map2.get(str);
        if (yglVar == null) {
            if (!z2) {
                throw new jsi("m.vidMetaEmpty");
            }
            this.k.remove(str);
            return;
        }
        if (z) {
            vxz vxzVar = this.h.j;
            long j = 0;
            if (vxzVar.d(22, 45411456L) > 0 && map2.size() <= vxzVar.d(22, 45411456L)) {
                long jD = vxzVar.d(23, 45411457L);
                long j2 = 0;
                for (ygk ygkVar : yglVar.g()) {
                    agke agkeVar2 = (agke) Collection.EL.stream(yglVar.f(ygkVar)).limit(jD).collect(collector);
                    ygt ygtVar = new ygt(yglVar.c, ygkVar);
                    int size2 = agkeVar2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        yez yezVar = (yez) agkeVar2.get(i2);
                        long j3 = j;
                        File fileP = P(ygtVar, yezVar, this.q);
                        if (fileP != null && fileP.exists() && fileP.delete()) {
                            yglVar.k(ygkVar, yezVar);
                            j2 += yezVar.g;
                        }
                        i2++;
                        j = j3;
                    }
                }
                long j4 = j;
                this.d.getAndAdd(-j2);
                if (j2 == j4) {
                    L(yglVar);
                    return;
                } else {
                    try {
                        yglVar.j();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
        }
        L(yglVar);
    }

    @Override // defpackage.jsk
    public final long a() {
        return this.d.get();
    }

    @Override // defpackage.jsk
    public final jsp b(String str, long j) {
        if (this.f.get() != ygw.b) {
            return null;
        }
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        while (true) {
            try {
                jsp jspVarC = c(str, j);
                if (jspVarC != null) {
                    reentrantLock.unlock();
                    return jspVarC;
                }
                this.w.await();
            } catch (Throwable th) {
                this.g.unlock();
                throw th;
            }
        }
    }

    @Override // defpackage.jsk
    public final jsp c(String str, long j) {
        if (this.f.get() != ygw.b) {
            return null;
        }
        agke agkeVarN = agpi.a;
        ygt ygtVarA = ygt.a(str);
        String str2 = ygtVarA.a;
        this.q.e(str2);
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            ygl yglVarI = I(str2);
            jsp jspVarH = H(yglVarI, ygtVarA, j);
            if (jspVarH.d) {
                long epochMilli = this.a.f().toEpochMilli();
                LinkedHashSet linkedHashSet = this.k;
                String str3 = yglVarI.c;
                linkedHashSet.remove(str3);
                linkedHashSet.add(str3);
                if (epochMilli - yglVarI.b() > this.o) {
                    this.b.submit(afwl.i(new jup(yglVarI, epochMilli, 12)));
                }
                ArrayList arrayList = (ArrayList) this.y.get(ygtVarA);
                if (arrayList != null) {
                    agkeVarN = agke.n(arrayList);
                }
                jsp jspVarH2 = H(yglVarI, ygtVarA, j);
                reentrantLock.unlock();
                Iterator it = aguu.t(agkeVarN).iterator();
                while (it.hasNext()) {
                    ((jsj) it.next()).b(this, jspVarH, jspVarH2);
                }
            } else {
                Set set = this.B;
                if (set.contains(ygtVarA)) {
                    reentrantLock.unlock();
                    return null;
                }
                set.add(ygtVarA);
                this.g.unlock();
            }
            return jspVarH;
        } catch (Throwable th) {
            this.g.unlock();
            throw th;
        }
    }

    @Override // defpackage.jsk
    public final jsu d(String str) {
        return jsv.a;
    }

    @Override // defpackage.jsk
    public final File e(String str, long j, long j2) {
        return f(str, j, j2, null);
    }

    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.jsk
    public final File f(String str, long j, long j2, ypq ypqVar) throws jsi {
        elr elrVar;
        ywn ywnVar;
        boolean z;
        long j3;
        boolean z2;
        yfa yfaVar;
        long j4;
        long jA;
        boolean z3;
        agfp agfpVar;
        ywb ywbVar;
        int i;
        boolean z4;
        yfa yfaVar2;
        long[] jArrH;
        int iBinarySearch;
        ygw ygwVar = (ygw) this.f.get();
        if (ygwVar == ygw.a) {
            return null;
        }
        if (ygwVar == ygw.c) {
            throw new jsi("c.startFileOnReleasedCache");
        }
        abxv abxvVar = this.C;
        zkf.d(abxvVar);
        ygt ygtVarA = ygt.a(str);
        boolean zContains = wir.y().contains(Integer.valueOf(ygtVarA.b.a));
        long j5 = 0;
        elr elrVarA = (zContains || j <= 0) ? null : abxvVar.A(new agqj(this), ygtVarA.b(), false);
        ywn ywnVar2 = ywn.b;
        if (ypqVar != null) {
            cuz cuzVar = ypqVar.g;
            ywn ywnVar3 = ypqVar.f;
            elr elrVarJ = elr.J(cuzVar);
            elrVar = (elrVarA != null || elrVarJ == null) ? elrVarA : elrVarJ;
            ywnVar = ywnVar3;
        } else {
            elrVar = elrVarA;
            ywnVar = ywnVar2;
        }
        this.g.lock();
        try {
            if (zContains) {
                z = true;
            } else {
                if (j > 0 && elrVar == null) {
                    zhr.b(zhq.CACHE, "Segment map is not available for exoCacheKey=%s", ygtVarA.b());
                    ygl yglVar = (ygl) this.l.get(ygtVarA.a);
                    long j6 = -1;
                    if (yglVar != null) {
                        Optional optionalFindFirst = Collection.EL.stream(yglVar.f(ygtVarA.b)).findFirst();
                        if (optionalFindFirst.isPresent() && (((yez) optionalFindFirst.get()).b & 16) != 0) {
                            j6 = ((yez) optionalFindFirst.get()).f;
                        }
                    }
                    throw new jsi("c.segmentMapMissingAtStartFile;DiskFirstPos." + j6 + ";ReqD." + (ypqVar != null));
                }
                z = false;
            }
            yfz yfzVar = this.q;
            File file = yfzVar.c;
            if (!file.exists()) {
                file.mkdirs();
                Iterator it = yfzVar.c().iterator();
                while (it.hasNext()) {
                    yfzVar.j((String) it.next());
                }
                C(false, false);
            }
            if (z || j == 0) {
                j3 = j2;
                z2 = true;
                File fileJ = J(ygtVarA, j);
                aihf aihfVarCreateBuilder = yez.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                yez yezVar = (yez) aihfVarCreateBuilder.instance;
                yezVar.b |= 16;
                yezVar.f = j;
                yfaVar = new yfa((yez) aihfVarCreateBuilder.build(), fileJ);
            } else {
                zkf.d(elrVar);
                j3 = j2;
                z2 = true;
                if (F(j, j3, elrVar.H(), elrVar.F())) {
                    if (((yfa) this.A.get(ygtVarA)) != null) {
                        K(ygtVarA, ywnVar, "sfcmer");
                    }
                    aihf aihfVarCreateBuilder2 = yez.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    yez yezVar2 = (yez) aihfVarCreateBuilder2.instance;
                    yezVar2.b |= 16;
                    yezVar2.f = j;
                    yfaVar = new yfa((yez) aihfVarCreateBuilder2.build(), J(ygtVarA, j));
                } else {
                    if (this.h.j.m(94, 45400437L) && (iBinarySearch = Arrays.binarySearch((jArrH = elrVar.H()), j)) >= 0 && iBinarySearch < jArrH.length) {
                        K(ygtVarA, ywnVar, "sfpoff");
                    }
                    Map map = this.A;
                    yfa yfaVar3 = (yfa) map.get(ygtVarA);
                    if (yfaVar3 == null) {
                        File fileJ2 = J(ygtVarA, j);
                        aihf aihfVarCreateBuilder3 = yez.a.createBuilder();
                        aihfVarCreateBuilder3.copyOnWrite();
                        yez yezVar3 = (yez) aihfVarCreateBuilder3.instance;
                        yezVar3.b |= 16;
                        yezVar3.f = j;
                        yez yezVar4 = (yez) aihfVarCreateBuilder3.build();
                        map.put(ygtVarA, new yfa(yezVar4, fileJ2));
                        yfaVar2 = new yfa(yezVar4, fileJ2);
                    } else {
                        yez yezVar5 = yfaVar3.a;
                        long j7 = yezVar5.f;
                        File file2 = yfaVar3.b;
                        if (j7 + file2.length() == j) {
                            yfaVar2 = new yfa(yezVar5, file2);
                        } else {
                            K(ygtVarA, ywnVar, "sfpmer");
                            File fileJ3 = J(ygtVarA, j);
                            aihf aihfVarCreateBuilder4 = yez.a.createBuilder();
                            aihfVarCreateBuilder4.copyOnWrite();
                            yez yezVar6 = (yez) aihfVarCreateBuilder4.instance;
                            yezVar6.b |= 16;
                            yezVar6.f = j;
                            yez yezVar7 = (yez) aihfVarCreateBuilder4.build();
                            map.put(ygtVarA, new yfa(yezVar7, fileJ3));
                            yfaVar2 = new yfa(yezVar7, fileJ3);
                        }
                    }
                    yfaVar = yfaVar2;
                }
            }
            yfo yfoVar = this.i;
            long jA2 = yfoVar.a();
            zjr zjrVar = yfoVar.d;
            float f = zjrVar.S().ag * jA2;
            vxz vxzVar = zjrVar.j;
            ygt ygtVar = ygtVarA;
            long jD = vxzVar.d(8, 45385369L);
            ywn ywnVar4 = ywnVar;
            boolean zM = vxzVar.m(89, 45390650L);
            final double dB = vxzVar.b(0, 45390721L);
            String str2 = "";
            if (zM) {
                agfp agfpVarB = agfp.b(agdd.a);
                final wjr wjrVar = yfoVar.k;
                final BooleanSupplier booleanSupplier = new BooleanSupplier() { // from class: yfj
                    @Override // java.util.function.BooleanSupplier
                    public final boolean getAsBoolean() {
                        return Math.random() < dB;
                    }
                };
                j4 = jA2;
                jA = j4;
                ywbVar = (ywb) j$.util.Map.EL.computeIfAbsent(wjrVar.a, ywnVar4, new Function() { // from class: yvz
                    @Override // java.util.function.Function
                    /* JADX INFO: renamed from: andThen */
                    public final /* synthetic */ Function mo840andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        wjr wjrVar2 = wjrVar;
                        return booleanSupplier.getAsBoolean() ? new ywb((int) ((zhl) wjrVar2.b).I(), (ywn) obj) : new ywb((int) ((zhl) wjrVar2.b).I(), ywn.b);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                agfpVar = agfpVarB;
                i = 0;
                z3 = false;
            } else {
                j4 = jA2;
                jA = j4;
                z3 = false;
                agfpVar = null;
                ywbVar = null;
                i = 0;
            }
            while (true) {
                boolean z5 = z3;
                if (jA + j3 <= yfoVar.c.a(jA) && (j5 <= j5 || j5 >= f)) {
                    if (!zM || !z5) {
                        break;
                        break;
                    }
                    yfo.e(ywbVar, jA, j5, i, agfpVar.a(TimeUnit.MICROSECONDS));
                    break;
                }
                long j8 = j5;
                long j9 = jA;
                ywb ywbVar2 = ywbVar;
                Optional optionalMin = Collection.EL.stream(yfoVar.a).min(Comparator$CC.comparing(new xjh(16)));
                if (optionalMin.isEmpty()) {
                    break;
                }
                ygtVar = ygtVar;
                if (zM) {
                    if (!z5) {
                        ywbVar2.w("cevict", "start." + j3 + '.' + j9 + '.' + agfpVar.a(TimeUnit.MICROSECONDS));
                    }
                    z4 = z2;
                } else {
                    yfoVar = yfoVar;
                    yfaVar = yfaVar;
                    ygtVar = ygtVar;
                    z4 = false;
                }
                try {
                    ((ygu) optionalMin.get()).x();
                } catch (jsi e) {
                    str2 = str2 + ';' + e.getMessage();
                }
                jA = yfoVar.a();
                if (jD > j5 && jA == j9) {
                    int i2 = i + 1;
                    boolean z6 = z4;
                    if (i2 > jD) {
                        if (z6) {
                            yfo.e(ywbVar2, j9, j8, i2, agfpVar.a(TimeUnit.MICROSECONDS));
                        }
                        throw new jsi("c.exceededMaxDeleteVideoFailureCount".concat(";atMax." + (((ygu) optionalMin.get()).r() == Long.MAX_VALUE ? z2 : false) + ';' + str2));
                    }
                    i = i2;
                }
                j5 = j4 - jA;
                z3 = z2;
                yfoVar = yfoVar;
                yfaVar = yfaVar;
                ywbVar = ywbVar2;
                jD = jD;
            }
            Map map2 = this.z;
            File file3 = yfaVar.b;
            map2.put(file3, new ygg(yfaVar.a, ygtVar));
            this.g.unlock();
            return file3;
        } catch (Throwable th) {
            this.g.unlock();
            throw th;
        }
    }

    @Override // defpackage.jsk
    public final NavigableSet g(String str) {
        if (this.f.get() != ygw.b) {
            return new TreeSet();
        }
        this.g.lock();
        try {
            Map map = this.x;
            if (!map.containsKey(str)) {
                ygt ygtVarA = ygt.a(str);
                String str2 = ygtVarA.a;
                ygk ygkVar = ygtVarA.b;
                ygl yglVar = (ygl) this.l.get(str2);
                map.put(str, yglVar == null ? new TreeSet() : (NavigableSet) Collection.EL.stream(yglVar.f(ygkVar)).map(new hpm(this, ygtVarA, yglVar, 9)).collect(Collectors.toCollection(new ieu(19))));
            }
            return new TreeSet((SortedSet) map.get(str));
        } finally {
            this.g.unlock();
        }
    }

    @Override // defpackage.jsk
    public final Set h() {
        if (this.f.get() != ygw.b) {
            return agpr.a;
        }
        this.g.lock();
        try {
            return new HashSet(this.m);
        } finally {
            this.g.unlock();
        }
    }

    @Override // defpackage.jsk
    public final void i(File file, long j) throws jsi {
        j(file, j, null);
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0310 A[Catch: all -> 0x037a, TRY_ENTER, TryCatch #1 {all -> 0x037a, blocks: (B:10:0x002b, B:12:0x0031, B:14:0x003b, B:16:0x003f, B:18:0x0043, B:20:0x0049, B:22:0x004d, B:25:0x0057, B:28:0x0072, B:30:0x00a6, B:31:0x00a9, B:33:0x00af, B:84:0x0310, B:86:0x0334, B:88:0x033a, B:34:0x00b3, B:35:0x00b8, B:36:0x00b9, B:38:0x00c1, B:40:0x0108, B:41:0x010b, B:43:0x0111, B:45:0x0118, B:46:0x011f, B:47:0x0120, B:50:0x0132, B:51:0x0139, B:53:0x013b, B:55:0x0155, B:57:0x015d, B:59:0x0165, B:60:0x0169, B:61:0x016e, B:63:0x01b1, B:64:0x01b4, B:66:0x01ba, B:68:0x01c0, B:70:0x01c6, B:72:0x01cc, B:74:0x01d2, B:75:0x020b, B:76:0x020c, B:77:0x0211, B:78:0x0212, B:79:0x0289, B:80:0x02ef, B:81:0x02f0, B:94:0x035d, B:95:0x0365, B:96:0x0366, B:97:0x0370, B:98:0x0371), top: B:107:0x002b, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0334 A[Catch: all -> 0x037a, TryCatch #1 {all -> 0x037a, blocks: (B:10:0x002b, B:12:0x0031, B:14:0x003b, B:16:0x003f, B:18:0x0043, B:20:0x0049, B:22:0x004d, B:25:0x0057, B:28:0x0072, B:30:0x00a6, B:31:0x00a9, B:33:0x00af, B:84:0x0310, B:86:0x0334, B:88:0x033a, B:34:0x00b3, B:35:0x00b8, B:36:0x00b9, B:38:0x00c1, B:40:0x0108, B:41:0x010b, B:43:0x0111, B:45:0x0118, B:46:0x011f, B:47:0x0120, B:50:0x0132, B:51:0x0139, B:53:0x013b, B:55:0x0155, B:57:0x015d, B:59:0x0165, B:60:0x0169, B:61:0x016e, B:63:0x01b1, B:64:0x01b4, B:66:0x01ba, B:68:0x01c0, B:70:0x01c6, B:72:0x01cc, B:74:0x01d2, B:75:0x020b, B:76:0x020c, B:77:0x0211, B:78:0x0212, B:79:0x0289, B:80:0x02ef, B:81:0x02f0, B:94:0x035d, B:95:0x0365, B:96:0x0366, B:97:0x0370, B:98:0x0371), top: B:107:0x002b, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0339  */
    /* JADX WARN: Code duplicated, block: B:92:0x0352 A[LOOP:0: B:90:0x034c->B:92:0x0352, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x0371 A[Catch: all -> 0x037a, TRY_LEAVE, TryCatch #1 {all -> 0x037a, blocks: (B:10:0x002b, B:12:0x0031, B:14:0x003b, B:16:0x003f, B:18:0x0043, B:20:0x0049, B:22:0x004d, B:25:0x0057, B:28:0x0072, B:30:0x00a6, B:31:0x00a9, B:33:0x00af, B:84:0x0310, B:86:0x0334, B:88:0x033a, B:34:0x00b3, B:35:0x00b8, B:36:0x00b9, B:38:0x00c1, B:40:0x0108, B:41:0x010b, B:43:0x0111, B:45:0x0118, B:46:0x011f, B:47:0x0120, B:50:0x0132, B:51:0x0139, B:53:0x013b, B:55:0x0155, B:57:0x015d, B:59:0x0165, B:60:0x0169, B:61:0x016e, B:63:0x01b1, B:64:0x01b4, B:66:0x01ba, B:68:0x01c0, B:70:0x01c6, B:72:0x01cc, B:74:0x01d2, B:75:0x020b, B:76:0x020c, B:77:0x0211, B:78:0x0212, B:79:0x0289, B:80:0x02ef, B:81:0x02f0, B:94:0x035d, B:95:0x0365, B:96:0x0366, B:97:0x0370, B:98:0x0371), top: B:107:0x002b, inners: #3 }] */
    @Override // defpackage.jsk
    public final void j(File file, long j, ypq ypqVar) throws jsi {
        elr elrVarJ;
        ygt ygtVar;
        yez yezVar;
        jsp jspVarE;
        ArrayList arrayList;
        agke agkeVarN;
        Iterator it;
        wgs wgsVar;
        ygw ygwVar = (ygw) this.f.get();
        if (ygwVar == ygw.a) {
            file.delete();
            return;
        }
        if (ygwVar == ygw.c) {
            file.delete();
            throw new jsi("c.commitFileOnReleasedCache");
        }
        ReentrantLock reentrantLock = this.g;
        agke agkeVar = agpi.a;
        reentrantLock.lock();
        if (j != 0) {
            try {
                if (file.exists()) {
                    ygg yggVar = (ygg) this.z.remove(file);
                    if (yggVar == null) {
                        M(file);
                        throw new jsi("c.commitWithoutStart");
                    }
                    ygt ygtVar2 = yggVar.b;
                    String strZ = (ypqVar == null || (wgsVar = ypqVar.h) == null) ? null : wgsVar.z();
                    ywn ywnVar = ywn.b;
                    if (ypqVar != null) {
                        ywnVar = ypqVar.f;
                        elrVarJ = elr.J(ypqVar.g);
                    } else {
                        elrVarJ = null;
                    }
                    try {
                        yez yezVar2 = yggVar.a;
                        abxv abxvVar = this.C;
                        zkf.d(abxvVar);
                        Set setY = wir.y();
                        ygk ygkVar = ygtVar2.b;
                        if (setY.contains(Integer.valueOf(ygkVar.a))) {
                            long length = file.length();
                            aihf aihfVarCreateBuilder = yez.a.createBuilder(yezVar2);
                            aihfVarCreateBuilder.copyOnWrite();
                            yez yezVar3 = (yez) aihfVarCreateBuilder.instance;
                            yezVar3.b |= 32;
                            yezVar3.g = length;
                            yezVar = (yez) aihfVarCreateBuilder.build();
                            File fileD = this.q.d(ygtVar2.a, ygkVar, yezVar2.f);
                            File parentFile = fileD.getParentFile();
                            if (!parentFile.exists()) {
                                parentFile.mkdirs();
                            }
                            if (!file.renameTo(fileD)) {
                                throw new jsi("c.mediaFileRenameFailed");
                            }
                            N(ygtVar2, yezVar, strZ, ywnVar);
                        } else {
                            if (yezVar2.f == 0) {
                                long length2 = file.length();
                                aihf aihfVarCreateBuilder2 = yez.a.createBuilder(yezVar2);
                                aihfVarCreateBuilder2.copyOnWrite();
                                yez yezVar4 = (yez) aihfVarCreateBuilder2.instance;
                                yezVar4.b |= 64;
                                yezVar4.h = 0L;
                                aihfVarCreateBuilder2.copyOnWrite();
                                yez yezVar5 = (yez) aihfVarCreateBuilder2.instance;
                                yezVar5.b |= 32;
                                yezVar5.g = length2;
                                yezVar = (yez) aihfVarCreateBuilder2.build();
                                File fileD2 = this.q.d(ygtVar2.a, ygkVar, 0L);
                                File parentFile2 = fileD2.getParentFile();
                                if (!parentFile2.exists()) {
                                    parentFile2.mkdirs();
                                }
                                if (!file.renameTo(fileD2)) {
                                    throw new jsi("c.mediaFileRenameFailed");
                                }
                                N(ygtVar2, yezVar, strZ, ywnVar);
                            } else {
                                elr elrVarA = abxvVar.A(new agqj(this), ygtVar2.b(), false);
                                if (elrVarA != null) {
                                    elrVarJ = elrVarA;
                                } else if (elrVarJ == null) {
                                    throw new IllegalStateException("c.segmentMapMissingAtCommit");
                                }
                                long length3 = file.length();
                                boolean zF = F(yezVar2.f, length3, elrVarJ.H(), elrVarJ.F());
                                Map map = this.A;
                                if (zF) {
                                    yfa yfaVar = (yfa) map.get(ygtVar2);
                                    if (yfaVar != null) {
                                        if (file.equals(yfaVar.b)) {
                                            map.remove(ygtVar2);
                                        } else {
                                            K(ygtVar2, ywnVar, "cfc");
                                        }
                                    }
                                    long jCB = zik.cB(elrVarJ, yezVar2.f);
                                    String str = strZ;
                                    long jCB2 = zik.cB(elrVarJ, yezVar2.f + length3) - jCB;
                                    elq elqVarG = elq.G(elrVarJ);
                                    int iN = elqVarG.n(yezVar2.f);
                                    int iMax = Math.max(elqVarG.n(yezVar2.f + length3) - iN, 1);
                                    long j2 = iN;
                                    File fileD3 = this.q.d(ygtVar2.a, ygkVar, j2);
                                    File parentFile3 = fileD3.getParentFile();
                                    if (!parentFile3.exists()) {
                                        parentFile3.mkdirs();
                                    }
                                    if (fileD3.exists()) {
                                        long jG = G(ygtVar2.b(), yezVar2.f, length3);
                                        throw new jsi("c.mFileEx;p." + yezVar2.f + ";cl." + jG + ";vs." + this.l.size() + ";sq." + iN + ";cf." + file.length() + ";mf." + fileD3.length() + ";ls." + this.k.size());
                                    }
                                    if (!file.renameTo(fileD3)) {
                                        if (!file.exists()) {
                                            throw new yfs();
                                        }
                                        File parentFile4 = file.getParentFile();
                                        String absolutePath = parentFile4 != null ? parentFile4.getAbsolutePath() : null;
                                        throw new jsi("c.mFileRe;p." + yezVar2.f + "pa." + parentFile3.isDirectory() + '.' + parentFile3.exists() + '.' + parentFile3.getAbsolutePath().equals(absolutePath));
                                    }
                                    aihf aihfVarCreateBuilder3 = yez.a.createBuilder(yezVar2);
                                    aihfVarCreateBuilder3.copyOnWrite();
                                    yez yezVar6 = (yez) aihfVarCreateBuilder3.instance;
                                    yezVar6.b |= 2;
                                    yezVar6.c = 1000000;
                                    aihfVarCreateBuilder3.copyOnWrite();
                                    yez yezVar7 = (yez) aihfVarCreateBuilder3.instance;
                                    yezVar7.b |= 4;
                                    yezVar7.d = jCB;
                                    aihfVarCreateBuilder3.copyOnWrite();
                                    yez yezVar8 = (yez) aihfVarCreateBuilder3.instance;
                                    yezVar8.b |= 8;
                                    yezVar8.e = jCB2;
                                    aihfVarCreateBuilder3.copyOnWrite();
                                    yez yezVar9 = (yez) aihfVarCreateBuilder3.instance;
                                    yezVar9.b |= 32;
                                    yezVar9.g = length3;
                                    aihfVarCreateBuilder3.copyOnWrite();
                                    yez yezVar10 = (yez) aihfVarCreateBuilder3.instance;
                                    yezVar10.b |= 64;
                                    yezVar10.h = j2;
                                    aihfVarCreateBuilder3.copyOnWrite();
                                    yez yezVar11 = (yez) aihfVarCreateBuilder3.instance;
                                    yezVar11.b |= SemanticState.Focused;
                                    yezVar11.i = iMax;
                                    yezVar = (yez) aihfVarCreateBuilder3.build();
                                    ygtVar = ygtVar2;
                                    N(ygtVar, yezVar, str, ywnVar);
                                } else {
                                    ygtVar = ygtVar2;
                                    j$.util.Map.EL.putIfAbsent(map, ygtVar, new yfa(yezVar2, file));
                                    this.d.getAndAdd(file.length());
                                    LinkedHashSet linkedHashSet = this.k;
                                    String str2 = ygtVar.a;
                                    linkedHashSet.remove(str2);
                                    linkedHashSet.add(str2);
                                    yezVar = null;
                                }
                            }
                            if (yezVar != null) {
                                jspVarE = E(yezVar, ygtVar, ((ygl) j$.util.Map.EL.computeIfAbsent(this.l, ygtVar.a, new woi(this, 5))).b(), this.q);
                                arrayList = (ArrayList) this.y.get(ygtVar);
                                if (arrayList != null) {
                                    agkeVarN = agke.n(arrayList);
                                } else {
                                    agkeVarN = agkeVar;
                                }
                                this.w.signalAll();
                                this.g.unlock();
                                it = aguu.t(agkeVarN).iterator();
                                while (it.hasNext()) {
                                    ((jsj) it.next()).a(this, jspVarE);
                                }
                                return;
                            }
                        }
                        ygtVar = ygtVar2;
                        if (yezVar != null) {
                            jspVarE = E(yezVar, ygtVar, ((ygl) j$.util.Map.EL.computeIfAbsent(this.l, ygtVar.a, new woi(this, 5))).b(), this.q);
                            arrayList = (ArrayList) this.y.get(ygtVar);
                            if (arrayList != null) {
                                agkeVarN = agke.n(arrayList);
                            } else {
                                agkeVarN = agkeVar;
                            }
                            this.w.signalAll();
                            this.g.unlock();
                            it = aguu.t(agkeVarN).iterator();
                            while (it.hasNext()) {
                                ((jsj) it.next()).a(this, jspVarE);
                            }
                            return;
                        }
                    } catch (IllegalStateException e) {
                        M(file);
                        throw new jsi(e);
                    } catch (yfs unused) {
                    }
                } else {
                    M(file);
                }
            } catch (Throwable th) {
                this.g.unlock();
                throw th;
            }
        } else {
            M(file);
        }
        this.g.unlock();
    }

    @Override // defpackage.jsk
    public final void k() {
        AtomicReference atomicReference = this.f;
        Object obj = atomicReference.get();
        ygw ygwVar = ygw.c;
        if (obj != ygwVar) {
            this.g.lock();
            try {
                C(true, true);
                atomicReference.set(ygwVar);
            } finally {
                this.g.unlock();
            }
        }
    }

    @Override // defpackage.jsk
    public final void l(jsp jspVar) {
        if (this.f.get() == ygw.b) {
            this.g.lock();
            try {
                this.B.remove(ygt.a(jspVar.a));
                this.w.signalAll();
            } finally {
                this.g.unlock();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    @Override // defpackage.jsk
    public final void m(jsp jspVar) {
        ?? r0;
        if (this.f.get() == ygw.b) {
            ReentrantLock reentrantLock = this.g;
            agke agkeVarN = agpi.a;
            reentrantLock.lock();
            try {
                String str = jspVar.a;
                ygt ygtVarA = ygt.a(str);
                String str2 = ygtVarA.a;
                ygk ygkVar = ygtVarA.b;
                Map map = this.l;
                ygl yglVar = (ygl) map.get(str2);
                if (yglVar != null) {
                    ygt ygtVarA2 = ygt.a(str);
                    yez yezVarC = ((ygl) map.get(ygtVarA2.a)).c(ygtVarA2.b, jspVar.b);
                    boolean zContains = wir.y().contains(Integer.valueOf(ygkVar.a));
                    if ((yezVarC.b & 64) != 0 || zContains) {
                        File fileP = P(ygtVarA, yezVarC, this.q);
                        Object obj = null;
                        if (fileP != null && fileP.exists() && fileP.delete()) {
                            yglVar.k(ygkVar, yezVarC);
                            try {
                                yglVar.j();
                                ArrayList arrayList = (ArrayList) this.y.get(ygtVarA);
                                if (arrayList != null) {
                                    agkeVarN = agke.n(arrayList);
                                }
                                if (yglVar.a() == 0) {
                                    try {
                                        String str3 = yglVar.c;
                                        if (this.f.get() != ygw.b) {
                                            throw new jsi("m.noopDelete");
                                        }
                                        this.g.lock();
                                        try {
                                            D(str3, false);
                                            this.g.unlock();
                                        } catch (Throwable th) {
                                            this.g.unlock();
                                            throw th;
                                        }
                                    } catch (jsi e) {
                                        obj = e;
                                    }
                                }
                                Map map2 = this.x;
                                String str4 = jspVar.a;
                                if (map2.containsKey(str4)) {
                                    ((NavigableSet) map2.get(str4)).remove(jspVar);
                                }
                                this.d.getAndAdd(-jspVar.c);
                                r0 = obj;
                                obj = jspVar;
                            } catch (IOException e2) {
                                throw new jsi(e2);
                            }
                        } else {
                            r0 = 0;
                        }
                        this.g.unlock();
                        if (obj != null) {
                            Iterator it = aguu.t(agkeVarN).iterator();
                            while (it.hasNext()) {
                                ((jsj) it.next()).c(jspVar);
                            }
                        }
                        if (r0 != 0) {
                            throw r0;
                        }
                        return;
                    }
                }
                reentrantLock.unlock();
            } catch (Throwable th2) {
                this.g.unlock();
                throw th2;
            }
        }
    }

    @Override // defpackage.jsk
    public final /* synthetic */ boolean n(jsj jsjVar) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    @Override // defpackage.jsk
    public final boolean o(String str, long j, long j2) {
        if (this.f.get() != ygw.b) {
            return false;
        }
        this.g.lock();
        try {
            ?? r3 = ((G(str, j, j2) > j2 ? 1 : (G(str, j, j2) == j2 ? 0 : -1)) ^ (-1)) >>> 31;
            return r3;
        } finally {
            this.g.unlock();
        }
    }

    @Override // defpackage.jsk
    public final /* synthetic */ boolean p(jsj jsjVar) {
        return false;
    }

    @Override // defpackage.ygu
    public final long r() {
        if (this.f.get() != ygw.b) {
            return Long.MAX_VALUE;
        }
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            LinkedHashSet linkedHashSet = this.k;
            if (linkedHashSet.isEmpty()) {
                reentrantLock.unlock();
                return Long.MAX_VALUE;
            }
            ygl yglVar = (ygl) this.l.get((String) Collection.EL.stream(linkedHashSet).findFirst().get());
            long jB = yglVar != null ? yglVar.b() : 0L;
            this.g.unlock();
            return jB;
        } catch (Throwable th) {
            this.g.unlock();
            throw th;
        }
    }

    @Override // defpackage.ygu
    public final FormatInitializationMetadataOuterClass$FormatInitializationMetadata s(String str, FormatIdOuterClass$FormatId formatIdOuterClass$FormatId) {
        if ((this.f.get() == ygw.b || !this.h.dT()) && this.h.dX()) {
            this.g.lock();
            try {
                ygl yglVar = (ygl) this.l.get(str);
                this.g.unlock();
                if (yglVar != null) {
                    ygj ygjVar = (ygj) yglVar.f.get(ygk.a(formatIdOuterClass$FormatId));
                    if (ygjVar != null) {
                        return ygjVar.g;
                    }
                }
            } catch (Throwable th) {
                this.g.unlock();
                throw th;
            }
        }
        return null;
    }

    @Override // defpackage.ygu
    public final ygt t(String str, String str2) {
        ygk ygkVar;
        if (this.f.get() == ygw.b || !this.h.dT()) {
            this.g.lock();
            try {
                ygl yglVar = (ygl) this.l.get(str);
                this.g.unlock();
                if (yglVar != null && (ygkVar = (ygk) yglVar.g.get(str2)) != null) {
                    return new ygt(str, ygkVar);
                }
            } catch (Throwable th) {
                this.g.unlock();
                throw th;
            }
        }
        return null;
    }

    @Override // defpackage.ygu
    public final agke u(String str) {
        if (this.h.dT() && this.f.get() != ygw.b) {
            return agpi.a;
        }
        this.g.lock();
        try {
            ygl yglVar = (ygl) this.l.get(str);
            this.g.unlock();
            return yglVar == null ? agpi.a : (agke) Collection.EL.stream(yglVar.g()).map(new woi(str, 6)).collect(aghu.a);
        } catch (Throwable th) {
            this.g.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x02e0  */
    @Override // defpackage.ygu
    public final List v(String str) {
        long j;
        BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange;
        BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange2;
        int i;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            ArrayList arrayList = new ArrayList();
            ygl yglVar = (ygl) this.l.get(str);
            if (yglVar != null) {
                for (ygk ygkVar : yglVar.g()) {
                    BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange3 = null;
                    for (yez yezVar : yglVar.f(ygkVar)) {
                        aihf aihfVarCreateBuilder = FormatIdOuterClass$FormatId.a.createBuilder();
                        int i2 = ygkVar.a;
                        aihfVarCreateBuilder.copyOnWrite();
                        FormatIdOuterClass$FormatId formatIdOuterClass$FormatId = (FormatIdOuterClass$FormatId) aihfVarCreateBuilder.instance;
                        formatIdOuterClass$FormatId.b |= 1;
                        formatIdOuterClass$FormatId.c = i2;
                        String str2 = ygkVar.b;
                        aihfVarCreateBuilder.copyOnWrite();
                        FormatIdOuterClass$FormatId formatIdOuterClass$FormatId2 = (FormatIdOuterClass$FormatId) aihfVarCreateBuilder.instance;
                        formatIdOuterClass$FormatId2.b |= 4;
                        formatIdOuterClass$FormatId2.e = str2;
                        long j2 = ygkVar.c;
                        aihfVarCreateBuilder.copyOnWrite();
                        FormatIdOuterClass$FormatId formatIdOuterClass$FormatId3 = (FormatIdOuterClass$FormatId) aihfVarCreateBuilder.instance;
                        formatIdOuterClass$FormatId3.b |= 2;
                        formatIdOuterClass$FormatId3.d = j2;
                        FormatIdOuterClass$FormatId formatIdOuterClass$FormatId4 = (FormatIdOuterClass$FormatId) aihfVarCreateBuilder.build();
                        zjr zjrVar = this.h;
                        long j3 = yezVar.h;
                        if (j3 != 0 || ((i = yezVar.i) > 0 && i != 1)) {
                            if (j3 == 0) {
                                j3 = 1;
                            }
                            int i3 = yezVar.i;
                            long j4 = i3 == 0 ? 1L : i3;
                            aihf aihfVarCreateBuilder2 = BufferedRangeOuterClass$BufferedRange.a.createBuilder();
                            aihfVarCreateBuilder2.copyOnWrite();
                            j = 1;
                            BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange4 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder2.instance;
                            formatIdOuterClass$FormatId4.getClass();
                            bufferedRangeOuterClass$BufferedRange4.c = formatIdOuterClass$FormatId4;
                            bufferedRangeOuterClass$BufferedRange4.b |= 1;
                            aihfVarCreateBuilder2.copyOnWrite();
                            BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange5 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder2.instance;
                            bufferedRangeOuterClass$BufferedRange5.b |= 8;
                            bufferedRangeOuterClass$BufferedRange5.d = j3;
                            aihfVarCreateBuilder2.copyOnWrite();
                            BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange6 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder2.instance;
                            bufferedRangeOuterClass$BufferedRange6.b |= 16;
                            bufferedRangeOuterClass$BufferedRange6.e = (j3 + j4) - 1;
                            aihfVarCreateBuilder2.copyOnWrite();
                            BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange7 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder2.instance;
                            bufferedRangeOuterClass$BufferedRange7.g = 1;
                            bufferedRangeOuterClass$BufferedRange7.b |= 64;
                            aihf aihfVarCreateBuilder3 = TimeRangeOuterClass$TimeRange.a.createBuilder();
                            long j5 = yezVar.d;
                            aihfVarCreateBuilder3.copyOnWrite();
                            TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder3.instance;
                            timeRangeOuterClass$TimeRange.b |= 1;
                            timeRangeOuterClass$TimeRange.c = j5;
                            long j6 = yezVar.e;
                            aihfVarCreateBuilder3.copyOnWrite();
                            TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange2 = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder3.instance;
                            timeRangeOuterClass$TimeRange2.b |= 2;
                            timeRangeOuterClass$TimeRange2.d = j6;
                            int i4 = yezVar.c;
                            aihfVarCreateBuilder3.copyOnWrite();
                            TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange3 = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder3.instance;
                            timeRangeOuterClass$TimeRange3.b |= 4;
                            timeRangeOuterClass$TimeRange3.e = i4;
                            aihfVarCreateBuilder2.copyOnWrite();
                            BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange8 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder2.instance;
                            TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange4 = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder3.build();
                            timeRangeOuterClass$TimeRange4.getClass();
                            bufferedRangeOuterClass$BufferedRange8.f = timeRangeOuterClass$TimeRange4;
                            bufferedRangeOuterClass$BufferedRange8.b |= 32;
                            if (zjrVar.ea()) {
                                long j7 = yezVar.g;
                                aihfVarCreateBuilder2.copyOnWrite();
                                BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange9 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder2.instance;
                                bufferedRangeOuterClass$BufferedRange9.b |= SemanticState.Obscured;
                                bufferedRangeOuterClass$BufferedRange9.h = j7;
                            }
                            bufferedRangeOuterClass$BufferedRange = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder2.build();
                        } else {
                            bufferedRangeOuterClass$BufferedRange = null;
                            j = 1;
                        }
                        if (bufferedRangeOuterClass$BufferedRange != null) {
                            if (bufferedRangeOuterClass$BufferedRange3 != null) {
                                FormatIdOuterClass$FormatId defaultInstance = bufferedRangeOuterClass$BufferedRange3.c;
                                if (defaultInstance == null) {
                                    defaultInstance = FormatIdOuterClass$FormatId.getDefaultInstance();
                                }
                                FormatIdOuterClass$FormatId defaultInstance2 = bufferedRangeOuterClass$BufferedRange.c;
                                if (defaultInstance2 == null) {
                                    defaultInstance2 = FormatIdOuterClass$FormatId.getDefaultInstance();
                                }
                                if (defaultInstance.equals(defaultInstance2)) {
                                    int iAV = a.aV(bufferedRangeOuterClass$BufferedRange3.g);
                                    if (iAV == 0) {
                                        iAV = 1;
                                    }
                                    int iAV2 = a.aV(bufferedRangeOuterClass$BufferedRange.g);
                                    if (iAV2 == 0) {
                                        iAV2 = 1;
                                    }
                                    if (iAV != iAV2) {
                                        bufferedRangeOuterClass$BufferedRange2 = null;
                                    } else {
                                        TimeRangeOuterClass$TimeRange defaultInstance3 = bufferedRangeOuterClass$BufferedRange3.f;
                                        if (defaultInstance3 == null) {
                                            defaultInstance3 = TimeRangeOuterClass$TimeRange.getDefaultInstance();
                                        }
                                        int i5 = defaultInstance3.e;
                                        TimeRangeOuterClass$TimeRange defaultInstance4 = bufferedRangeOuterClass$BufferedRange.f;
                                        if (defaultInstance4 == null) {
                                            defaultInstance4 = TimeRangeOuterClass$TimeRange.getDefaultInstance();
                                        }
                                        if (i5 == defaultInstance4.e) {
                                            agpf agpfVarB = agpf.b(Long.valueOf(bufferedRangeOuterClass$BufferedRange3.d), Long.valueOf(bufferedRangeOuterClass$BufferedRange3.e));
                                            agpf agpfVarB2 = agpf.b(Long.valueOf(bufferedRangeOuterClass$BufferedRange.d), Long.valueOf(bufferedRangeOuterClass$BufferedRange.e));
                                            if (agpfVarB.h(agpfVarB2) || ((Long) agpfVarB.f()).longValue() + j == ((Long) agpfVarB2.e()).longValue() || ((Long) agpfVarB2.f()).longValue() + j == ((Long) agpfVarB.e()).longValue()) {
                                                agpf agpfVarD = agpf.b(Long.valueOf(bufferedRangeOuterClass$BufferedRange3.d), Long.valueOf(bufferedRangeOuterClass$BufferedRange3.e)).d(agpf.b(Long.valueOf(bufferedRangeOuterClass$BufferedRange.d), Long.valueOf(bufferedRangeOuterClass$BufferedRange.e)));
                                                aihf aihfVarCreateBuilder4 = BufferedRangeOuterClass$BufferedRange.a.createBuilder();
                                                FormatIdOuterClass$FormatId defaultInstance5 = bufferedRangeOuterClass$BufferedRange3.c;
                                                if (defaultInstance5 == null) {
                                                    defaultInstance5 = FormatIdOuterClass$FormatId.getDefaultInstance();
                                                }
                                                aihfVarCreateBuilder4.copyOnWrite();
                                                BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange10 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder4.instance;
                                                defaultInstance5.getClass();
                                                bufferedRangeOuterClass$BufferedRange10.c = defaultInstance5;
                                                bufferedRangeOuterClass$BufferedRange10.b |= 1;
                                                long jLongValue = ((Long) agpfVarD.e()).longValue();
                                                aihfVarCreateBuilder4.copyOnWrite();
                                                BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange11 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder4.instance;
                                                bufferedRangeOuterClass$BufferedRange11.b |= 8;
                                                bufferedRangeOuterClass$BufferedRange11.d = jLongValue;
                                                long jLongValue2 = ((Long) agpfVarD.f()).longValue();
                                                aihfVarCreateBuilder4.copyOnWrite();
                                                BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange12 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder4.instance;
                                                bufferedRangeOuterClass$BufferedRange12.b |= 16;
                                                bufferedRangeOuterClass$BufferedRange12.e = jLongValue2;
                                                int iAV3 = a.aV(bufferedRangeOuterClass$BufferedRange3.g);
                                                int i6 = iAV3 == 0 ? 1 : iAV3;
                                                aihfVarCreateBuilder4.copyOnWrite();
                                                BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange13 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder4.instance;
                                                bufferedRangeOuterClass$BufferedRange13.g = i6 - 1;
                                                bufferedRangeOuterClass$BufferedRange13.b |= 64;
                                                TimeRangeOuterClass$TimeRange defaultInstance6 = bufferedRangeOuterClass$BufferedRange3.f;
                                                if (defaultInstance6 == null) {
                                                    defaultInstance6 = TimeRangeOuterClass$TimeRange.getDefaultInstance();
                                                }
                                                TimeRangeOuterClass$TimeRange defaultInstance7 = bufferedRangeOuterClass$BufferedRange.f;
                                                if (defaultInstance7 == null) {
                                                    defaultInstance7 = TimeRangeOuterClass$TimeRange.getDefaultInstance();
                                                }
                                                TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRangeBs = zik.bs(defaultInstance6, defaultInstance7);
                                                aihfVarCreateBuilder4.copyOnWrite();
                                                BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange14 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder4.instance;
                                                timeRangeOuterClass$TimeRangeBs.getClass();
                                                bufferedRangeOuterClass$BufferedRange14.f = timeRangeOuterClass$TimeRangeBs;
                                                bufferedRangeOuterClass$BufferedRange14.b |= 32;
                                                if ((bufferedRangeOuterClass$BufferedRange3.b & SemanticState.Obscured) != 0 && (bufferedRangeOuterClass$BufferedRange.b & SemanticState.Obscured) != 0) {
                                                    long j8 = bufferedRangeOuterClass$BufferedRange3.h + bufferedRangeOuterClass$BufferedRange.h;
                                                    aihfVarCreateBuilder4.copyOnWrite();
                                                    BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange15 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder4.instance;
                                                    bufferedRangeOuterClass$BufferedRange15.b |= SemanticState.Obscured;
                                                    bufferedRangeOuterClass$BufferedRange15.h = j8;
                                                }
                                                bufferedRangeOuterClass$BufferedRange2 = (BufferedRangeOuterClass$BufferedRange) aihfVarCreateBuilder4.build();
                                            } else {
                                                bufferedRangeOuterClass$BufferedRange2 = null;
                                            }
                                        } else {
                                            bufferedRangeOuterClass$BufferedRange2 = null;
                                        }
                                    }
                                } else {
                                    bufferedRangeOuterClass$BufferedRange2 = null;
                                }
                                if (bufferedRangeOuterClass$BufferedRange2 != null) {
                                    bufferedRangeOuterClass$BufferedRange3 = bufferedRangeOuterClass$BufferedRange2;
                                } else {
                                    arrayList.add(bufferedRangeOuterClass$BufferedRange3);
                                }
                            }
                            bufferedRangeOuterClass$BufferedRange3 = bufferedRangeOuterClass$BufferedRange;
                        }
                    }
                    if (bufferedRangeOuterClass$BufferedRange3 != null) {
                        arrayList.add(bufferedRangeOuterClass$BufferedRange3);
                    }
                }
                reentrantLock = this.g;
            }
            reentrantLock.unlock();
            return arrayList;
        } catch (Throwable th) {
            this.g.unlock();
            throw th;
        }
    }

    @Override // defpackage.ygu
    public final NavigableSet w(ygt ygtVar) {
        if (this.f.get() != ygw.b && this.h.dT()) {
            return new TreeSet();
        }
        String str = ygtVar.a;
        this.g.lock();
        try {
            ygl yglVar = (ygl) this.l.get(str);
            this.g.unlock();
            if (yglVar == null) {
                return new TreeSet();
            }
            ygj ygjVar = (ygj) yglVar.f.get(ygtVar.b);
            return ygjVar == null ? new TreeSet() : new TreeSet((SortedSet) ygjVar.d);
        } catch (Throwable th) {
            this.g.unlock();
            throw th;
        }
    }

    @Override // defpackage.ygu
    public final void x() throws jsi {
        if (this.f.get() != ygw.b) {
            throw new jsi("m.noopEvict");
        }
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            LinkedHashSet linkedHashSet = this.k;
            if (!linkedHashSet.isEmpty()) {
                D((String) Collection.EL.stream(linkedHashSet).findFirst().get(), true);
                reentrantLock.unlock();
                return;
            }
            throw new jsi("m.lruEmpty;s." + this.d.get() + ";vs." + this.l.size());
        } catch (Throwable th) {
            this.g.unlock();
            throw th;
        }
    }

    @Override // defpackage.ygu
    public final void y(FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata, ywn ywnVar) {
        if (this.f.get() == ygw.b || !this.h.dT()) {
            this.g.lock();
            try {
                ygl yglVarI = I(formatInitializationMetadataOuterClass$FormatInitializationMetadata.c);
                this.g.unlock();
                yglVarI.l(formatInitializationMetadataOuterClass$FormatInitializationMetadata);
                O(formatInitializationMetadataOuterClass$FormatInitializationMetadata.c, yglVarI, ywnVar);
            } catch (Throwable th) {
                this.g.unlock();
                throw th;
            }
        }
    }

    @Override // defpackage.ygu
    public final boolean z() {
        return this.f.get() == ygw.b;
    }

    @Override // defpackage.jsk
    public final void q(String str, kyr kyrVar) {
    }
}

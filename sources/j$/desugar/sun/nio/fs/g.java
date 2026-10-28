package j$.desugar.sun.nio.fs;

import j$.nio.file.LinkOption;
import j$.nio.file.StandardCopyOption;
import j$.nio.file.attribute.FileAttribute;
import j$.nio.file.attribute.i0;
import j$.nio.file.attribute.t;
import j$.nio.file.attribute.u;
import j$.nio.file.attribute.v0;
import j$.time.ZoneOffset;
import j$.time.chrono.s;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.a1;
import j$.util.c0;
import j$.util.w;
import j$.util.x;
import j$.util.y;
import java.nio.file.CopyOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class g {
    public static /* synthetic */ long A(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) == 0 || (((j ^ j2) >> 63) | 1) >= 0) ? j3 : j3 - 1;
    }

    public static /* synthetic */ String B(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "/");
            }
        }
        return sb.toString();
    }

    public static List C(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            arrayList.add(obj);
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static Set D(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException("duplicate element: " + obj);
            }
        }
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    public static /* synthetic */ boolean E(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ FileAttribute[] F(java.nio.file.attribute.FileAttribute[] fileAttributeArr) {
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        FileAttribute[] fileAttributeArr2 = new FileAttribute[length];
        for (int i = 0; i < length; i++) {
            fileAttributeArr2[i] = u.a(fileAttributeArr[i]);
        }
        return fileAttributeArr2;
    }

    public static /* synthetic */ CopyOption[] G(j$.nio.file.CopyOption[] copyOptionArr) {
        CopyOption copyOptionD;
        if (copyOptionArr == null) {
            return null;
        }
        int length = copyOptionArr.length;
        CopyOption[] copyOptionArr2 = new CopyOption[length];
        for (int i = 0; i < length; i++) {
            j$.nio.file.CopyOption copyOption = copyOptionArr[i];
            if (copyOption == null) {
                copyOptionD = null;
            } else if (copyOption instanceof j$.nio.file.c) {
                copyOptionD = ((j$.nio.file.c) copyOption).a;
            } else if (copyOption instanceof LinkOption) {
                copyOptionD = j$.nio.file.a.c((LinkOption) copyOption);
            } else {
                copyOptionD = copyOption instanceof StandardCopyOption ? j$.nio.file.a.d((StandardCopyOption) copyOption) : new j$.nio.file.d(copyOption);
            }
            copyOptionArr2[i] = copyOptionD;
        }
        return copyOptionArr2;
    }

    public static java.nio.file.attribute.FileAttribute[] H(FileAttribute[] fileAttributeArr) {
        java.nio.file.attribute.FileAttribute rVar;
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        java.nio.file.attribute.FileAttribute[] fileAttributeArr2 = new java.nio.file.attribute.FileAttribute[length];
        for (int i = 0; i < length; i++) {
            FileAttribute fileAttribute = fileAttributeArr[i];
            if (fileAttribute == null) {
                rVar = null;
            } else if (u.d(fileAttribute.value())) {
                rVar = new t(fileAttribute);
            } else {
                rVar = fileAttribute instanceof j$.nio.file.attribute.q ? ((j$.nio.file.attribute.q) fileAttribute).a : new j$.nio.file.attribute.r(fileAttribute);
            }
            fileAttributeArr2[i] = rVar;
        }
        return fileAttributeArr2;
    }

    public static /* synthetic */ long I(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) <= 0 ? j3 + j2 : j3;
    }

    public static /* synthetic */ long J(long j, long j2) {
        long j3 = j + j2;
        if ((((j2 ^ j) > 0L ? 1 : ((j2 ^ j) == 0L ? 0 : -1)) | (((j ^ j3) > 0L ? 1 : ((j ^ j3) == 0L ? 0 : -1)) ^ (-1))) < 0) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long K(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (iNumberOfLeadingZeros >= 64) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if ((((i ^ (-1)) >>> 31) | (j2 != Long.MIN_VALUE ? 1 : 0)) != 0) {
                long j3 = j * j2;
                if (i == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long L(long j, long j2) {
        long j3 = j - j2;
        if (((((j2 ^ j) > 0L ? 1 : ((j2 ^ j) == 0L ? 0 : -1)) ^ (-1)) | (((j ^ j3) > 0L ? 1 : ((j ^ j3) == 0L ? 0 : -1)) ^ (-1))) < 0) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static String M(Object obj, Object obj2) {
        String string;
        String string2;
        String str = "null";
        if (obj == null || (string = obj.toString()) == null) {
            string = "null";
        }
        int length = string.length();
        if (obj2 != null && (string2 = obj2.toString()) != null) {
            str = string2;
        }
        int length2 = str.length();
        char[] cArr = new char[length + length2 + 1];
        string.getChars(0, length, cArr, 0);
        cArr[length] = '=';
        str.getChars(0, length2, cArr, length + 1);
        return new String(cArr);
    }

    public static char N(String str, int i) {
        if (i < str.length()) {
            return str.charAt(i);
        }
        return (char) 0;
    }

    public static Temporal a(j$.time.chrono.b bVar, Temporal temporal) {
        return temporal.a(bVar.toEpochDay(), j$.time.temporal.a.EPOCH_DAY);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.b] */
    public static j$.util.function.b b(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        doubleConsumer2.getClass();
        return new DoubleConsumer() { // from class: j$.util.function.b
            @Override // java.util.function.DoubleConsumer
            public final void accept(double d) {
                doubleConsumer.accept(d);
                doubleConsumer2.accept(d);
            }

            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return j$.desugar.sun.nio.fs.g.b(this, doubleConsumer3);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.g] */
    public static j$.util.function.g c(final LongConsumer longConsumer, final LongConsumer longConsumer2) {
        longConsumer2.getClass();
        return new LongConsumer() { // from class: j$.util.function.g
            @Override // java.util.function.LongConsumer
            public final void accept(long j) {
                longConsumer.accept(j);
                longConsumer2.accept(j);
            }

            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer3) {
                return j$.desugar.sun.nio.fs.g.c(this, longConsumer3);
            }
        };
    }

    public static int d(j$.time.chrono.b bVar, j$.time.chrono.b bVar2) {
        int iCompare = Long.compare(bVar.toEpochDay(), bVar2.toEpochDay());
        if (iCompare != 0) {
            return iCompare;
        }
        return bVar.getChronology().getId().compareTo(bVar2.getChronology().getId());
    }

    public static int e(j$.time.chrono.e eVar, j$.time.chrono.e eVar2) {
        int iG = eVar.toLocalDate().G(eVar2.toLocalDate());
        if (iG != 0) {
            return iG;
        }
        int iR = eVar.toLocalTime().compareTo(eVar2.toLocalTime());
        if (iR != 0) {
            return iR;
        }
        return eVar.getChronology().getId().compareTo(eVar2.getChronology().getId());
    }

    public static int f(j$.time.chrono.j jVar, j$.time.chrono.j jVar2) {
        int iCompare = Long.compare(jVar.toEpochSecond(), jVar2.toEpochSecond());
        if (iCompare != 0) {
            return iCompare;
        }
        int i = jVar.toLocalTime().d - jVar2.toLocalTime().d;
        if (i != 0) {
            return i;
        }
        int iE = jVar.toLocalDateTime().E(jVar2.toLocalDateTime());
        if (iE != 0) {
            return iE;
        }
        int iCompareTo = jVar.getZone().getId().compareTo(jVar2.getZone().getId());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        return jVar.getChronology().getId().compareTo(jVar2.getChronology().getId());
    }

    public static void g(c0 c0Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            c0Var.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (a1.a) {
                a1.a(c0Var.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
            c0Var.forEachRemaining((DoubleConsumer) new w(consumer));
        }
    }

    public static void h(Spliterator.OfInt ofInt, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            ofInt.forEachRemaining((IntConsumer) consumer);
        } else {
            if (a1.a) {
                a1.a(ofInt.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
            ofInt.forEachRemaining((IntConsumer) new x(consumer, (byte) 0));
        }
    }

    public static void i(Spliterator.OfLong ofLong, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            ofLong.forEachRemaining((LongConsumer) consumer);
        } else {
            if (a1.a) {
                a1.a(ofLong.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
            ofLong.forEachRemaining((LongConsumer) new y(consumer, (byte) 0));
        }
    }

    public static int j(j$.time.chrono.j jVar, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.o.a(jVar, nVar);
        }
        int i = j$.time.chrono.i.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i != 1) {
            return i != 2 ? jVar.toLocalDateTime().h(nVar) : jVar.getOffset().getTotalSeconds();
        }
        j$.time.g.e("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        return 0;
    }

    public static int k(j$.time.chrono.m mVar, j$.time.temporal.a aVar) {
        return aVar == j$.time.temporal.a.ERA ? mVar.getValue() : j$.time.temporal.o.a(mVar, aVar);
    }

    public static long l(j$.time.chrono.m mVar, j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.ERA) {
            return mVar.getValue();
        }
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(mVar);
        }
        j$.time.g.e("Unsupported field: ".concat(String.valueOf(nVar)));
        return 0L;
    }

    public static boolean m(j$.time.chrono.b bVar, j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) nVar).isDateBased();
        }
        return nVar != null && nVar.h(bVar);
    }

    public static boolean n(j$.time.chrono.m mVar, j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            if (nVar != j$.time.temporal.a.ERA) {
                return false;
            }
        } else if (nVar == null || !nVar.h(mVar)) {
            return false;
        }
        return true;
    }

    public static Object o(j$.time.chrono.b bVar, o oVar) {
        if (oVar == j$.time.temporal.o.a || oVar == j$.time.temporal.o.e || oVar == j$.time.temporal.o.d || oVar == j$.time.temporal.o.g) {
            return null;
        }
        if (oVar == j$.time.temporal.o.b) {
            return bVar.getChronology();
        }
        return oVar == j$.time.temporal.o.c ? ChronoUnit.DAYS : oVar.c(bVar);
    }

    public static Object p(j$.time.chrono.e eVar, o oVar) {
        if (oVar == j$.time.temporal.o.a || oVar == j$.time.temporal.o.e || oVar == j$.time.temporal.o.d) {
            return null;
        }
        if (oVar == j$.time.temporal.o.g) {
            return eVar.toLocalTime();
        }
        if (oVar == j$.time.temporal.o.b) {
            return eVar.getChronology();
        }
        return oVar == j$.time.temporal.o.c ? ChronoUnit.NANOS : oVar.c(eVar);
    }

    public static Object q(j$.time.chrono.j jVar, o oVar) {
        if (oVar == j$.time.temporal.o.e || oVar == j$.time.temporal.o.a) {
            return jVar.getZone();
        }
        if (oVar == j$.time.temporal.o.d) {
            return jVar.getOffset();
        }
        if (oVar == j$.time.temporal.o.g) {
            return jVar.toLocalTime();
        }
        if (oVar == j$.time.temporal.o.b) {
            return jVar.getChronology();
        }
        return oVar == j$.time.temporal.o.c ? ChronoUnit.NANOS : oVar.c(jVar);
    }

    public static Object r(j$.time.chrono.m mVar, o oVar) {
        return oVar == j$.time.temporal.o.c ? ChronoUnit.ERAS : j$.time.temporal.o.c(mVar, oVar);
    }

    public static long s(j$.time.chrono.e eVar, ZoneOffset zoneOffset) {
        Objects.a(zoneOffset, "offset");
        return ((eVar.toLocalDate().toEpochDay() * 86400) + ((long) eVar.toLocalTime().toSecondOfDay())) - ((long) zoneOffset.getTotalSeconds());
    }

    public static long t(j$.time.chrono.j jVar) {
        return ((jVar.toLocalDate().toEpochDay() * 86400) + ((long) jVar.toLocalTime().toSecondOfDay())) - ((long) jVar.getOffset().getTotalSeconds());
    }

    public static boolean u(c0 c0Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return c0Var.tryAdvance((DoubleConsumer) consumer);
        }
        if (a1.a) {
            a1.a(c0Var.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return c0Var.tryAdvance((DoubleConsumer) new w(consumer));
    }

    public static boolean v(Spliterator.OfInt ofInt, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return ofInt.tryAdvance((IntConsumer) consumer);
        }
        if (a1.a) {
            a1.a(ofInt.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return ofInt.tryAdvance((IntConsumer) new x(consumer, (byte) 0));
    }

    public static boolean w(Spliterator.OfLong ofLong, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return ofLong.tryAdvance((LongConsumer) consumer);
        }
        if (a1.a) {
            a1.a(ofLong.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return ofLong.tryAdvance((LongConsumer) new y(consumer, (byte) 0));
    }

    public static j$.time.chrono.a x(j$.time.temporal.k kVar) {
        Objects.a(kVar, "temporal");
        return (j$.time.chrono.a) Objects.requireNonNullElse((j$.time.chrono.a) kVar.w(j$.time.temporal.o.b), s.c);
    }

    public final int characteristics() {
        return 16448;
    }

    public final long estimateSize() {
        return 0L;
    }

    public final void forEachRemaining(Object obj) {
        obj.getClass();
    }

    public final boolean tryAdvance(Object obj) {
        obj.getClass();
        return false;
    }

    public final Spliterator trySplit() {
        return null;
    }

    public abstract i0 y(String str);

    public abstract v0 z(String str);
}

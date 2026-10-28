package j$.time.zone;

import j$.desugar.sun.nio.fs.g;
import j$.desugar.sun.nio.fs.i;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneOffset;
import j$.time.chrono.s;
import j$.time.j;
import j$.time.temporal.m;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class ZoneRules implements Serializable {
    public static final long[] i = new long[0];
    public static final d[] j = new d[0];
    public static final LocalDateTime[] k = new LocalDateTime[0];
    public static final b[] l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;
    public final long[] a;
    public final ZoneOffset[] b;
    public final long[] c;
    public final LocalDateTime[] d;
    public final ZoneOffset[] e;
    public final d[] f;
    public final TimeZone g;
    public final transient ConcurrentHashMap h = new ConcurrentHashMap();

    public ZoneRules(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, d[] dVarArr) {
        this.a = jArr;
        this.b = zoneOffsetArr;
        this.c = jArr2;
        this.e = zoneOffsetArr2;
        this.f = dVarArr;
        if (jArr2.length == 0) {
            this.d = k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                ZoneOffset zoneOffset = zoneOffsetArr2[i2];
                int i3 = i2 + 1;
                ZoneOffset zoneOffset2 = zoneOffsetArr2[i3];
                LocalDateTime localDateTimeH = LocalDateTime.H(jArr2[i2], 0, zoneOffset);
                if (zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds()) {
                    arrayList.add(localDateTimeH);
                    arrayList.add(localDateTimeH.J(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()));
                } else {
                    arrayList.add(localDateTimeH.J(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()));
                    arrayList.add(localDateTimeH);
                }
                i2 = i3;
            }
            this.d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.g = null;
    }

    public static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTime2 = bVar.b;
        LocalDateTime localDateTime3 = bVar.b;
        ZoneOffset zoneOffset = bVar.d;
        ZoneOffset zoneOffset2 = bVar.c;
        if (zoneOffset.getTotalSeconds() > zoneOffset2.getTotalSeconds()) {
            if (!localDateTime.A(localDateTime2)) {
                if (localDateTime.A(localDateTime3.J(zoneOffset.getTotalSeconds() - zoneOffset2.getTotalSeconds()))) {
                    return bVar;
                }
                return zoneOffset;
            }
            return zoneOffset2;
        }
        if (localDateTime.A(localDateTime2)) {
            if (!localDateTime.A(localDateTime3.J(zoneOffset.getTotalSeconds() - zoneOffset2.getTotalSeconds()))) {
                return bVar;
            }
            return zoneOffset2;
        }
        return zoneOffset;
    }

    public static int c(long j2, ZoneOffset zoneOffset) {
        return LocalDate.ofEpochDay(g.A(j2 + ((long) zoneOffset.getTotalSeconds()), 86400L)).a;
    }

    public static ZoneOffset h(int i2) {
        return ZoneOffset.L(i2 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b[] b(int i2) {
        byte b;
        LocalDate localDateS;
        d dVar;
        long j2;
        Integer numValueOf = Integer.valueOf(i2);
        ConcurrentHashMap concurrentHashMap = this.h;
        b[] bVarArr = (b[]) concurrentHashMap.get(numValueOf);
        if (bVarArr != null) {
            return bVarArr;
        }
        int i3 = 2100;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            b[] bVarArr2 = l;
            if (i2 < 1800) {
                return bVarArr2;
            }
            LocalDateTime localDateTime = LocalDateTime.c;
            LocalDate localDateOf = LocalDate.of(i2 - 1, 12, 31);
            j$.time.temporal.a.HOUR_OF_DAY.s(0L);
            long epochSecond = new LocalDateTime(localDateOf, LocalTime.h[0]).toEpochSecond(this.b[0]);
            int offset = timeZone.getOffset(epochSecond * 1000);
            long j3 = 31968000 + epochSecond;
            while (epochSecond < j3) {
                long j4 = epochSecond + 7776000;
                if (offset != timeZone.getOffset(j4 * 1000)) {
                    while (j4 - epochSecond > 1) {
                        long jA = g.A(j4 + epochSecond, 2L);
                        timeZone = timeZone;
                        if (timeZone.getOffset(jA * 1000) == offset) {
                            epochSecond = jA;
                        } else {
                            j4 = jA;
                        }
                    }
                    if (timeZone.getOffset(epochSecond * 1000) == offset) {
                        epochSecond = j4;
                    }
                    ZoneOffset zoneOffsetH = h(offset);
                    int offset2 = timeZone.getOffset(epochSecond * 1000);
                    ZoneOffset zoneOffsetH2 = h(offset2);
                    if (c(epochSecond, zoneOffsetH2) == i2) {
                        b[] bVarArr3 = (b[]) Arrays.copyOf(bVarArr2, bVarArr2.length + 1);
                        bVarArr3[bVarArr3.length - 1] = new b(epochSecond, zoneOffsetH, zoneOffsetH2);
                        offset = offset2;
                        bVarArr2 = bVarArr3;
                    } else {
                        offset = offset2;
                    }
                } else {
                    epochSecond = j4;
                }
            }
            if (1916 <= i2 && i2 < 2100) {
                concurrentHashMap.putIfAbsent(numValueOf, bVarArr2);
            }
            return bVarArr2;
        }
        byte b2 = 1;
        long j5 = 1;
        d[] dVarArr = this.f;
        b[] bVarArr4 = new b[dVarArr.length];
        int i4 = 0;
        while (i4 < dVarArr.length) {
            d dVar2 = dVarArr[i4];
            ZoneOffset zoneOffset = dVar2.h;
            j$.time.c cVar = dVar2.c;
            byte b3 = dVar2.b;
            j jVar = dVar2.a;
            if (b3 < 0) {
                b = b2;
                long j6 = i2;
                s.c.getClass();
                int iS = jVar.s(s.isLeapYear(j6)) + b + b3;
                LocalDate localDate = LocalDate.d;
                j$.time.temporal.a.YEAR.s(j6);
                j$.time.temporal.a.DAY_OF_MONTH.s(iS);
                localDateS = LocalDate.s(i2, jVar.getValue(), iS);
                if (cVar != null) {
                    localDateS = localDateS.k(new m(cVar.getValue(), b));
                }
                dVar = dVar2;
            } else {
                b = b2;
                LocalDate localDate2 = LocalDate.d;
                j$.time.temporal.a.YEAR.s(i2);
                j$.time.temporal.a.DAY_OF_MONTH.s(b3);
                localDateS = LocalDate.s(i2, jVar.getValue(), b3);
                if (cVar != null) {
                    localDateS = localDateS.k(new m(cVar.getValue(), (byte) 0));
                }
                dVar = dVar2;
            }
            if (dVar.e) {
                j2 = j5;
                localDateS = localDateS.P(j2);
            } else {
                j2 = j5;
            }
            LocalDateTime localDateTimeB = LocalDateTime.B(localDateS, dVar.d);
            c cVar2 = dVar.f;
            ZoneOffset zoneOffset2 = dVar.g;
            int iOrdinal = cVar2.ordinal();
            if (iOrdinal == 0) {
                localDateTimeB = localDateTimeB.J(zoneOffset.getTotalSeconds() - ZoneOffset.UTC.getTotalSeconds());
            } else if (iOrdinal == 2) {
                localDateTimeB = localDateTimeB.J(zoneOffset.getTotalSeconds() - zoneOffset2.getTotalSeconds());
            }
            bVarArr4[i4] = new b(localDateTimeB, zoneOffset, dVar.i);
            i4++;
            j5 = j2;
            bVarArr4 = bVarArr4;
            b2 = b;
            i3 = 2100;
        }
        b[] bVarArr5 = bVarArr4;
        if (i2 < i3) {
            concurrentHashMap.putIfAbsent(numValueOf, bVarArr5);
        }
        return bVarArr5;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    public final Object d(LocalDateTime localDateTime) {
        boolean z;
        Object objA;
        Object obj = null;
        ZoneOffset[] zoneOffsetArr = this.b;
        int i2 = 0;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            b[] bVarArrB = b(localDateTime.a.a);
            if (bVarArrB.length == 0) {
                return h(timeZone.getOffset(localDateTime.toEpochSecond(zoneOffsetArr[0]) * 1000));
            }
            int length = bVarArrB.length;
            while (i2 < length) {
                b bVar = bVarArrB[i2];
                objA = a(localDateTime, bVar);
                if ((objA instanceof b) || objA.equals(bVar.c)) {
                    return objA;
                }
                i2++;
                obj = objA;
            }
            return obj;
        }
        if (this.c.length == 0) {
            return zoneOffsetArr[0];
        }
        int length2 = this.f.length;
        LocalDateTime[] localDateTimeArr = this.d;
        if (length2 > 0) {
            LocalDateTime localDateTime2 = localDateTimeArr[localDateTimeArr.length - 1];
            if (localDateTime2 == null) {
                long epochDay = localDateTime.a.toEpochDay();
                long epochDay2 = localDateTime2.a.toEpochDay();
                if (epochDay > epochDay2 || (epochDay == epochDay2 && localDateTime.b.O() > localDateTime2.b.O())) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (localDateTime.r(localDateTime2) > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                b[] bVarArrB2 = b(localDateTime.a.a);
                int length3 = bVarArrB2.length;
                while (i2 < length3) {
                    b bVar2 = bVarArrB2[i2];
                    objA = a(localDateTime, bVar2);
                    if ((objA instanceof b) || objA.equals(bVar2.c)) {
                        return objA;
                    }
                    i2++;
                    obj = objA;
                }
                return obj;
            }
        }
        int iBinarySearch = Arrays.binarySearch(localDateTimeArr, localDateTime);
        ZoneOffset[] zoneOffsetArr2 = this.e;
        if (iBinarySearch == -1) {
            return zoneOffsetArr2[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else if (iBinarySearch < localDateTimeArr.length - 1) {
            int i3 = iBinarySearch + 1;
            if (localDateTimeArr[iBinarySearch].equals(localDateTimeArr[i3])) {
                iBinarySearch = i3;
            }
        }
        if ((iBinarySearch & 1) != 0) {
            return zoneOffsetArr2[(iBinarySearch / 2) + 1];
        }
        LocalDateTime localDateTime3 = localDateTimeArr[iBinarySearch];
        LocalDateTime localDateTime4 = localDateTimeArr[iBinarySearch + 1];
        int i4 = iBinarySearch / 2;
        ZoneOffset zoneOffset = zoneOffsetArr2[i4];
        ZoneOffset zoneOffset2 = zoneOffsetArr2[i4 + 1];
        return zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds() ? new b(localDateTime3, zoneOffset, zoneOffset2) : new b(localDateTime4, zoneOffset, zoneOffset2);
    }

    public final b e(LocalDateTime localDateTime) {
        Object objD = d(localDateTime);
        if (objD instanceof b) {
            return (b) objD;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneRules) {
            ZoneRules zoneRules = (ZoneRules) obj;
            if (Objects.equals(this.g, zoneRules.g) && Arrays.equals(this.a, zoneRules.a) && Arrays.equals(this.b, zoneRules.b) && Arrays.equals(this.c, zoneRules.c) && Arrays.equals(this.e, zoneRules.e) && Arrays.equals(this.f, zoneRules.f)) {
                return true;
            }
        }
        return false;
    }

    public final List f(LocalDateTime localDateTime) {
        Object objD = d(localDateTime);
        if (!(objD instanceof b)) {
            return Collections.singletonList((ZoneOffset) objD);
        }
        b bVar = (b) objD;
        ZoneOffset zoneOffset = bVar.c;
        ZoneOffset zoneOffset2 = bVar.d;
        return zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds() ? Collections.EMPTY_LIST : g.C(new Object[]{zoneOffset, zoneOffset2});
    }

    public final boolean g(Instant instant) {
        ZoneOffset zoneOffsetH;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            zoneOffsetH = h(timeZone.getRawOffset());
        } else {
            int length = this.c.length;
            ZoneOffset[] zoneOffsetArr = this.b;
            if (length == 0) {
                zoneOffsetH = zoneOffsetArr[0];
            } else {
                int iBinarySearch = Arrays.binarySearch(this.a, instant.getEpochSecond());
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 2;
                }
                zoneOffsetH = zoneOffsetArr[iBinarySearch + 1];
            }
        }
        return !zoneOffsetH.equals(getOffset(instant));
    }

    public ZoneOffset getOffset(Instant instant) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return h(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.c;
        if (jArr.length == 0) {
            return this.b[0];
        }
        long epochSecond = instant.getEpochSecond();
        int length = this.f.length;
        ZoneOffset[] zoneOffsetArr = this.e;
        if (length <= 0 || epochSecond <= jArr[jArr.length - 1]) {
            int iBinarySearch = Arrays.binarySearch(jArr, epochSecond);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            return zoneOffsetArr[iBinarySearch + 1];
        }
        b[] bVarArrB = b(c(epochSecond, zoneOffsetArr[zoneOffsetArr.length - 1]));
        b bVar = null;
        for (int i2 = 0; i2 < bVarArrB.length; i2++) {
            bVar = bVarArrB[i2];
            if (epochSecond < bVar.a) {
                return bVar.c;
            }
        }
        return bVar.d;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.g) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.f);
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return i.a("ZoneRules[timeZone=", timeZone.getID(), "]");
        }
        ZoneOffset[] zoneOffsetArr = this.b;
        return i.a("ZoneRules[currentStandardOffset=", String.valueOf(zoneOffsetArr[zoneOffsetArr.length - 1]), "]");
    }

    public ZoneOffset getOffset(LocalDateTime localDateTime) {
        Object objD = d(localDateTime);
        if (objD instanceof b) {
            return ((b) objD).c;
        }
        return (ZoneOffset) objD;
    }

    public ZoneRules(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = null;
    }

    public ZoneRules(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {h(timeZone.getRawOffset())};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = timeZone;
    }
}

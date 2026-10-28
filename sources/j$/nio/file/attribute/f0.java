package j$.nio.file.attribute;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneOffset;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class f0 implements Comparable {
    public final long a;
    public Instant b = null;
    public String c;

    public f0(long j) {
        this.a = j;
    }

    public static void h(StringBuilder sb, int i, int i2) {
        while (i > 0) {
            sb.append((char) ((i2 / i) + 48));
            i2 %= i;
            i /= 10;
        }
    }

    public static long l(long j, long j2, long j3) {
        if (j > j3) {
            return Long.MAX_VALUE;
        }
        if (j < (-j3)) {
            return Long.MIN_VALUE;
        }
        return j * j2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f0) && compareTo((f0) obj) == 0;
    }

    public final int hashCode() {
        return r().hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final int compareTo(f0 f0Var) {
        long j = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (timeUnit != null) {
            f0Var.getClass();
            return Long.compare(j, f0Var.a);
        }
        long epochSecond = r().getEpochSecond();
        int iCompare = Long.compare(epochSecond, f0Var.r().getEpochSecond());
        if (iCompare != 0 || (iCompare = Long.compare(r().getNano(), f0Var.r().getNano())) != 0) {
            return iCompare;
        }
        if (epochSecond != 31556889864403199L && epochSecond != -31557014167219200L) {
            return 0;
        }
        long epochSecond2 = timeUnit != null ? j / 86400000 : r().getEpochSecond() / 86400;
        long epochSecond3 = timeUnit != null ? f0Var.a / 86400000 : f0Var.r().getEpochSecond() / 86400;
        return epochSecond2 == epochSecond3 ? Long.compare(p(epochSecond2), f0Var.p(epochSecond3)) : Long.compare(epochSecond2, epochSecond3);
    }

    public final long p(long j) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        if (timeUnit2 != null) {
            return timeUnit2.toNanos(this.a - timeUnit2.convert(j, timeUnit));
        }
        return TimeUnit.SECONDS.toNanos(r().getEpochSecond() - timeUnit.toSeconds(j));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x007d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0082  */
    /* JADX WARN: Code duplicated, block: B:20:0x008b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0090  */
    public final Instant r() {
        long jA;
        Instant instant = this.b;
        if (instant != null) {
            return instant;
        }
        int i = e0.a[TimeUnit.MILLISECONDS.ordinal()];
        long jL = this.a;
        int I = 0;
        switch (i) {
            case 1:
                jL = l(this.a, 86400L, 106751991167300L);
                if (jL <= -31557014167219200L) {
                    Instant instant2 = Instant.MIN;
                    this.b = instant2;
                    return instant2;
                }
                if (jL >= 31556889864403199L) {
                    Instant instant3 = Instant.MAX;
                    this.b = instant3;
                    return instant3;
                }
                Instant instantOfEpochSecond = Instant.ofEpochSecond(jL, I);
                this.b = instantOfEpochSecond;
                return instantOfEpochSecond;
            case 2:
                jL = l(this.a, 3600L, 2562047788015215L);
                if (jL <= -31557014167219200L) {
                    Instant instant4 = Instant.MIN;
                    this.b = instant4;
                    return instant4;
                }
                if (jL >= 31556889864403199L) {
                    Instant instant5 = Instant.MAX;
                    this.b = instant5;
                    return instant5;
                }
                Instant instantOfEpochSecond2 = Instant.ofEpochSecond(jL, I);
                this.b = instantOfEpochSecond2;
                return instantOfEpochSecond2;
            case 3:
                jL = l(this.a, 60L, 153722867280912930L);
                if (jL <= -31557014167219200L) {
                    Instant instant6 = Instant.MIN;
                    this.b = instant6;
                    return instant6;
                }
                if (jL >= 31556889864403199L) {
                    Instant instant7 = Instant.MAX;
                    this.b = instant7;
                    return instant7;
                }
                Instant instantOfEpochSecond3 = Instant.ofEpochSecond(jL, I);
                this.b = instantOfEpochSecond3;
                return instantOfEpochSecond3;
            case 4:
                if (jL <= -31557014167219200L) {
                    Instant instant8 = Instant.MIN;
                    this.b = instant8;
                    return instant8;
                }
                if (jL >= 31556889864403199L) {
                    Instant instant9 = Instant.MAX;
                    this.b = instant9;
                    return instant9;
                }
                Instant instantOfEpochSecond4 = Instant.ofEpochSecond(jL, I);
                this.b = instantOfEpochSecond4;
                return instantOfEpochSecond4;
            case 5:
                jA = j$.desugar.sun.nio.fs.g.A(jL, 1000L);
                I = ((int) j$.desugar.sun.nio.fs.g.I(jL, 1000L)) * 1000000;
                jL = jA;
                if (jL <= -31557014167219200L) {
                    Instant instant10 = Instant.MIN;
                    this.b = instant10;
                    return instant10;
                }
                if (jL >= 31556889864403199L) {
                    Instant instant11 = Instant.MAX;
                    this.b = instant11;
                    return instant11;
                }
                Instant instantOfEpochSecond5 = Instant.ofEpochSecond(jL, I);
                this.b = instantOfEpochSecond5;
                return instantOfEpochSecond5;
            case 6:
                jA = j$.desugar.sun.nio.fs.g.A(jL, 1000000L);
                I = ((int) j$.desugar.sun.nio.fs.g.I(jL, 1000000L)) * 1000;
                jL = jA;
                if (jL <= -31557014167219200L) {
                    Instant instant12 = Instant.MIN;
                    this.b = instant12;
                    return instant12;
                }
                if (jL >= 31556889864403199L) {
                    Instant instant13 = Instant.MAX;
                    this.b = instant13;
                    return instant13;
                }
                Instant instantOfEpochSecond6 = Instant.ofEpochSecond(jL, I);
                this.b = instantOfEpochSecond6;
                return instantOfEpochSecond6;
            case 7:
                jA = j$.desugar.sun.nio.fs.g.A(jL, 1000000000L);
                I = (int) j$.desugar.sun.nio.fs.g.I(jL, 1000000000L);
                jL = jA;
                if (jL <= -31557014167219200L) {
                    Instant instant14 = Instant.MIN;
                    this.b = instant14;
                    return instant14;
                }
                if (jL >= 31556889864403199L) {
                    Instant instant15 = Instant.MAX;
                    this.b = instant15;
                    return instant15;
                }
                Instant instantOfEpochSecond7 = Instant.ofEpochSecond(jL, I);
                this.b = instantOfEpochSecond7;
                return instantOfEpochSecond7;
            default:
                throw new AssertionError("Unit not handled");
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    public final String toString() {
        long epochSecond;
        int nano;
        long jA;
        LocalDateTime localDateTimeH;
        int i;
        String str = this.c;
        if (str != null) {
            return str;
        }
        if (this.b == null) {
            if (TimeUnit.MILLISECONDS.compareTo(TimeUnit.SECONDS) >= 0) {
                epochSecond = this.a / 1000;
                nano = 0;
            } else {
                epochSecond = r().getEpochSecond();
                nano = r().getNano();
            }
        } else {
            epochSecond = r().getEpochSecond();
            nano = r().getNano();
        }
        if (epochSecond >= -62167219200L) {
            long j = epochSecond - 253402300800L;
            jA = j$.desugar.sun.nio.fs.g.A(j, 315569520000L) + 1;
            localDateTimeH = LocalDateTime.H(j$.desugar.sun.nio.fs.g.I(j, 315569520000L) - 62167219200L, nano, ZoneOffset.UTC);
            i = localDateTimeH.a.a;
        } else {
            long j2 = epochSecond + 62167219200L;
            jA = j2 / 315569520000L;
            localDateTimeH = LocalDateTime.H((j2 % 315569520000L) - 62167219200L, nano, ZoneOffset.UTC);
            i = localDateTimeH.a.a;
        }
        int i2 = (((int) jA) * 10000) + i;
        LocalDate localDate = localDateTimeH.a;
        LocalTime localTime = localDateTimeH.b;
        if (i2 <= 0) {
            i2--;
        }
        int i3 = localTime.d;
        StringBuilder sb = new StringBuilder(64);
        sb.append(i2 < 0 ? "-" : "");
        int iAbs = Math.abs(i2);
        if (iAbs < 10000) {
            h(sb, 1000, Math.abs(iAbs));
        } else {
            sb.append(String.valueOf(iAbs));
        }
        sb.append('-');
        h(sb, 10, localDate.b);
        sb.append('-');
        h(sb, 10, localDate.c);
        sb.append('T');
        h(sb, 10, localTime.a);
        sb.append(':');
        h(sb, 10, localTime.b);
        sb.append(':');
        h(sb, 10, localTime.c);
        if (i3 != 0) {
            sb.append('.');
            int i4 = 100000000;
            while (i3 % 10 == 0) {
                i3 /= 10;
                i4 /= 10;
            }
            h(sb, i4, i3);
        }
        sb.append('Z');
        String string = sb.toString();
        this.c = string;
        return string;
    }
}

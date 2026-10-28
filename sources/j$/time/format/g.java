package j$.time.format;

import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneOffset;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class g implements e {
    @Override // j$.time.format.e
    public final boolean h(t tVar, StringBuilder sb) {
        Long lA = tVar.a(j$.time.temporal.a.INSTANT_SECONDS);
        j$.time.temporal.k kVar = tVar.a;
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long lValueOf = kVar.d(aVar) ? Long.valueOf(kVar.C(aVar)) : null;
        int i = 0;
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        int iA = aVar.b.a(lValueOf != null ? lValueOf.longValue() : 0L, aVar);
        if (jLongValue >= -62167219200L) {
            long j = jLongValue - 253402300800L;
            long jA = j$.desugar.sun.nio.fs.g.A(j, 315569520000L) + 1;
            LocalDateTime localDateTimeH = LocalDateTime.H(j$.desugar.sun.nio.fs.g.I(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (jA > 0) {
                sb.append('+');
                sb.append(jA);
            }
            sb.append(localDateTimeH);
            if (localDateTimeH.b.c == 0) {
                sb.append(":00");
            }
        } else {
            long j2 = jLongValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            LocalDateTime localDateTimeH2 = LocalDateTime.H(j4 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(localDateTimeH2);
            if (localDateTimeH2.b.c == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (localDateTimeH2.a.a == -10000) {
                    sb.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb.insert(length, j3);
                } else {
                    sb.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (iA > 0) {
            sb.append('.');
            int i2 = 100000000;
            while (true) {
                if (iA <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = iA / i2;
                sb.append((char) (i3 + 48));
                iA -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb.append('Z');
        return true;
    }

    @Override // j$.time.format.e
    public final int k(r rVar, CharSequence charSequence, int i) {
        q qVar = new q();
        qVar.a(DateTimeFormatter.ISO_LOCAL_DATE);
        qVar.c('T');
        j$.time.temporal.a aVar = j$.time.temporal.a.HOUR_OF_DAY;
        qVar.g(aVar, 2);
        qVar.c(':');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MINUTE_OF_HOUR;
        qVar.g(aVar2, 2);
        qVar.c(':');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.SECOND_OF_MINUTE;
        qVar.g(aVar3, 2);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.NANO_OF_SECOND;
        qVar.b(new f(aVar4));
        qVar.c('Z');
        d dVar = qVar.l(Locale.getDefault(), x.SMART, null).a;
        if (dVar.b) {
            dVar = new d(dVar.a, false);
        }
        r rVar2 = new r(rVar.a);
        rVar2.b = rVar.b;
        rVar2.c = rVar.c;
        int iK = dVar.k(rVar2, charSequence, i);
        if (iK < 0) {
            return iK;
        }
        long jLongValue = rVar2.d(j$.time.temporal.a.YEAR).longValue();
        int iIntValue = rVar2.d(j$.time.temporal.a.MONTH_OF_YEAR).intValue();
        int iIntValue2 = rVar2.d(j$.time.temporal.a.DAY_OF_MONTH).intValue();
        int iIntValue3 = rVar2.d(aVar).intValue();
        int iIntValue4 = rVar2.d(aVar2).intValue();
        Long lD = rVar2.d(aVar3);
        Long lD2 = rVar2.d(aVar4);
        int iIntValue5 = lD != null ? lD.intValue() : 0;
        int iIntValue6 = lD2 != null ? lD2.intValue() : 0;
        int i2 = 1;
        if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
            iIntValue3 = 0;
        } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
            rVar.c().d = true;
            i2 = 0;
            iIntValue5 = 59;
        } else {
            i2 = 0;
        }
        int i3 = ((int) jLongValue) % 10000;
        try {
            LocalDateTime localDateTime = LocalDateTime.c;
            LocalDate localDateOf = LocalDate.of(i3, iIntValue, iIntValue2);
            LocalTime localTimeOf = LocalTime.of(iIntValue3, iIntValue4, iIntValue5, 0);
            return rVar.f(aVar4, iIntValue6, i, rVar.f(j$.time.temporal.a.INSTANT_SECONDS, new LocalDateTime(localDateOf, localTimeOf).N(localDateOf.P(i2), localTimeOf).toEpochSecond(ZoneOffset.UTC) + j$.desugar.sun.nio.fs.g.K(jLongValue / 10000, 315569520000L), i, iK));
        } catch (RuntimeException unused) {
            return ~i;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}

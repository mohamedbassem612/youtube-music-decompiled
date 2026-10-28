package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.Temporal;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public interface j extends Temporal, Comparable {
    j g(ZoneId zoneId);

    a getChronology();

    ZoneOffset getOffset();

    ZoneId getZone();

    long toEpochSecond();

    b toLocalDate();

    e toLocalDateTime();

    LocalTime toLocalTime();

    j v(ZoneId zoneId);
}

package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.Temporal;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public interface e extends Temporal, j$.time.temporal.l, Comparable {
    /* JADX INFO: renamed from: E */
    int compareTo(e eVar);

    a getChronology();

    b toLocalDate();

    LocalTime toLocalTime();

    j z(ZoneId zoneId);
}

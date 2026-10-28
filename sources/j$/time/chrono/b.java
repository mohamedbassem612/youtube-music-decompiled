package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public interface b extends Temporal, j$.time.temporal.l, Comparable {
    e D(LocalTime localTime);

    b F(TemporalAmount temporalAmount);

    /* JADX INFO: renamed from: G */
    int compareTo(b bVar);

    @Override // j$.time.temporal.Temporal
    b a(long j, j$.time.temporal.n nVar);

    @Override // j$.time.temporal.Temporal
    b b(long j, TemporalUnit temporalUnit);

    @Override // j$.time.temporal.k
    boolean d(j$.time.temporal.n nVar);

    @Override // j$.time.temporal.Temporal
    long e(Temporal temporal, TemporalUnit temporalUnit);

    boolean equals(Object obj);

    a getChronology();

    m getEra();

    int hashCode();

    b t(long j, TemporalUnit temporalUnit);

    long toEpochDay();

    String toString();

    b x(j$.time.temporal.l lVar);
}

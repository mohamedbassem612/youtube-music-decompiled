package j$.time.temporal;

import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public interface Temporal extends k {
    Temporal a(long j, n nVar);

    Temporal b(long j, TemporalUnit temporalUnit);

    long e(Temporal temporal, TemporalUnit temporalUnit);

    /* JADX INFO: renamed from: k */
    Temporal x(LocalDate localDate);

    Temporal y(long j, ChronoUnit chronoUnit);
}

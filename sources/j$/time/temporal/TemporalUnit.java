package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public interface TemporalUnit {
    long between(Temporal temporal, Temporal temporal2);

    Duration getDuration();

    Temporal h(Temporal temporal, long j);

    boolean isDurationEstimated();
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum aobk implements aihr {
    NETWORK_QUALITY_OBSERVATION_SOURCE_UNKNOWN(0),
    NETWORK_QUALITY_OBSERVATION_SOURCE_HTTP(1),
    NETWORK_QUALITY_OBSERVATION_SOURCE_TCP(2),
    NETWORK_QUALITY_OBSERVATION_SOURCE_QUIC(3),
    NETWORK_QUALITY_OBSERVATION_SOURCE_HTTP_CACHED_ESTIMATE(4),
    NETWORK_QUALITY_OBSERVATION_SOURCE_DEFAULT_HTTP_FROM_PLATFORM(5),
    NETWORK_QUALITY_OBSERVATION_SOURCE_DEPRECATED_HTTP_EXTERNAL_ESTIMATE(6),
    NETWORK_QUALITY_OBSERVATION_SOURCE_TRANSPORT_CACHED_ESTIMATE(7),
    NETWORK_QUALITY_OBSERVATION_SOURCE_DEFAULT_TRANSPORT_FROM_PLATFORM(8),
    NETWORK_QUALITY_OBSERVATION_SOURCE_H2_PINGS(9);

    private final int l;

    aobk(int i) {
        this.l = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}

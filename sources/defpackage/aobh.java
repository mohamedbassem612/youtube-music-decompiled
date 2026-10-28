package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aobh implements aihr {
    NETWORK_QUALITY_BUCKET_UNKNOWN(0),
    NETWORK_QUALITY_BUCKET_OFFLINE(1),
    NETWORK_QUALITY_BUCKET_SLOW(2),
    NETWORK_QUALITY_BUCKET_FAST(3),
    NETWORK_QUALITY_BUCKET_ONLINE(4),
    NETWORK_QUALITY_BUCKET_DEGRADED(5),
    UNRECOGNIZED(-1);

    private final int i;

    aobh(int i) {
        this.i = i;
    }

    public static aobh a(int i) {
        if (i == 0) {
            return NETWORK_QUALITY_BUCKET_UNKNOWN;
        }
        if (i == 1) {
            return NETWORK_QUALITY_BUCKET_OFFLINE;
        }
        if (i == 2) {
            return NETWORK_QUALITY_BUCKET_SLOW;
        }
        if (i == 3) {
            return NETWORK_QUALITY_BUCKET_FAST;
        }
        if (i == 4) {
            return NETWORK_QUALITY_BUCKET_ONLINE;
        }
        if (i != 5) {
            return null;
        }
        return NETWORK_QUALITY_BUCKET_DEGRADED;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this == UNRECOGNIZED ? aiif.a() : this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}

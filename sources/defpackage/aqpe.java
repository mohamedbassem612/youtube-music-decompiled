package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum aqpe implements aihr {
    TRANSFER_FAILURE_REASON_UNKNOWN(0),
    TRANSFER_FAILURE_REASON_FILESYSTEM_WRITE(1),
    TRANSFER_FAILURE_REASON_EXTERNAL_FILESYSTEM_WRITE(2),
    TRANSFER_FAILURE_REASON_PLAYABILITY(3),
    TRANSFER_FAILURE_REASON_TOO_MANY_RETRIES(4),
    TRANSFER_FAILURE_REASON_INTERNAL(5),
    TRANSFER_FAILURE_REASON_STREAM_MISSING(6),
    TRANSFER_FAILURE_REASON_SERVER(7),
    TRANSFER_FAILURE_REASON_SERVER_PROPERTY_MISSING(8),
    TRANSFER_FAILURE_REASON_NETWORK(9),
    TRANSFER_FAILURE_REASON_TERMINATED_BY_USER(10),
    TRANSFER_FAILURE_REASON_NETWORK_LOST(11),
    TRANSFER_FAILURE_REASON_TIMEOUT_NO_PROGRESS(12),
    TRANSFER_FAILURE_REASON_NOT_ENOUGH_STORAGE(13);

    public final int o;

    aqpe(int i) {
        this.o = i;
    }

    public static aqpe a(int i) {
        switch (i) {
            case 0:
                return TRANSFER_FAILURE_REASON_UNKNOWN;
            case 1:
                return TRANSFER_FAILURE_REASON_FILESYSTEM_WRITE;
            case 2:
                return TRANSFER_FAILURE_REASON_EXTERNAL_FILESYSTEM_WRITE;
            case 3:
                return TRANSFER_FAILURE_REASON_PLAYABILITY;
            case 4:
                return TRANSFER_FAILURE_REASON_TOO_MANY_RETRIES;
            case 5:
                return TRANSFER_FAILURE_REASON_INTERNAL;
            case 6:
                return TRANSFER_FAILURE_REASON_STREAM_MISSING;
            case 7:
                return TRANSFER_FAILURE_REASON_SERVER;
            case 8:
                return TRANSFER_FAILURE_REASON_SERVER_PROPERTY_MISSING;
            case 9:
                return TRANSFER_FAILURE_REASON_NETWORK;
            case 10:
                return TRANSFER_FAILURE_REASON_TERMINATED_BY_USER;
            case 11:
                return TRANSFER_FAILURE_REASON_NETWORK_LOST;
            case 12:
                return TRANSFER_FAILURE_REASON_TIMEOUT_NO_PROGRESS;
            case 13:
                return TRANSFER_FAILURE_REASON_NOT_ENOUGH_STORAGE;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.o;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.o);
    }
}

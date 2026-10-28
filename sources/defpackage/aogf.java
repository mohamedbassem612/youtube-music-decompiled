package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aogf implements aihr {
    OFFLINE_REQUEST_SOURCE_UNKNOWN(0),
    OFFLINE_REQUEST_SOURCE_MANUAL_OFFLINE(1),
    OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE(2),
    OFFLINE_REQUEST_SOURCE_REMOTE_OFFLINE(3);

    public final int e;

    aogf(int i) {
        this.e = i;
    }

    public static aogf a(int i) {
        if (i == 0) {
            return OFFLINE_REQUEST_SOURCE_UNKNOWN;
        }
        if (i == 1) {
            return OFFLINE_REQUEST_SOURCE_MANUAL_OFFLINE;
        }
        if (i == 2) {
            return OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE;
        }
        if (i != 3) {
            return null;
        }
        return OFFLINE_REQUEST_SOURCE_REMOTE_OFFLINE;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}

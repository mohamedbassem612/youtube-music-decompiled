package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum akmx implements aihr {
    DOWNLOAD_SYNC_STATE_UNKNOWN(0),
    DOWNLOAD_SYNC_STATE_OUT_OF_DATE(1),
    DOWNLOAD_SYNC_STATE_UP_TO_DATE(2);

    public final int d;

    akmx(int i) {
        this.d = i;
    }

    public static akmx a(int i) {
        if (i == 0) {
            return DOWNLOAD_SYNC_STATE_UNKNOWN;
        }
        if (i == 1) {
            return DOWNLOAD_SYNC_STATE_OUT_OF_DATE;
        }
        if (i != 2) {
            return null;
        }
        return DOWNLOAD_SYNC_STATE_UP_TO_DATE;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum ardr implements aihr {
    DOWNLOAD_STATE_UNKNOWN(0),
    DOWNLOAD_STATE_NOT_DOWNLOADED(1),
    DOWNLOAD_STATE_PENDING_DOWNLOAD(2),
    DOWNLOAD_STATE_DOWNLOAD_IN_PROGRESS(3),
    DOWNLOAD_STATE_COMPLETE(4),
    DOWNLOAD_STATE_FAILED(5),
    DOWNLOAD_STATE_PAUSED(6),
    DOWNLOAD_STATE_RETRYABLE_FAILURE(7),
    DOWNLOAD_STATE_SYNC_NOW(8),
    DOWNLOAD_STATE_USER_DELETED(9);

    private final int l;

    ardr(int i) {
        this.l = i;
    }

    public static ardr a(int i) {
        switch (i) {
            case 0:
                return DOWNLOAD_STATE_UNKNOWN;
            case 1:
                return DOWNLOAD_STATE_NOT_DOWNLOADED;
            case 2:
                return DOWNLOAD_STATE_PENDING_DOWNLOAD;
            case 3:
                return DOWNLOAD_STATE_DOWNLOAD_IN_PROGRESS;
            case 4:
                return DOWNLOAD_STATE_COMPLETE;
            case 5:
                return DOWNLOAD_STATE_FAILED;
            case 6:
                return DOWNLOAD_STATE_PAUSED;
            case 7:
                return DOWNLOAD_STATE_RETRYABLE_FAILURE;
            case 8:
                return DOWNLOAD_STATE_SYNC_NOW;
            case 9:
                return DOWNLOAD_STATE_USER_DELETED;
            default:
                return null;
        }
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

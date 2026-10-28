package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum annn implements aihr {
    MUSIC_ITEM_DOWNLOAD_STATE_UNKNOWN(0),
    MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_IN_PROGRESS(1),
    MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_COMPLETE(2),
    MUSIC_ITEM_DOWNLOAD_STATE_AUTO_OFFLINE_COMPLETE(3),
    MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_SYNC(4),
    MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_WAITING(5),
    MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_ERROR(6),
    MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_UNAVAILABLE(7),
    MUSIC_ITEM_DOWNLOAD_STATE_AUTO_OFFLINE_IN_PROGRESS(8);

    public final int j;

    annn(int i) {
        this.j = i;
    }

    public static annn a(int i) {
        switch (i) {
            case 0:
                return MUSIC_ITEM_DOWNLOAD_STATE_UNKNOWN;
            case 1:
                return MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_IN_PROGRESS;
            case 2:
                return MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_COMPLETE;
            case 3:
                return MUSIC_ITEM_DOWNLOAD_STATE_AUTO_OFFLINE_COMPLETE;
            case 4:
                return MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_SYNC;
            case 5:
                return MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_WAITING;
            case 6:
                return MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_ERROR;
            case 7:
                return MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_UNAVAILABLE;
            case 8:
                return MUSIC_ITEM_DOWNLOAD_STATE_AUTO_OFFLINE_IN_PROGRESS;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}

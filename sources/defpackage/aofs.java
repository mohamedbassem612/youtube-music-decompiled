package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum aofs implements aihr {
    OFFLINE_PLAYLIST_AUTO_SYNC_TYPE_UNSPECIFIED(0),
    OFFLINE_PLAYLIST_AUTO_SYNC_TYPE_METADATA_AND_STREAMS(1),
    OFFLINE_PLAYLIST_AUTO_SYNC_TYPE_METADATA_ONLY(2);

    public final int d;

    aofs(int i) {
        this.d = i;
    }

    public static aofs a(int i) {
        if (i == 0) {
            return OFFLINE_PLAYLIST_AUTO_SYNC_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return OFFLINE_PLAYLIST_AUTO_SYNC_TYPE_METADATA_AND_STREAMS;
        }
        if (i != 2) {
            return null;
        }
        return OFFLINE_PLAYLIST_AUTO_SYNC_TYPE_METADATA_ONLY;
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

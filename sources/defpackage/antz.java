package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum antz implements aihr {
    MUSIC_PLAYLIST_CONTENT_TYPE_UNKNOWN(0),
    MUSIC_PLAYLIST_CONTENT_TYPE_ATV_PREFERRED(1),
    MUSIC_PLAYLIST_CONTENT_TYPE_OMV_PREFERRED(2);

    private final int e;

    antz(int i) {
        this.e = i;
    }

    public static antz a(int i) {
        if (i == 0) {
            return MUSIC_PLAYLIST_CONTENT_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return MUSIC_PLAYLIST_CONTENT_TYPE_ATV_PREFERRED;
        }
        if (i != 2) {
            return null;
        }
        return MUSIC_PLAYLIST_CONTENT_TYPE_OMV_PREFERRED;
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

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum akmy implements aihr {
    CONTENT_RELOAD_CONTINUATION_TOKEN_UNSPECIFIED(0),
    CONTENT_RELOAD_CONTINUATION_TOKEN_DEFAULT(1),
    CONTENT_RELOAD_CONTINUATION_TOKEN_TRACKS(2),
    CONTENT_RELOAD_CONTINUATION_TOKEN_PLAYLISTS(3),
    CONTENT_RELOAD_CONTINUATION_TOKEN_ALBUMS(4),
    CONTENT_RELOAD_CONTINUATION_TOKEN_EPISODE_CONTAINERS(5),
    CONTENT_RELOAD_CONTINUATION_TOKEN_TRACKS_DOWNLOADED_SUBCHIP(6),
    CONTENT_RELOAD_CONTINUATION_TOKEN_PLAYLISTS_DOWNLOADED_SUBCHIP(7),
    CONTENT_RELOAD_CONTINUATION_TOKEN_ALBUMS_DOWNLOADED_SUBCHIP(8),
    CONTENT_RELOAD_CONTINUATION_TOKEN_EPISODE_CONTAINERS_DOWNLOADED_SUBCHIP(9);

    public final int k;

    akmy(int i) {
        this.k = i;
    }

    public static akmy a(int i) {
        switch (i) {
            case 0:
                return CONTENT_RELOAD_CONTINUATION_TOKEN_UNSPECIFIED;
            case 1:
                return CONTENT_RELOAD_CONTINUATION_TOKEN_DEFAULT;
            case 2:
                return CONTENT_RELOAD_CONTINUATION_TOKEN_TRACKS;
            case 3:
                return CONTENT_RELOAD_CONTINUATION_TOKEN_PLAYLISTS;
            case 4:
                return CONTENT_RELOAD_CONTINUATION_TOKEN_ALBUMS;
            case 5:
                return CONTENT_RELOAD_CONTINUATION_TOKEN_EPISODE_CONTAINERS;
            case 6:
                return CONTENT_RELOAD_CONTINUATION_TOKEN_TRACKS_DOWNLOADED_SUBCHIP;
            case 7:
                return CONTENT_RELOAD_CONTINUATION_TOKEN_PLAYLISTS_DOWNLOADED_SUBCHIP;
            case 8:
                return CONTENT_RELOAD_CONTINUATION_TOKEN_ALBUMS_DOWNLOADED_SUBCHIP;
            case 9:
                return CONTENT_RELOAD_CONTINUATION_TOKEN_EPISODE_CONTAINERS_DOWNLOADED_SUBCHIP;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}

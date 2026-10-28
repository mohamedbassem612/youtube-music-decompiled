package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum amzw implements aihr {
    MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_UNSPECIFIED(0),
    MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_DOWNLOADED(1),
    MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_SIDELOADED(2),
    MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_SIDELOADED_ALBUMS(11),
    MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_SIDELOADED_PLAYLISTS(12),
    MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_SIDELOADED_ARTISTS(13),
    MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_DETAILS_FOOTER(14),
    MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_DOWNLOADED_CHILDREN(3),
    MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_SETTINGS(4),
    MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_SETTINGS_OFFLINE(5),
    MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_LOCAL_CONTENT_PARENT(6),
    MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_VOICE_ASSISTANT(7),
    MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_NOOP_OFFLINE_MESSAGE(8),
    MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_REFRESH_BUTTON_OFFLINE(9),
    MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_REFRESH_BUTTON(10);

    public final int p;

    amzw(int i) {
        this.p = i;
    }

    public static amzw a(int i) {
        switch (i) {
            case 0:
                return MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_UNSPECIFIED;
            case 1:
                return MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_DOWNLOADED;
            case 2:
                return MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_SIDELOADED;
            case 3:
                return MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_DOWNLOADED_CHILDREN;
            case 4:
                return MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_SETTINGS;
            case 5:
                return MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_SETTINGS_OFFLINE;
            case 6:
                return MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_LOCAL_CONTENT_PARENT;
            case 7:
                return MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_VOICE_ASSISTANT;
            case 8:
                return MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_NOOP_OFFLINE_MESSAGE;
            case 9:
                return MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_REFRESH_BUTTON_OFFLINE;
            case 10:
                return MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_REFRESH_BUTTON;
            case 11:
                return MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_SIDELOADED_ALBUMS;
            case 12:
                return MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_SIDELOADED_PLAYLISTS;
            case 13:
                return MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_SIDELOADED_ARTISTS;
            case 14:
                return MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_DETAILS_FOOTER;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.p);
    }
}

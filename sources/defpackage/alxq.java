package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum alxq implements aihr {
    MUSIC_SEARCH_REQUEST_TYPE_UNSPECIFIED(0),
    MUSIC_SEARCH_REQUEST_TYPE_CATALOG(1),
    MUSIC_SEARCH_REQUEST_TYPE_LIBRARY(2),
    MUSIC_SEARCH_REQUEST_TYPE_DOWNLOADS(3),
    MUSIC_SEARCH_REQUEST_TYPE_SIDELOADED(4),
    MUSIC_SEARCH_REQUEST_TYPE_UPLOADED(5),
    MUSIC_SEARCH_REQUEST_TYPE_CONVERSATIONAL(6);

    public final int h;

    alxq(int i2) {
        this.h = i2;
    }

    public static alxq a(int i2) {
        switch (i2) {
            case 0:
                return MUSIC_SEARCH_REQUEST_TYPE_UNSPECIFIED;
            case 1:
                return MUSIC_SEARCH_REQUEST_TYPE_CATALOG;
            case 2:
                return MUSIC_SEARCH_REQUEST_TYPE_LIBRARY;
            case 3:
                return MUSIC_SEARCH_REQUEST_TYPE_DOWNLOADS;
            case 4:
                return MUSIC_SEARCH_REQUEST_TYPE_SIDELOADED;
            case 5:
                return MUSIC_SEARCH_REQUEST_TYPE_UPLOADED;
            case 6:
                return MUSIC_SEARCH_REQUEST_TYPE_CONVERSATIONAL;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aofy implements aihr {
    OFFLINE_PLAYLIST_SORT_ORDER_UNSPECIFIED(0),
    OFFLINE_PLAYLIST_SORT_ORDER_A_TO_Z(1),
    OFFLINE_PLAYLIST_SORT_ORDER_Z_TO_A(2),
    OFFLINE_PLAYLIST_SORT_ORDER_RECENTS(3),
    OFFLINE_PLAYLIST_SORT_ORDER_RECENTLY_PLAYED(4),
    OFFLINE_PLAYLIST_SORT_ORDER_RECENTLY_ADDED(5);

    public final int g;

    aofy(int i) {
        this.g = i;
    }

    public static aofy a(int i) {
        if (i == 0) {
            return OFFLINE_PLAYLIST_SORT_ORDER_UNSPECIFIED;
        }
        if (i == 1) {
            return OFFLINE_PLAYLIST_SORT_ORDER_A_TO_Z;
        }
        if (i == 2) {
            return OFFLINE_PLAYLIST_SORT_ORDER_Z_TO_A;
        }
        if (i == 3) {
            return OFFLINE_PLAYLIST_SORT_ORDER_RECENTS;
        }
        if (i == 4) {
            return OFFLINE_PLAYLIST_SORT_ORDER_RECENTLY_PLAYED;
        }
        if (i != 5) {
            return null;
        }
        return OFFLINE_PLAYLIST_SORT_ORDER_RECENTLY_ADDED;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}

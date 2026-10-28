package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum anqm implements aihr {
    MUSIC_LIBRARY_ITEM_VIEW_MODE_UNSPECIFIED(0),
    MUSIC_LIBRARY_ITEM_VIEW_MODE_LIST_ITEMS(1),
    MUSIC_LIBRARY_ITEM_VIEW_MODE_GRID_ITEMS(2);

    public final int d;

    anqm(int i) {
        this.d = i;
    }

    public static anqm a(int i) {
        if (i == 0) {
            return MUSIC_LIBRARY_ITEM_VIEW_MODE_UNSPECIFIED;
        }
        if (i == 1) {
            return MUSIC_LIBRARY_ITEM_VIEW_MODE_LIST_ITEMS;
        }
        if (i != 2) {
            return null;
        }
        return MUSIC_LIBRARY_ITEM_VIEW_MODE_GRID_ITEMS;
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

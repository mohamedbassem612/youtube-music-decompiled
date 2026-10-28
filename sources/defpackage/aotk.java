package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum aotk implements aihr {
    PLAYLIST_ENTITY_VISIBILITY_UNKNOWN(0),
    PLAYLIST_ENTITY_VISIBILITY_PUBLIC(1),
    PLAYLIST_ENTITY_VISIBILITY_PRIVATE(2),
    PLAYLIST_ENTITY_VISIBILITY_UNLISTED(3);

    public final int e;

    aotk(int i) {
        this.e = i;
    }

    public static aotk a(int i) {
        if (i == 0) {
            return PLAYLIST_ENTITY_VISIBILITY_UNKNOWN;
        }
        if (i == 1) {
            return PLAYLIST_ENTITY_VISIBILITY_PUBLIC;
        }
        if (i == 2) {
            return PLAYLIST_ENTITY_VISIBILITY_PRIVATE;
        }
        if (i != 3) {
            return null;
        }
        return PLAYLIST_ENTITY_VISIBILITY_UNLISTED;
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

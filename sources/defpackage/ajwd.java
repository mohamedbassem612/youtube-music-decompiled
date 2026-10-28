package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum ajwd implements aihr {
    COLLECTION_STYLE_ITEM_SIZE_UNKNOWN(0),
    COLLECTION_STYLE_ITEM_SIZE_EXTRA_SMALL(5),
    COLLECTION_STYLE_ITEM_SIZE_SMALL(1),
    COLLECTION_STYLE_ITEM_SIZE_SMALL_STATIC(4),
    COLLECTION_STYLE_ITEM_SIZE_MEDIUM(2),
    COLLECTION_STYLE_ITEM_SIZE_LARGE(3);

    private final int h;

    ajwd(int i) {
        this.h = i;
    }

    public static ajwd a(int i) {
        if (i == 0) {
            return COLLECTION_STYLE_ITEM_SIZE_UNKNOWN;
        }
        if (i == 1) {
            return COLLECTION_STYLE_ITEM_SIZE_SMALL;
        }
        if (i == 2) {
            return COLLECTION_STYLE_ITEM_SIZE_MEDIUM;
        }
        if (i == 3) {
            return COLLECTION_STYLE_ITEM_SIZE_LARGE;
        }
        if (i == 4) {
            return COLLECTION_STYLE_ITEM_SIZE_SMALL_STATIC;
        }
        if (i != 5) {
            return null;
        }
        return COLLECTION_STYLE_ITEM_SIZE_EXTRA_SMALL;
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

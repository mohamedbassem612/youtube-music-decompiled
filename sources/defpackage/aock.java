package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum aock implements aihr {
    SHORTS_EXPANDED_LAYOUT_TYPE_UNKNOWN(0),
    SHORTS_EXPANDED_LAYOUT_TYPE_THUMBNAIL_END(1),
    SHORTS_EXPANDED_LAYOUT_TYPE_THUMBNAIL_END_TWO_TWO(3);

    private final int e;

    aock(int i) {
        this.e = i;
    }

    public static aock a(int i) {
        if (i == 0) {
            return SHORTS_EXPANDED_LAYOUT_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return SHORTS_EXPANDED_LAYOUT_TYPE_THUMBNAIL_END;
        }
        if (i != 3) {
            return null;
        }
        return SHORTS_EXPANDED_LAYOUT_TYPE_THUMBNAIL_END_TWO_TWO;
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

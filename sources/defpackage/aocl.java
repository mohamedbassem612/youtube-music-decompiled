package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum aocl implements aihr {
    SHORTS_LAYOUT_TYPE_UNKNOWN(0),
    SHORTS_LAYOUT_TYPE_THUMBNAIL_END(1),
    SHORTS_LAYOUT_TYPE_THUMBNAIL_END_NO_HEADER(2);

    private final int e;

    aocl(int i) {
        this.e = i;
    }

    public static aocl a(int i) {
        if (i == 0) {
            return SHORTS_LAYOUT_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return SHORTS_LAYOUT_TYPE_THUMBNAIL_END;
        }
        if (i != 2) {
            return null;
        }
        return SHORTS_LAYOUT_TYPE_THUMBNAIL_END_NO_HEADER;
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

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum ambm implements aihr {
    SHELF_ITEM_INSERT_POSITION_UNSPECIFIED(0),
    SHELF_ITEM_INSERT_POSITION_START(1),
    SHELF_ITEM_INSERT_POSITION_END(2);

    private final int e;

    ambm(int i) {
        this.e = i;
    }

    public static ambm a(int i) {
        if (i == 0) {
            return SHELF_ITEM_INSERT_POSITION_UNSPECIFIED;
        }
        if (i == 1) {
            return SHELF_ITEM_INSERT_POSITION_START;
        }
        if (i != 2) {
            return null;
        }
        return SHELF_ITEM_INSERT_POSITION_END;
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

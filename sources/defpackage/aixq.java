package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aixq implements aihr {
    TRIGGER_CATEGORY_UNSPECIFIED(0),
    TRIGGER_CATEGORY_SLOT_ENTRY(1),
    TRIGGER_CATEGORY_SLOT_FULFILLMENT(2),
    TRIGGER_CATEGORY_SLOT_EXPIRATION(3),
    TRIGGER_CATEGORY_LAYOUT_EXIT_NORMAL(4),
    TRIGGER_CATEGORY_LAYOUT_EXIT_USER_SKIPPED(5),
    TRIGGER_CATEGORY_LAYOUT_EXIT_USER_MUTED(6),
    TRIGGER_CATEGORY_LAYOUT_EXIT_USER_INPUT_SUBMITTED(8),
    TRIGGER_CATEGORY_LAYOUT_EXIT_USER_CANCELLED(9),
    TRIGGER_CATEGORY_PING_DISPATCH(7);

    public final int k;

    aixq(int i) {
        this.k = i;
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

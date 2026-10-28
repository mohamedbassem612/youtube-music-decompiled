package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum akur implements aihr {
    TOOLBAR_HEART_STATE_UNKNOWN(0),
    TOOLBAR_HEART_STATE_HEARTED(1),
    TOOLBAR_HEART_STATE_UNHEARTED(2),
    TOOLBAR_HEART_STATE_HEARTED_EDITABLE(3),
    TOOLBAR_HEART_STATE_UNHEARTED_EDITABLE(4);

    private final int g;

    akur(int i) {
        this.g = i;
    }

    public static akur a(int i) {
        if (i == 0) {
            return TOOLBAR_HEART_STATE_UNKNOWN;
        }
        if (i == 1) {
            return TOOLBAR_HEART_STATE_HEARTED;
        }
        if (i == 2) {
            return TOOLBAR_HEART_STATE_UNHEARTED;
        }
        if (i == 3) {
            return TOOLBAR_HEART_STATE_HEARTED_EDITABLE;
        }
        if (i != 4) {
            return null;
        }
        return TOOLBAR_HEART_STATE_UNHEARTED_EDITABLE;
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

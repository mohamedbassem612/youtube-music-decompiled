package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum aqfh implements aihr {
    SUGGEST_EDITABLE_TEXT_ACTION_UNKNOWN(0),
    SUGGEST_EDITABLE_TEXT_ACTION_INSERT(1),
    SUGGEST_EDITABLE_TEXT_ACTION_BACKSPACE(2),
    SUGGEST_EDITABLE_TEXT_ACTION_CHANGE(3),
    SUGGEST_EDITABLE_TEXT_ACTION_KEYBOARD_DOWN(4);

    private final int g;

    aqfh(int i) {
        this.g = i;
    }

    public static aqfh a(int i) {
        if (i == 0) {
            return SUGGEST_EDITABLE_TEXT_ACTION_UNKNOWN;
        }
        if (i == 1) {
            return SUGGEST_EDITABLE_TEXT_ACTION_INSERT;
        }
        if (i == 2) {
            return SUGGEST_EDITABLE_TEXT_ACTION_BACKSPACE;
        }
        if (i == 3) {
            return SUGGEST_EDITABLE_TEXT_ACTION_CHANGE;
        }
        if (i != 4) {
            return null;
        }
        return SUGGEST_EDITABLE_TEXT_ACTION_KEYBOARD_DOWN;
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

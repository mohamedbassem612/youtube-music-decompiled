package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum assl implements aihr {
    DISMISS_BOTTOM_SHEET_ON_ROTATE_MODE_UNKNOWN(0),
    DISMISS_BOTTOM_SHEET_ON_ROTATE_MODE_PORTRAIT(1),
    DISMISS_BOTTOM_SHEET_ON_ROTATE_MODE_LANDSCAPE(2),
    DISMISS_BOTTOM_SHEET_ON_ROTATE_MODE_ANY(3);

    private final int f;

    assl(int i) {
        this.f = i;
    }

    public static assl a(int i) {
        if (i == 0) {
            return DISMISS_BOTTOM_SHEET_ON_ROTATE_MODE_UNKNOWN;
        }
        if (i == 1) {
            return DISMISS_BOTTOM_SHEET_ON_ROTATE_MODE_PORTRAIT;
        }
        if (i == 2) {
            return DISMISS_BOTTOM_SHEET_ON_ROTATE_MODE_LANDSCAPE;
        }
        if (i != 3) {
            return null;
        }
        return DISMISS_BOTTOM_SHEET_ON_ROTATE_MODE_ANY;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}

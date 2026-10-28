package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum arbd implements aihr {
    USER_INTERFACE_ORIENTATION_UNKNOWN(0),
    USER_INTERFACE_ORIENTATION_PORTRAIT(1),
    USER_INTERFACE_ORIENTATION_PORTRAIT_UPSIDE_DOWN(2),
    USER_INTERFACE_ORIENTATION_LANDSCAPE_RIGHT_ON_TOP(3),
    USER_INTERFACE_ORIENTATION_LANDSCAPE_LEFT_ON_TOP(4);

    private final int g;

    arbd(int i) {
        this.g = i;
    }

    public static arbd a(int i) {
        if (i == 0) {
            return USER_INTERFACE_ORIENTATION_UNKNOWN;
        }
        if (i == 1) {
            return USER_INTERFACE_ORIENTATION_PORTRAIT;
        }
        if (i == 2) {
            return USER_INTERFACE_ORIENTATION_PORTRAIT_UPSIDE_DOWN;
        }
        if (i == 3) {
            return USER_INTERFACE_ORIENTATION_LANDSCAPE_RIGHT_ON_TOP;
        }
        if (i != 4) {
            return null;
        }
        return USER_INTERFACE_ORIENTATION_LANDSCAPE_LEFT_ON_TOP;
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

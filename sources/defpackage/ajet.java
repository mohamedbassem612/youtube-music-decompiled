package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum ajet implements aihr {
    USER_INTERFACE_THEME_UNKNOWN(0),
    USER_INTERFACE_THEME_LIGHT(1),
    USER_INTERFACE_THEME_DARK(2);

    public final int d;

    ajet(int i) {
        this.d = i;
    }

    public static ajet a(int i) {
        if (i == 0) {
            return USER_INTERFACE_THEME_UNKNOWN;
        }
        if (i == 1) {
            return USER_INTERFACE_THEME_LIGHT;
        }
        if (i != 2) {
            return null;
        }
        return USER_INTERFACE_THEME_DARK;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}

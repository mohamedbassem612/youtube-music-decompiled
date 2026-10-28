package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum aiel implements aihr {
    UNKNOWN(0),
    SYSTEM_TRAY(1),
    IN_APP(2);

    public final int d;

    aiel(int i) {
        this.d = i;
    }

    public static aiel a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return SYSTEM_TRAY;
        }
        if (i != 2) {
            return null;
        }
        return IN_APP;
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

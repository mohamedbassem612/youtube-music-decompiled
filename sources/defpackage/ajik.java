package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum ajik implements aihr {
    AUTOMIX_MODE_UNKNOWN(0),
    AUTOMIX_MODE_DEFAULT_OFF(1),
    AUTOMIX_MODE_DEFAULT_ON(2),
    UNRECOGNIZED(-1);

    private final int f;

    ajik(int i) {
        this.f = i;
    }

    public static ajik a(int i) {
        if (i == 0) {
            return AUTOMIX_MODE_UNKNOWN;
        }
        if (i == 1) {
            return AUTOMIX_MODE_DEFAULT_OFF;
        }
        if (i != 2) {
            return null;
        }
        return AUTOMIX_MODE_DEFAULT_ON;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this == UNRECOGNIZED ? aiif.a() : this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}

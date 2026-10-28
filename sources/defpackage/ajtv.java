package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum ajtv implements aihr {
    ERROR_LEVEL_UNKNOWN(0),
    ERROR_LEVEL_WARNING(3),
    ERROR_LEVEL_WARNNING(1),
    ERROR_LEVEL_ERROR(2);

    public final int e;

    ajtv(int i) {
        this.e = i;
    }

    public static ajtv a(int i) {
        if (i == 0) {
            return ERROR_LEVEL_UNKNOWN;
        }
        if (i == 1) {
            return ERROR_LEVEL_WARNNING;
        }
        if (i == 2) {
            return ERROR_LEVEL_ERROR;
        }
        if (i != 3) {
            return null;
        }
        return ERROR_LEVEL_WARNING;
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

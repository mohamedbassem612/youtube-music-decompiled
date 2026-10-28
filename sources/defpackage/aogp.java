package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aogp implements aihr {
    UNKNOWN(0),
    OK(1),
    DELETE(2),
    DISABLE(3),
    REFRESH(4),
    REFRESH_AD(5),
    DELETE_AD(6);

    public final int h;

    aogp(int i2) {
        this.h = i2;
    }

    public static aogp a(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return OK;
            case 2:
                return DELETE;
            case 3:
                return DISABLE;
            case 4:
                return REFRESH;
            case 5:
                return REFRESH_AD;
            case 6:
                return DELETE_AD;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}

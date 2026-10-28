package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum amkp implements aihr {
    UNKNOWN(0),
    FLASHACCESS(1),
    WIDEVINE_CLASSIC(2),
    FAIRPLAY(6),
    CLEARKEY(3),
    WIDEVINE(4),
    PLAYREADY(5);

    private final int i;

    amkp(int i) {
        this.i = i;
    }

    public static amkp a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return FLASHACCESS;
            case 2:
                return WIDEVINE_CLASSIC;
            case 3:
                return CLEARKEY;
            case 4:
                return WIDEVINE;
            case 5:
                return PLAYREADY;
            case 6:
                return FAIRPLAY;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}

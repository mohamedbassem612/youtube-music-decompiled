package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum amwi implements aihr {
    SYNC_MODE_UNKNOWN(0),
    SYNC_MODE_USER_BROWSING(1),
    SYNC_MODE_SYNCED_WITH_VIDEO(2);

    public final int d;

    amwi(int i) {
        this.d = i;
    }

    public static amwi a(int i) {
        if (i == 0) {
            return SYNC_MODE_UNKNOWN;
        }
        if (i == 1) {
            return SYNC_MODE_USER_BROWSING;
        }
        if (i != 2) {
            return null;
        }
        return SYNC_MODE_SYNCED_WITH_VIDEO;
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

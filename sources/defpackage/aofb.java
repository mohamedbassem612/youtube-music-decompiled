package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aofb implements aihr {
    OFFLINE_TYPE_UNKNOWN(0),
    OFFLINE_NOW(1),
    OFFLINE_DEFERRED(2),
    OFFLINE_MODE_TYPE_OFFLINE_SHARING(3),
    OFFLINE_MODE_TYPE_SIDELOAD(4),
    OFFLINE_MODE_TYPE_AUTO_OFFLINE(5),
    OFFLINE_MODE_TYPE_DOWNLOAD_RECOMMENDATIONS(6),
    OFFLINE_MODE_TYPE_EMERGENCY_BUFFER(7);

    public final int i;

    aofb(int i) {
        this.i = i;
    }

    public static aofb a(int i) {
        switch (i) {
            case 0:
                return OFFLINE_TYPE_UNKNOWN;
            case 1:
                return OFFLINE_NOW;
            case 2:
                return OFFLINE_DEFERRED;
            case 3:
                return OFFLINE_MODE_TYPE_OFFLINE_SHARING;
            case 4:
                return OFFLINE_MODE_TYPE_SIDELOAD;
            case 5:
                return OFFLINE_MODE_TYPE_AUTO_OFFLINE;
            case 6:
                return OFFLINE_MODE_TYPE_DOWNLOAD_RECOMMENDATIONS;
            case 7:
                return OFFLINE_MODE_TYPE_EMERGENCY_BUFFER;
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

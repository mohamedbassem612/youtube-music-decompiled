package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aptd implements aihr {
    SHARE_CLIENT_PARAMS_TYPE_UNSPECIFIED(0),
    SHARE_CLIENT_PARAMS_TYPE_VIDEO(1),
    SHARE_CLIENT_PARAMS_TYPE_FLOW(2),
    SHARE_CLIENT_PARAMS_TYPE_SYSTEM_SHARE_SHEET(3);

    private final int f;

    aptd(int i) {
        this.f = i;
    }

    public static aptd a(int i) {
        if (i == 0) {
            return SHARE_CLIENT_PARAMS_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return SHARE_CLIENT_PARAMS_TYPE_VIDEO;
        }
        if (i == 2) {
            return SHARE_CLIENT_PARAMS_TYPE_FLOW;
        }
        if (i != 3) {
            return null;
        }
        return SHARE_CLIENT_PARAMS_TYPE_SYSTEM_SHARE_SHEET;
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

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum amyt implements aihr {
    MDX_LOCAL_NETWORK_PERMISSION_STATUS_UNSPECIFIED(0),
    MDX_LOCAL_NETWORK_PERMISSION_STATUS_NOT_ASKED(1),
    MDX_LOCAL_NETWORK_PERMISSION_STATUS_AUTHORIZED(2),
    MDX_LOCAL_NETWORK_PERMISSION_STATUS_DENIED(3);

    public final int e;

    amyt(int i) {
        this.e = i;
    }

    public static amyt a(int i) {
        if (i == 0) {
            return MDX_LOCAL_NETWORK_PERMISSION_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return MDX_LOCAL_NETWORK_PERMISSION_STATUS_NOT_ASKED;
        }
        if (i == 2) {
            return MDX_LOCAL_NETWORK_PERMISSION_STATUS_AUTHORIZED;
        }
        if (i != 3) {
            return null;
        }
        return MDX_LOCAL_NETWORK_PERMISSION_STATUS_DENIED;
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

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum amyn implements aihr {
    MDX_DISCOVERY_ID_TYPE_UNSPECIFIED(0),
    MDX_DISCOVERY_ID_TYPE_LOUNGE_DEVICE_ID(1),
    MDX_DISCOVERY_ID_TYPE_CAST_CLOUD_DEVICE_ID(2);

    public final int d;

    amyn(int i) {
        this.d = i;
    }

    public static amyn a(int i) {
        if (i == 0) {
            return MDX_DISCOVERY_ID_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return MDX_DISCOVERY_ID_TYPE_LOUNGE_DEVICE_ID;
        }
        if (i != 2) {
            return null;
        }
        return MDX_DISCOVERY_ID_TYPE_CAST_CLOUD_DEVICE_ID;
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

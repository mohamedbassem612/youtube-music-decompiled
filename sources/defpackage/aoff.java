package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum aoff implements aihr {
    OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_UNKNOWN(0),
    OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NONE(1),
    OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK(2),
    OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK_WIFI(3),
    OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK_WIFI_OR_UNMETERED(4),
    OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_LOW_THERMAL_STATE(5),
    OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_INACTIVE_MEDIA_TRANSFER(6);

    public final int h;

    aoff(int i2) {
        this.h = i2;
    }

    public static aoff a(int i2) {
        switch (i2) {
            case 0:
                return OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_UNKNOWN;
            case 1:
                return OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NONE;
            case 2:
                return OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK;
            case 3:
                return OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK_WIFI;
            case 4:
                return OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK_WIFI_OR_UNMETERED;
            case 5:
                return OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_LOW_THERMAL_STATE;
            case 6:
                return OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_INACTIVE_MEDIA_TRANSFER;
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

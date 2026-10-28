package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum airv implements aihr {
    ACTIVE_DEVICE_CAPABILITY_UNSPECIFIED(0),
    ACTIVE_DEVICE_CAPABILITY_MDX_CONNECTION(1),
    ACTIVE_DEVICE_CAPABILITY_REMOTE_CONTROL_SET_PLAYBACK(2),
    ACTIVE_DEVICE_CAPABILITY_QUEUE_PLAYBACK(3);

    private final int f;

    airv(int i) {
        this.f = i;
    }

    public static airv a(int i) {
        if (i == 0) {
            return ACTIVE_DEVICE_CAPABILITY_UNSPECIFIED;
        }
        if (i == 1) {
            return ACTIVE_DEVICE_CAPABILITY_MDX_CONNECTION;
        }
        if (i == 2) {
            return ACTIVE_DEVICE_CAPABILITY_REMOTE_CONTROL_SET_PLAYBACK;
        }
        if (i != 3) {
            return null;
        }
        return ACTIVE_DEVICE_CAPABILITY_QUEUE_PLAYBACK;
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

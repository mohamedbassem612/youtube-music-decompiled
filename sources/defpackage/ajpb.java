package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum ajpb implements aihr {
    CAST_ICON_AWARENESS_STATE_UNSPECIFIED(0),
    CAST_ICON_AWARENESS_STATE_HAS_ACTIVE_DEVICE(1),
    CAST_ICON_AWARENESS_STATE_HAS_ACTIVE_DEVICE_WITH_PLAYBACK(2),
    CAST_ICON_AWARENESS_STATE_NO_ACTIVE_DEVICE(3),
    CAST_ICON_AWARENESS_STATE_HAS_ONLY_INACTIVE_DEVICE_WITH_PLAYBACK(4);

    public final int f;

    ajpb(int i) {
        this.f = i;
    }

    public static ajpb a(int i) {
        if (i == 0) {
            return CAST_ICON_AWARENESS_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return CAST_ICON_AWARENESS_STATE_HAS_ACTIVE_DEVICE;
        }
        if (i == 2) {
            return CAST_ICON_AWARENESS_STATE_HAS_ACTIVE_DEVICE_WITH_PLAYBACK;
        }
        if (i == 3) {
            return CAST_ICON_AWARENESS_STATE_NO_ACTIVE_DEVICE;
        }
        if (i != 4) {
            return null;
        }
        return CAST_ICON_AWARENESS_STATE_HAS_ONLY_INACTIVE_DEVICE_WITH_PLAYBACK;
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

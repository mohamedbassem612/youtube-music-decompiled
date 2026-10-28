package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum apds implements aihr {
    REEL_CONTENT_CLEAR_MODE_STATE_UNKNOWN(0),
    REEL_CONTENT_CLEAR_MODE_STATE_INACTIVE(1),
    REEL_CONTENT_CLEAR_MODE_STATE_ACTIVE(2),
    REEL_CONTENT_CLEAR_MODE_STATE_GESTURE_IN_PROGRESS(3);

    private final int f;

    apds(int i) {
        this.f = i;
    }

    public static apds a(int i) {
        if (i == 0) {
            return REEL_CONTENT_CLEAR_MODE_STATE_UNKNOWN;
        }
        if (i == 1) {
            return REEL_CONTENT_CLEAR_MODE_STATE_INACTIVE;
        }
        if (i == 2) {
            return REEL_CONTENT_CLEAR_MODE_STATE_ACTIVE;
        }
        if (i != 3) {
            return null;
        }
        return REEL_CONTENT_CLEAR_MODE_STATE_GESTURE_IN_PROGRESS;
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

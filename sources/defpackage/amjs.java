package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum amjs implements aihr {
    LATENCY_PLAYER_VISIBILITY_STATE_UNKNOWN(0),
    LATENCY_PLAYER_VISIBILITY_STATE_MINIMIZED(1),
    LATENCY_PLAYER_VISIBILITY_STATE_FULLSCREEN(2),
    LATENCY_PLAYER_VISIBILITY_STATE_BACKGROUND(3),
    LATENCY_PLAYER_VISIBILITY_STATE_EXTERNAL_DISPLAY(4),
    LATENCY_PLAYER_VISIBILITY_STATE_INLINE(5),
    LATENCY_PLAYER_VISIBILITY_STATE_VR(6),
    LATENCY_PLAYER_VISIBILITY_STATE_PIP(7);

    public final int i;

    amjs(int i) {
        this.i = i;
    }

    public static amjs a(int i) {
        switch (i) {
            case 0:
                return LATENCY_PLAYER_VISIBILITY_STATE_UNKNOWN;
            case 1:
                return LATENCY_PLAYER_VISIBILITY_STATE_MINIMIZED;
            case 2:
                return LATENCY_PLAYER_VISIBILITY_STATE_FULLSCREEN;
            case 3:
                return LATENCY_PLAYER_VISIBILITY_STATE_BACKGROUND;
            case 4:
                return LATENCY_PLAYER_VISIBILITY_STATE_EXTERNAL_DISPLAY;
            case 5:
                return LATENCY_PLAYER_VISIBILITY_STATE_INLINE;
            case 6:
                return LATENCY_PLAYER_VISIBILITY_STATE_VR;
            case 7:
                return LATENCY_PLAYER_VISIBILITY_STATE_PIP;
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

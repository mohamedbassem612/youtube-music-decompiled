package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum amse implements aihr {
    LIVE_PLAYER_STATE_UNKNOWN(0),
    LIVE_PLAYER_STATE_LIVE(1),
    LIVE_PLAYER_STATE_ENDED(2);

    private final int e;

    amse(int i) {
        this.e = i;
    }

    public static amse a(int i) {
        if (i == 0) {
            return LIVE_PLAYER_STATE_UNKNOWN;
        }
        if (i == 1) {
            return LIVE_PLAYER_STATE_LIVE;
        }
        if (i != 2) {
            return null;
        }
        return LIVE_PLAYER_STATE_ENDED;
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

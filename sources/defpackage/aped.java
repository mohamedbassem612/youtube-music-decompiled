package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum aped implements aihr {
    REEL_NAVIGATION_REASON_UNKNOWN(0),
    REEL_NAVIGATION_REASON_USER_INITIATED(1),
    REEL_NAVIGATION_REASON_PLAYBACK_ENDED(2);

    private final int e;

    aped(int i) {
        this.e = i;
    }

    public static aped a(int i) {
        if (i == 0) {
            return REEL_NAVIGATION_REASON_UNKNOWN;
        }
        if (i == 1) {
            return REEL_NAVIGATION_REASON_USER_INITIATED;
        }
        if (i != 2) {
            return null;
        }
        return REEL_NAVIGATION_REASON_PLAYBACK_ENDED;
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

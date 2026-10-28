package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum apdn implements aihr {
    REEL_AD_TRANSITION_TYPE_UNSPECIFIED(0),
    REEL_AD_TRANSITION_TYPE_USER(1),
    REEL_AD_TRANSITION_TYPE_AUTO(2),
    REEL_AD_TRANSITION_TYPE_USER_REMOVED(3),
    REEL_AD_TRANSITION_TYPE_ABANDONED(4),
    REEL_AD_TRANSITION_TYPE_USER_INPUT_SUBMITTED(5);

    private final int h;

    apdn(int i) {
        this.h = i;
    }

    public static apdn a(int i) {
        if (i == 0) {
            return REEL_AD_TRANSITION_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return REEL_AD_TRANSITION_TYPE_USER;
        }
        if (i == 2) {
            return REEL_AD_TRANSITION_TYPE_AUTO;
        }
        if (i == 3) {
            return REEL_AD_TRANSITION_TYPE_USER_REMOVED;
        }
        if (i == 4) {
            return REEL_AD_TRANSITION_TYPE_ABANDONED;
        }
        if (i != 5) {
            return null;
        }
        return REEL_AD_TRANSITION_TYPE_USER_INPUT_SUBMITTED;
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

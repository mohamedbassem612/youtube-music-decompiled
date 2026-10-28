package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum apdu implements aihr {
    REEL_CONTENT_CONTEXTUAL_STATE_UNKNOWN(0),
    REEL_CONTENT_CONTEXTUAL_STATE_ACTIVE(1),
    REEL_CONTENT_CONTEXTUAL_STATE_INACTIVE(2);

    private final int e;

    apdu(int i) {
        this.e = i;
    }

    public static apdu a(int i) {
        if (i == 0) {
            return REEL_CONTENT_CONTEXTUAL_STATE_UNKNOWN;
        }
        if (i == 1) {
            return REEL_CONTENT_CONTEXTUAL_STATE_ACTIVE;
        }
        if (i != 2) {
            return null;
        }
        return REEL_CONTENT_CONTEXTUAL_STATE_INACTIVE;
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

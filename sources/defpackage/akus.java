package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum akus implements aihr {
    TOOLBAR_LIKE_STATE_UNKNOWN(0),
    TOOLBAR_LIKE_STATE_INDIFFERENT(1),
    TOOLBAR_LIKE_STATE_LIKED(2),
    TOOLBAR_LIKE_STATE_DISLIKED(3);

    private final int f;

    akus(int i) {
        this.f = i;
    }

    public static akus a(int i) {
        if (i == 0) {
            return TOOLBAR_LIKE_STATE_UNKNOWN;
        }
        if (i == 1) {
            return TOOLBAR_LIKE_STATE_INDIFFERENT;
        }
        if (i == 2) {
            return TOOLBAR_LIKE_STATE_LIKED;
        }
        if (i != 3) {
            return null;
        }
        return TOOLBAR_LIKE_STATE_DISLIKED;
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

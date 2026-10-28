package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum anod implements aihr {
    MUSIC_ENTITY_LIKE_STATE_UNKNOWN(0),
    MUSIC_ENTITY_LIKE_STATE_LIKED(1),
    MUSIC_ENTITY_LIKE_STATE_DISLIKED(2),
    MUSIC_ENTITY_LIKE_STATE_NEUTRAL(3);

    private final int f;

    anod(int i) {
        this.f = i;
    }

    public static anod a(int i) {
        if (i == 0) {
            return MUSIC_ENTITY_LIKE_STATE_UNKNOWN;
        }
        if (i == 1) {
            return MUSIC_ENTITY_LIKE_STATE_LIKED;
        }
        if (i == 2) {
            return MUSIC_ENTITY_LIKE_STATE_DISLIKED;
        }
        if (i != 3) {
            return null;
        }
        return MUSIC_ENTITY_LIKE_STATE_NEUTRAL;
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

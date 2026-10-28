package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum anpu implements aihr {
    MUSIC_INLINE_BADGE_DISPLAY_MODE_UNKNOWN(0),
    MUSIC_INLINE_BADGE_DISPLAY_MODE_PLAYBACK_QUEUE(1),
    MUSIC_INLINE_BADGE_DISPLAY_MODE_PLAYER(2);

    public final int d;

    anpu(int i) {
        this.d = i;
    }

    public static anpu a(int i) {
        if (i == 0) {
            return MUSIC_INLINE_BADGE_DISPLAY_MODE_UNKNOWN;
        }
        if (i == 1) {
            return MUSIC_INLINE_BADGE_DISPLAY_MODE_PLAYBACK_QUEUE;
        }
        if (i != 2) {
            return null;
        }
        return MUSIC_INLINE_BADGE_DISPLAY_MODE_PLAYER;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}

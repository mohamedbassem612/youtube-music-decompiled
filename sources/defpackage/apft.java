package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum apft implements aihr {
    REEL_WATCH_EXPERIENCE_TYPE_UNKNOWN(0),
    REEL_WATCH_EXPERIENCE_TYPE_SHORTS(1),
    REEL_WATCH_EXPERIENCE_TYPE_IMMERSIVE_LIVE(2),
    REEL_WATCH_EXPERIENCE_TYPE_MUSIC_SAMPLES(3),
    REEL_WATCH_EXPERIENCE_TYPE_CONSUMPTION_FEED(4),
    REEL_WATCH_EXPERIENCE_TYPE_MINI_APP_AD(5);

    public final int g;

    apft(int i) {
        this.g = i;
    }

    public static apft a(int i) {
        if (i == 0) {
            return REEL_WATCH_EXPERIENCE_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return REEL_WATCH_EXPERIENCE_TYPE_SHORTS;
        }
        if (i == 2) {
            return REEL_WATCH_EXPERIENCE_TYPE_IMMERSIVE_LIVE;
        }
        if (i == 3) {
            return REEL_WATCH_EXPERIENCE_TYPE_MUSIC_SAMPLES;
        }
        if (i == 4) {
            return REEL_WATCH_EXPERIENCE_TYPE_CONSUMPTION_FEED;
        }
        if (i != 5) {
            return null;
        }
        return REEL_WATCH_EXPERIENCE_TYPE_MINI_APP_AD;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}

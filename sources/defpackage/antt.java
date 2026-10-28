package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum antt implements aihr {
    MUSIC_PLAYBACK_STATE_UNKNOWN(0),
    MUSIC_PLAYBACK_STATE_PLAYING(1),
    MUSIC_PLAYBACK_STATE_STOPPED(2),
    MUSIC_PLAYBACK_STATE_PAUSED(3);

    public final int e;

    antt(int i) {
        this.e = i;
    }

    public static antt a(int i) {
        if (i == 0) {
            return MUSIC_PLAYBACK_STATE_UNKNOWN;
        }
        if (i == 1) {
            return MUSIC_PLAYBACK_STATE_PLAYING;
        }
        if (i == 2) {
            return MUSIC_PLAYBACK_STATE_STOPPED;
        }
        if (i != 3) {
            return null;
        }
        return MUSIC_PLAYBACK_STATE_PAUSED;
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

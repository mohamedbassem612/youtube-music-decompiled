package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum audf implements aihr {
    MEDIA_ENGINE_PLAYER_STATE_UNKNOWN(0),
    MEDIA_ENGINE_PLAYER_STATE_IDLE(1),
    MEDIA_ENGINE_PLAYER_STATE_READY(2),
    MEDIA_ENGINE_PLAYER_STATE_BUFFERING(3),
    MEDIA_ENGINE_PLAYER_STATE_ENDED(4),
    MEDIA_ENGINE_PLAYER_STATE_ASLEEP(5);

    private final int h;

    audf(int i) {
        this.h = i;
    }

    public static audf a(int i) {
        if (i == 0) {
            return MEDIA_ENGINE_PLAYER_STATE_UNKNOWN;
        }
        if (i == 1) {
            return MEDIA_ENGINE_PLAYER_STATE_IDLE;
        }
        if (i == 2) {
            return MEDIA_ENGINE_PLAYER_STATE_READY;
        }
        if (i == 3) {
            return MEDIA_ENGINE_PLAYER_STATE_BUFFERING;
        }
        if (i == 4) {
            return MEDIA_ENGINE_PLAYER_STATE_ENDED;
        }
        if (i != 5) {
            return null;
        }
        return MEDIA_ENGINE_PLAYER_STATE_ASLEEP;
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

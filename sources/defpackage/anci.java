package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum anci implements aihr {
    MEDIA_ENGINE_PLAYER_STATE_UNKNOWN(0),
    MEDIA_ENGINE_PLAYER_STATE_IDLE(1),
    MEDIA_ENGINE_PLAYER_STATE_READY(2),
    MEDIA_ENGINE_PLAYER_STATE_BUFFERING(3),
    MEDIA_ENGINE_PLAYER_STATE_ENDED(4),
    MEDIA_ENGINE_PLAYER_STATE_ASLEEP(5);

    public final int g;

    anci(int i) {
        this.g = i;
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

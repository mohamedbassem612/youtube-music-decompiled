package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum asfk implements aihr {
    MUSIC_PLAYBACK_CONTENT_MODE_STATE_UNKNOWN(0),
    MUSIC_PLAYBACK_CONTENT_MODE_STATE_ACTIVE(1),
    MUSIC_PLAYBACK_CONTENT_MODE_STATE_DISABLED(2),
    UNRECOGNIZED(-1);

    private final int f;

    asfk(int i) {
        this.f = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this == UNRECOGNIZED ? aiif.a() : this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}

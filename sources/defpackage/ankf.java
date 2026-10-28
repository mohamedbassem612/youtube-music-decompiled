package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum ankf implements aihr {
    MUSIC_RELEASE_TYPE_UNKNOWN(0),
    MUSIC_RELEASE_TYPE_SINGLE(1),
    MUSIC_RELEASE_TYPE_EP(2),
    MUSIC_RELEASE_TYPE_ALBUM(3),
    MUSIC_RELEASE_TYPE_AUDIOBOOK(4),
    MUSIC_RELEASE_TYPE_AUDIODRAMA(5);

    public final int g;

    ankf(int i) {
        this.g = i;
    }

    public static ankf a(int i) {
        if (i == 0) {
            return MUSIC_RELEASE_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return MUSIC_RELEASE_TYPE_SINGLE;
        }
        if (i == 2) {
            return MUSIC_RELEASE_TYPE_EP;
        }
        if (i == 3) {
            return MUSIC_RELEASE_TYPE_ALBUM;
        }
        if (i == 4) {
            return MUSIC_RELEASE_TYPE_AUDIOBOOK;
        }
        if (i != 5) {
            return null;
        }
        return MUSIC_RELEASE_TYPE_AUDIODRAMA;
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

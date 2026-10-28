package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum audb implements aihr {
    MEDIA_ENGINE_CLIENT_UNKNOWN(0),
    MEDIA_ENGINE_CLIENT_SHORTS_EFFECT(1),
    MEDIA_ENGINE_CLIENT_XENO_IN_EDITOR(3),
    MEDIA_ENGINE_CLIENT_AUDIO(4),
    MEDIA_ENGINE_CLIENT_PRODUCER(2),
    MEDIA_ENGINE_CLIENT_SHORTS_CREATION(5),
    MEDIA_ENGINE_CLIENT_LIVE(6),
    MEDIA_ENGINE_CLIENT_IMAGE_EDITOR(7),
    MEDIA_ENGINE_CLIENT_IMAGE_EDITOR_ON_MUSIC(8);

    public final int j;

    audb(int i) {
        this.j = i;
    }

    public static audb a(int i) {
        switch (i) {
            case 0:
                return MEDIA_ENGINE_CLIENT_UNKNOWN;
            case 1:
                return MEDIA_ENGINE_CLIENT_SHORTS_EFFECT;
            case 2:
                return MEDIA_ENGINE_CLIENT_PRODUCER;
            case 3:
                return MEDIA_ENGINE_CLIENT_XENO_IN_EDITOR;
            case 4:
                return MEDIA_ENGINE_CLIENT_AUDIO;
            case 5:
                return MEDIA_ENGINE_CLIENT_SHORTS_CREATION;
            case 6:
                return MEDIA_ENGINE_CLIENT_LIVE;
            case 7:
                return MEDIA_ENGINE_CLIENT_IMAGE_EDITOR;
            case 8:
                return MEDIA_ENGINE_CLIENT_IMAGE_EDITOR_ON_MUSIC;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}

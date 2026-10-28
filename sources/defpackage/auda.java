package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum auda implements aihr {
    MEDIA_ENGINE_AUDIO_MIME_TYPE_UNKNOWN(0),
    MEDIA_ENGINE_AUDIO_MIME_TYPE_NONE(1),
    MEDIA_ENGINE_AUDIO_MIME_TYPE_MP4(2),
    MEDIA_ENGINE_AUDIO_MIME_TYPE_AAC(3);

    private final int f;

    auda(int i) {
        this.f = i;
    }

    public static auda a(int i) {
        if (i == 0) {
            return MEDIA_ENGINE_AUDIO_MIME_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return MEDIA_ENGINE_AUDIO_MIME_TYPE_NONE;
        }
        if (i == 2) {
            return MEDIA_ENGINE_AUDIO_MIME_TYPE_MP4;
        }
        if (i != 3) {
            return null;
        }
        return MEDIA_ENGINE_AUDIO_MIME_TYPE_AAC;
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

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum ance implements aihr {
    MEDIA_ENGINE_AUDIO_MIME_TYPE_UNKNOWN(0),
    MEDIA_ENGINE_AUDIO_MIME_TYPE_NONE(1),
    MEDIA_ENGINE_AUDIO_MIME_TYPE_MP4(2),
    MEDIA_ENGINE_AUDIO_MIME_TYPE_AAC(3);

    public final int e;

    ance(int i) {
        this.e = i;
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

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum ancj implements aihr {
    MEDIA_ENGINE_SEGMENT_TYPE_UNKNOWN(0),
    MEDIA_ENGINE_SEGMENT_TYPE_AUDIO(1),
    MEDIA_ENGINE_SEGMENT_TYPE_IMAGE(2),
    MEDIA_ENGINE_SEGMENT_TYPE_GRAPHICAL(3),
    MEDIA_ENGINE_SEGMENT_TYPE_SHAPE(4),
    MEDIA_ENGINE_SEGMENT_TYPE_SKOTTIE(5),
    MEDIA_ENGINE_SEGMENT_TYPE_TEXT(6),
    MEDIA_ENGINE_SEGMENT_TYPE_VIDEO(7),
    MEDIA_ENGINE_SEGMENT_TYPE_EMPTY(8);

    public final int j;

    ancj(int i) {
        this.j = i;
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

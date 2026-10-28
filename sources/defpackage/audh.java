package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum audh implements aihr {
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

    audh(int i) {
        this.j = i;
    }

    public static audh a(int i) {
        switch (i) {
            case 0:
                return MEDIA_ENGINE_SEGMENT_TYPE_UNKNOWN;
            case 1:
                return MEDIA_ENGINE_SEGMENT_TYPE_AUDIO;
            case 2:
                return MEDIA_ENGINE_SEGMENT_TYPE_IMAGE;
            case 3:
                return MEDIA_ENGINE_SEGMENT_TYPE_GRAPHICAL;
            case 4:
                return MEDIA_ENGINE_SEGMENT_TYPE_SHAPE;
            case 5:
                return MEDIA_ENGINE_SEGMENT_TYPE_SKOTTIE;
            case 6:
                return MEDIA_ENGINE_SEGMENT_TYPE_TEXT;
            case 7:
                return MEDIA_ENGINE_SEGMENT_TYPE_VIDEO;
            case 8:
                return MEDIA_ENGINE_SEGMENT_TYPE_EMPTY;
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

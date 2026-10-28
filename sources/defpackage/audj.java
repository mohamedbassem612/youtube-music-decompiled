package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum audj implements aihr {
    MEDIA_ENGINE_VIDEO_MIME_TYPE_UNKNOWN(0),
    MEDIA_ENGINE_VIDEO_MIME_TYPE_NONE(1),
    MEDIA_ENGINE_VIDEO_MIME_TYPE_H263(2),
    MEDIA_ENGINE_VIDEO_MIME_TYPE_H264(3),
    MEDIA_ENGINE_VIDEO_MIME_TYPE_H265(4),
    MEDIA_ENGINE_VIDEO_MIME_TYPE_VP9(5),
    MEDIA_ENGINE_VIDEO_MIME_TYPE_AV1(6);

    private final int i;

    audj(int i) {
        this.i = i;
    }

    public static audj a(int i) {
        switch (i) {
            case 0:
                return MEDIA_ENGINE_VIDEO_MIME_TYPE_UNKNOWN;
            case 1:
                return MEDIA_ENGINE_VIDEO_MIME_TYPE_NONE;
            case 2:
                return MEDIA_ENGINE_VIDEO_MIME_TYPE_H263;
            case 3:
                return MEDIA_ENGINE_VIDEO_MIME_TYPE_H264;
            case 4:
                return MEDIA_ENGINE_VIDEO_MIME_TYPE_H265;
            case 5:
                return MEDIA_ENGINE_VIDEO_MIME_TYPE_VP9;
            case 6:
                return MEDIA_ENGINE_VIDEO_MIME_TYPE_AV1;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}

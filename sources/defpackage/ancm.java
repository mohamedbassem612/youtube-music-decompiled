package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum ancm implements aihr {
    MEDIA_ENGINE_VIDEO_MIME_TYPE_UNKNOWN(0),
    MEDIA_ENGINE_VIDEO_MIME_TYPE_NONE(1),
    MEDIA_ENGINE_VIDEO_MIME_TYPE_H263(2),
    MEDIA_ENGINE_VIDEO_MIME_TYPE_H264(3),
    MEDIA_ENGINE_VIDEO_MIME_TYPE_H265(4),
    MEDIA_ENGINE_VIDEO_MIME_TYPE_VP9(5),
    MEDIA_ENGINE_VIDEO_MIME_TYPE_AV1(6);

    public final int h;

    ancm(int i2) {
        this.h = i2;
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

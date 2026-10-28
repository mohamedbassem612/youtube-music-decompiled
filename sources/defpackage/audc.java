package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum audc implements aihr {
    MEDIA_ENGINE_CLIENT_SURFACE_UNKNOWN(0),
    MEDIA_ENGINE_CLIENT_SURFACE_CAMERA(1),
    MEDIA_ENGINE_CLIENT_SURFACE_EDITOR(2),
    MEDIA_ENGINE_CLIENT_SURFACE_RECOMPOSITION(3),
    MEDIA_ENGINE_CLIENT_SURFACE_EXPORT_SESSION(4),
    MEDIA_ENGINE_CLIENT_SURFACE_UPLOAD_TRANSCODE(5),
    MEDIA_ENGINE_CLIENT_SURFACE_AUDIO_UPLOAD_TRANSCODE(6),
    MEDIA_ENGINE_CLIENT_SURFACE_CLIP_TRIM(7),
    MEDIA_ENGINE_CLIENT_SURFACE_DENOISE(8),
    MEDIA_ENGINE_CLIENT_SURFACE_MEDIAGEN(9),
    MEDIA_ENGINE_CLIENT_SURFACE_LICENSED_MUSIC_TRANSMUX(10),
    MEDIA_ENGINE_CLIENT_SURFACE_VIDEO_REVERSE(11),
    MEDIA_ENGINE_CLIENT_SURFACE_IMPORT(12),
    MEDIA_ENGINE_CLIENT_SURFACE_EDITOR_SAVE_TO_DEVICE(13),
    MEDIA_ENGINE_CLIENT_SURFACE_AI_MONTAGE_PREPROCESS(14);

    public final int p;

    audc(int i) {
        this.p = i;
    }

    public static audc a(int i) {
        switch (i) {
            case 0:
                return MEDIA_ENGINE_CLIENT_SURFACE_UNKNOWN;
            case 1:
                return MEDIA_ENGINE_CLIENT_SURFACE_CAMERA;
            case 2:
                return MEDIA_ENGINE_CLIENT_SURFACE_EDITOR;
            case 3:
                return MEDIA_ENGINE_CLIENT_SURFACE_RECOMPOSITION;
            case 4:
                return MEDIA_ENGINE_CLIENT_SURFACE_EXPORT_SESSION;
            case 5:
                return MEDIA_ENGINE_CLIENT_SURFACE_UPLOAD_TRANSCODE;
            case 6:
                return MEDIA_ENGINE_CLIENT_SURFACE_AUDIO_UPLOAD_TRANSCODE;
            case 7:
                return MEDIA_ENGINE_CLIENT_SURFACE_CLIP_TRIM;
            case 8:
                return MEDIA_ENGINE_CLIENT_SURFACE_DENOISE;
            case 9:
                return MEDIA_ENGINE_CLIENT_SURFACE_MEDIAGEN;
            case 10:
                return MEDIA_ENGINE_CLIENT_SURFACE_LICENSED_MUSIC_TRANSMUX;
            case 11:
                return MEDIA_ENGINE_CLIENT_SURFACE_VIDEO_REVERSE;
            case 12:
                return MEDIA_ENGINE_CLIENT_SURFACE_IMPORT;
            case 13:
                return MEDIA_ENGINE_CLIENT_SURFACE_EDITOR_SAVE_TO_DEVICE;
            case 14:
                return MEDIA_ENGINE_CLIENT_SURFACE_AI_MONTAGE_PREPROCESS;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.p);
    }
}

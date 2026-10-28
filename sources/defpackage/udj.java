package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class udj extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        audj audjVar = (audj) obj;
        switch (audjVar) {
            case MEDIA_ENGINE_VIDEO_MIME_TYPE_UNKNOWN:
                return ancm.MEDIA_ENGINE_VIDEO_MIME_TYPE_UNKNOWN;
            case MEDIA_ENGINE_VIDEO_MIME_TYPE_NONE:
                return ancm.MEDIA_ENGINE_VIDEO_MIME_TYPE_NONE;
            case MEDIA_ENGINE_VIDEO_MIME_TYPE_H263:
                return ancm.MEDIA_ENGINE_VIDEO_MIME_TYPE_H263;
            case MEDIA_ENGINE_VIDEO_MIME_TYPE_H264:
                return ancm.MEDIA_ENGINE_VIDEO_MIME_TYPE_H264;
            case MEDIA_ENGINE_VIDEO_MIME_TYPE_H265:
                return ancm.MEDIA_ENGINE_VIDEO_MIME_TYPE_H265;
            case MEDIA_ENGINE_VIDEO_MIME_TYPE_VP9:
                return ancm.MEDIA_ENGINE_VIDEO_MIME_TYPE_VP9;
            case MEDIA_ENGINE_VIDEO_MIME_TYPE_AV1:
                return ancm.MEDIA_ENGINE_VIDEO_MIME_TYPE_AV1;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(audjVar.toString()));
        }
    }
}

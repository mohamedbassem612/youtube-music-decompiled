package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class udh extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        audh audhVar = (audh) obj;
        switch (audhVar) {
            case MEDIA_ENGINE_SEGMENT_TYPE_UNKNOWN:
                return ancj.MEDIA_ENGINE_SEGMENT_TYPE_UNKNOWN;
            case MEDIA_ENGINE_SEGMENT_TYPE_AUDIO:
                return ancj.MEDIA_ENGINE_SEGMENT_TYPE_AUDIO;
            case MEDIA_ENGINE_SEGMENT_TYPE_IMAGE:
                return ancj.MEDIA_ENGINE_SEGMENT_TYPE_IMAGE;
            case MEDIA_ENGINE_SEGMENT_TYPE_GRAPHICAL:
                return ancj.MEDIA_ENGINE_SEGMENT_TYPE_GRAPHICAL;
            case MEDIA_ENGINE_SEGMENT_TYPE_SHAPE:
                return ancj.MEDIA_ENGINE_SEGMENT_TYPE_SHAPE;
            case MEDIA_ENGINE_SEGMENT_TYPE_SKOTTIE:
                return ancj.MEDIA_ENGINE_SEGMENT_TYPE_SKOTTIE;
            case MEDIA_ENGINE_SEGMENT_TYPE_TEXT:
                return ancj.MEDIA_ENGINE_SEGMENT_TYPE_TEXT;
            case MEDIA_ENGINE_SEGMENT_TYPE_VIDEO:
                return ancj.MEDIA_ENGINE_SEGMENT_TYPE_VIDEO;
            case MEDIA_ENGINE_SEGMENT_TYPE_EMPTY:
                return ancj.MEDIA_ENGINE_SEGMENT_TYPE_EMPTY;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(audhVar.toString()));
        }
    }
}

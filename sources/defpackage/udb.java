package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class udb extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        auda audaVar = (auda) obj;
        int iOrdinal = audaVar.ordinal();
        if (iOrdinal == 0) {
            return ance.MEDIA_ENGINE_AUDIO_MIME_TYPE_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return ance.MEDIA_ENGINE_AUDIO_MIME_TYPE_NONE;
        }
        if (iOrdinal == 2) {
            return ance.MEDIA_ENGINE_AUDIO_MIME_TYPE_MP4;
        }
        if (iOrdinal == 3) {
            return ance.MEDIA_ENGINE_AUDIO_MIME_TYPE_AAC;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(audaVar.toString()));
    }
}

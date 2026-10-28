package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class udf extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aude audeVar = (aude) obj;
        switch (audeVar) {
            case MEDIA_ENGINE_EXPORTER_STATE_UNKNOWN:
                return anch.MEDIA_ENGINE_EXPORTER_STATE_UNKNOWN;
            case MEDIA_ENGINE_EXPORTER_STATE_IDLE:
                return anch.MEDIA_ENGINE_EXPORTER_STATE_IDLE;
            case MEDIA_ENGINE_EXPORTER_STATE_PAUSED:
                return anch.MEDIA_ENGINE_EXPORTER_STATE_PAUSED;
            case MEDIA_ENGINE_EXPORTER_STATE_RUNNING:
                return anch.MEDIA_ENGINE_EXPORTER_STATE_RUNNING;
            case MEDIA_ENGINE_EXPORTER_STATE_CANCELLED:
                return anch.MEDIA_ENGINE_EXPORTER_STATE_CANCELLED;
            case MEDIA_ENGINE_EXPORTER_STATE_INITIATING_RETRY:
                return anch.MEDIA_ENGINE_EXPORTER_STATE_INITIATING_RETRY;
            case MEDIA_ENGINE_EXPORTER_STATE_FAILED:
                return anch.MEDIA_ENGINE_EXPORTER_STATE_FAILED;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(audeVar.toString()));
        }
    }
}

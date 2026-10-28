package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum aude implements aihr {
    MEDIA_ENGINE_EXPORTER_STATE_UNKNOWN(0),
    MEDIA_ENGINE_EXPORTER_STATE_IDLE(1),
    MEDIA_ENGINE_EXPORTER_STATE_PAUSED(2),
    MEDIA_ENGINE_EXPORTER_STATE_RUNNING(3),
    MEDIA_ENGINE_EXPORTER_STATE_CANCELLED(4),
    MEDIA_ENGINE_EXPORTER_STATE_INITIATING_RETRY(5),
    MEDIA_ENGINE_EXPORTER_STATE_FAILED(6);

    private final int i;

    aude(int i) {
        this.i = i;
    }

    public static aude a(int i) {
        switch (i) {
            case 0:
                return MEDIA_ENGINE_EXPORTER_STATE_UNKNOWN;
            case 1:
                return MEDIA_ENGINE_EXPORTER_STATE_IDLE;
            case 2:
                return MEDIA_ENGINE_EXPORTER_STATE_PAUSED;
            case 3:
                return MEDIA_ENGINE_EXPORTER_STATE_RUNNING;
            case 4:
                return MEDIA_ENGINE_EXPORTER_STATE_CANCELLED;
            case 5:
                return MEDIA_ENGINE_EXPORTER_STATE_INITIATING_RETRY;
            case 6:
                return MEDIA_ENGINE_EXPORTER_STATE_FAILED;
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

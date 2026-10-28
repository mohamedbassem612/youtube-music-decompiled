package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum anch implements aihr {
    MEDIA_ENGINE_EXPORTER_STATE_UNKNOWN(0),
    MEDIA_ENGINE_EXPORTER_STATE_IDLE(1),
    MEDIA_ENGINE_EXPORTER_STATE_PAUSED(2),
    MEDIA_ENGINE_EXPORTER_STATE_RUNNING(3),
    MEDIA_ENGINE_EXPORTER_STATE_CANCELLED(4),
    MEDIA_ENGINE_EXPORTER_STATE_INITIATING_RETRY(5),
    MEDIA_ENGINE_EXPORTER_STATE_FAILED(6);

    public final int h;

    anch(int i2) {
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

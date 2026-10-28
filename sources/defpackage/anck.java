package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum anck implements aihr {
    MEDIA_ENGINE_SERVICE_TYPE_UNKNOWN(0),
    MEDIA_ENGINE_SERVICE_TYPE_PLAYER(1),
    MEDIA_ENGINE_SERVICE_TYPE_EXPORTER(2),
    MEDIA_ENGINE_SERVICE_TYPE_COMPOSITOR(3),
    MEDIA_ENGINE_SERVICE_TYPE_STREAM_COMPOSITOR(4),
    MEDIA_ENGINE_SERVICE_TYPE_MEDIA_COMPOSITOR(5),
    MEDIA_ENGINE_SERVICE_TYPE_COMPOSITION_RUNTIME(6);

    public final int h;

    anck(int i2) {
        this.h = i2;
    }

    public static anck a(int i2) {
        switch (i2) {
            case 0:
                return MEDIA_ENGINE_SERVICE_TYPE_UNKNOWN;
            case 1:
                return MEDIA_ENGINE_SERVICE_TYPE_PLAYER;
            case 2:
                return MEDIA_ENGINE_SERVICE_TYPE_EXPORTER;
            case 3:
                return MEDIA_ENGINE_SERVICE_TYPE_COMPOSITOR;
            case 4:
                return MEDIA_ENGINE_SERVICE_TYPE_STREAM_COMPOSITOR;
            case 5:
                return MEDIA_ENGINE_SERVICE_TYPE_MEDIA_COMPOSITOR;
            case 6:
                return MEDIA_ENGINE_SERVICE_TYPE_COMPOSITION_RUNTIME;
            default:
                return null;
        }
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

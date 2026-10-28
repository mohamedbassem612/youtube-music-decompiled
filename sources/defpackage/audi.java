package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum audi implements aihr {
    MEDIA_ENGINE_TRANSMUXING_DECISION_UNSPECIFIED(0),
    MEDIA_ENGINE_TRANSMUXING_DECISION_NOT_ENCODE(1),
    MEDIA_ENGINE_TRANSMUXING_DECISION_TRANSCODE(2),
    MEDIA_ENGINE_TRANSMUXING_DECISION_TRANSMUX(3);

    private final int f;

    audi(int i) {
        this.f = i;
    }

    public static audi a(int i) {
        if (i == 0) {
            return MEDIA_ENGINE_TRANSMUXING_DECISION_UNSPECIFIED;
        }
        if (i == 1) {
            return MEDIA_ENGINE_TRANSMUXING_DECISION_NOT_ENCODE;
        }
        if (i == 2) {
            return MEDIA_ENGINE_TRANSMUXING_DECISION_TRANSCODE;
        }
        if (i != 3) {
            return null;
        }
        return MEDIA_ENGINE_TRANSMUXING_DECISION_TRANSMUX;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}

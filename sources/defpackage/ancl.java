package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum ancl implements aihr {
    MEDIA_ENGINE_TRANSMUXING_DECISION_UNSPECIFIED(0),
    MEDIA_ENGINE_TRANSMUXING_DECISION_NOT_ENCODE(1),
    MEDIA_ENGINE_TRANSMUXING_DECISION_TRANSCODE(2),
    MEDIA_ENGINE_TRANSMUXING_DECISION_TRANSMUX(3);

    public final int e;

    ancl(int i) {
        this.e = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum jrp implements aihr {
    ONESIE_REQUEST_TARGET_UNKNOWN(0),
    ONESIE_REQUEST_TARGET_ENCRYPTED_PLAYER_SERVICE(1),
    ONESIE_REQUEST_TARGET_ENCRYPTED_WATCH_SERVICE_DEPRECATED(2),
    ONESIE_REQUEST_TARGET_ENCRYPTED_WATCH_SERVICE(3),
    ONESIE_REQUEST_TARGET_INNERTUBE_ENCRYPTED_SERVICE(4);

    public final int f;

    jrp(int i) {
        this.f = i;
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

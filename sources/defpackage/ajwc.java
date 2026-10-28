package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum ajwc implements aihr {
    COLLECTION_REASON_UNKNOWN(0),
    COLLECTION_REASON_ONE_COLLECTION_RATE(1),
    COLLECTION_REASON_RANDOM(2),
    COLLECTION_REASON_COORDINATED(3),
    COLLECTION_REASON_DATA_TYPE_NOT_CONFIGURED(4);

    public final int f;

    ajwc(int i) {
        this.f = i;
    }

    public static ajwc a(int i) {
        if (i == 0) {
            return COLLECTION_REASON_UNKNOWN;
        }
        if (i == 1) {
            return COLLECTION_REASON_ONE_COLLECTION_RATE;
        }
        if (i == 2) {
            return COLLECTION_REASON_RANDOM;
        }
        if (i == 3) {
            return COLLECTION_REASON_COORDINATED;
        }
        if (i != 4) {
            return null;
        }
        return COLLECTION_REASON_DATA_TYPE_NOT_CONFIGURED;
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

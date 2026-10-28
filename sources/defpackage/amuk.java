package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum amuk implements aihr {
    LOGGING_QUEUE_TYPE_UNKNOWN(0),
    LOGGING_QUEUE_TYPE_PIXIE_DUST(1),
    LOGGING_QUEUE_TYPE_CACHE_METADATA(2);

    public final int d;

    amuk(int i) {
        this.d = i;
    }

    public static amuk a(int i) {
        if (i == 0) {
            return LOGGING_QUEUE_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return LOGGING_QUEUE_TYPE_PIXIE_DUST;
        }
        if (i != 2) {
            return null;
        }
        return LOGGING_QUEUE_TYPE_CACHE_METADATA;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}

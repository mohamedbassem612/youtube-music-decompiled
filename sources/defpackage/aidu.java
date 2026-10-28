package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum aidu implements aihr {
    DELETION_STATUS_UNKNOWN(0),
    ACTIVE(1),
    DELETED(2);

    public final int d;

    aidu(int i) {
        this.d = i;
    }

    public static aidu a(int i) {
        if (i == 0) {
            return DELETION_STATUS_UNKNOWN;
        }
        if (i == 1) {
            return ACTIVE;
        }
        if (i != 2) {
            return null;
        }
        return DELETED;
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

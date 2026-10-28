package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aobj implements aihr {
    EFFECTIVE_CONNECTION_TYPE_UNKNOWN(0),
    EFFECTIVE_CONNECTION_TYPE_OFFLINE(1),
    EFFECTIVE_CONNECTION_TYPE_SLOW_2G(2),
    EFFECTIVE_CONNECTION_TYPE_2G(3),
    EFFECTIVE_CONNECTION_TYPE_3G(4),
    EFFECTIVE_CONNECTION_TYPE_4G(5);

    public final int g;

    aobj(int i) {
        this.g = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}

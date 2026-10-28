package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aqij implements aihr {
    LOW_POWER_MODE_UNKNOWN(0),
    LOW_POWER_MODE_ENABLED(1),
    LOW_POWER_MODE_DISABLED(2);

    public final int d;

    aqij(int i) {
        this.d = i;
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

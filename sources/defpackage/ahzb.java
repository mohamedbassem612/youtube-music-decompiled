package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum ahzb implements aihr {
    APP_BLOCK_STATE_UNKNOWN(0),
    ALLOWED(1),
    BANNED(2);

    public final int d;

    ahzb(int i) {
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

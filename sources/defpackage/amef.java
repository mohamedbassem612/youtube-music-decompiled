package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum amef implements aihr {
    REEL_PERSISTENT_EDU_STATE_UNKNOWN(0),
    REEL_PERSISTENT_EDU_STATE_ENABLED(1),
    REEL_PERSISTENT_EDU_STATE_TEMPORARILY_DISABLED(2),
    REEL_PERSISTENT_EDU_STATE_PERMANENTLY_DISABLED(3);

    public final int e;

    amef(int i) {
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

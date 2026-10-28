package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum oil implements aihr {
    UNDEFINED(0),
    SHARED_PREFERENCES_ONLY(1),
    SHARED_PREFERENCES_AND_PROTOSTORE(2),
    PROTOSTORE_ONLY(3);

    private final int f;

    oil(int i) {
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

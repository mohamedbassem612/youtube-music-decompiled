package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum ailn implements aihr {
    UNKNOWN_STATE(0),
    EMPTY(1),
    GRANTED(2),
    DENIED(3),
    UNRECOGNIZED(-1);

    private final int g;

    ailn(int i) {
        this.g = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this == UNRECOGNIZED ? aiif.a() : this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum aidr implements aihr {
    DROP_LOCATION_UNSPECIFIED(0),
    DISPLAY(1),
    RECEIVE(2),
    UNRECOGNIZED(-1);

    private final int f;

    aidr(int i) {
        this.f = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this == UNRECOGNIZED ? aiif.a() : this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}

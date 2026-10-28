package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum arcv implements aihr {
    FONT_WIDTH_UNSPECIFIED(0),
    FONT_WIDTH_WIDTH(1),
    FONT_WIDTH_EXPANDED(2),
    UNRECOGNIZED(-1);

    private final int f;

    arcv(int i) {
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

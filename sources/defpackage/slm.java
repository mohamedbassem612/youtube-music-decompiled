package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum slm {
    PRE_ROLL(1, "Preroll"),
    MID_ROLL(2, "Midroll"),
    POST_ROLL(3, "Postroll"),
    PAUSE(4, "Pause");

    public final int e;
    private final String g;

    slm(int i, String str) {
        this.e = i;
        this.g = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.g;
    }
}

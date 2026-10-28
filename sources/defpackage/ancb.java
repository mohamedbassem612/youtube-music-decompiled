package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum ancb implements aihr {
    MDE_COLOR_RANGE_UNSPECIFIED(0),
    MDE_COLOR_RANGE_LIMITED(1),
    MDE_COLOR_RANGE_FULL(2);

    public final int d;

    ancb(int i) {
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

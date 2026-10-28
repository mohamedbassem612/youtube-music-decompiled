package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum aucx implements aihr {
    MDE_COLOR_RANGE_UNSPECIFIED(0),
    MDE_COLOR_RANGE_LIMITED(1),
    MDE_COLOR_RANGE_FULL(2);

    private final int e;

    aucx(int i) {
        this.e = i;
    }

    public static aucx a(int i) {
        if (i == 0) {
            return MDE_COLOR_RANGE_UNSPECIFIED;
        }
        if (i == 1) {
            return MDE_COLOR_RANGE_LIMITED;
        }
        if (i != 2) {
            return null;
        }
        return MDE_COLOR_RANGE_FULL;
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

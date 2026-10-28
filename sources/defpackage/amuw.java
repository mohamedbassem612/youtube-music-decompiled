package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum amuw implements aihr {
    MARKER_TYPE_UNSPECIFIED(0),
    MARKER_TYPE_TIMESTAMPS(1),
    MARKER_TYPE_CHAPTERS(2),
    MARKER_TYPE_HEATMAP(3);

    private final int f;

    amuw(int i) {
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

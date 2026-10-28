package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum arfo implements aihr {
    ALIGN_HORIZONTAL_UNSPECIFIED(0),
    ALIGN_HORIZONTAL_ALIGN_LEFT(1),
    ALIGN_HORIZONTAL_ALIGN_CENTER(2),
    ALIGN_HORIZONTAL_ALIGN_RIGHT(3);

    public final int e;

    arfo(int i) {
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

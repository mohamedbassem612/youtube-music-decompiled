package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum atrs implements aihr {
    TEXT_DECORATION_MODE_UNSPECIFIED(0),
    TEXT_DECORATION_MODE_THROUGH(1),
    TEXT_DECORATION_MODE_GAPS(2);

    public final int d;

    atrs(int i) {
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

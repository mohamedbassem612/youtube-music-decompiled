package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum auar implements aihr {
    LOCATION_STYLE_UNSPECIFIED(0),
    LOCATION_NORMAL(1),
    LOCATION_LIGHT(2);

    public final int d;

    auar(int i) {
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

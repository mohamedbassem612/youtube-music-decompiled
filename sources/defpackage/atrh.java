package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum atrh implements aihr {
    PAINT_STYLE_UNSPECIFIED(0),
    PAINT_STYLE_FILL(1),
    PAINT_STYLE_STROKE(2),
    PAINT_STYLE_STROKE_FILL(3);

    public final int e;

    atrh(int i) {
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

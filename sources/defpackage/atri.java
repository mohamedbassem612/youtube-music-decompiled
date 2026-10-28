package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum atri implements aihr {
    PAINT_STYLE_STROKE_JOIN_UNSPECIFIED(0),
    PAINT_STYLE_STROKE_JOIN_MITER(1),
    PAINT_STYLE_STROKE_JOIN_ROUND(2),
    PAINT_STYLE_STROKE_JOIN_BEVEL(3);

    public final int e;

    atri(int i) {
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

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum atqy implements aihr {
    FONT_STYLE_SLANT_UNSPECIFIED(0),
    FONT_STYLE_SLANT_UPRIGHT(1),
    FONT_STYLE_SLANT_ITALIC(2);

    public final int d;

    atqy(int i) {
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

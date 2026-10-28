package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum atra implements aihr {
    FONT_STYLE_WIDTH_UNSPECIFIED(0),
    FONT_STYLE_WIDTH_NORMAL(1),
    FONT_STYLE_WIDTH_EXPANDED(2),
    FONT_STYLE_WIDTH_ULTRA_CONDENSED(3),
    FONT_STYLE_WIDTH_EXTRA_CONDENSED(4),
    FONT_STYLE_WIDTH_CONDENSED(5),
    FONT_STYLE_WIDTH_SEMI_CONDENSED(6),
    FONT_STYLE_WIDTH_SEMI_EXPANDED(7),
    FONT_STYLE_WIDTH_EXTRA_EXPANDED(8),
    FONT_STYLE_WIDTH_ULTRA_EXPANDED(9);

    public final int k;

    atra(int i) {
        this.k = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}

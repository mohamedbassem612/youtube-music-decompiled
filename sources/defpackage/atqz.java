package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum atqz implements aihr {
    FONT_STYLE_WEIGHT_UNSPECIFIED(0),
    FONT_STYLE_WEIGHT_THIN(1),
    FONT_STYLE_WEIGHT_NORMAL(2),
    FONT_STYLE_WEIGHT_BOLD(3),
    FONT_STYLE_WEIGHT_EXTRA_LIGHT(4),
    FONT_STYLE_WEIGHT_LIGHT(5),
    FONT_STYLE_WEIGHT_MEDIUM(6),
    FONT_STYLE_WEIGHT_SEMI_BOLD(7),
    FONT_STYLE_WEIGHT_EXTRA_BOLD(8),
    FONT_STYLE_WEIGHT_BLACK(9);

    public final int k;

    atqz(int i) {
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

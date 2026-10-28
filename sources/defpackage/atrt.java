package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum atrt implements aihr {
    TEXT_DECORATION_STYLE_UNSPECIFIED(0),
    TEXT_DECORATION_STYLE_SOLID(1),
    TEXT_DECORATION_STYLE_DOUBLE(2),
    TEXT_DECORATION_STYLE_DOTTED(3),
    TEXT_DECORATION_STYLE_DASHED(4),
    TEXT_DECORATION_STYLE_WAVY(5);

    public final int g;

    atrt(int i) {
        this.g = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}

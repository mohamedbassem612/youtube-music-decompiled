package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum aqkn implements aihr {
    TEXT_FONT_SLANT_UNSPECIFIED(0),
    TEXT_FONT_SLANT_UPRIGHT(1),
    TEXT_FONT_SLANT_ITALIC(2),
    TEXT_FONT_SLANT_OBLIQUE(3);

    private final int f;

    aqkn(int i) {
        this.f = i;
    }

    public static aqkn a(int i) {
        if (i == 0) {
            return TEXT_FONT_SLANT_UNSPECIFIED;
        }
        if (i == 1) {
            return TEXT_FONT_SLANT_UPRIGHT;
        }
        if (i == 2) {
            return TEXT_FONT_SLANT_ITALIC;
        }
        if (i != 3) {
            return null;
        }
        return TEXT_FONT_SLANT_OBLIQUE;
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

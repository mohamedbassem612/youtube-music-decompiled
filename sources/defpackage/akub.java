package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum akub implements aihr {
    LANDSCAPE_PANEL_OPEN_STYLE_UNKNOWN(0),
    LANDSCAPE_PANEL_OPEN_STYLE_HORIZONTAL(1);

    private final int d;

    akub(int i) {
        this.d = i;
    }

    public static akub a(int i) {
        if (i == 0) {
            return LANDSCAPE_PANEL_OPEN_STYLE_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return LANDSCAPE_PANEL_OPEN_STYLE_HORIZONTAL;
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

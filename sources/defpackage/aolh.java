package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum aolh implements aihr {
    PANEL_EXPANDED_STYLE_UNKNOWN(0),
    PANEL_EXPANDED_STYLE_FULL_SCREEN(1),
    PANEL_EXPANDED_STYLE_WRAP_CONTENT(2);

    public final int d;

    aolh(int i) {
        this.d = i;
    }

    public static aolh a(int i) {
        if (i == 0) {
            return PANEL_EXPANDED_STYLE_UNKNOWN;
        }
        if (i == 1) {
            return PANEL_EXPANDED_STYLE_FULL_SCREEN;
        }
        if (i != 2) {
            return null;
        }
        return PANEL_EXPANDED_STYLE_WRAP_CONTENT;
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

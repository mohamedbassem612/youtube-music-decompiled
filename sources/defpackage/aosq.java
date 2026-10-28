package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum aosq implements aihr {
    UNKNOWN(0),
    STANDARD(1),
    FULLSCREEN(2),
    MINI(3),
    BACKGROUND(4);

    private final int g;

    aosq(int i) {
        this.g = i;
    }

    public static aosq a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return STANDARD;
        }
        if (i == 2) {
            return FULLSCREEN;
        }
        if (i == 3) {
            return MINI;
        }
        if (i != 4) {
            return null;
        }
        return BACKGROUND;
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

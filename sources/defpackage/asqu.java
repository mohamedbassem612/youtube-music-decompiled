package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum asqu implements aihr {
    HAPTIC_TYPE_UNKNOWN(0),
    HAPTIC_TYPE_LIGHT_IMPACT(1),
    HAPTIC_TYPE_MEDIUM_IMPACT(2),
    HAPTIC_TYPE_HEAVY_IMPACT(3),
    HAPTIC_TYPE_SELECTION_CLICK(4),
    HAPTIC_TYPE_SUCCESS(5);

    private final int h;

    asqu(int i) {
        this.h = i;
    }

    public static asqu a(int i) {
        if (i == 0) {
            return HAPTIC_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return HAPTIC_TYPE_LIGHT_IMPACT;
        }
        if (i == 2) {
            return HAPTIC_TYPE_MEDIUM_IMPACT;
        }
        if (i == 3) {
            return HAPTIC_TYPE_HEAVY_IMPACT;
        }
        if (i == 4) {
            return HAPTIC_TYPE_SELECTION_CLICK;
        }
        if (i != 5) {
            return null;
        }
        return HAPTIC_TYPE_SUCCESS;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}

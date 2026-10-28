package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public enum aopw implements aihr {
    UNKNOWN(0),
    OFF(1),
    ON(2),
    FORCED_ON(3),
    ON_WEAK(4),
    OFF_WEAK(5);

    private final int h;

    aopw(int i) {
        this.h = i;
    }

    public static aopw a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return OFF;
        }
        if (i == 2) {
            return ON;
        }
        if (i == 3) {
            return FORCED_ON;
        }
        if (i == 4) {
            return ON_WEAK;
        }
        if (i != 5) {
            return null;
        }
        return OFF_WEAK;
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

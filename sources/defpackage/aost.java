package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum aost implements aihr {
    UNKNOWN(0),
    NONE(1),
    SOME(2),
    ALL(3);

    private final int f;

    aost(int i) {
        this.f = i;
    }

    public static aost a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return NONE;
        }
        if (i == 2) {
            return SOME;
        }
        if (i != 3) {
            return null;
        }
        return ALL;
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

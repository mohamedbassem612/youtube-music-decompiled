package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum ahiu implements aihr {
    ML_DSA_UNKNOWN_INSTANCE(0),
    ML_DSA_65(1),
    ML_DSA_87(2),
    ML_DSA_44(3),
    UNRECOGNIZED(-1);

    private final int g;

    ahiu(int i) {
        this.g = i;
    }

    public static ahiu a(int i) {
        if (i == 0) {
            return ML_DSA_UNKNOWN_INSTANCE;
        }
        if (i == 1) {
            return ML_DSA_65;
        }
        if (i == 2) {
            return ML_DSA_87;
        }
        if (i != 3) {
            return null;
        }
        return ML_DSA_44;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this == UNRECOGNIZED ? aiif.a() : this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}

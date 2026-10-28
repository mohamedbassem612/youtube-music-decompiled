package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aoxz implements aihr {
    PREDICTOR_TYPE_UNKNOWN(0),
    PREDICTOR_TYPE_NEAREST_RANK(1),
    PREDICTOR_TYPE_POLYNOMIAL(3),
    PREDICTOR_TYPE_TFLITE(5);

    public final int e;

    aoxz(int i) {
        this.e = i;
    }

    public static aoxz a(int i) {
        if (i == 0) {
            return PREDICTOR_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return PREDICTOR_TYPE_NEAREST_RANK;
        }
        if (i == 3) {
            return PREDICTOR_TYPE_POLYNOMIAL;
        }
        if (i != 5) {
            return null;
        }
        return PREDICTOR_TYPE_TFLITE;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}

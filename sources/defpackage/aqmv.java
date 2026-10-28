package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum aqmv implements aihr {
    TIME_SENSITIVITY_UNKNOWN(0),
    TIME_SENSITIVITY_LATENCY_CRITICAL(1),
    TIME_SENSITIVITY_FINISH_SOON(2),
    TIME_SENSITIVITY_BACKGROUND(3);

    private final int f;

    aqmv(int i) {
        this.f = i;
    }

    public static aqmv a(int i) {
        if (i == 0) {
            return TIME_SENSITIVITY_UNKNOWN;
        }
        if (i == 1) {
            return TIME_SENSITIVITY_LATENCY_CRITICAL;
        }
        if (i == 2) {
            return TIME_SENSITIVITY_FINISH_SOON;
        }
        if (i != 3) {
            return null;
        }
        return TIME_SENSITIVITY_BACKGROUND;
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

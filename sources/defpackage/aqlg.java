package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aqlg implements aihr {
    ANDROID_THERMAL_STATUS_UNKNOWN(0),
    ANDROID_THERMAL_STATUS_NONE(1),
    ANDROID_THERMAL_STATUS_LIGHT(2),
    ANDROID_THERMAL_STATUS_MODERATE(3),
    ANDROID_THERMAL_STATUS_SEVERE(4),
    ANDROID_THERMAL_STATUS_CRITICAL(5),
    ANDROID_THERMAL_STATUS_EMERGENCY(6),
    ANDROID_THERMAL_STATUS_SHUTDOWN(7);

    public final int i;

    aqlg(int i) {
        this.i = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}

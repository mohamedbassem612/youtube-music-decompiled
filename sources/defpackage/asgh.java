package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum asgh implements aihr {
    CUE_RANGE_EVENT_TYPE_UNKNOWN(0),
    CUE_RANGE_EVENT_TYPE_ENTER(1),
    CUE_RANGE_EVENT_TYPE_EXIT(2);

    public final int d;

    asgh(int i) {
        this.d = i;
    }

    public static asgh a(int i) {
        if (i == 0) {
            return CUE_RANGE_EVENT_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return CUE_RANGE_EVENT_TYPE_ENTER;
        }
        if (i != 2) {
            return null;
        }
        return CUE_RANGE_EVENT_TYPE_EXIT;
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

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aqii implements aihr {
    UNKNOWN_EVENT_TAG(0),
    POST_INIT(1),
    PERIODIC(2);

    public final int d;

    aqii(int i) {
        this.d = i;
    }

    public static aqii a(int i) {
        if (i == 0) {
            return UNKNOWN_EVENT_TAG;
        }
        if (i == 1) {
            return POST_INIT;
        }
        if (i != 2) {
            return null;
        }
        return PERIODIC;
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

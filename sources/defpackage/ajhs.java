package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum ajhs implements aihr {
    AUTH_CASE_ENUMS_UNKNOWN(0),
    AUTH_CASE_ENUMS_CHILD_TO_PARENT_AUTH(1);

    private final int d;

    ajhs(int i) {
        this.d = i;
    }

    public static ajhs a(int i) {
        if (i == 0) {
            return AUTH_CASE_ENUMS_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return AUTH_CASE_ENUMS_CHILD_TO_PARENT_AUTH;
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

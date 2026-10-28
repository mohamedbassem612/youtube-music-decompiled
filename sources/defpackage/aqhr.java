package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum aqhr implements aihr {
    FETCH_BEHAVIOR_UNSPECIFIED(0),
    FETCH_BEHAVIOR_ONLY_IF_NEEDED(1),
    FETCH_BEHAVIOR_FORCE_FETCH(2);

    private final int e;

    aqhr(int i) {
        this.e = i;
    }

    public static aqhr a(int i) {
        if (i == 0) {
            return FETCH_BEHAVIOR_UNSPECIFIED;
        }
        if (i == 1) {
            return FETCH_BEHAVIOR_ONLY_IF_NEEDED;
        }
        if (i != 2) {
            return null;
        }
        return FETCH_BEHAVIOR_FORCE_FETCH;
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

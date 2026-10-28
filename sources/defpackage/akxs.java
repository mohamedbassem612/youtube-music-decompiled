package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum akxs implements aihr {
    FEATURE_AVAILABILITY_UNKNOWN(0),
    FEATURE_AVAILABILITY_ALLOWED(1),
    FEATURE_AVAILABILITY_BLOCKED(2),
    FEATURE_AVAILABILITY_MISSING_ENTITLEMENTS(3);

    private final int f;

    akxs(int i) {
        this.f = i;
    }

    public static akxs a(int i) {
        if (i == 0) {
            return FEATURE_AVAILABILITY_UNKNOWN;
        }
        if (i == 1) {
            return FEATURE_AVAILABILITY_ALLOWED;
        }
        if (i == 2) {
            return FEATURE_AVAILABILITY_BLOCKED;
        }
        if (i != 3) {
            return null;
        }
        return FEATURE_AVAILABILITY_MISSING_ENTITLEMENTS;
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

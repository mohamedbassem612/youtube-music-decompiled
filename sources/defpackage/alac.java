package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum alac implements aihr {
    FLOW_STATE_PASSING_SPEC_UNSPECIFIED(0),
    FLOW_STATE_PASSING_SPEC_DONT_PASS(1),
    FLOW_STATE_PASSING_SPEC_FULL_STATE(2);

    private final int e;

    alac(int i) {
        this.e = i;
    }

    public static alac a(int i) {
        if (i == 0) {
            return FLOW_STATE_PASSING_SPEC_UNSPECIFIED;
        }
        if (i == 1) {
            return FLOW_STATE_PASSING_SPEC_DONT_PASS;
        }
        if (i != 2) {
            return null;
        }
        return FLOW_STATE_PASSING_SPEC_FULL_STATE;
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

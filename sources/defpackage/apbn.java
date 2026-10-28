package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum apbn implements aihr {
    PROOF_OF_ORIGIN_TOKEN_SCOPE_UNKNOWN(0),
    PROOF_OF_ORIGIN_TOKEN_SCOPE_SESSION(1),
    PROOF_OF_ORIGIN_TOKEN_SCOPE_VIDEO(2);

    public final int d;

    apbn(int i) {
        this.d = i;
    }

    public static apbn a(int i) {
        if (i == 0) {
            return PROOF_OF_ORIGIN_TOKEN_SCOPE_UNKNOWN;
        }
        if (i == 1) {
            return PROOF_OF_ORIGIN_TOKEN_SCOPE_SESSION;
        }
        if (i != 2) {
            return null;
        }
        return PROOF_OF_ORIGIN_TOKEN_SCOPE_VIDEO;
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

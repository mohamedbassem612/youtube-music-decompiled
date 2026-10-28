package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum amzp implements aihr {
    MEDIA_BROWSER_ERROR_CODE_UNKNOWN(0),
    MEDIA_BROWSER_ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED(1);

    private final int d;

    amzp(int i) {
        this.d = i;
    }

    public static amzp a(int i) {
        if (i == 0) {
            return MEDIA_BROWSER_ERROR_CODE_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return MEDIA_BROWSER_ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED;
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

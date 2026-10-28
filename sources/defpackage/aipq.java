package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum aipq implements aihr {
    ABOUT_THIS_AD_CALLBACK_ACTION_UNSPECIFIED(0),
    CLOSE(1),
    SKIP_AD(2),
    SKIP_AD_ON_CLOSE(3);

    public final int e;

    aipq(int i) {
        this.e = i;
    }

    public static aipq a(int i) {
        if (i == 0) {
            return ABOUT_THIS_AD_CALLBACK_ACTION_UNSPECIFIED;
        }
        if (i == 1) {
            return CLOSE;
        }
        if (i == 2) {
            return SKIP_AD;
        }
        if (i != 3) {
            return null;
        }
        return SKIP_AD_ON_CLOSE;
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

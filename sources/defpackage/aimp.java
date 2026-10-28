package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aimp implements aihr {
    NOT_SET(0),
    IN_PROGRESS(1),
    SUCCESSFUL(2),
    FAILED(3);

    public final int e;

    aimp(int i) {
        this.e = i;
    }

    public static aimp a(int i) {
        if (i == 0) {
            return NOT_SET;
        }
        if (i == 1) {
            return IN_PROGRESS;
        }
        if (i == 2) {
            return SUCCESSFUL;
        }
        if (i != 3) {
            return null;
        }
        return FAILED;
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

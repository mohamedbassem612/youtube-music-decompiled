package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum ahzt implements aihr {
    EXTENSION_VIEW_UNSPECIFIED(0),
    IHNR(1),
    INSAT(2),
    TEMPORARY_MESSAGE(3);

    public final int e;

    ahzt(int i) {
        this.e = i;
    }

    public static ahzt a(int i) {
        if (i == 0) {
            return EXTENSION_VIEW_UNSPECIFIED;
        }
        if (i == 1) {
            return IHNR;
        }
        if (i == 2) {
            return INSAT;
        }
        if (i != 3) {
            return null;
        }
        return TEMPORARY_MESSAGE;
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

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aibp implements aihr {
    UNSPECIFIED(0),
    TRUE(1),
    FALSE(2);

    public final int d;

    aibp(int i) {
        this.d = i;
    }

    public static aibp a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return TRUE;
        }
        if (i != 2) {
            return null;
        }
        return FALSE;
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

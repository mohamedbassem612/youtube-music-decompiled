package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum amlg implements aihr {
    LIKE(0),
    DISLIKE(1),
    INDIFFERENT(2);

    public static final aihs d = new amlf(0);
    public final int e;

    amlg(int i) {
        this.e = i;
    }

    public static amlg a(int i) {
        if (i == 0) {
            return LIKE;
        }
        if (i == 1) {
            return DISLIKE;
        }
        if (i != 2) {
            return null;
        }
        return INDIFFERENT;
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

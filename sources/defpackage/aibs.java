package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aibs implements aihr {
    CHANNEL_GROUP_UNKNOWN(0),
    ALLOWED(1),
    BANNED(2);

    public final int d;

    aibs(int i) {
        this.d = i;
    }

    public static aibs a(int i) {
        if (i == 0) {
            return CHANNEL_GROUP_UNKNOWN;
        }
        if (i == 1) {
            return ALLOWED;
        }
        if (i != 2) {
            return null;
        }
        return BANNED;
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

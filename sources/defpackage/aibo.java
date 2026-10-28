package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aibo implements aihr {
    APP_BLOCK_STATE_UNKNOWN(0),
    ALLOWED(1),
    BANNED(2);

    public final int d;

    aibo(int i) {
        this.d = i;
    }

    public static aibo a(int i) {
        if (i == 0) {
            return APP_BLOCK_STATE_UNKNOWN;
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

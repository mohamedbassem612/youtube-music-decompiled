package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum aipb implements aihr {
    MINI_APP_STATE_UNSPECIFIED(0),
    MINI_APP_STATE_ROOT(1),
    MINI_APP_STATE_START(2),
    MINI_APP_STATE_END(3),
    MINI_APP_STATE_IN_FOCUS(4),
    MINI_APP_STATE_OUT_OF_FOCUS(5),
    MINI_APP_STATE_USER_ACTIVE(6),
    MINI_APP_STATE_USER_IDLE(7);

    private final int j;

    aipb(int i2) {
        this.j = i2;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}

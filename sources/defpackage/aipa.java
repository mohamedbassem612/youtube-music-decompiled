package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum aipa implements aihr {
    MINI_APP_EVENT_UNSPECIFIED(0),
    MINI_APP_EVENT_FOCUS_INTERRUPTION_ADDED(1),
    MINI_APP_EVENT_FOCUS_INTERRUPTION_REMOVED(2),
    MINI_APP_EVENT_FOCUS_INTERRUPTION_CHANGED(3),
    MINI_APP_EVENT_USER_INTERACTION(4),
    MINI_APP_EVENT_USER_IDLE(5),
    MINI_APP_EVENT_GAME_READY(6);

    private final int i;

    aipa(int i) {
        this.i = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}

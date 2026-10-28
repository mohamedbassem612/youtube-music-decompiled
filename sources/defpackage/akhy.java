package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum akhy implements aihr {
    CREATOR_GOAL_STATE_UNKNOWN(0),
    CREATOR_GOAL_STATE_INACTIVE(1),
    CREATOR_GOAL_STATE_INITIAL(2),
    CREATOR_GOAL_STATE_ACTIVE(3),
    CREATOR_GOAL_STATE_COMPLETE(4),
    CREATOR_GOAL_STATE_NOT_ACHIEVED(5),
    CREATOR_GOAL_STATE_CANCELED(6);

    private final int i;

    akhy(int i) {
        this.i = i;
    }

    public static akhy a(int i) {
        switch (i) {
            case 0:
                return CREATOR_GOAL_STATE_UNKNOWN;
            case 1:
                return CREATOR_GOAL_STATE_INACTIVE;
            case 2:
                return CREATOR_GOAL_STATE_INITIAL;
            case 3:
                return CREATOR_GOAL_STATE_ACTIVE;
            case 4:
                return CREATOR_GOAL_STATE_COMPLETE;
            case 5:
                return CREATOR_GOAL_STATE_NOT_ACHIEVED;
            case 6:
                return CREATOR_GOAL_STATE_CANCELED;
            default:
                return null;
        }
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

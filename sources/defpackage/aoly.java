package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum aoly implements aihr {
    PARTICIPANT_JOIN_STATE_UNKNOWN(0),
    PARTICIPANT_JOIN_STATE_PREJOIN(1),
    PARTICIPANT_JOIN_STATE_WAITING(2),
    PARTICIPANT_JOIN_STATE_REFUSED(3),
    PARTICIPANT_JOIN_STATE_APPROVED(4),
    PARTICIPANT_JOIN_STATE_PRE_CHANNEL_CREATION(5),
    PARTICIPANT_JOIN_STATE_SIGNED_OUT(6),
    PARTICIPANT_JOIN_STATE_WAITING_STATE_TIMEOUT(7),
    PARTICIPANT_JOIN_STATE_JOIN_STARTING_STATE_TIMEOUT(8),
    PARTICIPANT_JOIN_STATE_FULL_CONFERENCE(9),
    PARTICIPANT_JOIN_STATE_CONFERENCE_ENDED(10),
    PARTICIPANT_JOIN_STATE_ERROR(11),
    PARTICIPANT_JOIN_STATE_JOIN_PREPARING(12);

    public final int n;

    aoly(int i) {
        this.n = i;
    }

    public static aoly a(int i) {
        switch (i) {
            case 0:
                return PARTICIPANT_JOIN_STATE_UNKNOWN;
            case 1:
                return PARTICIPANT_JOIN_STATE_PREJOIN;
            case 2:
                return PARTICIPANT_JOIN_STATE_WAITING;
            case 3:
                return PARTICIPANT_JOIN_STATE_REFUSED;
            case 4:
                return PARTICIPANT_JOIN_STATE_APPROVED;
            case 5:
                return PARTICIPANT_JOIN_STATE_PRE_CHANNEL_CREATION;
            case 6:
                return PARTICIPANT_JOIN_STATE_SIGNED_OUT;
            case 7:
                return PARTICIPANT_JOIN_STATE_WAITING_STATE_TIMEOUT;
            case 8:
                return PARTICIPANT_JOIN_STATE_JOIN_STARTING_STATE_TIMEOUT;
            case 9:
                return PARTICIPANT_JOIN_STATE_FULL_CONFERENCE;
            case 10:
                return PARTICIPANT_JOIN_STATE_CONFERENCE_ENDED;
            case 11:
                return PARTICIPANT_JOIN_STATE_ERROR;
            case 12:
                return PARTICIPANT_JOIN_STATE_JOIN_PREPARING;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.n);
    }
}

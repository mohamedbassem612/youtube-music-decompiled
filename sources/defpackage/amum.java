package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum amum implements aihr {
    UNKNOWN(0),
    USER_AUTH(1),
    VISITOR_ID(2),
    PLUS_PAGE_ID(3),
    SPATULA_V1(4),
    SHERLOG_SESSION_ID(5),
    EOM_VISITOR_ID(6),
    ATTRIBUTION_REPORTING_ELIGIBLE(7),
    AUTH_USER(8),
    DATASYNC_ID(9),
    ROLLOUT_TOKEN(10),
    DELEGATED_CHILD(11);

    public final int m;

    amum(int i) {
        this.m = i;
    }

    public static amum a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return USER_AUTH;
            case 2:
                return VISITOR_ID;
            case 3:
                return PLUS_PAGE_ID;
            case 4:
                return SPATULA_V1;
            case 5:
                return SHERLOG_SESSION_ID;
            case 6:
                return EOM_VISITOR_ID;
            case 7:
                return ATTRIBUTION_REPORTING_ELIGIBLE;
            case 8:
                return AUTH_USER;
            case 9:
                return DATASYNC_ID;
            case 10:
                return ROLLOUT_TOKEN;
            case 11:
                return DELEGATED_CHILD;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}

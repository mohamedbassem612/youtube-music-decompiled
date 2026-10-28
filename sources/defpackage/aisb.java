package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aisb implements aihr {
    REGISTERED_GAIA_SERVICES_UNSPECIFIED(0),
    REGISTERED_GAIA_SERVICES_IS_UNICORN_CHILD_ACCOUNT(1),
    REGISTERED_GAIA_SERVICES_IS_UNICORN_OVER_13_IN_EU(2),
    REGISTERED_GAIA_SERVICES_IS_YOUTUBE_PERSONA(3),
    REGISTERED_GAIA_SERVICES_IS_MADISON_ACCOUNT(4),
    REGISTERED_GAIA_SERVICES_IS_YOUTUBE_CHANNEL_ACCOUNT(5),
    REGISTERED_GAIA_SERVICES_HAS_GRIFFIN_POLICY(6),
    UNRECOGNIZED(-1);

    private final int j;

    aisb(int i2) {
        this.j = i2;
    }

    public static aisb a(int i2) {
        switch (i2) {
            case 0:
                return REGISTERED_GAIA_SERVICES_UNSPECIFIED;
            case 1:
                return REGISTERED_GAIA_SERVICES_IS_UNICORN_CHILD_ACCOUNT;
            case 2:
                return REGISTERED_GAIA_SERVICES_IS_UNICORN_OVER_13_IN_EU;
            case 3:
                return REGISTERED_GAIA_SERVICES_IS_YOUTUBE_PERSONA;
            case 4:
                return REGISTERED_GAIA_SERVICES_IS_MADISON_ACCOUNT;
            case 5:
                return REGISTERED_GAIA_SERVICES_IS_YOUTUBE_CHANNEL_ACCOUNT;
            case 6:
                return REGISTERED_GAIA_SERVICES_HAS_GRIFFIN_POLICY;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this == UNRECOGNIZED ? aiif.a() : this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}

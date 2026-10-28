package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum ajps implements aihr {
    CHANNEL_CREATION_FLOW_STATE_UNSPECIFIED(0),
    CHANNEL_CREATION_FLOW_STATE_SAFETY_PAGE(1),
    CHANNEL_CREATION_FLOW_STATE_YOUTH_HANDLE_PAGE(2),
    CHANNEL_CREATION_FLOW_STATE_MAIN_PAGE(3),
    CHANNEL_CREATION_FLOW_STATE_PROFILE_PICTURE_PAGE(4),
    CHANNEL_CREATION_FLOW_STATE_PROFILE_PICTURE_SUMMARY_PAGE(5);

    private final int h;

    ajps(int i) {
        this.h = i;
    }

    public static ajps a(int i) {
        if (i == 0) {
            return CHANNEL_CREATION_FLOW_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return CHANNEL_CREATION_FLOW_STATE_SAFETY_PAGE;
        }
        if (i == 2) {
            return CHANNEL_CREATION_FLOW_STATE_YOUTH_HANDLE_PAGE;
        }
        if (i == 3) {
            return CHANNEL_CREATION_FLOW_STATE_MAIN_PAGE;
        }
        if (i == 4) {
            return CHANNEL_CREATION_FLOW_STATE_PROFILE_PICTURE_PAGE;
        }
        if (i != 5) {
            return null;
        }
        return CHANNEL_CREATION_FLOW_STATE_PROFILE_PICTURE_SUMMARY_PAGE;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aony implements aihr {
    OK(0),
    ERROR(1),
    UNPLAYABLE(2),
    LOGIN_REQUIRED(3),
    CONTENT_CHECK_REQUIRED(4),
    AGE_CHECK_REQUIRED(5),
    LIVE_STREAM_OFFLINE(6),
    FULLSCREEN_ONLY(7),
    GL_PLAYBACK_REQUIRED(8),
    AGE_VERIFICATION_REQUIRED(9);

    public final int k;

    aony(int i) {
        this.k = i;
    }

    public static aony a(int i) {
        switch (i) {
            case 0:
                return OK;
            case 1:
                return ERROR;
            case 2:
                return UNPLAYABLE;
            case 3:
                return LOGIN_REQUIRED;
            case 4:
                return CONTENT_CHECK_REQUIRED;
            case 5:
                return AGE_CHECK_REQUIRED;
            case 6:
                return LIVE_STREAM_OFFLINE;
            case 7:
                return FULLSCREEN_ONLY;
            case 8:
                return GL_PLAYBACK_REQUIRED;
            case 9:
                return AGE_VERIFICATION_REQUIRED;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public enum sgm {
    VIDEO_ENDED("1"),
    VIDEO_ERROR("2"),
    AD_VIDEO_TIMEOUT("2"),
    USER_SKIPPED("3"),
    USER_MUTED("4"),
    SURVEY_ENDED("5"),
    ENDCAP_ENDED("6"),
    AD_CHOICE_INTRO_ENDED("7"),
    AUTO_SKIPPED_ON_ENTER("8"),
    NO_AD("9");

    public final String k;

    sgm(String str) {
        this.k = str;
    }

    public static int a(sgm sgmVar) {
        switch (sgmVar) {
            case VIDEO_ENDED:
            case SURVEY_ENDED:
            case ENDCAP_ENDED:
            case AD_CHOICE_INTRO_ENDED:
                return 0;
            case VIDEO_ERROR:
            case AD_VIDEO_TIMEOUT:
            case NO_AD:
                return 1;
            case USER_SKIPPED:
            case AUTO_SKIPPED_ON_ENTER:
                return 2;
            case USER_MUTED:
                return 3;
            default:
                throw new RuntimeException(null, null);
        }
    }

    public static sgm b(int i) {
        if (i == 0) {
            return VIDEO_ENDED;
        }
        if (i == 1) {
            return VIDEO_ERROR;
        }
        if (i == 2) {
            return USER_SKIPPED;
        }
        if (i == 3) {
            return USER_MUTED;
        }
        throw new IllegalStateException();
    }
}

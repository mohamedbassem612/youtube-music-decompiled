package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum arfu implements aihr {
    VOLUME_TYPE_UNKNOWN(0),
    VOLUME_TYPE_ORIGINAL(1),
    VOLUME_TYPE_ADDED_MUSIC(2),
    VOLUME_TYPE_VOICEOVER(3),
    VOLUME_TYPE_GREEN_SCREEN(4),
    VOLUME_TYPE_VISUAL_REMIX(5),
    VOLUME_TYPE_TEXT_TO_SPEECH(6);

    public final int h;

    arfu(int i2) {
        this.h = i2;
    }

    public static arfu a(int i2) {
        switch (i2) {
            case 0:
                return VOLUME_TYPE_UNKNOWN;
            case 1:
                return VOLUME_TYPE_ORIGINAL;
            case 2:
                return VOLUME_TYPE_ADDED_MUSIC;
            case 3:
                return VOLUME_TYPE_VOICEOVER;
            case 4:
                return VOLUME_TYPE_GREEN_SCREEN;
            case 5:
                return VOLUME_TYPE_VISUAL_REMIX;
            case 6:
                return VOLUME_TYPE_TEXT_TO_SPEECH;
            default:
                return null;
        }
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

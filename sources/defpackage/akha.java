package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum akha implements aihr {
    CREATION_FEATURE_UNSPECIFIED(0),
    CREATION_FEATURE_EFFECTS_PICKER(1),
    CREATION_FEATURE_COLOR_FILTERS(2),
    CREATION_FEATURE_RETOUCH(3),
    CREATION_FEATURE_LIGHTING(4),
    CREATION_FEATURE_AUDIO_PICKER(5),
    CREATION_FEATURE_VIDEO_PICKER(6),
    CREATION_FEATURE_AI_PLAYGROUND(7),
    CREATION_FEATURE_COMMERCIAL_STICKER(8),
    CREATION_FEATURE_AUDIO(9);

    private final int l;

    akha(int i) {
        this.l = i;
    }

    public static akha a(int i) {
        switch (i) {
            case 0:
                return CREATION_FEATURE_UNSPECIFIED;
            case 1:
                return CREATION_FEATURE_EFFECTS_PICKER;
            case 2:
                return CREATION_FEATURE_COLOR_FILTERS;
            case 3:
                return CREATION_FEATURE_RETOUCH;
            case 4:
                return CREATION_FEATURE_LIGHTING;
            case 5:
                return CREATION_FEATURE_AUDIO_PICKER;
            case 6:
                return CREATION_FEATURE_VIDEO_PICKER;
            case 7:
                return CREATION_FEATURE_AI_PLAYGROUND;
            case 8:
                return CREATION_FEATURE_COMMERCIAL_STICKER;
            case 9:
                return CREATION_FEATURE_AUDIO;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}

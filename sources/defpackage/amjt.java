package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum amjt implements aihr {
    PLAYBACK_TYPE_UNKNOWN(0),
    PLAYBACK_TYPE_APPLICATION(1),
    PLAYBACK_TYPE_ADS(2),
    PLAYBACK_TYPE_REMOTE(3),
    PLAYBACK_TYPE_SECONDARY_CAMERA(4),
    PLAYBACK_TYPE_PREROLL_INTERSTITIAL(5),
    PLAYBACK_TYPE_POSTROLL_INTERSTITIAL(6),
    PLAYBACK_TYPE_MIDROLL_INTERSTITIAL(7);

    public final int i;

    amjt(int i) {
        this.i = i;
    }

    public static amjt a(int i) {
        switch (i) {
            case 0:
                return PLAYBACK_TYPE_UNKNOWN;
            case 1:
                return PLAYBACK_TYPE_APPLICATION;
            case 2:
                return PLAYBACK_TYPE_ADS;
            case 3:
                return PLAYBACK_TYPE_REMOTE;
            case 4:
                return PLAYBACK_TYPE_SECONDARY_CAMERA;
            case 5:
                return PLAYBACK_TYPE_PREROLL_INTERSTITIAL;
            case 6:
                return PLAYBACK_TYPE_POSTROLL_INTERSTITIAL;
            case 7:
                return PLAYBACK_TYPE_MIDROLL_INTERSTITIAL;
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

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum anzw implements aihr {
    MUSIC_VIDEO_TYPE_UNKNOWN(0),
    MUSIC_VIDEO_TYPE_ATV(1),
    MUSIC_VIDEO_TYPE_OMV(2),
    MUSIC_VIDEO_TYPE_UGC(3),
    MUSIC_VIDEO_TYPE_SHOULDER(4),
    MUSIC_VIDEO_TYPE_OFFICIAL_SOURCE_MUSIC(5),
    MUSIC_VIDEO_TYPE_PRIVATELY_OWNED_TRACK(6),
    MUSIC_VIDEO_TYPE_LIVE_STREAM(7),
    MUSIC_VIDEO_TYPE_PODCAST_EPISODE(8),
    MUSIC_VIDEO_TYPE_GATV(9);

    public final int k;

    anzw(int i) {
        this.k = i;
    }

    public static anzw a(int i) {
        switch (i) {
            case 0:
                return MUSIC_VIDEO_TYPE_UNKNOWN;
            case 1:
                return MUSIC_VIDEO_TYPE_ATV;
            case 2:
                return MUSIC_VIDEO_TYPE_OMV;
            case 3:
                return MUSIC_VIDEO_TYPE_UGC;
            case 4:
                return MUSIC_VIDEO_TYPE_SHOULDER;
            case 5:
                return MUSIC_VIDEO_TYPE_OFFICIAL_SOURCE_MUSIC;
            case 6:
                return MUSIC_VIDEO_TYPE_PRIVATELY_OWNED_TRACK;
            case 7:
                return MUSIC_VIDEO_TYPE_LIVE_STREAM;
            case 8:
                return MUSIC_VIDEO_TYPE_PODCAST_EPISODE;
            case 9:
                return MUSIC_VIDEO_TYPE_GATV;
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

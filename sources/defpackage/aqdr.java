package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aqdr implements aihr {
    STREAMING_WATCH_RESPONSE_TYPE_UNKNOWN(0),
    STREAMING_WATCH_RESPONSE_TYPE_PLAYER_RESPONSE(1),
    STREAMING_WATCH_RESPONSE_TYPE_WATCH_NEXT_RESPONSE(2),
    STREAMING_WATCH_RESPONSE_TYPE_AD_WATCH_NEXT_RESPONSE(4),
    STREAMING_WATCH_RESPONSE_TYPE_INCREMENTAL_WATCH_NEXT_RESPONSE(5),
    STREAMING_WATCH_RESPONSE_TYPE_ONESIE_EARLY_CONTENT_VIDEO_INFO(6),
    STREAMING_WATCH_RESPONSE_TYPE_ONESIE_EARLY_PREROLL_AD_VIDEO_INFO(7),
    STREAMING_WATCH_RESPONSE_TYPE_REEL_WATCH_PAGE_RESPONSE(8),
    STREAMING_WATCH_RESPONSE_TYPE_AD_WATCH_PAGE_RESPONSE(9);

    public final int j;

    aqdr(int i) {
        this.j = i;
    }

    public static aqdr a(int i) {
        switch (i) {
            case 0:
                return STREAMING_WATCH_RESPONSE_TYPE_UNKNOWN;
            case 1:
                return STREAMING_WATCH_RESPONSE_TYPE_PLAYER_RESPONSE;
            case 2:
                return STREAMING_WATCH_RESPONSE_TYPE_WATCH_NEXT_RESPONSE;
            case 3:
            default:
                return null;
            case 4:
                return STREAMING_WATCH_RESPONSE_TYPE_AD_WATCH_NEXT_RESPONSE;
            case 5:
                return STREAMING_WATCH_RESPONSE_TYPE_INCREMENTAL_WATCH_NEXT_RESPONSE;
            case 6:
                return STREAMING_WATCH_RESPONSE_TYPE_ONESIE_EARLY_CONTENT_VIDEO_INFO;
            case 7:
                return STREAMING_WATCH_RESPONSE_TYPE_ONESIE_EARLY_PREROLL_AD_VIDEO_INFO;
            case 8:
                return STREAMING_WATCH_RESPONSE_TYPE_REEL_WATCH_PAGE_RESPONSE;
            case 9:
                return STREAMING_WATCH_RESPONSE_TYPE_AD_WATCH_PAGE_RESPONSE;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}

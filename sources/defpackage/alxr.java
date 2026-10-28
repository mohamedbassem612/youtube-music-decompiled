package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum alxr implements aihr {
    SEARCH_PAGE_TYPE_UNKNOWN(0),
    SEARCH_PAGE_TYPE_MAIN_RESULTS(1),
    SEARCH_PAGE_TYPE_LANDING(2),
    SEARCH_PAGE_TYPE_SHORTS_VIDEO_PICKER(3),
    SEARCH_PAGE_TYPE_POSTS_AUDIO_PICKER(4),
    SEARCH_PAGE_TYPE_AI_SEARCH(5),
    SEARCH_PAGE_TYPE_VIDEO_GENERATION(6),
    SEARCH_PAGE_TYPE_UNPLUGGED_AI_SEARCH(7);

    public final int i;

    alxr(int i) {
        this.i = i;
    }

    public static alxr a(int i) {
        switch (i) {
            case 0:
                return SEARCH_PAGE_TYPE_UNKNOWN;
            case 1:
                return SEARCH_PAGE_TYPE_MAIN_RESULTS;
            case 2:
                return SEARCH_PAGE_TYPE_LANDING;
            case 3:
                return SEARCH_PAGE_TYPE_SHORTS_VIDEO_PICKER;
            case 4:
                return SEARCH_PAGE_TYPE_POSTS_AUDIO_PICKER;
            case 5:
                return SEARCH_PAGE_TYPE_AI_SEARCH;
            case 6:
                return SEARCH_PAGE_TYPE_VIDEO_GENERATION;
            case 7:
                return SEARCH_PAGE_TYPE_UNPLUGGED_AI_SEARCH;
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

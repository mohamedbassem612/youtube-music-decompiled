package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum aotg implements aihr {
    PAGE_SOURCE_UNKNOWN(0),
    PAGE_SOURCE_ADD_TO_PLAYLIST_PANEL(4),
    PAGE_SOURCE_PLAYLIST_SUGGESTIONS(1),
    PAGE_SOURCE_SHORTS_ADD_MUSIC(2),
    PAGE_SOURCE_YTM_PODCAST_UP_NEXT(3);

    private final int g;

    aotg(int i) {
        this.g = i;
    }

    public static aotg a(int i) {
        if (i == 0) {
            return PAGE_SOURCE_UNKNOWN;
        }
        if (i == 1) {
            return PAGE_SOURCE_PLAYLIST_SUGGESTIONS;
        }
        if (i == 2) {
            return PAGE_SOURCE_SHORTS_ADD_MUSIC;
        }
        if (i == 3) {
            return PAGE_SOURCE_YTM_PODCAST_UP_NEXT;
        }
        if (i != 4) {
            return null;
        }
        return PAGE_SOURCE_ADD_TO_PLAYLIST_PANEL;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}

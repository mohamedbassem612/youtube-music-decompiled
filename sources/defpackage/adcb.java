package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum adcb {
    BROWSE("browse_"),
    HOME("home_"),
    CHANNEL("channel_"),
    SEARCH("search_"),
    WATCH("watch_"),
    ENGAGEMENT("engagement_"),
    SUGGESTED_PLAYLIST("suggested_playlist_"),
    LIVE_CHAT("live_chat_"),
    SHORTS("shorts_"),
    OTHERS("others_"),
    MINI_APP_DESTINATION("mini_app_destination_"),
    MUSIC_LISTENING_REVIEW("music_listening_review_"),
    EVENT_DETAIL("event_detail_");

    public final String n;

    adcb(String str) {
        this.n = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.n;
    }
}

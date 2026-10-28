package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aixo implements aihr {
    SLOT_TYPE_UNSPECIFIED(0),
    SLOT_TYPE_PLAYER_BYTES(1),
    SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM(14),
    SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM_TRACKING(24),
    SLOT_TYPE_SEQUENCE_ITEM_IN_PLAYER(15),
    SLOT_TYPE_SEQUENCE_ITEM_PLAYER_UNDERLAY(20),
    SLOT_TYPE_SEQUENCE_ITEM_PLAYER_SIDE(21),
    SLOT_TYPE_SEQUENCE_ITEM_PLAYER_ORGANIC_OVERLAY(22),
    SLOT_TYPE_SEQUENCE_ITEM_AD_BREAK_REQUEST(29),
    SLOT_TYPE_SEQUENCE_ITEM_AD_SELECTION(30),
    SLOT_TYPE_BELOW_PLAYER(2),
    SLOT_TYPE_IN_PLAYER(3),
    SLOT_TYPE_FORECASTING(4),
    SLOT_TYPE_FULLSCREEN_ENGAGEMENT(5),
    SLOT_TYPE_ABOVE_FEED(6),
    SLOT_TYPE_LOCKSCREEN(7),
    SLOT_TYPE_FIXED_FOOTER(8),
    SLOT_TYPE_BELOW_PLAYER_IMMERSIVE(9),
    SLOT_TYPE_AD_BREAK_REQUEST(10),
    SLOT_TYPE_PLAYBACK_TRACKING(11),
    SLOT_TYPE_IN_FEED(12),
    SLOT_TYPE_PAGE_TOP(13),
    SLOT_TYPE_ADS_WATCH_NEXT_REQUEST(16),
    SLOT_TYPE_PLAYER_UNDERLAY(17),
    SLOT_TYPE_EXTERNAL_YT_APP_OVERLAY(18),
    SLOT_TYPE_CLIPS_INSERTION(19),
    SLOT_TYPE_IN_PLAYER_ORGANIC_OVERLAY(23),
    SLOT_TYPE_IN_FEED_INLINE_INJECTED(25),
    SLOT_TYPE_MINI_APP_PLAYER_BYTES(26),
    SLOT_TYPE_MINI_APP_IN_PLAYER(27),
    SLOT_TYPE_MINI_APP_PLAYER_UNDERLAY(28),
    SLOT_TYPE_BELOW_PLAYER_CONTROLS(31);

    public final int G;

    aixo(int i) {
        this.G = i;
    }

    public static aixo a(int i) {
        switch (i) {
            case 0:
                return SLOT_TYPE_UNSPECIFIED;
            case 1:
                return SLOT_TYPE_PLAYER_BYTES;
            case 2:
                return SLOT_TYPE_BELOW_PLAYER;
            case 3:
                return SLOT_TYPE_IN_PLAYER;
            case 4:
                return SLOT_TYPE_FORECASTING;
            case 5:
                return SLOT_TYPE_FULLSCREEN_ENGAGEMENT;
            case 6:
                return SLOT_TYPE_ABOVE_FEED;
            case 7:
                return SLOT_TYPE_LOCKSCREEN;
            case 8:
                return SLOT_TYPE_FIXED_FOOTER;
            case 9:
                return SLOT_TYPE_BELOW_PLAYER_IMMERSIVE;
            case 10:
                return SLOT_TYPE_AD_BREAK_REQUEST;
            case 11:
                return SLOT_TYPE_PLAYBACK_TRACKING;
            case 12:
                return SLOT_TYPE_IN_FEED;
            case 13:
                return SLOT_TYPE_PAGE_TOP;
            case 14:
                return SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM;
            case 15:
                return SLOT_TYPE_SEQUENCE_ITEM_IN_PLAYER;
            case 16:
                return SLOT_TYPE_ADS_WATCH_NEXT_REQUEST;
            case 17:
                return SLOT_TYPE_PLAYER_UNDERLAY;
            case 18:
                return SLOT_TYPE_EXTERNAL_YT_APP_OVERLAY;
            case 19:
                return SLOT_TYPE_CLIPS_INSERTION;
            case 20:
                return SLOT_TYPE_SEQUENCE_ITEM_PLAYER_UNDERLAY;
            case 21:
                return SLOT_TYPE_SEQUENCE_ITEM_PLAYER_SIDE;
            case 22:
                return SLOT_TYPE_SEQUENCE_ITEM_PLAYER_ORGANIC_OVERLAY;
            case 23:
                return SLOT_TYPE_IN_PLAYER_ORGANIC_OVERLAY;
            case 24:
                return SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM_TRACKING;
            case 25:
                return SLOT_TYPE_IN_FEED_INLINE_INJECTED;
            case 26:
                return SLOT_TYPE_MINI_APP_PLAYER_BYTES;
            case 27:
                return SLOT_TYPE_MINI_APP_IN_PLAYER;
            case 28:
                return SLOT_TYPE_MINI_APP_PLAYER_UNDERLAY;
            case 29:
                return SLOT_TYPE_SEQUENCE_ITEM_AD_BREAK_REQUEST;
            case 30:
                return SLOT_TYPE_SEQUENCE_ITEM_AD_SELECTION;
            case 31:
                return SLOT_TYPE_BELOW_PLAYER_CONTROLS;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.G;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.G);
    }
}

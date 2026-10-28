package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum akjh implements aihr {
    PLAYER_CUE_RANGE_SET_IDENTIFIER_UNKNOWN(0),
    PLAYER_CUE_RANGE_SET_IDENTIFIER_EMBARGO(1),
    PLAYER_CUE_RANGE_SET_IDENTIFIER_XPLAT_BLOCKS(2),
    PLAYER_CUE_RANGE_SET_IDENTIFIER_COURSE_COMPLETION(3),
    PLAYER_CUE_RANGE_SET_IDENTIFIER_WATCH_SEQUENCE(4),
    PLAYER_CUE_RANGE_SET_IDENTIFIER_WATCH_FEED_AUTOSCROLL(5),
    PLAYER_CUE_RANGE_SET_IDENTIFIER_LIKE_SMARTIMATIONS(6),
    PLAYER_CUE_RANGE_SET_IDENTIFIER_SUBSCRIBE_SMARTIMATIONS(7),
    PLAYER_CUE_RANGE_SET_IDENTIFIER_JOIN_SMARTIMATIONS(8),
    PLAYER_CUE_RANGE_SET_IDENTIFIER_PLAYER_OVERLAY(9),
    PLAYER_CUE_RANGE_SET_IDENTIFIER_TIMELY_SHELF(10),
    PLAYER_CUE_RANGE_SET_IDENTIFIER_SHOPPING_TIMELY_SHELF(16),
    PLAYER_CUE_RANGE_SET_IDENTIFIER_SHOPPING_TIMELY_SHELF_UNTIMED(17),
    PLAYER_CUE_RANGE_SET_IDENTIFIER_AUTOPLAY_TIMELY_SHELF(18),
    PLAYER_CUE_RANGE_SET_IDENTIFIER_AUTO_SPEED(11),
    PLAYER_CUE_RANGE_SET_IDENTIFIER_AIRING_METADATA_UPDATE(12),
    PLAYER_CUE_RANGE_SET_IDENTIFIER_STATION_AIRING_EMBARGO(13),
    PLAYER_CUE_RANGE_SET_IDENTIFIER_MARKETING_TRACKING(14),
    PLAYER_CUE_RANGE_SET_IDENTIFIER_READABLES(15);

    public final int t;

    akjh(int i) {
        this.t = i;
    }

    public static akjh a(int i) {
        switch (i) {
            case 0:
                return PLAYER_CUE_RANGE_SET_IDENTIFIER_UNKNOWN;
            case 1:
                return PLAYER_CUE_RANGE_SET_IDENTIFIER_EMBARGO;
            case 2:
                return PLAYER_CUE_RANGE_SET_IDENTIFIER_XPLAT_BLOCKS;
            case 3:
                return PLAYER_CUE_RANGE_SET_IDENTIFIER_COURSE_COMPLETION;
            case 4:
                return PLAYER_CUE_RANGE_SET_IDENTIFIER_WATCH_SEQUENCE;
            case 5:
                return PLAYER_CUE_RANGE_SET_IDENTIFIER_WATCH_FEED_AUTOSCROLL;
            case 6:
                return PLAYER_CUE_RANGE_SET_IDENTIFIER_LIKE_SMARTIMATIONS;
            case 7:
                return PLAYER_CUE_RANGE_SET_IDENTIFIER_SUBSCRIBE_SMARTIMATIONS;
            case 8:
                return PLAYER_CUE_RANGE_SET_IDENTIFIER_JOIN_SMARTIMATIONS;
            case 9:
                return PLAYER_CUE_RANGE_SET_IDENTIFIER_PLAYER_OVERLAY;
            case 10:
                return PLAYER_CUE_RANGE_SET_IDENTIFIER_TIMELY_SHELF;
            case 11:
                return PLAYER_CUE_RANGE_SET_IDENTIFIER_AUTO_SPEED;
            case 12:
                return PLAYER_CUE_RANGE_SET_IDENTIFIER_AIRING_METADATA_UPDATE;
            case 13:
                return PLAYER_CUE_RANGE_SET_IDENTIFIER_STATION_AIRING_EMBARGO;
            case 14:
                return PLAYER_CUE_RANGE_SET_IDENTIFIER_MARKETING_TRACKING;
            case 15:
                return PLAYER_CUE_RANGE_SET_IDENTIFIER_READABLES;
            case 16:
                return PLAYER_CUE_RANGE_SET_IDENTIFIER_SHOPPING_TIMELY_SHELF;
            case 17:
                return PLAYER_CUE_RANGE_SET_IDENTIFIER_SHOPPING_TIMELY_SHELF_UNTIMED;
            case 18:
                return PLAYER_CUE_RANGE_SET_IDENTIFIER_AUTOPLAY_TIMELY_SHELF;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.t;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.t);
    }
}

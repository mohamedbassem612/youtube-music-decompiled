package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum ajgq implements aihr {
    ENGAGEMENT_TYPE_UNKNOWN(0),
    ENGAGEMENT_TYPE_PLAYBACK(1),
    ENGAGEMENT_TYPE_SUBSCRIBE(2),
    ENGAGEMENT_TYPE_CREATOR_STUDIO_ACTION(3),
    ENGAGEMENT_TYPE_COMMENT_POST(5),
    ENGAGEMENT_TYPE_LIVESTREAM_REMINDER(7),
    ENGAGEMENT_TYPE_VIDEO_UPLOAD(8),
    ENGAGEMENT_TYPE_LIVE_CHAT_COMMENT(9),
    ENGAGEMENT_TYPE_UNBOUND(10),
    ENGAGEMENT_TYPE_PLAYLIST_CREATE(11),
    ENGAGEMENT_TYPE_PLAYLIST_EDIT(12),
    ENGAGEMENT_TYPE_PHONE_VERIFY(13),
    ENGAGEMENT_TYPE_PHONE_VERIFY_REQUEST_CODE(30),
    ENGAGEMENT_TYPE_VIDEO_METADATA_UPDATE(14),
    ENGAGEMENT_TYPE_POST_POLL_VOTE(15),
    ENGAGEMENT_TYPE_POST_LIKE(37),
    ENGAGEMENT_TYPE_POST_DISLIKE(38),
    ENGAGEMENT_TYPE_VIDEO_HYPE(40),
    ENGAGEMENT_TYPE_POST_PLAY(39),
    ENGAGEMENT_TYPE_VIDEO_LIKE(16),
    ENGAGEMENT_TYPE_VIDEO_DISLIKE(17),
    ENGAGEMENT_TYPE_CHANNEL_SETTINGS_UPDATE(18),
    ENGAGEMENT_TYPE_CREATOR_DELEGATES_UPDATE(19),
    ENGAGEMENT_TYPE_CREATOR_CHANGE_ADSENSE_ASSOCIATION(26),
    ENGAGEMENT_TYPE_ADVANCED_FEATURE_ENABLEMENT(27),
    ENGAGEMENT_TYPE_COMMENT_LIKE(28),
    ENGAGEMENT_TYPE_COMMENT_DISLIKE(29),
    ENGAGEMENT_TYPE_SHARE(31),
    ENGAGEMENT_TYPE_POST_CREATE(32),
    ENGAGEMENT_TYPE_CHANNEL_APPEAL_CREATE(34),
    ENGAGEMENT_TYPE_LIVE_STREAM_CREATE(35),
    ENGAGEMENT_TYPE_DIRECT_MESSAGE_SEND(36),
    ENGAGEMENT_TYPE_DIRECT_MESSAGE_INVITE(42),
    ENGAGEMENT_TYPE_YPC_GET_CART(20),
    ENGAGEMENT_TYPE_YPC_GET_OFFLINE_UPSELL(21),
    ENGAGEMENT_TYPE_YPC_GET_DOWNLOAD_ACTION(22),
    ENGAGEMENT_TYPE_YPC_HANDLE_TRANSACTION(23),
    ENGAGEMENT_TYPE_YPC_HANDLE_IAP(24),
    ENGAGEMENT_TYPE_YPC_GET_PREMIUM_PAGE(25),
    ENGAGEMENT_TYPE_VIDEO_TRANSCRIPT_REQUEST(33),
    ENGAGEMENT_TYPE_YPC_GET_PREMIUM_PANEL(43),
    ENGAGEMENT_TYPE_NATIVE_MOBILE_DEVICE_VERIFICATION(41),
    ENGAGEMENT_TYPE_INTEGRITY_GENERATION(44),
    ENGAGEMENT_TYPE_CHANNEL_FOLLOW(45),
    ENGAGEMENT_TYPE_ASK_SEARCH(46);

    public final int T;

    ajgq(int i) {
        this.T = i;
    }

    public static ajgq a(int i) {
        switch (i) {
            case 0:
                return ENGAGEMENT_TYPE_UNKNOWN;
            case 1:
                return ENGAGEMENT_TYPE_PLAYBACK;
            case 2:
                return ENGAGEMENT_TYPE_SUBSCRIBE;
            case 3:
                return ENGAGEMENT_TYPE_CREATOR_STUDIO_ACTION;
            case 4:
            case 6:
            default:
                return null;
            case 5:
                return ENGAGEMENT_TYPE_COMMENT_POST;
            case 7:
                return ENGAGEMENT_TYPE_LIVESTREAM_REMINDER;
            case 8:
                return ENGAGEMENT_TYPE_VIDEO_UPLOAD;
            case 9:
                return ENGAGEMENT_TYPE_LIVE_CHAT_COMMENT;
            case 10:
                return ENGAGEMENT_TYPE_UNBOUND;
            case 11:
                return ENGAGEMENT_TYPE_PLAYLIST_CREATE;
            case 12:
                return ENGAGEMENT_TYPE_PLAYLIST_EDIT;
            case 13:
                return ENGAGEMENT_TYPE_PHONE_VERIFY;
            case 14:
                return ENGAGEMENT_TYPE_VIDEO_METADATA_UPDATE;
            case 15:
                return ENGAGEMENT_TYPE_POST_POLL_VOTE;
            case 16:
                return ENGAGEMENT_TYPE_VIDEO_LIKE;
            case 17:
                return ENGAGEMENT_TYPE_VIDEO_DISLIKE;
            case 18:
                return ENGAGEMENT_TYPE_CHANNEL_SETTINGS_UPDATE;
            case 19:
                return ENGAGEMENT_TYPE_CREATOR_DELEGATES_UPDATE;
            case 20:
                return ENGAGEMENT_TYPE_YPC_GET_CART;
            case 21:
                return ENGAGEMENT_TYPE_YPC_GET_OFFLINE_UPSELL;
            case 22:
                return ENGAGEMENT_TYPE_YPC_GET_DOWNLOAD_ACTION;
            case 23:
                return ENGAGEMENT_TYPE_YPC_HANDLE_TRANSACTION;
            case 24:
                return ENGAGEMENT_TYPE_YPC_HANDLE_IAP;
            case 25:
                return ENGAGEMENT_TYPE_YPC_GET_PREMIUM_PAGE;
            case 26:
                return ENGAGEMENT_TYPE_CREATOR_CHANGE_ADSENSE_ASSOCIATION;
            case 27:
                return ENGAGEMENT_TYPE_ADVANCED_FEATURE_ENABLEMENT;
            case 28:
                return ENGAGEMENT_TYPE_COMMENT_LIKE;
            case 29:
                return ENGAGEMENT_TYPE_COMMENT_DISLIKE;
            case 30:
                return ENGAGEMENT_TYPE_PHONE_VERIFY_REQUEST_CODE;
            case 31:
                return ENGAGEMENT_TYPE_SHARE;
            case 32:
                return ENGAGEMENT_TYPE_POST_CREATE;
            case 33:
                return ENGAGEMENT_TYPE_VIDEO_TRANSCRIPT_REQUEST;
            case 34:
                return ENGAGEMENT_TYPE_CHANNEL_APPEAL_CREATE;
            case 35:
                return ENGAGEMENT_TYPE_LIVE_STREAM_CREATE;
            case 36:
                return ENGAGEMENT_TYPE_DIRECT_MESSAGE_SEND;
            case 37:
                return ENGAGEMENT_TYPE_POST_LIKE;
            case 38:
                return ENGAGEMENT_TYPE_POST_DISLIKE;
            case 39:
                return ENGAGEMENT_TYPE_POST_PLAY;
            case 40:
                return ENGAGEMENT_TYPE_VIDEO_HYPE;
            case 41:
                return ENGAGEMENT_TYPE_NATIVE_MOBILE_DEVICE_VERIFICATION;
            case 42:
                return ENGAGEMENT_TYPE_DIRECT_MESSAGE_INVITE;
            case 43:
                return ENGAGEMENT_TYPE_YPC_GET_PREMIUM_PANEL;
            case 44:
                return ENGAGEMENT_TYPE_INTEGRITY_GENERATION;
            case 45:
                return ENGAGEMENT_TYPE_CHANNEL_FOLLOW;
            case 46:
                return ENGAGEMENT_TYPE_ASK_SEARCH;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.T;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.T);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aotd implements aihr {
    ACTION_UNKNOWN(0),
    ACTION_ADD_PLAYLIST(38),
    ACTION_ADD_VIDEO(1),
    ACTION_REMOVE_VIDEO(2),
    ACTION_MOVE_VIDEO_BEFORE(3),
    ACTION_MOVE_VIDEO_AFTER(35),
    ACTION_SET_ANNOTATION(5),
    ACTION_SET_PLAYLIST_NAME(6),
    ACTION_SET_PLAYLIST_DESCRIPTION(7),
    ACTION_SET_PLAYLIST_THUMBNAIL(8),
    ACTION_SET_PLAYLIST_PRIVACY(9),
    ACTION_SET_PLAYLIST_VIDEO_ORDER(10),
    ACTION_SET_PLAYLIST_DYNAMIC_SORT_PREFERENCE(69),
    ACTION_COPY_FROM_PLAYLIST(11),
    ACTION_UNCOPY_FROM_PLAYLIST(19),
    ACTION_MOVE_VIDEO_TO_BEGINNING(12),
    ACTION_MOVE_VIDEO_TO_END(13),
    ACTION_REMOVE_WATCHED_VIDEOS(14),
    ACTION_SET_CUSTOM_THUMBNAIL(15),
    ACTION_REMOVE_CUSTOM_THUMBNAIL(16),
    ACTION_SET_MULTIPLE_CUSTOM_ARTWORK(58),
    ACTION_REMOVE_MULTIPLE_CUSTOM_ARTWORK(59),
    ACTION_REMOVE_CLEARED_OF_DELETED_VIDEOS(17),
    ACTION_REMOVE_VIDEO_BY_VIDEO_ID(18),
    ACTION_SET_ADD_TO_TOP(20),
    ACTION_SET_ALLOW_EMBED(21),
    ACTION_SET_IS_SERIES(22),
    ACTION_SET_IS_COURSE(39),
    ACTION_SET_TRANSLATION(25),
    ACTION_DELETE_TRANSLATION(26),
    ACTION_SET_ORIGINAL_LANGUAGE(27),
    ACTION_JOIN_COLLABORATION(28),
    ACTION_REVOKE_COLLABORATION_TOKENS(29),
    ACTION_SET_CLOSED_TO_CONTRIBUTIONS(31),
    ACTION_LEAVE_COLLABORATIVE_PLAYLIST(54),
    ACTION_REMOVE_PARTICIPANT_COLLABORATIVE_PLAYLIST(55),
    ACTION_CREATE_COLLABORATION_INVITE_LINK(32),
    ACTION_VIEW_PLAYLIST_LIST(33),
    ACTION_VIEW_PLAYLIST_DETAIL(34),
    ACTION_SET_DISPLAY_SEGMENTED(36),
    ACTION_SET_SEGMENT_START(37),
    ACTION_SET_MUSIC_INTENTS(40),
    ACTION_SEVER_LISTENING_REVIEW_PLAYLIST_FROM_WATCH_HISTORY(41),
    ACTION_SET_PODCAST_METADATA(42),
    ACTION_SET_COURSE_METADATA(43),
    ACTION_SET_SHOW_METADATA(56),
    ACTION_SET_EPISODIC_METADATA(57),
    ACTION_DISMISS_NOTIFICATION(44),
    ACTION_SET_RADIO_METADATA(45),
    ACTION_SET_ALLOW_ITEM_VOTE(46),
    ACTION_SET_ALLOW_COMMENT(65),
    ACTION_CLEAR_EPHEMERAL_STATUS(47),
    ACTION_CREATE_TASTE_MATCH_PLAYLIST_INVITATION_LINK(48),
    ACTION_REVOKE_TASTE_MATCH_PLAYLIST_INVITATION_TOKENS(49),
    ACTION_JOIN_TASTE_MATCH_PLAYLIST(50),
    ACTION_LEAVE_TASTE_MATCH_PLAYLIST(51),
    ACTION_REMOVE_PARTICIPANT_TASTE_MATCH_PLAYLIST(52),
    ACTION_SET_EPHEMERAL_STATUS(53),
    ACTION_INSERT_VIDEO_TO_SEGMENT(60),
    ACTION_INSERT_VIDEO_TO_NEW_SEGMENT(61),
    ACTION_ADD_PLAYLIST_AS_SEGMENT(62),
    ACTION_MOVE_VIDEO_TO_SEGMENT(63),
    ACTION_MOVE_VIDEO_TO_NEW_SEGMENT(64),
    ACTION_BULK_MOVE_VIDEOS_TO_SEGMENT(67),
    ACTION_BULK_MOVE_VIDEOS_TO_NEW_SEGMENT(68);

    public final int an;

    aotd(int i) {
        this.an = i;
    }

    public static aotd a(int i) {
        switch (i) {
            case 0:
                return ACTION_UNKNOWN;
            case 1:
                return ACTION_ADD_VIDEO;
            case 2:
                return ACTION_REMOVE_VIDEO;
            case 3:
                return ACTION_MOVE_VIDEO_BEFORE;
            case 4:
            case 23:
            case 24:
            case 30:
            case 66:
            default:
                return null;
            case 5:
                return ACTION_SET_ANNOTATION;
            case 6:
                return ACTION_SET_PLAYLIST_NAME;
            case 7:
                return ACTION_SET_PLAYLIST_DESCRIPTION;
            case 8:
                return ACTION_SET_PLAYLIST_THUMBNAIL;
            case 9:
                return ACTION_SET_PLAYLIST_PRIVACY;
            case 10:
                return ACTION_SET_PLAYLIST_VIDEO_ORDER;
            case 11:
                return ACTION_COPY_FROM_PLAYLIST;
            case 12:
                return ACTION_MOVE_VIDEO_TO_BEGINNING;
            case 13:
                return ACTION_MOVE_VIDEO_TO_END;
            case 14:
                return ACTION_REMOVE_WATCHED_VIDEOS;
            case 15:
                return ACTION_SET_CUSTOM_THUMBNAIL;
            case 16:
                return ACTION_REMOVE_CUSTOM_THUMBNAIL;
            case 17:
                return ACTION_REMOVE_CLEARED_OF_DELETED_VIDEOS;
            case 18:
                return ACTION_REMOVE_VIDEO_BY_VIDEO_ID;
            case 19:
                return ACTION_UNCOPY_FROM_PLAYLIST;
            case 20:
                return ACTION_SET_ADD_TO_TOP;
            case 21:
                return ACTION_SET_ALLOW_EMBED;
            case 22:
                return ACTION_SET_IS_SERIES;
            case 25:
                return ACTION_SET_TRANSLATION;
            case 26:
                return ACTION_DELETE_TRANSLATION;
            case 27:
                return ACTION_SET_ORIGINAL_LANGUAGE;
            case 28:
                return ACTION_JOIN_COLLABORATION;
            case 29:
                return ACTION_REVOKE_COLLABORATION_TOKENS;
            case 31:
                return ACTION_SET_CLOSED_TO_CONTRIBUTIONS;
            case 32:
                return ACTION_CREATE_COLLABORATION_INVITE_LINK;
            case 33:
                return ACTION_VIEW_PLAYLIST_LIST;
            case 34:
                return ACTION_VIEW_PLAYLIST_DETAIL;
            case 35:
                return ACTION_MOVE_VIDEO_AFTER;
            case 36:
                return ACTION_SET_DISPLAY_SEGMENTED;
            case 37:
                return ACTION_SET_SEGMENT_START;
            case 38:
                return ACTION_ADD_PLAYLIST;
            case 39:
                return ACTION_SET_IS_COURSE;
            case 40:
                return ACTION_SET_MUSIC_INTENTS;
            case 41:
                return ACTION_SEVER_LISTENING_REVIEW_PLAYLIST_FROM_WATCH_HISTORY;
            case 42:
                return ACTION_SET_PODCAST_METADATA;
            case 43:
                return ACTION_SET_COURSE_METADATA;
            case 44:
                return ACTION_DISMISS_NOTIFICATION;
            case 45:
                return ACTION_SET_RADIO_METADATA;
            case 46:
                return ACTION_SET_ALLOW_ITEM_VOTE;
            case 47:
                return ACTION_CLEAR_EPHEMERAL_STATUS;
            case 48:
                return ACTION_CREATE_TASTE_MATCH_PLAYLIST_INVITATION_LINK;
            case 49:
                return ACTION_REVOKE_TASTE_MATCH_PLAYLIST_INVITATION_TOKENS;
            case 50:
                return ACTION_JOIN_TASTE_MATCH_PLAYLIST;
            case 51:
                return ACTION_LEAVE_TASTE_MATCH_PLAYLIST;
            case 52:
                return ACTION_REMOVE_PARTICIPANT_TASTE_MATCH_PLAYLIST;
            case 53:
                return ACTION_SET_EPHEMERAL_STATUS;
            case 54:
                return ACTION_LEAVE_COLLABORATIVE_PLAYLIST;
            case 55:
                return ACTION_REMOVE_PARTICIPANT_COLLABORATIVE_PLAYLIST;
            case 56:
                return ACTION_SET_SHOW_METADATA;
            case 57:
                return ACTION_SET_EPISODIC_METADATA;
            case 58:
                return ACTION_SET_MULTIPLE_CUSTOM_ARTWORK;
            case 59:
                return ACTION_REMOVE_MULTIPLE_CUSTOM_ARTWORK;
            case 60:
                return ACTION_INSERT_VIDEO_TO_SEGMENT;
            case 61:
                return ACTION_INSERT_VIDEO_TO_NEW_SEGMENT;
            case 62:
                return ACTION_ADD_PLAYLIST_AS_SEGMENT;
            case 63:
                return ACTION_MOVE_VIDEO_TO_SEGMENT;
            case 64:
                return ACTION_MOVE_VIDEO_TO_NEW_SEGMENT;
            case 65:
                return ACTION_SET_ALLOW_COMMENT;
            case 67:
                return ACTION_BULK_MOVE_VIDEOS_TO_SEGMENT;
            case 68:
                return ACTION_BULK_MOVE_VIDEOS_TO_NEW_SEGMENT;
            case 69:
                return ACTION_SET_PLAYLIST_DYNAMIC_SORT_PREFERENCE;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.an;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.an);
    }
}

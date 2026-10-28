package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum appa implements aihr {
    SEEK_SOURCE_UNKNOWN(0),
    SEEK_SOURCE_TIMESTAMP_IN_COMMENTS(1),
    SEEK_SOURCE_TIMESTAMP_IN_DESCRIPTION(2),
    SEEK_SOURCE_MACRO_MARKER_LIST_ITEM(3),
    SEEK_SOURCE_DOUBLE_TAP_TO_SEEK(4),
    SEEK_SOURCE_DOUBLE_TAP_TO_SKIP_CHAPTER(5),
    SEEK_SOURCE_PICK_UP_PLAY_HEAD(6),
    SEEK_SOURCE_SLIDE_ON_SCRUBBER_BAR(7),
    SEEK_SOURCE_SLIDE_ON_PLAYER(8),
    SEEK_SOURCE_SABR_PARTIAL_CHUNK(9),
    SEEK_SOURCE_SABR_SEEK_TO_HEAD(10),
    SEEK_SOURCE_SABR_LIVE_DVR_USER_SEEK(11),
    SEEK_SOURCE_SABR_SEEK_TO_DVR_LOWER_BOUND(12),
    SEEK_SOURCE_SABR_SEEK_TO_DVR_UPPER_BOUND(13),
    SEEK_SOURCE_SSDAI_INTERNAL(14),
    SEEK_SOURCE_START_PLAYBACK(15),
    SEEK_SOURCE_SABR_ACCURATE_SEEK(17),
    SEEK_SOURCE_START_PLAYBACK_SEEK_TO_END(18),
    SEEK_SOURCE_IOS_PLAYER_REMOVED_SEGMENTS(19),
    SEEK_SOURCE_IOS_PLAYER_SEGMENT_LIST(20),
    SEEK_SOURCE_IOS_PLAYER_ITEM_SEEK(21),
    SEEK_SOURCE_IOS_PLAYER_ITEM_SEEK_TO_END(22),
    SEEK_SOURCE_IOS_PLAYER_SEEK_TO_END_TO_RESYNC(23),
    SEEK_SOURCE_IOS_SEEK_ACCESSIBILITY_BUTTON(24),
    SEEK_SOURCE_FINE_SCRUBBER_SLIDE_ON_FILMSTRIP(25),
    SEEK_SOURCE_FINE_SCRUBBER_TAP_ON_FILMSTRIP(26),
    SEEK_SOURCE_FINE_SCRUBBER_SLIDE_ON_SCRUBBER_BAR(27),
    SEEK_SOURCE_SEEK_BUTTON_ON_PLAYER_CONTROL(28),
    SEEK_SOURCE_SABR_INGESTION_WALL_TIME_SEEK(29),
    SEEK_SOURCE_PLAYER_VIEW_REPARENT_INTERNAL(30),
    SEEK_SOURCE_PRESS_REWIND_PLAY_BACK_CONTROL(31),
    SEEK_SOURCE_PRESS_FAST_FORWARD_PLAY_BACK_CONTROL(32),
    SEEK_SOURCE_PRESS_LIVE_SYNC_ICON(33),
    SEEK_SOURCE_PEG_TO_LIVE(34),
    SEEK_SOURCE_ANDROID_MEDIA_SESSION(35),
    SEEK_SOURCE_TAP_ON_REPLAY_ACTION(36),
    SEEK_SOURCE_AUTOMATIC_REPLAY_ACTION(37),
    SEEK_SOURCE_NON_USER_SEEK_TO_PREVIOUS(38),
    SEEK_SOURCE_NON_USER_SEEK_TO_NEXT(39),
    SEEK_SOURCE_HIGHLIGHTS_TAP_PREVIOUS_PLAY(66),
    SEEK_SOURCE_HIGHLIGHTS_TAP_NEXT_PLAY(40),
    SEEK_SOURCE_HIGHLIGHTS_TAP_HIDDEN_NEXT_PLAY(41),
    SEEK_SOURCE_HIGHLIGHTS_TAP_LIST_ITEM(42),
    SEEK_SOURCE_HIGHLIGHTS_AUTOMATIC_NEXT_PLAY(43),
    SEEK_SOURCE_HIGHLIGHTS_SEEK_TO_FIRST_PLAY(44),
    SEEK_SOURCE_HIGHLIGHTS_SEEK_TO_END(45),
    SEEK_SOURCE_SEGMENTS_TAP_LIST_ITEM(46),
    SEEK_SOURCE_PIP_FAST_FORWARD_BUTTON(47),
    SEEK_SOURCE_PIP_REWIND_BUTTON(48),
    SEEK_SOURCE_PIP_RESUME_ON_HEAD(49),
    SEEK_SOURCE_MOVING_CLIP_FRAME(50),
    SEEK_SOURCE_RESUME_CLIP_PREVIOUS_POSITION(51),
    SEEK_SOURCE_SEEK_TO_NEXT_CHAPTER(52),
    SEEK_SOURCE_SEEK_TO_PREVIOUS_CHAPTER(53),
    SEEK_SOURCE_IOS_SHAREPLAY_PAUSE(54),
    SEEK_SOURCE_IOS_SHAREPLAY_SEEK(55),
    SEEK_SOURCE_IOS_SHAREPLAY_SYNC_RESPONSE(56),
    SEEK_SOURCE_SEEK_TO_HEAD_IMMERSIVE_LIVE_VIDEO(57),
    SEEK_SOURCE_SEEK_TO_START_OF_LOOPING_RANGE_OF_SHORTS(58),
    SEEK_SOURCE_SABR_SEEK_TO_CLOSEST_KEYFRAME(59),
    SEEK_SOURCE_SEEK_TO_END_OF_LOOPING_RANGE_OF_SHORTS(60),
    SEEK_SOURCE_CLIP_SLIDE_ON_FLIMSTRIP(61),
    SEEK_SOURCE_PICK_UP_CLIP_SLIDER(62),
    SEEK_SOURCE_FINE_SCRUBBER_CANCELLED(63),
    SEEK_SOURCE_INLINE_PLAYER_SEEK_CHAPTER(64),
    SEEK_SOURCE_INLINE_PLAYER_SEEK_SECONDS(65),
    SEEK_SOURCE_HIGHLIGHTS_PLAYER_EXIT_FULLSCREEN(67),
    SEEK_SOURCE_LARGE_CONTROLS_FORWARD_BUTTON(68),
    SEEK_SOURCE_LARGE_CONTROLS_REWIND_BUTTON(69),
    SEEK_SOURCE_LARGE_CONTROLS_SCRUBBER_BAR(70),
    SEEK_SOURCE_SEEK_BACKWARD_5S(71),
    SEEK_SOURCE_SEEK_FORWARD_5S(72),
    SEEK_SOURCE_SEEK_BACKWARD_10S(73),
    SEEK_SOURCE_SEEK_FORWARD_10S(74),
    SEEK_SOURCE_SEEK_FORWARD_60S(75),
    SEEK_SOURCE_SEEK_BACKWARD_60S(76),
    SEEK_SOURCE_SEEK_TO_NEXT_FRAME(77),
    SEEK_SOURCE_SEEK_TO_PREV_FRAME(78),
    SEEK_SOURCE_KEYBOARD_SEEK_TO_BEGINNING(79),
    SEEK_SOURCE_KEYBOARD_SEEK_TO_END(80),
    SEEK_SOURCE_SEEK_PERCENT_OF_VIDEO(81),
    SEEK_SOURCE_HIDDEN_FAST_FORWARD_BUTTON(82),
    SEEK_SOURCE_HIDDEN_REWIND_BUTTON(83),
    SEEK_SOURCE_TIMESTAMP(84),
    SEEK_SOURCE_LR_MEDIA_SESSION_SEEK(87),
    SEEK_SOURCE_MIDROLLS_WITH_TIME_RANGE(88),
    SEEK_SOURCE_SKIP_AD(89),
    SEEK_SOURCE_SEEK_TO_PREVIOUS(90),
    SEEK_SOURCE_SEEK_TO_NEXT(91),
    SEEK_SOURCE_LR_QUICK_SEEK(92),
    SEEK_SOURCE_ONESIE_LIVE(93),
    SEEK_SOURCE_LR_PLAYER_CONTROL_ACTION(94),
    SEEK_SOURCE_UNPLUGGED_LENS_START_CLIP(95),
    SEEK_SOURCE_LR_KEY_PLAYS(96),
    SEEK_SOURCE_SSAP_AD_FMT_FATAL(97),
    SEEK_SOURCE_TVHTML5_INPUT_SOURCE_KEY_EVENT(98),
    SEEK_SOURCE_TVHTML5_INPUT_SOURCE_CONTROLS(99),
    SEEK_SOURCE_TVHTML5_INPUT_SOURCE_TOUCH(100),
    SEEK_SOURCE_TVHTML5_INPUT_SOURCE_TOUCHPAD(101),
    SEEK_SOURCE_SEEK_TO_HEAD(102),
    SEEK_SOURCE_AUTOMATIC_PREVIEW_REPLAY_ACTION(103),
    SEEK_SOURCE_H5_MEDIA_ELEMENT_EVENT(104),
    SEEK_SOURCE_H5_WORKAROUND_SEEK(105),
    SEEK_SOURCE_MINIPLAYER_REWIND_BUTTON(106),
    SEEK_SOURCE_MINIPLAYER_FAST_FORWARD_BUTTON(107),
    SEEK_SOURCE_SABR_RELOAD_PLAYER_RESPONSE_TOKEN_SEEK(108),
    SEEK_SOURCE_SLIDE_ON_SCRUBBER_BAR_CHAPTER(109),
    SEEK_SOURCE_ANDROID_CLEAR_BUFFER(110),
    SEEK_SOURCE_RESUME_AFTER_ADS(111),
    SEEK_SOURCE_TVHTML5_JUMP_AHEAD_SNAPPING(112),
    SEEK_SOURCE_TVHTML5_JUMP_AHEAD_OVERSEEK_SNAPPING(113),
    SEEK_SOURCE_SLIDE_ON_LARGE_CONTROLS_SCRUBBER(114),
    SEEK_SOURCE_ANDROID_LOAD_VIDEO_FRAME_IN_PAUSED_STATE_AFTER_BACKGROUND(115),
    SEEK_SOURCE_IOS_DISABLED_GAPLESS_RESUMPTION(116),
    SEEK_SOURCE_TVHTML5_JUMP_AHEAD_SNAPPING_DIBS(117),
    SEEK_SOURCE_IOS_SBAR_AUTOMATIC_FLUSH(118);

    public final int bm;

    appa(int i) {
        this.bm = i;
    }

    public static appa a(int i) {
        switch (i) {
            case 0:
                return SEEK_SOURCE_UNKNOWN;
            case 1:
                return SEEK_SOURCE_TIMESTAMP_IN_COMMENTS;
            case 2:
                return SEEK_SOURCE_TIMESTAMP_IN_DESCRIPTION;
            case 3:
                return SEEK_SOURCE_MACRO_MARKER_LIST_ITEM;
            case 4:
                return SEEK_SOURCE_DOUBLE_TAP_TO_SEEK;
            case 5:
                return SEEK_SOURCE_DOUBLE_TAP_TO_SKIP_CHAPTER;
            case 6:
                return SEEK_SOURCE_PICK_UP_PLAY_HEAD;
            case 7:
                return SEEK_SOURCE_SLIDE_ON_SCRUBBER_BAR;
            case 8:
                return SEEK_SOURCE_SLIDE_ON_PLAYER;
            case 9:
                return SEEK_SOURCE_SABR_PARTIAL_CHUNK;
            case 10:
                return SEEK_SOURCE_SABR_SEEK_TO_HEAD;
            case 11:
                return SEEK_SOURCE_SABR_LIVE_DVR_USER_SEEK;
            case 12:
                return SEEK_SOURCE_SABR_SEEK_TO_DVR_LOWER_BOUND;
            case 13:
                return SEEK_SOURCE_SABR_SEEK_TO_DVR_UPPER_BOUND;
            case 14:
                return SEEK_SOURCE_SSDAI_INTERNAL;
            case 15:
                return SEEK_SOURCE_START_PLAYBACK;
            case 16:
            case 85:
            case 86:
            default:
                return null;
            case 17:
                return SEEK_SOURCE_SABR_ACCURATE_SEEK;
            case 18:
                return SEEK_SOURCE_START_PLAYBACK_SEEK_TO_END;
            case 19:
                return SEEK_SOURCE_IOS_PLAYER_REMOVED_SEGMENTS;
            case 20:
                return SEEK_SOURCE_IOS_PLAYER_SEGMENT_LIST;
            case 21:
                return SEEK_SOURCE_IOS_PLAYER_ITEM_SEEK;
            case 22:
                return SEEK_SOURCE_IOS_PLAYER_ITEM_SEEK_TO_END;
            case 23:
                return SEEK_SOURCE_IOS_PLAYER_SEEK_TO_END_TO_RESYNC;
            case 24:
                return SEEK_SOURCE_IOS_SEEK_ACCESSIBILITY_BUTTON;
            case 25:
                return SEEK_SOURCE_FINE_SCRUBBER_SLIDE_ON_FILMSTRIP;
            case 26:
                return SEEK_SOURCE_FINE_SCRUBBER_TAP_ON_FILMSTRIP;
            case 27:
                return SEEK_SOURCE_FINE_SCRUBBER_SLIDE_ON_SCRUBBER_BAR;
            case 28:
                return SEEK_SOURCE_SEEK_BUTTON_ON_PLAYER_CONTROL;
            case 29:
                return SEEK_SOURCE_SABR_INGESTION_WALL_TIME_SEEK;
            case 30:
                return SEEK_SOURCE_PLAYER_VIEW_REPARENT_INTERNAL;
            case 31:
                return SEEK_SOURCE_PRESS_REWIND_PLAY_BACK_CONTROL;
            case 32:
                return SEEK_SOURCE_PRESS_FAST_FORWARD_PLAY_BACK_CONTROL;
            case 33:
                return SEEK_SOURCE_PRESS_LIVE_SYNC_ICON;
            case 34:
                return SEEK_SOURCE_PEG_TO_LIVE;
            case 35:
                return SEEK_SOURCE_ANDROID_MEDIA_SESSION;
            case 36:
                return SEEK_SOURCE_TAP_ON_REPLAY_ACTION;
            case 37:
                return SEEK_SOURCE_AUTOMATIC_REPLAY_ACTION;
            case 38:
                return SEEK_SOURCE_NON_USER_SEEK_TO_PREVIOUS;
            case 39:
                return SEEK_SOURCE_NON_USER_SEEK_TO_NEXT;
            case 40:
                return SEEK_SOURCE_HIGHLIGHTS_TAP_NEXT_PLAY;
            case 41:
                return SEEK_SOURCE_HIGHLIGHTS_TAP_HIDDEN_NEXT_PLAY;
            case 42:
                return SEEK_SOURCE_HIGHLIGHTS_TAP_LIST_ITEM;
            case 43:
                return SEEK_SOURCE_HIGHLIGHTS_AUTOMATIC_NEXT_PLAY;
            case 44:
                return SEEK_SOURCE_HIGHLIGHTS_SEEK_TO_FIRST_PLAY;
            case 45:
                return SEEK_SOURCE_HIGHLIGHTS_SEEK_TO_END;
            case 46:
                return SEEK_SOURCE_SEGMENTS_TAP_LIST_ITEM;
            case 47:
                return SEEK_SOURCE_PIP_FAST_FORWARD_BUTTON;
            case 48:
                return SEEK_SOURCE_PIP_REWIND_BUTTON;
            case 49:
                return SEEK_SOURCE_PIP_RESUME_ON_HEAD;
            case 50:
                return SEEK_SOURCE_MOVING_CLIP_FRAME;
            case 51:
                return SEEK_SOURCE_RESUME_CLIP_PREVIOUS_POSITION;
            case 52:
                return SEEK_SOURCE_SEEK_TO_NEXT_CHAPTER;
            case 53:
                return SEEK_SOURCE_SEEK_TO_PREVIOUS_CHAPTER;
            case 54:
                return SEEK_SOURCE_IOS_SHAREPLAY_PAUSE;
            case 55:
                return SEEK_SOURCE_IOS_SHAREPLAY_SEEK;
            case 56:
                return SEEK_SOURCE_IOS_SHAREPLAY_SYNC_RESPONSE;
            case 57:
                return SEEK_SOURCE_SEEK_TO_HEAD_IMMERSIVE_LIVE_VIDEO;
            case 58:
                return SEEK_SOURCE_SEEK_TO_START_OF_LOOPING_RANGE_OF_SHORTS;
            case 59:
                return SEEK_SOURCE_SABR_SEEK_TO_CLOSEST_KEYFRAME;
            case 60:
                return SEEK_SOURCE_SEEK_TO_END_OF_LOOPING_RANGE_OF_SHORTS;
            case 61:
                return SEEK_SOURCE_CLIP_SLIDE_ON_FLIMSTRIP;
            case 62:
                return SEEK_SOURCE_PICK_UP_CLIP_SLIDER;
            case 63:
                return SEEK_SOURCE_FINE_SCRUBBER_CANCELLED;
            case 64:
                return SEEK_SOURCE_INLINE_PLAYER_SEEK_CHAPTER;
            case 65:
                return SEEK_SOURCE_INLINE_PLAYER_SEEK_SECONDS;
            case 66:
                return SEEK_SOURCE_HIGHLIGHTS_TAP_PREVIOUS_PLAY;
            case 67:
                return SEEK_SOURCE_HIGHLIGHTS_PLAYER_EXIT_FULLSCREEN;
            case 68:
                return SEEK_SOURCE_LARGE_CONTROLS_FORWARD_BUTTON;
            case 69:
                return SEEK_SOURCE_LARGE_CONTROLS_REWIND_BUTTON;
            case 70:
                return SEEK_SOURCE_LARGE_CONTROLS_SCRUBBER_BAR;
            case 71:
                return SEEK_SOURCE_SEEK_BACKWARD_5S;
            case 72:
                return SEEK_SOURCE_SEEK_FORWARD_5S;
            case 73:
                return SEEK_SOURCE_SEEK_BACKWARD_10S;
            case 74:
                return SEEK_SOURCE_SEEK_FORWARD_10S;
            case 75:
                return SEEK_SOURCE_SEEK_FORWARD_60S;
            case 76:
                return SEEK_SOURCE_SEEK_BACKWARD_60S;
            case 77:
                return SEEK_SOURCE_SEEK_TO_NEXT_FRAME;
            case 78:
                return SEEK_SOURCE_SEEK_TO_PREV_FRAME;
            case 79:
                return SEEK_SOURCE_KEYBOARD_SEEK_TO_BEGINNING;
            case 80:
                return SEEK_SOURCE_KEYBOARD_SEEK_TO_END;
            case 81:
                return SEEK_SOURCE_SEEK_PERCENT_OF_VIDEO;
            case 82:
                return SEEK_SOURCE_HIDDEN_FAST_FORWARD_BUTTON;
            case 83:
                return SEEK_SOURCE_HIDDEN_REWIND_BUTTON;
            case 84:
                return SEEK_SOURCE_TIMESTAMP;
            case 87:
                return SEEK_SOURCE_LR_MEDIA_SESSION_SEEK;
            case 88:
                return SEEK_SOURCE_MIDROLLS_WITH_TIME_RANGE;
            case 89:
                return SEEK_SOURCE_SKIP_AD;
            case 90:
                return SEEK_SOURCE_SEEK_TO_PREVIOUS;
            case 91:
                return SEEK_SOURCE_SEEK_TO_NEXT;
            case 92:
                return SEEK_SOURCE_LR_QUICK_SEEK;
            case 93:
                return SEEK_SOURCE_ONESIE_LIVE;
            case 94:
                return SEEK_SOURCE_LR_PLAYER_CONTROL_ACTION;
            case 95:
                return SEEK_SOURCE_UNPLUGGED_LENS_START_CLIP;
            case 96:
                return SEEK_SOURCE_LR_KEY_PLAYS;
            case 97:
                return SEEK_SOURCE_SSAP_AD_FMT_FATAL;
            case 98:
                return SEEK_SOURCE_TVHTML5_INPUT_SOURCE_KEY_EVENT;
            case 99:
                return SEEK_SOURCE_TVHTML5_INPUT_SOURCE_CONTROLS;
            case 100:
                return SEEK_SOURCE_TVHTML5_INPUT_SOURCE_TOUCH;
            case 101:
                return SEEK_SOURCE_TVHTML5_INPUT_SOURCE_TOUCHPAD;
            case 102:
                return SEEK_SOURCE_SEEK_TO_HEAD;
            case 103:
                return SEEK_SOURCE_AUTOMATIC_PREVIEW_REPLAY_ACTION;
            case 104:
                return SEEK_SOURCE_H5_MEDIA_ELEMENT_EVENT;
            case 105:
                return SEEK_SOURCE_H5_WORKAROUND_SEEK;
            case 106:
                return SEEK_SOURCE_MINIPLAYER_REWIND_BUTTON;
            case 107:
                return SEEK_SOURCE_MINIPLAYER_FAST_FORWARD_BUTTON;
            case 108:
                return SEEK_SOURCE_SABR_RELOAD_PLAYER_RESPONSE_TOKEN_SEEK;
            case 109:
                return SEEK_SOURCE_SLIDE_ON_SCRUBBER_BAR_CHAPTER;
            case 110:
                return SEEK_SOURCE_ANDROID_CLEAR_BUFFER;
            case 111:
                return SEEK_SOURCE_RESUME_AFTER_ADS;
            case 112:
                return SEEK_SOURCE_TVHTML5_JUMP_AHEAD_SNAPPING;
            case 113:
                return SEEK_SOURCE_TVHTML5_JUMP_AHEAD_OVERSEEK_SNAPPING;
            case 114:
                return SEEK_SOURCE_SLIDE_ON_LARGE_CONTROLS_SCRUBBER;
            case 115:
                return SEEK_SOURCE_ANDROID_LOAD_VIDEO_FRAME_IN_PAUSED_STATE_AFTER_BACKGROUND;
            case 116:
                return SEEK_SOURCE_IOS_DISABLED_GAPLESS_RESUMPTION;
            case 117:
                return SEEK_SOURCE_TVHTML5_JUMP_AHEAD_SNAPPING_DIBS;
            case 118:
                return SEEK_SOURCE_IOS_SBAR_AUTOMATIC_FLUSH;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.bm;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.bm);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class aldc implements aiht {
    static final aiht a = new aldc();

    @Override // defpackage.aiht
    public final boolean isInRange(int i) {
        aldd alddVar;
        switch (i) {
            case 0:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_UNKNOWN;
                break;
            case 1:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_FOR_TESTING;
                break;
            case 2:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_RESUME_TO_HOME_TTL;
                break;
            case 3:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_START_TO_SHORTS_ANALYSIS_SLICE;
                break;
            case 4:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_DEVICE_LAYER_SLICE;
                break;
            case 5:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_UNIFIED_LAYER_SLICE;
                break;
            case 6:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_VISITOR_LAYER_SLICE;
                break;
            case 7:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_SHOW_SHEET_COMMAND_HANDLER_BLOCK;
                break;
            case 8:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_WIZ_NEXT_MIGRATED_COMPONENT;
                break;
            case 9:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_WIZ_NEXT_CHANNEL_NAME_TOOLTIP;
                break;
            case 10:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_ROTATION_LOCK_SUPPORTED;
                break;
            case 11:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_THEATER_MODE_ENABLED;
                break;
            case 12:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_WOULD_SHOW_PIN_SUGGESTION;
                break;
            case 13:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_WOULD_SHOW_LONG_PRESS_EDU_TOAST;
                break;
            case 14:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_WOULD_SHOW_AMBIENT;
                break;
            case 15:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_TIME_WATCHED_PANEL;
                break;
            case 16:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_SEARCH_FROM_SEARCH_BAR_OVERLAY;
                break;
            case 17:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_WOULD_SHOW_VOICE_SEARCH_EDU_TOAST;
                break;
            case 18:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_SUGGESTED_LANGUAGE_SELECTED;
                break;
            case 19:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_WOULD_TRIGGER_SHORTS_PIP;
                break;
            case 20:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_IN_ZP_VOICE_CRASHY_SET;
                break;
            case 21:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_REEL_FAST_SWIPE_SUPPRESSED;
                break;
            case 22:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_REEL_FAST_SWIPE_ALLOWED;
                break;
            case 23:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_REEL_PULL_TO_REFRESH_ATTEMPT;
                break;
            case 24:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_WOULD_BLOCK_KABUKI;
                break;
            case 25:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_REEL_TALL_SCREEN;
                break;
            case 26:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_REEL_NORMAL_SCREEN;
                break;
            case 27:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_ACCESSIBILITY_MODE_ENABLED;
                break;
            case 28:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_ACCESSIBILITY_MODE_DISABLED;
                break;
            case 29:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_AUTOPLAY_ENABLED;
                break;
            case 30:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_CAST_MATCH_OCCURRED;
                break;
            case 31:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_EMC3DS_ELIGIBLE;
                break;
            case 32:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_ENDSCREEN_TRIGGERED;
                break;
            case 33:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_POSTPLAY_TRIGGERED;
                break;
            case 34:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_POSTPLAY_LACT_THRESHOLD_EXCEEDED;
                break;
            case 35:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_IDENTITIES_STATE_MATCHED_ON_REMOTE_CONNECTION;
                break;
            case 36:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_IDENTITIES_STATE_SWITCHABLE_ON_REMOTE_CONNECTION;
                break;
            case 37:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_IDENTITIES_STATE_MISATTRIBUTED_ON_REMOTE_CONNECTION;
                break;
            case 38:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_IDENTITIES_TV_IS_SIGNED_IN_ON_REMOTE_CONNECTION;
                break;
            case 39:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_TV_START_TYPE_COLD_ON_REMOTE_CONNECTION;
                break;
            case 40:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_TV_START_TYPE_NON_COLD_ON_REMOTE_CONNECTION;
                break;
            case 41:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_ON_REMOTE_CONNECTION;
                break;
            case 42:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_COBALT_PERSISTENT_SETTINGS_TEST_VALID;
                break;
            case 43:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_COBALT_PERSISTENT_SETTINGS_TEST_INVALID;
                break;
            case 44:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_COBALT_PERSISTENT_SETTINGS_TEST_UNDEFINED;
                break;
            case 45:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_COBALT_PERSISTENT_SETTINGS_TEST_DEFINED;
                break;
            case 46:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_LACT_THRESHOLD_EXCEEDED;
                break;
            case 47:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_ROUND_TRIP_HANDLING_ON_REMOTE_CONNECTION;
                break;
            case 48:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_IDENTITIES_STATE_SWITCHED_ON_REMOTE_CONNECTION_BEFORE_APP_RELOAD;
                break;
            case 49:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_IDENTITIES_STATE_SWITCHED_ON_REMOTE_CONNECTION_AFTER_APP_RELOAD;
                break;
            case 50:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_EMC3DS_INELIGIBLE;
                break;
            case 51:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_TVHTML5_MID_ROLL_THRESHOLD_REACHED;
                break;
            case 52:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_EXP_COBALT_HTTP3_CONFIG_PENDING;
                break;
            case 53:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_EXP_COBALT_HTTP3_CONFIG_ACTIVATED;
                break;
            case 54:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_EMC3DS_M2_ELIGIBLE;
                break;
            case 55:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_ROTATE_DEVICE_TO_LANDSCAPE;
                break;
            case 56:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_ROTATE_DEVICE_TO_PORTRAIT;
                break;
            case 57:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_EMBEDS_FACEOFF_UI_EVENT;
                break;
            case 58:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_EXP_COBALT_HTTP3_CONFIG_RECEIVED;
                break;
            case 59:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_ELIGIBLE_TO_SUPPRESS_TRANSPORT_CONTROLS_BUTTONS;
                break;
            case 60:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_USER_HAS_THEATER_MODE_COOKIE_ENABLED;
                break;
            case 61:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_DOCUMENT_PICTURE_IN_PICTURE_SUPPORTED;
                break;
            case 62:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_SHORTS_NON_DEFAULT_ASPECT_RATIO;
                break;
            case 63:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_PLAYER_IN_SQUEEZEBACK;
                break;
            case 64:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_LIVE_CREATOR_AR_GIFT_RECEIVED;
                break;
            case 65:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_RETURNED_TO_VIDEO_AFTER_FAILED_ATTEMPT_TO_BACKGROUND;
                break;
            case 66:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_WOULD_ENTER_AUTO_ZOOM;
                break;
            case 67:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_PASSIVE_IN_CONTROL;
                break;
            case 68:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_PASSIVE_IN_TREATMENT;
                break;
            case 69:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_DISABLE_PLAYER_OPEN_ON_FULLSCREEN;
                break;
            case 70:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_MDX_RECONNECT_WITH_RETRY;
                break;
            case 71:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_SINGLE_COLUMN_GRID_TRIGGERED;
                break;
            case 72:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_MDX_CONNECTION_TIMEOUT;
                break;
            case 73:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_LIVE_GHOST_LOADING_ELIGIBLE;
                break;
            case 74:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_STREAMED_GET_WATCH_SUPPORTED;
                break;
            case 75:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_WEBVIEW_CONTAINER;
                break;
            case 76:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_WOULD_ENTER_PIP;
                break;
            case 77:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_PREMIUM_LITE_UPSELL_ELIGIBLE;
                break;
            case 78:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_OFFLINE_RECOVERY_BROAD;
                break;
            case 79:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_OFFLINE_RECOVERY_UNPLAYABLE;
                break;
            case 80:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_OFFLINE_RECOVERY_STRICT;
                break;
            case 81:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_IOS_SHORT_ORIENTATION_CHANGE;
                break;
            case 82:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_TVHTML5_PLAYER_ERROR_OVERLAY_TRIGGERED;
                break;
            case 83:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_SHADER_LIGHT_ENABLED;
                break;
            case 84:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_IDENTITY_MISMATCH_DETECTED;
                break;
            case 85:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_RESUME_TO_SHORTS_TRIGGERED;
                break;
            case 86:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_GRWS_CUSTOM_RETRY_CALLED;
                break;
            case 87:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_MDX_MOBILE_UNLOCK_TOKEN_MISMATCH;
                break;
            case 88:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_MDX_MOBILE_UNLOCK_PAYLOAD_TOKEN_MISSING;
                break;
            case 89:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_MDX_MOBILE_UNLOCK_GATE_TOKEN_MISSING;
                break;
            case 90:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_MUSIC_OFFLINE_HOME_SMART_DOWNLOADS_PROMO_CHECK;
                break;
            case 91:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_IPAD_DESKTOP_MATCH;
                break;
            case 92:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_SHADER_DIRECTIONAL_LIGHT_ENABLED;
                break;
            case 93:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_LR_APP_STARTUP_EVALUATED;
                break;
            case 94:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_LR_SHORTS_USER_EDU_ELIGIBLE;
                break;
            case 95:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_TERRARIUM_SUPPORTED;
                break;
            case 96:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_REEL_IP_PRUNING_V3_SWIPE_BACK10;
                break;
            case 97:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_REEL_IP_PRUNING_V3_SWIPE_BACK20;
                break;
            case 98:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_RESUME_TO_WATCH_TRIGGERED;
                break;
            case 99:
                alddVar = aldd.GENERIC_CLIENT_EXPERIMENT_EVENT_TYPE_RESUME_TO_VERTICALS_TRIGGERED;
                break;
            default:
                alddVar = null;
                break;
        }
        return alddVar != null;
    }
}

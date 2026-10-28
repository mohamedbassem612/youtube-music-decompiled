package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ahyx implements aiht {
    static final aiht a = new ahyx();

    @Override // defpackage.aiht
    public final boolean isInRange(int i) {
        ahyy ahyyVar;
        switch (i) {
            case 0:
                ahyyVar = ahyy.NOTIFICATION_FAILURE_UNSPECIFIED;
                break;
            case 1:
                ahyyVar = ahyy.BAD_CHANNEL;
                break;
            case 2:
                ahyyVar = ahyy.BAD_PAYLOAD;
                break;
            case 3:
                ahyyVar = ahyy.DROPPED_BY_CLIENT;
                break;
            case 4:
                ahyyVar = ahyy.INVALID_USER;
                break;
            case 5:
                ahyyVar = ahyy.SDK_DOES_NOT_SUPPORT;
                break;
            case 6:
                ahyyVar = ahyy.USER_BLOCKED;
                break;
            case 7:
                ahyyVar = ahyy.INSUFFICIENT_DATA_NO_TITLE;
                break;
            case 8:
                ahyyVar = ahyy.INSUFFICIENT_DATA_NO_TEXT;
                break;
            case 9:
                ahyyVar = ahyy.RECIPIENT_NOT_FOUND;
                break;
            case 10:
                ahyyVar = ahyy.RECIPIENT_NOT_REGISTERED;
                break;
            case 11:
                ahyyVar = ahyy.FAILED_TO_DOWNLOAD_IMAGE;
                break;
            case 12:
                ahyyVar = ahyy.FAILED_TO_FETCH_LATEST_NOTIFICATIONS;
                break;
            case 13:
                ahyyVar = ahyy.FAILED_TO_FETCH_UPDATED_NOTIFICATIONS;
                break;
            case 14:
                ahyyVar = ahyy.FAILED_TO_REGISTER;
                break;
            case 15:
                ahyyVar = ahyy.FAILED_TO_UNREGISTER;
                break;
            case 16:
                ahyyVar = ahyy.FAILED_TO_UPDATE_THREAD_STATE;
                break;
            case 17:
                ahyyVar = ahyy.FAILED_TO_UPDATE_THREAD_STATE_BY_TOKEN;
                break;
            case 18:
                ahyyVar = ahyy.FAILED_TO_SUBSCRIBE_TO_TOPICS;
                break;
            case 19:
                ahyyVar = ahyy.FAILED_TO_UNSUBSCRIBE_FROM_TOPICS;
                break;
            case 20:
                ahyyVar = ahyy.FAILED_TO_FETCH_PREFS;
                break;
            case 21:
                ahyyVar = ahyy.FAILED_TO_UPDATE_PREFS;
                break;
            case 22:
                ahyyVar = ahyy.FAILED_TO_ACKNOWLEDGE;
                break;
            case 23:
                ahyyVar = ahyy.FAILED_TO_GET_IID;
                break;
            case 24:
                ahyyVar = ahyy.INCONSISTENT_COUNT;
                break;
            case 25:
                ahyyVar = ahyy.RECIPIENT_INVALID_CREDENTIALS;
                break;
            case 26:
                ahyyVar = ahyy.UPSTREAM_TASK_TOO_BIG;
                break;
            case 27:
                ahyyVar = ahyy.UPSTREAM_UPDATE_THREAD_STATE_TASK_PARSE_ERROR;
                break;
            case 28:
                ahyyVar = ahyy.UPSTREAM_UNKNOWN_SEND_ERROR;
                break;
            case 29:
                ahyyVar = ahyy.UPSTREAM_INVALID_PARAMETERS;
                break;
            case 30:
                ahyyVar = ahyy.UPSTREAM_TOO_BIG;
                break;
            case 31:
                ahyyVar = ahyy.UPSTREAM_SENT_BUT_NOT_IN_TASK_TABLE;
                break;
            case 32:
                ahyyVar = ahyy.UPSTREAM_ZOMBIE_FOUND;
                break;
            case 33:
                ahyyVar = ahyy.UPSTREAM_TOO_MANY_PENDING_MESSAGES;
                break;
            case 34:
                ahyyVar = ahyy.CHANNEL_NOT_FOUND;
                break;
            case 35:
                ahyyVar = ahyy.CHANNEL_BLOCKED;
                break;
            case 36:
                ahyyVar = ahyy.FAILED_ACCOUNT_DATA_CLEANUP;
                break;
            case 37:
                ahyyVar = ahyy.FAILED_TO_FETCH_NOTIFICATIONS_BY_ID;
                break;
            case 38:
                ahyyVar = ahyy.FAILED_TO_FETCH_SUBSCRIPTIONS;
                break;
            case 39:
                ahyyVar = ahyy.FAILED_TO_FETCH_MULTI_USER_BADGE_COUNT;
                break;
            case 40:
                ahyyVar = ahyy.DATABASE_ERROR;
                break;
            case 41:
                ahyyVar = ahyy.DROPPED_BY_VERSION;
                break;
            case 42:
                ahyyVar = ahyy.MAX_NOTIFICATION_COUNT_REACHED;
                break;
            default:
                switch (i) {
                    case 51:
                        ahyyVar = ahyy.DROPPED_OLDER_THAN_FIRST_REGISTRATION;
                        break;
                    case 52:
                        ahyyVar = ahyy.FAILED_TO_APPLY_CUSTOMIZATION;
                        break;
                    case 53:
                        ahyyVar = ahyy.THREAD_ALREADY_DISMISSED;
                        break;
                    case 54:
                        ahyyVar = ahyy.FAILED_TO_REGISTER_LOCATION;
                        break;
                    case 55:
                        ahyyVar = ahyy.FAILED_TO_REGISTER_PUSHKIT;
                        break;
                    case 56:
                        ahyyVar = ahyy.FAILED_TO_COUNT_THREADS;
                        break;
                    case 57:
                        ahyyVar = ahyy.FAILED_TO_DECRYPT_PAYLOAD_FALLBACK_TO_PLACEHOLDER;
                        break;
                    case 58:
                        ahyyVar = ahyy.FAILED_TO_DECRYPT_PAYLOAD_NO_PLACEHOLDER;
                        break;
                    case 59:
                        ahyyVar = ahyy.FAILED_TO_UPDATE_ALL_THREAD_STATES;
                        break;
                    case 60:
                        ahyyVar = ahyy.FAILED_TO_DECOMPRESS_FALLBACK_TO_PLACEHOLDER;
                        break;
                    case 61:
                        ahyyVar = ahyy.FAILED_TO_DECOMPRESS;
                        break;
                    case 62:
                        ahyyVar = ahyy.FAILED_TO_REGISTER_LIVE_ACTIVITY;
                        break;
                    case 63:
                        ahyyVar = ahyy.FAILED_TO_REGISTER_OTHER_ACCOUNT;
                        break;
                    case 64:
                        ahyyVar = ahyy.FAILED_TO_POST_LOCAL_NOTIFICATION;
                        break;
                    case 65:
                        ahyyVar = ahyy.DROPPED_BY_STATE;
                        break;
                    case 66:
                        ahyyVar = ahyy.DROPPED_EXPIRED;
                        break;
                    case 67:
                        ahyyVar = ahyy.FAILED_TO_REGISTER_LIVE_ACTIVITY_PTS;
                        break;
                    case 68:
                        ahyyVar = ahyy.FAILED_TO_REGISTER_CONTROLS;
                        break;
                    case 69:
                        ahyyVar = ahyy.DROPPED_BY_OS;
                        break;
                    case 70:
                        ahyyVar = ahyy.INSUFFICIENT_DATA_NO_CONVERSATION_MESSAGES;
                        break;
                    case 71:
                        ahyyVar = ahyy.FAILED_TO_DOWNLOAD_ATTACHMENT;
                        break;
                    case 72:
                        ahyyVar = ahyy.FAILED_TO_NOTIFY_SELF;
                        break;
                    case 73:
                        ahyyVar = ahyy.DROPPED_NON_MATCHING_CLIENT_ID;
                        break;
                    case 74:
                        ahyyVar = ahyy.DROPPED_DATABASE_ERROR;
                        break;
                    default:
                        ahyyVar = null;
                        break;
                }
                break;
        }
        return ahyyVar != null;
    }
}

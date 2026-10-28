package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ahzu implements aiht {
    static final aiht a = new ahzu();

    @Override // defpackage.aiht
    public final boolean isInRange(int i) {
        ahzv ahzvVar;
        switch (i) {
            case 0:
                ahzvVar = ahzv.INTERACTION_TYPE_UNSPECIFIED;
                break;
            case 1:
                ahzvVar = ahzv.ACTION_CLICK;
                break;
            case 2:
                ahzvVar = ahzv.CLICKED;
                break;
            case 3:
            case 4:
            case 7:
            case 8:
            case 14:
            default:
                ahzvVar = null;
                break;
            case 5:
                ahzvVar = ahzv.DISMISSED;
                break;
            case 6:
                ahzvVar = ahzv.DISMISS_ALL;
                break;
            case 9:
                ahzvVar = ahzv.SHOWN;
                break;
            case 10:
                ahzvVar = ahzv.SHOWN_WITHOUT_IMAGE;
                break;
            case 11:
                ahzvVar = ahzv.DELIVERED;
                break;
            case 12:
                ahzvVar = ahzv.DELIVERED_SYNC_INSTRUCTION;
                break;
            case 13:
                ahzvVar = ahzv.DELIVERED_FULL_SYNC_INSTRUCTION;
                break;
            case 15:
                ahzvVar = ahzv.SUCCEED_TO_UPDATE_THREAD_STATE;
                break;
            case 16:
                ahzvVar = ahzv.SHOW_SKIPPED_DUE_TO_COUNTERFACTUAL;
                break;
            case 17:
                ahzvVar = ahzv.LOCAL_NOTIFICATION_CREATED;
                break;
            case 18:
                ahzvVar = ahzv.EXPIRED;
                break;
            case 19:
                ahzvVar = ahzv.UNSHOWN;
                break;
            case 20:
                ahzvVar = ahzv.FETCHED_LATEST_THREADS;
                break;
            case 21:
                ahzvVar = ahzv.FETCHED_UPDATED_THREADS;
                break;
            case 22:
                ahzvVar = ahzv.LOCAL_NOTIFICATION_UPDATED;
                break;
            case 23:
                ahzvVar = ahzv.DELIVERED_UPDATE_THREAD_INSTRUCTION;
                break;
            case 24:
                ahzvVar = ahzv.APP_BLOCK_STATE_CHANGED;
                break;
            case 25:
                ahzvVar = ahzv.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED;
                break;
            case 26:
                ahzvVar = ahzv.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED;
                break;
            case 27:
                ahzvVar = ahzv.PERIODIC_LOG;
                break;
            case 28:
                ahzvVar = ahzv.SHOWN_REPLACED;
                break;
            case 29:
                ahzvVar = ahzv.SHOWN_FORCED;
                break;
            case 30:
                ahzvVar = ahzv.DISMISSED_REMOTE;
                break;
            case 31:
                ahzvVar = ahzv.ACCOUNT_DATA_CLEANED;
                break;
            case 32:
                ahzvVar = ahzv.TARGET_REGISTERED;
                break;
            case 33:
                ahzvVar = ahzv.DELIVERED_FCM_PUSH;
                break;
            case 34:
                ahzvVar = ahzv.ADDED_TO_STORAGE;
                break;
            case 35:
                ahzvVar = ahzv.DISMISSED_BY_API;
                break;
            case 36:
                ahzvVar = ahzv.REPLACED_IN_STORAGE;
                break;
            case 37:
                ahzvVar = ahzv.REMOVED_FROM_STORAGE;
                break;
            case 38:
                ahzvVar = ahzv.FETCHED_MULTI_USER_BADGE_COUNT;
                break;
            case 39:
                ahzvVar = ahzv.CLICK_DURATION_CLICK_OPENED_APP;
                break;
            case 40:
                ahzvVar = ahzv.CLICK_DURATION_CLICK_WHILE_OPEN;
                break;
            case 41:
                ahzvVar = ahzv.REMOVED;
                break;
            case 42:
                ahzvVar = ahzv.FETCHED_THREADS_BY_ID;
                break;
            case 43:
                ahzvVar = ahzv.DELIVERED_REMOVE_STORAGE_INSTRUCTION;
                break;
            case 44:
                ahzvVar = ahzv.NOTIFICATION_DATA_CLEANED;
                break;
            case 45:
                ahzvVar = ahzv.DELIVERED_SILENT_NOTIFICATION;
                break;
            case 46:
                ahzvVar = ahzv.LOCATION_TARGET_REGISTERED;
                break;
            case 47:
                ahzvVar = ahzv.VOIP_TARGET_REGISTERED;
                break;
            case 48:
                ahzvVar = ahzv.DSC_POSTPONED;
                break;
            case 49:
                ahzvVar = ahzv.LIVE_ACTIVITY_TARGET_REGISTERED;
                break;
            case 50:
                ahzvVar = ahzv.LIVE_ACTIVITY_PTS_TARGET_REGISTERED;
                break;
            case 51:
                ahzvVar = ahzv.CONTENT_EXPANDED;
                break;
            case 52:
                ahzvVar = ahzv.LIVE_ACTIVITY_STARTED_LOCALLY;
                break;
            case 53:
                ahzvVar = ahzv.DECRYPTED_SUCCESSFULLY;
                break;
            case 54:
                ahzvVar = ahzv.ACCOUNT_USERNAME_CHANGE;
                break;
            case 55:
                ahzvVar = ahzv.GMS_ACCOUNT_USERNAME_CHANGE;
                break;
            case 56:
                ahzvVar = ahzv.CONTROLS_TARGET_REGISTERED;
                break;
            case 57:
                ahzvVar = ahzv.DELIVERED_REPLACED;
                break;
            case 58:
                ahzvVar = ahzv.TARGET_UNREGISTERED_BY_COLLABORATOR;
                break;
            case 59:
                ahzvVar = ahzv.LIVE_ACTIVITY_STALE;
                break;
            case 60:
                ahzvVar = ahzv.DELIVERED_COUNTERFACTUAL;
                break;
            case 61:
                ahzvVar = ahzv.FETCHED_COUNTERFACTUAL;
                break;
            case 62:
                ahzvVar = ahzv.BACKGROUND_PROCESSING_INITIATED;
                break;
            case 63:
                ahzvVar = ahzv.IMAGE_DOWNLOAD_SUCCESS;
                break;
        }
        return ahzvVar != null;
    }
}

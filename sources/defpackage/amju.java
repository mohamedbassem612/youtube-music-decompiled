package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class amju implements aiht {
    static final aiht a = new amju();

    @Override // defpackage.aiht
    public final boolean isInRange(int i) {
        amjv amjvVar;
        switch (i) {
            case 0:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_UNSPECIFIED;
                break;
            case 1:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_UNMAPPED;
                break;
            case 2:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_SYSTEM_HEALTH;
                break;
            case 3:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_CONNECTIVITY_STATUS_REPORT;
                break;
            case 4:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_NETWORK_QUALITY_LOGGER;
                break;
            case 5:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_CLOCK_TIME_MONITOR;
                break;
            case 6:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_BACKGROUND_HOME_PREFETCH;
                break;
            case 7:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_ON_DEVICE_SUGGEST_INDEX_FETCHER;
                break;
            case 8:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_NOTIFICATION_REGISTRATION;
                break;
            case 9:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_NOTIFICATION_PROCESSING;
                break;
            case 10:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_NOTIFICATION_INTERACTION;
                break;
            case 11:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_SEND_DEVICE_CONTEXT;
                break;
            case 12:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_ACCOUNTS_REMOVED;
                break;
            case 13:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_IDENTITY_STORE_BACKFILL;
                break;
            case 14:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_AUTH_TOKEN_REFRESH;
                break;
            case 15:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_MODULAR_ONBOARDING;
                break;
            case 16:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_WHOS_WATCHING_STORE_MANAGER;
                break;
            case 17:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_MDX_BACKGROUND_SCAN;
                break;
            case 18:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_CONFIG_FETCHER_CHARGING;
                break;
            case 19:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_CONFIG_FETCHER_NONCHARGING;
                break;
            case 20:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_PING_FLUSH;
                break;
            case 21:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_LOCALE_UPDATE;
                break;
            case 22:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_DELAYED_EVENT_DISPATCH_FAST_TIER;
                break;
            case 23:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_DELAYED_EVENT_DISPATCH_DEFAULT_TIER;
                break;
            case 24:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_DELAYED_EVENT_DISPATCH_EMPTY_TIER;
                break;
            case 25:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_DELAYED_EVENT_DISPATCH_ALL;
                break;
            case 26:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_DATAPUSH_MAINTENANCE;
                break;
            case 27:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_DATAPUSH_CHARGING;
                break;
            case 28:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_DATAPUSH_CELLULAR_CHARGING;
                break;
            case 29:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_DATAPUSH_WIFI_CHARGING;
                break;
            case 30:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_OFFLINE_CHARGING_REFRESH;
                break;
            case 31:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_OFFLINE_NON_CHARGING_REFRESH;
                break;
            case 32:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_OFFLINE_INCREMENTAL_REFRESH;
                break;
            case 33:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_OFFLINE_PLAYLIST_AUTOSYNC;
                break;
            case 34:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_OFFLINE_PLAYLIST_AUTOSYNC_SINGLE;
                break;
            case 35:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_OFFLINE_DELAYED_MESSAGE;
                break;
            case 36:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_OFFLINE_WIFI_WAKEUP;
                break;
            case 37:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_OFFLINE_CONNECTIVITY_WAKEUP;
                break;
            case 38:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_OFFLINE_TRANSFER_KEEP_ALIVE;
                break;
            case 39:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_OFFLINE_AUTO_REFRESH;
                break;
            case 40:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_OFFLINE_SETTINGS_FETCH;
                break;
            case 41:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_OFFLINE_BROWSE_FETCH;
                break;
            case 42:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_UPLOAD_WIFI_PENDING;
                break;
            case 43:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_UPLOAD_NETWORK_PENDING;
                break;
            case 44:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_UPLOAD_LONG_RETRY;
                break;
            case 45:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_UPLOAD_STORAGE_PENDING;
                break;
            case 46:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_APP_SEARCH_FULL_INDEX;
                break;
            case 47:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_APP_SEARCH_SYNC_INDEX;
                break;
            case 48:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_APP_SEARCH_INDEX_SNAPSHOT;
                break;
            case 49:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_OFFLINE_FEEDBACK;
                break;
            case 50:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_SIDELOADED_PLAYLIST_EXPORTER;
                break;
            case 51:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_SIDELOADED_PLAYLIST_MIGRATION;
                break;
            case 52:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_SIDELOADED_PLAYLIST_EXPORT_RESTORE;
                break;
            case 53:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_AUTO_OFFLINE;
                break;
            case 54:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_TIKTOK_SYNC;
                break;
            case 55:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_TIKTOK_WIPEOUT;
                break;
            case 56:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_TIKTOK_OTHER;
                break;
            case 57:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_CHIME_SCHEDULED_TASK;
                break;
            case 58:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_MDD_TASK;
                break;
            case 59:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_OTHER_WORKER;
                break;
            case 60:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_JOB_SERVICE_OFFLINE_TRANSFER;
                break;
            case 61:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_JOB_SERVICE_ACCOUNT_SYNC;
                break;
            case 62:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_JOB_SERVICE_OTHER;
                break;
            case 63:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_STUDIO_FILE_UPLOAD;
                break;
            case 64:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_PRODUCER_EXPORT_INCONCLUSIVE;
                break;
            case 65:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_PRODUCER_SCHEDULED_NOTIFICATION;
                break;
            case 66:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_OFFLINE_CLIENT_STATE;
                break;
            case 67:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_GCM_TOPIC_RETRY;
                break;
            case 68:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_C2PA_ENROLLMENT;
                break;
            case 69:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_JOB_SERVICE_GMS_MEASUREMENT;
                break;
            case 70:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_WORK_MANAGER_DIAGNOSTICS;
                break;
            case 71:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_NO_WORKER_CREATED;
                break;
            case 72:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_CHIME_MEDIA_CACHE_CLEANUP;
                break;
            case 73:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_MDX_FALLBACK_BACKGROUND_SCAN;
                break;
            case 74:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_JOB_SERVICE_CHIME_SCHEDULED_TASK;
                break;
            case 75:
                amjvVar = amjv.WORK_MANAGER_TASK_TAG_TOASTY;
                break;
            default:
                amjvVar = null;
                break;
        }
        return amjvVar != null;
    }
}

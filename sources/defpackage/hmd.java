package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hmd implements avni {
    private final /* synthetic */ int $cid;

    public /* synthetic */ hmd(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avni
    public final void a(Object obj) {
        switch (this.$cid) {
            case 0:
                ((agrc) ((agrc) ((agrc) hmf.a.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/offline/OrphanedPersistedEntitiesCleaner", "cleanupDownloadedEntity", (char) 140, "OrphanedPersistedEntitiesCleaner.java")).t("Failed to remove entities.");
                break;
            case 1:
                tzk.a((Throwable) obj);
                break;
            case 2:
                ((agrc) ((agrc) ((agrc) hmi.a.c()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/offline/actionscontroller/MusicOfflinePlaylistAutoDownloadActionsController", "disableAutoDownloads", (char) 181, "MusicOfflinePlaylistAutoDownloadActionsController.java")).t("Failed to remove auto-download entities");
                break;
            case 3:
                ((agrc) ((agrc) ((agrc) hmi.a.c()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/offline/actionscontroller/MusicOfflinePlaylistAutoDownloadActionsController", "enableAutoDownloads", (char) 203, "MusicOfflinePlaylistAutoDownloadActionsController.java")).t("Failed to enable auto-downloads");
                break;
            case 4:
                ((agrc) ((agrc) ((agrc) hmt.a.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/offline/actionscontroller/MusicOfflineTrackEntityActionsController$2", "onConfirmed", (char) 515, "MusicOfflineTrackEntityActionsController.java")).t("Failure to delete track.");
                break;
            case 5:
                ((agrc) ((agrc) ((agrc) hob.a.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/offline/autooffline/MusicAutoOfflineScheduler", "removeRefreshEntity", (char) 187, "MusicAutoOfflineScheduler.java")).t("Could not commit Refresh entities");
                break;
            case 6:
                ((agrc) ((agrc) ((agrc) hob.a.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/offline/autooffline/MusicAutoOfflineScheduler", "schedule", (char) 222, "MusicAutoOfflineScheduler.java")).t("Could not commit Refresh entities");
                break;
            case 7:
                ((agrc) ((agrc) ((agrc) hpx.a.c()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/offline/compat/entityprovider/MusicOfflinePlaylistSyncPolicyEntityProvider", "getEntity", 'A', "MusicOfflinePlaylistSyncPolicyEntityProvider.java")).t("Failed to retrieve OfflinePlaylistSyncPolicy");
                break;
            case 8:
                ((agrc) ((agrc) ((agrc) hpx.a.c()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/offline/compat/entityprovider/MusicOfflinePlaylistSyncPolicyEntityProvider", "getEntities", 'f', "MusicOfflinePlaylistSyncPolicyEntityProvider.java")).t("Error retrieving OfflinePlaylistSyncPolicies");
                break;
            case 9:
                ((agrc) ((agrc) ((agrc) hqg.a.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/offline/compat/legacy/OfflineStoreObserver", "commitEntities", (char) 702, "OfflineStoreObserver.java")).t("Could not commit Entities during OfflineStore event");
                break;
            case 10:
                zvp.b(zvn.b, zvm.n, "OfflineStore failed to initialize", (Throwable) obj);
                break;
            case 11:
                ((agrc) ((agrc) ((agrc) hsd.a.c().i(agso.a, "LegacyCascadeMusicPlayl")).j((Throwable) obj)).k("com/google/android/apps/youtube/music/offline/entitycontroller/LegacyCascadeMusicPlaylistEntityController", "batchUpdatePlaylistSyncPolicies", (char) 1208, "LegacyCascadeMusicPlaylistEntityController.java")).t("Failed to batch update playlist sync policies");
                break;
            case 12:
                ((agrc) ((agrc) ((agrc) hsd.a.c().i(agso.a, "LegacyCascadeMusicPlayl")).j((Throwable) obj)).k("com/google/android/apps/youtube/music/offline/entitycontroller/LegacyCascadeMusicPlaylistEntityController", "writeRefreshEntityToStore", (char) 630, "LegacyCascadeMusicPlaylistEntityController.java")).t("Failed to write refresh entity");
                break;
            case 13:
                ((agrc) ((agrc) ((agrc) hsd.a.b().i(agso.a, "LegacyCascadeMusicPlayl")).j((Throwable) obj)).k("com/google/android/apps/youtube/music/offline/entitycontroller/LegacyCascadeMusicPlaylistEntityController", "updateEntityStore", (char) 1282, "LegacyCascadeMusicPlaylistEntityController.java")).t("Failed to commit updated the metadata entity during sync");
                break;
            case 14:
                tzk.a((Throwable) obj);
                break;
            case 15:
                tzk.a((Throwable) obj);
                break;
            case 16:
                tzk.a((Throwable) obj);
                break;
            case 17:
                tzk.a((Throwable) obj);
                break;
            case 18:
                tzk.a((Throwable) obj);
                break;
            case 19:
                tzk.a((Throwable) obj);
                break;
            default:
                tzk.a((Throwable) obj);
                break;
        }
    }
}

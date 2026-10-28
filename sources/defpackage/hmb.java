package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hmb implements tab {
    private final /* synthetic */ int $cid;

    public /* synthetic */ hmb(int i) {
        this.$cid = i;
    }

    @Override // defpackage.twi
    public final /* synthetic */ void a(Object obj) {
        switch (this.$cid) {
            case 0:
                ((agrc) ((agrc) ((agrc) hmf.a.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/offline/OrphanedPersistedEntitiesCleaner", "cleanupDownloadedEntity", (char) 128, "OrphanedPersistedEntitiesCleaner.java")).t("Failed to get entity keys.");
                break;
            case 1:
                ((agrc) ((agrc) ((agrc) gqs.h.b()).j((Throwable) obj)).k("com/google/android/apps/youtube/music/browse/ShortcutController", "configureShortcuts", '|', "ShortcutController.java")).t("Failed to retrieve shortcuts");
                break;
            case 2:
                long j = hvh.a;
                break;
            case 3:
                long j2 = hvh.a;
                break;
            case 4:
                idx.j((Throwable) obj, "restoreAsync");
                break;
            case 5:
                idx.j((Throwable) obj, "getVideoList");
                break;
            case 6:
                idx.j((Throwable) obj, "getContinuationDataSet");
                break;
            case 7:
                idx.j((Throwable) obj, "getPersistentQueue");
                break;
            case 8:
                ((agrc) ((agrc) ((agrc) iox.a.c().i(agso.a, "BatteryRestrictions")).j((Throwable) obj)).k("com/google/android/apps/youtube/music/settings/battery/BatteryRestrictionsMonitor", "clearImpressionCount", (char) 159, "BatteryRestrictionsMonitor.java")).t("Failed to clear impression count.");
                break;
            case 9:
                ((agrc) ((agrc) ((agrc) sza.a.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/common/clientsample/DefaultSampleGate", "shouldSample", '<', "DefaultSampleGate.java")).t("Error while writing settings");
                break;
            case 10:
                ((agrc) ((agrc) ((agrc) taf.d.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/common/concurrent/YouTubeFutures", "<init>", '7', "YouTubeFutures.java")).t("There was an error");
                break;
            case 11:
                ((agrc) ((agrc) ((agrc) xnp.i.b().i(agso.a, "MDX.devicemanager")).j((Throwable) obj)).k("com/google/android/libraries/youtube/mdx/devicemanagement/MdxDeviceStore", "trim", (char) 392, "MdxDeviceStore.java")).t("Error saving devices to storage.");
                break;
            case 12:
                ((agrc) ((agrc) ((agrc) xqz.p.b().i(agso.a, "MDX.mediaroute")).j((Throwable) obj)).k("com/google/android/libraries/youtube/mdx/mediaroute/MdxMediaRouteProvider", "onDiscoveryRequestChanged", (char) 132, "MdxMediaRouteProvider.java")).t("Failed to get the descriptor.");
                break;
            case 13:
                break;
            case 14:
                ((agrc) ((agrc) ((agrc) yds.a.b().i(agso.a, "MDX.user")).j((Throwable) obj)).k("com/google/android/libraries/youtube/mdx/user/MdxProfileStorage", "loadStatsInternal", (char) 197, "MdxProfileStorage.java")).t("Failed to store profile creation timestamp.");
                break;
            case 15:
                zvp.b(zvn.b, zvm.f, "Failed to clear supported profiles or save incremental version on OS mismatch.", (Throwable) obj);
                break;
            case 16:
                ((agrc) ((agrc) ((agrc) zyc.b.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/net/request/LogcatNetworkLogger", "onStartRequest", 'L', "LogcatNetworkLogger.java")).t("There was an error.");
                break;
            case 17:
                ((agrc) ((agrc) ((agrc) zyc.b.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/net/request/LogcatNetworkLogger", "onNetworkResponse", (char) 149, "LogcatNetworkLogger.java")).t("There was an error.");
                break;
            case 18:
                aaog.c((Throwable) obj);
                break;
            default:
                ((agrc) ((agrc) ((agrc) abib.a.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/player/features/playbackposition/PlaybackPositionStartupController", "initInternal", (char) 131, "PlaybackPositionStartupController.java")).t("Error during PlaybackPositionStartupController initialization.");
                break;
        }
    }

    @Override // defpackage.tab
    /* JADX INFO: renamed from: b */
    public final void a(Throwable th) {
        switch (this.$cid) {
            case 0:
                ((agrc) ((agrc) ((agrc) hmf.a.b()).j(th)).k("com/google/android/apps/youtube/music/offline/OrphanedPersistedEntitiesCleaner", "cleanupDownloadedEntity", (char) 128, "OrphanedPersistedEntitiesCleaner.java")).t("Failed to get entity keys.");
                break;
            case 1:
                ((agrc) ((agrc) ((agrc) gqs.h.b()).j(th)).k("com/google/android/apps/youtube/music/browse/ShortcutController", "configureShortcuts", '|', "ShortcutController.java")).t("Failed to retrieve shortcuts");
                break;
            case 2:
                long j = hvh.a;
                break;
            case 3:
                long j2 = hvh.a;
                break;
            case 4:
                idx.j(th, "restoreAsync");
                break;
            case 5:
                idx.j(th, "getVideoList");
                break;
            case 6:
                idx.j(th, "getContinuationDataSet");
                break;
            case 7:
                idx.j(th, "getPersistentQueue");
                break;
            case 8:
                ((agrc) ((agrc) ((agrc) iox.a.c().i(agso.a, "BatteryRestrictions")).j(th)).k("com/google/android/apps/youtube/music/settings/battery/BatteryRestrictionsMonitor", "clearImpressionCount", (char) 159, "BatteryRestrictionsMonitor.java")).t("Failed to clear impression count.");
                break;
            case 9:
                ((agrc) ((agrc) ((agrc) sza.a.b()).j(th)).k("com/google/android/libraries/youtube/common/clientsample/DefaultSampleGate", "shouldSample", '<', "DefaultSampleGate.java")).t("Error while writing settings");
                break;
            case 10:
                ((agrc) ((agrc) ((agrc) taf.d.b()).j(th)).k("com/google/android/libraries/youtube/common/concurrent/YouTubeFutures", "<init>", '7', "YouTubeFutures.java")).t("There was an error");
                break;
            case 11:
                ((agrc) ((agrc) ((agrc) xnp.i.b().i(agso.a, "MDX.devicemanager")).j(th)).k("com/google/android/libraries/youtube/mdx/devicemanagement/MdxDeviceStore", "trim", (char) 392, "MdxDeviceStore.java")).t("Error saving devices to storage.");
                break;
            case 12:
                ((agrc) ((agrc) ((agrc) xqz.p.b().i(agso.a, "MDX.mediaroute")).j(th)).k("com/google/android/libraries/youtube/mdx/mediaroute/MdxMediaRouteProvider", "onDiscoveryRequestChanged", (char) 132, "MdxMediaRouteProvider.java")).t("Failed to get the descriptor.");
                break;
            case 13:
                break;
            case 14:
                ((agrc) ((agrc) ((agrc) yds.a.b().i(agso.a, "MDX.user")).j(th)).k("com/google/android/libraries/youtube/mdx/user/MdxProfileStorage", "loadStatsInternal", (char) 197, "MdxProfileStorage.java")).t("Failed to store profile creation timestamp.");
                break;
            case 15:
                zvp.b(zvn.b, zvm.f, "Failed to clear supported profiles or save incremental version on OS mismatch.", th);
                break;
            case 16:
                ((agrc) ((agrc) ((agrc) zyc.b.b()).j(th)).k("com/google/android/libraries/youtube/net/request/LogcatNetworkLogger", "onStartRequest", 'L', "LogcatNetworkLogger.java")).t("There was an error.");
                break;
            case 17:
                ((agrc) ((agrc) ((agrc) zyc.b.b()).j(th)).k("com/google/android/libraries/youtube/net/request/LogcatNetworkLogger", "onNetworkResponse", (char) 149, "LogcatNetworkLogger.java")).t("There was an error.");
                break;
            case 18:
                aaog.c(th);
                break;
            default:
                ((agrc) ((agrc) ((agrc) abib.a.b()).j(th)).k("com/google/android/libraries/youtube/player/features/playbackposition/PlaybackPositionStartupController", "initInternal", (char) 131, "PlaybackPositionStartupController.java")).t("Error during PlaybackPositionStartupController initialization.");
                break;
        }
    }
}

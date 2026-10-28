package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum tsb implements trz {
    FTL_IMAGE_LOAD_STARTED("FirstThumbnailLoadStarted", 0),
    FTL_IMAGE_LOAD("FirstThumbnailLoad", 0),
    FTL_IMAGE_LOAD_TERMINATION("FirstThumbnailLoadTermination", 0),
    FTL_MONITORING_COMPLETE("FirstThumbnailMonitoringComplete", 0),
    BROWSE_FRAGMENT_ON_CREATE_STARTED("csi.BrowseFragmentCreateStarted.uibf_c", 2),
    BROWSE_FRAGMENT_ON_START_STARTED("csi.BrowseFragmentStartStarted.uibf_s", 2),
    BROWSE_FRAGMENT_ON_RESUME_STARTED("csi.BrowseFragmentResumeStarted.uibf_r", 2),
    BROWSE_REQUESTED("csi.BrowseRequested.br_s", 2),
    BROWSE_RECEIVED("csi.BrowseReceived.br_r", 2),
    BROWSE_FEED_LOADED("csi.BrowseFeedLoaded.ol", 2),
    BROWSE_FEED_RENDERED("csi.BrowseFeedRendered.cpt", 2),
    BROWSE_ERROR("csi.BrowseError.br_e", 2),
    GLIDE_VOLLEY_DISK_CACHE_INITIALIZE("GVDC.initialize", 1),
    GLIDE_VOLLEY_DISK_CACHE_GET("GVDC.get", 1),
    DISK_LRU_CACHE_OPEN("DLC.open", 1),
    DISK_LRU_CACHE_GET("DLC.get", 1),
    DISK_LRU_CACHE_CLEANUP_AND_LOG_EXCEPTIONS("DLC.cleanupAndLogExceptions", 1),
    VOLLEY_DISK_CACHE_INITIALIZE("VDC.initialize", 1),
    VOLLEY_DISK_CACHE_GET("VDC.get", 1),
    PB_APPLY_YOUTUBE_MARQUEE("PB.applyYouTubeMarquee", 0),
    PRELOAD_YOUTUBE_MARQUEE("PB.preloadYouTubeMarquee", 0);

    private final qci w;
    private final int x;

    tsb(String str, int i) {
        this.w = new qci(str);
        this.x = i;
    }

    @Override // defpackage.trz
    public final int a() {
        return this.x;
    }

    @Override // defpackage.trz
    public final qci b() {
        return this.w;
    }

    @Override // defpackage.trz
    public final boolean c() {
        int i = tqr.a;
        return tym.ac(1077957504, this);
    }
}

package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum tsa implements trz {
    FIRST_THUMB_COMPLETE("first thumb complete", 0),
    BF_GLOBAL_LAYOUT("BF.onGlobalLayout", 0),
    BF_HANDLE_RESPONSE("BF.handleResponse", 0),
    YTA_CREATE("YTA.onCreate", 0),
    YTA_POST_RESUME("YTA.onPostResume", 0),
    BS_GET_BROWSE_DATA("BS.getBrowseData", 0),
    BS_GET_ATTESTATION_RESPONSE_DATA("BS.getAttestationResponseData", 0),
    BS_ON_BUILD_DECORATORS("BS.onBuildFutureRequestDecorators", 0),
    BS_GET_CACHE_KEY("BS.getCacheKey", 0),
    BS_GET_REQUEST_BUILDER("BS.getRequestBuilder", 0),
    BSF_REQUEST_INTERNAL("BSF.requestInternal", 0),
    ATP_GET_TOKEN("ATP.getToken", 0),
    ATP_GET_TOKEN_LIVE_FROM_GMS("ATP.getTokenLiveFromGms", 0),
    MA_ON_CREATE("MA.onCreate", 0),
    MA_ON_START("MA.onStart", 0),
    MA_ON_POST_CREATE("MA.onPostCreate", 0),
    MA_ON_POST_RESUME("MA.onPostResume", 0),
    MA_ON_RESUME("MA.onResume", 0),
    MA_TOUCH_EVENT("MA.dispatchTouchEvent", 0),
    FRAGMENT_ON_START("F.onStart:", 0),
    FRAGMENT_ON_STOP("F.onStop:", 0),
    FRAGMENT_ON_PAUSE("F.onPause:", 0),
    FRAGMENT_ON_RESUME("F.onResume:", 0),
    FG_MARKER("FG", 0),
    BG_MARKER("BG", 0),
    PB_NAVIGATE_TO_TAB("PB.navigateToTab", 0),
    IP_NOTIFY_TRANSITION("IPLC.notifyTransition:", 1),
    IP_ATTEMPT_TRANSITION("IPLC.attemptTransition:", 1),
    WATCH_LAYOUT_TRANSITION("WDLS:", 2),
    LD_INIT("LD.init", 2),
    LD_LOAD_VIDEO("LD.loadVideo", 2),
    LD_PLAY("LD.play", 2),
    LD_STOP("LD.stop", 2),
    LD_RELEASE("LD.release", 2),
    LD_SET_VIDEO_STAGE("LD.setVideoStage:", 2),
    LD_BROADCAST_VIDEO_STAGE("LD.broadcastVideoStage:", 2),
    LD_BROADCAST_RX_VIDEO_STAGE("LD.broadcastRxVideoStage:", 2),
    LD_PLAY_INTERSTITIAL_VIDEO("LD.playInterstitialVideo", 2),
    LD_PLAY_TIMELINE("LD.playTimeline", 2),
    SEL_ON_SCROLL_STATE_CHANGED_PREFIX("SEL.onScrollStateChanged:", 3),
    DFL_ON_SCROLL_START_PREFIX("DFL.onScrollStart:ve=", 3),
    DFL_ON_SCROLL_STOP_PREFIX("DFL.onScrollStop:ve=", 3),
    DFL_ON_SCROLL_STOP_VERBOSE_PREFIX("DFL.onScrollStopV:", 3),
    HANDLE_VIDEO_STAGE_EVENT("VideoStageEvent:", 4),
    EVENT_BUS_HANDLE_VIDEO_STAGE_EVENT("EB.VideoStageEvent:", 4),
    HANDLE_RX_VIDEO_STAGE_EVENT("RxVideoStageEvent:", 4),
    HANDLE_YOUTUBE_PLAYER_STATE_EVENT("YtPlayerStateEvent:", 4),
    HANDLE_VIDEO_TIME_EVENT("VideoTimeEvent:", 5),
    EVENT_BUS_HANDLE_VIDEO_TIME_EVENT("EB.VideoTimeEvent:", 5),
    STREAMING_WATCH_REQUESTED("watch.streamingWatchRequested", 2),
    STREAMING_WATCH_PART_RECEIVED("watch.streamingWatchPartReceived", 2),
    STREAMING_WATCH_PART_FALLBACK("watch.streamingWatchPartFallback", 2),
    STREAMING_WATCH_SERVICE_NETWORK_REQUESTED("watch.streamingWatchServiceNetworkRequested", 2),
    STREAMING_WATCH_SERVICE_NETWORK_RECEIVED("watch.streamingWatchServiceNetworkReceived", 2),
    STREAMING_WATCH_SERVICE_NETWORK_PARSING_STARTED("watch.streamingWatchServiceNetworkParsingStarted", 2),
    STREAMING_WATCH_SERVICE_NETWORK_PARSING_ENDED("watch.streamingWatchServiceNetworkParsingEnded", 2),
    WATCH_NEXT_RENDER_STARTED("watch.watchNextRenderStarted", 2),
    WATCH_NEXT_RENDER_COMPLETED("watch.watchNextRenderCompleted", 2);

    public final qci ag;
    private final int ai;

    tsa(String str, int i) {
        this.ag = new qci(str);
        this.ai = i;
    }

    @Override // defpackage.trz
    public final int a() {
        return this.ai;
    }

    @Override // defpackage.trz
    public final qci b() {
        return this.ag;
    }

    @Override // defpackage.trz
    public final boolean c() {
        int i = tqr.a;
        return tym.ac(1077957440, this);
    }
}

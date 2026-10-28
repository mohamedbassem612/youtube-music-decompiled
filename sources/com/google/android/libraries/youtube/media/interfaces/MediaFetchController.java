package com.google.android.libraries.youtube.media.interfaces;

import com.google.android.apps.youtube.proto.streaming.MediaCapabilitiesOuterClass$MediaCapabilities;
import com.google.protos.youtube.api.innertube.MediaFetchColdConfigOuterClass$MediaFetchColdConfig;
import com.google.protos.youtube.api.innertube.MediaFetchHotConfigOuterClass$MediaFetchHotConfig;
import com.google.protos.youtube.api.innertube.StreamingDataOuterClass$StreamingData;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class MediaFetchController {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends MediaFetchController {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }

        public static native MediaFetchController create(MediaFetchCallbacks mediaFetchCallbacks, Executor executor, TimerFactory timerFactory, MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilities, MediaFetchColdConfigOuterClass$MediaFetchColdConfig mediaFetchColdConfigOuterClass$MediaFetchColdConfig, MediaFetchHotConfigOuterClass$MediaFetchHotConfig mediaFetchHotConfigOuterClass$MediaFetchHotConfig, ViewportSize viewportSize, MetadataStore metadataStore, String str, SharedBandwidthSampleTracker sharedBandwidthSampleTracker);

        public static native void nativeDestroy(long j);

        private native PlaybackControllerOrError native_createPlaybackController(long j, PlaybackControllerCallbacks playbackControllerCallbacks, MediaFetchPlayerConfig mediaFetchPlayerConfig, StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData, String str, BufferManager bufferManager, QoeLogger qoeLogger, LatencyLogger latencyLogger, NetFetch netFetch, String str2, byte[] bArr, ProofOfOriginTokenManager proofOfOriginTokenManager, byte[] bArr2, LiveVideoDetails liveVideoDetails, OnesieResponseParams onesieResponseParams, OnesieVideoData onesieVideoData, MediaCache mediaCache, MediaCache mediaCache2, boolean z, boolean z2, MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilities);

        private native Long native_getBandwidthEstimateBytesPerSec(long j);

        private native ArrayList native_getBandwidthSamples(long j);

        private native boolean native_isReadyToStartPlayback(long j, Time time, Time time2, Double d);

        private native void native_onAppEnterBackground(long j);

        private native void native_onHotConfig(long j, MediaFetchHotConfigOuterClass$MediaFetchHotConfig mediaFetchHotConfigOuterClass$MediaFetchHotConfig);

        private native void native_onNetworkStateChangeToActive(long j);

        private native void native_onNetworkStatusChange(long j, boolean z, int i);

        private native void native_onOnesieTransferEvents(long j, ArrayList arrayList);

        private native void native_onPlayerState(long j, int i);

        private native void native_onProxySettingsChange(long j, String str, int i);

        private native void native_onQueuingCompleted(long j);

        private native void native_onQueuingCompletedThreadsafe(long j);

        private native void native_onQueuingStarted(long j);

        private native void native_onSeek(long j, Time time);

        private native void native_onStuckPlayback(long j);

        private native void native_onViewportSizeChange(long j, ViewportSize viewportSize);

        private native VideoClipOrError native_queueVideoClip(long j, PlaybackController playbackController, Time time, Time time2, Time time3);

        private native void native_restartPrefetchEvaluation(long j, RestartPrefetchEvaluationSource restartPrefetchEvaluationSource);

        private native void native_restartPrefetchEvaluationThreadsafe(long j, RestartPrefetchEvaluationSource restartPrefetchEvaluationSource);

        private native void native_setMediaCapabilities(long j, MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilities);

        private native void native_setPlaybackAgnosticUserPreferences(long j, PlaybackAgnosticUserPreferences playbackAgnosticUserPreferences);

        private native boolean native_transitionToQueuedClip(long j, VideoClip videoClip);

        private native void native_truncateQueue(long j, int i);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchController
        public PlaybackControllerOrError createPlaybackController(PlaybackControllerCallbacks playbackControllerCallbacks, MediaFetchPlayerConfig mediaFetchPlayerConfig, StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData, String str, BufferManager bufferManager, QoeLogger qoeLogger, LatencyLogger latencyLogger, NetFetch netFetch, String str2, byte[] bArr, ProofOfOriginTokenManager proofOfOriginTokenManager, byte[] bArr2, LiveVideoDetails liveVideoDetails, OnesieResponseParams onesieResponseParams, OnesieVideoData onesieVideoData, MediaCache mediaCache, MediaCache mediaCache2, boolean z, boolean z2, MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilities) {
            return native_createPlaybackController(this.nativeRef, playbackControllerCallbacks, mediaFetchPlayerConfig, streamingDataOuterClass$StreamingData, str, bufferManager, qoeLogger, latencyLogger, netFetch, str2, bArr, proofOfOriginTokenManager, bArr2, liveVideoDetails, onesieResponseParams, onesieVideoData, mediaCache, mediaCache2, z, z2, mediaCapabilitiesOuterClass$MediaCapabilities);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchController
        public Long getBandwidthEstimateBytesPerSec() {
            return native_getBandwidthEstimateBytesPerSec(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchController
        public ArrayList getBandwidthSamples() {
            return native_getBandwidthSamples(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchController
        public boolean isReadyToStartPlayback(Time time, Time time2, Double d) {
            return native_isReadyToStartPlayback(this.nativeRef, time, time2, d);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchController
        public void onAppEnterBackground() {
            native_onAppEnterBackground(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchController
        public void onHotConfig(MediaFetchHotConfigOuterClass$MediaFetchHotConfig mediaFetchHotConfigOuterClass$MediaFetchHotConfig) {
            native_onHotConfig(this.nativeRef, mediaFetchHotConfigOuterClass$MediaFetchHotConfig);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchController
        public void onNetworkStateChangeToActive() {
            native_onNetworkStateChangeToActive(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchController
        public void onNetworkStatusChange(boolean z, int i) {
            native_onNetworkStatusChange(this.nativeRef, z, i);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchController
        public void onOnesieTransferEvents(ArrayList arrayList) {
            native_onOnesieTransferEvents(this.nativeRef, arrayList);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchController
        public void onPlayerState(int i) {
            native_onPlayerState(this.nativeRef, i);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchController
        public void onProxySettingsChange(String str, int i) {
            native_onProxySettingsChange(this.nativeRef, str, i);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchController
        public void onQueuingCompleted() {
            native_onQueuingCompleted(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchController
        public void onQueuingCompletedThreadsafe() {
            native_onQueuingCompletedThreadsafe(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchController
        public void onQueuingStarted() {
            native_onQueuingStarted(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchController
        public void onSeek(Time time) {
            native_onSeek(this.nativeRef, time);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchController
        public void onStuckPlayback() {
            native_onStuckPlayback(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchController
        public void onViewportSizeChange(ViewportSize viewportSize) {
            native_onViewportSizeChange(this.nativeRef, viewportSize);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchController
        public VideoClipOrError queueVideoClip(PlaybackController playbackController, Time time, Time time2, Time time3) {
            return native_queueVideoClip(this.nativeRef, playbackController, time, time2, time3);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchController
        public void restartPrefetchEvaluation(RestartPrefetchEvaluationSource restartPrefetchEvaluationSource) {
            native_restartPrefetchEvaluation(this.nativeRef, restartPrefetchEvaluationSource);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchController
        public void restartPrefetchEvaluationThreadsafe(RestartPrefetchEvaluationSource restartPrefetchEvaluationSource) {
            native_restartPrefetchEvaluationThreadsafe(this.nativeRef, restartPrefetchEvaluationSource);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchController
        public void setMediaCapabilities(MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilities) {
            native_setMediaCapabilities(this.nativeRef, mediaCapabilitiesOuterClass$MediaCapabilities);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchController
        public void setPlaybackAgnosticUserPreferences(PlaybackAgnosticUserPreferences playbackAgnosticUserPreferences) {
            native_setPlaybackAgnosticUserPreferences(this.nativeRef, playbackAgnosticUserPreferences);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchController
        public boolean transitionToQueuedClip(VideoClip videoClip) {
            return native_transitionToQueuedClip(this.nativeRef, videoClip);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaFetchController
        public void truncateQueue(int i) {
            native_truncateQueue(this.nativeRef, i);
        }
    }

    public static MediaFetchController create(MediaFetchCallbacks mediaFetchCallbacks, Executor executor, TimerFactory timerFactory, MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilities, MediaFetchColdConfigOuterClass$MediaFetchColdConfig mediaFetchColdConfigOuterClass$MediaFetchColdConfig, MediaFetchHotConfigOuterClass$MediaFetchHotConfig mediaFetchHotConfigOuterClass$MediaFetchHotConfig, ViewportSize viewportSize, MetadataStore metadataStore, String str, SharedBandwidthSampleTracker sharedBandwidthSampleTracker) {
        return CppProxy.create(mediaFetchCallbacks, executor, timerFactory, mediaCapabilitiesOuterClass$MediaCapabilities, mediaFetchColdConfigOuterClass$MediaFetchColdConfig, mediaFetchHotConfigOuterClass$MediaFetchHotConfig, viewportSize, metadataStore, str, sharedBandwidthSampleTracker);
    }

    public abstract PlaybackControllerOrError createPlaybackController(PlaybackControllerCallbacks playbackControllerCallbacks, MediaFetchPlayerConfig mediaFetchPlayerConfig, StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData, String str, BufferManager bufferManager, QoeLogger qoeLogger, LatencyLogger latencyLogger, NetFetch netFetch, String str2, byte[] bArr, ProofOfOriginTokenManager proofOfOriginTokenManager, byte[] bArr2, LiveVideoDetails liveVideoDetails, OnesieResponseParams onesieResponseParams, OnesieVideoData onesieVideoData, MediaCache mediaCache, MediaCache mediaCache2, boolean z, boolean z2, MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilities);

    public abstract Long getBandwidthEstimateBytesPerSec();

    public abstract ArrayList getBandwidthSamples();

    public abstract boolean isReadyToStartPlayback(Time time, Time time2, Double d);

    public abstract void onAppEnterBackground();

    public abstract void onHotConfig(MediaFetchHotConfigOuterClass$MediaFetchHotConfig mediaFetchHotConfigOuterClass$MediaFetchHotConfig);

    public abstract void onNetworkStateChangeToActive();

    public abstract void onNetworkStatusChange(boolean z, int i);

    public abstract void onOnesieTransferEvents(ArrayList arrayList);

    public abstract void onPlayerState(int i);

    public abstract void onProxySettingsChange(String str, int i);

    public abstract void onQueuingCompleted();

    public abstract void onQueuingCompletedThreadsafe();

    public abstract void onQueuingStarted();

    public abstract void onSeek(Time time);

    public abstract void onStuckPlayback();

    public abstract void onViewportSizeChange(ViewportSize viewportSize);

    public abstract VideoClipOrError queueVideoClip(PlaybackController playbackController, Time time, Time time2, Time time3);

    public abstract void restartPrefetchEvaluation(RestartPrefetchEvaluationSource restartPrefetchEvaluationSource);

    public abstract void restartPrefetchEvaluationThreadsafe(RestartPrefetchEvaluationSource restartPrefetchEvaluationSource);

    public abstract void setMediaCapabilities(MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilities);

    public abstract void setPlaybackAgnosticUserPreferences(PlaybackAgnosticUserPreferences playbackAgnosticUserPreferences);

    public abstract boolean transitionToQueuedClip(VideoClip videoClip);

    public abstract void truncateQueue(int i);
}

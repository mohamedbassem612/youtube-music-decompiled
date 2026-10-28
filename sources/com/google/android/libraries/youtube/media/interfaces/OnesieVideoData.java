package com.google.android.libraries.youtube.media.interfaces;

import com.google.android.apps.youtube.proto.SabrLiveProtos$SabrLiveMetadata;
import com.google.android.apps.youtube.proto.streaming.RequestIdentifierOuterClass$RequestIdentifier;
import com.google.android.apps.youtube.proto.streaming.SelectableFormatsOuterClass$SelectableFormats;
import com.google.protos.youtube.api.innertube.NextRequestPolicyOuterClass$NextRequestPolicy;
import com.google.protos.youtube.api.innertube.PlaybackStartPolicyOuterClass$PlaybackStartPolicy;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class OnesieVideoData {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends OnesieVideoData {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }

        public static native void nativeDestroy(long j);

        private native void native_dispose(long j);

        private native BufferManager native_getBufferManager(long j);

        private native DeferredMediaCache native_getDeferredMediaCache(long j);

        private native Time native_getEffectiveStartTime(long j);

        private native SabrLiveProtos$SabrLiveMetadata native_getLiveMetadata(long j);

        private native NextRequestPolicyOuterClass$NextRequestPolicy native_getNextRequestPolicy(long j);

        private native OnesieBandwidthSampleProvider native_getOnesieBandwidthProvider(long j);

        private native PlaybackStartPolicyOuterClass$PlaybackStartPolicy native_getPlaybackStartPolicy(long j);

        private native RequestIdentifierOuterClass$RequestIdentifier native_getRequestIdentifier(long j);

        private native SelectableFormatsOuterClass$SelectableFormats native_getSelectableFormats(long j);

        private native String native_getVideoId(long j);

        private native boolean native_isCompatibleWithPlayerResponse(long j, PlayerResponseCompatibilityRequirements playerResponseCompatibilityRequirements);

        private native boolean native_isDisposed(long j);

        private native boolean native_isOnesieActive(long j);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.OnesieVideoData
        public void dispose() {
            native_dispose(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.OnesieVideoData
        public BufferManager getBufferManager() {
            return native_getBufferManager(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.OnesieVideoData
        public DeferredMediaCache getDeferredMediaCache() {
            return native_getDeferredMediaCache(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.OnesieVideoData
        public Time getEffectiveStartTime() {
            return native_getEffectiveStartTime(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.OnesieVideoData
        public SabrLiveProtos$SabrLiveMetadata getLiveMetadata() {
            return native_getLiveMetadata(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.OnesieVideoData
        public NextRequestPolicyOuterClass$NextRequestPolicy getNextRequestPolicy() {
            return native_getNextRequestPolicy(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.OnesieVideoData
        public OnesieBandwidthSampleProvider getOnesieBandwidthProvider() {
            return native_getOnesieBandwidthProvider(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.OnesieVideoData
        public PlaybackStartPolicyOuterClass$PlaybackStartPolicy getPlaybackStartPolicy() {
            return native_getPlaybackStartPolicy(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.OnesieVideoData
        public RequestIdentifierOuterClass$RequestIdentifier getRequestIdentifier() {
            return native_getRequestIdentifier(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.OnesieVideoData
        public SelectableFormatsOuterClass$SelectableFormats getSelectableFormats() {
            return native_getSelectableFormats(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.OnesieVideoData
        public String getVideoId() {
            return native_getVideoId(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.OnesieVideoData
        public boolean isCompatibleWithPlayerResponse(PlayerResponseCompatibilityRequirements playerResponseCompatibilityRequirements) {
            return native_isCompatibleWithPlayerResponse(this.nativeRef, playerResponseCompatibilityRequirements);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.OnesieVideoData
        public boolean isDisposed() {
            return native_isDisposed(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.OnesieVideoData
        public boolean isOnesieActive() {
            return native_isOnesieActive(this.nativeRef);
        }
    }

    public abstract void dispose();

    public abstract BufferManager getBufferManager();

    public abstract DeferredMediaCache getDeferredMediaCache();

    public abstract Time getEffectiveStartTime();

    public abstract SabrLiveProtos$SabrLiveMetadata getLiveMetadata();

    public abstract NextRequestPolicyOuterClass$NextRequestPolicy getNextRequestPolicy();

    public abstract OnesieBandwidthSampleProvider getOnesieBandwidthProvider();

    public abstract PlaybackStartPolicyOuterClass$PlaybackStartPolicy getPlaybackStartPolicy();

    public abstract RequestIdentifierOuterClass$RequestIdentifier getRequestIdentifier();

    public abstract SelectableFormatsOuterClass$SelectableFormats getSelectableFormats();

    public abstract String getVideoId();

    public abstract boolean isCompatibleWithPlayerResponse(PlayerResponseCompatibilityRequirements playerResponseCompatibilityRequirements);

    public abstract boolean isDisposed();

    public abstract boolean isOnesieActive();
}

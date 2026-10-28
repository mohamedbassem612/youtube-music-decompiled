package com.google.android.libraries.youtube.media.interfaces;

import com.google.android.apps.youtube.proto.SabrLiveProtos$SabrLiveMetadata;
import com.google.android.apps.youtube.proto.streaming.MediaCapabilitiesOuterClass$MediaCapabilities;
import com.google.android.apps.youtube.proto.streaming.RequestIdentifierOuterClass$RequestIdentifier;
import com.google.android.apps.youtube.proto.streaming.SabrSeekOuterClass$SabrSeek;
import com.google.android.apps.youtube.proto.streaming.SelectableFormatsOuterClass$SelectableFormats;
import com.google.android.apps.youtube.proto.streaming.TimeRangeOuterClass$TimeRange;
import com.google.protos.youtube.api.innertube.NextRequestPolicyOuterClass$NextRequestPolicy;
import com.google.protos.youtube.api.innertube.PlaybackStartPolicyOuterClass$PlaybackStartPolicy;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class PlaybackController {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends PlaybackController {
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

        private native void native_cancelFetches(long j);

        private native void native_dispose(long j);

        private native void native_onNextRequestPolicy(long j, NextRequestPolicyOuterClass$NextRequestPolicy nextRequestPolicyOuterClass$NextRequestPolicy);

        private native void native_onOnesieLiveMetadata(long j, SabrLiveProtos$SabrLiveMetadata sabrLiveProtos$SabrLiveMetadata);

        private native void native_onOnesieMediaDone(long j);

        private native void native_onOnesieMediaHeader(long j, TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange, long j2);

        private native void native_onOnesieSabrSeek(long j, SabrSeekOuterClass$SabrSeek sabrSeekOuterClass$SabrSeek);

        private native void native_onPlatypusOnesieDone(long j, QoeError qoeError);

        private native void native_onRequestIdentifier(long j, RequestIdentifierOuterClass$RequestIdentifier requestIdentifierOuterClass$RequestIdentifier);

        private native void native_onSelectableFormats(long j, SelectableFormatsOuterClass$SelectableFormats selectableFormatsOuterClass$SelectableFormats);

        private native void native_registerSabrDataProvider(long j, SabrDataProviderWrapper sabrDataProviderWrapper);

        private native void native_reportParseError(long j, String str, QoeError qoeError);

        private native void native_setAuthorizedFormats(long j, ArrayList arrayList);

        private native void native_setCuePointDataProvider(long j, CuePointDataProviderWrapper cuePointDataProviderWrapper);

        private native void native_setEnabledTracks(long j, ArrayList arrayList);

        private native void native_setHasMediaView(long j, boolean z);

        private native void native_setHdHdrSupported(long j, boolean z);

        private native void native_setLiveIsEnded(long j);

        private native void native_setMediaCapabilities(long j, MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilities);

        private native void native_setOnesieBandwidthProvider(long j, OnesieBandwidthSampleProvider onesieBandwidthSampleProvider);

        private native void native_setOnesiePlaybackStartPolicy(long j, PlaybackStartPolicyOuterClass$PlaybackStartPolicy playbackStartPolicyOuterClass$PlaybackStartPolicy);

        private native void native_setPlaybackRate(long j, float f);

        private native void native_setSelectedAudioFormats(long j, ArrayList arrayList);

        private native void native_setSelectedCaptionFormats(long j, ArrayList arrayList);

        private native void native_setSelectedVideoFormats(long j, ArrayList arrayList);

        private native void native_transferOnesieDeferredMediaCache(long j, DeferredMediaCache deferredMediaCache);

        private native void native_unregisterSabrDataProvider(long j, SabrDataProviderWrapper sabrDataProviderWrapper);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackController
        public void cancelFetches() {
            native_cancelFetches(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackController
        public void dispose() {
            native_dispose(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackController
        public void onNextRequestPolicy(NextRequestPolicyOuterClass$NextRequestPolicy nextRequestPolicyOuterClass$NextRequestPolicy) {
            native_onNextRequestPolicy(this.nativeRef, nextRequestPolicyOuterClass$NextRequestPolicy);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackController
        public void onOnesieLiveMetadata(SabrLiveProtos$SabrLiveMetadata sabrLiveProtos$SabrLiveMetadata) {
            native_onOnesieLiveMetadata(this.nativeRef, sabrLiveProtos$SabrLiveMetadata);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackController
        public void onOnesieMediaDone() {
            native_onOnesieMediaDone(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackController
        public void onOnesieMediaHeader(TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange, long j) {
            native_onOnesieMediaHeader(this.nativeRef, timeRangeOuterClass$TimeRange, j);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackController
        public void onOnesieSabrSeek(SabrSeekOuterClass$SabrSeek sabrSeekOuterClass$SabrSeek) {
            native_onOnesieSabrSeek(this.nativeRef, sabrSeekOuterClass$SabrSeek);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackController
        public void onPlatypusOnesieDone(QoeError qoeError) {
            native_onPlatypusOnesieDone(this.nativeRef, qoeError);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackController
        public void onRequestIdentifier(RequestIdentifierOuterClass$RequestIdentifier requestIdentifierOuterClass$RequestIdentifier) {
            native_onRequestIdentifier(this.nativeRef, requestIdentifierOuterClass$RequestIdentifier);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackController
        public void onSelectableFormats(SelectableFormatsOuterClass$SelectableFormats selectableFormatsOuterClass$SelectableFormats) {
            native_onSelectableFormats(this.nativeRef, selectableFormatsOuterClass$SelectableFormats);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackController
        public void registerSabrDataProvider(SabrDataProviderWrapper sabrDataProviderWrapper) {
            native_registerSabrDataProvider(this.nativeRef, sabrDataProviderWrapper);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackController
        public void reportParseError(String str, QoeError qoeError) {
            native_reportParseError(this.nativeRef, str, qoeError);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackController
        public void setAuthorizedFormats(ArrayList arrayList) {
            native_setAuthorizedFormats(this.nativeRef, arrayList);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackController
        public void setCuePointDataProvider(CuePointDataProviderWrapper cuePointDataProviderWrapper) {
            native_setCuePointDataProvider(this.nativeRef, cuePointDataProviderWrapper);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackController
        public void setEnabledTracks(ArrayList arrayList) {
            native_setEnabledTracks(this.nativeRef, arrayList);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackController
        public void setHasMediaView(boolean z) {
            native_setHasMediaView(this.nativeRef, z);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackController
        public void setHdHdrSupported(boolean z) {
            native_setHdHdrSupported(this.nativeRef, z);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackController
        public void setLiveIsEnded() {
            native_setLiveIsEnded(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackController
        public void setMediaCapabilities(MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilities) {
            native_setMediaCapabilities(this.nativeRef, mediaCapabilitiesOuterClass$MediaCapabilities);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackController
        public void setOnesieBandwidthProvider(OnesieBandwidthSampleProvider onesieBandwidthSampleProvider) {
            native_setOnesieBandwidthProvider(this.nativeRef, onesieBandwidthSampleProvider);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackController
        public void setOnesiePlaybackStartPolicy(PlaybackStartPolicyOuterClass$PlaybackStartPolicy playbackStartPolicyOuterClass$PlaybackStartPolicy) {
            native_setOnesiePlaybackStartPolicy(this.nativeRef, playbackStartPolicyOuterClass$PlaybackStartPolicy);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackController
        public void setPlaybackRate(float f) {
            native_setPlaybackRate(this.nativeRef, f);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackController
        public void setSelectedAudioFormats(ArrayList arrayList) {
            native_setSelectedAudioFormats(this.nativeRef, arrayList);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackController
        public void setSelectedCaptionFormats(ArrayList arrayList) {
            native_setSelectedCaptionFormats(this.nativeRef, arrayList);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackController
        public void setSelectedVideoFormats(ArrayList arrayList) {
            native_setSelectedVideoFormats(this.nativeRef, arrayList);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackController
        public void transferOnesieDeferredMediaCache(DeferredMediaCache deferredMediaCache) {
            native_transferOnesieDeferredMediaCache(this.nativeRef, deferredMediaCache);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.PlaybackController
        public void unregisterSabrDataProvider(SabrDataProviderWrapper sabrDataProviderWrapper) {
            native_unregisterSabrDataProvider(this.nativeRef, sabrDataProviderWrapper);
        }
    }

    public abstract void cancelFetches();

    public abstract void dispose();

    public abstract void onNextRequestPolicy(NextRequestPolicyOuterClass$NextRequestPolicy nextRequestPolicyOuterClass$NextRequestPolicy);

    public abstract void onOnesieLiveMetadata(SabrLiveProtos$SabrLiveMetadata sabrLiveProtos$SabrLiveMetadata);

    public abstract void onOnesieMediaDone();

    public abstract void onOnesieMediaHeader(TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange, long j);

    public abstract void onOnesieSabrSeek(SabrSeekOuterClass$SabrSeek sabrSeekOuterClass$SabrSeek);

    public abstract void onPlatypusOnesieDone(QoeError qoeError);

    public abstract void onRequestIdentifier(RequestIdentifierOuterClass$RequestIdentifier requestIdentifierOuterClass$RequestIdentifier);

    public abstract void onSelectableFormats(SelectableFormatsOuterClass$SelectableFormats selectableFormatsOuterClass$SelectableFormats);

    public abstract void registerSabrDataProvider(SabrDataProviderWrapper sabrDataProviderWrapper);

    public abstract void reportParseError(String str, QoeError qoeError);

    public abstract void setAuthorizedFormats(ArrayList arrayList);

    public abstract void setCuePointDataProvider(CuePointDataProviderWrapper cuePointDataProviderWrapper);

    public abstract void setEnabledTracks(ArrayList arrayList);

    public abstract void setHasMediaView(boolean z);

    public abstract void setHdHdrSupported(boolean z);

    public abstract void setLiveIsEnded();

    public abstract void setMediaCapabilities(MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilities);

    public abstract void setOnesieBandwidthProvider(OnesieBandwidthSampleProvider onesieBandwidthSampleProvider);

    public abstract void setOnesiePlaybackStartPolicy(PlaybackStartPolicyOuterClass$PlaybackStartPolicy playbackStartPolicyOuterClass$PlaybackStartPolicy);

    public abstract void setPlaybackRate(float f);

    public abstract void setSelectedAudioFormats(ArrayList arrayList);

    public abstract void setSelectedCaptionFormats(ArrayList arrayList);

    public abstract void setSelectedVideoFormats(ArrayList arrayList);

    public abstract void transferOnesieDeferredMediaCache(DeferredMediaCache deferredMediaCache);

    public abstract void unregisterSabrDataProvider(SabrDataProviderWrapper sabrDataProviderWrapper);
}

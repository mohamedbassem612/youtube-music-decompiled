package com.google.android.libraries.youtube.media.interfaces;

import com.google.protos.youtube.api.innertube.BandwidthSamplingPolicyOuterClass$BandwidthSamplingPolicy;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class SharedBandwidthSampleTracker {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends SharedBandwidthSampleTracker {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }

        public static native SharedBandwidthSampleTracker create(BandwidthSamplingPolicyOuterClass$BandwidthSamplingPolicy bandwidthSamplingPolicyOuterClass$BandwidthSamplingPolicy, int i, MetadataStore metadataStore);

        public static native void nativeDestroy(long j);

        private native ArrayList native_getBandwidthSamples(long j);

        private native void native_loadPersistentBandwidthSamplesAsync(long j);

        private native void native_persistBandwidthSamples(long j);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.SharedBandwidthSampleTracker
        public ArrayList getBandwidthSamples() {
            return native_getBandwidthSamples(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.SharedBandwidthSampleTracker
        public void loadPersistentBandwidthSamplesAsync() {
            native_loadPersistentBandwidthSamplesAsync(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.SharedBandwidthSampleTracker
        public void persistBandwidthSamples() {
            native_persistBandwidthSamples(this.nativeRef);
        }
    }

    public static SharedBandwidthSampleTracker create(BandwidthSamplingPolicyOuterClass$BandwidthSamplingPolicy bandwidthSamplingPolicyOuterClass$BandwidthSamplingPolicy, int i, MetadataStore metadataStore) {
        return CppProxy.create(bandwidthSamplingPolicyOuterClass$BandwidthSamplingPolicy, i, metadataStore);
    }

    public abstract ArrayList getBandwidthSamples();

    public abstract void loadPersistentBandwidthSamplesAsync();

    public abstract void persistBandwidthSamples();
}

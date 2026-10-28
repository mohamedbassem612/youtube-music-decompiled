package com.google.android.libraries.youtube.media.interfaces;

import com.google.android.apps.youtube.proto.streaming.BandwidthSamplingConfigOuterClass$BandwidthSamplingConfig;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class NetFetchTask {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends NetFetchTask {
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

        private native void native_cancel(long j);

        private native void native_onPauseBandwidthSamplingHint(long j, BandwidthSamplingConfigOuterClass$BandwidthSamplingConfig bandwidthSamplingConfigOuterClass$BandwidthSamplingConfig);

        private native void native_onStartBandwidthSamplingHint(long j, BandwidthSamplingConfigOuterClass$BandwidthSamplingConfig bandwidthSamplingConfigOuterClass$BandwidthSamplingConfig);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.NetFetchTask
        public void cancel() {
            native_cancel(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.NetFetchTask
        public void onPauseBandwidthSamplingHint(BandwidthSamplingConfigOuterClass$BandwidthSamplingConfig bandwidthSamplingConfigOuterClass$BandwidthSamplingConfig) {
            native_onPauseBandwidthSamplingHint(this.nativeRef, bandwidthSamplingConfigOuterClass$BandwidthSamplingConfig);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.NetFetchTask
        public void onStartBandwidthSamplingHint(BandwidthSamplingConfigOuterClass$BandwidthSamplingConfig bandwidthSamplingConfigOuterClass$BandwidthSamplingConfig) {
            native_onStartBandwidthSamplingHint(this.nativeRef, bandwidthSamplingConfigOuterClass$BandwidthSamplingConfig);
        }
    }

    public abstract void cancel();

    public abstract void onPauseBandwidthSamplingHint(BandwidthSamplingConfigOuterClass$BandwidthSamplingConfig bandwidthSamplingConfigOuterClass$BandwidthSamplingConfig);

    public abstract void onStartBandwidthSamplingHint(BandwidthSamplingConfigOuterClass$BandwidthSamplingConfig bandwidthSamplingConfigOuterClass$BandwidthSamplingConfig);
}

package com.google.android.libraries.youtube.media.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class OnesieBandwidthSampleProvider {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends OnesieBandwidthSampleProvider {
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

        private native double native_getRealtimeRequestBandwidthBytesPerSec(long j);

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

        @Override // com.google.android.libraries.youtube.media.interfaces.OnesieBandwidthSampleProvider
        public double getRealtimeRequestBandwidthBytesPerSec() {
            return native_getRealtimeRequestBandwidthBytesPerSec(this.nativeRef);
        }
    }

    public abstract double getRealtimeRequestBandwidthBytesPerSec();
}

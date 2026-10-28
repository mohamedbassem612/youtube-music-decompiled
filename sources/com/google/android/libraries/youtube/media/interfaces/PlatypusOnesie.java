package com.google.android.libraries.youtube.media.interfaces;

import com.google.protos.youtube.api.innertube.MediaFetchColdConfigOuterClass$MediaFetchColdConfig;
import com.google.protos.youtube.api.innertube.MediaFetchHotConfigOuterClass$MediaFetchHotConfig;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class PlatypusOnesie {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends PlatypusOnesie {
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }

        public static native OnesieFetchManager createOnesieFetchManager();

        public static native OnesieResponseHandler createOnesieResponseHandler(PlatformOnesieCallbacks platformOnesieCallbacks, LatencyLogger latencyLogger, QoeLogger qoeLogger, NetFetch netFetch, String str, MediaFetchHotConfigOuterClass$MediaFetchHotConfig mediaFetchHotConfigOuterClass$MediaFetchHotConfig, MediaFetchColdConfigOuterClass$MediaFetchColdConfig mediaFetchColdConfigOuterClass$MediaFetchColdConfig, byte[] bArr, SharedBandwidthSampleTracker sharedBandwidthSampleTracker, Executor executor);

        public static native void nativeDestroy(long j);

        public static native OnesieFetcher startOnesieFetch(PlatformOnesieCallbacks platformOnesieCallbacks, LatencyLogger latencyLogger, QoeLogger qoeLogger, NetFetch netFetch, String str, MediaFetchHotConfigOuterClass$MediaFetchHotConfig mediaFetchHotConfigOuterClass$MediaFetchHotConfig, MediaFetchColdConfigOuterClass$MediaFetchColdConfig mediaFetchColdConfigOuterClass$MediaFetchColdConfig, byte[] bArr, Executor executor, HttpRequest httpRequest, OnesieRetryConfig onesieRetryConfig);

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
    }

    public static OnesieFetchManager createOnesieFetchManager() {
        return CppProxy.createOnesieFetchManager();
    }

    public static OnesieResponseHandler createOnesieResponseHandler(PlatformOnesieCallbacks platformOnesieCallbacks, LatencyLogger latencyLogger, QoeLogger qoeLogger, NetFetch netFetch, String str, MediaFetchHotConfigOuterClass$MediaFetchHotConfig mediaFetchHotConfigOuterClass$MediaFetchHotConfig, MediaFetchColdConfigOuterClass$MediaFetchColdConfig mediaFetchColdConfigOuterClass$MediaFetchColdConfig, byte[] bArr, SharedBandwidthSampleTracker sharedBandwidthSampleTracker, Executor executor) {
        return CppProxy.createOnesieResponseHandler(platformOnesieCallbacks, latencyLogger, qoeLogger, netFetch, str, mediaFetchHotConfigOuterClass$MediaFetchHotConfig, mediaFetchColdConfigOuterClass$MediaFetchColdConfig, bArr, sharedBandwidthSampleTracker, executor);
    }

    public static OnesieFetcher startOnesieFetch(PlatformOnesieCallbacks platformOnesieCallbacks, LatencyLogger latencyLogger, QoeLogger qoeLogger, NetFetch netFetch, String str, MediaFetchHotConfigOuterClass$MediaFetchHotConfig mediaFetchHotConfigOuterClass$MediaFetchHotConfig, MediaFetchColdConfigOuterClass$MediaFetchColdConfig mediaFetchColdConfigOuterClass$MediaFetchColdConfig, byte[] bArr, Executor executor, HttpRequest httpRequest, OnesieRetryConfig onesieRetryConfig) {
        return CppProxy.startOnesieFetch(platformOnesieCallbacks, latencyLogger, qoeLogger, netFetch, str, mediaFetchHotConfigOuterClass$MediaFetchHotConfig, mediaFetchColdConfigOuterClass$MediaFetchColdConfig, bArr, executor, httpRequest, onesieRetryConfig);
    }
}

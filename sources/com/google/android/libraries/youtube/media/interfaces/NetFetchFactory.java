package com.google.android.libraries.youtube.media.interfaces;

import com.google.protos.youtube.api.innertube.MediaFetchColdConfigOuterClass$EnvoyNetFetchConfig;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class NetFetchFactory {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends NetFetchFactory {
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }

        public static native NetFetch createEnvoyNetFetch(Executor executor, String str, MediaFetchColdConfigOuterClass$EnvoyNetFetchConfig mediaFetchColdConfigOuterClass$EnvoyNetFetchConfig);

        public static native void nativeDestroy(long j);

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

    public static NetFetch createEnvoyNetFetch(Executor executor, String str, MediaFetchColdConfigOuterClass$EnvoyNetFetchConfig mediaFetchColdConfigOuterClass$EnvoyNetFetchConfig) {
        return CppProxy.createEnvoyNetFetch(executor, str, mediaFetchColdConfigOuterClass$EnvoyNetFetchConfig);
    }
}

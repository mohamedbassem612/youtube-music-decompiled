package com.google.android.libraries.youtube.composition;

import com.google.android.libraries.youtube.composition.assets.asset.AndroidAssetManager;
import com.google.android.libraries.youtube.composition.assets.asset.AndroidContentProvider;
import com.google.android.libraries.youtube.composition.assets.movie.AndroidDecoderSelector;
import com.google.android.libraries.youtube.composition.assets.movie.AndroidEncoderSelector;
import com.google.android.libraries.youtube.composition.assets.movie.AndroidMediaExtractorFactory;
import com.google.android.libraries.youtube.composition.assets.movie.AndroidMediaMuxerFactory;
import com.google.android.libraries.youtube.composition.assets.net.InnertubeContextProvider;
import com.google.android.libraries.youtube.composition.assets.net.OauthTokenProvider;
import com.google.android.libraries.youtube.composition.common.concurrency.CallbackExecutor;
import com.google.android.libraries.youtube.composition.common.types.StatusOr;
import com.google.android.libraries.youtube.composition.debug.MedicConnection;
import com.google.android.libraries.youtube.composition.experiment.CompositionRuntimeFlags;
import com.google.android.libraries.youtube.composition.logger.ClientLogger;
import com.google.android.libraries.youtube.composition.logging.CompositionRuntimeLifecycleListener;
import com.google.protos.youtube.api.innertube.MediaFetchColdConfigOuterClass$EnvoyNetFetchConfig;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AndroidRuntimeCreator {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends AndroidRuntimeCreator {
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }

        public static native StatusOr createCompositionRuntime(CallbackExecutor callbackExecutor, AndroidMediaExtractorFactory androidMediaExtractorFactory, AndroidMediaMuxerFactory androidMediaMuxerFactory, AndroidDecoderSelector androidDecoderSelector, AndroidEncoderSelector androidEncoderSelector, ClientLogger clientLogger, MedicConnection medicConnection, CompositionRuntimeFlags compositionRuntimeFlags, AndroidContentProvider androidContentProvider, String str, AndroidAssetManager androidAssetManager, CompositionRuntimeLifecycleListener compositionRuntimeLifecycleListener, String str2, MediaFetchColdConfigOuterClass$EnvoyNetFetchConfig mediaFetchColdConfigOuterClass$EnvoyNetFetchConfig, InnertubeContextProvider innertubeContextProvider, OauthTokenProvider oauthTokenProvider);

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

    public static StatusOr createCompositionRuntime(CallbackExecutor callbackExecutor, AndroidMediaExtractorFactory androidMediaExtractorFactory, AndroidMediaMuxerFactory androidMediaMuxerFactory, AndroidDecoderSelector androidDecoderSelector, AndroidEncoderSelector androidEncoderSelector, ClientLogger clientLogger, MedicConnection medicConnection, CompositionRuntimeFlags compositionRuntimeFlags, AndroidContentProvider androidContentProvider, String str, AndroidAssetManager androidAssetManager, CompositionRuntimeLifecycleListener compositionRuntimeLifecycleListener, String str2, MediaFetchColdConfigOuterClass$EnvoyNetFetchConfig mediaFetchColdConfigOuterClass$EnvoyNetFetchConfig, InnertubeContextProvider innertubeContextProvider, OauthTokenProvider oauthTokenProvider) {
        return CppProxy.createCompositionRuntime(callbackExecutor, androidMediaExtractorFactory, androidMediaMuxerFactory, androidDecoderSelector, androidEncoderSelector, clientLogger, medicConnection, compositionRuntimeFlags, androidContentProvider, str, androidAssetManager, compositionRuntimeLifecycleListener, str2, mediaFetchColdConfigOuterClass$EnvoyNetFetchConfig, innertubeContextProvider, oauthTokenProvider);
    }
}

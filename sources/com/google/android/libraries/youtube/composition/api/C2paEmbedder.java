package com.google.android.libraries.youtube.composition.api;

import com.google.android.libraries.youtube.composition.assets.provenance.c2pa.ClientC2paEmbedder;
import com.google.android.libraries.youtube.composition.logger.ClientLogger;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C2paEmbedder {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends C2paEmbedder {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }

        public static native C2paEmbedder create(ClientC2paEmbedder clientC2paEmbedder, ClientLogger clientLogger);

        public static native void nativeDestroy(long j);

        private native ListenableFuture native_embed(long j, C2paEmbedRequest c2paEmbedRequest);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.composition.api.C2paEmbedder
        public ListenableFuture embed(C2paEmbedRequest c2paEmbedRequest) {
            return native_embed(this.nativeRef, c2paEmbedRequest);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }
    }

    public static C2paEmbedder create(ClientC2paEmbedder clientC2paEmbedder, ClientLogger clientLogger) {
        return CppProxy.create(clientC2paEmbedder, clientLogger);
    }

    public abstract ListenableFuture embed(C2paEmbedRequest c2paEmbedRequest);
}

package com.google.android.libraries.youtube.media.interfaces;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class OnesieResponseHandler {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends OnesieResponseHandler {
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

        private native NetFetchCallbacks native_getNetFetchCallbacks(long j);

        private native HashSet native_getReceivedVideoIds(long j);

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

        @Override // com.google.android.libraries.youtube.media.interfaces.OnesieResponseHandler
        public NetFetchCallbacks getNetFetchCallbacks() {
            return native_getNetFetchCallbacks(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.OnesieResponseHandler
        public HashSet getReceivedVideoIds() {
            return native_getReceivedVideoIds(this.nativeRef);
        }
    }

    public abstract NetFetchCallbacks getNetFetchCallbacks();

    public abstract HashSet getReceivedVideoIds();
}

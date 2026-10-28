package com.google.android.libraries.youtube.media.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class OnesieFetcher {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends OnesieFetcher {
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

        private native void native_beginFetch(long j);

        private native void native_cancelFetch(long j);

        private native void native_onNetworkConnected(long j);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.OnesieFetcher
        public void beginFetch() {
            native_beginFetch(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.OnesieFetcher
        public void cancelFetch() {
            native_cancelFetch(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.OnesieFetcher
        public void onNetworkConnected() {
            native_onNetworkConnected(this.nativeRef);
        }
    }

    public abstract void beginFetch();

    public abstract void cancelFetch();

    public abstract void onNetworkConnected();
}

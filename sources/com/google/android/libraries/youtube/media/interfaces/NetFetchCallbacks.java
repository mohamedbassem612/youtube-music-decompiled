package com.google.android.libraries.youtube.media.interfaces;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class NetFetchCallbacks {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends NetFetchCallbacks {
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

        private native void native_onBodyData(long j, ByteBuffer byteBuffer);

        private native void native_onDone(long j, QoeError qoeError, boolean z);

        private native void native_onHttpResponse(long j, HttpResponse httpResponse);

        private native void native_onRedirect(long j, String str);

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

        @Override // com.google.android.libraries.youtube.media.interfaces.NetFetchCallbacks
        public void onBodyData(ByteBuffer byteBuffer) {
            native_onBodyData(this.nativeRef, byteBuffer);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.NetFetchCallbacks
        public void onDone(QoeError qoeError, boolean z) {
            native_onDone(this.nativeRef, qoeError, z);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.NetFetchCallbacks
        public void onHttpResponse(HttpResponse httpResponse) {
            native_onHttpResponse(this.nativeRef, httpResponse);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.NetFetchCallbacks
        public void onRedirect(String str) {
            native_onRedirect(this.nativeRef, str);
        }
    }

    public abstract void onBodyData(ByteBuffer byteBuffer);

    public abstract void onDone(QoeError qoeError, boolean z);

    public abstract void onHttpResponse(HttpResponse httpResponse);

    public abstract void onRedirect(String str);
}

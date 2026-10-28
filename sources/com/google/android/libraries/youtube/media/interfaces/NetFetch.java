package com.google.android.libraries.youtube.media.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class NetFetch {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends NetFetch {
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

        private native void native_onDefaultNetworkAvailable(long j);

        private native void native_onDefaultNetworkChange(long j, int i);

        private native void native_onDefaultNetworkUnavailable(long j);

        private native void native_onProxySettingsChange(long j, String str, int i);

        private native NetFetchTask native_startFetchTask(long j, HttpRequest httpRequest, NetFetchCallbacks netFetchCallbacks);

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

        @Override // com.google.android.libraries.youtube.media.interfaces.NetFetch
        public void onDefaultNetworkAvailable() {
            native_onDefaultNetworkAvailable(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.NetFetch
        public void onDefaultNetworkChange(int i) {
            native_onDefaultNetworkChange(this.nativeRef, i);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.NetFetch
        public void onDefaultNetworkUnavailable() {
            native_onDefaultNetworkUnavailable(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.NetFetch
        public void onProxySettingsChange(String str, int i) {
            native_onProxySettingsChange(this.nativeRef, str, i);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.NetFetch
        public NetFetchTask startFetchTask(HttpRequest httpRequest, NetFetchCallbacks netFetchCallbacks) {
            return native_startFetchTask(this.nativeRef, httpRequest, netFetchCallbacks);
        }
    }

    public abstract void onDefaultNetworkAvailable();

    public abstract void onDefaultNetworkChange(int i);

    public abstract void onDefaultNetworkUnavailable();

    public abstract void onProxySettingsChange(String str, int i);

    public abstract NetFetchTask startFetchTask(HttpRequest httpRequest, NetFetchCallbacks netFetchCallbacks);
}

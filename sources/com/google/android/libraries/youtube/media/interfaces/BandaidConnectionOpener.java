package com.google.android.libraries.youtube.media.interfaces;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class BandaidConnectionOpener {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends BandaidConnectionOpener {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }

        public static native BandaidConnectionOpener create(NetFetch netFetch, Executor executor, BandaidConnectionOpenerConfig bandaidConnectionOpenerConfig);

        public static native void nativeDestroy(long j);

        private native void native_addValidBandaidUri(long j, String str);

        private native PrewarmedHostInfo native_getAlternatePrewarmedHostInfo(long j, String str);

        private native long native_getBackoffDelayMs(long j);

        private native ArrayList native_getConnectionHosts(long j);

        private native long native_getCreatedRealTimeMs(long j);

        private native long native_getLastStartedRealTimeMs(long j);

        private native PrewarmedHostInfo native_getOpenedPrewarmedHostInfo(long j);

        private native String native_getStopReason(long j);

        private native void native_onNetworkActiveStateChanged(long j, boolean z);

        private native void native_onNetworkChange(long j, int i);

        private native void native_start(long j, long j2);

        private native void native_stop(long j, String str);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.BandaidConnectionOpener
        public void addValidBandaidUri(String str) {
            native_addValidBandaidUri(this.nativeRef, str);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.BandaidConnectionOpener
        public PrewarmedHostInfo getAlternatePrewarmedHostInfo(String str) {
            return native_getAlternatePrewarmedHostInfo(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.BandaidConnectionOpener
        public long getBackoffDelayMs() {
            return native_getBackoffDelayMs(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.BandaidConnectionOpener
        public ArrayList getConnectionHosts() {
            return native_getConnectionHosts(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.BandaidConnectionOpener
        public long getCreatedRealTimeMs() {
            return native_getCreatedRealTimeMs(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.BandaidConnectionOpener
        public long getLastStartedRealTimeMs() {
            return native_getLastStartedRealTimeMs(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.BandaidConnectionOpener
        public PrewarmedHostInfo getOpenedPrewarmedHostInfo() {
            return native_getOpenedPrewarmedHostInfo(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.BandaidConnectionOpener
        public String getStopReason() {
            return native_getStopReason(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.BandaidConnectionOpener
        public void onNetworkActiveStateChanged(boolean z) {
            native_onNetworkActiveStateChanged(this.nativeRef, z);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.BandaidConnectionOpener
        public void onNetworkChange(int i) {
            native_onNetworkChange(this.nativeRef, i);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.BandaidConnectionOpener
        public void start(long j) {
            native_start(this.nativeRef, j);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.BandaidConnectionOpener
        public void stop(String str) {
            native_stop(this.nativeRef, str);
        }
    }

    public static BandaidConnectionOpener create(NetFetch netFetch, Executor executor, BandaidConnectionOpenerConfig bandaidConnectionOpenerConfig) {
        return CppProxy.create(netFetch, executor, bandaidConnectionOpenerConfig);
    }

    public abstract void addValidBandaidUri(String str);

    public abstract PrewarmedHostInfo getAlternatePrewarmedHostInfo(String str);

    public abstract long getBackoffDelayMs();

    public abstract ArrayList getConnectionHosts();

    public abstract long getCreatedRealTimeMs();

    public abstract long getLastStartedRealTimeMs();

    public abstract PrewarmedHostInfo getOpenedPrewarmedHostInfo();

    public abstract String getStopReason();

    public abstract void onNetworkActiveStateChanged(boolean z);

    public abstract void onNetworkChange(int i);

    public abstract void start(long j);

    public abstract void stop(String str);
}

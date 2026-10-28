package com.google.android.libraries.youtube.composition.api;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.InnertubeContext$ClickTrackingInfo;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AssetManager {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends AssetManager {
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

        private native void native_destroy(long j);

        private native ListenableFuture native_getAsset(long j, ArrayList arrayList, AssetUserType assetUserType, InnertubeContext$ClickTrackingInfo innertubeContext$ClickTrackingInfo);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.composition.api.AssetManager
        public void destroy() {
            native_destroy(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.youtube.composition.api.AssetManager
        public ListenableFuture getAsset(ArrayList arrayList, AssetUserType assetUserType, InnertubeContext$ClickTrackingInfo innertubeContext$ClickTrackingInfo) {
            return native_getAsset(this.nativeRef, arrayList, assetUserType, innertubeContext$ClickTrackingInfo);
        }
    }

    public abstract void destroy();

    public abstract ListenableFuture getAsset(ArrayList arrayList, AssetUserType assetUserType, InnertubeContext$ClickTrackingInfo innertubeContext$ClickTrackingInfo);
}

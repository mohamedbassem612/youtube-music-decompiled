package com.google.android.libraries.youtube.composition.api;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class TimelineController {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends TimelineController {
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

        private native void native_start(long j);

        private native void native_stop(long j);

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

        @Override // com.google.android.libraries.youtube.composition.api.TimelineController
        public void start() {
            native_start(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.composition.api.TimelineController
        public void stop() {
            native_stop(this.nativeRef);
        }
    }

    public abstract void start();

    public abstract void stop();
}

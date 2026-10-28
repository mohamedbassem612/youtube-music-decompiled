package com.google.android.libraries.youtube.media.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class SconeBitrateTracker {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends SconeBitrateTracker {
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }

        public static native long getLatestRawSconeKbps();

        public static native long getMinimumSconeKbps();

        public static native long getSecondsSinceLatestSconeSample();

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

    public static long getLatestRawSconeKbps() {
        return CppProxy.getLatestRawSconeKbps();
    }

    public static long getMinimumSconeKbps() {
        return CppProxy.getMinimumSconeKbps();
    }

    public static long getSecondsSinceLatestSconeSample() {
        return CppProxy.getSecondsSinceLatestSconeSample();
    }
}

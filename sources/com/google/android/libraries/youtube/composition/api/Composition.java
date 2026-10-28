package com.google.android.libraries.youtube.composition.api;

import android.util.Size;
import com.google.android.libraries.youtube.composition.common.types.StatusOr;
import com.google.android.libraries.youtube.media.interfaces.Time;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Composition {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends Composition {
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

        private native StatusOr native_getSegmentBounds(long j, String str, Time time, Size size);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.composition.api.Composition
        public void destroy() {
            native_destroy(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.youtube.composition.api.Composition
        public StatusOr getSegmentBounds(String str, Time time, Size size) {
            return native_getSegmentBounds(this.nativeRef, str, time, size);
        }
    }

    public abstract void destroy();

    public abstract StatusOr getSegmentBounds(String str, Time time, Size size);
}

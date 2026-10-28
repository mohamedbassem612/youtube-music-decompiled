package com.google.android.libraries.youtube.composition.debug;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class MedicConnection {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends MedicConnection {
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

        private native void native_sendDataToHost(long j, ByteBuffer byteBuffer);

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

        @Override // com.google.android.libraries.youtube.composition.debug.MedicConnection
        public void sendDataToHost(ByteBuffer byteBuffer) {
            native_sendDataToHost(this.nativeRef, byteBuffer);
        }
    }

    public abstract void sendDataToHost(ByteBuffer byteBuffer);
}

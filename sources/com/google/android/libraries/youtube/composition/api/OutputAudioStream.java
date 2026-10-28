package com.google.android.libraries.youtube.composition.api;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class OutputAudioStream {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends OutputAudioStream {
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

        private native AudioStream native_getAudioStream(long j);

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

        @Override // com.google.android.libraries.youtube.composition.api.OutputAudioStream
        public AudioStream getAudioStream() {
            return native_getAudioStream(this.nativeRef);
        }
    }

    public abstract AudioStream getAudioStream();
}

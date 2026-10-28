package com.google.android.libraries.youtube.composition.api;

import io.grpc.Status;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Presenter {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends Presenter {
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

        private native Status native_setAudioStream(long j, AudioStream audioStream);

        private native Status native_setVideoStream(long j, VideoStream videoStream);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.composition.api.Presenter
        public void destroy() {
            native_destroy(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.youtube.composition.api.Presenter
        public Status setAudioStream(AudioStream audioStream) {
            return native_setAudioStream(this.nativeRef, audioStream);
        }

        @Override // com.google.android.libraries.youtube.composition.api.Presenter
        public Status setVideoStream(VideoStream videoStream) {
            return native_setVideoStream(this.nativeRef, videoStream);
        }
    }

    public abstract void destroy();

    public abstract Status setAudioStream(AudioStream audioStream);

    public abstract Status setVideoStream(VideoStream videoStream);
}

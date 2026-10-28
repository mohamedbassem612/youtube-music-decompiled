package com.google.android.libraries.youtube.media.interfaces;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class VideoplaybackUmpParser {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends VideoplaybackUmpParser {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }

        public static native VideoplaybackUmpParser create(VideoplaybackUmpParserCallbacks videoplaybackUmpParserCallbacks);

        public static native void nativeDestroy(long j);

        private native void native_dispose(long j);

        private native void native_pushData(long j, ByteBuffer byteBuffer);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.VideoplaybackUmpParser
        public void dispose() {
            native_dispose(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.VideoplaybackUmpParser
        public void pushData(ByteBuffer byteBuffer) {
            native_pushData(this.nativeRef, byteBuffer);
        }
    }

    public static VideoplaybackUmpParser create(VideoplaybackUmpParserCallbacks videoplaybackUmpParserCallbacks) {
        return CppProxy.create(videoplaybackUmpParserCallbacks);
    }

    public abstract void dispose();

    public abstract void pushData(ByteBuffer byteBuffer);
}

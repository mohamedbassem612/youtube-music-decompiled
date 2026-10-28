package com.google.android.libraries.youtube.media.interfaces;

import com.google.android.apps.youtube.proto.streaming.SelectableFormatsOuterClass$SelectableFormats;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class OnesieResponseSelector {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends OnesieResponseSelector {
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

        private native BufferManager native_getBufferManager(long j, String str);

        private native SelectableFormatsOuterClass$SelectableFormats native_getSelectableFormats(long j, String str);

        private native boolean native_isCompatibleWithPlayerResponse(long j, String str, PlayerResponseCompatibilityRequirements playerResponseCompatibilityRequirements);

        private native boolean native_isOnesieActiveForPlaybackControllerCreation(long j, String str);

        private native void native_selectForPlayback(long j, String str, PlaybackController playbackController);

        private native void native_unselectForPlaybackAndDispose(long j, String str);

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

        @Override // com.google.android.libraries.youtube.media.interfaces.OnesieResponseSelector
        public BufferManager getBufferManager(String str) {
            return native_getBufferManager(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.OnesieResponseSelector
        public SelectableFormatsOuterClass$SelectableFormats getSelectableFormats(String str) {
            return native_getSelectableFormats(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.OnesieResponseSelector
        public boolean isCompatibleWithPlayerResponse(String str, PlayerResponseCompatibilityRequirements playerResponseCompatibilityRequirements) {
            return native_isCompatibleWithPlayerResponse(this.nativeRef, str, playerResponseCompatibilityRequirements);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.OnesieResponseSelector
        public boolean isOnesieActiveForPlaybackControllerCreation(String str) {
            return native_isOnesieActiveForPlaybackControllerCreation(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.OnesieResponseSelector
        public void selectForPlayback(String str, PlaybackController playbackController) {
            native_selectForPlayback(this.nativeRef, str, playbackController);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.OnesieResponseSelector
        public void unselectForPlaybackAndDispose(String str) {
            native_unselectForPlaybackAndDispose(this.nativeRef, str);
        }
    }

    public abstract BufferManager getBufferManager(String str);

    public abstract SelectableFormatsOuterClass$SelectableFormats getSelectableFormats(String str);

    public abstract boolean isCompatibleWithPlayerResponse(String str, PlayerResponseCompatibilityRequirements playerResponseCompatibilityRequirements);

    public abstract boolean isOnesieActiveForPlaybackControllerCreation(String str);

    public abstract void selectForPlayback(String str, PlaybackController playbackController);

    public abstract void unselectForPlaybackAndDispose(String str);
}

package com.google.android.libraries.youtube.composition.api;

import com.google.android.libraries.youtube.composition.common.types.StatusOr;
import com.google.protos.youtube.api.innertube.CompositionProto$Composition;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Compositor {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends Compositor {
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

        private native TimelineController native_getDefaultTimelineController(long j);

        private native StatusOr native_getOutputAudioStream(long j, String str);

        private native StatusOr native_getOutputVideoStream(long j, String str);

        private native StatusOr native_getTimelineController(long j, String str);

        private native void native_updateComposition(long j, CompositionProto$Composition compositionProto$Composition);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.composition.api.Compositor
        public void destroy() {
            native_destroy(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.youtube.composition.api.Compositor
        public TimelineController getDefaultTimelineController() {
            return native_getDefaultTimelineController(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.composition.api.Compositor
        public StatusOr getOutputAudioStream(String str) {
            return native_getOutputAudioStream(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.youtube.composition.api.Compositor
        public StatusOr getOutputVideoStream(String str) {
            return native_getOutputVideoStream(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.youtube.composition.api.Compositor
        public StatusOr getTimelineController(String str) {
            return native_getTimelineController(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.youtube.composition.api.Compositor
        public void updateComposition(CompositionProto$Composition compositionProto$Composition) {
            native_updateComposition(this.nativeRef, compositionProto$Composition);
        }
    }

    public abstract void destroy();

    public abstract TimelineController getDefaultTimelineController();

    public abstract StatusOr getOutputAudioStream(String str);

    public abstract StatusOr getOutputVideoStream(String str);

    public abstract StatusOr getTimelineController(String str);

    public abstract void updateComposition(CompositionProto$Composition compositionProto$Composition);
}

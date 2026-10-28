package com.google.android.libraries.youtube.composition.api;

import android.util.Size;
import android.view.Surface;
import com.google.android.libraries.youtube.composition.common.concurrency.Callback;
import com.google.android.libraries.youtube.composition.common.types.StatusOr;
import com.google.protos.youtube.api.innertube.CompositionProto$Composition;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class PlayerBuilder {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends PlayerBuilder {
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

        private native StatusOr native_build(long j);

        private native void native_setAudioParams(long j, String str);

        private native void native_setComposition(long j, CompositionProto$Composition compositionProto$Composition);

        private native void native_setFps(long j, int i);

        private native void native_setOnOutputProcessed(long j, Callback callback);

        private native void native_setOnPlayerPositionChanged(long j, Callback callback);

        private native void native_setOnPlayerStateChanged(long j, Callback callback);

        private native void native_setOutputSizePx(long j, Size size);

        private native void native_setTargetSizePx(long j, Size size);

        private native void native_setTimelineId(long j, String str);

        private native void native_setVideoParams(long j, String str, Surface surface);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.composition.api.PlayerBuilder
        public StatusOr build() {
            return native_build(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.youtube.composition.api.PlayerBuilder
        public void setAudioParams(String str) {
            native_setAudioParams(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.youtube.composition.api.PlayerBuilder
        public void setComposition(CompositionProto$Composition compositionProto$Composition) {
            native_setComposition(this.nativeRef, compositionProto$Composition);
        }

        @Override // com.google.android.libraries.youtube.composition.api.PlayerBuilder
        public void setFps(int i) {
            native_setFps(this.nativeRef, i);
        }

        @Override // com.google.android.libraries.youtube.composition.api.PlayerBuilder
        public void setOnOutputProcessed(Callback callback) {
            native_setOnOutputProcessed(this.nativeRef, callback);
        }

        @Override // com.google.android.libraries.youtube.composition.api.PlayerBuilder
        public void setOnPlayerPositionChanged(Callback callback) {
            native_setOnPlayerPositionChanged(this.nativeRef, callback);
        }

        @Override // com.google.android.libraries.youtube.composition.api.PlayerBuilder
        public void setOnPlayerStateChanged(Callback callback) {
            native_setOnPlayerStateChanged(this.nativeRef, callback);
        }

        @Override // com.google.android.libraries.youtube.composition.api.PlayerBuilder
        public void setOutputSizePx(Size size) {
            native_setOutputSizePx(this.nativeRef, size);
        }

        @Override // com.google.android.libraries.youtube.composition.api.PlayerBuilder
        public void setTargetSizePx(Size size) {
            native_setTargetSizePx(this.nativeRef, size);
        }

        @Override // com.google.android.libraries.youtube.composition.api.PlayerBuilder
        public void setTimelineId(String str) {
            native_setTimelineId(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.youtube.composition.api.PlayerBuilder
        public void setVideoParams(String str, Surface surface) {
            native_setVideoParams(this.nativeRef, str, surface);
        }
    }

    public abstract StatusOr build();

    public abstract void setAudioParams(String str);

    public abstract void setComposition(CompositionProto$Composition compositionProto$Composition);

    public abstract void setFps(int i);

    public abstract void setOnOutputProcessed(Callback callback);

    public abstract void setOnPlayerPositionChanged(Callback callback);

    public abstract void setOnPlayerStateChanged(Callback callback);

    public abstract void setOutputSizePx(Size size);

    public abstract void setTargetSizePx(Size size);

    public abstract void setTimelineId(String str);

    public abstract void setVideoParams(String str, Surface surface);
}

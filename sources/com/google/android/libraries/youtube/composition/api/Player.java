package com.google.android.libraries.youtube.composition.api;

import android.util.Size;
import android.view.Surface;
import com.google.android.libraries.youtube.media.interfaces.Time;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.CompositionProto$Composition;
import io.grpc.Status;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Player {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends Player {
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

        private native ListenableFuture native_pause(long j);

        private native ListenableFuture native_play(long j);

        private native ListenableFuture native_seek(long j, Time time);

        private native Status native_setDisplaySurface(long j, Surface surface);

        private native Status native_setOutputSizePx(long j, Size size);

        private native Status native_setTargetSizePx(long j, Size size);

        private native void native_setVolume(long j, float f);

        private native ListenableFuture native_updateComposition(long j, CompositionProto$Composition compositionProto$Composition, Time time);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.composition.api.Player
        public void destroy() {
            native_destroy(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.youtube.composition.api.Player
        public ListenableFuture pause() {
            return native_pause(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.composition.api.Player
        public ListenableFuture play() {
            return native_play(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.composition.api.Player
        public ListenableFuture seek(Time time) {
            return native_seek(this.nativeRef, time);
        }

        @Override // com.google.android.libraries.youtube.composition.api.Player
        public Status setDisplaySurface(Surface surface) {
            return native_setDisplaySurface(this.nativeRef, surface);
        }

        @Override // com.google.android.libraries.youtube.composition.api.Player
        public Status setOutputSizePx(Size size) {
            return native_setOutputSizePx(this.nativeRef, size);
        }

        @Override // com.google.android.libraries.youtube.composition.api.Player
        public Status setTargetSizePx(Size size) {
            return native_setTargetSizePx(this.nativeRef, size);
        }

        @Override // com.google.android.libraries.youtube.composition.api.Player
        public void setVolume(float f) {
            native_setVolume(this.nativeRef, f);
        }

        @Override // com.google.android.libraries.youtube.composition.api.Player
        public ListenableFuture updateComposition(CompositionProto$Composition compositionProto$Composition, Time time) {
            return native_updateComposition(this.nativeRef, compositionProto$Composition, time);
        }
    }

    public abstract void destroy();

    public abstract ListenableFuture pause();

    public abstract ListenableFuture play();

    public abstract ListenableFuture seek(Time time);

    public abstract Status setDisplaySurface(Surface surface);

    public abstract Status setOutputSizePx(Size size);

    public abstract Status setTargetSizePx(Size size);

    public abstract void setVolume(float f);

    public abstract ListenableFuture updateComposition(CompositionProto$Composition compositionProto$Composition, Time time);
}

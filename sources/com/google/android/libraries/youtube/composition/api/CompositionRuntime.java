package com.google.android.libraries.youtube.composition.api;

import android.view.Surface;
import com.google.android.libraries.youtube.composition.common.types.StatusOr;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class CompositionRuntime {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends CompositionRuntime {
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

        private native StatusOr native_createCompositor(long j, CompositorOptions compositorOptions);

        private native ExporterBuilder native_createExporterBuilder(long j);

        private native PlayerBuilder native_createPlayerBuilder(long j);

        private native StatusOr native_createPresenter(long j, Surface surface);

        private native StatusOr native_createRecorder(long j, RecorderOptions recorderOptions);

        private native void native_destroy(long j);

        private native StatusOr native_getAssetManager(long j);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.composition.api.CompositionRuntime
        public StatusOr createCompositor(CompositorOptions compositorOptions) {
            return native_createCompositor(this.nativeRef, compositorOptions);
        }

        @Override // com.google.android.libraries.youtube.composition.api.CompositionRuntime
        public ExporterBuilder createExporterBuilder() {
            return native_createExporterBuilder(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.composition.api.CompositionRuntime
        public PlayerBuilder createPlayerBuilder() {
            return native_createPlayerBuilder(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.composition.api.CompositionRuntime
        public StatusOr createPresenter(Surface surface) {
            return native_createPresenter(this.nativeRef, surface);
        }

        @Override // com.google.android.libraries.youtube.composition.api.CompositionRuntime
        public StatusOr createRecorder(RecorderOptions recorderOptions) {
            return native_createRecorder(this.nativeRef, recorderOptions);
        }

        @Override // com.google.android.libraries.youtube.composition.api.CompositionRuntime
        public void destroy() {
            native_destroy(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.youtube.composition.api.CompositionRuntime
        public StatusOr getAssetManager() {
            return native_getAssetManager(this.nativeRef);
        }
    }

    public abstract StatusOr createCompositor(CompositorOptions compositorOptions);

    public abstract ExporterBuilder createExporterBuilder();

    public abstract PlayerBuilder createPlayerBuilder();

    public abstract StatusOr createPresenter(Surface surface);

    public abstract StatusOr createRecorder(RecorderOptions recorderOptions);

    public abstract void destroy();

    public abstract StatusOr getAssetManager();
}

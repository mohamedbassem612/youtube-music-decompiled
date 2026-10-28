package com.google.android.libraries.youtube.media.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Executor {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends Executor {
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

        private native boolean native_isOnExecutor(long j);

        private native void native_schedule(long j, Runnable runnable);

        private native void native_scheduleAfter(long j, long j2, Runnable runnable);

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

        @Override // com.google.android.libraries.youtube.media.interfaces.Executor
        public boolean isOnExecutor() {
            return native_isOnExecutor(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.Executor
        public void schedule(Runnable runnable) {
            native_schedule(this.nativeRef, runnable);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.Executor
        public void scheduleAfter(long j, Runnable runnable) {
            native_scheduleAfter(this.nativeRef, j, runnable);
        }
    }

    public abstract boolean isOnExecutor();

    public abstract void schedule(Runnable runnable);

    public abstract void scheduleAfter(long j, Runnable runnable);
}

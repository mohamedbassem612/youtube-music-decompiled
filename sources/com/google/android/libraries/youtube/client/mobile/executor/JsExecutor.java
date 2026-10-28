package com.google.android.libraries.youtube.client.mobile.executor;

import com.google.android.libraries.elements.interfaces.JSModuleCache;
import com.google.protos.youtube.javascript.JsVmStatisticsOuterClass$JsVmStatistics;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class JsExecutor {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends JsExecutor {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }

        public static native JsExecutor create(JSModuleCache jSModuleCache);

        public static native void nativeDestroy(long j);

        private native JsVmStatisticsOuterClass$JsVmStatistics native_getVmStatistics(long j);

        private native void native_lowMemoryNotification(long j);

        private native void native_memoryPressureNotification(long j, JsMemoryPressureLevel jsMemoryPressureLevel);

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

        @Override // com.google.android.libraries.youtube.client.mobile.executor.JsExecutor
        public JsVmStatisticsOuterClass$JsVmStatistics getVmStatistics() {
            return native_getVmStatistics(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.client.mobile.executor.JsExecutor
        public void lowMemoryNotification() {
            native_lowMemoryNotification(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.client.mobile.executor.JsExecutor
        public void memoryPressureNotification(JsMemoryPressureLevel jsMemoryPressureLevel) {
            native_memoryPressureNotification(this.nativeRef, jsMemoryPressureLevel);
        }
    }

    public static JsExecutor create(JSModuleCache jSModuleCache) {
        return CppProxy.create(jSModuleCache);
    }

    public abstract JsVmStatisticsOuterClass$JsVmStatistics getVmStatistics();

    public abstract void lowMemoryNotification();

    public abstract void memoryPressureNotification(JsMemoryPressureLevel jsMemoryPressureLevel);
}

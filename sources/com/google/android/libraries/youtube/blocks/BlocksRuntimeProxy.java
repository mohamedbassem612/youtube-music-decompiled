package com.google.android.libraries.youtube.blocks;

import com.google.android.libraries.elements.interfaces.BlocksContainerLoaderProxy;
import com.google.android.libraries.elements.interfaces.ExecutorRegistry;
import com.google.android.libraries.elements.interfaces.JSModuleCache;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class BlocksRuntimeProxy {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends BlocksRuntimeProxy {
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }

        public static native BlocksContainerLoaderProxy createContainerLoader();

        public static native void nativeDestroy(long j);

        public static native void setExecutorRegistry(ExecutorRegistry executorRegistry);

        public static native void setJsModuleCache(JSModuleCache jSModuleCache);

        public static native void setJsVmMemoryPressureNotification(boolean z);

        public static native void setLogger(BlocksLogger blocksLogger);

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
    }

    public static BlocksContainerLoaderProxy createContainerLoader() {
        return CppProxy.createContainerLoader();
    }

    public static void setExecutorRegistry(ExecutorRegistry executorRegistry) {
        CppProxy.setExecutorRegistry(executorRegistry);
    }

    public static void setJsModuleCache(JSModuleCache jSModuleCache) {
        CppProxy.setJsModuleCache(jSModuleCache);
    }

    public static void setJsVmMemoryPressureNotification(boolean z) {
        CppProxy.setJsVmMemoryPressureNotification(z);
    }

    public static void setLogger(BlocksLogger blocksLogger) {
        CppProxy.setLogger(blocksLogger);
    }
}

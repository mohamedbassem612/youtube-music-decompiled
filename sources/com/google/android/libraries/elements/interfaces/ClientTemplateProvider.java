package com.google.android.libraries.elements.interfaces;

import defpackage.agp;
import defpackage.nrl;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ClientTemplateProvider {
    private static final agp proxyMap = new agp(6);

    public static ClientTemplateProvider create(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        return CppProxy.create(z, z2, z3, z4, z5, z6, z7, z8);
    }

    private static CppProxy createProxy(long j) {
        CppProxy existingProxy = getExistingProxy(j);
        if (existingProxy != null) {
            return existingProxy;
        }
        CppProxy cppProxy = new CppProxy(j, null);
        proxyMap.d(j, new WeakReference(cppProxy));
        return cppProxy;
    }

    public static void enableHotReload() {
        CppProxy.enableHotReload();
    }

    public static void enablePartialHotReload() {
        CppProxy.enablePartialHotReload();
    }

    private static CppProxy getExistingProxy(long j) {
        agp agpVar = proxyMap;
        WeakReference weakReference = (WeakReference) agpVar.a(j);
        if (weakReference == null) {
            return null;
        }
        CppProxy cppProxy = (CppProxy) weakReference.get();
        if (cppProxy != null) {
            return cppProxy;
        }
        agpVar.e(j);
        return null;
    }

    public static ClientTemplateProvider getSingleton() {
        return CppProxy.getSingleton();
    }

    public static void setEnableAlternateTemplateLookup(boolean z) {
        CppProxy.setEnableAlternateTemplateLookup(z);
    }

    public static void setEnableAsyncEkoBytecodeCompilation(boolean z) {
        CppProxy.setEnableAsyncEkoBytecodeCompilation(z);
    }

    public static void setEnableDehydrateEkoTransforms(boolean z) {
        CppProxy.setEnableDehydrateEkoTransforms(z);
    }

    public static void setEnableEkoArenaFieldSetPresize(boolean z) {
        CppProxy.setEnableEkoArenaFieldSetPresize(z);
    }

    public static void setEnableEkoBytecode(boolean z) {
        CppProxy.setEnableEkoBytecode(z);
    }

    public static void setEnableEkoParseTransformArena(boolean z) {
        CppProxy.setEnableEkoParseTransformArena(z);
    }

    public static void setEnableEkoRuntimeOptimizer(boolean z) {
        CppProxy.setEnableEkoRuntimeOptimizer(z);
    }

    public abstract void addObserver(ClientTemplateProviderObserver clientTemplateProviderObserver);

    public abstract long getTemplatesSize();

    public abstract long getTransformStoreSize();

    public abstract void setEnableLazyEkoBytecodeCompilation(boolean z);

    public abstract void setEnableTrimMemory(boolean z);

    public abstract void trimMemory();

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends ClientTemplateProvider {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        private CppProxy(long j) {
            this.destroyed = new AtomicBoolean(false);
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }

        public static native ClientTemplateProvider create(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8);

        public static native void enableHotReload();

        public static native void enablePartialHotReload();

        public static native ClientTemplateProvider getSingleton();

        public static native void nativeDestroy(long j);

        private native void native_addObserver(long j, ClientTemplateProviderObserver clientTemplateProviderObserver);

        private native long native_getTemplatesSize(long j);

        private native long native_getTransformStoreSize(long j);

        private native void native_setEnableLazyEkoBytecodeCompilation(long j, boolean z);

        private native void native_setEnableTrimMemory(long j, boolean z);

        private native void native_trimMemory(long j);

        public static native void setEnableAlternateTemplateLookup(boolean z);

        public static native void setEnableAsyncEkoBytecodeCompilation(boolean z);

        public static native void setEnableDehydrateEkoTransforms(boolean z);

        public static native void setEnableEkoArenaFieldSetPresize(boolean z);

        public static native void setEnableEkoBytecode(boolean z);

        public static native void setEnableEkoParseTransformArena(boolean z);

        public static native void setEnableEkoRuntimeOptimizer(boolean z);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ClientTemplateProvider
        public void addObserver(ClientTemplateProviderObserver clientTemplateProviderObserver) {
            native_addObserver(this.nativeRef, clientTemplateProviderObserver);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.ClientTemplateProvider
        public long getTemplatesSize() {
            return native_getTemplatesSize(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ClientTemplateProvider
        public long getTransformStoreSize() {
            return native_getTransformStoreSize(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ClientTemplateProvider
        public void setEnableLazyEkoBytecodeCompilation(boolean z) {
            native_setEnableLazyEkoBytecodeCompilation(this.nativeRef, z);
        }

        @Override // com.google.android.libraries.elements.interfaces.ClientTemplateProvider
        public void setEnableTrimMemory(boolean z) {
            native_setEnableTrimMemory(this.nativeRef, z);
        }

        @Override // com.google.android.libraries.elements.interfaces.ClientTemplateProvider
        public void trimMemory() {
            native_trimMemory(this.nativeRef);
        }

        public /* synthetic */ CppProxy(long j, nrl nrlVar) {
            this(j);
        }
    }
}

package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import defpackage.agp;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class JSModuleCache {
    private static final agp proxyMap = new agp(6);

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends JSModuleCache {
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

        public static native JSModuleCache create();

        public static native void nativeDestroy(long j);

        private native void native_addObserver(long j, JSModuleCacheObserver jSModuleCacheObserver);

        private native StatusOr native_getAvailableModuleSetVersion(long j, String str);

        private native JSModuleBytesProvider native_getBytesProvider(long j);

        private native ControllerModuleLoader native_getLoader(long j);

        private native StatusOr native_getModuleContents(long j, String str);

        private native StatusOr native_getModuleDependencies(long j, String str);

        private native StatusOr native_getSerializedModuleConfig(long j, String str);

        private native StatusOr native_isSigned(long j, String str);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSModuleCache
        public void addObserver(JSModuleCacheObserver jSModuleCacheObserver) {
            native_addObserver(this.nativeRef, jSModuleCacheObserver);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.JSModuleCache
        public StatusOr getAvailableModuleSetVersion(String str) {
            return native_getAvailableModuleSetVersion(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSModuleCache
        public JSModuleBytesProvider getBytesProvider() {
            return native_getBytesProvider(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSModuleCache
        public ControllerModuleLoader getLoader() {
            return native_getLoader(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSModuleCache
        public StatusOr getModuleContents(String str) {
            return native_getModuleContents(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSModuleCache
        public StatusOr getModuleDependencies(String str) {
            return native_getModuleDependencies(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSModuleCache
        public StatusOr getSerializedModuleConfig(String str) {
            return native_getSerializedModuleConfig(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSModuleCache
        public StatusOr isSigned(String str) {
            return native_isSigned(this.nativeRef, str);
        }
    }

    public static JSModuleCache create() {
        return CppProxy.create();
    }

    private static CppProxy createProxy(long j) {
        CppProxy existingProxy = getExistingProxy(j);
        if (existingProxy != null) {
            return existingProxy;
        }
        CppProxy cppProxy = new CppProxy(j);
        proxyMap.d(j, new WeakReference(cppProxy));
        return cppProxy;
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

    public abstract void addObserver(JSModuleCacheObserver jSModuleCacheObserver);

    public abstract StatusOr getAvailableModuleSetVersion(String str);

    public abstract JSModuleBytesProvider getBytesProvider();

    public abstract ControllerModuleLoader getLoader();

    public abstract StatusOr getModuleContents(String str);

    public abstract StatusOr getModuleDependencies(String str);

    public abstract StatusOr getSerializedModuleConfig(String str);

    public abstract StatusOr isSigned(String str);
}

package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import defpackage.agp;
import defpackage.nvz;
import io.grpc.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ResourceLoader {
    private static final agp proxyMap = new agp(6);

    public static StatusOr create(ClientTemplateProvider clientTemplateProvider, ControllerModuleLoader controllerModuleLoader, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, ResourceLoaderConfig resourceLoaderConfig) {
        return CppProxy.create(clientTemplateProvider, controllerModuleLoader, publicKeyVerifierProvider, resourceLoaderDelegate, resourceLoaderConfig);
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

    public static StatusOr createWithBlocks(ClientTemplateProvider clientTemplateProvider, ControllerModuleLoader controllerModuleLoader, BlocksContainerLoaderProxy blocksContainerLoaderProxy, ThemeLoaderProxy themeLoaderProxy, CapabilitiesLoaderProxy capabilitiesLoaderProxy, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, ResourceLoaderConfig resourceLoaderConfig, WasmTemplateProvider wasmTemplateProvider) {
        return CppProxy.createWithBlocks(clientTemplateProvider, controllerModuleLoader, blocksContainerLoaderProxy, themeLoaderProxy, capabilitiesLoaderProxy, publicKeyVerifierProvider, resourceLoaderDelegate, resourceLoaderConfig, wasmTemplateProvider);
    }

    public static StatusOr createWithCache(ClientTemplateProvider clientTemplateProvider, ControllerModuleLoader controllerModuleLoader, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, CacheStrategyDelegate cacheStrategyDelegate, ResourceLoaderConfig resourceLoaderConfig) {
        return CppProxy.createWithCache(clientTemplateProvider, controllerModuleLoader, publicKeyVerifierProvider, resourceLoaderDelegate, cacheStrategyDelegate, resourceLoaderConfig);
    }

    public static StatusOr createWithCacheWithBlocks(ClientTemplateProvider clientTemplateProvider, ControllerModuleLoader controllerModuleLoader, BlocksContainerLoaderProxy blocksContainerLoaderProxy, ThemeLoaderProxy themeLoaderProxy, CapabilitiesLoaderProxy capabilitiesLoaderProxy, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, CacheStrategyDelegate cacheStrategyDelegate, ResourceLoaderConfig resourceLoaderConfig, WasmTemplateProvider wasmTemplateProvider) {
        return CppProxy.createWithCacheWithBlocks(clientTemplateProvider, controllerModuleLoader, blocksContainerLoaderProxy, themeLoaderProxy, capabilitiesLoaderProxy, publicKeyVerifierProvider, resourceLoaderDelegate, cacheStrategyDelegate, resourceLoaderConfig, wasmTemplateProvider);
    }

    public static ResourceLoader createWithDefaultConfig(ClientTemplateProvider clientTemplateProvider, ControllerModuleLoader controllerModuleLoader, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, WasmTemplateProvider wasmTemplateProvider) {
        return CppProxy.createWithDefaultConfig(clientTemplateProvider, controllerModuleLoader, publicKeyVerifierProvider, resourceLoaderDelegate, wasmTemplateProvider);
    }

    public static ResourceLoader createWithDefaultConfigWithBlocks(ClientTemplateProvider clientTemplateProvider, ControllerModuleLoader controllerModuleLoader, BlocksContainerLoaderProxy blocksContainerLoaderProxy, ThemeLoaderProxy themeLoaderProxy, CapabilitiesLoaderProxy capabilitiesLoaderProxy, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, WasmTemplateProvider wasmTemplateProvider) {
        return CppProxy.createWithDefaultConfigWithBlocks(clientTemplateProvider, controllerModuleLoader, blocksContainerLoaderProxy, themeLoaderProxy, capabilitiesLoaderProxy, publicKeyVerifierProvider, resourceLoaderDelegate, wasmTemplateProvider);
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

    public abstract Status cacheResources();

    public abstract void clearServingContext(HashSet hashSet, String str);

    public abstract CertificateTracker getCertificateTracker();

    public abstract StatusOr getDiskCacheResourceIds();

    public abstract StatusOr getEmlMobserveBuildId();

    public abstract StatusOr getEmlMobserveResourceIds();

    public abstract byte[] getLimitedServingContext(int i);

    public abstract ResourceMetadataTracker getMetadataTracker();

    public abstract ResourcePreloader getPreloader();

    public abstract byte[] getServingContext();

    public abstract Status handleOmittedResources(TreeSet treeSet, boolean z);

    public abstract Status handleResources(ArrayList arrayList);

    public abstract void invalidateEmlMobserve();

    public abstract boolean isCacheValid();

    public abstract boolean isEmlMobserveValid();

    public abstract void registerMissingResourceHandler(MissingResourceHandler missingResourceHandler);

    public abstract void registerVerifier(String str, StatusOr statusOr);

    public abstract void updateResourceStatus(ResourceCheck resourceCheck);

    public abstract Status updateResources(ArrayList arrayList, ResourceLoaderCallback resourceLoaderCallback);

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends ResourceLoader {
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

        public static native StatusOr create(ClientTemplateProvider clientTemplateProvider, ControllerModuleLoader controllerModuleLoader, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, ResourceLoaderConfig resourceLoaderConfig);

        public static native StatusOr createWithBlocks(ClientTemplateProvider clientTemplateProvider, ControllerModuleLoader controllerModuleLoader, BlocksContainerLoaderProxy blocksContainerLoaderProxy, ThemeLoaderProxy themeLoaderProxy, CapabilitiesLoaderProxy capabilitiesLoaderProxy, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, ResourceLoaderConfig resourceLoaderConfig, WasmTemplateProvider wasmTemplateProvider);

        public static native StatusOr createWithCache(ClientTemplateProvider clientTemplateProvider, ControllerModuleLoader controllerModuleLoader, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, CacheStrategyDelegate cacheStrategyDelegate, ResourceLoaderConfig resourceLoaderConfig);

        public static native StatusOr createWithCacheWithBlocks(ClientTemplateProvider clientTemplateProvider, ControllerModuleLoader controllerModuleLoader, BlocksContainerLoaderProxy blocksContainerLoaderProxy, ThemeLoaderProxy themeLoaderProxy, CapabilitiesLoaderProxy capabilitiesLoaderProxy, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, CacheStrategyDelegate cacheStrategyDelegate, ResourceLoaderConfig resourceLoaderConfig, WasmTemplateProvider wasmTemplateProvider);

        public static native ResourceLoader createWithDefaultConfig(ClientTemplateProvider clientTemplateProvider, ControllerModuleLoader controllerModuleLoader, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, WasmTemplateProvider wasmTemplateProvider);

        public static native ResourceLoader createWithDefaultConfigWithBlocks(ClientTemplateProvider clientTemplateProvider, ControllerModuleLoader controllerModuleLoader, BlocksContainerLoaderProxy blocksContainerLoaderProxy, ThemeLoaderProxy themeLoaderProxy, CapabilitiesLoaderProxy capabilitiesLoaderProxy, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, WasmTemplateProvider wasmTemplateProvider);

        public static native void nativeDestroy(long j);

        private native Status native_cacheResources(long j);

        private native void native_clearServingContext(long j, HashSet hashSet, String str);

        private native CertificateTracker native_getCertificateTracker(long j);

        private native StatusOr native_getDiskCacheResourceIds(long j);

        private native StatusOr native_getEmlMobserveBuildId(long j);

        private native StatusOr native_getEmlMobserveResourceIds(long j);

        private native byte[] native_getLimitedServingContext(long j, int i);

        private native ResourceMetadataTracker native_getMetadataTracker(long j);

        private native ResourcePreloader native_getPreloader(long j);

        private native byte[] native_getServingContext(long j);

        private native Status native_handleOmittedResources(long j, TreeSet treeSet, boolean z);

        private native Status native_handleResources(long j, ArrayList arrayList);

        private native void native_invalidateEmlMobserve(long j);

        private native boolean native_isCacheValid(long j);

        private native boolean native_isEmlMobserveValid(long j);

        private native void native_registerMissingResourceHandler(long j, MissingResourceHandler missingResourceHandler);

        private native void native_registerVerifier(long j, String str, StatusOr statusOr);

        private native void native_updateResourceStatus(long j, ResourceCheck resourceCheck);

        private native Status native_updateResources(long j, ArrayList arrayList, ResourceLoaderCallback resourceLoaderCallback);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public Status cacheResources() {
            return native_cacheResources(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public void clearServingContext(HashSet hashSet, String str) {
            native_clearServingContext(this.nativeRef, hashSet, str);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public CertificateTracker getCertificateTracker() {
            return native_getCertificateTracker(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public StatusOr getDiskCacheResourceIds() {
            return native_getDiskCacheResourceIds(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public StatusOr getEmlMobserveBuildId() {
            return native_getEmlMobserveBuildId(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public StatusOr getEmlMobserveResourceIds() {
            return native_getEmlMobserveResourceIds(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public byte[] getLimitedServingContext(int i) {
            return native_getLimitedServingContext(this.nativeRef, i);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public ResourceMetadataTracker getMetadataTracker() {
            return native_getMetadataTracker(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public ResourcePreloader getPreloader() {
            return native_getPreloader(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public byte[] getServingContext() {
            return native_getServingContext(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public Status handleOmittedResources(TreeSet treeSet, boolean z) {
            return native_handleOmittedResources(this.nativeRef, treeSet, z);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public Status handleResources(ArrayList arrayList) {
            return native_handleResources(this.nativeRef, arrayList);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public void invalidateEmlMobserve() {
            native_invalidateEmlMobserve(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public boolean isCacheValid() {
            return native_isCacheValid(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public boolean isEmlMobserveValid() {
            return native_isEmlMobserveValid(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public void registerMissingResourceHandler(MissingResourceHandler missingResourceHandler) {
            native_registerMissingResourceHandler(this.nativeRef, missingResourceHandler);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public void registerVerifier(String str, StatusOr statusOr) {
            native_registerVerifier(this.nativeRef, str, statusOr);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public void updateResourceStatus(ResourceCheck resourceCheck) {
            native_updateResourceStatus(this.nativeRef, resourceCheck);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public Status updateResources(ArrayList arrayList, ResourceLoaderCallback resourceLoaderCallback) {
            return native_updateResources(this.nativeRef, arrayList, resourceLoaderCallback);
        }

        public /* synthetic */ CppProxy(long j, nvz nvzVar) {
            this(j);
        }
    }
}

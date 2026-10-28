package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import defpackage.agp;
import defpackage.nwd;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ResponseHydration {
    private static final agp proxyMap = new agp(6);

    public static ResponseHydration create(ResourceMetadataTracker resourceMetadataTracker, CertificateTracker certificateTracker, ClientTemplateProvider clientTemplateProvider, JSModuleBytesProvider jSModuleBytesProvider, ThemeStore themeStore, CapabilitiesStore capabilitiesStore, ResourcePreloader resourcePreloader, ResponseHydrationDelegate responseHydrationDelegate, WasmTemplateProvider wasmTemplateProvider) {
        return CppProxy.create(resourceMetadataTracker, certificateTracker, clientTemplateProvider, jSModuleBytesProvider, themeStore, capabilitiesStore, resourcePreloader, responseHydrationDelegate, wasmTemplateProvider);
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

    public static ResponseHydration createWithResourceLoader(ResourceLoader resourceLoader, ClientTemplateProvider clientTemplateProvider, JSModuleBytesProvider jSModuleBytesProvider, ThemeStore themeStore, CapabilitiesStore capabilitiesStore, ResponseHydrationDelegate responseHydrationDelegate, WasmTemplateProvider wasmTemplateProvider) {
        return CppProxy.createWithResourceLoader(resourceLoader, clientTemplateProvider, jSModuleBytesProvider, themeStore, capabilitiesStore, responseHydrationDelegate, wasmTemplateProvider);
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

    public abstract StatusOr directCacheOnReadFromFd(int i, HashSet hashSet);

    public abstract StatusOr rehydrateResponse(byte[] bArr);

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends ResponseHydration {
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

        public static native ResponseHydration create(ResourceMetadataTracker resourceMetadataTracker, CertificateTracker certificateTracker, ClientTemplateProvider clientTemplateProvider, JSModuleBytesProvider jSModuleBytesProvider, ThemeStore themeStore, CapabilitiesStore capabilitiesStore, ResourcePreloader resourcePreloader, ResponseHydrationDelegate responseHydrationDelegate, WasmTemplateProvider wasmTemplateProvider);

        public static native ResponseHydration createWithResourceLoader(ResourceLoader resourceLoader, ClientTemplateProvider clientTemplateProvider, JSModuleBytesProvider jSModuleBytesProvider, ThemeStore themeStore, CapabilitiesStore capabilitiesStore, ResponseHydrationDelegate responseHydrationDelegate, WasmTemplateProvider wasmTemplateProvider);

        public static native void nativeDestroy(long j);

        private native StatusOr native_directCacheOnReadFromFd(long j, int i, HashSet hashSet);

        private native StatusOr native_rehydrateResponse(long j, byte[] bArr);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResponseHydration
        public StatusOr directCacheOnReadFromFd(int i, HashSet hashSet) {
            return native_directCacheOnReadFromFd(this.nativeRef, i, hashSet);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.ResponseHydration
        public StatusOr rehydrateResponse(byte[] bArr) {
            return native_rehydrateResponse(this.nativeRef, bArr);
        }

        public /* synthetic */ CppProxy(long j, nwd nwdVar) {
            this(j);
        }
    }
}
